package com.yanzhenjie.kalle.connect.http;

import com.yanzhenjie.kalle.connect.e;
import com.yanzhenjie.kalle.exception.ConnectException;
import com.yanzhenjie.kalle.exception.ConnectTimeoutError;
import com.yanzhenjie.kalle.exception.HostError;
import com.yanzhenjie.kalle.exception.NetworkError;
import com.yanzhenjie.kalle.exception.ReadException;
import com.yanzhenjie.kalle.exception.ReadTimeoutError;
import com.yanzhenjie.kalle.exception.URLError;
import com.yanzhenjie.kalle.exception.WriteException;
import com.yanzhenjie.kalle.i;
import com.yanzhenjie.kalle.k;
import com.yanzhenjie.kalle.o;
import com.yanzhenjie.kalle.p;
import com.yanzhenjie.kalle.q;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
class d implements com.yanzhenjie.kalle.connect.c {
    private boolean isCanceled;
    private com.yanzhenjie.kalle.connect.b mConnection;
    private final com.yanzhenjie.kalle.cookie.a mCookieManager = new com.yanzhenjie.kalle.cookie.a(k.getConfig().getCookieStore());
    private final com.yanzhenjie.kalle.connect.a mFactory = k.getConfig().getConnectFactory();
    private final com.yanzhenjie.kalle.connect.d mNetwork = k.getConfig().getNetwork();

    d() {
    }

    private com.yanzhenjie.kalle.connect.b connect(o oVar) {
        if (!this.mNetwork.isAvailable()) {
            throw new NetworkError(String.format("Network Unavailable: %1$s.", oVar.url()));
        }
        try {
            i headers = oVar.headers();
            URI uri = new URI(oVar.url().toString());
            List<String> list = this.mCookieManager.get(uri);
            if (list != null && !list.isEmpty()) {
                headers.add("Cookie", list);
            }
            headers.set("Host", uri.getHost());
            return this.mFactory.connect(oVar);
        } catch (MalformedURLException e8) {
            throw new URLError(String.format("The url is malformed: %1$s.", oVar.url()), e8);
        } catch (SocketTimeoutException e9) {
            throw new ConnectTimeoutError(String.format("Connect time out: %1$s.", oVar.url()), e9);
        } catch (URISyntaxException e10) {
            throw new URLError(String.format("The url syntax error: %1$s.", oVar.url()), e10);
        } catch (UnknownHostException e11) {
            throw new HostError(String.format("Hostname can not be resolved: %1$s.", oVar.url()), e11);
        } catch (Exception e12) {
            throw new ConnectException(String.format("An unknown exception: %1$s.", oVar.url()), e12);
        }
    }

    private i parseResponseHeaders(Map<String, List<String>> map) {
        i iVar = new i();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            iVar.add(entry.getKey(), entry.getValue());
        }
        return iVar;
    }

    private q readResponse(o oVar) {
        try {
            int code = this.mConnection.getCode();
            i parseResponseHeaders = parseResponseHeaders(this.mConnection.getHeaders());
            List<String> list = parseResponseHeaders.get("Set-Cookie");
            if (list != null && !list.isEmpty()) {
                this.mCookieManager.add(URI.create(oVar.url().toString()), list);
            }
            return q.newBuilder().code(code).headers(parseResponseHeaders).body(new e(parseResponseHeaders.getContentType(), this.mConnection.getInputStream())).build();
        } catch (SocketTimeoutException e8) {
            throw new ReadTimeoutError(String.format("Read data time out: %1$s.", oVar.url()), e8);
        } catch (Exception e9) {
            throw new ReadException(e9);
        }
    }

    private void writeBody(p pVar) {
        try {
            OutputStream outputStream = this.mConnection.getOutputStream();
            pVar.writeTo(com.yanzhenjie.kalle.util.a.toBufferedOutputStream(outputStream));
            com.yanzhenjie.kalle.util.a.closeQuietly(outputStream);
        } catch (Exception e8) {
            throw new WriteException(e8);
        }
    }

    public void cancel() {
        this.isCanceled = true;
        com.yanzhenjie.kalle.connect.b bVar = this.mConnection;
        if (bVar != null) {
            bVar.disconnect();
        }
    }

    @Override // com.yanzhenjie.kalle.connect.c
    public q intercept(c cVar) {
        if (this.isCanceled) {
            throw new CancellationException("The request has been cancelled.");
        }
        o request = cVar.request();
        if (request.method().allowBody()) {
            i headers = request.headers();
            p body = request.body();
            headers.set("Content-Length", Long.toString(body.contentLength()));
            headers.set("Content-Type", body.contentType());
            this.mConnection = connect(request);
            writeBody(body);
        } else {
            this.mConnection = connect(request);
        }
        return readResponse(request);
    }
}

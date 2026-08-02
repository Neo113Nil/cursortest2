package org.bouncycastle.est.jcajce;

import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.est.ESTClient;
import org.bouncycastle.est.ESTClientSourceProvider;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.est.ESTRequest;
import org.bouncycastle.est.ESTRequestBuilder;
import org.bouncycastle.est.ESTResponse;
import org.bouncycastle.est.Source;
import org.bouncycastle.util.Properties;

/* loaded from: classes9.dex */
class DefaultESTClient implements ESTClient {
    private final ESTClientSourceProvider sslSocketProvider;
    private static final Charset utf8 = Charset.forName("UTF-8");
    private static byte[] CRLF = {13, 10};

    public static class PrintingOutputStream extends OutputStream {
        private final OutputStream tgt;

        public PrintingOutputStream(OutputStream outputStream) {
            this.tgt = outputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            System.out.print(String.valueOf((char) i));
            this.tgt.write(i);
        }
    }

    public DefaultESTClient(ESTClientSourceProvider eSTClientSourceProvider) {
        this.sslSocketProvider = eSTClientSourceProvider;
    }

    private static void writeLine(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes());
        outputStream.write(CRLF);
    }

    @Override // org.bouncycastle.est.ESTClient
    public ESTResponse doRequest(ESTRequest eSTRequest) {
        ESTResponse performRequest;
        int i = 15;
        while (true) {
            performRequest = performRequest(eSTRequest);
            ESTRequest redirectURL = redirectURL(performRequest);
            if (redirectURL == null || i - 1 <= 0) {
                break;
            }
            eSTRequest = redirectURL;
        }
        if (i != 0) {
            return performRequest;
        }
        throw new ESTException("Too many redirects..");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148 A[Catch: all -> 0x0028, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ESTResponse performRequest(ESTRequest eSTRequest) {
        OutputStream printingOutputStream;
        ESTRequest build;
        Source source = null;
        try {
            Source makeSource = this.sslSocketProvider.makeSource(eSTRequest.getURL().getHost(), eSTRequest.getURL().getPort());
            if (eSTRequest.getListener() != null) {
                eSTRequest = eSTRequest.getListener().onConnection(makeSource, eSTRequest);
            }
            Set<String> asKeySet = Properties.asKeySet("org.bouncycastle.debug.est");
            if (!asKeySet.contains("output") && !asKeySet.contains("all")) {
                printingOutputStream = makeSource.getOutputStream();
                StringBuilder sb = new StringBuilder();
                sb.append(eSTRequest.getURL().getPath());
                sb.append(eSTRequest.getURL().getQuery() == null ? eSTRequest.getURL().getQuery() : "");
                String sb2 = sb.toString();
                ESTRequestBuilder eSTRequestBuilder = new ESTRequestBuilder(eSTRequest);
                if (!eSTRequest.getHeaders().containsKey("Connection")) {
                    eSTRequestBuilder.addHeader("Connection", "close");
                }
                URL url = eSTRequest.getURL();
                eSTRequestBuilder.setHeader("Host", url.getPort() <= -1 ? String.format("%s:%d", url.getHost(), Integer.valueOf(url.getPort())) : url.getHost());
                build = eSTRequestBuilder.build();
                writeLine(printingOutputStream, build.getMethod() + " " + sb2 + " HTTP/1.1");
                for (Map.Entry<String, String[]> entry : build.getHeaders().entrySet()) {
                    String[] value = entry.getValue();
                    for (int i = 0; i != value.length; i++) {
                        writeLine(printingOutputStream, entry.getKey() + ": " + value[i]);
                    }
                }
                printingOutputStream.write(CRLF);
                printingOutputStream.flush();
                build.writeData(printingOutputStream);
                printingOutputStream.flush();
                if (build.getHijacker() != null) {
                    return new ESTResponse(build, makeSource);
                }
                ESTResponse hijack = build.getHijacker().hijack(build, makeSource);
                if (makeSource != null && hijack == null) {
                    makeSource.close();
                }
                return hijack;
            }
            printingOutputStream = new PrintingOutputStream(makeSource.getOutputStream());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(eSTRequest.getURL().getPath());
            sb3.append(eSTRequest.getURL().getQuery() == null ? eSTRequest.getURL().getQuery() : "");
            String sb22 = sb3.toString();
            ESTRequestBuilder eSTRequestBuilder2 = new ESTRequestBuilder(eSTRequest);
            if (!eSTRequest.getHeaders().containsKey("Connection")) {
            }
            URL url2 = eSTRequest.getURL();
            eSTRequestBuilder2.setHeader("Host", url2.getPort() <= -1 ? String.format("%s:%d", url2.getHost(), Integer.valueOf(url2.getPort())) : url2.getHost());
            build = eSTRequestBuilder2.build();
            writeLine(printingOutputStream, build.getMethod() + " " + sb22 + " HTTP/1.1");
            while (r0.hasNext()) {
            }
            printingOutputStream.write(CRLF);
            printingOutputStream.flush();
            build.writeData(printingOutputStream);
            printingOutputStream.flush();
            if (build.getHijacker() != null) {
            }
        } catch (Throwable th) {
            if (0 != 0) {
                source.close();
            }
            throw th;
        }
    }

    public ESTRequest redirectURL(ESTResponse eSTResponse) {
        ESTRequest eSTRequest;
        ESTRequestBuilder withURL;
        if (eSTResponse.getStatusCode() < 300 || eSTResponse.getStatusCode() > 399) {
            eSTRequest = null;
        } else {
            switch (eSTResponse.getStatusCode()) {
                case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                    String header = eSTResponse.getHeader("Location");
                    if (!"".equals(header)) {
                        ESTRequestBuilder eSTRequestBuilder = new ESTRequestBuilder(eSTResponse.getOriginalRequest());
                        if (header.startsWith("http")) {
                            withURL = eSTRequestBuilder.withURL(new URL(header));
                        } else {
                            URL url = eSTResponse.getOriginalRequest().getURL();
                            withURL = eSTRequestBuilder.withURL(new URL(url.getProtocol(), url.getHost(), url.getPort(), header));
                        }
                        eSTRequest = withURL.build();
                        break;
                    } else {
                        throw new ESTException("Redirect status type: " + eSTResponse.getStatusCode() + " but no location header");
                    }
                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                default:
                    throw new ESTException("Client does not handle http status code: " + eSTResponse.getStatusCode());
            }
        }
        if (eSTRequest != null) {
            eSTResponse.close();
        }
        return eSTRequest;
    }
}

package com.unity3d.ads.request;

import com.unity3d.ads.log.DeviceLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public class WebRequest {
    private String _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private Map<String, List<String>> _headers;
    private IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private String _requestType;
    private int _responseCode;
    private Map<String, List<String>> _responseHeaders;
    private URL _url;

    public enum RequestType {
        POST,
        GET,
        HEAD
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map, int i, int i2) throws MalformedURLException {
        this._requestType = RequestType.GET.name();
        this._responseCode = -1;
        this._contentLength = -1L;
        this._canceled = false;
        this._url = new URL(str);
        this._requestType = str2;
        this._headers = map;
        this._connectTimeout = i;
        this._readTimeout = i2;
    }

    public void cancel() {
        this._canceled = true;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public URL getUrl() {
        return this._url;
    }

    public String getRequestType() {
        return this._requestType;
    }

    public String getBody() {
        return this._body;
    }

    public void setBody(String str) {
        this._body = str;
    }

    public String getQuery() {
        if (this._url != null) {
            return this._url.getQuery();
        }
        return null;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this._responseHeaders;
    }

    public Map<String, List<String>> getHeaders() {
        return this._headers;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public void setConnectTimeout(int i) {
        this._connectTimeout = i;
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public void setReadTimeout(int i) {
        this._readTimeout = i;
    }

    public void setProgressListener(IWebRequestProgressListener iWebRequestProgressListener) {
        this._progressListener = iWebRequestProgressListener;
    }

    public long makeStreamRequest(OutputStream outputStream) throws NetworkIOException, IOException, IllegalStateException {
        InputStream errorStream;
        PrintWriter printWriter;
        HttpURLConnection httpUrlConnectionWithHeaders = getHttpUrlConnectionWithHeaders();
        httpUrlConnectionWithHeaders.setDoInput(true);
        if (getRequestType().equals(RequestType.POST.name())) {
            httpUrlConnectionWithHeaders.setDoOutput(true);
            PrintWriter printWriter2 = null;
            try {
                try {
                    printWriter = new PrintWriter((Writer) new OutputStreamWriter(httpUrlConnectionWithHeaders.getOutputStream(), "UTF-8"), true);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (getBody() == null) {
                    printWriter.print(getQuery());
                } else {
                    printWriter.print(getBody());
                }
                printWriter.flush();
                try {
                    printWriter.close();
                } catch (Exception e2) {
                    DeviceLog.exception("Error closing writer", e2);
                    throw e2;
                }
            } catch (IOException e3) {
                e = e3;
                printWriter2 = printWriter;
                DeviceLog.exception("Error while writing POST params", e);
                throw new NetworkIOException("Error writing POST params: " + e.getMessage());
            } catch (Throwable th2) {
                th = th2;
                printWriter2 = printWriter;
                if (printWriter2 != null) {
                    try {
                        printWriter2.close();
                    } catch (Exception e4) {
                        DeviceLog.exception("Error closing writer", e4);
                        throw e4;
                    }
                }
                throw th;
            }
        }
        try {
            this._responseCode = httpUrlConnectionWithHeaders.getResponseCode();
            this._contentLength = httpUrlConnectionWithHeaders.getContentLength();
            if (httpUrlConnectionWithHeaders.getHeaderFields() != null) {
                this._responseHeaders = httpUrlConnectionWithHeaders.getHeaderFields();
            }
            try {
                errorStream = httpUrlConnectionWithHeaders.getInputStream();
            } catch (IOException e5) {
                errorStream = httpUrlConnectionWithHeaders.getErrorStream();
                if (errorStream == null) {
                    throw new NetworkIOException("Can't open error stream: " + e5.getMessage());
                }
            }
            if (this._progressListener != null) {
                this._progressListener.onRequestStart(getUrl().toString(), this._contentLength, this._responseCode, this._responseHeaders);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
            byte[] bArr = new byte[4096];
            long j = 0;
            int i = 0;
            while (!isCanceled() && i != -1) {
                try {
                    i = bufferedInputStream.read(bArr);
                    if (i > 0) {
                        outputStream.write(bArr, 0, i);
                        j += i;
                        if (this._progressListener != null) {
                            this._progressListener.onRequestProgress(getUrl().toString(), j, this._contentLength);
                        }
                    }
                } catch (IOException e6) {
                    throw new NetworkIOException("Network exception: " + e6.getMessage());
                }
            }
            httpUrlConnectionWithHeaders.disconnect();
            outputStream.flush();
            return j;
        } catch (IOException | RuntimeException e7) {
            throw new NetworkIOException("Response code: " + e7.getMessage());
        }
    }

    public String makeRequest() throws NetworkIOException, IOException, IllegalStateException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        makeStreamRequest(byteArrayOutputStream);
        return byteArrayOutputStream.toString("UTF-8");
    }

    private HttpURLConnection getHttpUrlConnectionWithHeaders() throws NetworkIOException {
        HttpURLConnection httpURLConnection;
        if (getUrl().toString().startsWith("https://")) {
            try {
                httpURLConnection = (HttpsURLConnection) getUrl().openConnection();
            } catch (IOException e) {
                throw new NetworkIOException("Open HTTPS connection: " + e.getMessage());
            }
        } else {
            try {
                httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            } catch (IOException e2) {
                throw new NetworkIOException("Open HTTP connection: " + e2.getMessage());
            }
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(getConnectTimeout());
        httpURLConnection.setReadTimeout(getReadTimeout());
        try {
            httpURLConnection.setRequestMethod(getRequestType());
            if (getHeaders() != null && getHeaders().size() > 0) {
                for (String str : getHeaders().keySet()) {
                    for (String str2 : getHeaders().get(str)) {
                        DeviceLog.debug("Setting header: " + str + "=" + str2);
                        httpURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e3) {
            throw new NetworkIOException("Set Request Method: " + getRequestType() + ", " + e3.getMessage());
        }
    }
}

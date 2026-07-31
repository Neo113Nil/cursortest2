package com.linecorp.linesdk.internal.nwclient.core;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.ironsource.cc;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.utils.UriUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public class ChannelServiceHttpClient {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 90000;
    private static final int DEFAULT_READ_TIMEOUT_MILLIS = 90000;
    private static final byte[] EMPTY_DATA = new byte[0];
    private static final String SERVER_SIDE_CHARSET = "UTF-8";
    private static final String TAG = "ChannelHttpClient";
    private int connectTimeoutMillis;

    @NonNull
    private final StringResponseParser errorResponseParser;
    private int readTimeoutMillis;

    @NonNull
    private final UserAgentGenerator userAgentGenerator;

    private enum HttpMethod {
        POST,
        GET,
        DELETE,
        PUT
    }

    public ChannelServiceHttpClient(@NonNull Context context, @NonNull String str) {
        this(new UserAgentGenerator(context, str));
    }

    @NonNull
    private static byte[] convertPostDataToBytes(@NonNull Map<String, String> map) {
        if (map.isEmpty()) {
            return EMPTY_DATA;
        }
        try {
            return UriUtils.appendQueryParams("", map).getEncodedQuery().getBytes(SERVER_SIDE_CHARSET);
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    @NonNull
    private static <T> LineApiResponse<T> getChannelServiceResponse(@NonNull HttpURLConnection httpURLConnection, ResponseDataParser<T> responseDataParser, @NonNull ResponseDataParser<String> responseDataParser2) {
        InputStream inputStreamFrom = getInputStreamFrom(httpURLConnection);
        int responseCode = httpURLConnection.getResponseCode();
        try {
            return (responseCode == 200 || responseCode == 204) ? responseDataParser == null ? LineApiResponse.createAsSuccess(null) : LineApiResponse.createAsSuccess(responseDataParser.getResponseData(inputStreamFrom)) : LineApiResponse.createAsError(LineApiResponseCode.SERVER_ERROR, LineApiError.createWithHttpResponseCode(responseCode, responseDataParser2.getResponseData(inputStreamFrom)));
        } catch (IOException e4) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError(e4, LineApiError.ErrorCode.HTTP_RESPONSE_PARSE_ERROR));
        }
    }

    @NonNull
    private static InputStream getInputStreamFrom(@NonNull HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        return isGzipUsed(httpURLConnection) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static boolean isGzipUsed(@NonNull HttpURLConnection httpURLConnection) {
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (list.get(i4).equalsIgnoreCase("gzip")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void logExceptionForDebug(@NonNull LineApiResponse<?> lineApiResponse, @NonNull Exception exc) {
    }

    private static void logRequestForDebug(@NonNull HttpURLConnection httpURLConnection, byte[] bArr) {
        Log.d(TAG, httpURLConnection.getRequestMethod() + " : " + httpURLConnection.getURL());
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
            Log.d(TAG, "    " + entry.getKey() + " : " + Arrays.toString(entry.getValue().toArray()));
        }
        if (bArr != null) {
            try {
                Log.d(TAG, "== Request body ==");
                Log.d(TAG, new String(bArr, cc.f15721N));
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    @NonNull
    private static InputStream logResponseBodyForDebug(@NonNull InputStream inputStream) {
        byte[] byteArray = toByteArray(inputStream);
        Log.d(TAG, "== response body ==");
        Log.d(TAG, new StringResponseParser().getResponseData((InputStream) new ByteArrayInputStream(byteArray)));
        return new ByteArrayInputStream(byteArray);
    }

    private static void logResponseHeadersForDebug(@NonNull HttpURLConnection httpURLConnection) {
        Log.d(TAG, httpURLConnection.getResponseCode() + " : " + httpURLConnection.getResponseMessage());
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            Log.d(TAG, "    " + entry.getKey() + " : " + Arrays.toString(entry.getValue().toArray()));
        }
    }

    @NonNull
    private HttpURLConnection openConnectionWithJson(@NonNull Uri uri, int i4, HttpMethod httpMethod) {
        HttpURLConnection openHttpConnection = openHttpConnection(uri);
        openHttpConnection.setInstanceFollowRedirects(true);
        openHttpConnection.setRequestProperty("User-Agent", this.userAgentGenerator.getUserAgent());
        openHttpConnection.setRequestProperty("Accept-Encoding", "gzip");
        openHttpConnection.setRequestProperty(cc.f15718K, cc.f15719L);
        openHttpConnection.setRequestProperty("Content-Length", String.valueOf(i4));
        openHttpConnection.setConnectTimeout(this.connectTimeoutMillis);
        openHttpConnection.setReadTimeout(this.readTimeoutMillis);
        openHttpConnection.setRequestMethod(httpMethod.name());
        openHttpConnection.setDoOutput(true);
        return openHttpConnection;
    }

    @NonNull
    private HttpURLConnection openDeleteConnection(@NonNull Uri uri) {
        HttpURLConnection openHttpConnection = openHttpConnection(uri);
        openHttpConnection.setInstanceFollowRedirects(true);
        openHttpConnection.setRequestProperty("User-Agent", this.userAgentGenerator.getUserAgent());
        openHttpConnection.setRequestProperty("Accept-Encoding", "gzip");
        openHttpConnection.setConnectTimeout(this.connectTimeoutMillis);
        openHttpConnection.setReadTimeout(this.readTimeoutMillis);
        openHttpConnection.setRequestMethod(HttpMethod.DELETE.name());
        return openHttpConnection;
    }

    @NonNull
    private HttpURLConnection openGetConnection(@NonNull Uri uri) {
        HttpURLConnection openHttpConnection = openHttpConnection(uri);
        openHttpConnection.setInstanceFollowRedirects(true);
        openHttpConnection.setRequestProperty("User-Agent", this.userAgentGenerator.getUserAgent());
        openHttpConnection.setRequestProperty("Accept-Encoding", "gzip");
        openHttpConnection.setConnectTimeout(this.connectTimeoutMillis);
        openHttpConnection.setReadTimeout(this.readTimeoutMillis);
        openHttpConnection.setRequestMethod(HttpMethod.GET.name());
        return openHttpConnection;
    }

    @NonNull
    private HttpURLConnection openPostConnection(@NonNull Uri uri, int i4) {
        HttpURLConnection openHttpConnection = openHttpConnection(uri);
        openHttpConnection.setInstanceFollowRedirects(true);
        openHttpConnection.setRequestProperty("User-Agent", this.userAgentGenerator.getUserAgent());
        openHttpConnection.setRequestProperty("Accept-Encoding", "gzip");
        openHttpConnection.setRequestProperty(cc.f15718K, "application/x-www-form-urlencoded");
        openHttpConnection.setRequestProperty("Content-Length", String.valueOf(i4));
        openHttpConnection.setConnectTimeout(this.connectTimeoutMillis);
        openHttpConnection.setReadTimeout(this.readTimeoutMillis);
        openHttpConnection.setRequestMethod(HttpMethod.POST.name());
        openHttpConnection.setDoOutput(true);
        return openHttpConnection;
    }

    @NonNull
    private <T> LineApiResponse<T> sendRequestWithJson(@NonNull HttpMethod httpMethod, @NonNull Uri uri, @NonNull Map<String, String> map, @NonNull String str, ResponseDataParser<T> responseDataParser) {
        byte[] bytes = str.getBytes();
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = openConnectionWithJson(uri, bytes.length, httpMethod);
                setRequestHeaders(httpURLConnection, map);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                LineApiResponse<T> channelServiceResponse = getChannelServiceResponse(httpURLConnection, responseDataParser, this.errorResponseParser);
                httpURLConnection.disconnect();
                return channelServiceResponse;
            } catch (IOException e4) {
                LineApiResponse<T> createAsError = LineApiResponse.createAsError(LineApiResponseCode.NETWORK_ERROR, new LineApiError(e4));
                logExceptionForDebug(createAsError, e4);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return createAsError;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static void setRequestHeaders(@NonNull HttpURLConnection httpURLConnection, @NonNull Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    @NonNull
    private static byte[] toByteArray(@NonNull InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @NonNull
    public <T> LineApiResponse<T> delete(@NonNull Uri uri, @NonNull Map<String, String> map, ResponseDataParser<T> responseDataParser) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = openDeleteConnection(uri);
                setRequestHeaders(httpURLConnection, map);
                httpURLConnection.connect();
                LineApiResponse<T> channelServiceResponse = getChannelServiceResponse(httpURLConnection, responseDataParser, this.errorResponseParser);
                httpURLConnection.disconnect();
                return channelServiceResponse;
            } catch (IOException e4) {
                LineApiResponse<T> createAsError = LineApiResponse.createAsError(LineApiResponseCode.NETWORK_ERROR, new LineApiError(e4));
                logExceptionForDebug(createAsError, e4);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return createAsError;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @NonNull
    public <T> LineApiResponse<T> get(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, ResponseDataParser<T> responseDataParser) {
        Uri appendQueryParams = UriUtils.appendQueryParams(uri, map2);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = openGetConnection(appendQueryParams);
                setRequestHeaders(httpURLConnection, map);
                httpURLConnection.connect();
                LineApiResponse<T> channelServiceResponse = getChannelServiceResponse(httpURLConnection, responseDataParser, this.errorResponseParser);
                httpURLConnection.disconnect();
                return channelServiceResponse;
            } catch (IOException e4) {
                LineApiResponse<T> createAsError = LineApiResponse.createAsError(LineApiResponseCode.NETWORK_ERROR, new LineApiError(e4));
                logExceptionForDebug(createAsError, e4);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return createAsError;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @NonNull
    protected HttpURLConnection openHttpConnection(@NonNull Uri uri) {
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            return (HttpURLConnection) openConnection;
        }
        throw new IllegalArgumentException("The scheme of the server url must be https." + uri);
    }

    @NonNull
    public <T> LineApiResponse<T> post(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @NonNull ResponseDataParser<T> responseDataParser) {
        byte[] convertPostDataToBytes = convertPostDataToBytes(map2);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = openPostConnection(uri, convertPostDataToBytes.length);
                setRequestHeaders(httpURLConnection, map);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(convertPostDataToBytes);
                outputStream.flush();
                LineApiResponse<T> channelServiceResponse = getChannelServiceResponse(httpURLConnection, responseDataParser, this.errorResponseParser);
                httpURLConnection.disconnect();
                return channelServiceResponse;
            } catch (IOException e4) {
                LineApiResponse<T> createAsError = LineApiResponse.createAsError(LineApiResponseCode.NETWORK_ERROR, new LineApiError(e4));
                logExceptionForDebug(createAsError, e4);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return createAsError;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @NonNull
    public <T> LineApiResponse<T> postWithJson(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull String str, @NonNull ResponseDataParser<T> responseDataParser) {
        return sendRequestWithJson(HttpMethod.POST, uri, map, str, responseDataParser);
    }

    @NonNull
    public <T> LineApiResponse<T> putWithJson(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull String str, ResponseDataParser<T> responseDataParser) {
        return sendRequestWithJson(HttpMethod.PUT, uri, map, str, responseDataParser);
    }

    public void setConnectTimeoutMillis(int i4) {
        this.connectTimeoutMillis = i4;
    }

    public void setReadTimeoutMillis(int i4) {
        this.readTimeoutMillis = i4;
    }

    protected ChannelServiceHttpClient(@NonNull UserAgentGenerator userAgentGenerator) {
        this.userAgentGenerator = userAgentGenerator;
        this.errorResponseParser = new StringResponseParser(SERVER_SIDE_CHARSET);
        this.connectTimeoutMillis = 90000;
        this.readTimeoutMillis = 90000;
    }
}

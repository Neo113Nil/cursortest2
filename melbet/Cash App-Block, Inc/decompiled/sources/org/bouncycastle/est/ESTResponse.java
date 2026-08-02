package org.bouncycastle.est;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.est.HttpUtil;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class ESTResponse {
    private static final Long ZERO = 0L;
    private String HttpVersion;
    private Long absoluteReadLimit;
    private Long contentLength;
    private final HttpUtil.Headers headers;
    private InputStream inputStream;
    private final byte[] lineBuffer;
    private final ESTRequest originalRequest;
    private long read = 0;
    private final Source source;
    private int statusCode;
    private String statusMessage;

    public static class PrintingInputStream extends InputStream {
        private final InputStream src;

        private PrintingInputStream(InputStream inputStream) {
            this.src = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.src.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.src.close();
        }

        @Override // java.io.InputStream
        public int read() {
            return this.src.read();
        }
    }

    public ESTResponse(ESTRequest eSTRequest, Source source) {
        this.originalRequest = eSTRequest;
        this.source = source;
        if (source instanceof LimitedSource) {
            this.absoluteReadLimit = ((LimitedSource) source).getAbsoluteReadLimit();
        }
        Set<String> asKeySet = Properties.asKeySet("org.bouncycastle.debug.est");
        this.inputStream = (asKeySet.contains("input") || asKeySet.contains("all")) ? new PrintingInputStream(source.getInputStream()) : source.getInputStream();
        this.headers = new HttpUtil.Headers();
        this.lineBuffer = new byte[1024];
        process();
    }

    public static /* synthetic */ long access$108(ESTResponse eSTResponse) {
        long j = eSTResponse.read;
        eSTResponse.read = 1 + j;
        return j;
    }

    private void process() {
        this.HttpVersion = readStringIncluding(' ');
        this.statusCode = Integer.parseInt(readStringIncluding(' '));
        this.statusMessage = readStringIncluding('\n');
        while (true) {
            String readStringIncluding = readStringIncluding('\n');
            if (readStringIncluding.length() <= 0) {
                break;
            }
            int indexOf = readStringIncluding.indexOf(58);
            if (indexOf > -1) {
                this.headers.add(Strings.toLowerCase(readStringIncluding.substring(0, indexOf).trim()), readStringIncluding.substring(indexOf + 1).trim());
            }
        }
        boolean equalsIgnoreCase = this.headers.getFirstValueOrEmpty("Transfer-Encoding").equalsIgnoreCase("chunked");
        if (equalsIgnoreCase) {
            this.contentLength = 0L;
        } else {
            this.contentLength = getContentLength();
        }
        int i = this.statusCode;
        if (i == 204 || i == 202) {
            Long l = this.contentLength;
            if (l == null) {
                this.contentLength = 0L;
            } else if (i == 204 && l.longValue() > 0) {
                a$$ExternalSyntheticBUOutline0.m$4("Got HTTP status 204 but Content-length > 0.");
                return;
            }
        }
        Long l2 = this.contentLength;
        if (l2 == null) {
            a$$ExternalSyntheticBUOutline0.m$4("No Content-length header.");
            return;
        }
        if (l2.equals(ZERO) && !equalsIgnoreCase) {
            this.inputStream = new InputStream() { // from class: org.bouncycastle.est.ESTResponse.1
                @Override // java.io.InputStream
                public int read() {
                    return -1;
                }
            };
        }
        long longValue = this.contentLength.longValue();
        Long l3 = this.absoluteReadLimit;
        if (longValue < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(l3, "Server returned negative content length: ");
            return;
        }
        if (l3 != null && this.contentLength.longValue() >= this.absoluteReadLimit.longValue()) {
            StringBuilder sb = new StringBuilder("Content length longer than absolute read limit: ");
            sb.append(this.absoluteReadLimit);
            Long l4 = this.contentLength;
            sb.append(" Content-Length: ");
            sb.append(l4);
            throw new IOException(sb.toString());
        }
        this.inputStream = wrapWithCounter(this.inputStream, this.absoluteReadLimit);
        if (equalsIgnoreCase) {
            this.inputStream = new CTEChunkedInputStream(this.inputStream);
        }
        if ("base64".equalsIgnoreCase(getHeader("content-transfer-encoding"))) {
            InputStream inputStream = this.inputStream;
            if (equalsIgnoreCase) {
                this.inputStream = new CTEBase64InputStream(inputStream);
            } else {
                this.inputStream = new CTEBase64InputStream(inputStream, this.contentLength);
            }
        }
    }

    public void close() {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            inputStream.close();
        }
        this.source.close();
    }

    public long getAbsoluteReadLimit() {
        Long l = this.absoluteReadLimit;
        if (l == null) {
            return Long.MAX_VALUE;
        }
        return l.longValue();
    }

    public Long getContentLength() {
        String firstValue = this.headers.getFirstValue("Content-Length");
        if (firstValue == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(firstValue));
        } catch (RuntimeException e) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Content Length: '", firstValue, "' invalid. ");
            m3m.append(e.getMessage());
            throw new RuntimeException(m3m.toString());
        }
    }

    public String getHeader(String str) {
        return this.headers.getFirstValue(str);
    }

    public String getHeaderOrEmpty(String str) {
        return this.headers.getFirstValueOrEmpty(str);
    }

    public HttpUtil.Headers getHeaders() {
        return this.headers;
    }

    public String getHttpVersion() {
        return this.HttpVersion;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public ESTRequest getOriginalRequest() {
        return this.originalRequest;
    }

    public Source getSource() {
        return this.source;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String readStringIncluding(char c) {
        int read;
        byte[] bArr;
        int i;
        int i2 = 0;
        while (true) {
            read = this.inputStream.read();
            bArr = this.lineBuffer;
            i = i2 + 1;
            bArr[i2] = (byte) read;
            if (i >= bArr.length) {
                Path$$ExternalSyntheticBUOutline0.m$3(this.lineBuffer.length, "Server sent line > ");
                return null;
            }
            if (read == c || read <= -1) {
                break;
            }
            i2 = i;
        }
        if (read != -1) {
            return new String(bArr, 0, i).trim();
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public InputStream wrapWithCounter(final InputStream inputStream, final Long l) {
        return new InputStream() { // from class: org.bouncycastle.est.ESTResponse.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (ESTResponse.this.contentLength == null || ESTResponse.this.contentLength.longValue() - 1 <= ESTResponse.this.read) {
                    if (inputStream.available() <= 0) {
                        inputStream.close();
                        return;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$4("Stream closed with extra content in pipe that exceeds content length.");
                        return;
                    }
                }
                throw new IOException("Stream closed before limit fully read, Read: " + ESTResponse.this.read + " ContentLength: " + ESTResponse.this.contentLength);
            }

            @Override // java.io.InputStream
            public int read() {
                int read = inputStream.read();
                if (read > -1) {
                    ESTResponse.access$108(ESTResponse.this);
                    if (l != null && ESTResponse.this.read >= l.longValue()) {
                        a$$ExternalSyntheticBUOutline0.m$4(l, "Absolute Read Limit exceeded: ");
                        return 0;
                    }
                }
                return read;
            }
        };
    }
}

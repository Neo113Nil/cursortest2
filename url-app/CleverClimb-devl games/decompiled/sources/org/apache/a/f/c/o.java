package org.apache.a.f.c;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;

/* compiled from: Wire.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9856a;

    public o(Log log) {
        this.f9856a = log;
    }

    private void a(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.f9856a.debug(sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            this.f9856a.debug(sb.toString());
        }
    }

    public boolean a() {
        return this.f9856a.isDebugEnabled();
    }

    public void a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void b(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void a(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        a(">> ", new ByteArrayInputStream(bArr));
    }

    public void b(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        a("<< ", new ByteArrayInputStream(bArr));
    }

    public void a(int i) throws IOException {
        a(new byte[]{(byte) i});
    }

    public void b(int i) throws IOException {
        b(new byte[]{(byte) i});
    }
}

package org.apache.a.e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: StringEntity.java */
/* loaded from: classes2.dex */
public class g extends a implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f9709d;

    @Override // org.apache.a.j
    public boolean a() {
        return true;
    }

    @Override // org.apache.a.j
    public boolean g() {
        return false;
    }

    public g(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("Source string may not be null");
        }
        str2 = str2 == null ? "text/plain" : str2;
        str3 = str3 == null ? "ISO-8859-1" : str3;
        this.f9709d = str.getBytes(str3);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append("; charset=");
        stringBuffer.append(str3);
        a(stringBuffer.toString());
    }

    public g(String str, String str2) throws UnsupportedEncodingException {
        this(str, null, str2);
    }

    @Override // org.apache.a.j
    public long c() {
        return this.f9709d.length;
    }

    @Override // org.apache.a.j
    public InputStream f() throws IOException {
        return new ByteArrayInputStream(this.f9709d);
    }

    @Override // org.apache.a.j
    public void a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        outputStream.write(this.f9709d);
        outputStream.flush();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

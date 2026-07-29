package com.umeng.commonsdk.proguard;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: TIOStreamTransport.java */
/* loaded from: classes2.dex */
public class at extends av {

    /* renamed from: a, reason: collision with root package name */
    protected InputStream f9038a;

    /* renamed from: b, reason: collision with root package name */
    protected OutputStream f9039b;

    @Override // com.umeng.commonsdk.proguard.av
    public boolean a() {
        return true;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void b() throws aw {
    }

    protected at() {
        this.f9038a = null;
        this.f9039b = null;
    }

    public at(InputStream inputStream) {
        this.f9038a = null;
        this.f9039b = null;
        this.f9038a = inputStream;
    }

    public at(OutputStream outputStream) {
        this.f9038a = null;
        this.f9039b = null;
        this.f9039b = outputStream;
    }

    public at(InputStream inputStream, OutputStream outputStream) {
        this.f9038a = null;
        this.f9039b = null;
        this.f9038a = inputStream;
        this.f9039b = outputStream;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void c() {
        if (this.f9038a != null) {
            try {
                this.f9038a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f9038a = null;
        }
        if (this.f9039b != null) {
            try {
                this.f9039b.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.f9039b = null;
        }
    }

    @Override // com.umeng.commonsdk.proguard.av
    public int a(byte[] bArr, int i, int i2) throws aw {
        if (this.f9038a == null) {
            throw new aw(1, "Cannot read from null inputStream");
        }
        try {
            int read = this.f9038a.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new aw(4);
        } catch (IOException e) {
            throw new aw(0, e);
        }
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void b(byte[] bArr, int i, int i2) throws aw {
        if (this.f9039b == null) {
            throw new aw(1, "Cannot write to null outputStream");
        }
        try {
            this.f9039b.write(bArr, i, i2);
        } catch (IOException e) {
            throw new aw(0, e);
        }
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void d() throws aw {
        if (this.f9039b == null) {
            throw new aw(1, "Cannot flush null outputStream");
        }
        try {
            this.f9039b.flush();
        } catch (IOException e) {
            throw new aw(0, e);
        }
    }
}

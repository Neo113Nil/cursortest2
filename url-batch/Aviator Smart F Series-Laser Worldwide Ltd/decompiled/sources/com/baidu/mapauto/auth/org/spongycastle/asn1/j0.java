package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class j0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final v f7797a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7798b = true;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f7799c;

    public j0(v vVar) {
        this.f7797a = vVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        o oVar;
        if (this.f7799c == null) {
            if (!this.f7798b || (oVar = (o) this.f7797a.a()) == null) {
                return -1;
            }
            this.f7798b = false;
            this.f7799c = oVar.b();
        }
        while (true) {
            int read = this.f7799c.read();
            if (read >= 0) {
                return read;
            }
            o oVar2 = (o) this.f7797a.a();
            if (oVar2 == null) {
                this.f7799c = null;
                return -1;
            }
            this.f7799c = oVar2.b();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        o oVar;
        int i10 = 0;
        if (this.f7799c == null) {
            if (!this.f7798b || (oVar = (o) this.f7797a.a()) == null) {
                return -1;
            }
            this.f7798b = false;
            this.f7799c = oVar.b();
        }
        while (true) {
            int read = this.f7799c.read(bArr, i8 + i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
                if (i10 == i9) {
                    return i10;
                }
            } else {
                o oVar2 = (o) this.f7797a.a();
                if (oVar2 == null) {
                    this.f7799c = null;
                    if (i10 < 1) {
                        return -1;
                    }
                    return i10;
                }
                this.f7799c = oVar2.b();
            }
        }
    }
}

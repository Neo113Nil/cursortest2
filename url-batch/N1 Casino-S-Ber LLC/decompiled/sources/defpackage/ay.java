package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ay implements v8 {
    public final v20 f;
    public final u8 g;
    public boolean h;

    public ay(v20 v20Var) {
        v20Var.getClass();
        this.f = v20Var;
        this.g = new u8();
    }

    @Override // defpackage.v20
    public final v50 a() {
        return this.f.a();
    }

    @Override // defpackage.v20, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        v20 v20Var = this.f;
        if (this.h) {
            return;
        }
        try {
            u8 u8Var = this.g;
            long j = u8Var.g;
            if (j > 0) {
                v20Var.e(j, u8Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            v20Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.v20
    public final void e(long j, u8 u8Var) {
        u8Var.getClass();
        if (this.h) {
            t8.t("closed");
        } else {
            this.g.e(j, u8Var);
            m();
        }
    }

    @Override // defpackage.v8, defpackage.v20, java.io.Flushable
    public final void flush() {
        if (this.h) {
            t8.t("closed");
            return;
        }
        u8 u8Var = this.g;
        long j = u8Var.g;
        v20 v20Var = this.f;
        if (j > 0) {
            v20Var.e(j, u8Var);
        }
        v20Var.flush();
    }

    @Override // defpackage.v8
    public final v8 i(String str) {
        str.getClass();
        if (this.h) {
            t8.t("closed");
            return null;
        }
        this.g.A(str);
        m();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.v8
    public final v8 j(y8 y8Var) {
        y8Var.getClass();
        if (this.h) {
            t8.t("closed");
            return null;
        }
        y8Var.i(this.g, y8Var.a());
        m();
        return this;
    }

    public final v8 m() {
        if (this.h) {
            t8.t("closed");
            return null;
        }
        u8 u8Var = this.g;
        long j = u8Var.g;
        if (j == 0) {
            j = 0;
        } else {
            v10 v10Var = u8Var.f;
            v10Var.getClass();
            v10 v10Var2 = v10Var.g;
            v10Var2.getClass();
            if (v10Var2.c < 8192 && v10Var2.e) {
                j -= r6 - v10Var2.b;
            }
        }
        if (j > 0) {
            this.f.e(j, u8Var);
        }
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.h) {
            t8.t("closed");
            return 0;
        }
        int write = this.g.write(byteBuffer);
        m();
        return write;
    }

    @Override // defpackage.v8
    public final v8 writeByte(int i) {
        if (this.h) {
            t8.t("closed");
            return null;
        }
        this.g.w(i);
        m();
        return this;
    }

    @Override // defpackage.v8
    public final v8 writeInt(int i) {
        if (this.h) {
            t8.t("closed");
            return null;
        }
        this.g.y(i);
        m();
        return this;
    }

    @Override // defpackage.v8
    public final v8 writeShort(int i) {
        if (this.h) {
            t8.t("closed");
            return null;
        }
        this.g.z(i);
        m();
        return this;
    }

    @Override // defpackage.v8
    public final v8 write(byte[] bArr) {
        if (!this.h) {
            this.g.u(bArr, bArr.length);
            m();
            return this;
        }
        t8.t("closed");
        return null;
    }
}

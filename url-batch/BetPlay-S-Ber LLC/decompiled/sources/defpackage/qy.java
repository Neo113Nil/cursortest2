package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qy implements q8 {
    public final i30 f;
    public final p8 g;
    public boolean h;

    public qy(i30 i30Var) {
        i30Var.getClass();
        this.f = i30Var;
        this.g = new p8();
    }

    @Override // defpackage.i30
    public final d60 a() {
        return this.f.a();
    }

    @Override // defpackage.i30, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i30 i30Var = this.f;
        if (this.h) {
            return;
        }
        try {
            p8 p8Var = this.g;
            long j = p8Var.g;
            if (j > 0) {
                i30Var.e(j, p8Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            i30Var.close();
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

    @Override // defpackage.i30
    public final void e(long j, p8 p8Var) {
        p8Var.getClass();
        if (this.h) {
            o8.t("closed");
        } else {
            this.g.e(j, p8Var);
            m();
        }
    }

    @Override // defpackage.q8, defpackage.i30, java.io.Flushable
    public final void flush() {
        if (this.h) {
            o8.t("closed");
            return;
        }
        p8 p8Var = this.g;
        long j = p8Var.g;
        i30 i30Var = this.f;
        if (j > 0) {
            i30Var.e(j, p8Var);
        }
        i30Var.flush();
    }

    @Override // defpackage.q8
    public final q8 i(String str) {
        str.getClass();
        if (this.h) {
            o8.t("closed");
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

    @Override // defpackage.q8
    public final q8 j(t8 t8Var) {
        t8Var.getClass();
        if (this.h) {
            o8.t("closed");
            return null;
        }
        t8Var.i(this.g, t8Var.a());
        m();
        return this;
    }

    public final q8 m() {
        if (this.h) {
            o8.t("closed");
            return null;
        }
        p8 p8Var = this.g;
        long j = p8Var.g;
        if (j == 0) {
            j = 0;
        } else {
            f20 f20Var = p8Var.f;
            f20Var.getClass();
            f20 f20Var2 = f20Var.g;
            f20Var2.getClass();
            if (f20Var2.c < 8192 && f20Var2.e) {
                j -= r6 - f20Var2.b;
            }
        }
        if (j > 0) {
            this.f.e(j, p8Var);
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
            o8.t("closed");
            return 0;
        }
        int write = this.g.write(byteBuffer);
        m();
        return write;
    }

    @Override // defpackage.q8
    public final q8 writeByte(int i) {
        if (this.h) {
            o8.t("closed");
            return null;
        }
        this.g.w(i);
        m();
        return this;
    }

    @Override // defpackage.q8
    public final q8 writeInt(int i) {
        if (this.h) {
            o8.t("closed");
            return null;
        }
        this.g.y(i);
        m();
        return this;
    }

    @Override // defpackage.q8
    public final q8 writeShort(int i) {
        if (this.h) {
            o8.t("closed");
            return null;
        }
        this.g.z(i);
        m();
        return this;
    }

    @Override // defpackage.q8
    public final q8 write(byte[] bArr) {
        if (!this.h) {
            this.g.u(bArr, bArr.length);
            m();
            return this;
        }
        o8.t("closed");
        return null;
    }
}

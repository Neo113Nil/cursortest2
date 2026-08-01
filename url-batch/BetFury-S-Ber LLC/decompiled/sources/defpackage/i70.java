package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class i70 implements v9 {
    public final ae0 f;
    public final t9 g;
    public boolean h;

    public i70(ae0 ae0Var) {
        ae0Var.getClass();
        this.f = ae0Var;
        this.g = new t9();
    }

    @Override // defpackage.v9
    public final v9 I(String str) {
        str.getClass();
        if (this.h) {
            s9.u("closed");
            return null;
        }
        this.g.X(str);
        i();
        return this;
    }

    @Override // defpackage.v9
    public final v9 K(y9 y9Var) {
        y9Var.getClass();
        if (this.h) {
            s9.u("closed");
            return null;
        }
        y9Var.i(this.g, y9Var.a());
        i();
        return this;
    }

    @Override // defpackage.ae0
    public final gi0 a() {
        return this.f.a();
    }

    @Override // defpackage.ae0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ae0 ae0Var = this.f;
        if (this.h) {
            return;
        }
        try {
            t9 t9Var = this.g;
            long j = t9Var.g;
            if (j > 0) {
                ae0Var.v(j, t9Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ae0Var.close();
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

    @Override // defpackage.v9, defpackage.ae0, java.io.Flushable
    public final void flush() {
        if (this.h) {
            s9.u("closed");
            return;
        }
        t9 t9Var = this.g;
        long j = t9Var.g;
        ae0 ae0Var = this.f;
        if (j > 0) {
            ae0Var.v(j, t9Var);
        }
        ae0Var.flush();
    }

    public final v9 i() {
        if (this.h) {
            s9.u("closed");
            return null;
        }
        t9 t9Var = this.g;
        long j = t9Var.g;
        if (j == 0) {
            j = 0;
        } else {
            kc0 kc0Var = t9Var.f;
            kc0Var.getClass();
            kc0 kc0Var2 = kc0Var.g;
            kc0Var2.getClass();
            if (kc0Var2.c < 8192 && kc0Var2.e) {
                j -= r6 - kc0Var2.b;
            }
        }
        if (j > 0) {
            this.f.v(j, t9Var);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // defpackage.ae0
    public final void v(long j, t9 t9Var) {
        t9Var.getClass();
        if (this.h) {
            s9.u("closed");
        } else {
            this.g.v(j, t9Var);
            i();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.h) {
            s9.u("closed");
            return 0;
        }
        int write = this.g.write(byteBuffer);
        i();
        return write;
    }

    @Override // defpackage.v9
    public final v9 writeByte(int i) {
        if (this.h) {
            s9.u("closed");
            return null;
        }
        this.g.T(i);
        i();
        return this;
    }

    @Override // defpackage.v9
    public final v9 writeInt(int i) {
        if (this.h) {
            s9.u("closed");
            return null;
        }
        this.g.V(i);
        i();
        return this;
    }

    @Override // defpackage.v9
    public final v9 writeShort(int i) {
        if (this.h) {
            s9.u("closed");
            return null;
        }
        this.g.W(i);
        i();
        return this;
    }

    @Override // defpackage.v9
    public final v9 write(byte[] bArr) {
        if (!this.h) {
            this.g.R(bArr.length, bArr);
            i();
            return this;
        }
        s9.u("closed");
        return null;
    }
}

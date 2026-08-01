package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d10 implements i9 {
    public final x50 f;
    public final h9 g;
    public boolean h;

    public d10(x50 x50Var) {
        x50Var.getClass();
        this.f = x50Var;
        this.g = new h9();
    }

    @Override // defpackage.x50
    public final f90 a() {
        return this.f.a();
    }

    @Override // defpackage.x50, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        x50 x50Var = this.f;
        if (this.h) {
            return;
        }
        try {
            h9 h9Var = this.g;
            long j = h9Var.g;
            if (j > 0) {
                x50Var.e(j, h9Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            x50Var.close();
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

    @Override // defpackage.x50
    public final void e(long j, h9 h9Var) {
        h9Var.getClass();
        if (this.h) {
            g9.s("closed");
        } else {
            this.g.e(j, h9Var);
            f();
        }
    }

    public final i9 f() {
        if (this.h) {
            g9.s("closed");
            return null;
        }
        h9 h9Var = this.g;
        long j = h9Var.g;
        if (j == 0) {
            j = 0;
        } else {
            u40 u40Var = h9Var.f;
            u40Var.getClass();
            u40 u40Var2 = u40Var.g;
            u40Var2.getClass();
            if (u40Var2.c < 8192 && u40Var2.e) {
                j -= r6 - u40Var2.b;
            }
        }
        if (j > 0) {
            this.f.e(j, h9Var);
        }
        return this;
    }

    @Override // defpackage.i9, defpackage.x50, java.io.Flushable
    public final void flush() {
        if (this.h) {
            g9.s("closed");
            return;
        }
        h9 h9Var = this.g;
        long j = h9Var.g;
        x50 x50Var = this.f;
        if (j > 0) {
            x50Var.e(j, h9Var);
        }
        x50Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.i9
    public final i9 m(String str) {
        str.getClass();
        if (this.h) {
            g9.s("closed");
            return null;
        }
        this.g.A(str);
        f();
        return this;
    }

    @Override // defpackage.i9
    public final i9 n(l9 l9Var) {
        l9Var.getClass();
        if (this.h) {
            g9.s("closed");
            return null;
        }
        l9Var.i(this.g, l9Var.a());
        f();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.h) {
            g9.s("closed");
            return 0;
        }
        int write = this.g.write(byteBuffer);
        f();
        return write;
    }

    @Override // defpackage.i9
    public final i9 writeByte(int i) {
        if (this.h) {
            g9.s("closed");
            return null;
        }
        this.g.w(i);
        f();
        return this;
    }

    @Override // defpackage.i9
    public final i9 writeInt(int i) {
        if (this.h) {
            g9.s("closed");
            return null;
        }
        this.g.y(i);
        f();
        return this;
    }

    @Override // defpackage.i9
    public final i9 writeShort(int i) {
        if (this.h) {
            g9.s("closed");
            return null;
        }
        this.g.z(i);
        f();
        return this;
    }

    @Override // defpackage.i9
    public final i9 write(byte[] bArr) {
        if (!this.h) {
            this.g.u(bArr, bArr.length);
            f();
            return this;
        }
        g9.s("closed");
        return null;
    }
}

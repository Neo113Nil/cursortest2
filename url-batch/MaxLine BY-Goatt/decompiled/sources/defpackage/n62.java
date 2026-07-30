package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n62 implements oq {
    public final ol2 m;
    public final fq n;
    public boolean o;

    public n62(ol2 ol2Var) {
        ol2Var.getClass();
        this.m = ol2Var;
        this.n = new fq();
    }

    @Override // defpackage.oq
    public final oq G(String str) {
        str.getClass();
        if (this.o) {
            lh.g("closed");
            return null;
        }
        this.n.Q(str);
        b();
        return this;
    }

    public final oq b() {
        if (this.o) {
            lh.g("closed");
            return null;
        }
        fq fqVar = this.n;
        long b = fqVar.b();
        if (b > 0) {
            this.m.u(b, fqVar);
        }
        return this;
    }

    @Override // defpackage.ol2, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        ol2 ol2Var = this.m;
        if (this.o) {
            return;
        }
        try {
            fq fqVar = this.n;
            long j = fqVar.n;
            if (j > 0) {
                ol2Var.u(j, fqVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ol2Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ol2
    public final rx2 e() {
        return this.m.e();
    }

    public final oq f(long j) {
        boolean z;
        if (this.o) {
            lh.g("closed");
            return null;
        }
        fq fqVar = this.n;
        if (j == 0) {
            fqVar.L(48);
        } else {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    fqVar.Q("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j >= 100000000) {
                i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
            } else if (j >= 10000) {
                i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i = 2;
            }
            if (z) {
                i++;
            }
            ug2 B = fqVar.B(i);
            byte[] bArr = B.a;
            int i2 = B.c + i;
            while (j != 0) {
                i2--;
                bArr[i2] = f.a[(int) (j % 10)];
                j /= 10;
            }
            if (z) {
                bArr[i2 - 1] = 45;
            }
            B.c += i;
            fqVar.n += i;
        }
        b();
        return this;
    }

    @Override // defpackage.oq, defpackage.ol2, java.io.Flushable
    public final void flush() {
        if (this.o) {
            lh.g("closed");
            return;
        }
        fq fqVar = this.n;
        long j = fqVar.n;
        ol2 ol2Var = this.m;
        if (j > 0) {
            ol2Var.u(j, fqVar);
        }
        ol2Var.flush();
    }

    @Override // defpackage.oq
    public final oq i(dr drVar) {
        drVar.getClass();
        if (this.o) {
            lh.g("closed");
            return null;
        }
        this.n.H(drVar);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.o;
    }

    public final String toString() {
        return "buffer(" + this.m + ')';
    }

    @Override // defpackage.ol2
    public final void u(long j, fq fqVar) {
        fqVar.getClass();
        if (this.o) {
            lh.g("closed");
        } else {
            this.n.u(j, fqVar);
            b();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.o) {
            lh.g("closed");
            return 0;
        }
        int write = this.n.write(byteBuffer);
        b();
        return write;
    }

    @Override // defpackage.oq
    public final oq writeByte(int i) {
        if (this.o) {
            lh.g("closed");
            return null;
        }
        this.n.L(i);
        b();
        return this;
    }

    @Override // defpackage.oq
    public final oq writeInt(int i) {
        if (this.o) {
            lh.g("closed");
            return null;
        }
        this.n.O(i);
        b();
        return this;
    }

    @Override // defpackage.oq
    public final oq writeShort(int i) {
        if (this.o) {
            lh.g("closed");
            return null;
        }
        this.n.P(i);
        b();
        return this;
    }

    @Override // defpackage.oq
    public final oq write(byte[] bArr) {
        if (!this.o) {
            this.n.C(bArr.length, bArr);
            b();
            return this;
        }
        lh.g("closed");
        return null;
    }
}

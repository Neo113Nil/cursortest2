package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e13 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final js0 b;
    public volatile int c = 0;

    public e13(js0 js0Var, int i) {
        this.b = js0Var;
        this.a = i;
    }

    public final int a(int i) {
        kl1 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.p;
        int i2 = a + b.m;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final kl1 b() {
        ThreadLocal threadLocal = d;
        kl1 kl1Var = (kl1) threadLocal.get();
        if (kl1Var == null) {
            kl1Var = new kl1();
            threadLocal.set(kl1Var);
        }
        ll1 ll1Var = (ll1) this.b.m;
        int a = ll1Var.a(6);
        if (a != 0) {
            int i = a + ll1Var.m;
            int i2 = (this.a * 4) + ((ByteBuffer) ll1Var.p).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ll1Var.p).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ll1Var.p;
            kl1Var.p = byteBuffer;
            if (byteBuffer != null) {
                kl1Var.m = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                kl1Var.n = i4;
                kl1Var.o = ((ByteBuffer) kl1Var.p).getShort(i4);
                return kl1Var;
            }
            kl1Var.m = 0;
            kl1Var.n = 0;
            kl1Var.o = 0;
        }
        return kl1Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        kl1 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.p).getInt(a + b.m) : 0));
        sb.append(", codepoints:");
        kl1 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.m;
            i = ((ByteBuffer) b2.p).getInt(((ByteBuffer) b2.p).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

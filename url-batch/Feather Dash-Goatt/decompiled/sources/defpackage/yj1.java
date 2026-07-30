package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yj1 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final o91 b;
    public volatile int c = 0;

    public yj1(o91 o91Var, int i) {
        this.b = o91Var;
        this.a = i;
    }

    public final int a(int i) {
        rl0 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.h;
        int i2 = a + b.d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final rl0 b() {
        ThreadLocal threadLocal = d;
        rl0 rl0Var = (rl0) threadLocal.get();
        if (rl0Var == null) {
            rl0Var = new rl0();
            threadLocal.set(rl0Var);
        }
        sl0 sl0Var = (sl0) this.b.d;
        int a = sl0Var.a(6);
        if (a != 0) {
            int i = a + sl0Var.d;
            int i2 = (this.a * 4) + ((ByteBuffer) sl0Var.h).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) sl0Var.h).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) sl0Var.h;
            rl0Var.h = byteBuffer;
            if (byteBuffer != null) {
                rl0Var.d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                rl0Var.e = i4;
                rl0Var.g = ((ByteBuffer) rl0Var.h).getShort(i4);
                return rl0Var;
            }
            rl0Var.d = 0;
            rl0Var.e = 0;
            rl0Var.g = 0;
        }
        return rl0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        rl0 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.h).getInt(a + b.d) : 0));
        sb.append(", codepoints:");
        rl0 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.d;
            i = ((ByteBuffer) b2.h).getInt(((ByteBuffer) b2.h).getInt(i2) + i2);
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

package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nk0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final wi b;
    public volatile int c = 0;

    public nk0(wi wiVar, int i) {
        this.b = wiVar;
        this.a = i;
    }

    public final int a(int i) {
        l20 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.i;
        int i2 = a + b.f;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final l20 b() {
        ThreadLocal threadLocal = d;
        l20 l20Var = (l20) threadLocal.get();
        if (l20Var == null) {
            l20Var = new l20();
            threadLocal.set(l20Var);
        }
        m20 m20Var = (m20) this.b.f;
        int a = m20Var.a(6);
        if (a != 0) {
            int i = a + m20Var.f;
            int i2 = (this.a * 4) + ((ByteBuffer) m20Var.i).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) m20Var.i).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) m20Var.i;
            l20Var.i = byteBuffer;
            if (byteBuffer != null) {
                l20Var.f = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                l20Var.g = i4;
                l20Var.h = ((ByteBuffer) l20Var.i).getShort(i4);
                return l20Var;
            }
            l20Var.f = 0;
            l20Var.g = 0;
            l20Var.h = 0;
        }
        return l20Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        l20 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.i).getInt(a + b.f) : 0));
        sb.append(", codepoints:");
        l20 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.f;
            i = ((ByteBuffer) b2.i).getInt(((ByteBuffer) b2.i).getInt(i2) + i2);
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

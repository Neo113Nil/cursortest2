package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s70 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final h8 b;
    public volatile int c = 0;

    public s70(h8 h8Var, int i) {
        this.b = h8Var;
        this.a = i;
    }

    public final int a(int i) {
        vu b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final vu b() {
        ThreadLocal threadLocal = d;
        vu vuVar = (vu) threadLocal.get();
        if (vuVar == null) {
            vuVar = new vu();
            threadLocal.set(vuVar);
        }
        wu wuVar = (wu) this.b.f;
        int a = wuVar.a(6);
        if (a != 0) {
            int i = a + wuVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) wuVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) wuVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) wuVar.d;
            vuVar.d = byteBuffer;
            if (byteBuffer != null) {
                vuVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                vuVar.b = i4;
                vuVar.c = ((ByteBuffer) vuVar.d).getShort(i4);
                return vuVar;
            }
            vuVar.a = 0;
            vuVar.b = 0;
            vuVar.c = 0;
        }
        return vuVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        vu b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        vu b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i2) + i2);
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

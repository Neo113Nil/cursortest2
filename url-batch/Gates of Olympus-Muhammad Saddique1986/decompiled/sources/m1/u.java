package m1;

import java.nio.ByteBuffer;
import n1.C0719a;
import n1.C0720b;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f6981d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f6982a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.g f6983b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f6984c = 0;

    public u(G1.g gVar, int i3) {
        this.f6983b = gVar;
        this.f6982a = i3;
    }

    public final int a(int i3) {
        C0719a c2 = c();
        int a3 = c2.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.f4353g;
        int i4 = a3 + c2.f4350d;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final int b() {
        C0719a c2 = c();
        int a3 = c2.a(16);
        if (a3 == 0) {
            return 0;
        }
        int i3 = a3 + c2.f4350d;
        return ((ByteBuffer) c2.f4353g).getInt(((ByteBuffer) c2.f4353g).getInt(i3) + i3);
    }

    public final C0719a c() {
        ThreadLocal threadLocal = f6981d;
        C0719a c0719a = (C0719a) threadLocal.get();
        if (c0719a == null) {
            c0719a = new C0719a();
            threadLocal.set(c0719a);
        }
        C0720b c0720b = (C0720b) this.f6983b.f2093e;
        int a3 = c0720b.a(6);
        if (a3 != 0) {
            int i3 = a3 + c0720b.f4350d;
            int i4 = (this.f6982a * 4) + ((ByteBuffer) c0720b.f4353g).getInt(i3) + i3 + 4;
            int i5 = ((ByteBuffer) c0720b.f4353g).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) c0720b.f4353g;
            c0719a.f4353g = byteBuffer;
            if (byteBuffer != null) {
                c0719a.f4350d = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                c0719a.f4351e = i6;
                c0719a.f4352f = ((ByteBuffer) c0719a.f4353g).getShort(i6);
            } else {
                c0719a.f4350d = 0;
                c0719a.f4351e = 0;
                c0719a.f4352f = 0;
            }
        }
        return c0719a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0719a c2 = c();
        int a3 = c2.a(4);
        sb.append(Integer.toHexString(a3 != 0 ? ((ByteBuffer) c2.f4353g).getInt(a3 + c2.f4350d) : 0));
        sb.append(", codepoints:");
        int b3 = b();
        for (int i3 = 0; i3 < b3; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

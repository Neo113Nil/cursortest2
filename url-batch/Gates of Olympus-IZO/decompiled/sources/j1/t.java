package j1;

import java.nio.ByteBuffer;
import k1.C0526a;
import k1.C0527b;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f5288d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f5289a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.k f5290b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5291c = 0;

    public t(A2.k kVar, int i3) {
        this.f5290b = kVar;
        this.f5289a = i3;
    }

    public final int a(int i3) {
        C0526a c3 = c();
        int a3 = c3.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3.f2874g;
        int i4 = a3 + c3.f2871d;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final int b() {
        C0526a c3 = c();
        int a3 = c3.a(16);
        if (a3 == 0) {
            return 0;
        }
        int i3 = a3 + c3.f2871d;
        return ((ByteBuffer) c3.f2874g).getInt(((ByteBuffer) c3.f2874g).getInt(i3) + i3);
    }

    public final C0526a c() {
        ThreadLocal threadLocal = f5288d;
        C0526a c0526a = (C0526a) threadLocal.get();
        if (c0526a == null) {
            c0526a = new C0526a();
            threadLocal.set(c0526a);
        }
        C0527b c0527b = (C0527b) this.f5290b.f108b;
        int a3 = c0527b.a(6);
        if (a3 != 0) {
            int i3 = a3 + c0527b.f2871d;
            int i4 = (this.f5289a * 4) + ((ByteBuffer) c0527b.f2874g).getInt(i3) + i3 + 4;
            int i5 = ((ByteBuffer) c0527b.f2874g).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) c0527b.f2874g;
            c0526a.f2874g = byteBuffer;
            if (byteBuffer != null) {
                c0526a.f2871d = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                c0526a.f2872e = i6;
                c0526a.f2873f = ((ByteBuffer) c0526a.f2874g).getShort(i6);
            } else {
                c0526a.f2871d = 0;
                c0526a.f2872e = 0;
                c0526a.f2873f = 0;
            }
        }
        return c0526a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0526a c3 = c();
        int a3 = c3.a(4);
        sb.append(Integer.toHexString(a3 != 0 ? ((ByteBuffer) c3.f2874g).getInt(a3 + c3.f2871d) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i3 = 0; i3 < b2; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

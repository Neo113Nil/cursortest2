package androidx.emoji2.text;

import b0.C0521a;
import b0.C0522b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f4915d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f4916a;

    /* renamed from: b, reason: collision with root package name */
    public final f4.p f4917b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4918c = 0;

    public u(f4.p pVar, int i) {
        this.f4917b = pVar;
        this.f4916a = i;
    }

    public final int a(int i) {
        C0521a b9 = b();
        int a9 = b9.a(16);
        if (a9 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b9.f2231w;
        int i4 = a9 + b9.f2228n;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final C0521a b() {
        ThreadLocal threadLocal = f4915d;
        C0521a c0521a = (C0521a) threadLocal.get();
        if (c0521a == null) {
            c0521a = new C0521a();
            threadLocal.set(c0521a);
        }
        C0522b c0522b = (C0522b) this.f4917b.f37763u;
        int a9 = c0522b.a(6);
        if (a9 != 0) {
            int i = a9 + c0522b.f2228n;
            int i4 = (this.f4916a * 4) + ((ByteBuffer) c0522b.f2231w).getInt(i) + i + 4;
            int i9 = ((ByteBuffer) c0522b.f2231w).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) c0522b.f2231w;
            c0521a.f2231w = byteBuffer;
            if (byteBuffer != null) {
                c0521a.f2228n = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c0521a.f2229u = i10;
                c0521a.f2230v = ((ByteBuffer) c0521a.f2231w).getShort(i10);
                return c0521a;
            }
            c0521a.f2228n = 0;
            c0521a.f2229u = 0;
            c0521a.f2230v = 0;
        }
        return c0521a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0521a b9 = b();
        int a9 = b9.a(4);
        sb.append(Integer.toHexString(a9 != 0 ? ((ByteBuffer) b9.f2231w).getInt(a9 + b9.f2228n) : 0));
        sb.append(", codepoints:");
        C0521a b10 = b();
        int a10 = b10.a(16);
        if (a10 != 0) {
            int i4 = a10 + b10.f2228n;
            i = ((ByteBuffer) b10.f2231w).getInt(((ByteBuffer) b10.f2231w).getInt(i4) + i4);
        } else {
            i = 0;
        }
        for (int i9 = 0; i9 < i; i9++) {
            sb.append(Integer.toHexString(a(i9)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

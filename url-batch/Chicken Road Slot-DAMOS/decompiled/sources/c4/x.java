package c4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1794d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1795a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.n f1796b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1797c = 0;

    public x(c6.n nVar, int i3) {
        this.f1796b = nVar;
        this.f1795a = i3;
    }

    public final int a(int i3) {
        d4.a b10 = b();
        int a9 = b10.a(16);
        if (a9 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b10.f3619r;
        int i10 = a9 + b10.f3616d;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final d4.a b() {
        ThreadLocal threadLocal = f1794d;
        d4.a aVar = (d4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new d4.a();
            threadLocal.set(aVar);
        }
        d4.b bVar = (d4.b) this.f1796b.f1833d;
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i3 = a9 + bVar.f3616d;
            int i10 = (this.f1795a * 4) + ((ByteBuffer) bVar.f3619r).getInt(i3) + i3 + 4;
            int i11 = ((ByteBuffer) bVar.f3619r).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f3619r;
            aVar.f3619r = byteBuffer;
            if (byteBuffer != null) {
                aVar.f3616d = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f3617e = i12;
                aVar.f3618i = ((ByteBuffer) aVar.f3619r).getShort(i12);
                return aVar;
            }
            aVar.f3616d = 0;
            aVar.f3617e = 0;
            aVar.f3618i = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        d4.a b10 = b();
        int a9 = b10.a(4);
        sb2.append(Integer.toHexString(a9 != 0 ? ((ByteBuffer) b10.f3619r).getInt(a9 + b10.f3616d) : 0));
        sb2.append(", codepoints:");
        d4.a b11 = b();
        int a10 = b11.a(16);
        if (a10 != 0) {
            int i10 = a10 + b11.f3616d;
            i3 = ((ByteBuffer) b11.f3619r).getInt(((ByteBuffer) b11.f3619r).getInt(i10) + i10);
        } else {
            i3 = 0;
        }
        for (int i11 = 0; i11 < i3; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

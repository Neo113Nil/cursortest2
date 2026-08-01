package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1122a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.m f1123b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1124c = 0;

    public x(T0.m mVar, int i) {
        this.f1123b = mVar;
        this.f1122a = i;
    }

    public final int a(int i) {
        V.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.d;
        int i2 = a2 + c2.f568a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        V.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f568a;
        return ((ByteBuffer) c2.d).getInt(((ByteBuffer) c2.d).getInt(i) + i);
    }

    public final V.a c() {
        ThreadLocal threadLocal = d;
        V.a aVar = (V.a) threadLocal.get();
        if (aVar == null) {
            aVar = new V.a();
            threadLocal.set(aVar);
        }
        V.b bVar = (V.b) this.f1123b.f1073a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f568a;
            int i2 = (this.f1122a * 4) + ((ByteBuffer) bVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f568a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f569b = i4;
                aVar.f570c = ((ByteBuffer) aVar.d).getShort(i4);
            } else {
                aVar.f568a = 0;
                aVar.f569b = 0;
                aVar.f570c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        V.a c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.d).getInt(a2 + c2.f568a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

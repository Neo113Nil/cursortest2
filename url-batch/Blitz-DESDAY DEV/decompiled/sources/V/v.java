package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f915a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.g f916b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f917c = 0;

    public v(T0.g gVar, int i) {
        this.f916b = gVar;
        this.f915a = i;
    }

    public final int a(int i) {
        W.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.d;
        int i2 = a2 + c2.f503a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        W.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f503a;
        return ((ByteBuffer) c2.d).getInt(((ByteBuffer) c2.d).getInt(i) + i);
    }

    public final W.a c() {
        ThreadLocal threadLocal = d;
        W.a aVar = (W.a) threadLocal.get();
        if (aVar == null) {
            aVar = new W.a();
            threadLocal.set(aVar);
        }
        W.b bVar = (W.b) this.f916b.f824a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f503a;
            int i2 = (this.f915a * 4) + ((ByteBuffer) bVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f503a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f504b = i4;
                aVar.f505c = ((ByteBuffer) aVar.d).getShort(i4);
            } else {
                aVar.f503a = 0;
                aVar.f504b = 0;
                aVar.f505c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        W.a c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.d).getInt(a2 + c2.f503a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

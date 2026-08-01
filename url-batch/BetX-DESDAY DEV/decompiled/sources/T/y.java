package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f832d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f833a;

    /* renamed from: b, reason: collision with root package name */
    public final v f834b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f835c = 0;

    public y(v vVar, int i) {
        this.f834b = vVar;
        this.f833a = i;
    }

    public final int a(int i) {
        U.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.f410d;
        int i2 = a2 + c2.f407a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        U.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f407a;
        return ((ByteBuffer) c2.f410d).getInt(((ByteBuffer) c2.f410d).getInt(i) + i);
    }

    public final U.a c() {
        ThreadLocal threadLocal = f832d;
        U.a aVar = (U.a) threadLocal.get();
        if (aVar == null) {
            aVar = new U.a();
            threadLocal.set(aVar);
        }
        U.b bVar = (U.b) this.f834b.f824a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f407a;
            int i2 = (this.f833a * 4) + ((ByteBuffer) bVar.f410d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.f410d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f410d;
            aVar.f410d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f407a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f408b = i4;
                aVar.f409c = ((ByteBuffer) aVar.f410d).getShort(i4);
            } else {
                aVar.f407a = 0;
                aVar.f408b = 0;
                aVar.f409c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        U.a c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.f410d).getInt(a2 + c2.f407a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

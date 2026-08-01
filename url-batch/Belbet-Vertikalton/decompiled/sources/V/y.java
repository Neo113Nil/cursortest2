package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1313d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1314a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1315b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1316c = 0;

    public y(v vVar, int i) {
        this.f1315b = vVar;
        this.f1314a = i;
    }

    public final int a(int i) {
        W.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.f702d;
        int i2 = a2 + c2.f699a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        W.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f699a;
        return ((ByteBuffer) c2.f702d).getInt(((ByteBuffer) c2.f702d).getInt(i) + i);
    }

    public final W.a c() {
        ThreadLocal threadLocal = f1313d;
        W.a aVar = (W.a) threadLocal.get();
        if (aVar == null) {
            aVar = new W.a();
            threadLocal.set(aVar);
        }
        W.b bVar = (W.b) this.f1315b.f1305a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f699a;
            int i2 = (this.f1314a * 4) + ((ByteBuffer) bVar.f702d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.f702d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f702d;
            aVar.f702d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f699a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f700b = i4;
                aVar.f701c = ((ByteBuffer) aVar.f702d).getShort(i4);
            } else {
                aVar.f699a = 0;
                aVar.f700b = 0;
                aVar.f701c = 0;
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
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.f702d).getInt(a2 + c2.f699a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

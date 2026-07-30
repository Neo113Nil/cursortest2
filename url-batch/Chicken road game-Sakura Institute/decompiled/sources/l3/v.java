package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f5936d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f5937a;

    /* renamed from: b, reason: collision with root package name */
    public final g3.k f5938b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5939c = 0;

    public v(g3.k kVar, int i7) {
        this.f5938b = kVar;
        this.f5937a = i7;
    }

    public final int a(int i7) {
        m3.a b9 = b();
        int a3 = b9.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b9.f3416i;
        int i8 = a3 + b9.f3413f;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final m3.a b() {
        ThreadLocal threadLocal = f5936d;
        m3.a aVar = (m3.a) threadLocal.get();
        if (aVar == null) {
            aVar = new m3.a();
            threadLocal.set(aVar);
        }
        m3.b bVar = (m3.b) this.f5938b.f4160g;
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i7 = a3 + bVar.f3413f;
            int i8 = (this.f5937a * 4) + ((ByteBuffer) bVar.f3416i).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) bVar.f3416i).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f3416i;
            aVar.f3416i = byteBuffer;
            if (byteBuffer != null) {
                aVar.f3413f = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                aVar.f3414g = i10;
                aVar.f3415h = ((ByteBuffer) aVar.f3416i).getShort(i10);
                return aVar;
            }
            aVar.f3413f = 0;
            aVar.f3414g = 0;
            aVar.f3415h = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i7;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        m3.a b9 = b();
        int a3 = b9.a(4);
        sb.append(Integer.toHexString(a3 != 0 ? ((ByteBuffer) b9.f3416i).getInt(a3 + b9.f3413f) : 0));
        sb.append(", codepoints:");
        m3.a b10 = b();
        int a9 = b10.a(16);
        if (a9 != 0) {
            int i8 = a9 + b10.f3413f;
            i7 = ((ByteBuffer) b10.f3416i).getInt(((ByteBuffer) b10.f3416i).getInt(i8) + i8);
        } else {
            i7 = 0;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(Integer.toHexString(a(i9)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

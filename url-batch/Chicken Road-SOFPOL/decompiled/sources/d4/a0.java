package d4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f2246d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f2247a;

    /* renamed from: b, reason: collision with root package name */
    public final c5.x f2248b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2249c = 0;

    public a0(c5.x xVar, int i) {
        this.f2248b = xVar;
        this.f2247a = i;
    }

    public final int a(int i) {
        e4.a b8 = b();
        int a8 = b8.a(16);
        if (a8 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b8.f2491g;
        int i8 = a8 + b8.f2488d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final e4.a b() {
        ThreadLocal threadLocal = f2246d;
        e4.a aVar = (e4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new e4.a();
            threadLocal.set(aVar);
        }
        e4.b bVar = (e4.b) this.f2248b.f1737d;
        int a8 = bVar.a(6);
        if (a8 != 0) {
            int i = a8 + bVar.f2488d;
            int i8 = (this.f2247a * 4) + ((ByteBuffer) bVar.f2491g).getInt(i) + i + 4;
            int i9 = ((ByteBuffer) bVar.f2491g).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f2491g;
            aVar.f2491g = byteBuffer;
            if (byteBuffer != null) {
                aVar.f2488d = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                aVar.f2489e = i10;
                aVar.f2490f = ((ByteBuffer) aVar.f2491g).getShort(i10);
                return aVar;
            }
            aVar.f2488d = 0;
            aVar.f2489e = 0;
            aVar.f2490f = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        e4.a b8 = b();
        int a8 = b8.a(4);
        sb.append(Integer.toHexString(a8 != 0 ? ((ByteBuffer) b8.f2491g).getInt(a8 + b8.f2488d) : 0));
        sb.append(", codepoints:");
        e4.a b9 = b();
        int a9 = b9.a(16);
        if (a9 != 0) {
            int i8 = a9 + b9.f2488d;
            i = ((ByteBuffer) b9.f2491g).getInt(((ByteBuffer) b9.f2491g).getInt(i8) + i8);
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

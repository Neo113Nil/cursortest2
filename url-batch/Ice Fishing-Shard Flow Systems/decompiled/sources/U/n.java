package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f2678d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.i f2680b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2681c = 0;

    public n(P0.i iVar, int i2) {
        this.f2680b = iVar;
        this.f2679a = i2;
    }

    public final int a(int i2) {
        V.a b7 = b();
        int a7 = b7.a(16);
        if (a7 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b7.f1145l;
        int i5 = a7 + b7.f1142d;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final V.a b() {
        ThreadLocal threadLocal = f2678d;
        V.a aVar = (V.a) threadLocal.get();
        if (aVar == null) {
            aVar = new V.a();
            threadLocal.set(aVar);
        }
        V.b bVar = (V.b) this.f2680b.f2200a;
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i2 = a7 + bVar.f1142d;
            int i5 = (this.f2679a * 4) + ((ByteBuffer) bVar.f1145l).getInt(i2) + i2 + 4;
            int i7 = ((ByteBuffer) bVar.f1145l).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1145l;
            aVar.f1145l = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1142d = i7;
                int i8 = i7 - byteBuffer.getInt(i7);
                aVar.f1143e = i8;
                aVar.f1144i = ((ByteBuffer) aVar.f1145l).getShort(i8);
                return aVar;
            }
            aVar.f1142d = 0;
            aVar.f1143e = 0;
            aVar.f1144i = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        V.a b7 = b();
        int a7 = b7.a(4);
        sb.append(Integer.toHexString(a7 != 0 ? ((ByteBuffer) b7.f1145l).getInt(a7 + b7.f1142d) : 0));
        sb.append(", codepoints:");
        V.a b8 = b();
        int a8 = b8.a(16);
        if (a8 != 0) {
            int i5 = a8 + b8.f1142d;
            i2 = ((ByteBuffer) b8.f1145l).getInt(((ByteBuffer) b8.f1145l).getInt(i5) + i5);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            sb.append(Integer.toHexString(a(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

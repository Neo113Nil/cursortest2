package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f823a;

    /* renamed from: b, reason: collision with root package name */
    public final u f824b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f825c = 0;

    public x(u uVar, int i) {
        this.f824b = uVar;
        this.f823a = i;
    }

    public final int a(int i) {
        U.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.d;
        int i2 = a2 + c2.f341a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        U.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f341a;
        return ((ByteBuffer) c2.d).getInt(((ByteBuffer) c2.d).getInt(i) + i);
    }

    public final U.a c() {
        ThreadLocal threadLocal = d;
        U.a aVar = (U.a) threadLocal.get();
        if (aVar == null) {
            aVar = new U.a();
            threadLocal.set(aVar);
        }
        U.b bVar = (U.b) this.f824b.f816a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f341a;
            int i2 = (this.f823a * 4) + ((ByteBuffer) bVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f341a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f342b = i4;
                aVar.f343c = ((ByteBuffer) aVar.d).getShort(i4);
            } else {
                aVar.f341a = 0;
                aVar.f342b = 0;
                aVar.f343c = 0;
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
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.d).getInt(a2 + c2.f341a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f372d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f373a;

    /* renamed from: b, reason: collision with root package name */
    public final w f374b;
    public volatile int c = 0;

    public z(w wVar, int i4) {
        this.f374b = wVar;
        this.f373a = i4;
    }

    public final int a(int i4) {
        s0.a b2 = b();
        int a4 = b2.a(16);
        if (a4 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.f2795d;
        int i5 = a4 + b2.f2793a;
        return byteBuffer.getInt((i4 * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final s0.a b() {
        ThreadLocal threadLocal = f372d;
        s0.a aVar = (s0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new s0.a();
            threadLocal.set(aVar);
        }
        s0.b bVar = (s0.b) this.f374b.f368f;
        int a4 = bVar.a(6);
        if (a4 != 0) {
            int i4 = a4 + bVar.f2793a;
            int i5 = (this.f373a * 4) + ((ByteBuffer) bVar.f2795d).getInt(i4) + i4 + 4;
            int i6 = ((ByteBuffer) bVar.f2795d).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f2795d;
            aVar.f2795d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f2793a = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                aVar.f2794b = i7;
                aVar.c = ((ByteBuffer) aVar.f2795d).getShort(i7);
                return aVar;
            }
            aVar.f2793a = 0;
            aVar.f2794b = 0;
            aVar.c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i4;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        s0.a b2 = b();
        int a4 = b2.a(4);
        sb.append(Integer.toHexString(a4 != 0 ? ((ByteBuffer) b2.f2795d).getInt(a4 + b2.f2793a) : 0));
        sb.append(", codepoints:");
        s0.a b4 = b();
        int a5 = b4.a(16);
        if (a5 != 0) {
            int i5 = a5 + b4.f2793a;
            i4 = ((ByteBuffer) b4.f2795d).getInt(((ByteBuffer) b4.f2795d).getInt(i5) + i5);
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

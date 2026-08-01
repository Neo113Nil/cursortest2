package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f487a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.k f488b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f489c = 0;

    public z(a0.k kVar, int i) {
        this.f488b = kVar;
        this.f487a = i;
    }

    public final int a(int i) {
        w0.a b2 = b();
        int a5 = b2.a(16);
        if (a5 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.d;
        int i4 = a5 + b2.f2771a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final w0.a b() {
        ThreadLocal threadLocal = d;
        w0.a aVar = (w0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new w0.a();
            threadLocal.set(aVar);
        }
        w0.b bVar = (w0.b) this.f488b.f97f;
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i = a5 + bVar.f2771a;
            int i4 = (this.f487a * 4) + ((ByteBuffer) bVar.d).getInt(i) + i + 4;
            int i5 = ((ByteBuffer) bVar.d).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f2771a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                aVar.f2772b = i6;
                aVar.f2773c = ((ByteBuffer) aVar.d).getShort(i6);
                return aVar;
            }
            aVar.f2771a = 0;
            aVar.f2772b = 0;
            aVar.f2773c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        w0.a b2 = b();
        int a5 = b2.a(4);
        sb.append(Integer.toHexString(a5 != 0 ? ((ByteBuffer) b2.d).getInt(a5 + b2.f2771a) : 0));
        sb.append(", codepoints:");
        w0.a b5 = b();
        int a6 = b5.a(16);
        if (a6 != 0) {
            int i4 = a6 + b5.f2771a;
            i = ((ByteBuffer) b5.d).getInt(((ByteBuffer) b5.d).getInt(i4) + i4);
        } else {
            i = 0;
        }
        for (int i5 = 0; i5 < i; i5++) {
            sb.append(Integer.toHexString(a(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

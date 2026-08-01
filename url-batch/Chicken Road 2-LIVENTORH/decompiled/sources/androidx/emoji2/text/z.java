package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class z {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f370a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.j f371b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f372c = 0;

    public z(a0.j jVar, int i) {
        this.f371b = jVar;
        this.f370a = i;
    }

    public final int a(int i) {
        v0.a b4 = b();
        int a2 = b4.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b4.d;
        int i4 = a2 + b4.f2710a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final v0.a b() {
        ThreadLocal threadLocal = d;
        v0.a aVar = (v0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new v0.a();
            threadLocal.set(aVar);
        }
        v0.b bVar = (v0.b) this.f371b.f100f;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f2710a;
            int i4 = (this.f370a * 4) + ((ByteBuffer) bVar.d).getInt(i) + i + 4;
            int i5 = ((ByteBuffer) bVar.d).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f2710a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                aVar.f2711b = i6;
                aVar.f2712c = ((ByteBuffer) aVar.d).getShort(i6);
                return aVar;
            }
            aVar.f2710a = 0;
            aVar.f2711b = 0;
            aVar.f2712c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        v0.a b4 = b();
        int a2 = b4.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) b4.d).getInt(a2 + b4.f2710a) : 0));
        sb.append(", codepoints:");
        v0.a b5 = b();
        int a4 = b5.a(16);
        if (a4 != 0) {
            int i4 = a4 + b5.f2710a;
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

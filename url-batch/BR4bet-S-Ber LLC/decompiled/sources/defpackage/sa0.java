package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sa0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final rg b;
    public volatile int c = 0;

    public sa0(rg rgVar, int i) {
        this.b = rgVar;
        this.a = i;
    }

    public final int a(int i) {
        hx b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final hx b() {
        ThreadLocal threadLocal = d;
        hx hxVar = (hx) threadLocal.get();
        if (hxVar == null) {
            hxVar = new hx();
            threadLocal.set(hxVar);
        }
        ix ixVar = (ix) this.b.f;
        int a = ixVar.a(6);
        if (a != 0) {
            int i = a + ixVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) ixVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ixVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ixVar.d;
            hxVar.d = byteBuffer;
            if (byteBuffer != null) {
                hxVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                hxVar.b = i4;
                hxVar.c = ((ByteBuffer) hxVar.d).getShort(i4);
                return hxVar;
            }
            hxVar.a = 0;
            hxVar.b = 0;
            hxVar.c = 0;
        }
        return hxVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        hx b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        hx b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

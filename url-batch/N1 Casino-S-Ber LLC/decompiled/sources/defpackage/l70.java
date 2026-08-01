package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l70 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final we b;
    public volatile int c = 0;

    public l70(we weVar, int i) {
        this.b = weVar;
        this.a = i;
    }

    public final int a(int i) {
        gu b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final gu b() {
        ThreadLocal threadLocal = d;
        gu guVar = (gu) threadLocal.get();
        if (guVar == null) {
            guVar = new gu();
            threadLocal.set(guVar);
        }
        hu huVar = (hu) this.b.f;
        int a = huVar.a(6);
        if (a != 0) {
            int i = a + huVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) huVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) huVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) huVar.d;
            guVar.d = byteBuffer;
            if (byteBuffer != null) {
                guVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                guVar.b = i4;
                guVar.c = ((ByteBuffer) guVar.d).getShort(i4);
                return guVar;
            }
            guVar.a = 0;
            guVar.b = 0;
            guVar.c = 0;
        }
        return guVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        gu b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        gu b2 = b();
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

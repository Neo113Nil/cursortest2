package k1;

import java.nio.ByteBuffer;
import l1.C0820a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f7408d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f7409a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.b f7410b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f7411c = 0;

    public q(Y0.b bVar, int i2) {
        this.f7410b = bVar;
        this.f7409a = i2;
    }

    public final int a(int i2) {
        C0820a c4 = c();
        int b4 = c4.b(16);
        if (b4 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c4.f838j;
        int i4 = b4 + c4.f835d;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final int b() {
        C0820a c4 = c();
        int b4 = c4.b(16);
        if (b4 == 0) {
            return 0;
        }
        int i2 = b4 + c4.f835d;
        return ((ByteBuffer) c4.f838j).getInt(((ByteBuffer) c4.f838j).getInt(i2) + i2);
    }

    public final C0820a c() {
        ThreadLocal threadLocal = f7408d;
        C0820a c0820a = (C0820a) threadLocal.get();
        if (c0820a == null) {
            c0820a = new C0820a();
            threadLocal.set(c0820a);
        }
        l1.b bVar = (l1.b) this.f7410b.f4390i;
        int b4 = bVar.b(6);
        if (b4 != 0) {
            int i2 = b4 + bVar.f835d;
            int i4 = (this.f7409a * 4) + ((ByteBuffer) bVar.f838j).getInt(i2) + i2 + 4;
            int i5 = ((ByteBuffer) bVar.f838j).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f838j;
            c0820a.f838j = byteBuffer;
            if (byteBuffer != null) {
                c0820a.f835d = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                c0820a.f836e = i6;
                c0820a.f837i = ((ByteBuffer) c0820a.f838j).getShort(i6);
            } else {
                c0820a.f835d = 0;
                c0820a.f836e = 0;
                c0820a.f837i = 0;
            }
        }
        return c0820a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0820a c4 = c();
        int b4 = c4.b(4);
        sb.append(Integer.toHexString(b4 != 0 ? ((ByteBuffer) c4.f838j).getInt(b4 + c4.f835d) : 0));
        sb.append(", codepoints:");
        int b5 = b();
        for (int i2 = 0; i2 < b5; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

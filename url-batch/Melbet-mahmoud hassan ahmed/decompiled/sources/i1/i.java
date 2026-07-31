package i1;

import java.nio.ByteBuffer;
import r0.s1;
import t0.e0;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private long f16931a;

    /* renamed from: b, reason: collision with root package name */
    private long f16932b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16933c;

    i() {
    }

    private long a(long j7) {
        return this.f16931a + Math.max(0L, ((this.f16932b - 529) * 1000000) / j7);
    }

    public long b(s1 s1Var) {
        return a(s1Var.E);
    }

    public void c() {
        this.f16931a = 0L;
        this.f16932b = 0L;
        this.f16933c = false;
    }

    public long d(s1 s1Var, u0.g gVar) {
        if (this.f16932b == 0) {
            this.f16931a = gVar.f22413j;
        }
        if (this.f16933c) {
            return gVar.f22413j;
        }
        ByteBuffer byteBuffer = (ByteBuffer) o2.a.e(gVar.f22411h);
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            i7 = (i7 << 8) | (byteBuffer.get(i8) & 255);
        }
        int m7 = e0.m(i7);
        if (m7 != -1) {
            long a7 = a(s1Var.E);
            this.f16932b += m7;
            return a7;
        }
        this.f16933c = true;
        this.f16932b = 0L;
        this.f16931a = gVar.f22413j;
        o2.r.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f22413j;
    }
}

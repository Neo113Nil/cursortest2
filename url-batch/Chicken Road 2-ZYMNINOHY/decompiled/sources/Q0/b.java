package Q0;

import java.util.ArrayDeque;
import t1.h;
import y0.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2125a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2126b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final g f2127c = new g();

    /* renamed from: d, reason: collision with root package name */
    public h f2128d;

    /* renamed from: e, reason: collision with root package name */
    public int f2129e;

    /* renamed from: f, reason: collision with root package name */
    public int f2130f;

    /* renamed from: g, reason: collision with root package name */
    public long f2131g;

    public final long a(o oVar, int i4) {
        oVar.readFully(this.f2125a, 0, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 8) | (r0[i5] & 255);
        }
        return j4;
    }
}

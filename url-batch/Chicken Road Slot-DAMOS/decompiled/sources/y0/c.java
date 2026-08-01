package y0;

import s.d0;
import s.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f10572e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10573i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10571d = true;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f10574r = new h0();

    public final void a() {
        h0 h0Var = this.f10574r;
        Object[] objArr = h0Var.f8314c;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i11];
                            if (obj instanceof d0) {
                                d0 d0Var = (d0) obj;
                                Object[] objArr2 = d0Var.f8284a;
                                int i12 = d0Var.f8285b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    Object obj2 = objArr2[i13];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        h0Var.a();
    }
}

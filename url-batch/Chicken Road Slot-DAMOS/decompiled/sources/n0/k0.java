package n0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6731b;

    /* renamed from: c, reason: collision with root package name */
    public int f6732c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6733d;

    /* renamed from: e, reason: collision with root package name */
    public final s.w f6734e;

    /* renamed from: f, reason: collision with root package name */
    public final hd.q f6735f;

    public k0(int i3, ArrayList arrayList) {
        this.f6730a = arrayList;
        this.f6731b = i3;
        if (i3 < 0) {
            n1.a("Invalid start index");
        }
        this.f6733d = new ArrayList();
        s.w wVar = new s.w();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            q0.e eVar = (q0.e) this.f6730a.get(i11);
            int i12 = eVar.f7730c;
            int i13 = eVar.f7731d;
            wVar.h(i12, new p0.a(i11, i10, i13));
            i10 += i13;
        }
        this.f6734e = wVar;
        this.f6735f = hd.h.b(new f9.d(1, this));
    }

    public final boolean a(int i3, int i10) {
        int i11;
        s.w wVar = this.f6734e;
        p0.a aVar = (p0.a) wVar.b(i3);
        if (aVar == null) {
            return false;
        }
        int i12 = aVar.f7592b;
        int i13 = i10 - aVar.f7593c;
        aVar.f7593c = i10;
        if (i13 == 0) {
            return true;
        }
        Object[] objArr = wVar.f8338c;
        long[] jArr = wVar.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j = jArr[i14];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j) < 128) {
                        p0.a aVar2 = (p0.a) objArr[(i14 << 3) + i16];
                        if (aVar2.f7592b >= i12 && !aVar2.equals(aVar) && (i11 = aVar2.f7592b + i13) >= 0) {
                            aVar2.f7592b = i11;
                        }
                    }
                    j >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }
}

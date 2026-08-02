package u0;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: g, reason: collision with root package name */
    public static final B.c f15496g = new B.c(15);

    /* renamed from: h, reason: collision with root package name */
    public static final B.c f15497h = new B.c(16);

    /* renamed from: d, reason: collision with root package name */
    public int f15501d;

    /* renamed from: e, reason: collision with root package name */
    public int f15502e;

    /* renamed from: f, reason: collision with root package name */
    public int f15503f;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f15499b = new r[5];

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15498a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f15500c = -1;

    public final void a(float f4, int i4) {
        r rVar;
        int i5 = this.f15500c;
        ArrayList arrayList = this.f15498a;
        if (i5 != 1) {
            Collections.sort(arrayList, f15496g);
            this.f15500c = 1;
        }
        int i6 = this.f15503f;
        r[] rVarArr = this.f15499b;
        if (i6 > 0) {
            int i7 = i6 - 1;
            this.f15503f = i7;
            rVar = rVarArr[i7];
        } else {
            rVar = new r();
        }
        int i8 = this.f15501d;
        this.f15501d = i8 + 1;
        rVar.f15493a = i8;
        rVar.f15494b = i4;
        rVar.f15495c = f4;
        arrayList.add(rVar);
        this.f15502e += i4;
        while (true) {
            int i9 = this.f15502e;
            if (i9 <= 2000) {
                return;
            }
            int i10 = i9 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i11 = rVar2.f15494b;
            if (i11 <= i10) {
                this.f15502e -= i11;
                arrayList.remove(0);
                int i12 = this.f15503f;
                if (i12 < 5) {
                    this.f15503f = i12 + 1;
                    rVarArr[i12] = rVar2;
                }
            } else {
                rVar2.f15494b = i11 - i10;
                this.f15502e -= i10;
            }
        }
    }

    public final float b() {
        int i4 = this.f15500c;
        ArrayList arrayList = this.f15498a;
        if (i4 != 0) {
            Collections.sort(arrayList, f15497h);
            this.f15500c = 0;
        }
        float f4 = 0.5f * this.f15502e;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            r rVar = (r) arrayList.get(i6);
            i5 += rVar.f15494b;
            if (i5 >= f4) {
                return rVar.f15495c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) arrayList.get(arrayList.size() - 1)).f15495c;
    }
}

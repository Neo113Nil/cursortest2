package f1;

import java.util.ArrayList;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3116a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3117b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3118c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3119d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3120e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3121f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3122g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3123h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3124i;

    /* renamed from: j, reason: collision with root package name */
    public final d f3125j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3126k;

    public e(String str, float f9, float f10, float f11, float f12, long j8, int i7, boolean z8, int i8) {
        str = (i8 & 1) != 0 ? "" : str;
        long j9 = (i8 & 32) != 0 ? z0.u.f10057g : j8;
        int i9 = (i8 & 64) != 0 ? 5 : i7;
        this.f3116a = str;
        this.f3117b = f9;
        this.f3118c = f10;
        this.f3119d = f11;
        this.f3120e = f12;
        this.f3121f = j9;
        this.f3122g = i9;
        this.f3123h = z8;
        ArrayList arrayList = new ArrayList();
        this.f3124i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f3125j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, r0 r0Var) {
        if (eVar.f3126k) {
            a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((d) eVar.f3124i.get(r0.size() - 1)).f3114j.add(new l0("", arrayList, 0, r0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f3126k) {
            a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f3124i;
            if (arrayList.size() <= 1) {
                d dVar = this.f3125j;
                f fVar = new f(this.f3116a, this.f3117b, this.f3118c, this.f3119d, this.f3120e, new h0(dVar.f3105a, dVar.f3106b, dVar.f3107c, dVar.f3108d, dVar.f3109e, dVar.f3110f, dVar.f3111g, dVar.f3112h, dVar.f3113i, dVar.f3114j), this.f3121f, this.f3122g, this.f3123h);
                this.f3126k = true;
                return fVar;
            }
            if (this.f3126k) {
                a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) arrayList.get(arrayList.size() - 1)).f3114j.add(new h0(dVar2.f3105a, dVar2.f3106b, dVar2.f3107c, dVar2.f3108d, dVar2.f3109e, dVar2.f3110f, dVar2.f3111g, dVar2.f3112h, dVar2.f3113i, dVar2.f3114j));
        }
    }
}

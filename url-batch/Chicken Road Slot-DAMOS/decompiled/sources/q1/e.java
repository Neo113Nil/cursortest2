package q1;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f7827a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7828b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7829c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7830d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7831e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7832f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7833h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7834i;
    public final d j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7835k;

    public e(float f3, float f10, float f11, float f12, long j, int i3, boolean z10, int i10) {
        String str = (i10 & 1) != 0 ? "" : "Filled.Refresh";
        long j3 = (i10 & 32) != 0 ? k1.p.g : j;
        int i11 = (i10 & 64) != 0 ? 5 : i3;
        this.f7827a = str;
        this.f7828b = f3;
        this.f7829c = f10;
        this.f7830d = f11;
        this.f7831e = f12;
        this.f7832f = j3;
        this.g = i11;
        this.f7833h = z10;
        ArrayList arrayList = new ArrayList();
        this.f7834i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = dVar;
        arrayList.add(dVar);
    }

    public final f a() {
        if (this.f7835k) {
            z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f7834i;
            if (arrayList.size() <= 1) {
                d dVar = this.j;
                f fVar = new f(this.f7827a, this.f7828b, this.f7829c, this.f7830d, this.f7831e, new f0(dVar.f7817a, dVar.f7818b, dVar.f7819c, dVar.f7820d, dVar.f7821e, dVar.f7822f, dVar.g, dVar.f7823h, dVar.f7824i, dVar.j), this.f7832f, this.g, this.f7833h);
                this.f7835k = true;
                return fVar;
            }
            if (this.f7835k) {
                z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) arrayList.get(arrayList.size() - 1)).j.add(new f0(dVar2.f7817a, dVar2.f7818b, dVar2.f7819c, dVar2.f7820d, dVar2.f7821e, dVar2.f7822f, dVar2.g, dVar2.f7823h, dVar2.f7824i, dVar2.j));
        }
    }
}

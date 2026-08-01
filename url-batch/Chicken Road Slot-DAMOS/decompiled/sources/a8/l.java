package a8;

import c7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f356a;

    /* renamed from: b, reason: collision with root package name */
    public int f357b;

    /* renamed from: c, reason: collision with root package name */
    public Object f358c;

    /* renamed from: d, reason: collision with root package name */
    public Object f359d;

    public static l b() {
        l lVar = new l();
        lVar.f356a = true;
        lVar.f357b = 0;
        return lVar;
    }

    public l a() {
        c0.a("execute parameter required", ((b7.i) this.f358c) != null);
        z6.d[] dVarArr = (z6.d[]) this.f359d;
        boolean z10 = this.f356a;
        int i3 = this.f357b;
        l lVar = new l();
        lVar.f359d = this;
        lVar.f358c = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        lVar.f356a = z11;
        lVar.f357b = i3;
        return lVar;
    }
}

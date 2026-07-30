package h4;

import s1.InterfaceC0875f;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5278a;

    /* renamed from: b, reason: collision with root package name */
    public int f5279b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5280c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5281d;

    public w a() {
        t1.u.a("execute parameter required", ((InterfaceC0875f) this.f5280c) != null);
        q1.d[] dVarArr = (q1.d[]) this.f5281d;
        boolean z7 = this.f5278a;
        int i2 = this.f5279b;
        w wVar = new w();
        wVar.f5281d = this;
        wVar.f5280c = dVarArr;
        boolean z8 = false;
        if (dVarArr != null && z7) {
            z8 = true;
        }
        wVar.f5278a = z8;
        wVar.f5279b = i2;
        return wVar;
    }
}

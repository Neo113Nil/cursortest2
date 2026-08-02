package c2;

import a2.C0164d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public C0164d[] f5675a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5676b;

    /* renamed from: c, reason: collision with root package name */
    public int f5677c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5678d;

    public i a() {
        if (!(((h) this.f5678d) != null)) {
            throw new IllegalArgumentException("execute parameter required");
        }
        C0164d[] c0164dArr = this.f5675a;
        boolean z = this.f5676b;
        int i4 = this.f5677c;
        i iVar = new i();
        iVar.f5678d = this;
        iVar.f5675a = c0164dArr;
        boolean z4 = false;
        if (c0164dArr != null && z) {
            z4 = true;
        }
        iVar.f5676b = z4;
        iVar.f5677c = i4;
        return iVar;
    }
}

package androidx.lifecycle;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f2376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.k f2377b;

    public C0162d(O1.k kVar, i iVar) {
        this.f2376a = iVar;
        this.f2377b = kVar;
    }

    @Override // androidx.lifecycle.l
    public final void a(m mVar, EnumC0165g enumC0165g) {
        if (enumC0165g == EnumC0165g.ON_START) {
            this.f2376a.b(this);
            this.f2377b.d();
        }
    }
}

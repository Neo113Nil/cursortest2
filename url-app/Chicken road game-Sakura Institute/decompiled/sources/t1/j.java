package t1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j extends s1.w {

    /* renamed from: f, reason: collision with root package name */
    public final i f10656f;

    /* renamed from: g, reason: collision with root package name */
    public final O.a f10657g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f10658h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f10659i;

    /* renamed from: j, reason: collision with root package name */
    public Function1 f10660j;

    /* renamed from: k, reason: collision with root package name */
    public Function1 f10661k;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f10662l;

    public j(i iVar, String str, O.a aVar) {
        super(iVar, str);
        this.f10656f = iVar;
        this.f10657g = aVar;
    }

    @Override // s1.w
    public final s1.v a() {
        h hVar = (h) super.a();
        hVar.f10650p = this.f10658h;
        hVar.f10651q = this.f10659i;
        hVar.f10652r = this.f10660j;
        hVar.f10653s = this.f10661k;
        hVar.f10654t = this.f10662l;
        return hVar;
    }

    @Override // s1.w
    public final s1.v b() {
        return new h(this.f10656f, this.f10657g);
    }
}

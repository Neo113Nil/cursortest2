package g2;

import j2.C0715e;
import java.util.ArrayList;
import o2.C0924c;

/* loaded from: classes.dex */
public final class o extends u3.d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o2.s f6733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y.t f6734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h2.d f6735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f6737l;

    public o(s sVar, o2.s sVar2, y.t tVar, h2.d dVar, ArrayList arrayList) {
        super(22);
        this.f6737l = sVar;
        this.f6733h = sVar2;
        this.f6734i = tVar;
        this.f6735j = dVar;
        this.f6736k = arrayList;
    }

    @Override // u3.d
    public final void V(Object obj, Object obj2) {
        C0924c c0924c = (C0924c) obj;
        C0715e c0715e = (C0715e) obj2;
        o2.s sVar = this.f6733h;
        o2.s b4 = sVar != null ? sVar.b(c0924c) : null;
        y.t tVar = this.f6734i;
        y.t tVar2 = new y.t(((e) tVar.f11494e).j(c0924c), 25, (x) tVar.f11495i);
        h2.d a4 = this.f6735j.a(c0924c);
        if (a4 != null) {
            this.f6736k.addAll(this.f6737l.j(a4, c0715e, b4, tVar2));
        }
    }
}

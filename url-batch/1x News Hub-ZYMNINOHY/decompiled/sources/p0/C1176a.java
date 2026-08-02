package p0;

import E1.AbstractActivityC0029e;
import F1.c;
import P1.o;
import android.content.Context;
import f0.C0322a;
import java.util.HashSet;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176a implements L1.b, M1.a {

    /* renamed from: a, reason: collision with root package name */
    public C1177b f10210a;

    /* renamed from: b, reason: collision with root package name */
    public o f10211b;

    /* renamed from: c, reason: collision with root package name */
    public M1.b f10212c;

    @Override // M1.a
    public final void onAttachedToActivity(M1.b bVar) {
        c cVar = (c) bVar;
        AbstractActivityC0029e abstractActivityC0029e = (AbstractActivityC0029e) cVar.f486a;
        C1177b c1177b = this.f10210a;
        if (c1177b != null) {
            c1177b.f10215c = abstractActivityC0029e;
        }
        this.f10212c = bVar;
        ((HashSet) cVar.f488c).add(c1177b);
        M1.b bVar2 = this.f10212c;
        ((HashSet) ((c) bVar2).f487b).add(this.f10210a);
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        Context context = aVar.f887a;
        this.f10210a = new C1177b(context);
        o oVar = new o(aVar.f888b, "flutter.baseflow.com/permissions/methods");
        this.f10211b = oVar;
        oVar.b(new C0322a(context, new m1.c(), this.f10210a, new m1.c()));
    }

    @Override // M1.a
    public final void onDetachedFromActivity() {
        C1177b c1177b = this.f10210a;
        if (c1177b != null) {
            c1177b.f10215c = null;
        }
        M1.b bVar = this.f10212c;
        if (bVar != null) {
            ((HashSet) ((c) bVar).f488c).remove(c1177b);
            M1.b bVar2 = this.f10212c;
            ((HashSet) ((c) bVar2).f487b).remove(this.f10210a);
        }
        this.f10212c = null;
    }

    @Override // M1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        this.f10211b.b(null);
        this.f10211b = null;
    }

    @Override // M1.a
    public final void onReattachedToActivityForConfigChanges(M1.b bVar) {
        onAttachedToActivity(bVar);
    }
}

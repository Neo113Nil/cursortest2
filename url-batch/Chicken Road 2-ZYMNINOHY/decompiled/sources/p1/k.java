package p1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f14763e;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f14763e = mVar;
        this.f14759a = obj;
        this.f14760b = arrayList;
        this.f14761c = obj2;
        this.f14762d = arrayList2;
    }

    @Override // p1.p
    public final void a(q qVar) {
        qVar.w(this);
    }

    @Override // p1.r, p1.p
    public final void e(q qVar) {
        m mVar = this.f14763e;
        Object obj = this.f14759a;
        if (obj != null) {
            mVar.t(obj, this.f14760b, null);
        }
        Object obj2 = this.f14761c;
        if (obj2 != null) {
            mVar.t(obj2, this.f14762d, null);
        }
    }
}

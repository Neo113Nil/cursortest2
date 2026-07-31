package R;

import I.I;
import S.t;
import java.util.Map;
import l.C0568m;
import q1.C0784h;
import r1.p;

/* loaded from: classes.dex */
public final class g implements I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3148d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i3) {
        this.f3145a = i3;
        this.f3147c = obj;
        this.f3148d = obj2;
        this.f3146b = obj3;
    }

    @Override // I.I
    public final void a() {
        switch (this.f3145a) {
            case 0:
                i iVar = (i) this.f3148d;
                Map map = iVar.f3154a;
                f fVar = (f) this.f3147c;
                if (fVar.f3143b) {
                    Map b2 = fVar.f3144c.b();
                    boolean isEmpty = b2.isEmpty();
                    Object obj = fVar.f3142a;
                    if (isEmpty) {
                        map.remove(obj);
                    } else {
                        map.put(obj, b2);
                    }
                }
                iVar.f3155b.remove(this.f3146b);
                break;
            case 1:
                t tVar = (t) this.f3147c;
                Object obj2 = this.f3146b;
                tVar.remove(obj2);
                ((C0568m) this.f3148d).f5482d.g(obj2);
                break;
            default:
                p pVar = (p) this.f3147c;
                C0784h c0784h = (C0784h) this.f3148d;
                pVar.b().b(c0784h);
                ((t) this.f3146b).remove(c0784h);
                break;
        }
    }

    public g(t tVar, Object obj, C0568m c0568m) {
        this.f3145a = 1;
        this.f3147c = tVar;
        this.f3146b = obj;
        this.f3148d = c0568m;
    }
}

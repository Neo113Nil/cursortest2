package P;

import G.H;
import Q.v;
import java.util.Map;
import k.C0746l;
import s1.C1193i;
import t1.p;

/* loaded from: classes.dex */
public final class g implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3659d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i2) {
        this.f3656a = i2;
        this.f3658c = obj;
        this.f3659d = obj2;
        this.f3657b = obj3;
    }

    @Override // G.H
    public final void a() {
        switch (this.f3656a) {
            case 0:
                i iVar = (i) this.f3659d;
                Map map = iVar.f3665a;
                f fVar = (f) this.f3658c;
                if (fVar.f3654b) {
                    Map a4 = fVar.f3655c.a();
                    boolean isEmpty = a4.isEmpty();
                    Object obj = fVar.f3653a;
                    if (isEmpty) {
                        map.remove(obj);
                    } else {
                        map.put(obj, a4);
                    }
                }
                iVar.f3666b.remove(this.f3657b);
                break;
            case 1:
                v vVar = (v) this.f3658c;
                Object obj2 = this.f3657b;
                vVar.remove(obj2);
                ((C0746l) this.f3659d).f7303d.g(obj2);
                break;
            default:
                p pVar = (p) this.f3658c;
                C1193i c1193i = (C1193i) this.f3659d;
                pVar.b().b(c1193i);
                ((v) this.f3657b).remove(c1193i);
                break;
        }
    }

    public g(v vVar, Object obj, C0746l c0746l) {
        this.f3656a = 1;
        this.f3658c = vVar;
        this.f3657b = obj;
        this.f3659d = c0746l;
    }
}

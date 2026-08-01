package K;

import android.view.View;
import android.view.ViewGroup;
import c1.EnumC0088a;
import d1.AbstractC0099g;

/* loaded from: classes.dex */
public final class W extends AbstractC0099g implements j1.p, k1.d {

    /* renamed from: b, reason: collision with root package name */
    public final int f586b;

    /* renamed from: c, reason: collision with root package name */
    public int f587c;
    public /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(View view, b1.d dVar) {
        super(dVar);
        this.f588e = view;
        this.f586b = 2;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        W w2 = new W(this.f588e, dVar);
        w2.d = obj;
        return w2;
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((W) a((q1.e) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // k1.d
    public final int f() {
        return this.f586b;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        Object obj2;
        Object obj3 = EnumC0088a.f2060a;
        int i = this.f587c;
        View view = this.f588e;
        if (i == 0) {
            H1.l.h0(obj);
            q1.e eVar = (q1.e) this.d;
            this.d = eVar;
            this.f587c = 1;
            eVar.f3819b = view;
            eVar.f3818a = 3;
            eVar.d = this;
            return obj3;
        }
        Object obj4 = X0.g.f1277c;
        if (i == 1) {
            q1.e eVar2 = (q1.e) this.d;
            H1.l.h0(obj);
            if (view instanceof ViewGroup) {
                this.d = null;
                this.f587c = 2;
                eVar2.getClass();
                C0025v c0025v = new C0025v(new V(0, (ViewGroup) view));
                if (c0025v.f665b.hasNext()) {
                    eVar2.f3820c = c0025v;
                    eVar2.f3818a = 2;
                    eVar2.d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.l.h0(obj);
        }
        return obj4;
    }

    @Override // d1.AbstractC0093a
    public final String toString() {
        if (this.f2472a != null) {
            return super.toString();
        }
        k1.i.f3246a.getClass();
        String a2 = k1.j.a(this);
        k1.e.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}

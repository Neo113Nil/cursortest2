package p1;

import android.view.View;

/* loaded from: classes.dex */
public final class g extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14754a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14755b;

    public /* synthetic */ g() {
        this.f14754a = 2;
    }

    @Override // p1.p
    public final void a(q qVar) {
        switch (this.f14754a) {
            case 0:
                View view = (View) this.f14755b;
                A a3 = y.f14807a;
                a3.w(view, 1.0f);
                a3.getClass();
                qVar.w(this);
                break;
            case 1:
                ((q) this.f14755b).z();
                qVar.w(this);
                break;
            default:
                v vVar = (v) this.f14755b;
                int i4 = vVar.f14799x - 1;
                vVar.f14799x = i4;
                if (i4 == 0) {
                    vVar.f14800y = false;
                    vVar.n();
                }
                qVar.w(this);
                break;
        }
    }

    @Override // p1.r, p1.p
    public void e(q qVar) {
        switch (this.f14754a) {
            case 2:
                v vVar = (v) this.f14755b;
                if (!vVar.f14800y) {
                    vVar.F();
                    vVar.f14800y = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g(int i4, Object obj) {
        this.f14754a = i4;
        this.f14755b = obj;
    }
}

package s7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u1 implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9042e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f9043i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f9044r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w1 f9045s;

    public /* synthetic */ u1(w1 w1Var, String str, String str2, String str3, int i3) {
        this.f9041d = i3;
        this.f9042e = str;
        this.f9043i = str2;
        this.f9044r = str3;
        this.f9045s = w1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9041d) {
            case 0:
                w1 w1Var = this.f9045s;
                w1Var.f9082d.V();
                m mVar = w1Var.f9082d.f8762i;
                j4.T(mVar);
                return mVar.q0(this.f9042e, this.f9043i, this.f9044r);
            case 1:
                w1 w1Var2 = this.f9045s;
                w1Var2.f9082d.V();
                m mVar2 = w1Var2.f9082d.f8762i;
                j4.T(mVar2);
                return mVar2.q0(this.f9042e, this.f9043i, this.f9044r);
            case 2:
                w1 w1Var3 = this.f9045s;
                w1Var3.f9082d.V();
                m mVar3 = w1Var3.f9082d.f8762i;
                j4.T(mVar3);
                return mVar3.u0(this.f9042e, this.f9043i, this.f9044r);
            default:
                w1 w1Var4 = this.f9045s;
                w1Var4.f9082d.V();
                m mVar4 = w1Var4.f9082d.f8762i;
                j4.T(mVar4);
                return mVar4.u0(this.f9042e, this.f9043i, this.f9044r);
        }
    }
}

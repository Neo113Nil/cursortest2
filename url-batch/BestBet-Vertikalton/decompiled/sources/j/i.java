package j;

import l.c1;

/* loaded from: classes.dex */
public final class i extends H1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3068a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3069b;

    /* renamed from: c, reason: collision with root package name */
    public int f3070c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f3068a = 0;
        this.d = jVar;
        this.f3069b = false;
        this.f3070c = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f3068a) {
            case 0:
                int i = this.f3070c + 1;
                this.f3070c = i;
                j jVar = (j) this.d;
                if (i == jVar.f3071a.size()) {
                    H1.l lVar = jVar.d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f3070c = 0;
                    this.f3069b = false;
                    jVar.f3074e = false;
                    break;
                }
                break;
            default:
                if (!this.f3069b) {
                    ((c1) this.d).f3374a.setVisibility(this.f3070c);
                    break;
                }
                break;
        }
    }

    @Override // H1.l, K.a0
    public void d() {
        switch (this.f3068a) {
            case 1:
                this.f3069b = true;
                break;
        }
    }

    @Override // H1.l, K.a0
    public final void g() {
        switch (this.f3068a) {
            case 0:
                if (!this.f3069b) {
                    this.f3069b = true;
                    H1.l lVar = ((j) this.d).d;
                    if (lVar != null) {
                        lVar.g();
                        break;
                    }
                }
                break;
            default:
                ((c1) this.d).f3374a.setVisibility(0);
                break;
        }
    }

    public i(c1 c1Var, int i) {
        this.f3068a = 1;
        this.d = c1Var;
        this.f3070c = i;
        this.f3069b = false;
    }
}

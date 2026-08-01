package k;

import m.j1;

/* loaded from: classes.dex */
public final class i extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2723a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2724b;

    /* renamed from: c, reason: collision with root package name */
    public int f2725c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2723a = 0;
        this.d = jVar;
        this.f2724b = false;
        this.f2725c = 0;
    }

    @Override // L.d0
    public final void a() {
        switch (this.f2723a) {
            case 0:
                int i = this.f2725c + 1;
                this.f2725c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2726a.size()) {
                    A1.m mVar = jVar.d;
                    if (mVar != null) {
                        mVar.a();
                    }
                    this.f2725c = 0;
                    this.f2724b = false;
                    jVar.f2729e = false;
                    break;
                }
                break;
            default:
                if (!this.f2724b) {
                    ((j1) this.d).f3110a.setVisibility(this.f2725c);
                    break;
                }
                break;
        }
    }

    @Override // A1.m, L.d0
    public void b() {
        switch (this.f2723a) {
            case 1:
                this.f2724b = true;
                break;
        }
    }

    @Override // A1.m, L.d0
    public final void c() {
        switch (this.f2723a) {
            case 0:
                if (!this.f2724b) {
                    this.f2724b = true;
                    A1.m mVar = ((j) this.d).d;
                    if (mVar != null) {
                        mVar.c();
                        break;
                    }
                }
                break;
            default:
                ((j1) this.d).f3110a.setVisibility(0);
                break;
        }
    }

    public i(j1 j1Var, int i) {
        this.f2723a = 1;
        this.d = j1Var;
        this.f2725c = i;
        this.f2724b = false;
    }
}

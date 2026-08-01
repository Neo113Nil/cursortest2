package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2624a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2625b;

    /* renamed from: c, reason: collision with root package name */
    public int f2626c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2624a = 0;
        this.d = jVar;
        this.f2625b = false;
        this.f2626c = 0;
    }

    @Override // K.d0
    public final void a() {
        switch (this.f2624a) {
            case 0:
                int i = this.f2626c + 1;
                this.f2626c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2627a.size()) {
                    z1.d dVar = jVar.d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2626c = 0;
                    this.f2625b = false;
                    jVar.f2630e = false;
                    break;
                }
                break;
            default:
                if (!this.f2625b) {
                    ((d1) this.d).f2923a.setVisibility(this.f2626c);
                    break;
                }
                break;
        }
    }

    @Override // z1.d, K.d0
    public void d() {
        switch (this.f2624a) {
            case 1:
                this.f2625b = true;
                break;
        }
    }

    @Override // z1.d, K.d0
    public final void g() {
        switch (this.f2624a) {
            case 0:
                if (!this.f2625b) {
                    this.f2625b = true;
                    z1.d dVar = ((j) this.d).d;
                    if (dVar != null) {
                        dVar.g();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f2923a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2624a = 1;
        this.d = d1Var;
        this.f2626c = i;
        this.f2625b = false;
    }
}

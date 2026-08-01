package l;

import n.i1;

/* loaded from: classes.dex */
public final class i extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3238b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3239c;

    /* renamed from: d, reason: collision with root package name */
    public int f3240d;
    public final /* synthetic */ Object e;

    public i(j jVar) {
        this.f3238b = 0;
        this.e = jVar;
        this.f3239c = false;
        this.f3240d = 0;
    }

    @Override // M.X
    public final void a() {
        switch (this.f3238b) {
            case 0:
                int i = this.f3240d + 1;
                this.f3240d = i;
                j jVar = (j) this.e;
                if (i == jVar.f3241a.size()) {
                    H1.d dVar = jVar.f3244d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f3240d = 0;
                    this.f3239c = false;
                    jVar.e = false;
                    break;
                }
                break;
            default:
                if (!this.f3239c) {
                    ((i1) this.e).f3637a.setVisibility(this.f3240d);
                    break;
                }
                break;
        }
    }

    @Override // H1.d, M.X
    public void d() {
        switch (this.f3238b) {
            case 1:
                this.f3239c = true;
                break;
        }
    }

    @Override // H1.d, M.X
    public final void g() {
        switch (this.f3238b) {
            case 0:
                if (!this.f3239c) {
                    this.f3239c = true;
                    H1.d dVar = ((j) this.e).f3244d;
                    if (dVar != null) {
                        dVar.g();
                        break;
                    }
                }
                break;
            default:
                ((i1) this.e).f3637a.setVisibility(0);
                break;
        }
    }

    public i(i1 i1Var, int i) {
        this.f3238b = 1;
        this.e = i1Var;
        this.f3240d = i;
        this.f3239c = false;
    }
}

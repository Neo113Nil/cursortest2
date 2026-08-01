package j;

import l.c1;

/* loaded from: classes.dex */
public final class i extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2639e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2640f;

    /* renamed from: g, reason: collision with root package name */
    public int f2641g;
    public final /* synthetic */ Object h;

    public i(j jVar) {
        this.f2639e = 0;
        this.h = jVar;
        this.f2640f = false;
        this.f2641g = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f2639e) {
            case 0:
                int i = this.f2641g + 1;
                this.f2641g = i;
                j jVar = (j) this.h;
                if (i == jVar.f2642a.size()) {
                    A.c cVar = jVar.d;
                    if (cVar != null) {
                        cVar.a();
                    }
                    this.f2641g = 0;
                    this.f2640f = false;
                    jVar.f2645e = false;
                    break;
                }
                break;
            default:
                if (!this.f2640f) {
                    ((c1) this.h).f2953a.setVisibility(this.f2641g);
                    break;
                }
                break;
        }
    }

    @Override // A.c, K.a0
    public void b() {
        switch (this.f2639e) {
            case 1:
                this.f2640f = true;
                break;
        }
    }

    @Override // A.c, K.a0
    public final void c() {
        switch (this.f2639e) {
            case 0:
                if (!this.f2640f) {
                    this.f2640f = true;
                    A.c cVar = ((j) this.h).d;
                    if (cVar != null) {
                        cVar.c();
                        break;
                    }
                }
                break;
            default:
                ((c1) this.h).f2953a.setVisibility(0);
                break;
        }
    }

    public i(c1 c1Var, int i) {
        this.f2639e = 1;
        this.h = c1Var;
        this.f2641g = i;
        this.f2640f = false;
    }
}

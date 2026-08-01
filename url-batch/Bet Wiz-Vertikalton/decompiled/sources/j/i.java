package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends x1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2573a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2574b;

    /* renamed from: c, reason: collision with root package name */
    public int f2575c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2573a = 0;
        this.d = jVar;
        this.f2574b = false;
        this.f2575c = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f2573a) {
            case 0:
                int i = this.f2575c + 1;
                this.f2575c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2576a.size()) {
                    x1.l lVar = jVar.d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f2575c = 0;
                    this.f2574b = false;
                    jVar.f2579e = false;
                    break;
                }
                break;
            default:
                if (!this.f2574b) {
                    ((d1) this.d).f2959a.setVisibility(this.f2575c);
                    break;
                }
                break;
        }
    }

    @Override // x1.l, K.a0
    public void b() {
        switch (this.f2573a) {
            case 1:
                this.f2574b = true;
                break;
        }
    }

    @Override // x1.l, K.a0
    public final void c() {
        switch (this.f2573a) {
            case 0:
                if (!this.f2574b) {
                    this.f2574b = true;
                    x1.l lVar = ((j) this.d).d;
                    if (lVar != null) {
                        lVar.c();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f2959a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2573a = 1;
        this.d = d1Var;
        this.f2575c = i;
        this.f2574b = false;
    }
}

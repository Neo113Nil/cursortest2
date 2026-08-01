package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2572a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2573b;

    /* renamed from: c, reason: collision with root package name */
    public int f2574c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2572a = 0;
        this.d = jVar;
        this.f2573b = false;
        this.f2574c = 0;
    }

    @Override // K.b0
    public final void a() {
        switch (this.f2572a) {
            case 0:
                int i = this.f2574c + 1;
                this.f2574c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2575a.size()) {
                    q1.l lVar = jVar.d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f2574c = 0;
                    this.f2573b = false;
                    jVar.f2578e = false;
                    break;
                }
                break;
            default:
                if (!this.f2573b) {
                    ((d1) this.d).f2952a.setVisibility(this.f2574c);
                    break;
                }
                break;
        }
    }

    @Override // q1.l, K.b0
    public void b() {
        switch (this.f2572a) {
            case 1:
                this.f2573b = true;
                break;
        }
    }

    @Override // q1.l, K.b0
    public final void c() {
        switch (this.f2572a) {
            case 0:
                if (!this.f2573b) {
                    this.f2573b = true;
                    q1.l lVar = ((j) this.d).d;
                    if (lVar != null) {
                        lVar.c();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f2952a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2572a = 1;
        this.d = d1Var;
        this.f2574c = i;
        this.f2573b = false;
    }
}

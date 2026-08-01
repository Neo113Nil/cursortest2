package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2595b;

    /* renamed from: c, reason: collision with root package name */
    public int f2596c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2594a = 0;
        this.d = jVar;
        this.f2595b = false;
        this.f2596c = 0;
    }

    @Override // K.b0
    public final void a() {
        switch (this.f2594a) {
            case 0:
                int i = this.f2596c + 1;
                this.f2596c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2597a.size()) {
                    q1.l lVar = jVar.d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f2596c = 0;
                    this.f2595b = false;
                    jVar.f2600e = false;
                    break;
                }
                break;
            default:
                if (!this.f2595b) {
                    ((d1) this.d).f2974a.setVisibility(this.f2596c);
                    break;
                }
                break;
        }
    }

    @Override // q1.l, K.b0
    public void b() {
        switch (this.f2594a) {
            case 1:
                this.f2595b = true;
                break;
        }
    }

    @Override // q1.l, K.b0
    public final void c() {
        switch (this.f2594a) {
            case 0:
                if (!this.f2595b) {
                    this.f2595b = true;
                    q1.l lVar = ((j) this.d).d;
                    if (lVar != null) {
                        lVar.c();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f2974a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2594a = 1;
        this.d = d1Var;
        this.f2596c = i;
        this.f2595b = false;
    }
}

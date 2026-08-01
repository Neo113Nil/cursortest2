package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2586a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2587b;

    /* renamed from: c, reason: collision with root package name */
    public int f2588c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2586a = 0;
        this.d = jVar;
        this.f2587b = false;
        this.f2588c = 0;
    }

    @Override // K.d0
    public final void a() {
        switch (this.f2586a) {
            case 0:
                int i = this.f2588c + 1;
                this.f2588c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2589a.size()) {
                    w1.d dVar = jVar.d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2588c = 0;
                    this.f2587b = false;
                    jVar.f2592e = false;
                    break;
                }
                break;
            default:
                if (!this.f2587b) {
                    ((d1) this.d).f2898a.setVisibility(this.f2588c);
                    break;
                }
                break;
        }
    }

    @Override // w1.d, K.d0
    public void b() {
        switch (this.f2586a) {
            case 1:
                this.f2587b = true;
                break;
        }
    }

    @Override // w1.d, K.d0
    public final void c() {
        switch (this.f2586a) {
            case 0:
                if (!this.f2587b) {
                    this.f2587b = true;
                    w1.d dVar = ((j) this.d).d;
                    if (dVar != null) {
                        dVar.c();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f2898a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2586a = 1;
        this.d = d1Var;
        this.f2588c = i;
        this.f2587b = false;
    }
}

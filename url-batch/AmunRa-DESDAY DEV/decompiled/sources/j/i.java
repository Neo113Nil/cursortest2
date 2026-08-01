package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2517a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2518b;

    /* renamed from: c, reason: collision with root package name */
    public int f2519c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2517a = 0;
        this.d = jVar;
        this.f2518b = false;
        this.f2519c = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f2517a) {
            case 0:
                int i = this.f2519c + 1;
                this.f2519c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2520a.size()) {
                    s1.d dVar = jVar.d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2519c = 0;
                    this.f2518b = false;
                    jVar.f2523e = false;
                    break;
                }
                break;
            default:
                if (!this.f2518b) {
                    ((d1) this.d).f3052a.setVisibility(this.f2519c);
                    break;
                }
                break;
        }
    }

    @Override // s1.d, K.a0
    public void b() {
        switch (this.f2517a) {
            case 1:
                this.f2518b = true;
                break;
        }
    }

    @Override // s1.d, K.a0
    public final void c() {
        switch (this.f2517a) {
            case 0:
                if (!this.f2518b) {
                    this.f2518b = true;
                    s1.d dVar = ((j) this.d).d;
                    if (dVar != null) {
                        dVar.c();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f3052a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2517a = 1;
        this.d = d1Var;
        this.f2519c = i;
        this.f2518b = false;
    }
}

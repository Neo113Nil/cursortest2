package j;

import l.c1;

/* loaded from: classes.dex */
public final class i extends u1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2561c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f2562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2563f;

    public i(j jVar) {
        this.f2561c = 0;
        this.f2563f = jVar;
        this.d = false;
        this.f2562e = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f2561c) {
            case 0:
                int i = this.f2562e + 1;
                this.f2562e = i;
                j jVar = (j) this.f2563f;
                if (i == jVar.f2564a.size()) {
                    u1.d dVar = jVar.d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2562e = 0;
                    this.d = false;
                    jVar.f2567e = false;
                    break;
                }
                break;
            default:
                if (!this.d) {
                    ((c1) this.f2563f).f2938a.setVisibility(this.f2562e);
                    break;
                }
                break;
        }
    }

    @Override // u1.d, K.a0
    public void b() {
        switch (this.f2561c) {
            case 1:
                this.d = true;
                break;
        }
    }

    @Override // u1.d, K.a0
    public final void c() {
        switch (this.f2561c) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    u1.d dVar = ((j) this.f2563f).d;
                    if (dVar != null) {
                        dVar.c();
                        break;
                    }
                }
                break;
            default:
                ((c1) this.f2563f).f2938a.setVisibility(0);
                break;
        }
    }

    public i(c1 c1Var, int i) {
        this.f2561c = 1;
        this.f2563f = c1Var;
        this.f2562e = i;
        this.d = false;
    }
}

package j;

import l.e1;

/* loaded from: classes.dex */
public final class i extends u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2522a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2523b;

    /* renamed from: c, reason: collision with root package name */
    public int f2524c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2522a = 0;
        this.d = jVar;
        this.f2523b = false;
        this.f2524c = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f2522a) {
            case 0:
                int i = this.f2524c + 1;
                this.f2524c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2525a.size()) {
                    u1.d dVar = jVar.d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2524c = 0;
                    this.f2523b = false;
                    jVar.f2528e = false;
                    break;
                }
                break;
            default:
                if (!this.f2523b) {
                    ((e1) this.d).f2906a.setVisibility(this.f2524c);
                    break;
                }
                break;
        }
    }

    @Override // u1.d, K.a0
    public void b() {
        switch (this.f2522a) {
            case 1:
                this.f2523b = true;
                break;
        }
    }

    @Override // u1.d, K.a0
    public final void c() {
        switch (this.f2522a) {
            case 0:
                if (!this.f2523b) {
                    this.f2523b = true;
                    u1.d dVar = ((j) this.d).d;
                    if (dVar != null) {
                        dVar.c();
                        break;
                    }
                }
                break;
            default:
                ((e1) this.d).f2906a.setVisibility(0);
                break;
        }
    }

    public i(e1 e1Var, int i) {
        this.f2522a = 1;
        this.d = e1Var;
        this.f2524c = i;
        this.f2523b = false;
    }
}

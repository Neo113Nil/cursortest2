package j;

import l.e1;

/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152i extends z1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2670a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2671b;

    /* renamed from: c, reason: collision with root package name */
    public int f2672c;
    public final /* synthetic */ Object d;

    public C0152i(C0153j c0153j) {
        this.f2670a = 0;
        this.d = c0153j;
        this.f2671b = false;
        this.f2672c = 0;
    }

    @Override // M.Z
    public final void a() {
        switch (this.f2670a) {
            case 0:
                int i = this.f2672c + 1;
                this.f2672c = i;
                C0153j c0153j = (C0153j) this.d;
                if (i == c0153j.f2673a.size()) {
                    z1.l lVar = c0153j.d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f2672c = 0;
                    this.f2671b = false;
                    c0153j.f2676e = false;
                    break;
                }
                break;
            default:
                if (!this.f2671b) {
                    ((e1) this.d).f2979a.setVisibility(this.f2672c);
                    break;
                }
                break;
        }
    }

    @Override // z1.l, M.Z
    public void b() {
        switch (this.f2670a) {
            case 1:
                this.f2671b = true;
                break;
        }
    }

    @Override // z1.l, M.Z
    public final void g() {
        switch (this.f2670a) {
            case 0:
                if (!this.f2671b) {
                    this.f2671b = true;
                    z1.l lVar = ((C0153j) this.d).d;
                    if (lVar != null) {
                        lVar.g();
                        break;
                    }
                }
                break;
            default:
                ((e1) this.d).f2979a.setVisibility(0);
                break;
        }
    }

    public C0152i(e1 e1Var, int i) {
        this.f2670a = 1;
        this.d = e1Var;
        this.f2672c = i;
        this.f2671b = false;
    }
}

package j;

import l.d1;

/* loaded from: classes.dex */
public final class j extends q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2865b;

    /* renamed from: c, reason: collision with root package name */
    public int f2866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2867d;

    public j(k kVar) {
        this.f2864a = 0;
        this.f2867d = kVar;
        this.f2865b = false;
        this.f2866c = 0;
    }

    @Override // K.f0
    public final void a() {
        switch (this.f2864a) {
            case 0:
                int i = this.f2866c + 1;
                this.f2866c = i;
                k kVar = (k) this.f2867d;
                if (i == kVar.f2868a.size()) {
                    q1.d dVar = kVar.f2871d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2866c = 0;
                    this.f2865b = false;
                    kVar.f2872e = false;
                    break;
                }
                break;
            default:
                if (!this.f2865b) {
                    ((d1) this.f2867d).f3352a.setVisibility(this.f2866c);
                    break;
                }
                break;
        }
    }

    @Override // q1.d, K.f0
    public void b() {
        switch (this.f2864a) {
            case 1:
                this.f2865b = true;
                break;
        }
    }

    @Override // q1.d, K.f0
    public final void c() {
        switch (this.f2864a) {
            case 0:
                if (!this.f2865b) {
                    this.f2865b = true;
                    q1.d dVar = ((k) this.f2867d).f2871d;
                    if (dVar != null) {
                        dVar.c();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.f2867d).f3352a.setVisibility(0);
                break;
        }
    }

    public j(d1 d1Var, int i) {
        this.f2864a = 1;
        this.f2867d = d1Var;
        this.f2866c = i;
        this.f2865b = false;
    }
}

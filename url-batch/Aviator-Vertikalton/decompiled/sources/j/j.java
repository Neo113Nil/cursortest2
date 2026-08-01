package j;

import l.e1;

/* loaded from: classes.dex */
public final class j extends q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2860a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2861b;

    /* renamed from: c, reason: collision with root package name */
    public int f2862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2863d;

    public j(k kVar) {
        this.f2860a = 0;
        this.f2863d = kVar;
        this.f2861b = false;
        this.f2862c = 0;
    }

    @Override // K.f0
    public final void a() {
        switch (this.f2860a) {
            case 0:
                int i = this.f2862c + 1;
                this.f2862c = i;
                k kVar = (k) this.f2863d;
                if (i == kVar.f2864a.size()) {
                    q1.d dVar = kVar.f2867d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f2862c = 0;
                    this.f2861b = false;
                    kVar.f2868e = false;
                    break;
                }
                break;
            default:
                if (!this.f2861b) {
                    ((e1) this.f2863d).f3352a.setVisibility(this.f2862c);
                    break;
                }
                break;
        }
    }

    @Override // q1.d, K.f0
    public void b() {
        switch (this.f2860a) {
            case 1:
                this.f2861b = true;
                break;
        }
    }

    @Override // q1.d, K.f0
    public final void c() {
        switch (this.f2860a) {
            case 0:
                if (!this.f2861b) {
                    this.f2861b = true;
                    q1.d dVar = ((k) this.f2863d).f2867d;
                    if (dVar != null) {
                        dVar.c();
                        break;
                    }
                }
                break;
            default:
                ((e1) this.f2863d).f3352a.setVisibility(0);
                break;
        }
    }

    public j(e1 e1Var, int i) {
        this.f2860a = 1;
        this.f2863d = e1Var;
        this.f2862c = i;
        this.f2861b = false;
    }
}

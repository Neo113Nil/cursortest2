package u;

import t.C3423e;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3453h extends m {
    public C3453h(C3423e c3423e) {
        super(c3423e);
        c3423e.f46118e.f();
        c3423e.f46120f.f();
        this.f46363f = ((t.g) c3423e).G0();
    }

    private void q(C3451f c3451f) {
        this.f46365h.f46333k.add(c3451f);
        c3451f.f46334l.add(this.f46365h);
    }

    @Override // u.m, u.InterfaceC3449d
    public void a(InterfaceC3449d interfaceC3449d) {
        C3451f c3451f = this.f46365h;
        if (c3451f.f46325c && !c3451f.f46332j) {
            this.f46365h.d((int) ((((C3451f) c3451f.f46334l.get(0)).f46329g * ((t.g) this.f46359b).J0()) + 0.5f));
        }
    }

    @Override // u.m
    void d() {
        t.g gVar = (t.g) this.f46359b;
        int H02 = gVar.H0();
        int I02 = gVar.I0();
        gVar.J0();
        if (gVar.G0() == 1) {
            if (H02 != -1) {
                this.f46365h.f46334l.add(this.f46359b.f46097N.f46118e.f46365h);
                this.f46359b.f46097N.f46118e.f46365h.f46333k.add(this.f46365h);
                this.f46365h.f46328f = H02;
            } else if (I02 != -1) {
                this.f46365h.f46334l.add(this.f46359b.f46097N.f46118e.f46366i);
                this.f46359b.f46097N.f46118e.f46366i.f46333k.add(this.f46365h);
                this.f46365h.f46328f = -I02;
            } else {
                C3451f c3451f = this.f46365h;
                c3451f.f46324b = true;
                c3451f.f46334l.add(this.f46359b.f46097N.f46118e.f46366i);
                this.f46359b.f46097N.f46118e.f46366i.f46333k.add(this.f46365h);
            }
            q(this.f46359b.f46118e.f46365h);
            q(this.f46359b.f46118e.f46366i);
            return;
        }
        if (H02 != -1) {
            this.f46365h.f46334l.add(this.f46359b.f46097N.f46120f.f46365h);
            this.f46359b.f46097N.f46120f.f46365h.f46333k.add(this.f46365h);
            this.f46365h.f46328f = H02;
        } else if (I02 != -1) {
            this.f46365h.f46334l.add(this.f46359b.f46097N.f46120f.f46366i);
            this.f46359b.f46097N.f46120f.f46366i.f46333k.add(this.f46365h);
            this.f46365h.f46328f = -I02;
        } else {
            C3451f c3451f2 = this.f46365h;
            c3451f2.f46324b = true;
            c3451f2.f46334l.add(this.f46359b.f46097N.f46120f.f46366i);
            this.f46359b.f46097N.f46120f.f46366i.f46333k.add(this.f46365h);
        }
        q(this.f46359b.f46120f.f46365h);
        q(this.f46359b.f46120f.f46366i);
    }

    @Override // u.m
    public void e() {
        if (((t.g) this.f46359b).G0() == 1) {
            this.f46359b.B0(this.f46365h.f46329g);
        } else {
            this.f46359b.C0(this.f46365h.f46329g);
        }
    }

    @Override // u.m
    void f() {
        this.f46365h.c();
    }

    @Override // u.m
    boolean m() {
        return false;
    }
}

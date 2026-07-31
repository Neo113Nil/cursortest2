package u;

import java.util.Iterator;
import t.C3419a;
import t.C3423e;
import u.C3451f;

/* loaded from: classes.dex */
class i extends m {
    public i(C3423e c3423e) {
        super(c3423e);
    }

    private void q(C3451f c3451f) {
        this.f46365h.f46333k.add(c3451f);
        c3451f.f46334l.add(this.f46365h);
    }

    @Override // u.m, u.InterfaceC3449d
    public void a(InterfaceC3449d interfaceC3449d) {
        C3419a c3419a = (C3419a) this.f46359b;
        int H02 = c3419a.H0();
        Iterator it = this.f46365h.f46334l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = ((C3451f) it.next()).f46329g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (H02 == 0 || H02 == 2) {
            this.f46365h.d(i5 + c3419a.I0());
        } else {
            this.f46365h.d(i4 + c3419a.I0());
        }
    }

    @Override // u.m
    void d() {
        C3423e c3423e = this.f46359b;
        if (c3423e instanceof C3419a) {
            this.f46365h.f46324b = true;
            C3419a c3419a = (C3419a) c3423e;
            int H02 = c3419a.H0();
            boolean G02 = c3419a.G0();
            int i4 = 0;
            if (H02 == 0) {
                this.f46365h.f46327e = C3451f.a.LEFT;
                while (i4 < c3419a.f46195x0) {
                    C3423e c3423e2 = c3419a.f46194w0[i4];
                    if (G02 || c3423e2.M() != 8) {
                        C3451f c3451f = c3423e2.f46118e.f46365h;
                        c3451f.f46333k.add(this.f46365h);
                        this.f46365h.f46334l.add(c3451f);
                    }
                    i4++;
                }
                q(this.f46359b.f46118e.f46365h);
                q(this.f46359b.f46118e.f46366i);
                return;
            }
            if (H02 == 1) {
                this.f46365h.f46327e = C3451f.a.RIGHT;
                while (i4 < c3419a.f46195x0) {
                    C3423e c3423e3 = c3419a.f46194w0[i4];
                    if (G02 || c3423e3.M() != 8) {
                        C3451f c3451f2 = c3423e3.f46118e.f46366i;
                        c3451f2.f46333k.add(this.f46365h);
                        this.f46365h.f46334l.add(c3451f2);
                    }
                    i4++;
                }
                q(this.f46359b.f46118e.f46365h);
                q(this.f46359b.f46118e.f46366i);
                return;
            }
            if (H02 == 2) {
                this.f46365h.f46327e = C3451f.a.TOP;
                while (i4 < c3419a.f46195x0) {
                    C3423e c3423e4 = c3419a.f46194w0[i4];
                    if (G02 || c3423e4.M() != 8) {
                        C3451f c3451f3 = c3423e4.f46120f.f46365h;
                        c3451f3.f46333k.add(this.f46365h);
                        this.f46365h.f46334l.add(c3451f3);
                    }
                    i4++;
                }
                q(this.f46359b.f46120f.f46365h);
                q(this.f46359b.f46120f.f46366i);
                return;
            }
            if (H02 != 3) {
                return;
            }
            this.f46365h.f46327e = C3451f.a.BOTTOM;
            while (i4 < c3419a.f46195x0) {
                C3423e c3423e5 = c3419a.f46194w0[i4];
                if (G02 || c3423e5.M() != 8) {
                    C3451f c3451f4 = c3423e5.f46120f.f46366i;
                    c3451f4.f46333k.add(this.f46365h);
                    this.f46365h.f46334l.add(c3451f4);
                }
                i4++;
            }
            q(this.f46359b.f46120f.f46365h);
            q(this.f46359b.f46120f.f46366i);
        }
    }

    @Override // u.m
    public void e() {
        C3423e c3423e = this.f46359b;
        if (c3423e instanceof C3419a) {
            int H02 = ((C3419a) c3423e).H0();
            if (H02 == 0 || H02 == 1) {
                this.f46359b.B0(this.f46365h.f46329g);
            } else {
                this.f46359b.C0(this.f46365h.f46329g);
            }
        }
    }

    @Override // u.m
    void f() {
        this.f46360c = null;
        this.f46365h.c();
    }

    @Override // u.m
    boolean m() {
        return false;
    }
}

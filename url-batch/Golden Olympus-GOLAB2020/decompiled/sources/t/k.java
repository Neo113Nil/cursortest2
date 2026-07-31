package t;

import java.util.ArrayList;
import s.C3403c;

/* loaded from: classes.dex */
public abstract class k extends C3423e {

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList f46197w0 = new ArrayList();

    public abstract void G0();

    public void H0(C3423e c3423e) {
        this.f46197w0.remove(c3423e);
        c3423e.s0(null);
    }

    public void I0() {
        this.f46197w0.clear();
    }

    @Override // t.C3423e
    public void W() {
        this.f46197w0.clear();
        super.W();
    }

    @Override // t.C3423e
    public void X(C3403c c3403c) {
        super.X(c3403c);
        int size = this.f46197w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C3423e) this.f46197w0.get(i4)).X(c3403c);
        }
    }

    public void c(C3423e c3423e) {
        this.f46197w0.add(c3423e);
        if (c3423e.E() != null) {
            ((k) c3423e.E()).H0(c3423e);
        }
        c3423e.s0(this);
    }
}

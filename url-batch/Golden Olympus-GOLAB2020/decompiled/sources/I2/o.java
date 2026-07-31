package I2;

import java.util.Enumeration;

/* loaded from: classes3.dex */
public class o extends k {

    /* renamed from: c, reason: collision with root package name */
    private int f788c;

    public o() {
        this.f788c = -1;
    }

    private int l() {
        if (this.f788c < 0) {
            Enumeration j4 = j();
            int i4 = 0;
            while (j4.hasMoreElements()) {
                i4 += ((b) j4.nextElement()).b().g().f();
            }
            this.f788c = i4;
        }
        return this.f788c;
    }

    @Override // I2.j
    void e(h hVar) {
        h a4 = hVar.a();
        int l4 = l();
        hVar.b(48);
        hVar.e(l4);
        Enumeration j4 = j();
        while (j4.hasMoreElements()) {
            a4.f((b) j4.nextElement());
        }
    }

    @Override // I2.j
    int f() {
        int l4 = l();
        return q.a(l4) + 1 + l4;
    }

    public o(c cVar) {
        super(cVar);
        this.f788c = -1;
    }
}

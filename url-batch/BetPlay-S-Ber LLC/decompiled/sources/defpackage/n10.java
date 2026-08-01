package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n10 extends o10 implements Iterator {
    public m10 f;
    public boolean g = true;
    public final /* synthetic */ p10 h;

    public n10(p10 p10Var) {
        this.h = p10Var;
    }

    @Override // defpackage.o10
    public final void a(m10 m10Var) {
        m10 m10Var2 = this.f;
        if (m10Var == m10Var2) {
            m10 m10Var3 = m10Var2.i;
            this.f = m10Var3;
            this.g = m10Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        m10 m10Var = this.f;
        return (m10Var == null || m10Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            m10 m10Var = this.f;
            this.f = m10Var != null ? m10Var.h : null;
        }
        return this.f;
    }
}

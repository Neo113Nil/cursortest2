package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class l10 extends o10 implements Iterator {
    public m10 f;
    public m10 g;
    public final /* synthetic */ int h;

    public l10(m10 m10Var, m10 m10Var2, int i) {
        this.h = i;
        this.f = m10Var2;
        this.g = m10Var;
    }

    @Override // defpackage.o10
    public final void a(m10 m10Var) {
        m10 m10Var2;
        m10 m10Var3 = null;
        if (this.f == m10Var && m10Var == this.g) {
            this.g = null;
            this.f = null;
        }
        m10 m10Var4 = this.f;
        if (m10Var4 == m10Var) {
            switch (this.h) {
                case 0:
                    m10Var2 = m10Var4.i;
                    break;
                default:
                    m10Var2 = m10Var4.h;
                    break;
            }
            this.f = m10Var2;
        }
        m10 m10Var5 = this.g;
        if (m10Var5 == m10Var) {
            m10 m10Var6 = this.f;
            if (m10Var5 != m10Var6 && m10Var6 != null) {
                m10Var3 = b(m10Var5);
            }
            this.g = m10Var3;
        }
    }

    public final m10 b(m10 m10Var) {
        switch (this.h) {
            case 0:
                return m10Var.h;
            default:
                return m10Var.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m10 m10Var = this.g;
        m10 m10Var2 = this.f;
        this.g = (m10Var == m10Var2 || m10Var2 == null) ? null : b(m10Var);
        return m10Var;
    }
}

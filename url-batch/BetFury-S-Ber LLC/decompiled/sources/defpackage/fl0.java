package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class fl0 extends el0 {
    public m50[] a;
    public String b;
    public int c;

    public fl0(fl0 fl0Var) {
        this.a = null;
        this.c = 0;
        this.b = fl0Var.b;
        m50[] m50VarArr = fl0Var.a;
        m50[] m50VarArr2 = new m50[m50VarArr.length];
        for (int i = 0; i < m50VarArr.length; i++) {
            m50VarArr2[i] = new m50(m50VarArr[i]);
        }
        this.a = m50VarArr2;
    }

    public m50[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(m50[] m50VarArr) {
        int i;
        m50[] m50VarArr2 = this.a;
        if (m50VarArr2 != null && m50VarArr != null && m50VarArr2.length == m50VarArr.length) {
            for (0; i < m50VarArr2.length; i + 1) {
                m50 m50Var = m50VarArr2[i];
                char c = m50Var.a;
                m50 m50Var2 = m50VarArr[i];
                i = (c == m50Var2.a && m50Var.b.length == m50Var2.b.length) ? i + 1 : 0;
            }
            m50[] m50VarArr3 = this.a;
            for (int i2 = 0; i2 < m50VarArr.length; i2++) {
                m50VarArr3[i2].a = m50VarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = m50VarArr[i2].b;
                    if (i3 < fArr.length) {
                        m50VarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        m50[] m50VarArr4 = new m50[m50VarArr.length];
        for (int i4 = 0; i4 < m50VarArr.length; i4++) {
            m50VarArr4[i4] = new m50(m50VarArr[i4]);
        }
        this.a = m50VarArr4;
    }

    public fl0() {
        this.a = null;
        this.c = 0;
    }
}

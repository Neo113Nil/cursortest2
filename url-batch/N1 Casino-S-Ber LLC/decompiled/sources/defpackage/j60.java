package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class j60 extends o90 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public j60(m90 m90Var) {
        this.a = 1;
        this.d = m90Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.n90
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((k60) obj).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                m90 m90Var = (m90) obj;
                if (i2 == m90Var.a.size()) {
                    n90 n90Var = m90Var.d;
                    if (n90Var != null) {
                        n90Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    m90Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.o90, defpackage.n90
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.o90, defpackage.n90
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((k60) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    n90 n90Var = ((m90) obj).d;
                    if (n90Var != null) {
                        n90Var.c();
                        break;
                    }
                }
                break;
        }
    }

    public j60(k60 k60Var, int i) {
        this.a = 0;
        this.d = k60Var;
        this.c = i;
        this.b = false;
    }
}

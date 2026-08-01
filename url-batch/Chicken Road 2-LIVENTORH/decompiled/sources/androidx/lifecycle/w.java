package androidx.lifecycle;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: f, reason: collision with root package name */
    public final a0.a f637f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f638g;

    /* renamed from: h, reason: collision with root package name */
    public int f639h = -1;
    public final /* synthetic */ x i;

    public w(x xVar, a0.a aVar) {
        this.i = xVar;
        this.f637f = aVar;
    }

    public final void c(boolean z3) {
        if (z3 == this.f638g) {
            return;
        }
        this.f638g = z3;
        int i = z3 ? 1 : -1;
        x xVar = this.i;
        int i4 = xVar.f643c;
        xVar.f643c = i + i4;
        if (!xVar.d) {
            xVar.d = true;
            while (true) {
                try {
                    int i5 = xVar.f643c;
                    if (i4 == i5) {
                        break;
                    } else {
                        i4 = i5;
                    }
                } finally {
                    xVar.d = false;
                }
            }
        }
        if (this.f638g) {
            xVar.c(this);
        }
    }

    public abstract boolean e();

    public void d() {
    }
}

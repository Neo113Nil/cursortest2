package androidx.lifecycle;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final a2.e f607a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f608b;
    public int c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f609d;

    public w(x xVar, a2.e eVar) {
        this.f609d = xVar;
        this.f607a = eVar;
    }

    public final void c(boolean z3) {
        if (z3 == this.f608b) {
            return;
        }
        this.f608b = z3;
        int i4 = z3 ? 1 : -1;
        x xVar = this.f609d;
        int i5 = xVar.c;
        xVar.c = i4 + i5;
        if (!xVar.f613d) {
            xVar.f613d = true;
            while (true) {
                try {
                    int i6 = xVar.c;
                    if (i5 == i6) {
                        break;
                    } else {
                        i5 = i6;
                    }
                } finally {
                    xVar.f613d = false;
                }
            }
        }
        if (this.f608b) {
            xVar.c(this);
        }
    }

    public abstract boolean e();

    public void d() {
    }
}

package androidx.lifecycle;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final a0.a f740a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f741b;

    /* renamed from: c, reason: collision with root package name */
    public int f742c = -1;
    public final /* synthetic */ x d;

    public w(x xVar, a0.a aVar) {
        this.d = xVar;
        this.f740a = aVar;
    }

    public final void c(boolean z4) {
        if (z4 == this.f741b) {
            return;
        }
        this.f741b = z4;
        int i = z4 ? 1 : -1;
        x xVar = this.d;
        int i4 = xVar.f746c;
        xVar.f746c = i + i4;
        if (!xVar.d) {
            xVar.d = true;
            while (true) {
                try {
                    int i5 = xVar.f746c;
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
        if (this.f741b) {
            xVar.c(this);
        }
    }

    public abstract boolean e();

    public void d() {
    }
}

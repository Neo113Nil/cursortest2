package androidx.lifecycle;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final l2.c f3833a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3834b;

    /* renamed from: c, reason: collision with root package name */
    public int f3835c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f3836d;

    public B(C c7, l2.c cVar) {
        this.f3836d = c7;
        this.f3833a = cVar;
    }

    public final void a(boolean z7) {
        if (z7 == this.f3834b) {
            return;
        }
        this.f3834b = z7;
        int i2 = z7 ? 1 : -1;
        C c7 = this.f3836d;
        int i5 = c7.f3840c;
        c7.f3840c = i2 + i5;
        if (!c7.f3841d) {
            c7.f3841d = true;
            while (true) {
                try {
                    int i7 = c7.f3840c;
                    if (i5 == i7) {
                        break;
                    } else {
                        i5 = i7;
                    }
                } finally {
                    c7.f3841d = false;
                }
            }
        }
        if (this.f3834b) {
            c7.c(this);
        }
    }
}

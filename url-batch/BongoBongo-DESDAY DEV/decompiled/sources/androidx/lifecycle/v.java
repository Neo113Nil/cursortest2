package androidx.lifecycle;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final D.g f1589a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1590b;

    /* renamed from: c, reason: collision with root package name */
    public int f1591c = -1;
    public final /* synthetic */ w d;

    public v(w wVar, D.g gVar) {
        this.d = wVar;
        this.f1589a = gVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1590b) {
            return;
        }
        this.f1590b = z2;
        int i = z2 ? 1 : -1;
        w wVar = this.d;
        int i2 = wVar.f1595c;
        wVar.f1595c = i + i2;
        if (!wVar.d) {
            wVar.d = true;
            while (true) {
                try {
                    int i3 = wVar.f1595c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    wVar.d = false;
                }
            }
        }
        if (this.f1590b) {
            wVar.c(this);
        }
    }
}

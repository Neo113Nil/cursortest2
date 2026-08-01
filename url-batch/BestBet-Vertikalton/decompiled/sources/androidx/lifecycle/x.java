package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f1905a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1906b;

    /* renamed from: c, reason: collision with root package name */
    public int f1907c = -1;
    public final /* synthetic */ y d;

    public x(y yVar, A0.c cVar) {
        this.d = yVar;
        this.f1905a = cVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1906b) {
            return;
        }
        this.f1906b = z2;
        int i = z2 ? 1 : -1;
        y yVar = this.d;
        int i2 = yVar.f1911c;
        yVar.f1911c = i + i2;
        if (!yVar.d) {
            yVar.d = true;
            while (true) {
                try {
                    int i3 = yVar.f1911c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    yVar.d = false;
                }
            }
        }
        if (this.f1906b) {
            yVar.c(this);
        }
    }
}

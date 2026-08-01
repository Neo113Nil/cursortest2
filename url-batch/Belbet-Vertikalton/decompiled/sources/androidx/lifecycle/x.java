package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C1.d f1955a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1956b;

    /* renamed from: c, reason: collision with root package name */
    public int f1957c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1958d;

    public x(y yVar, C1.d dVar) {
        this.f1958d = yVar;
        this.f1955a = dVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1956b) {
            return;
        }
        this.f1956b = z2;
        int i = z2 ? 1 : -1;
        y yVar = this.f1958d;
        int i2 = yVar.f1961c;
        yVar.f1961c = i + i2;
        if (!yVar.f1962d) {
            yVar.f1962d = true;
            while (true) {
                try {
                    int i3 = yVar.f1961c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    yVar.f1962d = false;
                }
            }
        }
        if (this.f1956b) {
            yVar.c(this);
        }
    }
}

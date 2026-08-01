package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final B0.d f1506a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1507b;

    /* renamed from: c, reason: collision with root package name */
    public int f1508c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1509d;

    public x(y yVar, B0.d dVar) {
        this.f1509d = yVar;
        this.f1506a = dVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1507b) {
            return;
        }
        this.f1507b = z2;
        int i = z2 ? 1 : -1;
        y yVar = this.f1509d;
        int i2 = yVar.f1513c;
        yVar.f1513c = i + i2;
        if (!yVar.f1514d) {
            yVar.f1514d = true;
            while (true) {
                try {
                    int i3 = yVar.f1513c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    yVar.f1514d = false;
                }
            }
        }
        if (this.f1507b) {
            yVar.c(this);
        }
    }
}

package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final B0.d f1507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1508b;

    /* renamed from: c, reason: collision with root package name */
    public int f1509c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1510d;

    public x(y yVar, B0.d dVar) {
        this.f1510d = yVar;
        this.f1507a = dVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1508b) {
            return;
        }
        this.f1508b = z2;
        int i = z2 ? 1 : -1;
        y yVar = this.f1510d;
        int i2 = yVar.f1514c;
        yVar.f1514c = i + i2;
        if (!yVar.f1515d) {
            yVar.f1515d = true;
            while (true) {
                try {
                    int i3 = yVar.f1514c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    yVar.f1515d = false;
                }
            }
        }
        if (this.f1508b) {
            yVar.c(this);
        }
    }
}

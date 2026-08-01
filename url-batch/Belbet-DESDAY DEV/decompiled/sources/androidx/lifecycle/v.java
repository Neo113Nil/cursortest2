package androidx.lifecycle;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final B0.d f1377a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1378b;

    /* renamed from: c, reason: collision with root package name */
    public int f1379c = -1;
    public final /* synthetic */ w d;

    public v(w wVar, B0.d dVar) {
        this.d = wVar;
        this.f1377a = dVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1378b) {
            return;
        }
        this.f1378b = z2;
        int i = z2 ? 1 : -1;
        w wVar = this.d;
        int i2 = wVar.f1383c;
        wVar.f1383c = i + i2;
        if (!wVar.d) {
            wVar.d = true;
            while (true) {
                try {
                    int i3 = wVar.f1383c;
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
        if (this.f1378b) {
            wVar.c(this);
        }
    }
}

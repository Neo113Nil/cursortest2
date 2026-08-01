package androidx.lifecycle;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final C.h f1454a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1455b;

    /* renamed from: c, reason: collision with root package name */
    public int f1456c = -1;
    public final /* synthetic */ w d;

    public v(w wVar, C.h hVar) {
        this.d = wVar;
        this.f1454a = hVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1455b) {
            return;
        }
        this.f1455b = z2;
        int i = z2 ? 1 : -1;
        w wVar = this.d;
        int i2 = wVar.f1460c;
        wVar.f1460c = i + i2;
        if (!wVar.d) {
            wVar.d = true;
            while (true) {
                try {
                    int i3 = wVar.f1460c;
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
        if (this.f1455b) {
            wVar.c(this);
        }
    }
}

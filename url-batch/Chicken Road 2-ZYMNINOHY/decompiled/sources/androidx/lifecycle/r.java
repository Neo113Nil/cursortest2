package androidx.lifecycle;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.A f5060a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5061b;

    /* renamed from: c, reason: collision with root package name */
    public int f5062c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f5063d;

    public r(s sVar, androidx.fragment.app.A a3) {
        this.f5063d = sVar;
        this.f5060a = a3;
    }

    public final void a(boolean z) {
        if (z == this.f5061b) {
            return;
        }
        this.f5061b = z;
        int i4 = z ? 1 : -1;
        s sVar = this.f5063d;
        int i5 = sVar.f5067c;
        sVar.f5067c = i4 + i5;
        if (!sVar.f5068d) {
            sVar.f5068d = true;
            while (true) {
                try {
                    int i6 = sVar.f5067c;
                    if (i5 == i6) {
                        break;
                    } else {
                        i5 = i6;
                    }
                } finally {
                    sVar.f5068d = false;
                }
            }
        }
        if (this.f5061b) {
            sVar.c(this);
        }
    }
}

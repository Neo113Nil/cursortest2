package androidx.lifecycle;

import androidx.lifecycle.e;
import c4.w0;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements g {

    /* renamed from: f, reason: collision with root package name */
    private final c f856f;

    /* renamed from: g, reason: collision with root package name */
    private final g f857g;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f858a;

        static {
            int[] iArr = new int[e.b.values().length];
            f858a = iArr;
            try {
                iArr[e.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f858a[e.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f858a[e.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f858a[e.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f858a[e.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f858a[e.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f858a[e.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(c cVar, g gVar) {
        this.f856f = cVar;
        this.f857g = gVar;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        switch (a.f858a[bVar.ordinal()]) {
            case 1:
                this.f856f.c(iVar);
                break;
            case 2:
                this.f856f.f(iVar);
                break;
            case 3:
                this.f856f.a(iVar);
                break;
            case 4:
                this.f856f.e(iVar);
                break;
            case 5:
                this.f856f.i(iVar);
                break;
            case 6:
                this.f856f.b(iVar);
                break;
            case w0.f2149o /* 7 */:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f857g;
        if (gVar != null) {
            gVar.d(iVar, bVar);
        }
    }
}

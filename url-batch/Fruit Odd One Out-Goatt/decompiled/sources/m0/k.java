package m0;

import android.util.Log;
import e0.h0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f808c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f806a = i2;
        this.f808c = obj;
        this.f807b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f806a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((g0.f) this.f807b).a(((n0.j) ((h0) ((c0.a) this.f808c).f67d).f153c).h(str, str2, obj));
                break;
        }
    }

    public final void b() {
        switch (this.f806a) {
            case 0:
                break;
            default:
                ((g0.f) this.f807b).a(null);
                break;
        }
    }

    public final void d(Object obj) {
        switch (this.f806a) {
            case 0:
                ((l) this.f808c).f810b = (byte[]) this.f807b;
                break;
            default:
                ((g0.f) this.f807b).a(((n0.j) ((h0) ((c0.a) this.f808c).f67d).f153c).c(obj));
                break;
        }
    }

    private final void c() {
    }
}

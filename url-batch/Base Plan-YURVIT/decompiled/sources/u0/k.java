package u0;

import B0.C0008i;
import N.P;
import android.util.Log;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3026c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f3024a = i2;
        this.f3026c = obj;
        this.f3025b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f3024a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((m0.g) this.f3025b).a(((v0.l) ((C0008i) ((P) this.f3026c).f699g).f86h).c(str, str2, obj));
                break;
        }
    }

    public final void b() {
        switch (this.f3024a) {
            case 0:
                break;
            default:
                ((m0.g) this.f3025b).a(null);
                break;
        }
    }

    public final void d(Object obj) {
        switch (this.f3024a) {
            case 0:
                ((l) this.f3026c).f3028b = (byte[]) this.f3025b;
                break;
            default:
                ((m0.g) this.f3025b).a(((v0.l) ((C0008i) ((P) this.f3026c).f699g).f86h).a(obj));
                break;
        }
    }

    private final void c() {
    }
}

package M;

import android.util.Log;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f310c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f308a = i2;
        this.f310c = obj;
        this.f309b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f308a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((F.g) this.f309b).a(((N.k) ((C.b) ((B.a) this.f310c).f4d).f15c).d(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((F.g) this.f309b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f308a) {
            case 0:
                ((l) this.f310c).f312b = (byte[]) this.f309b;
                break;
            default:
                ((F.g) this.f309b).a(((N.k) ((C.b) ((B.a) this.f310c).f4d).f15c).e(obj));
                break;
        }
    }
}

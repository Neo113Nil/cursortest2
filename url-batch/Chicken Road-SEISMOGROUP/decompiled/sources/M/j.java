package M;

import android.util.Log;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f368c;

    public /* synthetic */ j(int i2, Object obj, Object obj2) {
        this.f366a = i2;
        this.f368c = obj;
        this.f367b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f366a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((G.g) this.f367b).a(((N.k) ((A.e) ((A.a) this.f368c).f4d).f9d).e(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((G.g) this.f367b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f366a) {
            case 0:
                ((k) this.f368c).f370b = (byte[]) this.f367b;
                break;
            default:
                ((G.g) this.f367b).a(((N.k) ((A.e) ((A.a) this.f368c).f4d).f9d).f(obj));
                break;
        }
    }
}

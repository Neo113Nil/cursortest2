package N3;

import android.util.Log;
import u0.C0682l;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1719c;

    public /* synthetic */ j(Object obj, int i7, Object obj2) {
        this.f1717a = i7;
        this.f1719c = obj;
        this.f1718b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f1717a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((F3.f) this.f1718b).a(((O3.j) ((B0.c) ((C0682l) this.f1719c).f5990g).f73i).e(str, str2, obj));
                break;
        }
    }

    public final void b() {
        switch (this.f1717a) {
            case 0:
                break;
            default:
                ((F3.f) this.f1718b).a(null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public final void d(Object obj) {
        switch (this.f1717a) {
            case 0:
                ((k) this.f1719c).f1724e = (byte[]) this.f1718b;
                break;
            default:
                ((F3.f) this.f1718b).a(((O3.j) ((B0.c) ((C0682l) this.f1719c).f5990g).f73i).c(obj));
                break;
        }
    }

    private final void c() {
    }
}

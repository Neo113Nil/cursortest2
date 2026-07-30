package m0;

import L.C0026b;
import L.Q;
import android.util.Log;
import e0.C0119g;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2746c;

    public /* synthetic */ C0201k(int i2, Object obj, Object obj2) {
        this.f2744a = i2;
        this.f2746c = obj;
        this.f2745b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f2744a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((C0119g) this.f2745b).a(((n0.l) ((C0026b) ((Q) this.f2746c).f516g).f522h).c(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((C0119g) this.f2745b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f2744a) {
            case 0:
                ((C0202l) this.f2746c).f2748b = (byte[]) this.f2745b;
                break;
            default:
                ((C0119g) this.f2745b).a(((n0.l) ((C0026b) ((Q) this.f2746c).f516g).f522h).d(obj));
                break;
        }
    }
}

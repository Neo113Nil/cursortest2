package v0;

import I.C0079n;
import P.O;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3516c;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f3514a = i2;
        this.f3516c = obj;
        this.f3515b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f3514a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((o0.g) this.f3515b).a(((w0.m) ((C0079n) ((O) this.f3516c).f876g).f691g).f(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((o0.g) this.f3515b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f3514a) {
            case 0:
                ((j) this.f3516c).f3518b = (byte[]) this.f3515b;
                break;
            default:
                ((o0.g) this.f3515b).a(((w0.m) ((C0079n) ((O) this.f3516c).f876g).f691g).a(obj));
                break;
        }
    }
}

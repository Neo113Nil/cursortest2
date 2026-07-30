package r4;

import P0.s;
import android.util.Log;
import j4.C0578g;

/* loaded from: classes.dex */
public final class l implements s4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7501c;

    public /* synthetic */ l(Object obj, int i2, Object obj2) {
        this.f7499a = i2;
        this.f7501c = obj;
        this.f7500b = obj2;
    }

    @Override // s4.p
    public final void error(String str, String str2, Object obj) {
        switch (this.f7499a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((C0578g) this.f7500b).a(((s4.q) ((s) this.f7501c).f2252e).f7771c.d(str, str2, obj));
                break;
        }
    }

    @Override // s4.p
    public final void notImplemented() {
        switch (this.f7499a) {
            case 0:
                break;
            default:
                ((C0578g) this.f7500b).a(null);
                break;
        }
    }

    @Override // s4.p
    public final void success(Object obj) {
        switch (this.f7499a) {
            case 0:
                ((A6.j) this.f7501c).f117e = (byte[]) this.f7500b;
                break;
            default:
                ((C0578g) this.f7500b).a(((s4.q) ((s) this.f7501c).f2252e).f7771c.a(obj));
                break;
        }
    }

    private final void a() {
    }
}

package O1;

import android.util.Log;

/* loaded from: classes.dex */
public final class j implements P1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1179c;

    public /* synthetic */ j(Object obj, int i3, Object obj2) {
        this.f1177a = i3;
        this.f1179c = obj;
        this.f1178b = obj2;
    }

    @Override // P1.n
    public final void a() {
        switch (this.f1177a) {
            case 0:
                break;
            default:
                ((G1.g) this.f1178b).a(null);
                break;
        }
    }

    @Override // P1.n
    public final void b(String str, String str2, Object obj) {
        switch (this.f1177a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((G1.g) this.f1178b).a(((P1.o) ((V0.e) this.f1179c).f1600c).f1270c.d(str, str2, obj));
                break;
        }
    }

    @Override // P1.n
    public final void success(Object obj) {
        switch (this.f1177a) {
            case 0:
                ((k) this.f1179c).f1183d = (byte[]) this.f1178b;
                break;
            default:
                ((G1.g) this.f1178b).a(((P1.o) ((V0.e) this.f1179c).f1600c).f1270c.b(obj));
                break;
        }
    }

    private final void c() {
    }
}

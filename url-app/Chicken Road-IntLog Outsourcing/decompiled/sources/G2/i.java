package G2;

import android.util.Log;
import y2.C1562g;

/* loaded from: classes.dex */
public final class i implements H2.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f969c;

    public /* synthetic */ i(Object obj, int i2, Object obj2) {
        this.f967a = i2;
        this.f969c = obj;
        this.f968b = obj2;
    }

    @Override // H2.n
    public final void a() {
        switch (this.f967a) {
            case 0:
                break;
            default:
                ((C1562g) this.f968b).a(null);
                break;
        }
    }

    @Override // H2.n
    public final void b(String str, String str2, Object obj) {
        switch (this.f967a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((C1562g) this.f968b).a(((H2.o) ((B0.c) this.f969c).f141c).f1150c.c(str, str2, obj));
                break;
        }
    }

    @Override // H2.n
    public final void success(Object obj) {
        switch (this.f967a) {
            case 0:
                ((j) this.f969c).f971b = (byte[]) this.f968b;
                break;
            default:
                ((C1562g) this.f968b).a(((H2.o) ((B0.c) this.f969c).f141c).f1150c.a(obj));
                break;
        }
    }

    private final void c() {
    }
}

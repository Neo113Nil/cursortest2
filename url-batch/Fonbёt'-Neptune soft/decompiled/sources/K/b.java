package K;

import a0.C0134b;
import android.content.Context;
import b0.InterfaceC0164a;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends Q0.i implements P0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f746f = i2;
        this.f747g = obj;
        this.f748h = obj2;
    }

    @Override // P0.a
    public final Object g() {
        switch (this.f746f) {
            case 0:
                Context context = (Context) this.f747g;
                ((c) this.f748h).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                Q0.h.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((InterfaceC0164a) ((C0134b) this.f747g).f1262f).b((a0.i) this.f748h);
                return F0.h.f469a;
        }
    }
}

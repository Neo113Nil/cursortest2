package H;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends P0.i implements O0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f502f = i2;
        this.f503g = obj;
        this.f504h = obj2;
    }

    @Override // O0.a
    public final Object h() {
        switch (this.f502f) {
            case 0:
                Context context = (Context) this.f503g;
                ((c) this.f504h).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                P0.h.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((X.a) ((W.b) this.f503g).f879f).a((W.i) this.f504h);
                return D0.h.f206a;
        }
    }
}

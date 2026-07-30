package F;

import android.content.Context;
import java.io.File;
import u0.C0247g;

/* loaded from: classes.dex */
public final class b extends F0.j implements E0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f296h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f294f = i2;
        this.f295g = obj;
        this.f296h = obj2;
    }

    @Override // E0.a
    public final Object d() {
        switch (this.f294f) {
            case 0:
                Context context = (Context) this.f295g;
                ((c) this.f296h).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                F0.i.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((V.a) ((U.b) this.f295g).f1001f).a((U.i) this.f296h);
                return C0247g.f3005a;
        }
    }
}

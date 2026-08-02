package M;

import android.content.Context;
import c3.C0297i;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt;
import java.io.File;
import o3.InterfaceC1328a;
import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i4, Object obj2) {
        super(0);
        this.f1684e = i4;
        this.f1685f = obj;
        this.f1686g = obj2;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        switch (this.f1684e) {
            case 0:
                Context context = (Context) this.f1685f;
                ((c) this.f1686g).getClass();
                String fileName = SharedPreferencesPluginKt.SHARED_PREFERENCES_NAME.concat(".preferences_pb");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            default:
                ((InterfaceC1581a) ((y1.b) this.f1685f).f16236c).b((y1.i) this.f1686g);
                return C0297i.f5732a;
        }
    }
}

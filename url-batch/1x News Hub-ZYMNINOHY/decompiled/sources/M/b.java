package M;

import E1.p;
import android.content.Context;
import b2.C0195i;
import g0.C0330b;
import h0.InterfaceC0338a;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f892e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f893g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        super(0);
        this.f892e = i3;
        this.f = obj;
        this.f893g = obj2;
    }

    @Override // l2.a
    public final Object invoke() {
        switch (this.f892e) {
            case 0:
                Context context = (Context) this.f;
                ((c) this.f893g).getClass();
                String fileName = "FlutterSharedPreferences".concat(".preferences_pb");
                kotlin.jvm.internal.j.e(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            default:
                ((InterfaceC0338a) ((C0330b) this.f).f5016b).a((p) this.f893g);
                return C0195i.f2555a;
        }
    }
}

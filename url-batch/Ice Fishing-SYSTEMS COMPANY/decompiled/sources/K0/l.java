package K0;

import android.content.Context;
import com.google.android.gms.internal.ads.C4088vv;
import y0.InterfaceC5220a;
import z0.C5264g;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC5220a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1523a;

    public /* synthetic */ l(Context context) {
        this.f1523a = context;
    }

    @Override // y0.InterfaceC5220a
    public y0.b a(C4088vv c4088vv) {
        Context context = this.f1523a;
        F.d callback = (F.d) c4088vv.f34901x;
        kotlin.jvm.internal.h.e(callback, "callback");
        String str = (String) c4088vv.f34900w;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C5264g(context, str, callback, true, true);
    }
}

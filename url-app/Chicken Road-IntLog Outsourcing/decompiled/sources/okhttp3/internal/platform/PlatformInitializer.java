package okhttp3.internal.platform;

import android.content.Context;
import d5.d;
import d5.e;
import e0.b;
import g4.C0471p;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformInitializer implements b {
    @Override // e0.b
    public final List a() {
        return C0471p.f5750a;
    }

    @Override // e0.b
    public final Object create(Context context) {
        i.e(context, "context");
        e eVar = e.f5492a;
        Object obj = e.f5492a;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f5492a;
    }
}

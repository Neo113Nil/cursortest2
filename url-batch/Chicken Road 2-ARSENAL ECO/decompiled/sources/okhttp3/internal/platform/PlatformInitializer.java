package okhttp3.internal.platform;

import X.b;
import android.content.Context;
import h6.d;
import h6.e;
import java.util.List;
import kotlin.jvm.internal.i;
import l5.C0512p;

/* loaded from: classes.dex */
public final class PlatformInitializer implements b {
    @Override // X.b
    public final Object create(Context context) {
        i.e(context, "context");
        e eVar = e.f4355a;
        Object obj = e.f4355a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f4355a;
    }

    @Override // X.b
    public final List dependencies() {
        return C0512p.f5303f;
    }
}

package androidx.work;

import X.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import l0.C0488b;
import l0.q;
import m0.o;
import y1.C0760d;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3549a = q.f("WrkMgrInitializer");

    @Override // X.b
    public final Object create(Context context) {
        q.d().a(f3549a, "Initializing WorkManager with default configuration.");
        o.b(context, new C0488b(new C0760d()));
        return o.a(context);
    }

    @Override // X.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}

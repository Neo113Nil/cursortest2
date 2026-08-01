package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import n5.b;
import s7.c0;
import t5.o;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f756a = o.f("WrkMgrInitializer");

    @Override // n5.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // n5.b
    public final Object b(Context context) {
        o.d().a(f756a, "Initializing WorkManager with default configuration.");
        m.b(context, new t5.b(new c0(17)));
        return m.a(context);
    }
}

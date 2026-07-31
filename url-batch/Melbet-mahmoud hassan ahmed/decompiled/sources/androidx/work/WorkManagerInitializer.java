package androidx.work;

import android.content.Context;
import androidx.work.a;
import d0.j;
import d0.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements y.a<t> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1403a = j.f("WrkMgrInitializer");

    @Override // y.a
    public List<Class<? extends y.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // y.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t b(Context context) {
        j.c().a(f1403a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        t.e(context, new a.b().a());
        return t.d(context);
    }
}

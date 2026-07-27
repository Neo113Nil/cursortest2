package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w1.C1290a;
import w1.InterfaceC1291b;
import z2.C1405I;

@Metadata
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1291b {
    @Override // w1.InterfaceC1291b
    public final List a() {
        return C1405I.f11931d;
    }

    @Override // w1.InterfaceC1291b
    public final Object b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C1290a c4 = C1290a.c(context);
        Intrinsics.checkNotNullExpressionValue(c4, "getInstance(context)");
        if (!c4.f11381b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = AbstractC0478s.f5490a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!AbstractC0478s.f5490a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        E e4 = E.f5420o;
        Intrinsics.checkNotNullParameter(context, "context");
        E e5 = E.f5420o;
        e5.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        e5.f5425k = new Handler();
        e5.f5426l.d(EnumC0474n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e5));
        return e5;
    }
}

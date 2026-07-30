package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0.C0796a;
import o0.InterfaceC0797b;

@Metadata
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0797b {
    @Override // o0.InterfaceC0797b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0796a c7 = C0796a.c(context);
        Intrinsics.checkNotNullExpressionValue(c7, "getInstance(context)");
        if (!c7.f7114b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = AbstractC0253t.f3917a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!AbstractC0253t.f3917a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0252s());
        }
        G g7 = G.f3847q;
        Intrinsics.checkNotNullParameter(context, "context");
        G g8 = G.f3847q;
        g8.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        g8.f3852m = new Handler();
        g8.f3853n.e(EnumC0248n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new F(g8));
        return g8;
    }

    @Override // o0.InterfaceC0797b
    public final List dependencies() {
        return kotlin.collections.A.f6115d;
    }
}

package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.F;
import i0.InterfaceC2469a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC2469a {
    @Override // i0.InterfaceC2469a
    public List a() {
        return CollectionsKt.emptyList();
    }

    @Override // i0.InterfaceC2469a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1354u b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.startup.a e4 = androidx.startup.a.e(context);
        Intrinsics.checkNotNullExpressionValue(e4, "getInstance(context)");
        if (!e4.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1350p.a(context);
        F.b bVar = F.f12561i;
        bVar.b(context);
        return bVar.a();
    }
}

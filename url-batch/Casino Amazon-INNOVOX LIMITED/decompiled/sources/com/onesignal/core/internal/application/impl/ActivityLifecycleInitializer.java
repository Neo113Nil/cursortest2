package com.onesignal.core.internal.application.impl;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityLifecycleInitializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/onesignal/core/internal/application/impl/ActivityLifecycleInitializer;", "Landroidx/startup/Initializer;", "Lcom/onesignal/core/internal/application/IApplicationService;", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityLifecycleInitializer implements Initializer<IApplicationService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public IApplicationService create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OneSignalDispatchers.INSTANCE.prewarm();
        ApplicationService companion = ApplicationService.INSTANCE.getInstance();
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            companion.attachToApplication(application);
        }
        return companion;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}

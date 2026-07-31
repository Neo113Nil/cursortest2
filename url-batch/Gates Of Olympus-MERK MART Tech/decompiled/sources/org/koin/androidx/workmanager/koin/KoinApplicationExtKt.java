package org.koin.androidx.workmanager.koin;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.DelegatingWorkerFactory;
import androidx.work.WorkManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.workmanager.factory.KoinWorkerFactory;
import org.koin.core.KoinApplication;

/* compiled from: KoinApplicationExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"workManagerFactory", "", "Lorg/koin/core/KoinApplication;", "createWorkManagerFactory", "koin-androidx-workmanager_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinApplicationExtKt {
    public static final void workManagerFactory(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        createWorkManagerFactory(koinApplication);
    }

    private static final void createWorkManagerFactory(KoinApplication koinApplication) {
        if (WorkManager.INSTANCE.isInitialized()) {
            return;
        }
        DelegatingWorkerFactory delegatingWorkerFactory = new DelegatingWorkerFactory();
        delegatingWorkerFactory.addFactory(new KoinWorkerFactory());
        WorkManager.INSTANCE.initialize((Context) koinApplication.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null), new Configuration.Builder().setWorkerFactory(delegatingWorkerFactory).build());
    }
}

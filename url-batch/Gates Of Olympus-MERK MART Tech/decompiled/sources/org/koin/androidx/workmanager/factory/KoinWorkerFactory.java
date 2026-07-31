package org.koin.androidx.workmanager.factory;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.QualifierKt;

/* compiled from: KoinWorkerFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lorg/koin/androidx/workmanager/factory/KoinWorkerFactory;", "Landroidx/work/WorkerFactory;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "createWorker", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "workerClassName", "", "workerParameters", "Landroidx/work/WorkerParameters;", "koin-androidx-workmanager_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinWorkerFactory extends WorkerFactory implements KoinComponent {
    @Override // org.koin.core.component.KoinComponent
    public /* bridge */ Koin getKoin() {
        return super.getKoin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParametersHolder createWorker$lambda$0(WorkerParameters workerParameters) {
        return ParametersHolderKt.parametersOf(workerParameters);
    }

    @Override // androidx.work.WorkerFactory
    public ListenableWorker createWorker(Context appContext, String workerClassName, final WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Koin koin = getKoin();
        return (ListenableWorker) koin.getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(ListenableWorker.class), QualifierKt.named(workerClassName), new Function0() { // from class: org.koin.androidx.workmanager.factory.KoinWorkerFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ParametersHolder createWorker$lambda$0;
                createWorker$lambda$0 = KoinWorkerFactory.createWorker$lambda$0(WorkerParameters.this);
                return createWorker$lambda$0;
            }
        });
    }
}

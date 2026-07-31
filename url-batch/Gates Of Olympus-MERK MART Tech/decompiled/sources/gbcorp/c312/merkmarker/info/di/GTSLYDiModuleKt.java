package gbcorp.c312.merkmarker.info.di;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository;
import gbcorp.c312.merkmarker.info.data.service.GTSLYApiService;
import gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYDetailsScreenViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel;
import gbcorp.c312.merkmarker.info.util.GTSLYInstallReferrerManager;
import gbcorp.c312.merkmarker.info.util.GTSLYNetworkMonitor;
import gbcorp.c312.merkmarker.info.worker.GTSLYVisitRequestWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: GTSLYDiModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"gtslyDiModule", "Lorg/koin/core/module/Module;", "getGtslyDiModule", "()Lorg/koin/core/module/Module;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYDiModuleKt {
    private static final Module gtslyDiModule = ModuleDSLKt.module$default(false, new Function1() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit gtslyDiModule$lambda$0;
            gtslyDiModule$lambda$0 = GTSLYDiModuleKt.gtslyDiModule$lambda$0((Module) obj);
            return gtslyDiModule$lambda$0;
        }
    }, 1, null);

    public static final Module getGtslyDiModule() {
        return gtslyDiModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gtslyDiModule$lambda$0(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        Function2 function2 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Retrofit gtslyDiModule$lambda$0$0;
                gtslyDiModule$lambda$0$0 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$0((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$0;
            }
        };
        Qualifier qualifier = null;
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Retrofit.class), qualifier, function2, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        Function2 function22 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYApiService gtslyDiModule$lambda$0$1;
                gtslyDiModule$lambda$0$1 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$1((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$1;
            }
        };
        Qualifier qualifier2 = null;
        SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYApiService.class), qualifier2, function22, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
        module.indexPrimaryType(singleInstanceFactory4);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory3);
        }
        new KoinDefinition(module, singleInstanceFactory4);
        Function2 function23 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYNetworkMonitor gtslyDiModule$lambda$0$2;
                gtslyDiModule$lambda$0$2 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$2((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$2;
            }
        };
        Qualifier qualifier3 = null;
        SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYNetworkMonitor.class), qualifier3, function23, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory6 = singleInstanceFactory5;
        module.indexPrimaryType(singleInstanceFactory6);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory5);
        }
        new KoinDefinition(module, singleInstanceFactory6);
        Function2 function24 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SharedPreferences gtslyDiModule$lambda$0$3;
                gtslyDiModule$lambda$0$3 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$3((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$3;
            }
        };
        Qualifier qualifier4 = null;
        SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SharedPreferences.class), qualifier4, function24, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory8 = singleInstanceFactory7;
        module.indexPrimaryType(singleInstanceFactory8);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory7);
        }
        new KoinDefinition(module, singleInstanceFactory8);
        Function2 function25 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYPrepRepository gtslyDiModule$lambda$0$4;
                gtslyDiModule$lambda$0$4 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$4((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$4;
            }
        };
        Qualifier qualifier5 = null;
        SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYPrepRepository.class), qualifier5, function25, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory10 = singleInstanceFactory9;
        module.indexPrimaryType(singleInstanceFactory10);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory9);
        }
        new KoinDefinition(module, singleInstanceFactory10);
        Function2 function26 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYPrepViewModel gtslyDiModule$lambda$0$5;
                gtslyDiModule$lambda$0$5 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$5((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$5;
            }
        };
        int i = 64;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Qualifier qualifier6 = null;
        Boolean bool = null;
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYPrepViewModel.class), qualifier6, function26, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory);
        new KoinDefinition(module, factoryInstanceFactory);
        Function2 function27 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYDetailsScreenViewModel gtslyDiModule$lambda$0$6;
                gtslyDiModule$lambda$0$6 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$6((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$6;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYDetailsScreenViewModel.class), qualifier6, function27, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory2);
        new KoinDefinition(module, factoryInstanceFactory2);
        Function2 function28 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYInstallReferrerManager gtslyDiModule$lambda$0$7;
                gtslyDiModule$lambda$0$7 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$7((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$7;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYInstallReferrerManager.class), qualifier6, function28, Kind.Singleton, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        SingleInstanceFactory<?> singleInstanceFactory12 = singleInstanceFactory11;
        module.indexPrimaryType(singleInstanceFactory12);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory11);
        }
        new KoinDefinition(module, singleInstanceFactory12);
        Function2 function29 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GTSLYVisitRequestWorker gtslyDiModule$lambda$0$8;
                gtslyDiModule$lambda$0$8 = GTSLYDiModuleKt.gtslyDiModule$lambda$0$8((Scope) obj, (ParametersHolder) obj2);
                return gtslyDiModule$lambda$0$8;
            }
        };
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(GTSLYVisitRequestWorker.class));
        FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GTSLYVisitRequestWorker.class), typeQualifier, function29, Kind.Factory, CollectionsKt.emptyList(), null, 64, null));
        module.indexPrimaryType(factoryInstanceFactory3);
        DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory3), Reflection.getOrCreateKotlinClass(ListenableWorker.class));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit gtslyDiModule$lambda$0$0(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new Retrofit.Builder().baseUrl("https://hkoqqqpni.click/").addConverterFactory(GsonConverterFactory.create()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYNetworkMonitor gtslyDiModule$lambda$0$2(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GTSLYNetworkMonitor(ModuleExtKt.androidApplication(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences gtslyDiModule$lambda$0$3(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        SharedPreferences sharedPreferences = ModuleExtKt.androidContext(single).getSharedPreferences("prefix_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYPrepRepository gtslyDiModule$lambda$0$4(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GTSLYPrepRepository(ModuleExtKt.androidApplication(single), (GTSLYApiService) single.get(Reflection.getOrCreateKotlinClass(GTSLYApiService.class), null, null), (SharedPreferences) single.get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), QualifierKt.named("IO"), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYPrepViewModel gtslyDiModule$lambda$0$5(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GTSLYPrepViewModel((GTSLYPrepRepository) viewModel.get(Reflection.getOrCreateKotlinClass(GTSLYPrepRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYDetailsScreenViewModel gtslyDiModule$lambda$0$6(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GTSLYDetailsScreenViewModel((GTSLYNetworkMonitor) viewModel.get(Reflection.getOrCreateKotlinClass(GTSLYNetworkMonitor.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYInstallReferrerManager gtslyDiModule$lambda$0$7(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GTSLYInstallReferrerManager(ModuleExtKt.androidApplication(single), (GTSLYPrepRepository) single.get(Reflection.getOrCreateKotlinClass(GTSLYPrepRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYVisitRequestWorker gtslyDiModule$lambda$0$8(Scope worker, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(worker, "$this$worker");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GTSLYVisitRequestWorker((Context) worker.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (WorkerParameters) worker.get(Reflection.getOrCreateKotlinClass(WorkerParameters.class), null, null), (GTSLYApiService) worker.get(Reflection.getOrCreateKotlinClass(GTSLYApiService.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYApiService gtslyDiModule$lambda$0$1(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Object create = ((Retrofit) single.get(Reflection.getOrCreateKotlinClass(Retrofit.class), null, null)).create(GTSLYApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (GTSLYApiService) create;
    }
}

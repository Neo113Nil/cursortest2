package gbcorp.c312.merkmarker.info.di;

import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROnboardingRepo;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRAppViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMROnboardingVM;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMROrderViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductDetailsViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductViewModel;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRSplashVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: ViewModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"viewModule", "Lorg/koin/core/module/Module;", "getViewModule", "()Lorg/koin/core/module/Module;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewModuleKt {
    private static final Module viewModule = ModuleDSLKt.module$default(false, new Function1() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit viewModule$lambda$0;
            viewModule$lambda$0 = ViewModuleKt.viewModule$lambda$0((Module) obj);
            return viewModule$lambda$0;
        }
    }, 1, null);

    public static final Module getViewModule() {
        return viewModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewModule$lambda$0(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        Function2 function2 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRAppViewModel viewModule$lambda$0$0;
                viewModule$lambda$0$0 = ViewModuleKt.viewModule$lambda$0$0((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$0;
            }
        };
        Qualifier qualifier = null;
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRAppViewModel.class), qualifier, function2, Kind.Factory, CollectionsKt.emptyList(), null, 64, null));
        module.indexPrimaryType(factoryInstanceFactory);
        new KoinDefinition(module, factoryInstanceFactory);
        Function2 function22 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRSplashVM viewModule$lambda$0$1;
                viewModule$lambda$0$1 = ViewModuleKt.viewModule$lambda$0$1((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$1;
            }
        };
        int i = 64;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Qualifier qualifier2 = null;
        Boolean bool = null;
        FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRSplashVM.class), qualifier2, function22, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory2);
        new KoinDefinition(module, factoryInstanceFactory2);
        Function2 function23 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMROnboardingVM viewModule$lambda$0$2;
                viewModule$lambda$0$2 = ViewModuleKt.viewModule$lambda$0$2((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$2;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMROnboardingVM.class), qualifier2, function23, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory3);
        new KoinDefinition(module, factoryInstanceFactory3);
        Function2 function24 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRProductViewModel viewModule$lambda$0$3;
                viewModule$lambda$0$3 = ViewModuleKt.viewModule$lambda$0$3((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$3;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRProductViewModel.class), qualifier2, function24, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory4);
        new KoinDefinition(module, factoryInstanceFactory4);
        Function2 function25 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRProductDetailsViewModel viewModule$lambda$0$4;
                viewModule$lambda$0$4 = ViewModuleKt.viewModule$lambda$0$4((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$4;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRProductDetailsViewModel.class), qualifier2, function25, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory5);
        new KoinDefinition(module, factoryInstanceFactory5);
        Function2 function26 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRCheckoutViewModel viewModule$lambda$0$5;
                viewModule$lambda$0$5 = ViewModuleKt.viewModule$lambda$0$5((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$5;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRCheckoutViewModel.class), qualifier2, function26, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory6);
        new KoinDefinition(module, factoryInstanceFactory6);
        Function2 function27 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRCartViewModel viewModule$lambda$0$6;
                viewModule$lambda$0$6 = ViewModuleKt.viewModule$lambda$0$6((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$6;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRCartViewModel.class), qualifier2, function27, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory7);
        new KoinDefinition(module, factoryInstanceFactory7);
        Function2 function28 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.ViewModuleKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMROrderViewModel viewModule$lambda$0$7;
                viewModule$lambda$0$7 = ViewModuleKt.viewModule$lambda$0$7((Scope) obj, (ParametersHolder) obj2);
                return viewModule$lambda$0$7;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMROrderViewModel.class), qualifier2, function28, Kind.Factory, CollectionsKt.emptyList(), bool, i, defaultConstructorMarker));
        module.indexPrimaryType(factoryInstanceFactory8);
        new KoinDefinition(module, factoryInstanceFactory8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRAppViewModel viewModule$lambda$0$0(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRAppViewModel((MRKMRCartRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRCartRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRSplashVM viewModule$lambda$0$1(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRSplashVM((MRKMROnboardingRepo) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMROnboardingRepo.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROnboardingVM viewModule$lambda$0$2(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMROnboardingVM((MRKMROnboardingRepo) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMROnboardingRepo.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRProductViewModel viewModule$lambda$0$3(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRProductViewModel((MRKMRProductRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRProductRepository.class), null, null), (MRKMRCartRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRCartRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRProductDetailsViewModel viewModule$lambda$0$4(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRProductDetailsViewModel((MRKMRProductRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRProductRepository.class), null, null), (MRKMRCartRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRCartRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRCheckoutViewModel viewModule$lambda$0$5(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRCheckoutViewModel((MRKMRCartRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRCartRepository.class), null, null), (MRKMRProductRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRProductRepository.class), null, null), (MRKMROrderRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMROrderRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRCartViewModel viewModule$lambda$0$6(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRCartViewModel((MRKMRCartRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRCartRepository.class), null, null), (MRKMRProductRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMRProductRepository.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROrderViewModel viewModule$lambda$0$7(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMROrderViewModel((MRKMROrderRepository) viewModel.get(Reflection.getOrCreateKotlinClass(MRKMROrderRepository.class), null, null));
    }
}

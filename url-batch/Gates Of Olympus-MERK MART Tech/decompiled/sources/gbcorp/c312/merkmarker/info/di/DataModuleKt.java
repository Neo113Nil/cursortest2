package gbcorp.c312.merkmarker.info.di;

import gbcorp.c312.merkmarker.info.data.dao.CartItemDao;
import gbcorp.c312.merkmarker.info.data.dao.OrderDao;
import gbcorp.c312.merkmarker.info.data.datastore.MRKMROnboardingPrefs;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROnboardingRepo;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: DataModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"dataModule", "Lorg/koin/core/module/Module;", "getDataModule", "()Lorg/koin/core/module/Module;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataModuleKt {
    private static final Module dataModule = ModuleDSLKt.module$default(false, new Function1() { // from class: gbcorp.c312.merkmarker.info.di.DataModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit dataModule$lambda$0;
            dataModule$lambda$0 = DataModuleKt.dataModule$lambda$0((Module) obj);
            return dataModule$lambda$0;
        }
    }, 1, null);

    public static final Module getDataModule() {
        return dataModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dataModule$lambda$0(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        module.includes(DatabaseModuleKt.getDatabaseModule(), DataStoreModuleKt.getDataStoreModule());
        Qualifier qualifier = null;
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMROnboardingRepo.class), qualifier, new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DataModuleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMROnboardingRepo dataModule$lambda$0$0;
                dataModule$lambda$0$0 = DataModuleKt.dataModule$lambda$0$0((Scope) obj, (ParametersHolder) obj2);
                return dataModule$lambda$0$0;
            }
        }, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        Qualifier qualifier2 = null;
        SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRProductRepository.class), qualifier2, new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DataModuleKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRProductRepository dataModule$lambda$0$1;
                dataModule$lambda$0$1 = DataModuleKt.dataModule$lambda$0$1((Scope) obj, (ParametersHolder) obj2);
                return dataModule$lambda$0$1;
            }
        }, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
        module.indexPrimaryType(singleInstanceFactory4);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory3);
        }
        new KoinDefinition(module, singleInstanceFactory4);
        Qualifier qualifier3 = null;
        SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMRCartRepository.class), qualifier3, new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DataModuleKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMRCartRepository dataModule$lambda$0$2;
                dataModule$lambda$0$2 = DataModuleKt.dataModule$lambda$0$2((Scope) obj, (ParametersHolder) obj2);
                return dataModule$lambda$0$2;
            }
        }, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory6 = singleInstanceFactory5;
        module.indexPrimaryType(singleInstanceFactory6);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory5);
        }
        new KoinDefinition(module, singleInstanceFactory6);
        Qualifier qualifier4 = null;
        SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMROrderRepository.class), qualifier4, new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DataModuleKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMROrderRepository dataModule$lambda$0$3;
                dataModule$lambda$0$3 = DataModuleKt.dataModule$lambda$0$3((Scope) obj, (ParametersHolder) obj2);
                return dataModule$lambda$0$3;
            }
        }, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory8 = singleInstanceFactory7;
        module.indexPrimaryType(singleInstanceFactory8);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory7);
        }
        new KoinDefinition(module, singleInstanceFactory8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROnboardingRepo dataModule$lambda$0$0(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMROnboardingRepo((MRKMROnboardingPrefs) single.get(Reflection.getOrCreateKotlinClass(MRKMROnboardingPrefs.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), QualifierKt.named("IO"), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRProductRepository dataModule$lambda$0$1(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRProductRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRCartRepository dataModule$lambda$0$2(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMRCartRepository((CartItemDao) single.get(Reflection.getOrCreateKotlinClass(CartItemDao.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), QualifierKt.named("IO"), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROrderRepository dataModule$lambda$0$3(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMROrderRepository((OrderDao) single.get(Reflection.getOrCreateKotlinClass(OrderDao.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), QualifierKt.named("IO"), null));
    }
}

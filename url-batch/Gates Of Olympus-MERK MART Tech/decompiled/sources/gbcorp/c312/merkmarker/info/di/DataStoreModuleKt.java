package gbcorp.c312.merkmarker.info.di;

import gbcorp.c312.merkmarker.info.data.datastore.MRKMROnboardingPrefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: DataStoreModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"dataStoreModule", "Lorg/koin/core/module/Module;", "getDataStoreModule", "()Lorg/koin/core/module/Module;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataStoreModuleKt {
    private static final Module dataStoreModule = ModuleDSLKt.module$default(false, new Function1() { // from class: gbcorp.c312.merkmarker.info.di.DataStoreModuleKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit dataStoreModule$lambda$0;
            dataStoreModule$lambda$0 = DataStoreModuleKt.dataStoreModule$lambda$0((Module) obj);
            return dataStoreModule$lambda$0;
        }
    }, 1, null);

    public static final Module getDataStoreModule() {
        return dataStoreModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dataStoreModule$lambda$0(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        Function2 function2 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DataStoreModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MRKMROnboardingPrefs dataStoreModule$lambda$0$0;
                dataStoreModule$lambda$0$0 = DataStoreModuleKt.dataStoreModule$lambda$0$0((Scope) obj, (ParametersHolder) obj2);
                return dataStoreModule$lambda$0$0;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MRKMROnboardingPrefs.class), null, function2, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROnboardingPrefs dataStoreModule$lambda$0$0(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MRKMROnboardingPrefs(ModuleExtKt.androidContext(single));
    }
}

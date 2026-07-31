package gbcorp.c312.merkmarker.info.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: DispatcherModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"dispatcherModule", "Lorg/koin/core/module/Module;", "getDispatcherModule", "()Lorg/koin/core/module/Module;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DispatcherModuleKt {
    private static final Module dispatcherModule = ModuleDSLKt.module$default(false, new Function1() { // from class: gbcorp.c312.merkmarker.info.di.DispatcherModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit dispatcherModule$lambda$0;
            dispatcherModule$lambda$0 = DispatcherModuleKt.dispatcherModule$lambda$0((Module) obj);
            return dispatcherModule$lambda$0;
        }
    }, 1, null);

    public static final Module getDispatcherModule() {
        return dispatcherModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatcherModule$lambda$0(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        StringQualifier io2 = DispatchersQualifiers.INSTANCE.getIO();
        Function2 function2 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DispatcherModuleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineDispatcher dispatcherModule$lambda$0$0;
                dispatcherModule$lambda$0$0 = DispatcherModuleKt.dispatcherModule$lambda$0$0((Scope) obj, (ParametersHolder) obj2);
                return dispatcherModule$lambda$0$0;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), io2, function2, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        StringQualifier stringQualifier = DispatchersQualifiers.INSTANCE.getDefault();
        Function2 function22 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DispatcherModuleKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineDispatcher dispatcherModule$lambda$0$1;
                dispatcherModule$lambda$0$1 = DispatcherModuleKt.dispatcherModule$lambda$0$1((Scope) obj, (ParametersHolder) obj2);
                return dispatcherModule$lambda$0$1;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), stringQualifier, function22, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
        module.indexPrimaryType(singleInstanceFactory4);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory3);
        }
        new KoinDefinition(module, singleInstanceFactory4);
        StringQualifier main = DispatchersQualifiers.INSTANCE.getMain();
        Function2 function23 = new Function2() { // from class: gbcorp.c312.merkmarker.info.di.DispatcherModuleKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineDispatcher dispatcherModule$lambda$0$2;
                dispatcherModule$lambda$0$2 = DispatcherModuleKt.dispatcherModule$lambda$0$2((Scope) obj, (ParametersHolder) obj2);
                return dispatcherModule$lambda$0$2;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), main, function23, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory6 = singleInstanceFactory5;
        module.indexPrimaryType(singleInstanceFactory6);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory5);
        }
        new KoinDefinition(module, singleInstanceFactory6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineDispatcher dispatcherModule$lambda$0$0(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return Dispatchers.getIO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineDispatcher dispatcherModule$lambda$0$1(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return Dispatchers.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineDispatcher dispatcherModule$lambda$0$2(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return Dispatchers.getMain();
    }
}

package org.koin.androidx.fragment.koin;

import androidx.fragment.app.FragmentFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.fragment.android.KoinFragmentFactory;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: KoinApplicationExt.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"fragmentFactoryModule", "Lorg/koin/core/module/Module;", "fragmentFactory", "", "Lorg/koin/core/KoinApplication;", "koin-android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinApplicationExtKt {
    private static final Module fragmentFactoryModule = ModuleDSLKt.module$default(false, new Function1() { // from class: org.koin.androidx.fragment.koin.KoinApplicationExtKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit fragmentFactoryModule$lambda$0;
            fragmentFactoryModule$lambda$0 = KoinApplicationExtKt.fragmentFactoryModule$lambda$0((Module) obj);
            return fragmentFactoryModule$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fragmentFactoryModule$lambda$0(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        Function2 function2 = new Function2() { // from class: org.koin.androidx.fragment.koin.KoinApplicationExtKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FragmentFactory fragmentFactoryModule$lambda$0$0;
                fragmentFactoryModule$lambda$0$0 = KoinApplicationExtKt.fragmentFactoryModule$lambda$0$0((Scope) obj, (ParametersHolder) obj2);
                return fragmentFactoryModule$lambda$0$0;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FragmentFactory.class), null, function2, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentFactory fragmentFactoryModule$lambda$0$0(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new KoinFragmentFactory(null, 1, null);
    }

    public static final void fragmentFactory(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Koin.loadModules$default(koinApplication.getKoin(), CollectionsKt.listOf(fragmentFactoryModule), false, false, 6, null);
    }
}

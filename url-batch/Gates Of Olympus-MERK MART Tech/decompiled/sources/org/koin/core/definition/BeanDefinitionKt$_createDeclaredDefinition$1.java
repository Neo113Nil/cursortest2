package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: BeanDefinition.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class BeanDefinitionKt$_createDeclaredDefinition$1<T> implements Function2<Scope, ParametersHolder, T> {
    public static final BeanDefinitionKt$_createDeclaredDefinition$1 INSTANCE;

    static {
        Intrinsics.needClassReification();
        INSTANCE = new BeanDefinitionKt$_createDeclaredDefinition$1();
    }

    @Override // kotlin.jvm.functions.Function2
    public final T invoke(Scope BeanDefinition, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(BeanDefinition, "$this$BeanDefinition");
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("declared instance error ".toString());
    }
}

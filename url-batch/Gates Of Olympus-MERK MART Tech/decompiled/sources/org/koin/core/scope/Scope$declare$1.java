package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.ext.KClassExtKt;

/* compiled from: Scope.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class Scope$declare$1 implements Function0<Unit> {
    final /* synthetic */ boolean $allowOverride;
    final /* synthetic */ boolean $holdInstance;
    final /* synthetic */ T $instance;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ List<KClass<?>> $secondaryTypes;
    final /* synthetic */ Scope this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public Scope$declare$1(Scope scope, T t, Qualifier qualifier, List<? extends KClass<?>> list, boolean z, boolean z2) {
        this.this$0 = scope;
        this.$instance = t;
        this.$qualifier = qualifier;
        this.$secondaryTypes = list;
        this.$allowOverride = z;
        this.$holdInstance = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        char c;
        boolean z;
        String str2;
        InstanceRegistry instanceRegistry = this.this$0.get_koin().getInstanceRegistry();
        final T t = this.$instance;
        Qualifier scopeQualifier = this.this$0.getScopeQualifier();
        String id = this.this$0.getId();
        Qualifier qualifier = this.$qualifier;
        List<KClass<?>> list = this.$secondaryTypes;
        boolean z2 = this.$allowOverride;
        boolean z3 = this.$holdInstance;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        StringBuilder sb = new StringBuilder();
        sb.append(KClassExtKt.getFullName(orCreateKotlinClass));
        sb.append(AbstractJsonLexerKt.COLON);
        if (qualifier == null || (str = qualifier.getValue()) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(scopeQualifier);
        String sb2 = sb.toString();
        InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(sb2);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            scopedInstanceFactory.saveValue(id, t);
            return;
        }
        Intrinsics.needClassReification();
        Function2 function2 = !z3 ? new Function2<Scope, ParametersHolder, T>() { // from class: org.koin.core.scope.Scope$declare$1$invoke$$inlined$scopeDeclaredInstance$1
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(Scope scope, ParametersHolder it) {
                Intrinsics.checkNotNullParameter(scope, "<this>");
                Intrinsics.checkNotNullParameter(it, "it");
                throw new IllegalStateException(("Declared definition of type '" + KClass.this + "' shouldn't be executed").toString());
            }
        } : new Function2<Scope, ParametersHolder, T>() { // from class: org.koin.core.scope.Scope$declare$1$invoke$$inlined$scopeDeclaredInstance$2
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(Scope scope, ParametersHolder it) {
                Intrinsics.checkNotNullParameter(scope, "<this>");
                Intrinsics.checkNotNullParameter(it, "it");
                return (T) t;
            }
        };
        Kind kind = Kind.Scoped;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list, null, 64, null);
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition, z3);
        boolean areEqual = Intrinsics.areEqual((Object) scopedInstanceFactory2.getBeanDefinition().getAllowOverride(), (Object) true);
        if (z2 || areEqual) {
            c = ':';
            z = true;
        } else {
            c = ':';
            z = false;
        }
        ScopedInstanceFactory scopedInstanceFactory3 = scopedInstanceFactory2;
        char c2 = c;
        InstanceRegistry.saveMapping$default(instanceRegistry, z, sb2, scopedInstanceFactory3, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            Qualifier qualifier2 = beanDefinition.getQualifier();
            Qualifier scopeQualifier2 = beanDefinition.getScopeQualifier();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(KClassExtKt.getFullName(kClass));
            sb3.append(c2);
            if (qualifier2 == null || (str2 = qualifier2.getValue()) == null) {
                str2 = "";
            }
            sb3.append(str2);
            sb3.append(c2);
            sb3.append(scopeQualifier2);
            InstanceRegistry.saveMapping$default(instanceRegistry, z2 || areEqual, sb3.toString(), scopedInstanceFactory3, false, 8, null);
        }
        scopedInstanceFactory2.saveValue(id, t);
    }
}

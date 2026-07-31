package org.koin.core.resolution;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ResolutionContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* compiled from: CoreResolverV2.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J#\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J%\u0010\u0017\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J%\u0010\u0019\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J\u001e\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J%\u0010\u001c\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J%\u0010\u001d\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J\u001e\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u001e\u0010\u001f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0082\b¢\u0006\u0002\u0010 J&\u0010!\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0082\b¢\u0006\u0002\u0010\u0015J\u001c\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0082\b¢\u0006\u0002\u0010 J%\u0010#\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lorg/koin/core/resolution/CoreResolverV2;", "Lorg/koin/core/resolution/InstanceResolver;", "_koin", "Lorg/koin/core/Koin;", "<init>", "(Lorg/koin/core/Koin;)V", "extendedResolution", "Ljava/util/ArrayList;", "Lorg/koin/core/resolution/ResolutionExtension;", "Lkotlin/collections/ArrayList;", "getExtendedResolution", "()Ljava/util/ArrayList;", "addResolutionExtension", "", "resolutionExtension", "resolveFromContext", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Lorg/koin/core/scope/Scope;", "instanceContext", "Lorg/koin/core/instance/ResolutionContext;", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "resolveFromContextOrNull", "resolveFromRegistry", "ctx", "resolveDirectDefinition", "resolveFromScopeArchetype", "Lorg/koin/core/instance/InstanceFactory;", "resolveFromScopeSource", "resolveFromLinkedScopes", "findDefinitionInScope", "resolveFromInjectedParameters", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "resolveFromStackedParameters", "throwNoDefinitionFound", "resolveInExtensions", "koin-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreResolverV2 implements InstanceResolver {
    private final Koin _koin;
    private final ArrayList<ResolutionExtension> extendedResolution;

    public CoreResolverV2(Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this.extendedResolution = new ArrayList<>();
    }

    @Override // org.koin.core.resolution.InstanceResolver
    public ArrayList<ResolutionExtension> getExtendedResolution() {
        return this.extendedResolution;
    }

    @Override // org.koin.core.resolution.InstanceResolver
    public void addResolutionExtension(ResolutionExtension resolutionExtension) {
        Intrinsics.checkNotNullParameter(resolutionExtension, "resolutionExtension");
        getExtendedResolution().add(resolutionExtension);
    }

    @Override // org.koin.core.resolution.InstanceResolver
    public <T> T resolveFromContext(Scope scope, ResolutionContext instanceContext) {
        String str;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        T t = (T) resolveFromContextOrNull(scope, instanceContext);
        if (t != null) {
            return t;
        }
        Qualifier qualifier = instanceContext.getQualifier();
        if (qualifier == null || (str = " and qualifier '" + qualifier + '\'') == null) {
            str = "";
        }
        throw new NoDefinitionFoundException("No definition found for type '" + KClassExtKt.getFullName(instanceContext.getClazz()) + '\'' + str + " on scope '" + instanceContext.getScope() + "'. Check your Modules configuration and add missing type and/or qualifier!");
    }

    private final <T> T resolveFromRegistry(Scope scope, ResolutionContext ctx) {
        T t = (T) resolveDirectDefinition(scope, ctx);
        return (t == null && (t = (T) resolveFromScopeSource(scope, ctx)) == null) ? (T) resolveFromLinkedScopes(scope, ctx) : t;
    }

    private final <T> T resolveDirectDefinition(Scope scope, ResolutionContext ctx) {
        InstanceFactory<?> resolveDefinition$koin_core = this._koin.getInstanceRegistry().resolveDefinition$koin_core(ctx.getClazz(), ctx.getQualifier(), scope.getScopeQualifier());
        if (resolveDefinition$koin_core == null) {
            resolveDefinition$koin_core = resolveFromScopeArchetype(scope, ctx);
        }
        if (resolveDefinition$koin_core != null) {
            return (T) resolveDefinition$koin_core.get(ctx);
        }
        return null;
    }

    private final InstanceFactory<?> resolveFromScopeArchetype(Scope scope, ResolutionContext ctx) {
        TypeQualifier scopeArchetype;
        if (scope.getIsRoot() || (scopeArchetype = scope.getScopeArchetype()) == null) {
            return null;
        }
        ctx.setScopeArchetype(scopeArchetype);
        return this._koin.getInstanceRegistry().resolveDefinition$koin_core(ctx.getClazz(), ctx.getQualifier(), scopeArchetype);
    }

    private final <T> T resolveFromScopeSource(Scope scope, ResolutionContext ctx) {
        T t;
        if (scope.getIsRoot() || ctx.getQualifier() != null || !ctx.getClazz().isInstance(scope.getSourceValue()) || (t = (T) scope.getSourceValue()) == null) {
            return null;
        }
        return t;
    }

    private final <T> T resolveFromLinkedScopes(Scope scope, ResolutionContext ctx) {
        InstanceFactory<?> instanceFactory;
        Iterator<T> it = CollectionsKt.plus((Collection) CollectionsKt.listOf(scope), (Iterable) CoreResolverKt.flatten(scope.getLinkedScopes$koin_core())).iterator();
        Scope scope2 = null;
        while (true) {
            if (!it.hasNext()) {
                instanceFactory = null;
                break;
            }
            Scope scope3 = (Scope) it.next();
            instanceFactory = findDefinitionInScope(scope3, ctx);
            if (instanceFactory != null) {
                scope2 = scope3;
            }
            if (instanceFactory != null) {
                break;
            }
        }
        if (scope2 == null || instanceFactory == null) {
            return null;
        }
        ResolutionContext newContextForScope = ctx.newContextForScope(scope2);
        if (scope2.getScopeArchetype() != null && !scope2.getIsRoot()) {
            newContextForScope.setScopeArchetype(scope2.getScopeArchetype());
        }
        ArrayDeque<ParametersHolder> onParameterOnStack$koin_core = newContextForScope.getParameters() != null ? newContextForScope.getScope().onParameterOnStack$koin_core(newContextForScope.getParameters()) : null;
        T t = (T) instanceFactory.get(newContextForScope);
        if (onParameterOnStack$koin_core != null) {
            newContextForScope.getScope().clearParameterStack$koin_core(onParameterOnStack$koin_core);
        }
        return t;
    }

    private final InstanceFactory<?> findDefinitionInScope(Scope scope, ResolutionContext ctx) {
        InstanceFactory<?> resolveDefinition$koin_core;
        TypeQualifier scopeArchetype = scope.getScopeArchetype();
        return (scopeArchetype == null || (resolveDefinition$koin_core = this._koin.getInstanceRegistry().resolveDefinition$koin_core(ctx.getClazz(), ctx.getQualifier(), scopeArchetype)) == null) ? this._koin.getInstanceRegistry().resolveDefinition$koin_core(ctx.getClazz(), ctx.getQualifier(), scope.getScopeQualifier()) : resolveDefinition$koin_core;
    }

    private final <T> T resolveFromInjectedParameters(ResolutionContext ctx) {
        if (ctx.getParameters() == null || ctx.getParameters().isEmpty()) {
            return null;
        }
        return (T) ctx.getParameters().getOrNull(ctx.getClazz());
    }

    private final <T> T resolveFromStackedParameters(Scope scope, ResolutionContext ctx) {
        ParametersHolder firstOrNull;
        ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal = scope.get_parameterStack$koin_core();
        if (threadLocal == null) {
            return null;
        }
        ArrayDeque<ParametersHolder> arrayDeque = threadLocal.get();
        ArrayDeque<ParametersHolder> arrayDeque2 = arrayDeque;
        if (arrayDeque2 == null || arrayDeque2.isEmpty() || (firstOrNull = arrayDeque.firstOrNull()) == null) {
            return null;
        }
        return (T) firstOrNull.getOrNull(ctx.getClazz());
    }

    private final <T> T throwNoDefinitionFound(ResolutionContext ctx) {
        String str;
        Qualifier qualifier = ctx.getQualifier();
        if (qualifier == null || (str = " and qualifier '" + qualifier + '\'') == null) {
            str = "";
        }
        throw new NoDefinitionFoundException("No definition found for type '" + KClassExtKt.getFullName(ctx.getClazz()) + '\'' + str + " on scope '" + ctx.getScope() + "'. Check your Modules configuration and add missing type and/or qualifier!");
    }

    private final <T> T resolveInExtensions(Scope scope, ResolutionContext ctx) {
        for (ResolutionExtension resolutionExtension : getExtendedResolution()) {
            ctx.getLogger().debug("|- ['" + resolutionExtension.getName() + "'] ?");
            T t = (T) resolutionExtension.resolve(scope, ctx);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T resolveFromContextOrNull(Scope scope, ResolutionContext instanceContext) {
        ParametersHolder firstOrNull;
        T t = null;
        T t2 = (instanceContext.getParameters() == null || instanceContext.getParameters().isEmpty()) ? null : (T) instanceContext.getParameters().getOrNull(instanceContext.getClazz());
        if (t2 != null) {
            return t2;
        }
        ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal = scope.get_parameterStack$koin_core();
        if (threadLocal != null) {
            ArrayDeque<ParametersHolder> arrayDeque = threadLocal.get();
            ArrayDeque<ParametersHolder> arrayDeque2 = arrayDeque;
            if (arrayDeque2 != null && !arrayDeque2.isEmpty() && (firstOrNull = arrayDeque.firstOrNull()) != null) {
                t = firstOrNull.getOrNull(instanceContext.getClazz());
            }
        }
        if (t != null) {
            return t;
        }
        T t3 = (T) resolveFromRegistry(scope, instanceContext);
        return t3 == null ? (T) resolveInExtensions(scope, instanceContext) : t3;
    }
}

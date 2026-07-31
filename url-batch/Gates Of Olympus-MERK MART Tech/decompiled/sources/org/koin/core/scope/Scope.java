package org.koin.core.scope;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import org.koin.core.Koin;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.MissingScopeValueException;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.core.instance.ResolutionContext;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.time.DurationExtKt;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;

/* compiled from: Scope.kt */
@KoinDslMarker
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010 \u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070!H\u0007J\t\u0010*\u001a\u00020\tH\u0086\bJ\u001b\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00000!H\u0000¢\u0006\u0002\bEJ\u001f\u0010F\u001a\u00020C2\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000H\"\u00020\u0000¢\u0006\u0002\u0010IJ\u001f\u0010J\u001a\u00020C2\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000H\"\u00020\u0000¢\u0006\u0002\u0010IJL\u0010K\u001a\b\u0012\u0004\u0012\u0002HM0L\"\n\b\u0000\u0010M\u0018\u0001*\u00020\u00012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010O\u001a\u00020P2\u0016\b\n\u0010Q\u001a\u0010\u0012\u0004\u0012\u000202\u0018\u00010Rj\u0004\u0018\u0001`SH\u0086\bø\u0001\u0000JN\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HM0L\"\n\b\u0000\u0010M\u0018\u0001*\u00020\u00012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010O\u001a\u00020P2\u0016\b\n\u0010Q\u001a\u0010\u0012\u0004\u0012\u000202\u0018\u00010Rj\u0004\u0018\u0001`SH\u0086\bø\u0001\u0000JA\u0010U\u001a\u0002HM\"\n\b\u0000\u0010M\u0018\u0001*\u00020\u00012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\u0016\b\n\u0010Q\u001a\u0010\u0012\u0004\u0012\u000202\u0018\u00010Rj\u0004\u0018\u0001`SH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010VJ\u001c\u0010W\u001a\u0004\u0018\u0001HM\"\n\b\u0000\u0010M\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010%JC\u0010X\u001a\u0004\u0018\u0001HM\"\n\b\u0000\u0010M\u0018\u0001*\u00020\u00012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\u0016\b\n\u0010Q\u001a\u0010\u0012\u0004\u0012\u000202\u0018\u00010Rj\u0004\u0018\u0001`SH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010VJC\u0010X\u001a\u0004\u0018\u0001HM\"\u0004\b\u0000\u0010M2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010Q\u001a\u0010\u0012\u0004\u0012\u000202\u0018\u00010Rj\u0004\u0018\u0001`S¢\u0006\u0002\u0010[J\u001f\u0010X\u001a\u0004\u0018\u0001HM\"\u0004\b\u0000\u0010M2\u0006\u0010\\\u001a\u00020]H\u0000¢\u0006\u0004\b^\u0010_JA\u0010U\u001a\u0002HM\"\u0004\b\u0000\u0010M2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010Q\u001a\u0010\u0012\u0004\u0012\u000202\u0018\u00010Rj\u0004\u0018\u0001`S¢\u0006\u0002\u0010[J7\u0010`\u001a\u0002HM\"\u0004\b\u0000\u0010M2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010Q\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0002\u0010aJ5\u0010b\u001a\u0002HM\"\u0004\b\u0000\u0010M2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\b\u0010N\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010Q\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0002\u0010aJ\u001f\u0010c\u001a\u00020C2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\b\u0010N\u001a\u0004\u0018\u00010\u0004H\u0082\bJ$\u0010d\u001a\u00020C2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\u0006\u0010e\u001a\u00020fH\u0082\b¢\u0006\u0004\bg\u0010hJ3\u0010i\u001a\u0002HM\"\u0004\b\u0000\u0010M2\b\u0010N\u001a\u0004\u0018\u00010\u00042\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030Z2\b\u0010Q\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0002\u0010jJ\t\u0010k\u001a\u00020CH\u0082\bJ%\u0010l\u001a\u0002HM\"\u0004\b\u0000\u0010M2\b\u0010Q\u001a\u0004\u0018\u0001022\u0006\u0010m\u001a\u00020]H\u0002¢\u0006\u0002\u0010nJ\u001b\u0010o\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010Q\u001a\u000202H\u0000¢\u0006\u0002\bpJ\u001b\u0010q\u001a\u00020C2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020201H\u0000¢\u0006\u0002\bsJ\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u001b\u0010u\u001a\u0002HM\"\u0004\b\u0000\u0010M2\u0006\u0010m\u001a\u00020]H\u0002¢\u0006\u0002\u0010_JR\u0010v\u001a\u00020C\"\u0006\b\u0000\u0010M\u0018\u00012\u0006\u0010w\u001a\u0002HM2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010x\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030Z0!2\b\b\u0002\u0010y\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\tH\u0086\b¢\u0006\u0002\u0010{J\u0006\u0010|\u001a\u00020\rJ\u0012\u0010}\u001a\u00020\u00002\n\u0010~\u001a\u00060\u0006j\u0002`\u0007J\u000f\u0010\u007f\u001a\u00020C2\u0007\u0010\u0080\u0001\u001a\u00020-J\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u0002HM0!\"\n\b\u0000\u0010M\u0018\u0001*\u00020\u0001H\u0086\bJ\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u0002HM0!\"\u0004\b\u0000\u0010M2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030ZJ)\u0010\u0082\u0001\u001a\u0002HM\"\b\b\u0000\u0010M*\u00020\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u0002HM¢\u0006\u0003\u0010\u0085\u0001J\"\u0010\u0086\u0001\u001a\u0004\u0018\u0001HM\"\b\b\u0000\u0010M*\u00020\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0006¢\u0006\u0003\u0010\u0087\u0001J \u0010\u0082\u0001\u001a\u0002HM\"\b\b\u0000\u0010M*\u00020\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0006¢\u0006\u0003\u0010\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020CJ\u000b\u0010\u0089\u0001\u001a\u00020\u0006H\u0096\u0080\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u001cj\b\u0012\u0004\u0012\u00020\u0000`\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR&\u0010\"\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010/\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u000100j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u0001`38\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u00109\u0012\u0004\b4\u0010\u0018\u001a\u0004\b5\u00106\"\u0004\b7\u00108R6\u0010:\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020100j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201`38@X\u0081\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0018\u001a\u0004\b<\u00106R\u000e\u0010=\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lorg/koin/core/scope/Scope;", "", "Lorg/koin/mp/Lockable;", "scopeQualifier", "Lorg/koin/core/qualifier/Qualifier;", "id", "", "Lorg/koin/core/scope/ScopeID;", "isRoot", "", "scopeArchetype", "Lorg/koin/core/qualifier/TypeQualifier;", "_koin", "Lorg/koin/core/Koin;", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Ljava/lang/String;ZLorg/koin/core/qualifier/TypeQualifier;Lorg/koin/core/Koin;)V", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getId", "()Ljava/lang/String;", "()Z", "getScopeArchetype", "()Lorg/koin/core/qualifier/TypeQualifier;", "get_koin$annotations", "()V", "get_koin", "()Lorg/koin/core/Koin;", "linkedScopes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLinkedScopes$koin_core", "()Ljava/util/ArrayList;", "getLinkedScopeIds", "", "sourceValue", "getSourceValue$annotations", "getSourceValue", "()Ljava/lang/Object;", "setSourceValue", "(Ljava/lang/Object;)V", "closed", "getClosed", "isNotClosed", "_callbacks", "Ljava/util/LinkedHashSet;", "Lorg/koin/core/scope/ScopeCallback;", "Lkotlin/collections/LinkedHashSet;", "_parameterStack", "Ljava/lang/ThreadLocal;", "Lkotlin/collections/ArrayDeque;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/mp/ThreadLocal;", "get_parameterStack$koin_core$annotations", "get_parameterStack$koin_core", "()Ljava/lang/ThreadLocal;", "set_parameterStack$koin_core", "(Ljava/lang/ThreadLocal;)V", "Ljava/lang/ThreadLocal;", "parameterStack", "getParameterStack$koin_core$annotations", "getParameterStack$koin_core", "_closed", "logger", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "create", "", "links", "create$koin_core", "linkTo", "scopes", "", "([Lorg/koin/core/scope/Scope;)V", "unlink", "inject", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "qualifier", "mode", "Lkotlin/LazyThreadSafetyMode;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getSource", "getOrNull", "clazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ctx", "Lorg/koin/core/instance/ResolutionContext;", "getOrNull$koin_core", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "getWithParameters", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "resolve", "logInstanceRequest", "logInstanceDuration", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "logInstanceDuration-HG0u8IE", "(Lkotlin/reflect/KClass;J)V", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "checkScopeIsOpen", "stackParametersCall", "instanceContext", "(Lorg/koin/core/parameter/ParametersHolder;Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "onParameterOnStack", "onParameterOnStack$koin_core", "clearParameterStack", "stack", "clearParameterStack$koin_core", "getOrCreateParameterStack", "resolveFromContext", "declare", "instance", "secondaryTypes", "allowOverride", "holdInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;ZZ)V", "getKoin", "getScope", "scopeID", "registerCallback", "callback", "getAll", "getProperty", "key", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "(Ljava/lang/String;)Ljava/lang/Object;", "close", "toString", "koin-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Scope {
    private final LinkedHashSet<ScopeCallback> _callbacks;
    private boolean _closed;
    private final Koin _koin;
    private volatile ThreadLocal<ArrayDeque<ParametersHolder>> _parameterStack;
    private final String id;
    private final boolean isRoot;
    private final ArrayList<Scope> linkedScopes;
    private final TypeQualifier scopeArchetype;
    private final Qualifier scopeQualifier;
    private Object sourceValue;

    public static /* synthetic */ void getParameterStack$koin_core$annotations() {
    }

    public static /* synthetic */ void getSourceValue$annotations() {
    }

    public static /* synthetic */ void get_koin$annotations() {
    }

    public static /* synthetic */ void get_parameterStack$koin_core$annotations() {
    }

    public Scope(Qualifier scopeQualifier, String id, boolean z, TypeQualifier typeQualifier, Koin _koin) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.scopeQualifier = scopeQualifier;
        this.id = id;
        this.isRoot = z;
        this.scopeArchetype = typeQualifier;
        this._koin = _koin;
        this.linkedScopes = new ArrayList<>();
        this._callbacks = new LinkedHashSet<>();
    }

    public /* synthetic */ Scope(Qualifier qualifier, String str, boolean z, TypeQualifier typeQualifier, Koin koin, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : typeQualifier, koin);
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    public final TypeQualifier getScopeArchetype() {
        return this.scopeArchetype;
    }

    public final Koin get_koin() {
        return this._koin;
    }

    public final ArrayList<Scope> getLinkedScopes$koin_core() {
        return this.linkedScopes;
    }

    public final List<String> getLinkedScopeIds() {
        ArrayList<Scope> arrayList = this.linkedScopes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Scope) it.next()).id);
        }
        return arrayList2;
    }

    public final Object getSourceValue() {
        return this.sourceValue;
    }

    public final void setSourceValue(Object obj) {
        this.sourceValue = obj;
    }

    /* renamed from: getClosed, reason: from getter */
    public final boolean get_closed() {
        return this._closed;
    }

    public final boolean isNotClosed() {
        return !get_closed();
    }

    public final ThreadLocal<ArrayDeque<ParametersHolder>> get_parameterStack$koin_core() {
        return this._parameterStack;
    }

    public final void set_parameterStack$koin_core(ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal) {
        this._parameterStack = threadLocal;
    }

    public final ThreadLocal<ArrayDeque<ParametersHolder>> getParameterStack$koin_core() {
        ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal = this._parameterStack;
        return threadLocal == null ? (ThreadLocal) KoinPlatformTools.INSTANCE.m11445synchronized(this, new Function0() { // from class: org.koin.core.scope.Scope$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ThreadLocal _get_parameterStack_$lambda$0;
                _get_parameterStack_$lambda$0 = Scope._get_parameterStack_$lambda$0(Scope.this);
                return _get_parameterStack_$lambda$0;
            }
        }) : threadLocal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadLocal _get_parameterStack_$lambda$0(Scope scope) {
        ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal = scope._parameterStack;
        if (threadLocal != null) {
            return threadLocal;
        }
        ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal2 = new ThreadLocal<>();
        scope._parameterStack = threadLocal2;
        return threadLocal2;
    }

    public final Logger getLogger() {
        return this._koin.getLogger();
    }

    public final void create$koin_core(List<Scope> links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.linkedScopes.addAll(links);
    }

    public final void linkTo(Scope... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (!this.isRoot) {
            this.linkedScopes.addAll(0, ArraysKt.toList(scopes));
            return;
        }
        throw new IllegalStateException("Can't add scope link to a root scope".toString());
    }

    public final void unlink(Scope... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (!this.isRoot) {
            CollectionsKt.removeAll(this.linkedScopes, scopes);
            return;
        }
        throw new IllegalStateException("Can't remove scope link to a root scope".toString());
    }

    public static /* synthetic */ Lazy inject$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Scope$inject$1(scope, qualifier, function0));
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Scope$inject$1(this, qualifier, parameters));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Scope$injectOrNull$1(scope, qualifier, function0));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Scope$injectOrNull$1(this, qualifier, parameters));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    public final /* synthetic */ <T> T getSource() {
        T t = (T) getSourceValue();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.getOrNull(kClass, qualifier, function0);
    }

    public final <T> T getOrNull(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            return (T) get(clazz, qualifier, parameters);
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("* Scope closed - no instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this);
            return null;
        } catch (MissingScopeValueException unused2) {
            this._koin.getLogger().debug("* No Scoped value found for type '" + KClassExtKt.getFullName(clazz) + "' on scope '" + this + '\'');
            return null;
        } catch (NoDefinitionFoundException unused3) {
            this._koin.getLogger().debug("* No instance found for type '" + KClassExtKt.getFullName(clazz) + "' on scope '" + this + '\'');
            return null;
        }
    }

    public final <T> T getOrNull$koin_core(ResolutionContext ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            return (T) getWithParameters(ctx.getClazz(), ctx.getQualifier(), ctx.getParameters());
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("* Scope closed - no instance found for " + KClassExtKt.getFullName(ctx.getClazz()) + " on scope " + this);
            return null;
        } catch (NoDefinitionFoundException unused2) {
            this._koin.getLogger().debug("* No instance found for type '" + KClassExtKt.getFullName(ctx.getClazz()) + "' on scope '" + this + '\'');
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.get(kClass, qualifier, function0);
    }

    public final <T> T get(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) resolve(clazz, qualifier, parameters != null ? parameters.invoke() : null);
    }

    public static /* synthetic */ Object getWithParameters$default(Scope scope, KClass kClass, Qualifier qualifier, ParametersHolder parametersHolder, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            parametersHolder = null;
        }
        return scope.getWithParameters(kClass, qualifier, parametersHolder);
    }

    public final <T> T getWithParameters(KClass<?> clazz, Qualifier qualifier, ParametersHolder parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) resolve(clazz, qualifier, parameters);
    }

    static /* synthetic */ Object resolve$default(Scope scope, KClass kClass, Qualifier qualifier, ParametersHolder parametersHolder, int i, Object obj) {
        if ((i & 4) != 0) {
            parametersHolder = null;
        }
        return scope.resolve(kClass, qualifier, parametersHolder);
    }

    private final <T> T resolve(KClass<?> clazz, Qualifier qualifier, ParametersHolder parameters) {
        String str;
        if (this._koin.getLogger().getLevel().compareTo(Level.DEBUG) > 0) {
            return (T) resolveInstance(qualifier, clazz, parameters);
        }
        if (qualifier == null || (str = " with qualifier '" + qualifier + '\'') == null) {
            str = "";
        }
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + '\'' + str + (this.isRoot ? "" : " - scope:'" + this.id + '\'') + "...");
        TimedValue timedValue = new TimedValue(resolveInstance(qualifier, clazz, parameters), TimeSource.Monotonic.ValueTimeMark.m11057elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m11052markNowz9LOYto()), null);
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + "' in " + DurationExtKt.m11443getInMsLRDsOJo(timedValue.m11074getDurationUwyO8pc()) + " ms");
        return (T) timedValue.getValue();
    }

    private final void logInstanceRequest(KClass<?> clazz, Qualifier qualifier) {
        String str;
        if (qualifier == null || (str = " with qualifier '" + qualifier + '\'') == null) {
            str = "";
        }
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + '\'' + str + (this.isRoot ? "" : " - scope:'" + this.id + '\'') + "...");
    }

    /* renamed from: logInstanceDuration-HG0u8IE, reason: not valid java name */
    private final void m11442logInstanceDurationHG0u8IE(KClass<?> clazz, long duration) {
        this._koin.getLogger().display(Level.DEBUG, "|- '" + KClassExtKt.getFullName(clazz) + "' in " + DurationExtKt.m11443getInMsLRDsOJo(duration) + " ms");
    }

    private final void checkScopeIsOpen() {
        if (this._closed) {
            throw new ClosedScopeException("Scope '" + this.id + "' is closed");
        }
    }

    private final <T> T stackParametersCall(ParametersHolder parameters, ResolutionContext instanceContext) {
        if (parameters == null) {
            return (T) resolveFromContext(instanceContext);
        }
        Logger logger = this._koin.getLogger();
        Level level = Level.DEBUG;
        if (logger.getLevel().compareTo(level) <= 0) {
            logger.display(level, "| >> parameters " + parameters);
        }
        ArrayDeque<ParametersHolder> onParameterOnStack$koin_core = onParameterOnStack$koin_core(parameters);
        try {
            return (T) resolveFromContext(instanceContext);
        } finally {
            this._koin.getLogger().debug("| << parameters");
            clearParameterStack$koin_core(onParameterOnStack$koin_core);
        }
    }

    public final ArrayDeque<ParametersHolder> onParameterOnStack$koin_core(ParametersHolder parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        ArrayDeque<ParametersHolder> orCreateParameterStack = getOrCreateParameterStack();
        orCreateParameterStack.addFirst(parameters);
        return orCreateParameterStack;
    }

    public final void clearParameterStack$koin_core(ArrayDeque<ParametersHolder> stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        stack.removeFirstOrNull();
        if (stack.isEmpty()) {
            getParameterStack$koin_core().remove();
        }
    }

    private final ArrayDeque<ParametersHolder> getOrCreateParameterStack() {
        ArrayDeque<ParametersHolder> arrayDeque = getParameterStack$koin_core().get();
        if (arrayDeque != null) {
            return arrayDeque;
        }
        ArrayDeque<ParametersHolder> arrayDeque2 = new ArrayDeque<>();
        getParameterStack$koin_core().set(arrayDeque2);
        return arrayDeque2;
    }

    private final <T> T resolveFromContext(ResolutionContext instanceContext) {
        return (T) this._koin.getResolver().resolveFromContext(this, instanceContext);
    }

    public static /* synthetic */ void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List secondaryTypes = list;
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m11445synchronized(scope, new Scope$declare$1(scope, obj, qualifier2, secondaryTypes, z3, z2));
    }

    public final /* synthetic */ <T> void declare(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride, boolean holdInstance) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m11445synchronized(this, new Scope$declare$1(this, instance, qualifier, secondaryTypes, allowOverride, holdInstance));
    }

    /* renamed from: getKoin, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    public final Scope getScope(String scopeID) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        return get_koin().getScope(scopeID);
    }

    public final void registerCallback(ScopeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this._callbacks.add(callback);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> List<T> getAll(KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ResolutionContext resolutionContext = new ResolutionContext(this._koin.getLogger(), this, clazz, null, null, 24, null);
        resolutionContext.setScopeArchetype(this.scopeArchetype);
        List<T> all$koin_core = this._koin.getInstanceRegistry().getAll$koin_core(clazz, resolutionContext);
        ArrayList<Scope> arrayList = this.linkedScopes;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Scope) it.next()).getAll(clazz));
        }
        return CollectionsKt.plus((Collection) all$koin_core, (Iterable) arrayList2);
    }

    public final <T> T getProperty(String key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (T) this._koin.getProperty(key, defaultValue);
    }

    public final <T> T getPropertyOrNull(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this._koin.getProperty(key);
    }

    public final <T> T getProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this._koin.getProperty(key);
        if (t != null) {
            return t;
        }
        throw new MissingPropertyException("Property '" + key + "' not found");
    }

    public final void close() {
        KoinPlatformTools.INSTANCE.m11445synchronized(this, new Function0() { // from class: org.koin.core.scope.Scope$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit close$lambda$0;
                close$lambda$0 = Scope.close$lambda$0(Scope.this);
                return close$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit close$lambda$0(Scope scope) {
        ArrayDeque<ParametersHolder> arrayDeque;
        scope._koin.getLogger().debug("|- (-) Scope - id:'" + scope.id + '\'');
        Iterator<T> it = scope._callbacks.iterator();
        while (it.hasNext()) {
            ((ScopeCallback) it.next()).onScopeClose(scope);
        }
        scope._callbacks.clear();
        scope._closed = true;
        scope.sourceValue = null;
        ThreadLocal<ArrayDeque<ParametersHolder>> threadLocal = scope._parameterStack;
        if (threadLocal != null && (arrayDeque = threadLocal.get()) != null) {
            arrayDeque.clear();
        }
        scope._parameterStack = null;
        scope._koin.getScopeRegistry().deleteScope$koin_core(scope);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "['" + this.id + "']";
    }

    private final <T> T resolveInstance(Qualifier qualifier, KClass<?> clazz, ParametersHolder parameters) {
        if (!this._closed) {
            return (T) stackParametersCall(parameters, new ResolutionContext(this._koin.getLogger(), this, clazz, qualifier, parameters));
        }
        throw new ClosedScopeException("Scope '" + this.id + "' is closed");
    }
}

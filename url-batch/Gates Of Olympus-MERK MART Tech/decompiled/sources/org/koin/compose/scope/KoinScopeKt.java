package org.koin.compose.scope;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.FunctionKeyMeta;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.ComposeContextWrapper;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;

/* compiled from: KoinScope.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a>\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0013\b\b\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a:\u0010\u0000\u001a\u00020\u00012\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0013\b\b\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a(\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00052\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0001¢\u0006\u0002\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"KoinScope", "", "scopeDefinition", "Lkotlin/Function1;", "Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "Lkotlin/ExtensionFunctionType;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", ExifInterface.GPS_DIRECTION_TRUE, "", "scopeID", "", "Lorg/koin/core/scope/ScopeID;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "scopeQualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Ljava/lang/String;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OnKoinScope", "scope", "(Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "koin-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinScope$lambda$0(Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        KoinScope((Function1<? super Koin, Scope>) function1, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnKoinScope$lambda$1(Scope scope, Function2 function2, int i, Composer composer, int i2) {
        OnKoinScope(scope, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @FunctionKeyMeta(endOffset = 1519, key = -264394213, startOffset = 1349)
    @KoinExperimentalAPI
    public static final void KoinScope(final Function1<? super Koin, Scope> scopeDefinition, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(scopeDefinition, "scopeDefinition");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-264394213);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinScope)N(scopeDefinition,content)44@1475L9,45@1490L27:KoinScope.kt#4cyfz7");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(scopeDefinition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-264394213, i2, -1, "org.koin.compose.scope.KoinScope (KoinScope.kt:43)");
            }
            OnKoinScope(scopeDefinition.invoke(KoinApplicationKt.getKoin(startRestartGroup, 0)), content, startRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.scope.KoinScopeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinScope$lambda$0;
                    KoinScope$lambda$0 = KoinScopeKt.KoinScope$lambda$0(Function1.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinScope$lambda$0;
                }
            });
        }
    }

    @FunctionKeyMeta(endOffset = 1932, key = -1487271735, startOffset = 1740)
    @KoinExperimentalAPI
    public static final /* synthetic */ <T> void KoinScope(String scopeID, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Intrinsics.checkNotNullParameter(content, "content");
        ComposerKt.sourceInformationMarkerStart(composer, -1487271735, "CC(KoinScope)N(scopeID,content)63@1860L9,64@1903L27:KoinScope.kt#4cyfz7");
        Koin koin = KoinApplicationKt.getKoin(composer, 0);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        Scope scopeOrNull = koin.getScopeRegistry().getScopeOrNull(scopeID);
        if (scopeOrNull == null) {
            scopeOrNull = Koin.createScope$default(koin, scopeID, typeQualifier, null, null, 12, null);
        }
        OnKoinScope(scopeOrNull, content, composer, i & 112);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    @FunctionKeyMeta(endOffset = 2396, key = -362301145, startOffset = 2178)
    @KoinExperimentalAPI
    public static final void KoinScope(String scopeID, Qualifier scopeQualifier, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(content, "content");
        ComposerKt.sourceInformationMarkerStart(composer, -362301145, "CC(KoinScope)N(scopeID,scopeQualifier,content)84@2311L9,85@2367L27:KoinScope.kt#4cyfz7");
        OnKoinScope(Koin.getOrCreateScope$default(KoinApplicationKt.getKoin(composer, 0), scopeID, scopeQualifier, null, 4, null), content, composer, (i >> 3) & 112);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    @FunctionKeyMeta(endOffset = 2711, key = -1631542729, startOffset = 2485)
    @KoinExperimentalAPI
    public static final void OnKoinScope(final Scope scope, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1631542729);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnKoinScope)N(scope,content)93@2554L24,96@2684L25,94@2583L126:KoinScope.kt#4cyfz7");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(scope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1631542729, i2, -1, "org.koin.compose.scope.OnKoinScope (KoinScope.kt:92)");
            }
            RememberScopesKt.rememberKoinScope(scope, startRestartGroup, i2 & 14);
            CompositionLocalKt.CompositionLocalProvider(KoinApplicationKt.getLocalKoinScopeContext().provides(new ComposeContextWrapper<>(scope, null, 2, null)), ComposableLambdaKt.rememberComposableLambda(164259575, true, new Function2() { // from class: org.koin.compose.scope.KoinScopeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OnKoinScope$lambda$0;
                    OnKoinScope$lambda$0 = KoinScopeKt.OnKoinScope$lambda$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                    return OnKoinScope$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.scope.KoinScopeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OnKoinScope$lambda$1;
                    OnKoinScope$lambda$1 = KoinScopeKt.OnKoinScope$lambda$1(Scope.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return OnKoinScope$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FunctionKeyMeta(endOffset = 2709, key = 164259575, startOffset = 2684)
    public static final Unit OnKoinScope$lambda$0(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C97@2694L9:KoinScope.kt#4cyfz7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(164259575, i, -1, "org.koin.compose.scope.OnKoinScope.<anonymous> (KoinScope.kt:97)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

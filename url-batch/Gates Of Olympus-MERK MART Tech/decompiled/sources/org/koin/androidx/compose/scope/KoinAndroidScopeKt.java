package org.koin.androidx.compose.scope;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.compose.ComposeContextWrapper;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* compiled from: KoinAndroidScope.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a \u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"KoinActivityScope", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "KoinFragmentScope", "koin-androidx-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinAndroidScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinActivityScope$lambda$1(Function2 function2, int i, Composer composer, int i2) {
        KoinActivityScope(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinFragmentScope$lambda$1(Function2 function2, int i, Composer composer, int i2) {
        KoinFragmentScope(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void KoinActivityScope(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-391667059);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinActivityScope)N(content)31@1144L7,35@1399L25,33@1298L126:KoinAndroidScope.kt#v2qisu");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-391667059, i2, -1, "org.koin.androidx.compose.scope.KoinActivityScope (KoinAndroidScope.kt:30)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AndroidScopeComponent androidScopeComponent = consume instanceof AndroidScopeComponent ? (AndroidScopeComponent) consume : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            if (scope != null) {
                startRestartGroup.startReplaceGroup(1565081040);
                startRestartGroup.endReplaceGroup();
                CompositionLocalKt.CompositionLocalProvider(KoinApplicationKt.getLocalKoinScopeContext().provides(new ComposeContextWrapper<>(scope, null, 2, null)), ComposableLambdaKt.rememberComposableLambda(-1357912243, true, new Function2() { // from class: org.koin.androidx.compose.scope.KoinAndroidScopeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit KoinActivityScope$lambda$0;
                        KoinActivityScope$lambda$0 = KoinAndroidScopeKt.KoinActivityScope$lambda$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return KoinActivityScope$lambda$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.startReplaceGroup(1565083117);
                ComposerKt.sourceInformation(startRestartGroup, "32@1235L7");
                StringBuilder sb = new StringBuilder("Current context ");
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                throw new IllegalStateException(sb.append(consume2).append(" must implement AndroidScopeComponent interface.").toString().toString());
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.androidx.compose.scope.KoinAndroidScopeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinActivityScope$lambda$1;
                    KoinActivityScope$lambda$1 = KoinAndroidScopeKt.KoinActivityScope$lambda$1(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinActivityScope$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinActivityScope$lambda$0(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C36@1409L9:KoinAndroidScope.kt#v2qisu");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357912243, i, -1, "org.koin.androidx.compose.scope.KoinActivityScope.<anonymous> (KoinAndroidScope.kt:36)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void KoinFragmentScope(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-617235796);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinFragmentScope)N(content)45@1564L7,49@1819L25,47@1718L126:KoinAndroidScope.kt#v2qisu");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-617235796, i2, -1, "org.koin.androidx.compose.scope.KoinFragmentScope (KoinAndroidScope.kt:44)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AndroidScopeComponent androidScopeComponent = consume instanceof AndroidScopeComponent ? (AndroidScopeComponent) consume : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            if (scope != null) {
                startRestartGroup.startReplaceGroup(-458110417);
                startRestartGroup.endReplaceGroup();
                CompositionLocalKt.CompositionLocalProvider(KoinApplicationKt.getLocalKoinScopeContext().provides(new ComposeContextWrapper<>(scope, null, 2, null)), ComposableLambdaKt.rememberComposableLambda(-1583480980, true, new Function2() { // from class: org.koin.androidx.compose.scope.KoinAndroidScopeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit KoinFragmentScope$lambda$0;
                        KoinFragmentScope$lambda$0 = KoinAndroidScopeKt.KoinFragmentScope$lambda$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return KoinFragmentScope$lambda$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.startReplaceGroup(-458108340);
                ComposerKt.sourceInformation(startRestartGroup, "46@1655L7");
                StringBuilder sb = new StringBuilder("Current context ");
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                throw new IllegalStateException(sb.append(consume2).append(" must implement AndroidScopeComponent interface.").toString().toString());
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.androidx.compose.scope.KoinAndroidScopeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinFragmentScope$lambda$1;
                    KoinFragmentScope$lambda$1 = KoinAndroidScopeKt.KoinFragmentScope$lambda$1(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinFragmentScope$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinFragmentScope$lambda$0(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C50@1829L9:KoinAndroidScope.kt#v2qisu");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1583480980, i, -1, "org.koin.androidx.compose.scope.KoinFragmentScope.<anonymous> (KoinAndroidScope.kt:50)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

package org.koin.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.FunctionKeyMeta;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.koin.compose.application.CompositionKoinApplicationLoader;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.logger.Level;
import org.koin.core.scope.Scope;
import org.koin.dsl.KoinConfiguration;
import org.koin.mp.KoinPlatform;

/* compiled from: KoinApplication.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\b\u0010\u0012\u001a\u00020\bH\u0002\u001a\b\u0010\u0013\u001a\u00020\u0002H\u0002\u001a\r\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0017\u001a=\u0010\u0018\u001a\u00020\u00192\u001b\u0010\u001a\u001a\u0017\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u001bj\u0002`\u001e¢\u0006\u0002\b\u001d2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00190 ¢\u0006\u0002\b!H\u0007¢\u0006\u0002\u0010\"\u001a2\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00190 ¢\u0006\u0002\b!H\u0007¢\u0006\u0002\u0010'\u001a2\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00190 ¢\u0006\u0002\b!H\u0007¢\u0006\u0002\u0010'\u001a*\u0010*\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00190 ¢\u0006\u0002\b!H\u0007¢\u0006\u0002\u0010,\u001a(\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001c2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00190 ¢\u0006\u0002\b!H\u0007¢\u0006\u0002\u0010/\u001a=\u00100\u001a\u00020\u00192\u001b\u0010\u001a\u001a\u0017\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u001bj\u0002`\u001e¢\u0006\u0002\b\u001d2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00190 ¢\u0006\u0002\b!H\u0007¢\u0006\u0002\u0010\"\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\"(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u00061"}, d2 = {"LocalKoinScope", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/koin/core/scope/Scope;", "getLocalKoinScope$annotations", "()V", "getLocalKoinScope", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalKoinApplication", "Lorg/koin/core/Koin;", "getLocalKoinApplication$annotations", "getLocalKoinApplication", "LocalKoinScopeContext", "Lorg/koin/compose/ComposeContextWrapper;", "getLocalKoinScopeContext$annotations", "getLocalKoinScopeContext", "LocalKoinApplicationContext", "getLocalKoinApplicationContext$annotations", "getLocalKoinApplicationContext", "getDefaultKoinContext", "getDefaultRootScope", "getKoin", "(Landroidx/compose/runtime/Composer;I)Lorg/koin/core/Koin;", "currentKoinScope", "(Landroidx/compose/runtime/Composer;I)Lorg/koin/core/scope/Scope;", "KoinApplication", "", "application", "Lkotlin/Function1;", "Lorg/koin/core/KoinApplication;", "Lkotlin/ExtensionFunctionType;", "Lorg/koin/dsl/KoinAppDeclaration;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "configuration", "Lorg/koin/dsl/KoinConfiguration;", "logLevel", "Lorg/koin/core/logger/Level;", "(Lorg/koin/dsl/KoinConfiguration;Lorg/koin/core/logger/Level;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "KoinMultiplatformApplication", "config", "KoinContext", "koin", "(Lorg/koin/core/Koin;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "KoinIsolatedContext", "context", "(Lorg/koin/core/KoinApplication;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "KoinApplicationPreview", "koin-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinApplicationKt {
    private static final ProvidableCompositionLocal<Scope> LocalKoinScope = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda21
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Scope LocalKoinScope$lambda$0;
            LocalKoinScope$lambda$0 = KoinApplicationKt.LocalKoinScope$lambda$0();
            return LocalKoinScope$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<Koin> LocalKoinApplication = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda22
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Koin LocalKoinApplication$lambda$0;
            LocalKoinApplication$lambda$0 = KoinApplicationKt.LocalKoinApplication$lambda$0();
            return LocalKoinApplication$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<ComposeContextWrapper<Scope>> LocalKoinScopeContext = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda23
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ComposeContextWrapper LocalKoinScopeContext$lambda$0;
            LocalKoinScopeContext$lambda$0 = KoinApplicationKt.LocalKoinScopeContext$lambda$0();
            return LocalKoinScopeContext$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<ComposeContextWrapper<Koin>> LocalKoinApplicationContext = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ComposeContextWrapper LocalKoinApplicationContext$lambda$0;
            LocalKoinApplicationContext$lambda$0 = KoinApplicationKt.LocalKoinApplicationContext$lambda$0();
            return LocalKoinApplicationContext$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinApplication$lambda$2(Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        KoinApplication(function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinApplication$lambda$5(KoinConfiguration koinConfiguration, Level level, Function2 function2, int i, int i2, Composer composer, int i3) {
        KoinApplication(koinConfiguration, level, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinApplicationPreview$lambda$2(Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        KoinApplicationPreview(function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinContext$lambda$2(Koin koin, Function2 function2, int i, int i2, Composer composer, int i3) {
        KoinContext(koin, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinIsolatedContext$lambda$2(KoinApplication koinApplication, Function2 function2, int i, Composer composer, int i2) {
        KoinIsolatedContext(koinApplication, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinMultiplatformApplication$lambda$2(KoinConfiguration koinConfiguration, Level level, Function2 function2, int i, int i2, Composer composer, int i3) {
        KoinMultiplatformApplication(koinConfiguration, level, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "LocalKoinApplication is deprecated. Use getKoin() to access the Koin instance directly.", replaceWith = @ReplaceWith(expression = "getKoin()", imports = {}))
    public static /* synthetic */ void getLocalKoinApplication$annotations() {
    }

    public static /* synthetic */ void getLocalKoinApplicationContext$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "LocalKoinScope has been replaced with LocalKoinScopeContext, using ComposeContextWrapper.getValue() to retrieve the value. See also KoinScope() or UnboundKoinScope() Compose functions", replaceWith = @ReplaceWith(expression = "LocalKoinScopeContext", imports = {}))
    public static /* synthetic */ void getLocalKoinScope$annotations() {
    }

    public static /* synthetic */ void getLocalKoinScopeContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope LocalKoinScope$lambda$0() {
        throw new IllegalStateException("should not be used in favor of LocalKoinScopeContext".toString());
    }

    public static final ProvidableCompositionLocal<Scope> getLocalKoinScope() {
        return LocalKoinScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Koin LocalKoinApplication$lambda$0() {
        throw new IllegalStateException("should not be used in favor of getKoin()".toString());
    }

    public static final ProvidableCompositionLocal<Koin> getLocalKoinApplication() {
        return LocalKoinApplication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeContextWrapper LocalKoinScopeContext$lambda$0() {
        return new ComposeContextWrapper(getDefaultRootScope(), new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Scope defaultRootScope;
                defaultRootScope = KoinApplicationKt.getDefaultRootScope();
                return defaultRootScope;
            }
        });
    }

    public static final ProvidableCompositionLocal<ComposeContextWrapper<Scope>> getLocalKoinScopeContext() {
        return LocalKoinScopeContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeContextWrapper LocalKoinApplicationContext$lambda$0() {
        return new ComposeContextWrapper(getDefaultKoinContext(), new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Koin defaultKoinContext;
                defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
                return defaultKoinContext;
            }
        });
    }

    public static final ProvidableCompositionLocal<ComposeContextWrapper<Koin>> getLocalKoinApplicationContext() {
        return LocalKoinApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Koin getDefaultKoinContext() {
        return KoinPlatform.INSTANCE.getKoin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope getDefaultRootScope() {
        return KoinPlatform.INSTANCE.getKoin().getScopeRegistry().getRootScope();
    }

    @FunctionKeyMeta(endOffset = 3848, key = 523578110, startOffset = 3580)
    public static final Koin getKoin(Composer composer, int i) {
        Koin koin;
        ComposerKt.sourceInformationMarkerStart(composer, 523578110, "C(getKoin):KoinApplication.kt#8jjlyv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523578110, i, -1, "org.koin.compose.getKoin (KoinApplication.kt:88)");
        }
        try {
            koin = (Koin) ((ComposeContextWrapper) composer.consume(LocalKoinApplicationContext)).getValue();
        } catch (Exception e) {
            Koin koin2 = (Koin) ((ComposeContextWrapper) composer.consume(LocalKoinApplicationContext)).resetValue();
            if (koin2 == null) {
                throw new IllegalStateException(("Can't get Koin context due to error: " + e).toString());
            }
            koin = koin2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return koin;
    }

    @FunctionKeyMeta(endOffset = 4462, key = 1668867238, startOffset = 4010)
    public static final Scope currentKoinScope(Composer composer, int i) {
        Scope scope;
        ComposerKt.sourceInformationMarkerStart(composer, 1668867238, "C(currentKoinScope):KoinApplication.kt#8jjlyv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1668867238, i, -1, "org.koin.compose.currentKoinScope (KoinApplication.kt:105)");
        }
        try {
            ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal = LocalKoinScopeContext;
            scope = (Scope) ((ComposeContextWrapper) composer.consume(providableCompositionLocal)).getValue();
            if (scope.get_closed()) {
                Scope scope2 = (Scope) ((ComposeContextWrapper) composer.consume(providableCompositionLocal)).resetValue();
                if (scope2 == null) {
                    throw new IllegalStateException(("Can't get Koin scope. Scope '" + scope + "' is closed").toString());
                }
                scope = scope2;
            }
        } catch (Exception e) {
            scope = (Scope) ((ComposeContextWrapper) composer.consume(LocalKoinScopeContext)).resetValue();
            if (scope == null) {
                throw new IllegalStateException(("Can't get Koin scope due to error: " + e).toString());
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return scope;
    }

    @FunctionKeyMeta(endOffset = 5640, key = -563172299, startOffset = 5207)
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use KoinApplication(config: KoinConfiguration) with koinConfiguration { } instead of KoinAppDeclaration lambda", replaceWith = @ReplaceWith(expression = "KoinApplication(configuration = koinConfiguration(application), content = content)", imports = {"org.koin.dsl.koinConfiguration"}))
    public static final void KoinApplication(final Function1<? super KoinApplication, Unit> application, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-563172299);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinApplication)N(application,content)141@5320L36,143@5460L27,144@5580L25,142@5361L277:KoinApplication.kt#8jjlyv");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(application) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-563172299, i2, -1, "org.koin.compose.KoinApplication (KoinApplication.kt:140)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1053492787, "CC(rememberKoinApplication)N(koinAppDeclaration)33@1234L166:RememberKoinApplication.kt#f93w7t");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1205710087, "CC(remember):RememberKoinApplication.kt#9igjgp");
            boolean z = (((i2 & 14) ^ 6) > 4 && startRestartGroup.changed(application)) || (i2 & 6) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new CompositionKoinApplicationLoader(KoinPlatform.INSTANCE.getKoinOrNull() == null ? org.koin.dsl.KoinApplicationKt.koinApplication(application) : null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Koin koin = ((CompositionKoinApplicationLoader) rememberedValue).getKoin();
            if (koin != null) {
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidedValue[] providedValueArr = new ProvidedValue[2];
                ProvidableCompositionLocal<ComposeContextWrapper<Koin>> providableCompositionLocal = LocalKoinApplicationContext;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -42691920, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Koin defaultKoinContext;
                            defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
                            return defaultKoinContext;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[0] = providableCompositionLocal.provides(new ComposeContextWrapper<>(koin, (Function0) rememberedValue2));
                ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal2 = LocalKoinScopeContext;
                Scope rootScope = koin.getScopeRegistry().getRootScope();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -42688082, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Scope defaultRootScope;
                            defaultRootScope = KoinApplicationKt.getDefaultRootScope();
                            return defaultRootScope;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[1] = providableCompositionLocal2.provides(new ComposeContextWrapper<>(rootScope, (Function0) rememberedValue3));
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, content, startRestartGroup, ProvidedValue.$stable | (i2 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("Koin context has not been initialized in rememberKoinApplication".toString());
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinApplication$lambda$2;
                    KoinApplication$lambda$2 = KoinApplicationKt.KoinApplication$lambda$2(Function1.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinApplication$lambda$2;
                }
            });
        }
    }

    @FunctionKeyMeta(endOffset = 7078, key = -579738367, startOffset = 6596)
    public static final void KoinApplication(final KoinConfiguration configuration, Level level, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-579738367);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinApplication)N(configuration,logLevel,content)186@6744L50,188@6898L27,189@7018L25,187@6799L277:KoinApplication.kt#8jjlyv");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(configuration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(level == null ? -1 : level.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                level = Level.INFO;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-579738367, i3, -1, "org.koin.compose.KoinApplication (KoinApplication.kt:185)");
            }
            int i5 = i3 & WebSocketProtocol.PAYLOAD_SHORT;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 539440252, "CC(rememberKoinMPApplication)N(configuration,logLevel)43@1691L67,44@1777L178:RememberKoinApplication.kt#f93w7t");
            KoinConfiguration composeMultiplatformConfiguration = KoinApplication_androidKt.composeMultiplatformConfiguration(level, configuration, startRestartGroup, ((i5 << 3) & 112) | ((i5 >> 3) & 14), 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1288953906, "CC(remember):RememberKoinApplication.kt#9igjgp");
            boolean changed = startRestartGroup.changed(composeMultiplatformConfiguration) | ((((i3 & 112) ^ 48) > 32 && startRestartGroup.changed(level.ordinal())) || (i3 & 48) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new CompositionKoinApplicationLoader(KoinPlatform.INSTANCE.getKoinOrNull() == null ? org.koin.dsl.KoinApplicationKt.koinApplication(composeMultiplatformConfiguration) : null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Koin koin = ((CompositionKoinApplicationLoader) rememberedValue).getKoin();
            if (koin != null) {
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidedValue[] providedValueArr = new ProvidedValue[2];
                ProvidableCompositionLocal<ComposeContextWrapper<Koin>> providableCompositionLocal = LocalKoinApplicationContext;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1217187484, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Koin defaultKoinContext;
                            defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
                            return defaultKoinContext;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[0] = providableCompositionLocal.provides(new ComposeContextWrapper<>(koin, (Function0) rememberedValue2));
                ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal2 = LocalKoinScopeContext;
                Scope rootScope = koin.getScopeRegistry().getRootScope();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1217191322, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Scope defaultRootScope;
                            defaultRootScope = KoinApplicationKt.getDefaultRootScope();
                            return defaultRootScope;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[1] = providableCompositionLocal2.provides(new ComposeContextWrapper<>(rootScope, (Function0) rememberedValue3));
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, content, startRestartGroup, ProvidedValue.$stable | ((i3 >> 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("Koin context has not been initialized in rememberKoinApplication".toString());
            }
        }
        final Level level2 = level;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinApplication$lambda$5;
                    KoinApplication$lambda$5 = KoinApplicationKt.KoinApplication$lambda$5(KoinConfiguration.this, level2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinApplication$lambda$5;
                }
            });
        }
    }

    @FunctionKeyMeta(endOffset = 8640, key = -1144314045, startOffset = 8159)
    @Deprecated(message = "Use KoinApplication(configuration: KoinConfiguration, logLevel: Level) instead", replaceWith = @ReplaceWith(expression = "KoinApplication(configuration = config, logLevel = logLevel, content = content)", imports = {}))
    @KoinExperimentalAPI
    public static final void KoinMultiplatformApplication(final KoinConfiguration config, Level level, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1144314045);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinMultiplatformApplication)N(config,logLevel,content)221@8313L43,223@8460L27,224@8580L25,222@8361L277:KoinApplication.kt#8jjlyv");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(config) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(level == null ? -1 : level.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                level = Level.INFO;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1144314045, i3, -1, "org.koin.compose.KoinMultiplatformApplication (KoinApplication.kt:220)");
            }
            int i5 = i3 & WebSocketProtocol.PAYLOAD_SHORT;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 539440252, "CC(rememberKoinMPApplication)N(configuration,logLevel)43@1691L67,44@1777L178:RememberKoinApplication.kt#f93w7t");
            KoinConfiguration composeMultiplatformConfiguration = KoinApplication_androidKt.composeMultiplatformConfiguration(level, config, startRestartGroup, ((i5 << 3) & 112) | ((i5 >> 3) & 14), 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1288953906, "CC(remember):RememberKoinApplication.kt#9igjgp");
            boolean changed = startRestartGroup.changed(composeMultiplatformConfiguration) | ((((i3 & 112) ^ 48) > 32 && startRestartGroup.changed(level.ordinal())) || (i3 & 48) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new CompositionKoinApplicationLoader(KoinPlatform.INSTANCE.getKoinOrNull() == null ? org.koin.dsl.KoinApplicationKt.koinApplication(composeMultiplatformConfiguration) : null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Koin koin = ((CompositionKoinApplicationLoader) rememberedValue).getKoin();
            if (koin != null) {
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidedValue[] providedValueArr = new ProvidedValue[2];
                ProvidableCompositionLocal<ComposeContextWrapper<Koin>> providableCompositionLocal = LocalKoinApplicationContext;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -174159810, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Koin defaultKoinContext;
                            defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
                            return defaultKoinContext;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[0] = providableCompositionLocal.provides(new ComposeContextWrapper<>(koin, (Function0) rememberedValue2));
                ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal2 = LocalKoinScopeContext;
                Scope rootScope = koin.getScopeRegistry().getRootScope();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -174155972, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Scope defaultRootScope;
                            defaultRootScope = KoinApplicationKt.getDefaultRootScope();
                            return defaultRootScope;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[1] = providableCompositionLocal2.provides(new ComposeContextWrapper<>(rootScope, (Function0) rememberedValue3));
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, content, startRestartGroup, ProvidedValue.$stable | ((i3 >> 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("Koin context has not been initialized in rememberKoinApplication".toString());
            }
        }
        final Level level2 = level;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinMultiplatformApplication$lambda$2;
                    KoinMultiplatformApplication$lambda$2 = KoinApplicationKt.KoinMultiplatformApplication$lambda$2(KoinConfiguration.this, level2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinMultiplatformApplication$lambda$2;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if ((r12 & 1) != 0) goto L36;
     */
    @FunctionKeyMeta(endOffset = 9784, key = 1560007908, startOffset = 9400)
    @Deprecated(message = "KoinContext is not needed anymore. This can be removed. Compose Koin context is setup with StartKoin()")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KoinContext(final Koin koin, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1560007908);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinContext)N(koin,content)257@9604L27,258@9724L25,256@9505L277:KoinApplication.kt#8jjlyv");
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changedInstance(koin)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "253@9434L25");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    koin = KoinApplication_androidKt.retrieveDefaultInstance(startRestartGroup, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1560007908, i3, -1, "org.koin.compose.KoinContext (KoinApplication.kt:255)");
                }
                ProvidedValue[] providedValueArr = new ProvidedValue[2];
                ProvidableCompositionLocal<ComposeContextWrapper<Koin>> providableCompositionLocal = LocalKoinApplicationContext;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 224019839, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Koin defaultKoinContext;
                            defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
                            return defaultKoinContext;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[0] = providableCompositionLocal.provides(new ComposeContextWrapper<>(koin, (Function0) rememberedValue));
                ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal2 = LocalKoinScopeContext;
                Scope rootScope = koin.getScopeRegistry().getRootScope();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 224023677, "CC(remember):KoinApplication.kt#9igjgp");
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Scope defaultRootScope;
                            defaultRootScope = KoinApplicationKt.getDefaultRootScope();
                            return defaultRootScope;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                providedValueArr[1] = providableCompositionLocal2.provides(new ComposeContextWrapper<>(rootScope, (Function0) rememberedValue2));
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, content, startRestartGroup, (i3 & 112) | ProvidedValue.$stable);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinContext$lambda$2;
                    KoinContext$lambda$2 = KoinApplicationKt.KoinContext$lambda$2(Koin.this, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinContext$lambda$2;
                }
            });
        }
    }

    @FunctionKeyMeta(endOffset = 10885, key = -1672936023, startOffset = 10486)
    public static final void KoinIsolatedContext(final KoinApplication context, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1672936023);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinIsolatedContext)N(context,content)287@10692L15,288@10809L40,286@10585L298:KoinApplication.kt#8jjlyv");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(context) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-1672936023, i2, -1, "org.koin.compose.KoinIsolatedContext (KoinApplication.kt:285)");
            }
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            ProvidableCompositionLocal<ComposeContextWrapper<Koin>> providableCompositionLocal = LocalKoinApplicationContext;
            Koin koin = context.getKoin();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1373742792, "CC(remember):KoinApplication.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Koin koin2;
                        koin2 = KoinApplication.this.getKoin();
                        return koin2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            providedValueArr[0] = providableCompositionLocal.provides(new ComposeContextWrapper<>(koin, (Function0) rememberedValue));
            ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal2 = LocalKoinScopeContext;
            Scope rootScope = context.getKoin().getScopeRegistry().getRootScope();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1373739023, "CC(remember):KoinApplication.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Scope KoinIsolatedContext$lambda$1$0;
                        KoinIsolatedContext$lambda$1$0 = KoinApplicationKt.KoinIsolatedContext$lambda$1$0(KoinApplication.this);
                        return KoinIsolatedContext$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            providedValueArr[1] = providableCompositionLocal2.provides(new ComposeContextWrapper<>(rootScope, (Function0) rememberedValue2));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, content, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinIsolatedContext$lambda$2;
                    KoinIsolatedContext$lambda$2 = KoinApplicationKt.KoinIsolatedContext$lambda$2(KoinApplication.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinIsolatedContext$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope KoinIsolatedContext$lambda$1$0(KoinApplication koinApplication) {
        return koinApplication.getKoin().getScopeRegistry().getRootScope();
    }

    @FunctionKeyMeta(endOffset = 11646, key = -277465461, startOffset = 11195)
    public static final void KoinApplicationPreview(final Function1<? super KoinApplication, Unit> application, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-277465461);
        ComposerKt.sourceInformation(startRestartGroup, "C(KoinApplicationPreview)N(application,content)308@11458L14,309@11573L38,307@11351L293:KoinApplication.kt#8jjlyv");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(application) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-277465461, i2, -1, "org.koin.compose.KoinApplicationPreview (KoinApplication.kt:305)");
            }
            final KoinApplication koinApplication = org.koin.dsl.KoinApplicationKt.koinApplication(application);
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            ProvidableCompositionLocal<ComposeContextWrapper<Koin>> providableCompositionLocal = LocalKoinApplicationContext;
            Koin koin = koinApplication.getKoin();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -356327239, "CC(remember):KoinApplication.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(koinApplication);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Koin koin2;
                        koin2 = KoinApplication.this.getKoin();
                        return koin2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            providedValueArr[0] = providableCompositionLocal.provides(new ComposeContextWrapper<>(koin, (Function0) rememberedValue));
            ProvidableCompositionLocal<ComposeContextWrapper<Scope>> providableCompositionLocal2 = LocalKoinScopeContext;
            Scope rootScope = koinApplication.getKoin().getScopeRegistry().getRootScope();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -356323535, "CC(remember):KoinApplication.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(koinApplication);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Scope KoinApplicationPreview$lambda$1$0;
                        KoinApplicationPreview$lambda$1$0 = KoinApplicationKt.KoinApplicationPreview$lambda$1$0(KoinApplication.this);
                        return KoinApplicationPreview$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            providedValueArr[1] = providableCompositionLocal2.provides(new ComposeContextWrapper<>(rootScope, (Function0) rememberedValue2));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, content, startRestartGroup, ProvidedValue.$stable | (i2 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.koin.compose.KoinApplicationKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit KoinApplicationPreview$lambda$2;
                    KoinApplicationPreview$lambda$2 = KoinApplicationKt.KoinApplicationPreview$lambda$2(Function1.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return KoinApplicationPreview$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope KoinApplicationPreview$lambda$1$0(KoinApplication koinApplication) {
        return koinApplication.getKoin().getScopeRegistry().getRootScope();
    }
}

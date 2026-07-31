package org.koin.compose;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.FunctionKeyMeta;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.component.KoinComponent;
import org.koin.core.logger.Level;
import org.koin.dsl.KoinConfiguration;
import org.koin.dsl.KoinConfigurationKt;

/* compiled from: KoinApplication.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0003¨\u0006\f"}, d2 = {"composeMultiplatformConfiguration", "Lorg/koin/dsl/KoinConfiguration;", "loggerLevel", "Lorg/koin/core/logger/Level;", "config", "(Lorg/koin/core/logger/Level;Lorg/koin/dsl/KoinConfiguration;Landroidx/compose/runtime/Composer;II)Lorg/koin/dsl/KoinConfiguration;", "retrieveDefaultInstance", "Lorg/koin/core/Koin;", "(Landroidx/compose/runtime/Composer;I)Lorg/koin/core/Koin;", "findContextForKoin", "Landroid/content/ComponentCallbacks;", "Landroid/content/Context;", "koin-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinApplication_androidKt {
    @FunctionKeyMeta(endOffset = 1059, key = 1888289545, startOffset = 679)
    public static final KoinConfiguration composeMultiplatformConfiguration(final Level level, final KoinConfiguration config, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(config, "config");
        ComposerKt.sourceInformationMarkerStart(composer, 1888289545, "C(composeMultiplatformConfiguration)N(loggerLevel,config)21@822L7,22@955L102:KoinApplication.android.kt#8jjlyv");
        boolean z = true;
        if ((i2 & 1) != 0) {
            level = Level.INFO;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1888289545, i, -1, "org.koin.compose.composeMultiplatformConfiguration (KoinApplication.android.kt:20)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Context applicationContext = ((Context) consume).getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalStateException("Android ApplicationContext not found in current Compose context!".toString());
        }
        ComposerKt.sourceInformationMarkerStart(composer, -2124904529, "CC(remember):KoinApplication.android.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(applicationContext);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(level.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance2 = changedInstance | z | composer.changedInstance(config);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.koin.compose.KoinApplication_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit composeMultiplatformConfiguration$lambda$0$0;
                    composeMultiplatformConfiguration$lambda$0$0 = KoinApplication_androidKt.composeMultiplatformConfiguration$lambda$0$0(applicationContext, level, config, (KoinApplication) obj);
                    return composeMultiplatformConfiguration$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        KoinConfiguration koinConfiguration = KoinConfigurationKt.koinConfiguration((Function1) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return koinConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit composeMultiplatformConfiguration$lambda$0$0(Context context, Level level, KoinConfiguration koinConfiguration, KoinApplication koinConfiguration2) {
        Intrinsics.checkNotNullParameter(koinConfiguration2, "$this$koinConfiguration");
        KoinExtKt.androidContext(koinConfiguration2, context);
        KoinExtKt.androidLogger(koinConfiguration2, level);
        KoinConfigurationKt.includes(koinConfiguration2, koinConfiguration);
        return Unit.INSTANCE;
    }

    @FunctionKeyMeta(endOffset = 1390, key = 256789730, startOffset = 1207)
    @Deprecated(message = "KoinContext is not needed anymore. This can be removed. Compose Koin context is setup with StartKoin()")
    public static final Koin retrieveDefaultInstance(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 256789730, "C(retrieveDefaultInstance)32@1277L7,33@1300L72:KoinApplication.android.kt#8jjlyv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(256789730, i, -1, "org.koin.compose.retrieveDefaultInstance (KoinApplication.android.kt:31)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 1961797706, "CC(remember):KoinApplication.android.kt#9igjgp");
        boolean changed = composer.changed(context);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = ComponentCallbackExtKt.getKoin(findContextForKoin(context));
            composer.updateRememberedValue(rememberedValue);
        }
        Koin koin = (Koin) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return koin;
    }

    @Deprecated(message = "KoinContext is not needed anymore. This can be removed. Compose Koin context is setup with StartKoin()")
    private static final ComponentCallbacks findContextForKoin(Context context) {
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            if ((obj instanceof KoinComponent) && (obj instanceof ComponentCallbacks)) {
                return (ComponentCallbacks) obj;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(obj, "getBaseContext(...)");
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }
}

package dev.hyo.openiap;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import dev.hyo.openiap.store.OpenIapStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IapContext.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Ldev/hyo/openiap/IapContext;", "", "<init>", "()V", "LocalOpenIapStore", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Ldev/hyo/openiap/store/OpenIapStore;", "getLocalOpenIapStore", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberOpenIapStore", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;II)Ldev/hyo/openiap/store/OpenIapStore;", "OpenIapProvider", "", "store", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ldev/hyo/openiap/store/OpenIapStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IapContext {
    public static final int $stable = 0;
    public static final IapContext INSTANCE = new IapContext();
    private static final ProvidableCompositionLocal<OpenIapStore> LocalOpenIapStore = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: dev.hyo.openiap.IapContext$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OpenIapStore LocalOpenIapStore$lambda$0;
            LocalOpenIapStore$lambda$0 = IapContext.LocalOpenIapStore$lambda$0();
            return LocalOpenIapStore$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenIapStore LocalOpenIapStore$lambda$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpenIapProvider$lambda$3(IapContext iapContext, OpenIapStore openIapStore, Function2 function2, int i, int i2, Composer composer, int i3) {
        iapContext.OpenIapProvider(openIapStore, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private IapContext() {
    }

    public final ProvidableCompositionLocal<OpenIapStore> getLocalOpenIapStore() {
        return LocalOpenIapStore;
    }

    public final OpenIapStore rememberOpenIapStore(Context context, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(74756117);
        if ((i2 & 1) != 0) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            context = (Context) consume;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(74756117, i, -1, "dev.hyo.openiap.IapContext.rememberOpenIapStore (IapContext.kt:22)");
        }
        Context applicationContext = context.getApplicationContext();
        composer.startReplaceableGroup(5004770);
        boolean changed = composer.changed(applicationContext);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Intrinsics.checkNotNull(applicationContext);
            rememberedValue = new OpenIapStore(applicationContext);
            composer.updateRememberedValue(rememberedValue);
        }
        OpenIapStore openIapStore = (OpenIapStore) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return openIapStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if ((r12 & 1) != 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OpenIapProvider(OpenIapStore openIapStore, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-64591406);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changedInstance(openIapStore)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= startRestartGroup.changed(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    openIapStore = rememberOpenIapStore(null, startRestartGroup, (i3 >> 3) & 112, 1);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-64591406, i3, -1, "dev.hyo.openiap.IapContext.OpenIapProvider (IapContext.kt:32)");
                }
                CompositionLocalKt.CompositionLocalProvider(LocalOpenIapStore.provides(openIapStore), ComposableLambdaKt.composableLambda(startRestartGroup, 687349394, true, new Function2() { // from class: dev.hyo.openiap.IapContext$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit OpenIapProvider$lambda$2;
                        OpenIapProvider$lambda$2 = IapContext.OpenIapProvider$lambda$2(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return OpenIapProvider$lambda$2;
                    }
                }), startRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        final OpenIapStore openIapStore2 = openIapStore;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: dev.hyo.openiap.IapContext$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OpenIapProvider$lambda$3;
                    OpenIapProvider$lambda$3 = IapContext.OpenIapProvider$lambda$3(IapContext.this, openIapStore2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OpenIapProvider$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpenIapProvider$lambda$2(Function2 function2, Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687349394, i, -1, "dev.hyo.openiap.IapContext.OpenIapProvider.<anonymous> (IapContext.kt:34)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

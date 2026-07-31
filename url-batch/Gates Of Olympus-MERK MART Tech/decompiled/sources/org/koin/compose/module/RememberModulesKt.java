package org.koin.compose.module;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.FunctionKeyMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.module.Module;

/* compiled from: RememberModules.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0019\b\u0006\u0010\u0006\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"rememberKoinModules", "", "unloadOnForgotten", "", "unloadOnAbandoned", "unloadModules", "modules", "Lkotlin/Function0;", "", "Lorg/koin/core/module/Module;", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "koin-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberModulesKt {
    @FunctionKeyMeta(endOffset = 1802, key = -1703546888, startOffset = 1397)
    @KoinExperimentalAPI
    public static final void rememberKoinModules(Boolean bool, Boolean bool2, boolean z, Function0<? extends List<Module>> function0, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1703546888, "CC(rememberKoinModules)N(unloadOnForgotten,unloadOnAbandoned,unloadModules,modules)43@1647L9,44@1661L139:RememberModules.kt#48p8hv");
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            function0 = new Function0<List<? extends Module>>() { // from class: org.koin.compose.module.RememberModulesKt$rememberKoinModules$1
                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Module> invoke() {
                    return CollectionsKt.emptyList();
                }
            };
        }
        Koin koin = KoinApplicationKt.getKoin(composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -726011005, "CC(remember):RememberModules.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            List<Module> invoke = function0.invoke();
            boolean booleanValue = bool != null ? bool.booleanValue() : z;
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
            rememberedValue = new CompositionKoinModuleLoader(invoke, koin, booleanValue, z);
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }
}

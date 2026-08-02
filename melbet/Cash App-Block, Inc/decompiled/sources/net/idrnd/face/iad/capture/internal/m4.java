package net.idrnd.face.iad.capture.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import coil3.RealImageLoader;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.search.InvestingSearchSecurityCarouselKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.investing.viewmodels.search.SecurityCarousel;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElementBuildersKt;
import net.idrnd.face.iad.capture.checker.nativelib.NativeInterface;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class m4 {
    public static final void InvestingSearchSecurityCarousel(SecurityCarousel securityCarousel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-96308162);
        int i2 = (gapComposer.changed(securityCarousel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1612563357, new InvestingSearchSecurityCarouselKt$$ExternalSyntheticLambda0(securityCarousel, function1, realImageLoader), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingSearchSecurityCarouselKt$$ExternalSyntheticLambda0(securityCarousel, function1, realImageLoader, i);
        }
    }

    public static final void InvestingSecurityCarouselCard(InvestingSecurityTileContentModel investingSecurityTileContentModel, List list, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1839426759);
        int i2 = i | (gapComposer2.changedInstance(investingSecurityTileContentModel) ? 4 : 2) | (gapComposer2.changedInstance(list) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changedInstance(realImageLoader) ? 2048 : 1024);
        boolean z = true;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Color composeColor = ComposeUtilsKt.toComposeColor(investingSecurityTileContentModel.backgroundColor, gapComposer2);
            if (composeColor == null) {
                gapComposer2.startReplaceGroup(-1837401808);
                j = MooncakeTheme.getColors(gapComposer2).investing;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1837403761);
                gapComposer2.end(false);
                j = composeColor.value;
            }
            boolean z2 = (i2 & 896) == 256;
            if ((i2 & 14) != 4 && !gapComposer2.changedInstance(investingSecurityTileContentModel)) {
                z = false;
            }
            boolean changedInstance = z2 | z | gapComposer2.changedInstance(list);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(23, function1, investingSecurityTileContentModel, list);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            JsonElementBuildersKt.m4210InvestingCarouselCard3IgeMak((Function0) rememberedValue, MooncakeTheme.getColors(gapComposer2).elevatedBackground, Expect_jvmKt.rememberComposableLambda(-1406812585, new TapToPayPaymentKt$$ExternalSyntheticLambda3(j, investingSecurityTileContentModel, realImageLoader, 8), gapComposer2), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(investingSecurityTileContentModel, i, list, function1, realImageLoader, 16);
        }
    }

    public static int a(String str) {
        try {
            if (NativeInterface.a) {
                Object call = NativeInterface.call(new Object[]{5, str});
                if (call instanceof Integer) {
                    return ((Integer) call).intValue();
                }
            }
        } catch (UnsatisfiedLinkError unused) {
        }
        return -1;
    }
}

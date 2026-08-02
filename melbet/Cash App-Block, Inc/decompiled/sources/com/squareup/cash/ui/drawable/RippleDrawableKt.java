package com.squareup.cash.ui.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import java.util.Arrays;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class RippleDrawableKt {
    public static RippleDrawable createRippleDrawable$default(View view) {
        return new RippleDrawable(ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(view), null, 2)), new ColorDrawable(0), new ColorDrawable(-1));
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBillsSearch.deepLinkSpecs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.Companion.Empty) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final NavHostController rememberNavController(Navigator[] navigatorArr, Composer composer) {
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        Object[] copyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new Savers_androidKt$$ExternalSyntheticLambda0((byte) (false ? 1 : 0), 7), new CachedPageEventFlow$$ExternalSyntheticLambda0(context, 12));
        boolean changedInstance = gapComposer.changedInstance(context);
        Object rememberedValue = gapComposer.rememberedValue();
        if (!changedInstance) {
            obj = rememberedValue;
        }
        CameraX$$ExternalSyntheticLambda0 cameraX$$ExternalSyntheticLambda0 = new CameraX$$ExternalSyntheticLambda0(context, 1);
        gapComposer.updateRememberedValue(cameraX$$ExternalSyntheticLambda0);
        obj = cameraX$$ExternalSyntheticLambda0;
        NavHostController navHostController = (NavHostController) SaverKt.rememberSaveable(copyOf, workLauncherImpl, null, (Function0) obj, gapComposer, 0, 4);
        for (Navigator navigator : navigatorArr) {
            navHostController.impl._navigatorProvider.addNavigator(navigator);
        }
        return navHostController;
    }
}

package com.withpersona.sdk2.inquiry.shared.systemUiController;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsControllerCompat;
import coil3.memory.MemoryCacheService;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;

/* loaded from: classes4.dex */
public final class SystemUiController {
    public final boolean controlNavigationBar;
    public final boolean controlStatusBar;

    public SystemUiController(boolean z, boolean z2) {
        this.controlNavigationBar = z;
        this.controlStatusBar = z2;
    }

    public final void updateSystemUiColor(Context context, int i) {
        Window window;
        context.getClass();
        AppCompatActivity activity = ContextUtilsKt.getActivity(context);
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        double calculateContrast = ColorUtils.calculateContrast(-1, rgb);
        double calculateContrast2 = ColorUtils.calculateContrast(-16777216, rgb);
        MemoryCacheService memoryCacheService = new MemoryCacheService(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        Strings impl35 = i2 >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i2 >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
        if (this.controlNavigationBar) {
            impl35.setAppearanceLightNavigationBars(calculateContrast < calculateContrast2);
        }
        if (this.controlStatusBar) {
            impl35.setAppearanceLightStatusBars(calculateContrast < calculateContrast2);
        }
    }
}

package org.game.play.aviator.gameplay;

import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* loaded from: classes3.dex */
public class SystemUIUtil {
    public static void hideSystemUI(Window window) {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        WindowCompat.setDecorFitsSystemWindows(window, false);
        insetsController.setAppearanceLightStatusBars(false);
    }
}

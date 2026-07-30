package org.game.play.aviator.gameplay;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class BlurUtil {
    public static void applyBlur(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            imageView.setRenderEffect(RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP));
        } else {
            imageView.setAlpha(0.7f);
        }
    }
}

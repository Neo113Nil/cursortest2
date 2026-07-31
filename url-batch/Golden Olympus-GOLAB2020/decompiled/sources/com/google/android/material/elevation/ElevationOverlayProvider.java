package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.a;
import com.google.android.material.R$attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, R$attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R$attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R$attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R$attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(int i4) {
        return a.k(i4, KotlinVersion.MAX_COMPONENT_VALUE) == this.colorSurface;
    }

    public float calculateOverlayAlphaFraction(float f4) {
        if (this.displayDensity <= 0.0f || f4 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f4 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i4, float f4) {
        int i5;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f4);
        int alpha = Color.alpha(i4);
        int layer = MaterialColors.layer(a.k(i4, KotlinVersion.MAX_COMPONENT_VALUE), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i5 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, a.k(i5, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return a.k(layer, alpha);
    }

    public int compositeOverlayIfNeeded(int i4, float f4) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i4)) ? compositeOverlay(i4, f4) : i4;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public ElevationOverlayProvider(boolean z4, int i4, int i5, int i6, float f4) {
        this.elevationOverlayEnabled = z4;
        this.elevationOverlayColor = i4;
        this.elevationOverlayAccentColor = i5;
        this.colorSurface = i6;
        this.displayDensity = f4;
    }
}

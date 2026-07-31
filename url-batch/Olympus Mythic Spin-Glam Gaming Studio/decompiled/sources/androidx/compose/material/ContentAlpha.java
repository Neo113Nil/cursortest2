package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.adjust.sdk.Constants;
import com.ironsource.C4538a2;
import kotlin.Metadata;

/* compiled from: ContentAlpha.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "()V", C4538a2.e, "", "getDisabled", "(Landroidx/compose/runtime/Composer;I)F", Constants.HIGH, "getHigh", Constants.MEDIUM, "getMedium", "contentAlpha", "highContrastAlpha", "lowContrastAlpha", "(FFLandroidx/compose/runtime/Composer;I)F", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentAlpha {
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    public final float getHigh(Composer composer, int i) {
        composer.startReplaceableGroup(629162431);
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    public final float getMedium(Composer composer, int i) {
        composer.startReplaceableGroup(1999054879);
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    public final float getDisabled(Composer composer, int i) {
        composer.startReplaceableGroup(621183615);
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    private final float contentAlpha(float f, float f2, Composer composer, int i) {
        composer.startReplaceableGroup(-1528360391);
        long value = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m1470luminance8_81llA(value) >= 0.5d : ColorKt.m1470luminance8_81llA(value) <= 0.5d) {
            f = f2;
        }
        composer.endReplaceableGroup();
        return f;
    }
}

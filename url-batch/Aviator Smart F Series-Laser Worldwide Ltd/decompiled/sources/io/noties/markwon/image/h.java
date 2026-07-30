package io.noties.markwon.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.image.f;

/* loaded from: classes4.dex */
public class h extends g {
    protected static final String UNIT_EM = "em";
    protected static final String UNIT_PERCENT = "%";

    protected int resolveAbsolute(@NonNull f.a aVar, int i8, float f8) {
        return (int) ((UNIT_EM.equals(aVar.unit) ? aVar.value * f8 : aVar.value) + 0.5f);
    }

    @Override // io.noties.markwon.image.g
    @NonNull
    public Rect resolveImageSize(@NonNull a aVar) {
        return resolveImageSize(aVar.getImageSize(), aVar.getResult().getBounds(), aVar.getLastKnownCanvasWidth(), aVar.getLastKnowTextSize());
    }

    @NonNull
    protected Rect resolveImageSize(@Nullable f fVar, @NonNull Rect rect, int i8, float f8) {
        Rect rect2;
        int resolveAbsolute;
        if (fVar == null) {
            int width = rect.width();
            if (width > i8) {
                return new Rect(0, 0, i8, (int) ((rect.height() / (width / i8)) + 0.5f));
            }
            return rect;
        }
        f.a aVar = fVar.width;
        f.a aVar2 = fVar.height;
        int width2 = rect.width();
        int height = rect.height();
        float f9 = width2 / height;
        if (aVar != null) {
            if (UNIT_PERCENT.equals(aVar.unit)) {
                resolveAbsolute = (int) ((i8 * (aVar.value / 100.0f)) + 0.5f);
            } else {
                resolveAbsolute = resolveAbsolute(aVar, width2, f8);
            }
            rect2 = new Rect(0, 0, resolveAbsolute, (aVar2 == null || UNIT_PERCENT.equals(aVar2.unit)) ? (int) ((resolveAbsolute / f9) + 0.5f) : resolveAbsolute(aVar2, height, f8));
        } else {
            if (aVar2 == null || UNIT_PERCENT.equals(aVar2.unit)) {
                return rect;
            }
            int resolveAbsolute2 = resolveAbsolute(aVar2, height, f8);
            rect2 = new Rect(0, 0, (int) ((resolveAbsolute2 * f9) + 0.5f), resolveAbsolute2);
        }
        return rect2;
    }
}

package nl.dionsegijn.konfetti.core.emitter;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import com.squareup.util.android.Views;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Rotation;

/* loaded from: classes4.dex */
public final class PartyEmitter {
    public float createParticleMs;
    public float elapsedTime;
    public Object emitterConfig;
    public final float pixelDensity;
    public final Object random;

    public PartyEmitter(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.random = textPaint;
        Views.dip(context, 14.0f);
        Views.dip(context, 14.0f);
        float applyDimension = TypedValue.applyDimension(1, 14.0f, context.getResources().getDisplayMetrics());
        this.pixelDensity = TypedValue.applyDimension(1, 14.0f, context.getResources().getDisplayMetrics());
        textPaint.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_medium));
        textPaint.setTextSize(Views.sp(context, 16.0f));
        this.elapsedTime = (applyDimension * 2.0f) + textPaint.measureText("Placeholder");
    }

    public void draw(Canvas canvas, int i, int i2) {
        canvas.getClass();
        float f = this.pixelDensity;
        float f2 = (i - (f * 2.0f)) / 2.0f;
        if (((StaticLayout) this.emitterConfig) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticLayout");
            throw null;
        }
        float height = (f2 - (r1.getHeight() / 2)) + f;
        float f3 = this.createParticleMs;
        int save = canvas.save();
        canvas.translate(f3, height);
        try {
            StaticLayout staticLayout = (StaticLayout) this.emitterConfig;
            if (staticLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticLayout");
                throw null;
            }
            staticLayout.getPaint().setColor(i2);
            StaticLayout staticLayout2 = (StaticLayout) this.emitterConfig;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("staticLayout");
                throw null;
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public int generateLayoutAndGetHeight(float f, int i) {
        this.createParticleMs = f;
        StaticLayout build = StaticLayout.Builder.obtain("Placeholder", 0, 11, (TextPaint) this.random, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(RecyclerView.DECELERATION_RATE, 1.5f).setIncludePad(true).build();
        build.getClass();
        this.emitterConfig = build;
        return (((int) this.pixelDensity) * 2) + build.getHeight();
    }

    public float rotationSpeed(Rotation rotation) {
        return (((((Random) this.random).nextFloat() * 2.0f) - 1.0f) * 0.5f) + 1.0f;
    }

    public PartyEmitter(EmitterConfig emitterConfig, float f) {
        Random random = new Random();
        this.emitterConfig = emitterConfig;
        this.pixelDensity = f;
        this.random = random;
    }
}

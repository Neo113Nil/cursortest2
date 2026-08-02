package nl.dionsegijn.konfetti.models;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public interface Shape {

    /* loaded from: classes6.dex */
    public final class Square implements Shape {
        public static final Square INSTANCE = new Square();

        @Override // nl.dionsegijn.konfetti.models.Shape
        public final void draw(Canvas canvas, Paint paint, float f) {
            canvas.getClass();
            paint.getClass();
            canvas.drawRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, f, paint);
        }
    }

    void draw(Canvas canvas, Paint paint, float f);
}

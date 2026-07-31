package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes14.dex */
public class MockView extends View {
    private boolean mDrawDiagonals;
    private boolean mDrawLabel;
    private int mMargin;
    private Paint mPaintDiagonals;
    private Paint mPaintText;
    private Paint mPaintTextBackground;
    protected String mText;
    private Rect mTextBounds;

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.mDrawDiagonals) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.mPaintDiagonals);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.mPaintDiagonals);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.mPaintDiagonals);
            canvas.drawLine(f, 0.0f, f, f2, this.mPaintDiagonals);
            canvas.drawLine(f, f2, 0.0f, f2, this.mPaintDiagonals);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.mPaintDiagonals);
        }
        String str = this.mText;
        if (str == null || !this.mDrawLabel) {
            return;
        }
        this.mPaintText.getTextBounds(str, 0, str.length(), this.mTextBounds);
        float width2 = (width - this.mTextBounds.width()) / 2.0f;
        float height2 = ((height - this.mTextBounds.height()) / 2.0f) + this.mTextBounds.height();
        this.mTextBounds.offset((int) width2, (int) height2);
        Rect rect = this.mTextBounds;
        int i = rect.left;
        int i2 = this.mMargin;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.mTextBounds, this.mPaintTextBackground);
        canvas.drawText(this.mText, width2, height2, this.mPaintText);
    }
}

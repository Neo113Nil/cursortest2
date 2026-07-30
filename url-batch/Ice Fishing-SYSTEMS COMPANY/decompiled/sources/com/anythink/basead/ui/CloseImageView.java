package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class CloseImageView extends ImageView implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f10137a;

    /* renamed from: b, reason: collision with root package name */
    private float f10138b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f10139c;

    /* renamed from: d, reason: collision with root package name */
    private float f10140d;

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10137a = getClass().getSimpleName();
        this.f10138b = 1.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        float f6 = this.f10138b;
        if (f6 > 1.0f) {
            am.a(this, f6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f10138b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f10139c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f6) {
        this.f10138b = f6;
        if (f6 <= 0.0f) {
            this.f10138b = 1.0f;
        }
        float f9 = this.f10138b;
        if (f9 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.f10139c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.f10139c);
                    int width = ((int) ((CloseImageView.this.f10138b - 1.0f) * CloseImageView.this.f10139c.width())) / 2;
                    int height = ((int) ((CloseImageView.this.f10138b - 1.0f) * CloseImageView.this.f10139c.height())) / 2;
                    CloseImageView.this.f10139c.top -= height;
                    CloseImageView.this.f10139c.bottom += height;
                    CloseImageView.this.f10139c.left -= width;
                    CloseImageView.this.f10139c.right += width;
                }
            });
        } else if (f9 > 1.0f) {
            am.a(this, f9);
        }
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d2) {
        if (this.f10140d < 1.0f && d2 >= 0.0d && d2 <= 1.0d) {
            float f6 = (float) d2;
            try {
                this.f10140d = f6;
                setAlpha(f6);
            } catch (Throwable unused) {
            }
        }
    }
}

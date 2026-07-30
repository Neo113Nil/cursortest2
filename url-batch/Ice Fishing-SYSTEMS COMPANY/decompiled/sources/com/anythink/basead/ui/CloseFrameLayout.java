package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class CloseFrameLayout extends FrameLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10125a = "CloseFrameLayout";

    /* renamed from: b, reason: collision with root package name */
    private float f10126b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f10127c;

    /* renamed from: d, reason: collision with root package name */
    private float f10128d;

    public CloseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10126b = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        float f6 = this.f10126b;
        if (f6 > 1.0f) {
            am.a(this, f6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f10126b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f10127c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f6) {
        this.f10126b = f6;
        if (f6 <= 0.0f) {
            this.f10126b = 1.0f;
        }
        float f9 = this.f10126b;
        if (f9 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseFrameLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseFrameLayout.this.f10127c = new Rect();
                    CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
                    closeFrameLayout.getHitRect(closeFrameLayout.f10127c);
                    int width = ((int) ((CloseFrameLayout.this.f10126b - 1.0f) * CloseFrameLayout.this.f10127c.width())) / 2;
                    int height = ((int) ((CloseFrameLayout.this.f10126b - 1.0f) * CloseFrameLayout.this.f10127c.height())) / 2;
                    CloseFrameLayout.this.f10127c.top -= height;
                    CloseFrameLayout.this.f10127c.bottom += height;
                    CloseFrameLayout.this.f10127c.left -= width;
                    CloseFrameLayout.this.f10127c.right += width;
                }
            });
        } else if (f9 > 1.0f) {
            am.a(this, f9);
        }
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d2) {
        if (this.f10128d < 1.0f && d2 >= 0.0d && d2 <= 1.0d) {
            float f6 = (float) d2;
            try {
                this.f10128d = f6;
                setAlpha(f6);
            } catch (Throwable unused) {
            }
        }
    }
}

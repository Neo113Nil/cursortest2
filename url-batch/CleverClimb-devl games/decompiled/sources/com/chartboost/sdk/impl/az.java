package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class az extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f3759a;

    /* renamed from: c, reason: collision with root package name */
    final a f3760c;

    /* renamed from: d, reason: collision with root package name */
    protected Button f3761d;
    boolean e;

    protected abstract void a(MotionEvent motionEvent);

    public az(Context context) {
        this(context, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public az(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3759a = new Rect();
        this.f3761d = null;
        this.e = true;
        this.f3760c = new a(getContext());
        this.f3760c.setOnTouchListener(new View.OnTouchListener() { // from class: com.chartboost.sdk.impl.az.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a2 = az.this.a(view, motionEvent);
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        az.this.f3760c.a(a2);
                        return a2;
                    case 1:
                        if (az.this.getVisibility() == 0 && az.this.isEnabled() && a2) {
                            az.this.a(motionEvent);
                        }
                        az.this.f3760c.a(false);
                        return true;
                    case 2:
                        az.this.f3760c.a(a2);
                        return true;
                    case 3:
                    case 4:
                        az.this.f3760c.a(false);
                        return true;
                    default:
                        return true;
                }
            }
        });
        addView(this.f3760c, new RelativeLayout.LayoutParams(-1, -1));
    }

    boolean a(View view, MotionEvent motionEvent) {
        view.getLocalVisibleRect(this.f3759a);
        this.f3759a.left += view.getPaddingLeft();
        this.f3759a.top += view.getPaddingTop();
        this.f3759a.right -= view.getPaddingRight();
        this.f3759a.bottom -= view.getPaddingBottom();
        return this.f3759a.contains(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
    }

    private class a extends ay {

        /* renamed from: c, reason: collision with root package name */
        private boolean f3765c;

        public a(Context context) {
            super(context);
            this.f3765c = false;
            this.f3765c = false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return true;
        }

        protected void a(boolean z) {
            if (az.this.e && z) {
                if (this.f3765c) {
                    return;
                }
                if (getDrawable() != null) {
                    getDrawable().setColorFilter(1996488704, PorterDuff.Mode.SRC_ATOP);
                } else if (getBackground() != null) {
                    getBackground().setColorFilter(1996488704, PorterDuff.Mode.SRC_ATOP);
                }
                invalidate();
                this.f3765c = true;
                return;
            }
            if (this.f3765c) {
                if (getDrawable() != null) {
                    getDrawable().clearColorFilter();
                } else if (getBackground() != null) {
                    getBackground().clearColorFilter();
                }
                invalidate();
                this.f3765c = false;
            }
        }
    }

    public void a(String str) {
        if (str != null) {
            a().setText(str);
            addView(a(), new RelativeLayout.LayoutParams(-1, -1));
            this.f3760c.setVisibility(8);
            a(false);
            this.f3761d.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.az.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    az.this.a((MotionEvent) null);
                }
            });
            return;
        }
        if (this.f3761d != null) {
            removeView(a());
            this.f3761d = null;
            this.f3760c.setVisibility(0);
            a(true);
        }
    }

    public TextView a() {
        if (this.f3761d == null) {
            this.f3761d = new Button(getContext());
            this.f3761d.setGravity(17);
        }
        this.f3761d.postInvalidate();
        return this.f3761d;
    }

    public void a(com.chartboost.sdk.Libraries.h hVar) {
        if (hVar == null || !hVar.c()) {
            return;
        }
        this.f3760c.a(hVar);
        a((String) null);
    }

    public void a(ImageView.ScaleType scaleType) {
        this.f3760c.setScaleType(scaleType);
    }

    public void a(boolean z) {
        this.e = z;
    }
}

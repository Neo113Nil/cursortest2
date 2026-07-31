package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.c2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes10.dex */
public class k extends View {
    private final c2 a;
    private boolean b;

    interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public String getIdentifier() {
        return this.a.b();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a2 = this.a.a();
        if (a2 == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(a2);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}

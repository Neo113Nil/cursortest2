package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class gz extends ViewGroup {
    protected final gy a;
    public final Context b;
    public ActionMenuView c;
    public hk d;
    public int e;
    protected brn f;
    private boolean g;
    private boolean h;

    public gz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new gy(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        int i5 = measuredHeight + i4;
        if (z) {
            view.layout(i - measuredWidth, i4, i, i5);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, i5);
        return measuredWidth;
    }

    public void c(int i) {
        throw null;
    }

    public final brn g(int i, long j) {
        brn brnVar = this.f;
        if (brnVar != null) {
            brnVar.M();
        }
        if (i != 0) {
            brn s = yq.s(this);
            s.N(0.0f);
            s.O(j);
            gy gyVar = this.a;
            gyVar.d(s, i);
            s.P(gyVar);
            return s;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        brn s2 = yq.s(this);
        s2.N(1.0f);
        s2.O(j);
        gy gyVar2 = this.a;
        gyVar2.d(s2, 0);
        s2.P(gyVar2);
        return s2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, em.a, R.attr.actionBarStyle, 0);
        c(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        hk hkVar = this.d;
        if (hkVar != null) {
            hkVar.i = e.d(hkVar.b);
            gd gdVar = hkVar.c;
            if (gdVar != null) {
                gdVar.l(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.h = true;
                }
                if (i != 10 || i == 3) {
                    this.h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            brn brnVar = this.f;
            if (brnVar != null) {
                brnVar.M();
            }
            super.setVisibility(i);
        }
    }

    public gz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    gz(Context context) {
        this(context, null);
    }
}

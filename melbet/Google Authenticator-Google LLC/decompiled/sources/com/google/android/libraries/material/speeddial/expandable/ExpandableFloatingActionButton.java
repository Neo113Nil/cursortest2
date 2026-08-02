package com.google.android.libraries.material.speeddial.expandable;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.dmj;
import defpackage.dmk;
import defpackage.dnp;
import defpackage.dns;
import defpackage.dnu;
import defpackage.dnv;
import defpackage.dnw;
import defpackage.dnx;
import defpackage.dnz;
import defpackage.dob;
import defpackage.doc;
import defpackage.mu;
import defpackage.yq;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandableFloatingActionButton extends FloatingActionButton {
    private static final String h = "ExpandableFloatingActionButton";
    public ColorStateList a;
    public boolean b;
    private dnu i;

    public ExpandableFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.e) {
            this.e = true;
            super.f().i();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.a, i, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(4);
        boolean hasValue2 = obtainStyledAttributes.hasValue(3);
        boolean hasValue3 = obtainStyledAttributes.hasValue(0);
        boolean z = hasValue2 && hasValue3;
        if (hasValue && z) {
            Log.w(h, "app:rotationDegrees can't be specified w/ app:expandedDrawable & app:collapsedDrawable");
        }
        if (hasValue2 != hasValue3) {
            String str = h;
            StringBuilder sb = new StringBuilder("app:");
            sb.append(true != hasValue2 ? "expandedDrawable" : "collapsedDrawable");
            sb.append(" must also be specified");
            Log.w(str, sb.toString());
        }
        if (hasValue && getDrawable() == null) {
            Log.w(h, "A source image for this FAB must also be specified");
        }
        if (hasValue) {
            int integer = obtainStyledAttributes.getInteger(4, 0);
            int i2 = dnu.c;
            c(new dnz(getDrawable(), integer));
        } else if (z) {
            Drawable drawable = obtainStyledAttributes.getDrawable(3);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            int i3 = dnu.c;
            c(new dns(drawable, drawable2));
        }
        setImageTintList(obtainStyledAttributes.getColorStateList(1));
        int i4 = obtainStyledAttributes.getInt(2, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int[] iArr = dob.a;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (i4 != 9) {
            switch (i4) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        setImageTintMode(mode);
        obtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.c;
        this.a = colorStateList;
        if (colorStateList != null) {
            b(dob.b(colorStateList));
        }
        refreshDrawableState();
    }

    public final void b(ColorStateList colorStateList) {
        super.setBackgroundTintList(dob.d(colorStateList, this.b));
    }

    public final void c(dnu dnuVar) {
        if (this.i != dnuVar) {
            this.i = dnuVar;
            setImageDrawable(dnuVar);
        }
    }

    public final void d(boolean z) {
        if (this.b != z) {
            this.b = z;
            ColorStateList colorStateList = this.a;
            if (colorStateList != null) {
                int a = dob.a(colorStateList);
                int defaultColor = colorStateList.getDefaultColor();
                mu muVar = new mu(this, 6, null);
                dnv dnvVar = new dnv(this, z, a, defaultColor);
                int i = true != z ? a : defaultColor;
                if (true != z) {
                    a = defaultColor;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i, a);
                ofInt.setEvaluator(dmj.a);
                ofInt.addUpdateListener(muVar);
                ofInt.addListener(dnvVar);
                ofInt.setDuration(200L);
                ofInt.setInterpolator(dmk.c);
                int i2 = yq.a;
                if (!isLaidOut()) {
                    ofInt.isStarted();
                    ofInt.end();
                } else if (isLayoutRequested()) {
                    dnp dnpVar = new dnp(this, ofInt, 2, null);
                    getViewTreeObserver().addOnPreDrawListener(dnpVar);
                    ofInt.addListener(new dnw(this, dnpVar));
                } else {
                    ofInt.start();
                }
            }
            if (getParent() instanceof CoordinatorLayout) {
                ((CoordinatorLayout) getParent()).b(this);
            }
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, dob.a);
        }
        return onCreateDrawableState;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        dnx dnxVar = (dnx) parcelable;
        super.onRestoreInstanceState(dnxVar.d);
        d(dnxVar.a);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    protected final Parcelable onSaveInstanceState() {
        dnx dnxVar = new dnx(super.onSaveInstanceState());
        dnxVar.a = this.b;
        return dnxVar;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.a = colorStateList;
        b(colorStateList);
    }

    public ExpandableFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableFloatingActionButton(Context context) {
        this(context, null);
    }
}

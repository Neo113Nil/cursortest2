package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class md0 extends nd {
    public boolean m;
    public boolean n;

    @Override // defpackage.nd
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // defpackage.nd
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t00.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.m = true;
                } else if (index == 22) {
                    this.n = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(ol olVar, int i, int i2);

    @Override // defpackage.nd, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m || this.n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.g; i++) {
                    View view = (View) constraintLayout.f.get(this.f[i]);
                    if (view != null) {
                        if (this.m) {
                            view.setVisibility(visibility);
                        }
                        if (this.n && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ts extends tb {
    private boolean a;
    private boolean b;

    public ts(Context context) {
        super(context);
    }

    @Override // defpackage.tb
    protected void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tr.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.a = true;
                } else if (index == 22) {
                    this.b = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.tb
    protected final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // defpackage.tb, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a || this.b) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.d; i++) {
                    View a = constraintLayout.a(this.c[i]);
                    if (a != null) {
                        if (this.a) {
                            a.setVisibility(visibility);
                        }
                        if (this.b && elevation > 0.0f) {
                            a.setTranslationZ(a.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        e();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        e();
    }

    public ts(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ts(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b(sk skVar, int i, int i2) {
    }
}

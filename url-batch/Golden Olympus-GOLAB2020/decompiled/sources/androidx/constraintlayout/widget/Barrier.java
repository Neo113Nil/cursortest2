package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import t.C3419a;
import t.C3423e;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: i, reason: collision with root package name */
    private int f11089i;

    /* renamed from: j, reason: collision with root package name */
    private int f11090j;

    /* renamed from: k, reason: collision with root package name */
    private C3419a f11091k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void m(C3423e c3423e, int i4, boolean z4) {
        this.f11090j = i4;
        if (z4) {
            int i5 = this.f11089i;
            if (i5 == 5) {
                this.f11090j = 1;
            } else if (i5 == 6) {
                this.f11090j = 0;
            }
        } else {
            int i6 = this.f11089i;
            if (i6 == 5) {
                this.f11090j = 0;
            } else if (i6 == 6) {
                this.f11090j = 1;
            }
        }
        if (c3423e instanceof C3419a) {
            ((C3419a) c3423e).L0(this.f11090j);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    protected void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f11091k = new C3419a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f11422a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.f11457h1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.f11452g1) {
                    this.f11091k.K0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.f11462i1) {
                    this.f11091k.M0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f11188d = this.f11091k;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public void f(C3423e c3423e, boolean z4) {
        m(c3423e, this.f11089i, z4);
    }

    public int getMargin() {
        return this.f11091k.I0();
    }

    public int getType() {
        return this.f11089i;
    }

    public boolean l() {
        return this.f11091k.G0();
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f11091k.K0(z4);
    }

    public void setDpMargin(int i4) {
        this.f11091k.M0((int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i4) {
        this.f11091k.M0(i4);
    }

    public void setType(int i4) {
        this.f11089i = i4;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}

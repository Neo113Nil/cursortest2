package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.ads.internal.view.hscroll.d;

/* loaded from: classes.dex */
public class b extends d implements d.a {

    /* renamed from: c, reason: collision with root package name */
    private final HScrollLinearLayoutManager f5863c;

    /* renamed from: d, reason: collision with root package name */
    private a f5864d;
    private int e;
    private int f;
    private int g;
    private int h;

    public interface a {
        void a(int i, int i2);
    }

    public b(Context context) {
        super(context);
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f5863c = new HScrollLinearLayoutManager(context, new c(), new com.facebook.ads.internal.view.hscroll.a());
        a();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f5863c = new HScrollLinearLayoutManager(context, new c(), new com.facebook.ads.internal.view.hscroll.a());
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f5863c = new HScrollLinearLayoutManager(context, new c(), new com.facebook.ads.internal.view.hscroll.a());
        a();
    }

    private void a() {
        this.f5863c.setOrientation(0);
        setLayoutManager(this.f5863c);
        setSaveEnabled(false);
        setSnapDelegate(this);
    }

    private void a(int i, int i2) {
        if (i == this.e && i2 == this.f) {
            return;
        }
        this.e = i;
        this.f = i2;
        if (this.f5864d != null) {
            this.f5864d.a(this.e, this.f);
        }
    }

    private int b(int i) {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - (this.h * 2);
        int itemCount = getAdapter().getItemCount();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (i3 > i) {
            i2++;
            if (i2 >= itemCount) {
                return i;
            }
            i3 = (int) ((measuredWidth - (i2 * r0)) / (i2 + 0.333f));
        }
        return i3;
    }

    @Override // com.facebook.ads.internal.view.hscroll.d.a
    public int a(int i) {
        int abs = Math.abs(i);
        if (abs <= this.f5865a) {
            return 0;
        }
        if (this.g == 0) {
            return 1;
        }
        return 1 + (abs / this.g);
    }

    @Override // com.facebook.ads.internal.view.hscroll.d
    protected void a(int i, boolean z) {
        super.a(i, z);
        a(i, 0);
    }

    public int getChildSpacing() {
        return this.h;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int round = Math.round(getMeasuredWidth() / 1.91f);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            round = Math.min(View.MeasureSpec.getSize(i2), round);
        } else if (mode == 1073741824) {
            round = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int b2 = b(round - paddingTop);
        setMeasuredDimension(getMeasuredWidth(), paddingTop + b2);
        setChildWidth(b2 + (this.h * 2));
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.f5863c.a(adapter == null ? -1 : adapter.hashCode());
        super.setAdapter(adapter);
    }

    public void setChildSpacing(int i) {
        this.h = i;
    }

    public void setChildWidth(int i) {
        this.g = i;
        int measuredWidth = getMeasuredWidth();
        this.f5863c.b((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.g) / 2);
        HScrollLinearLayoutManager hScrollLinearLayoutManager = this.f5863c;
        double d2 = this.g;
        double d3 = measuredWidth;
        Double.isNaN(d2);
        Double.isNaN(d3);
        hScrollLinearLayoutManager.a(d2 / d3);
    }

    public void setCurrentPosition(int i) {
        a(i, false);
    }

    public void setOnPageChangedListener(a aVar) {
        this.f5864d = aVar;
    }
}

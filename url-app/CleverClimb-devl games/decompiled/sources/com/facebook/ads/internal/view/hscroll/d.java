package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class d extends RecyclerView implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    protected final int f5865a;

    /* renamed from: b, reason: collision with root package name */
    protected int f5866b;

    /* renamed from: c, reason: collision with root package name */
    private int f5867c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5868d;
    private boolean e;
    private LinearLayoutManager f;
    private a g;

    public interface a {
        int a(int i);
    }

    public d(Context context) {
        super(context);
        this.f5866b = 0;
        this.f5867c = 0;
        this.f5868d = true;
        this.e = false;
        this.f5865a = a();
        setOnTouchListener(this);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5866b = 0;
        this.f5867c = 0;
        this.f5868d = true;
        this.e = false;
        this.f5865a = a();
        setOnTouchListener(this);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5866b = 0;
        this.f5867c = 0;
        this.f5868d = true;
        this.e = false;
        this.f5865a = a();
        setOnTouchListener(this);
    }

    private int a() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int a(int i) {
        int i2 = this.f5867c - i;
        int a2 = this.g.a(i2);
        return i2 > this.f5865a ? a(this.f5866b, a2) : i2 < (-this.f5865a) ? b(this.f5866b, a2) : this.f5866b;
    }

    private int a(int i, int i2) {
        return Math.min(i + i2, getItemCount() - 1);
    }

    private int b(int i, int i2) {
        return Math.max(i - i2, 0);
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getItemCount();
    }

    protected void a(int i, boolean z) {
        if (getAdapter() == null) {
            return;
        }
        this.f5866b = i;
        if (z) {
            smoothScrollToPosition(i);
        } else {
            scrollToPosition(i);
        }
    }

    public int getCurrentPosition() {
        return this.f5866b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || actionMasked == 4) {
            if (this.e) {
                a(a(rawX), true);
            }
            this.f5868d = true;
            this.e = false;
            return true;
        }
        if (actionMasked == 0 || actionMasked == 5 || (this.f5868d && actionMasked == 2)) {
            this.f5867c = rawX;
            if (this.f5868d) {
                this.f5868d = false;
            }
            this.e = true;
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("SnapRecyclerView only supports LinearLayoutManager");
        }
        super.setLayoutManager(layoutManager);
        this.f = (LinearLayoutManager) layoutManager;
    }

    public void setSnapDelegate(a aVar) {
        this.g = aVar;
    }
}

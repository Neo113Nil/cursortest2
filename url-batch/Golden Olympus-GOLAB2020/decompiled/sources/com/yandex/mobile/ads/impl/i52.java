package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.mobile.ads.impl.f12;
import com.yandex.mobile.ads.impl.ff1;

/* loaded from: classes3.dex */
final class i52 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ff1.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f27102c;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f27104e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f27100a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f27101b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    private final float f27103d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    private volatile float f27105f = 3.1415927f;

    public interface a {
    }

    public i52(Context context, a aVar) {
        this.f27102c = aVar;
        this.f27104e = new GestureDetector(context, this);
    }

    @Override // com.yandex.mobile.ads.impl.ff1.a
    public final void a(float[] fArr, float f4) {
        this.f27105f = -f4;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f27100a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        float x4 = (motionEvent2.getX() - this.f27100a.x) / this.f27103d;
        float y4 = motionEvent2.getY();
        PointF pointF = this.f27100a;
        float f6 = (y4 - pointF.y) / this.f27103d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d4 = this.f27105f;
        float cos = (float) Math.cos(d4);
        float sin = (float) Math.sin(d4);
        PointF pointF2 = this.f27101b;
        pointF2.x -= (cos * x4) - (sin * f6);
        float f7 = (cos * f6) + (sin * x4) + pointF2.y;
        pointF2.y = f7;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f7));
        ((f12.a) this.f27102c).a(this.f27101b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((f12.a) this.f27102c).a(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f27104e.onTouchEvent(motionEvent);
    }
}

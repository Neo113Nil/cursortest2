package com.baidu.platform.comapi.map.d0;

import android.util.Pair;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.map.d0.a;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private VelocityTracker f9623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9625c;

    public d() {
        if (JNIInitializer.getCachedContext() == null) {
            this.f9625c = ViewConfiguration.getMinimumFlingVelocity();
            this.f9624b = ViewConfiguration.getMaximumFlingVelocity();
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(JNIInitializer.getCachedContext());
        if (viewConfiguration == null) {
            this.f9625c = ViewConfiguration.getMinimumFlingVelocity();
            this.f9624b = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            this.f9625c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f9624b = viewConfiguration.getScaledMaximumFlingVelocity();
        }
    }

    public void a() {
        VelocityTracker velocityTracker = this.f9623a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9623a = null;
        }
    }

    public void b() {
        this.f9623a = VelocityTracker.obtain();
    }

    public Pair<a.d, a.d> c() {
        VelocityTracker velocityTracker = this.f9623a;
        if (velocityTracker == null) {
            return new Pair<>(new a.d(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON), new a.d(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON));
        }
        velocityTracker.computeCurrentVelocity(1000, this.f9624b);
        return new Pair<>(new a.d(this.f9623a.getXVelocity(0), this.f9623a.getYVelocity(0)), new a.d(this.f9623a.getXVelocity(1), this.f9623a.getYVelocity(1)));
    }

    public void a(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f9623a;
        if (velocityTracker == null) {
            this.f9623a = VelocityTracker.obtain();
        } else {
            velocityTracker.addMovement(motionEvent);
        }
    }
}

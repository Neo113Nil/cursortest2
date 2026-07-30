package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class Ty {

    /* renamed from: a, reason: collision with root package name */
    public long f27881a;

    /* renamed from: b, reason: collision with root package name */
    public long f27882b;

    /* renamed from: c, reason: collision with root package name */
    public long f27883c;

    /* renamed from: d, reason: collision with root package name */
    public long f27884d;

    /* renamed from: e, reason: collision with root package name */
    public double f27885e;

    /* renamed from: f, reason: collision with root package name */
    public double f27886f;

    /* renamed from: g, reason: collision with root package name */
    public double f27887g;

    /* renamed from: h, reason: collision with root package name */
    public float f27888h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f27889j;

    /* renamed from: k, reason: collision with root package name */
    public float f27890k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27881a++;
            this.f27887g = 0.0d;
            this.f27885e = motionEvent.getRawX();
            this.f27886f = motionEvent.getRawY();
            this.f27888h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.f27889j = motionEvent.getRawX();
            this.f27890k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f27883c++;
            this.f27887g = Math.hypot(motionEvent.getRawX() - this.f27885e, motionEvent.getRawY() - this.f27886f) + this.f27887g;
            this.f27885e = motionEvent.getRawX();
            this.f27886f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f27884d++;
            return;
        }
        this.f27882b += motionEvent.getHistorySize() + 1;
        this.f27887g = Math.hypot(motionEvent.getRawX() - this.f27885e, motionEvent.getRawY() - this.f27886f) + this.f27887g;
        this.f27885e = motionEvent.getRawX();
        this.f27886f = motionEvent.getRawY();
    }
}

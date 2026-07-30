package com.baidu.ar;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes.dex */
public class p7 extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public a f2930a;

    /* renamed from: b, reason: collision with root package name */
    public a f2931b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2932c;

    /* renamed from: d, reason: collision with root package name */
    public int f2933d;

    /* renamed from: e, reason: collision with root package name */
    public int f2934e;

    public enum a {
        SCREEN_ORIENTATION_PORTRAIT,
        SCREEN_ORIENTATION_LANDSCAPE,
        SCREEN_ORIENTATION_REVERSE_PORTRAIT,
        SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
        SCREEN_ORIENTATION_NOT_DEFINED
    }

    public p7(Context context) {
        super(context);
        this.f2932c = false;
        this.f2934e = 0;
    }

    public void a() {
        this.f2933d = b();
    }

    public final int b() {
        a aVar = this.f2930a;
        if (aVar == a.SCREEN_ORIENTATION_LANDSCAPE) {
            return 90;
        }
        if (aVar == a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE) {
            return -90;
        }
        if (aVar == a.SCREEN_ORIENTATION_REVERSE_PORTRAIT) {
            return com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME;
        }
        return 0;
    }

    public void c() {
        try {
            disable();
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
        this.f2934e = 0;
    }

    public void d() {
        try {
            enable();
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i8) {
        a aVar;
        a aVar2;
        if (i8 < 0) {
            aVar = a.SCREEN_ORIENTATION_NOT_DEFINED;
        } else {
            int i9 = this.f2934e;
            if (i9 == 1) {
                int i10 = ((i8 + 360) + this.f2933d) % 360;
                if (i10 <= 45 || i10 > 315) {
                    aVar2 = a.SCREEN_ORIENTATION_PORTRAIT;
                } else if (i10 > 45 && i10 <= 135) {
                    aVar2 = a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                } else {
                    if (i10 <= 135 || i10 > 225) {
                        if (i10 > 225 && i10 <= 315) {
                            aVar2 = a.SCREEN_ORIENTATION_LANDSCAPE;
                        }
                        if (this.f2932c && i9 == 1) {
                            this.f2932c = true;
                            this.f2930a = this.f2931b;
                            a();
                            return;
                        }
                        return;
                    }
                    aVar2 = a.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                }
                this.f2931b = aVar2;
                if (this.f2932c) {
                    return;
                } else {
                    return;
                }
            }
            if (i9 != 0) {
                return;
            }
            if (i8 <= 45 || i8 > 315) {
                aVar = a.SCREEN_ORIENTATION_PORTRAIT;
            } else if (i8 > 45 && i8 <= 135) {
                aVar = a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
            } else if (i8 > 135 && i8 <= 225) {
                aVar = a.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
            } else if (i8 <= 225 || i8 > 315) {
                return;
            } else {
                aVar = a.SCREEN_ORIENTATION_LANDSCAPE;
            }
        }
        this.f2931b = aVar;
    }

    public void a(int i8) {
        this.f2934e = i8;
    }
}

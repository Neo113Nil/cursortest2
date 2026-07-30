package com.baidu.platform.comapi.map.d0.e;

import android.util.Pair;
import android.view.MotionEvent;
import com.baidu.platform.comapi.map.d0.a;
import com.baidu.platform.comapi.map.d0.d;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public a.C0115a f9631a;

    /* renamed from: b, reason: collision with root package name */
    public a.C0115a f9632b;

    /* renamed from: c, reason: collision with root package name */
    public a.C0115a f9633c;

    /* renamed from: d, reason: collision with root package name */
    public MotionEvent f9634d;

    /* renamed from: f, reason: collision with root package name */
    private a f9636f;

    /* renamed from: e, reason: collision with root package name */
    public d f9635e = new d();

    /* renamed from: g, reason: collision with root package name */
    private boolean f9637g = false;

    public interface a {
        boolean a(b bVar);

        boolean a(b bVar, MotionEvent motionEvent);

        boolean b(b bVar);
    }

    public b(a aVar) {
        this.f9636f = aVar;
    }

    private void a() {
        this.f9635e.b();
        this.f9631a = null;
        this.f9632b = null;
        this.f9633c = null;
        this.f9637g = true;
        this.f9636f.b(this);
    }

    private void c(MotionEvent motionEvent) {
        a.C0115a a8 = a.C0115a.a(motionEvent);
        a.C0115a c0115a = this.f9633c;
        if (c0115a == null) {
            c0115a = a8;
        }
        this.f9632b = c0115a;
        this.f9633c = a8;
        if (this.f9631a == null) {
            this.f9631a = a8;
        }
    }

    public void b(MotionEvent motionEvent) {
        this.f9634d = motionEvent;
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.f9637g) {
                a(motionEvent);
                return;
            } else {
                if (motionEvent.getPointerCount() == 2) {
                    a();
                    return;
                }
                return;
            }
        }
        if (action != 6) {
            if (action == 261) {
                if (this.f9637g) {
                    return;
                }
                a();
                return;
            } else if (action != 262) {
                return;
            }
        }
        if (this.f9637g) {
            b();
        }
    }

    private void a(MotionEvent motionEvent) {
        this.f9635e.a(motionEvent);
        Pair<a.d, a.d> c8 = this.f9635e.c();
        if (motionEvent.getPointerCount() == 2) {
            if (Math.abs(((a.d) c8.first).f9602a) > i.DOUBLE_EPSILON || Math.abs(((a.d) c8.first).f9603b) > i.DOUBLE_EPSILON || Math.abs(((a.d) c8.second).f9602a) > i.DOUBLE_EPSILON || Math.abs(((a.d) c8.second).f9603b) > i.DOUBLE_EPSILON) {
                c(motionEvent);
                this.f9636f.a(this, motionEvent);
            }
        }
    }

    private void b() {
        this.f9635e.a();
        this.f9637g = false;
        this.f9636f.a(this);
    }
}

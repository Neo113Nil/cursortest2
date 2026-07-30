package com.baidu.platform.comapi.map.d0.e;

import android.graphics.Point;
import android.view.MotionEvent;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.d0.a;
import com.baidu.platform.comapi.map.w;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f9626a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9627b = false;

    /* renamed from: c, reason: collision with root package name */
    private a.C0115a f9628c;

    /* renamed from: d, reason: collision with root package name */
    private MapController f9629d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0116a f9630e;

    /* renamed from: com.baidu.platform.comapi.map.d0.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC0116a {
        boolean a(a aVar);
    }

    public a(InterfaceC0116a interfaceC0116a, MapController mapController) {
        this.f9630e = interfaceC0116a;
        this.f9629d = mapController;
    }

    private void a() {
        this.f9627b = false;
        this.f9628c = null;
        this.f9626a = 0L;
    }

    private void c(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        this.f9628c = a.C0115a.a(motionEvent);
        this.f9627b = true;
    }

    public void b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9626a = System.currentTimeMillis();
            return;
        }
        if (action != 5) {
            if (action != 6) {
                if (action != 261) {
                    if (action != 262) {
                        return;
                    }
                }
            }
            a(motionEvent);
            a();
            return;
        }
        c(motionEvent);
    }

    private void a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2 || this.f9628c == null) {
            return;
        }
        a.C0115a a8 = a.C0115a.a(motionEvent);
        boolean z7 = Math.abs(new a.C0115a(this.f9628c.f9595a, a8.f9595a).b()) < 20.0d && Math.abs(new a.C0115a(this.f9628c.f9596b, a8.f9596b).b()) < 20.0d;
        boolean z8 = System.currentTimeMillis() - this.f9626a < 200;
        if (this.f9629d != null) {
            float x7 = motionEvent.getX(1) - motionEvent.getX(0);
            float y7 = motionEvent.getY(1) - motionEvent.getY();
            Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            Point point2 = new Point((int) (motionEvent.getRawX() + x7), (int) (motionEvent.getRawY() + y7));
            this.f9629d.getMapView();
            if (z7 && z8 && this.f9627b) {
                List<w> listeners = this.f9629d.getListeners();
                s mapStatusInner = this.f9629d.getMapStatusInner();
                if (listeners != null) {
                    for (int i8 = 0; i8 < listeners.size(); i8++) {
                        w wVar = listeners.get(i8);
                        if (wVar != null && wVar.a(point, point2, mapStatusInner)) {
                            return;
                        }
                    }
                }
                this.f9630e.a(this);
            }
        }
    }
}

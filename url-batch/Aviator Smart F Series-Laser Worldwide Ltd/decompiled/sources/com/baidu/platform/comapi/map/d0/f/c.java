package com.baidu.platform.comapi.map.d0.f;

import android.graphics.Point;
import android.util.Pair;
import android.view.MotionEvent;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapStatus;
import com.baidu.platform.comapi.map.d0.a;
import com.baidu.platform.comapi.map.w;
import com.github.mikephil.charting.utils.i;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f9645b;

    /* renamed from: c, reason: collision with root package name */
    private long f9646c;

    /* renamed from: d, reason: collision with root package name */
    private MapController f9647d;

    public c(MapController mapController) {
        super(mapController);
        this.f9645b = true;
        this.f9647d = mapController;
    }

    @Override // com.baidu.platform.comapi.map.d0.f.a
    public void a(com.baidu.platform.comapi.map.d0.e.b bVar, MotionEvent motionEvent) {
        a.C0115a c0115a = bVar.f9632b;
        a.C0115a c0115a2 = bVar.f9633c;
        MapStatus mapStatus = this.f9647d.getMapStatus();
        double d8 = c0115a2.f9595a.f9598b - c0115a.f9595a.f9598b;
        double d9 = c0115a2.f9596b.f9598b - c0115a.f9596b.f9598b;
        double d10 = d8 * d9;
        if (d10 > i.DOUBLE_EPSILON) {
            a(d8, mapStatus);
        } else if (d10 == i.DOUBLE_EPSILON) {
            if (d8 != i.DOUBLE_EPSILON) {
                a(d8, mapStatus);
            } else if (d9 != i.DOUBLE_EPSILON) {
                a(d9, mapStatus);
            }
        } else if (Math.abs(d8) > Math.abs(d9)) {
            a(d8, mapStatus);
        } else {
            a(d9, mapStatus);
        }
        float x7 = motionEvent.getX(1) - motionEvent.getX(0);
        float y7 = motionEvent.getY(1) - motionEvent.getY(0);
        Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        Point point2 = new Point((int) (motionEvent.getRawX() + x7), (int) (motionEvent.getRawY() + y7));
        List<w> listeners = this.f9647d.getListeners();
        if (listeners != null) {
            s mapStatusInner = this.f9647d.getMapStatusInner();
            for (int i8 = 0; i8 < listeners.size(); i8++) {
                w wVar = listeners.get(i8);
                if (wVar != null && wVar.d(point, point2, mapStatusInner)) {
                    return;
                }
            }
        }
        this.f9647d.setMapStatus(mapStatus);
        if (this.f9645b) {
            this.f9645b = false;
            this.f9647d.getGestureMonitor().b();
        }
    }

    @Override // com.baidu.platform.comapi.map.d0.f.a
    public void a(com.baidu.platform.comapi.map.d0.e.b bVar, Pair<a.d, a.d> pair) {
        MapStatus mapStatus = this.f9647d.getMapStatus();
        if (mapStatus.bOverlookSpringback) {
            if (mapStatus.overlooking > i.DOUBLE_EPSILON) {
                mapStatus.overlooking = i.DOUBLE_EPSILON;
            } else {
                mapStatus.overlooking = mapStatus.minOverlooking;
            }
            this.f9647d.setMapStatusWithAnimation(mapStatus, 200);
        }
    }

    private void a(double d8, MapStatus mapStatus) {
        if (this.f9646c == 0) {
            this.f9646c = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f9646c = currentTimeMillis;
        if (currentTimeMillis - currentTimeMillis > 50 || Math.abs(d8) < 4.0d) {
            return;
        }
        if (d8 > i.DOUBLE_EPSILON) {
            mapStatus.overlooking -= 4.0d;
        } else {
            mapStatus.overlooking += 2.0d;
        }
    }
}

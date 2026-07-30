package com.baidu.platform.comapi.map.d0;

import android.view.MotionEvent;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.d0.e.a;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private MapController f9604a;

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.platform.comapi.map.d0.e.b f9605b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.map.d0.e.a f9606c;

    /* renamed from: d, reason: collision with root package name */
    a.InterfaceC0116a f9607d = new a();

    class a implements a.InterfaceC0116a {
        a() {
        }

        @Override // com.baidu.platform.comapi.map.d0.e.a.InterfaceC0116a
        public boolean a(com.baidu.platform.comapi.map.d0.e.a aVar) {
            if (!b.this.f9604a.isTwoTouchClickZoomEnabled()) {
                return false;
            }
            b.this.f9604a.setActingTwoClickZoom(true);
            b.this.f9604a.getGestureMonitor().b(b.this.f9604a.getZoomLevel() - 1.0f);
            b.this.f9604a.mapStatusChangeStart();
            b.this.f9604a.MapMsgProc(8193, 4, 0);
            if (b.this.f9604a.isNaviMode() && b.this.f9604a.getNaviMapViewListener() != null) {
                b.this.f9604a.getNaviMapViewListener().onAction(521, null);
            }
            return true;
        }
    }

    public b(MapController mapController) {
        this.f9604a = mapController;
        this.f9605b = new com.baidu.platform.comapi.map.d0.e.b(new com.baidu.platform.comapi.map.d0.f.b(mapController));
        this.f9606c = new com.baidu.platform.comapi.map.d0.e.a(this.f9607d, mapController);
    }

    public void a(MotionEvent motionEvent) {
        this.f9605b.b(motionEvent);
        this.f9606c.b(motionEvent);
    }
}

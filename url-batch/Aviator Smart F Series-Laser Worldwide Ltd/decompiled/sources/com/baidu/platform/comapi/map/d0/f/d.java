package com.baidu.platform.comapi.map.d0.f;

import android.graphics.Point;
import android.util.Pair;
import android.view.MotionEvent;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapStatus;
import com.baidu.platform.comapi.map.MapViewInterface;
import com.baidu.platform.comapi.map.d0.a;
import com.baidu.platform.comapi.map.w;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.github.mikephil.charting.utils.i;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes2.dex */
public class d extends a {

    /* renamed from: b, reason: collision with root package name */
    private GeoPoint f9648b;

    /* renamed from: c, reason: collision with root package name */
    private int f9649c;

    /* renamed from: d, reason: collision with root package name */
    private float f9650d;

    /* renamed from: e, reason: collision with root package name */
    private Queue<a.c> f9651e;

    /* renamed from: f, reason: collision with root package name */
    private a.c f9652f;

    /* renamed from: g, reason: collision with root package name */
    private a.c f9653g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9654h;

    /* renamed from: i, reason: collision with root package name */
    private com.baidu.platform.comapi.map.d0.e.b f9655i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9656j;

    /* renamed from: k, reason: collision with root package name */
    private double f9657k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9658l;

    /* renamed from: m, reason: collision with root package name */
    private long f9659m;

    public d(MapController mapController) {
        super(mapController);
        this.f9651e = new LinkedList();
        this.f9654h = false;
        this.f9656j = false;
        this.f9657k = i.DOUBLE_EPSILON;
        this.f9658l = false;
        this.f9659m = 0L;
    }

    private void b(MapStatus mapStatus) {
        com.baidu.platform.comapi.map.d0.e.b bVar = this.f9655i;
        double abs = Math.abs(new a.c(new a.C0115a(bVar.f9632b.f9595a, bVar.f9633c.f9595a), this.f9655i.f9632b).f9599a);
        com.baidu.platform.comapi.map.d0.e.b bVar2 = this.f9655i;
        double abs2 = Math.abs(new a.c(new a.C0115a(bVar2.f9632b.f9596b, bVar2.f9633c.f9596b), this.f9655i.f9632b).f9599a);
        double d8 = this.f9657k;
        if (d8 == i.DOUBLE_EPSILON || d8 * this.f9653g.f9600b >= i.DOUBLE_EPSILON) {
            if (this.f9656j) {
                mapStatus.rotation = (int) ((this.f9649c + this.f9652f.f9599a) % 360.0d);
            } else {
                double d9 = this.f9653g.f9600b;
                boolean z7 = false;
                boolean z8 = (d9 < 1.0d && abs > 60.0d) || (d9 > 1.0d && Math.abs(abs - 180.0d) > 60.0d);
                double d10 = this.f9653g.f9600b;
                if ((d10 > 1.0d && abs2 > 60.0d) || (d10 < 1.0d && Math.abs(abs2 - 180.0d) > 60.0d)) {
                    z7 = true;
                }
                if (z8 || z7) {
                    if (Math.abs(this.f9652f.f9599a) > (MapController.isCompass ? 30 : 10)) {
                        this.f9656j = true;
                        this.f9638a.getGestureMonitor().c();
                        this.f9649c = (int) (this.f9649c - this.f9652f.f9599a);
                        if (MapController.isCompass) {
                            this.f9658l = true;
                            com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.a());
                        }
                    }
                }
            }
            this.f9657k = this.f9653g.f9600b;
        }
    }

    private void c(MapStatus mapStatus) {
        float log = this.f9650d + ((float) (Math.log(this.f9652f.f9600b) / Math.log(2.0d)));
        mapStatus.level = log;
        if (log < 4.0f) {
            log = 4.0f;
        }
        mapStatus.level = log;
        if (log > 22.0f) {
            log = 22.0f;
        }
        mapStatus.level = log;
    }

    @Override // com.baidu.platform.comapi.map.d0.f.a
    public void a(com.baidu.platform.comapi.map.d0.e.b bVar) {
        MapViewInterface mapView = this.f9638a.getMapView();
        if (mapView == null) {
            return;
        }
        MapStatus mapStatus = this.f9638a.getMapStatus();
        a.b a8 = bVar.f9631a.a();
        this.f9648b = mapView.getProjection().fromPixels((int) a8.f9597a, (int) a8.f9598b);
        this.f9650d = this.f9638a.getZoomLevel();
        this.f9649c = mapStatus.rotation;
        this.f9657k = i.DOUBLE_EPSILON;
    }

    @Override // com.baidu.platform.comapi.map.d0.f.a
    public void a(com.baidu.platform.comapi.map.d0.e.b bVar, MotionEvent motionEvent) {
        this.f9655i = bVar;
        this.f9652f = new a.c(bVar.f9631a, bVar.f9633c);
        this.f9653g = new a.c(bVar.f9632b, bVar.f9633c);
        List<w> listeners = this.f9638a.getListeners();
        if (listeners != null) {
            s mapStatusInner = this.f9638a.getMapStatusInner();
            float x7 = motionEvent.getX(1) - motionEvent.getX(0);
            float y7 = motionEvent.getY(1) - motionEvent.getY(0);
            Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            Point point2 = new Point((int) (motionEvent.getRawX() + x7), (int) (motionEvent.getRawY() + y7));
            for (int i8 = 0; i8 < listeners.size(); i8++) {
                w wVar = listeners.get(i8);
                if (wVar != null && wVar.b(point, point2, mapStatusInner)) {
                    return;
                }
            }
        }
        MapStatus mapStatus = this.f9638a.getMapStatus();
        if (this.f9638a.isEnableZoom()) {
            c(mapStatus);
        }
        if (this.f9638a.is3DGestureEnable() && this.f9638a.getMapControlMode() != MapController.MapControlMode.STREET) {
            b(mapStatus);
        }
        if (mapStatus.overlooking == i.DOUBLE_EPSILON && this.f9638a.isCanTouchMove()) {
            a(mapStatus);
        }
        this.f9638a.setMapStatus(mapStatus);
        if (this.f9638a.isNaviMode() && this.f9638a.getNaviMapViewListener() != null) {
            this.f9638a.getNaviMapViewListener().onAction(520, null);
        }
        this.f9638a.mapStatusChangeStart();
        if (this.f9651e.size() >= 10) {
            this.f9651e.poll();
        }
        this.f9651e.offer(this.f9653g);
        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.d());
        this.f9659m = System.currentTimeMillis();
    }

    private void a(MapStatus mapStatus) {
        MapViewInterface mapView;
        a.b a8;
        com.baidu.platform.comapi.basestruct.Point pixels;
        a.b a9;
        com.baidu.platform.comapi.basestruct.Point pixels2;
        if (this.f9648b != null) {
            if (Math.abs(this.f9653g.f9601c.f9602a) > i.DOUBLE_EPSILON || Math.abs(this.f9653g.f9601c.f9603b) > i.DOUBLE_EPSILON) {
                a.b a10 = this.f9655i.f9631a.a();
                a.b a11 = this.f9655i.f9633c.a();
                double d8 = a11.f9597a - a10.f9597a;
                double d9 = a11.f9598b - a10.f9598b;
                double sqrt = Math.sqrt((d8 * d8) + (d9 * d9));
                if ((!MapController.isCompass || sqrt >= 100.0d) && (mapView = this.f9638a.getMapView()) != null) {
                    if (!MapController.isCompass && !this.f9658l) {
                        MapController mapController = this.f9638a;
                        if (mapController != null && mapController.getPointGesturesCenter() != null) {
                            Point pointGesturesCenter = this.f9638a.getPointGesturesCenter();
                            if (pointGesturesCenter == null) {
                                return;
                            }
                            this.f9648b = mapView.getProjection().fromPixels(pointGesturesCenter.x, pointGesturesCenter.y);
                            a9 = new a.b(pointGesturesCenter.x, pointGesturesCenter.y);
                        } else {
                            MapController mapController2 = this.f9638a;
                            if (mapController2 == null || mapController2.getLatLngGesturesCenter() == null) {
                                MapController mapController3 = this.f9638a;
                                if (mapController3 == null) {
                                    return;
                                }
                                if (!mapController3.isEnableZoom() && !this.f9638a.is3DGestureEnable()) {
                                    return;
                                } else {
                                    a9 = this.f9655i.f9633c.a();
                                }
                            } else {
                                GeoPoint ll2mc = CoordUtil.ll2mc(this.f9638a.getLatLngGesturesCenter());
                                if (ll2mc == null || (pixels2 = this.f9638a.getMapView().getProjection().toPixels(ll2mc, null)) == null) {
                                    return;
                                }
                                Point point = new Point(pixels2.getIntX(), pixels2.getIntY());
                                this.f9648b = ll2mc;
                                a9 = new a.b(point.x, point.y);
                            }
                        }
                        if (a9 == null) {
                            return;
                        }
                        mapStatus.centerPtX = this.f9648b.getLongitude();
                        mapStatus.centerPtY = this.f9648b.getLatitude();
                        mapStatus.xOffset = (float) (a9.f9597a - ((mapStatus.winRound.left + (this.f9638a.getScreenWidth() / 2)) + mapStatus.xScreenOffset));
                        mapStatus.yOffset = ((float) (a9.f9598b - ((mapStatus.winRound.top + (this.f9638a.getScreenHeight() / 2)) + mapStatus.yScreenOffset))) * (-1.0f);
                        return;
                    }
                    this.f9658l = false;
                    com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.a());
                    MapController mapController4 = this.f9638a;
                    if (mapController4 != null && mapController4.getPointGesturesCenter() != null) {
                        if (this.f9638a.getPointGesturesCenter() == null) {
                            return;
                        } else {
                            a8 = new a.b(r8.x, r8.y);
                        }
                    } else {
                        MapController mapController5 = this.f9638a;
                        if (mapController5 != null && mapController5.getLatLngGesturesCenter() != null) {
                            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f9638a.getLatLngGesturesCenter());
                            if (ll2mc2 == null || (pixels = this.f9638a.getMapView().getProjection().toPixels(ll2mc2, null)) == null) {
                                return;
                            }
                            Point point2 = new Point(pixels.getIntX(), pixels.getIntY());
                            this.f9648b = ll2mc2;
                            a8 = new a.b(point2.x, point2.y);
                        } else {
                            a8 = this.f9655i.f9633c.a();
                        }
                    }
                    if (a8 == null) {
                        return;
                    }
                    this.f9648b = mapView.getProjection().fromPixels((int) a8.f9597a, (int) a8.f9598b);
                }
            }
        }
    }

    @Override // com.baidu.platform.comapi.map.d0.f.a
    public void a(com.baidu.platform.comapi.map.d0.e.b bVar, Pair<a.d, a.d> pair) {
        double d8;
        double d9;
        MapViewInterface mapView = this.f9638a.getMapView();
        if (mapView == null) {
            return;
        }
        MapStatus mapStatus = this.f9638a.getMapStatus();
        int x7 = (int) bVar.f9634d.getX();
        int y7 = (int) bVar.f9634d.getY();
        if (x7 < 0) {
            x7 = 0;
        }
        if (y7 < 0) {
            y7 = 0;
        }
        GeoPoint fromPixels = mapView.getProjection().fromPixels((int) ((this.f9638a.getScreenWidth() / 2) + mapStatus.winRound.left + mapStatus.xScreenOffset), (int) ((this.f9638a.getScreenHeight() / 2) + mapStatus.winRound.top + mapStatus.yScreenOffset));
        if (fromPixels != null) {
            double longitude = fromPixels.getLongitude();
            d9 = fromPixels.getLatitude();
            d8 = longitude;
        } else {
            d8 = 0.0d;
            d9 = 0.0d;
        }
        this.f9638a.MapMsgProc(5, 1, (y7 << 16) | x7, 0, 0, d8, d9, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.f9638a.getGestureMonitor().c(this.f9638a.getZoomLevel());
        if (System.currentTimeMillis() - this.f9659m <= 100) {
            MapController mapController = this.f9638a;
            if (mapController.mIsInertialAnimation && mapController.isEnableZoom()) {
                a(this.f9638a.getMapStatus(), bVar, pair);
            }
        }
    }

    private int a() {
        if (!this.f9656j) {
            return 0;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f9651e);
        if (linkedList.size() < 2) {
            return 0;
        }
        int i8 = (int) (((a.c) linkedList.get(linkedList.size() - 2)).f9599a * 8.0d);
        if (i8 >= 180) {
            return 179;
        }
        if (i8 <= -180) {
            return -179;
        }
        return i8;
    }

    private void a(MapStatus mapStatus, int i8) {
        if (i8 != 0) {
            mapStatus.rotation = (mapStatus.rotation + i8) % 360;
            this.f9638a.setMapStatusWithAnimation(mapStatus, 600);
        }
    }

    public void a(MapStatus mapStatus, com.baidu.platform.comapi.map.d0.e.b bVar, Pair<a.d, a.d> pair) {
        double d8;
        double d9;
        a.c cVar;
        double d10;
        if (pair != null) {
            int a8 = a();
            a.d dVar = (a.d) pair.first;
            double d11 = dVar.f9602a;
            a.d dVar2 = (a.d) pair.second;
            double d12 = dVar2.f9602a;
            if (d11 * d12 > i.DOUBLE_EPSILON && dVar.f9603b * dVar2.f9603b > i.DOUBLE_EPSILON) {
                a(mapStatus, a8);
                return;
            }
            if (Math.abs(d11 - d12) >= 1.0d && Math.abs(((a.d) pair.first).f9603b - ((a.d) pair.second).f9603b) >= 1.0d) {
                double abs = Math.abs(new a.c(new a.C0115a(bVar.f9632b.f9595a, bVar.f9633c.f9595a), bVar.f9632b).f9599a);
                double abs2 = Math.abs(new a.c(new a.C0115a(bVar.f9632b.f9596b, bVar.f9633c.f9596b), bVar.f9632b).f9599a);
                double d13 = this.f9657k;
                if (d13 != i.DOUBLE_EPSILON) {
                    d8 = abs2;
                    if (d13 * this.f9653g.f9600b < i.DOUBLE_EPSILON) {
                        a(mapStatus, a8);
                        return;
                    }
                } else {
                    d8 = abs2;
                }
                a.d dVar3 = (a.d) pair.first;
                double d14 = dVar3.f9602a;
                a.d dVar4 = (a.d) pair.second;
                double d15 = dVar4.f9602a;
                double d16 = (d14 * d14) + (d15 * d15);
                double d17 = dVar3.f9603b;
                double d18 = dVar4.f9603b;
                float sqrt = ((float) Math.sqrt(d16 + (d17 * d17) + (d18 * d18))) * 2.0f;
                if (sqrt > (SysOSUtil.getInstance().getDensityDPI() * 100) / 320) {
                    mapStatus.hasAnimation = 1;
                    mapStatus.animationTime = 600;
                    a.c cVar2 = null;
                    a.c cVar3 = null;
                    int i8 = 0;
                    int i9 = 0;
                    for (int i10 = 0; i10 < this.f9651e.size(); i10++) {
                        a.c poll = this.f9651e.poll();
                        if (poll != null) {
                            if (this.f9651e.isEmpty()) {
                                cVar = cVar2;
                                d10 = 1.0d;
                                if (Math.abs(poll.f9600b - 1.0d) < 0.01d) {
                                    a(mapStatus, a8);
                                    return;
                                }
                            } else {
                                cVar = cVar2;
                                d10 = 1.0d;
                            }
                            if (poll.f9600b > d10) {
                                i8++;
                                cVar2 = poll;
                            } else {
                                i9++;
                                cVar2 = cVar;
                                cVar3 = poll;
                            }
                        }
                    }
                    a.c cVar4 = i8 >= i9 ? cVar2 : cVar3;
                    if (cVar4 != null) {
                        d9 = 1.0d;
                        if (Math.abs(cVar4.f9600b - 1.0d) < 0.01d) {
                            a(mapStatus, a8);
                            return;
                        }
                    } else {
                        d9 = 1.0d;
                    }
                    double d19 = cVar4.f9600b;
                    boolean z7 = (d19 < d9 && abs > 60.0d) || (d19 > d9 && Math.abs(abs - 180.0d) > 60.0d);
                    double d20 = cVar4.f9600b;
                    boolean z8 = (d20 > 1.0d && d8 > 60.0d) || (d20 < 1.0d && Math.abs(d8 - 180.0d) > 60.0d);
                    if (z7 || z8) {
                        if (Math.abs(this.f9652f.f9599a) > (MapController.isCompass ? 30 : 15)) {
                            a(mapStatus, a8);
                            return;
                        }
                    }
                    this.f9654h = cVar4.f9600b > 1.0d;
                    float densityDPI = sqrt / (800000 / SysOSUtil.getInstance().getDensityDPI());
                    float f8 = densityDPI <= 2.0f ? densityDPI : 2.0f;
                    if (this.f9654h) {
                        mapStatus.level += f8;
                    } else {
                        mapStatus.level -= f8;
                    }
                    float f9 = mapStatus.level;
                    if (f9 < 4.0f) {
                        f9 = 4.0f;
                    }
                    mapStatus.level = f9;
                    if (f9 > 22.0f) {
                        f9 = 22.0f;
                    }
                    mapStatus.level = f9;
                    if (a8 != 0) {
                        mapStatus.rotation = (mapStatus.rotation + a8) % 360;
                    }
                    this.f9638a.setMapStatus(mapStatus);
                    this.f9638a.mIsAnimating = true;
                    return;
                }
                return;
            }
            a(mapStatus, a8);
        }
    }
}

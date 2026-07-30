package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer;
import com.baidu.mapapi.map.BackgroundDrawMapView;
import com.baidu.mapapi.map.entity.BackgroundNaviEntity;
import com.baidu.mapapi.map.entity.BackgroundNaviLocEntity;
import com.baidu.mapapi.map.entity.BackgroundNaviRealTimeInfoEntity;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapStatus;
import com.github.mikephil.charting.utils.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BackgroundDrawNaviLayer extends AbsBackgroundDrawNaviLayer {

    /* renamed from: a, reason: collision with root package name */
    private Paint f5593a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f5594b;

    /* renamed from: c, reason: collision with root package name */
    private Point f5595c;

    /* renamed from: d, reason: collision with root package name */
    private Path f5596d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f5597e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f5598f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f5599g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f5600h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap f5601i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f5602j;

    /* renamed from: k, reason: collision with root package name */
    private volatile a f5603k;

    /* renamed from: l, reason: collision with root package name */
    private volatile a f5604l;

    /* renamed from: m, reason: collision with root package name */
    private volatile a f5605m;

    /* renamed from: n, reason: collision with root package name */
    private volatile double f5606n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f5607o;

    /* renamed from: p, reason: collision with root package name */
    private volatile int f5608p;

    /* renamed from: q, reason: collision with root package name */
    private volatile int f5609q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f5610r;

    /* renamed from: s, reason: collision with root package name */
    private volatile int f5611s;

    /* renamed from: t, reason: collision with root package name */
    private AbsBackgroundDrawNaviLayer.EraseEffect f5612t;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private final BackgroundNaviRealTimeInfoEntity f5613a;

        /* renamed from: b, reason: collision with root package name */
        private final BackgroundNaviLocEntity f5614b;

        /* renamed from: c, reason: collision with root package name */
        private final double f5615c;

        /* renamed from: d, reason: collision with root package name */
        private final double f5616d;

        /* renamed from: e, reason: collision with root package name */
        private int f5617e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f5618f = -1;

        /* renamed from: g, reason: collision with root package name */
        private final long f5619g;

        public a(BackgroundNaviRealTimeInfoEntity backgroundNaviRealTimeInfoEntity, BackgroundNaviLocEntity backgroundNaviLocEntity, BackgroundNaviEntity backgroundNaviEntity) {
            ArrayList<LatLng> routeShapePoints;
            this.f5613a = backgroundNaviRealTimeInfoEntity;
            this.f5614b = backgroundNaviLocEntity;
            LatLng latLng = (backgroundNaviEntity == null || (routeShapePoints = backgroundNaviEntity.getRouteShapePoints()) == null || routeShapePoints.isEmpty()) ? null : routeShapePoints.get(0);
            if (latLng != null) {
                this.f5615c = latLng.longitude;
                this.f5616d = latLng.latitude;
            } else {
                this.f5615c = i.DOUBLE_EPSILON;
                this.f5616d = i.DOUBLE_EPSILON;
            }
            this.f5619g = System.currentTimeMillis();
        }

        public void a() {
            if (this.f5613a.isbIsNearOrFarawayStatus()) {
                BackgroundDrawNaviLayer.this.toScreenLocation((int) this.f5613a.getStPosX(), (int) this.f5613a.getStPosY(), BackgroundDrawNaviLayer.this.f5595c);
            } else {
                BackgroundDrawNaviLayer.this.toScreenLocation((int) this.f5613a.getStCurStartPosX(), (int) this.f5613a.getStCurStartPosY(), BackgroundDrawNaviLayer.this.f5595c);
            }
            this.f5617e = BackgroundDrawNaviLayer.this.f5595c.f8789x;
            this.f5618f = BackgroundDrawNaviLayer.this.f5595c.f8790y;
        }

        public boolean a(BackgroundNaviEntity backgroundNaviEntity) {
            ArrayList<LatLng> routeShapePoints;
            if (backgroundNaviEntity == null || (routeShapePoints = backgroundNaviEntity.getRouteShapePoints()) == null || routeShapePoints.isEmpty()) {
                return false;
            }
            LatLng latLng = routeShapePoints.get(0);
            return latLng.latitude == this.f5616d && latLng.longitude == this.f5615c;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f5621a;

        /* renamed from: b, reason: collision with root package name */
        private final float f5622b;

        /* renamed from: c, reason: collision with root package name */
        private final float f5623c;

        public b(int i8, float f8, float f9) {
            this.f5621a = i8;
            this.f5622b = f8;
            this.f5623c = f9;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final List<Float> f5624a;

        /* renamed from: b, reason: collision with root package name */
        private final a f5625b;

        public c(List<Float> list, a aVar) {
            this.f5624a = list;
            this.f5625b = aVar;
        }
    }

    public BackgroundDrawNaviLayer(Context context) {
        super(context, 1);
        this.f5598f = new Object();
        this.f5600h = new Object();
        this.f5602j = new Object();
        this.f5607o = true;
        this.f5610r = false;
        this.f5608p = Color.parseColor("#50D27D");
        this.f5611s = Color.parseColor("#E7F1F6");
        this.f5609q = 10;
        this.f5612t = AbsBackgroundDrawNaviLayer.EraseEffect.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(BackgroundDrawMapView.CanvasProxy canvasProxy, c cVar) {
        ArrayList<LatLng> routeShapePoints;
        int size;
        int i8;
        BackgroundNaviEntity backgroundNaviEntity = (BackgroundNaviEntity) this.mEntity;
        if (backgroundNaviEntity == null || (routeShapePoints = backgroundNaviEntity.getRouteShapePoints()) == null || routeShapePoints.isEmpty() || (size = routeShapePoints.size()) < 2) {
            return;
        }
        this.f5593a.setStrokeWidth(this.f5609q);
        b a8 = a(cVar);
        Point point = null;
        if (this.f5612t == AbsBackgroundDrawNaviLayer.EraseEffect.NONE) {
            a8 = null;
        }
        if (a8 != null) {
            i8 = a8.f5621a;
            point = new Point(a8.f5622b, a8.f5623c);
        } else {
            i8 = 0;
        }
        int min = Math.min(i8, size);
        if (min > 0 && this.f5612t == AbsBackgroundDrawNaviLayer.EraseEffect.ALREADY_PASSED_CHANGE_COLOR) {
            this.f5596d.reset();
            toScreenLocation(routeShapePoints.get(0), this.f5595c);
            Path path = this.f5596d;
            Point point2 = this.f5595c;
            path.moveTo(point2.f8789x, point2.f8790y);
            for (int i9 = 1; i9 < min; i9++) {
                toScreenLocation(routeShapePoints.get(i9), this.f5595c);
                Path path2 = this.f5596d;
                Point point3 = this.f5595c;
                path2.lineTo(point3.f8789x, point3.f8790y);
            }
            if (point != null) {
                this.f5596d.lineTo(point.f8789x, point.f8790y);
            }
            this.f5593a.setColor(this.f5611s);
            canvasProxy.drawPath(this.f5596d, this.f5593a);
        }
        int max = Math.max(0, min - 1);
        this.f5596d.reset();
        if (point != null) {
            this.f5596d.moveTo(point.f8789x, point.f8790y);
            max = Math.max(0, this.f5604l.f5613a.getnCurRouteShapeIdx() - 1);
        } else {
            toScreenLocation(routeShapePoints.get(max), this.f5595c);
            Path path3 = this.f5596d;
            Point point4 = this.f5595c;
            path3.moveTo(point4.f8789x, point4.f8790y);
        }
        for (int i10 = max + 1; i10 < size; i10++) {
            toScreenLocation(routeShapePoints.get(i10), this.f5595c);
            Path path4 = this.f5596d;
            Point point5 = this.f5595c;
            path4.lineTo(point5.f8789x, point5.f8790y);
        }
        this.f5593a.setColor(this.f5608p);
        canvasProxy.drawPath(this.f5596d, this.f5593a);
        if (this.f5607o) {
            synchronized (this.f5598f) {
                try {
                    Bitmap bitmap = this.f5597e;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        toScreenLocation(routeShapePoints.get(0), this.f5595c);
                        canvasProxy.drawBitmap(bitmap, this.f5595c.f8789x - (bitmap.getWidth() / 2.0f), this.f5595c.f8790y - bitmap.getHeight(), this.f5594b);
                    }
                } finally {
                }
            }
            synchronized (this.f5600h) {
                try {
                    Bitmap bitmap2 = this.f5599g;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        toScreenLocation(routeShapePoints.get(size - 1), this.f5595c);
                        canvasProxy.drawBitmap(bitmap2, this.f5595c.f8789x - (bitmap2.getWidth() / 2.0f), this.f5595c.f8790y - bitmap2.getHeight(), this.f5594b);
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer, com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        InputStream inputStream;
        Throwable th;
        super.onCreate();
        Paint paint = new Paint();
        this.f5593a = paint;
        paint.setColor(this.f5608p);
        this.f5593a.setStyle(Paint.Style.STROKE);
        this.f5593a.setStrokeWidth(this.f5609q);
        this.f5593a.setPathEffect(new CornerPathEffect(2.5f));
        this.f5594b = new Paint();
        this.f5596d = new Path();
        this.f5595c = new Point();
        try {
            if (this.f5597e == null) {
                inputStream = this.mContext.getAssets().open("SDK_Default_Icon_Start.png");
                try {
                    try {
                        this.f5597e = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                    } catch (IOException unused) {
                        this.f5597e = null;
                        this.f5599g = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } else {
                inputStream = null;
            }
            if (this.f5599g == null) {
                inputStream = this.mContext.getAssets().open("SDK_Default_Icon_End.png");
                this.f5599g = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
            }
        } catch (IOException unused3) {
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
            if (inputStream != null) {
            }
            throw th;
        }
        synchronized (this.f5602j) {
            if (this.f5601i == null) {
                try {
                    InputStream open = this.mContext.getAssets().open("SDK_Default_Icon_Passenger.png");
                    try {
                        this.f5601i = BitmapFactory.decodeStream(open);
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } catch (IOException unused4) {
                }
            }
        }
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer, com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.f5597e;
        Bitmap bitmap2 = this.f5599g;
        Bitmap bitmap3 = this.f5601i;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.recycle();
        }
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            bitmap3.recycle();
        }
        this.f5597e = null;
        this.f5599g = null;
        this.f5601i = null;
    }

    @Override // com.baidu.mapapi.map.IBackgroundDrawLayer
    public void onDraw(BackgroundDrawMapView.CanvasProxy canvasProxy) {
        com.baidu.platform.comapi.map.MapStatus mapStatus;
        MapStatus.WinRound winRound;
        int i8;
        float f8;
        int min;
        MapController mapController = this.mController;
        if (mapController == null || (mapStatus = mapController.getMapStatus()) == null || (winRound = mapStatus.winRound) == null) {
            return;
        }
        int abs = Math.abs(winRound.right - winRound.left);
        int abs2 = Math.abs(winRound.bottom - winRound.top);
        if (abs2 <= 0 || abs <= 0 || this.mWidth <= 0 || this.mHeight <= 0) {
            return;
        }
        canvasProxy.save();
        canvasProxy.translate((this.mWidth - abs) / 2.0f, (this.mHeight - abs2) / 2.0f);
        int i9 = this.mWidth;
        if (i9 != abs && (i8 = this.mHeight) != abs2) {
            if (i9 >= abs && i8 >= abs2) {
                min = Math.min(i9 / abs, i8 / abs2);
            } else if (i9 > abs || i8 > abs2) {
                f8 = i9 <= abs ? i8 / abs2 : i9 / abs;
                canvasProxy.scale(f8, f8, this.mWidth / 2.0f, this.mHeight / 2.0f);
            } else {
                min = Math.min(abs / i9, abs2 / i8);
            }
            f8 = min;
            canvasProxy.scale(f8, f8, this.mWidth / 2.0f, this.mHeight / 2.0f);
        }
        c a8 = a();
        b(canvasProxy, a8);
        a(canvasProxy, a8);
        canvasProxy.restore();
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setEraseColor(int i8) {
        this.f5611s = this.mContext.getResources().getColor(i8);
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setEraseEffect(AbsBackgroundDrawNaviLayer.EraseEffect eraseEffect) {
        this.f5612t = eraseEffect;
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setIsLocationDirectionFollowPhone(boolean z7) {
        this.f5610r = z7;
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setIsNeedShowStartAndEndMark(boolean z7) {
        this.f5607o = z7;
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setNaviEndMark(Bitmap bitmap) {
        synchronized (this.f5600h) {
            try {
                Bitmap bitmap2 = this.f5599g;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                this.f5599g = bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setNaviLocationMark(Bitmap bitmap) {
        synchronized (this.f5602j) {
            try {
                Bitmap bitmap2 = this.f5601i;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                this.f5601i = bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setNaviRouteColor(int i8) {
        this.f5608p = this.mContext.getResources().getColor(i8);
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setNaviRouteWidth(int i8) {
        this.f5609q = Math.min(30, Math.max(1, i8));
    }

    @Override // com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer
    public void setNaviStartMark(Bitmap bitmap) {
        synchronized (this.f5598f) {
            try {
                Bitmap bitmap2 = this.f5597e;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                this.f5597e = bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateHeading(double d8) {
        this.f5606n = d8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateNaviRealTimeInfo(BackgroundNaviRealTimeInfoEntity backgroundNaviRealTimeInfoEntity, BackgroundNaviLocEntity backgroundNaviLocEntity) {
        if (backgroundNaviRealTimeInfoEntity == null || backgroundNaviLocEntity == null) {
            return;
        }
        a aVar = this.f5604l;
        if (aVar != null) {
            BackgroundNaviRealTimeInfoEntity backgroundNaviRealTimeInfoEntity2 = aVar.f5613a;
            BackgroundNaviLocEntity backgroundNaviLocEntity2 = aVar.f5614b;
            if (backgroundNaviLocEntity2.getGpsLatitude() == backgroundNaviLocEntity.getGpsLatitude() && backgroundNaviLocEntity2.getGpsLongitude() == backgroundNaviLocEntity.getPostLongitude()) {
                return;
            }
            if (backgroundNaviRealTimeInfoEntity2.getStPosY() == backgroundNaviRealTimeInfoEntity.getStPosY() && backgroundNaviRealTimeInfoEntity2.getStPosX() == backgroundNaviRealTimeInfoEntity.getStPosX()) {
                return;
            }
        }
        this.f5603k = aVar;
        this.f5604l = new a(backgroundNaviRealTimeInfoEntity, backgroundNaviLocEntity, (BackgroundNaviEntity) this.mEntity);
    }

    private void a(BackgroundDrawMapView.CanvasProxy canvasProxy, c cVar) {
        Bitmap bitmap;
        MapController mapController;
        com.baidu.platform.comapi.map.MapStatus mapStatus;
        List list;
        a aVar = this.f5604l;
        if (aVar == null || (bitmap = this.f5601i) == null || bitmap.isRecycled() || (mapController = this.mController) == null || (mapStatus = mapController.getMapStatus()) == null || cVar == null || (list = cVar.f5624a) == null || list.size() != 2) {
            return;
        }
        float floatValue = ((Float) list.get(0)).floatValue();
        float floatValue2 = ((Float) list.get(1)).floatValue();
        float gpsDirection = !this.f5610r ? aVar.f5614b.getGpsDirection() - mapStatus.rotation : (float) (this.f5606n - mapStatus.rotation);
        canvasProxy.save();
        canvasProxy.rotate(gpsDirection, floatValue, floatValue2);
        canvasProxy.drawBitmap(bitmap, floatValue - (bitmap.getWidth() / 2.0f), floatValue2 - (bitmap.getHeight() / 2.0f), this.f5594b);
        canvasProxy.restore();
    }

    private c a() {
        a aVar = this.f5604l;
        if (aVar == null) {
            return null;
        }
        aVar.a();
        ArrayList arrayList = new ArrayList(2);
        a aVar2 = this.f5603k;
        if (aVar2 == null) {
            arrayList.add(Float.valueOf(aVar.f5617e));
            arrayList.add(Float.valueOf(aVar.f5618f));
            return new c(arrayList, aVar);
        }
        long j8 = aVar.f5619g - aVar2.f5619g;
        if (j8 <= 0) {
            arrayList.add(Float.valueOf(aVar.f5617e));
            arrayList.add(Float.valueOf(aVar.f5618f));
            return new c(arrayList, aVar);
        }
        if (System.currentTimeMillis() - aVar.f5619g >= j8) {
            arrayList.add(Float.valueOf(aVar.f5617e));
            arrayList.add(Float.valueOf(aVar.f5618f));
            return new c(arrayList, aVar);
        }
        aVar2.a();
        float f8 = j8;
        arrayList.add(Float.valueOf(aVar2.f5617e + (((aVar.f5617e - aVar2.f5617e) * r5) / f8)));
        arrayList.add(Float.valueOf(aVar2.f5618f + (((aVar.f5618f - aVar2.f5618f) * r5) / f8)));
        return new c(arrayList, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b a(c cVar) {
        if (cVar == null) {
            return null;
        }
        List list = cVar.f5624a;
        a aVar = cVar.f5625b;
        if (list == null || aVar == null) {
            return null;
        }
        if ((aVar.f5613a.isbIsNearOrFarawayStatus() || (this.f5604l != null && this.f5604l.f5613a.isbIsNearOrFarawayStatus())) && (aVar = this.f5605m) != null) {
            aVar.a();
            list = new ArrayList(2);
            list.add(Float.valueOf(aVar.f5617e));
            list.add(Float.valueOf(aVar.f5618f));
        }
        if (aVar == null || !aVar.a((BackgroundNaviEntity) this.mEntity)) {
            return null;
        }
        this.f5605m = aVar;
        return new b(aVar.f5613a.getnCurRouteShapeIdx(), ((Float) list.get(0)).floatValue(), ((Float) list.get(1)).floatValue());
    }
}

package com.crrepa.band.my.training.map.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.training.map.view.GpsTrackView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class GpsTrackView extends View {
    private Paint circlePaint;
    private String endLabel;
    private Point endPoint;
    private Paint linePaint;
    private Path linePath;
    private List<a> lngLatList;
    private final int pointOffset;
    private String startLabel;
    private Point startPoint;
    private Paint txtPaint;
    private double viewSize;

    public static class a {
        long lat;
        long lng;

        public a(double d8, double d9) {
            if (d8 == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && d9 == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                this.lng = 0L;
                this.lat = 0L;
                return;
            }
            double pow = (long) Math.pow(10.0d, 15.0d);
            this.lng = Math.round(d8 * pow);
            long round = Math.round(d9 * pow);
            this.lng += 180;
            this.lat = 90 - round;
        }

        public static List<a> convertToLatLngList(List<TrainingLocation> list) {
            ArrayList arrayList = new ArrayList();
            for (TrainingLocation trainingLocation : list) {
                arrayList.add(new a(trainingLocation.getLongitude(), trainingLocation.getLatitude()));
            }
            return arrayList;
        }
    }

    public GpsTrackView(Context context) {
        super(context);
        this.pointOffset = 40;
        this.startLabel = "START";
        this.endLabel = "END";
        init();
    }

    private List<Point> convertToPointList(List<a> list) {
        long j8 = ((a) Collections.max(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$convertToPointList$0;
                lambda$convertToPointList$0 = GpsTrackView.lambda$convertToPointList$0((GpsTrackView.a) obj, (GpsTrackView.a) obj2);
                return lambda$convertToPointList$0;
            }
        })).lat;
        long j9 = ((a) Collections.min(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$convertToPointList$1;
                lambda$convertToPointList$1 = GpsTrackView.lambda$convertToPointList$1((GpsTrackView.a) obj, (GpsTrackView.a) obj2);
                return lambda$convertToPointList$1;
            }
        })).lat;
        long j10 = ((a) Collections.max(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$convertToPointList$2;
                lambda$convertToPointList$2 = GpsTrackView.lambda$convertToPointList$2((GpsTrackView.a) obj, (GpsTrackView.a) obj2);
                return lambda$convertToPointList$2;
            }
        })).lng;
        long j11 = ((a) Collections.min(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$convertToPointList$3;
                lambda$convertToPointList$3 = GpsTrackView.lambda$convertToPointList$3((GpsTrackView.a) obj, (GpsTrackView.a) obj2);
                return lambda$convertToPointList$3;
            }
        })).lng;
        double max = this.viewSize / Math.max(j8 - j9, j10 - j11);
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            arrayList.add(new Point((int) ((aVar.lng - j11) * max), (int) ((aVar.lat - j9) * max)));
        }
        movePointToCenter(arrayList);
        return arrayList;
    }

    private void createPathAndPoints(List<a> list) {
        removeInvalidData(list);
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Point> convertToPointList = convertToPointList(list);
        com.crrepa.band.my.training.map.view.a.convertBezierLinePath(this.linePath, convertToPointList, 20);
        this.startPoint = convertToPointList.get(0);
        if (convertToPointList.size() > 1) {
            this.endPoint = convertToPointList.get(convertToPointList.size() - 1);
        }
    }

    private void drawStartEndBitmap(Canvas canvas, Point point, Point point2) {
        if (point != null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_gps_track_view_start);
            canvas.drawBitmap(decodeResource, (Rect) null, new Rect(point.x - (decodeResource.getWidth() / 2), point.y - (decodeResource.getHeight() / 2), point.x + (decodeResource.getWidth() / 2), point.y + (decodeResource.getHeight() / 2)), (Paint) null);
        }
        if (point2 != null) {
            Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_gps_track_view_end);
            canvas.drawBitmap(decodeResource2, (Rect) null, new Rect(point2.x - (decodeResource2.getWidth() / 2), point2.y - (decodeResource2.getHeight() / 2), point2.x + (decodeResource2.getWidth() / 2), point2.y + (decodeResource2.getHeight() / 2)), (Paint) null);
        }
    }

    private void drawStartEndPoint(Canvas canvas, Point point, Point point2) {
        int textSize = ((int) (this.txtPaint.getTextSize() / 2.0f)) - 3;
        if (point != null) {
            this.circlePaint.setColor(-16776961);
            canvas.drawCircle(point.x, point.y, 30, this.circlePaint);
            canvas.drawText(this.startLabel, point.x - (((int) this.txtPaint.measureText(this.startLabel)) / 2), point.y + textSize, this.txtPaint);
        }
        if (point2 != null) {
            this.circlePaint.setColor(-16711936);
            canvas.drawCircle(point2.x, point2.y, 30, this.circlePaint);
            canvas.drawText(this.endLabel, point2.x - (((int) this.txtPaint.measureText(this.endLabel)) / 2), point2.y + textSize, this.txtPaint);
        }
    }

    private void init() {
        setBackgroundColor(-16777216);
        this.linePath = new Path();
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.linePaint.setColor(Color.parseColor("#EDAC2A"));
        this.linePaint.setStrokeWidth(5.0f);
        Paint paint2 = new Paint();
        this.circlePaint = paint2;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.circlePaint.setStrokeCap(Paint.Cap.BUTT);
        this.circlePaint.setColor(-16776961);
        this.circlePaint.setStrokeWidth(5.0f);
        Paint paint3 = new Paint();
        this.txtPaint = paint3;
        paint3.setColor(-1);
        this.txtPaint.setTextSize(18.0f);
        this.txtPaint.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$convertToPointList$0(a aVar, a aVar2) {
        return Double.compare(aVar.lat, aVar2.lat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$convertToPointList$1(a aVar, a aVar2) {
        return Double.compare(aVar.lat, aVar2.lat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$convertToPointList$2(a aVar, a aVar2) {
        return Double.compare(aVar.lng, aVar2.lng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$convertToPointList$3(a aVar, a aVar2) {
        return Double.compare(aVar.lng, aVar2.lng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$movePointToCenter$4(Point point, Point point2) {
        return Integer.compare(point.x, point2.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$movePointToCenter$5(Point point, Point point2) {
        return Integer.compare(point.x, point2.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$movePointToCenter$6(Point point, Point point2) {
        return Integer.compare(point.y, point2.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$movePointToCenter$7(Point point, Point point2) {
        return Integer.compare(point.y, point2.y);
    }

    private void movePointToCenter(List<Point> list) {
        double d8;
        int i8 = ((Point) Collections.max(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$movePointToCenter$4;
                lambda$movePointToCenter$4 = GpsTrackView.lambda$movePointToCenter$4((Point) obj, (Point) obj2);
                return lambda$movePointToCenter$4;
            }
        })).x - ((Point) Collections.min(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$movePointToCenter$5;
                lambda$movePointToCenter$5 = GpsTrackView.lambda$movePointToCenter$5((Point) obj, (Point) obj2);
                return lambda$movePointToCenter$5;
            }
        })).x;
        int i9 = ((Point) Collections.max(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$movePointToCenter$6;
                lambda$movePointToCenter$6 = GpsTrackView.lambda$movePointToCenter$6((Point) obj, (Point) obj2);
                return lambda$movePointToCenter$6;
            }
        })).y - ((Point) Collections.min(list, new Comparator() { // from class: com.crrepa.band.my.training.map.view.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$movePointToCenter$7;
                lambda$movePointToCenter$7 = GpsTrackView.lambda$movePointToCenter$7((Point) obj, (Point) obj2);
                return lambda$movePointToCenter$7;
            }
        })).y;
        double d9 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        if (i8 < i9) {
            d9 = (this.viewSize - i8) / 2.0d;
            d8 = 0.0d;
        } else {
            d8 = (this.viewSize - i9) / 2.0d;
        }
        for (Point point : list) {
            point.set(point.x + 40 + ((int) d9), point.y + 40 + ((int) d8));
        }
    }

    private static void removeInvalidData(List<a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.lng == 0 && next.lat == 0) {
                it.remove();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.linePath.reset();
        this.startPoint = null;
        this.endPoint = null;
        createPathAndPoints(this.lngLatList);
        this.linePaint.setStrokeWidth((float) (this.viewSize / 50.0d));
        canvas.drawPath(this.linePath, this.linePaint);
        drawStartEndBitmap(canvas, this.startPoint, this.endPoint);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        this.viewSize = Math.min(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9)) - 80.0d;
    }

    public void setEndLabel(String str) {
        this.endLabel = str;
    }

    public void setLatLngList(List<TrainingLocation> list) {
        this.lngLatList = a.convertToLatLngList(list);
        postInvalidate();
    }

    public void setLineColor(@ColorInt int i8) {
        this.linePaint.setColor(i8);
    }

    public void setStartLabel(String str) {
        this.startLabel = str;
    }

    public GpsTrackView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pointOffset = 40;
        this.startLabel = "START";
        this.endLabel = "END";
        init();
    }

    public GpsTrackView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.pointOffset = 40;
        this.startLabel = "START";
        this.endLabel = "END";
        init();
    }
}

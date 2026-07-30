package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.github.mikephil.charting.animation.b;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.formatter.c;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.highlight.f;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.renderer.g;
import com.github.mikephil.charting.utils.j;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import u4.e;

/* loaded from: classes3.dex */
public abstract class Chart<T extends i> extends ViewGroup implements e {
    public static final String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    protected com.github.mikephil.charting.animation.a mAnimator;
    protected ChartTouchListener mChartTouchListener;
    protected T mData;
    protected c mDefaultValueFormatter;
    protected Paint mDescPaint;
    protected com.github.mikephil.charting.components.c mDescription;
    private boolean mDragDecelerationEnabled;
    private float mDragDecelerationFrictionCoef;
    protected boolean mDrawMarkers;
    private float mExtraBottomOffset;
    private float mExtraLeftOffset;
    private float mExtraRightOffset;
    private float mExtraTopOffset;
    private com.github.mikephil.charting.listener.b mGestureListener;
    protected boolean mHighLightPerTapEnabled;
    protected f mHighlighter;
    protected d[] mIndicesToHighlight;
    protected Paint mInfoPaint;
    protected ArrayList<Runnable> mJobs;
    protected Legend mLegend;
    protected com.github.mikephil.charting.renderer.i mLegendRenderer;
    protected boolean mLogEnabled;
    protected com.github.mikephil.charting.components.d mMarker;
    protected float mMaxHighlightDistance;
    private String mNoDataText;
    private boolean mOffsetsCalculated;
    protected g mRenderer;
    protected com.github.mikephil.charting.listener.c mSelectionListener;
    protected boolean mTouchEnabled;
    private boolean mUnbind;
    protected j mViewPortHandler;
    protected XAxis mXAxis;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Chart.this.postInvalidate();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Chart(Context context) {
        super(context);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new c(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new j();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    private void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i8 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i8 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                unbindDrawables(viewGroup.getChildAt(i8));
                i8++;
            }
        }
    }

    public void addViewportJob(Runnable runnable) {
        if (this.mViewPortHandler.hasChartDimens()) {
            post(runnable);
        } else {
            this.mJobs.add(runnable);
        }
    }

    @RequiresApi(11)
    public void animateX(int i8, b.c0 c0Var) {
        this.mAnimator.animateX(i8, c0Var);
    }

    @RequiresApi(11)
    public void animateXY(int i8, int i9, b.c0 c0Var, b.c0 c0Var2) {
        this.mAnimator.animateXY(i8, i9, c0Var, c0Var2);
    }

    @RequiresApi(11)
    public void animateY(int i8, b.c0 c0Var) {
        this.mAnimator.animateY(i8, c0Var);
    }

    protected abstract void calcMinMax();

    protected abstract void calculateOffsets();

    public void clear() {
        this.mData = null;
        this.mOffsetsCalculated = false;
        this.mIndicesToHighlight = null;
        this.mChartTouchListener.setLastHighlighted(null);
        invalidate();
    }

    public void clearAllViewportJobs() {
        this.mJobs.clear();
    }

    public void clearValues() {
        this.mData.clearValues();
        invalidate();
    }

    public void disableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    protected void drawDescription(Canvas canvas) {
        float f8;
        float f9;
        com.github.mikephil.charting.components.c cVar = this.mDescription;
        if (cVar == null || !cVar.isEnabled()) {
            return;
        }
        com.github.mikephil.charting.utils.e position = this.mDescription.getPosition();
        this.mDescPaint.setTypeface(this.mDescription.getTypeface());
        this.mDescPaint.setTextSize(this.mDescription.getTextSize());
        this.mDescPaint.setColor(this.mDescription.getTextColor());
        this.mDescPaint.setTextAlign(this.mDescription.getTextAlign());
        if (position == null) {
            f9 = (getWidth() - this.mViewPortHandler.offsetRight()) - this.mDescription.getXOffset();
            f8 = (getHeight() - this.mViewPortHandler.offsetBottom()) - this.mDescription.getYOffset();
        } else {
            float f10 = position.f14114x;
            f8 = position.f14115y;
            f9 = f10;
        }
        canvas.drawText(this.mDescription.getText(), f9, f8, this.mDescPaint);
    }

    protected void drawMarkers(Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i8 = 0;
        while (true) {
            d[] dVarArr = this.mIndicesToHighlight;
            if (i8 >= dVarArr.length) {
                return;
            }
            d dVar = dVarArr[i8];
            v4.e dataSetByIndex = this.mData.getDataSetByIndex(dVar.getDataSetIndex());
            Entry entryForHighlight = this.mData.getEntryForHighlight(this.mIndicesToHighlight[i8]);
            int entryIndex = dataSetByIndex.getEntryIndex(entryForHighlight);
            if (entryForHighlight != null && entryIndex <= dataSetByIndex.getEntryCount() * this.mAnimator.getPhaseX()) {
                float[] markerPosition = getMarkerPosition(dVar);
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarker.refreshContent(entryForHighlight, dVar);
                    this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i8++;
        }
    }

    public void enableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public com.github.mikephil.charting.animation.a getAnimator() {
        return this.mAnimator;
    }

    public com.github.mikephil.charting.utils.e getCenter() {
        return com.github.mikephil.charting.utils.e.getInstance(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // u4.e
    public com.github.mikephil.charting.utils.e getCenterOfView() {
        return getCenter();
    }

    @Override // u4.e
    public com.github.mikephil.charting.utils.e getCenterOffsets() {
        return this.mViewPortHandler.getContentCenter();
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    @Override // u4.e
    public RectF getContentRect() {
        return this.mViewPortHandler.getContentRect();
    }

    public T getData() {
        return this.mData;
    }

    @Override // u4.e
    public com.github.mikephil.charting.formatter.g getDefaultValueFormatter() {
        return this.mDefaultValueFormatter;
    }

    public com.github.mikephil.charting.components.c getDescription() {
        return this.mDescription;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.mDragDecelerationFrictionCoef;
    }

    public float getExtraBottomOffset() {
        return this.mExtraBottomOffset;
    }

    public float getExtraLeftOffset() {
        return this.mExtraLeftOffset;
    }

    public float getExtraRightOffset() {
        return this.mExtraRightOffset;
    }

    public float getExtraTopOffset() {
        return this.mExtraTopOffset;
    }

    public d getHighlightByTouchPoint(float f8, float f9) {
        if (this.mData != null) {
            return getHighlighter().getHighlight(f8, f9);
        }
        Log.e(LOG_TAG, "Can't select by touch. No data set.");
        return null;
    }

    public d[] getHighlighted() {
        return this.mIndicesToHighlight;
    }

    public f getHighlighter() {
        return this.mHighlighter;
    }

    public ArrayList<Runnable> getJobs() {
        return this.mJobs;
    }

    public Legend getLegend() {
        return this.mLegend;
    }

    public com.github.mikephil.charting.renderer.i getLegendRenderer() {
        return this.mLegendRenderer;
    }

    public com.github.mikephil.charting.components.d getMarker() {
        return this.mMarker;
    }

    protected float[] getMarkerPosition(d dVar) {
        return new float[]{dVar.getDrawX(), dVar.getDrawY()};
    }

    @Deprecated
    public com.github.mikephil.charting.components.d getMarkerView() {
        return getMarker();
    }

    @Override // u4.e
    public float getMaxHighlightDistance() {
        return this.mMaxHighlightDistance;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public com.github.mikephil.charting.listener.b getOnChartGestureListener() {
        return null;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.mChartTouchListener;
    }

    public Paint getPaint(int i8) {
        if (i8 == 7) {
            return this.mInfoPaint;
        }
        if (i8 != 11) {
            return null;
        }
        return this.mDescPaint;
    }

    public g getRenderer() {
        return this.mRenderer;
    }

    public j getViewPortHandler() {
        return this.mViewPortHandler;
    }

    public XAxis getXAxis() {
        return this.mXAxis;
    }

    @Override // u4.e
    public float getXChartMax() {
        return this.mXAxis.mAxisMaximum;
    }

    @Override // u4.e
    public float getXChartMin() {
        return this.mXAxis.mAxisMinimum;
    }

    @Override // u4.e
    public float getXRange() {
        return this.mXAxis.mAxisRange;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.mData.getYMax();
    }

    public float getYMin() {
        return this.mData.getYMin();
    }

    public void highlightValue(float f8, int i8) {
        highlightValue(f8, i8, true);
    }

    public void highlightValues(d[] dVarArr) {
        this.mIndicesToHighlight = dVarArr;
        setLastHighlighted(dVarArr);
        invalidate();
    }

    protected void init() {
        setWillNotDraw(false);
        this.mAnimator = new com.github.mikephil.charting.animation.a(new a());
        com.github.mikephil.charting.utils.i.init(getContext());
        this.mMaxHighlightDistance = com.github.mikephil.charting.utils.i.convertDpToPixel(500.0f);
        this.mDescription = new com.github.mikephil.charting.components.c();
        Legend legend = new Legend();
        this.mLegend = legend;
        this.mLegendRenderer = new com.github.mikephil.charting.renderer.i(this.mViewPortHandler, legend);
        this.mXAxis = new XAxis();
        this.mDescPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mInfoPaint = paint;
        paint.setColor(Color.rgb(SerialTrans.MTU_MAX, PsExtractor.PRIVATE_STREAM_1, 51));
        this.mInfoPaint.setTextAlign(Paint.Align.CENTER);
        this.mInfoPaint.setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(12.0f));
        if (this.mLogEnabled) {
            Log.i("", "Chart.init()");
        }
    }

    public boolean isDragDecelerationEnabled() {
        return this.mDragDecelerationEnabled;
    }

    @Deprecated
    public boolean isDrawMarkerViewsEnabled() {
        return isDrawMarkersEnabled();
    }

    public boolean isDrawMarkersEnabled() {
        return this.mDrawMarkers;
    }

    public boolean isEmpty() {
        T t7 = this.mData;
        return t7 == null || t7.getEntryCount() <= 0;
    }

    public boolean isHighlightPerTapEnabled() {
        return this.mHighLightPerTapEnabled;
    }

    public boolean isLogEnabled() {
        return this.mLogEnabled;
    }

    public abstract void notifyDataSetChanged();

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mUnbind) {
            unbindDrawables(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mData == null) {
            if (!TextUtils.isEmpty(this.mNoDataText)) {
                com.github.mikephil.charting.utils.e center = getCenter();
                canvas.drawText(this.mNoDataText, center.f14114x, center.f14115y, this.mInfoPaint);
                return;
            }
            return;
        }
        if (this.mOffsetsCalculated) {
            return;
        }
        calculateOffsets();
        this.mOffsetsCalculated = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).layout(i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int convertDpToPixel = (int) com.github.mikephil.charting.utils.i.convertDpToPixel(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(convertDpToPixel, i8)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(convertDpToPixel, i9)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        if (this.mLogEnabled) {
            Log.i(LOG_TAG, "OnSizeChanged()");
        }
        if (i8 > 0 && i9 > 0 && i8 < 10000 && i9 < 10000) {
            if (this.mLogEnabled) {
                Log.i(LOG_TAG, "Setting chart dimens, width: " + i8 + ", height: " + i9);
            }
            this.mViewPortHandler.setChartDimens(i8, i9);
        } else if (this.mLogEnabled) {
            Log.w(LOG_TAG, "*Avoiding* setting chart dimens! width: " + i8 + ", height: " + i9);
        }
        notifyDataSetChanged();
        Iterator<Runnable> it = this.mJobs.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.mJobs.clear();
        super.onSizeChanged(i8, i9, i10, i11);
    }

    public void removeViewportJob(Runnable runnable) {
        this.mJobs.remove(runnable);
    }

    public boolean saveToGallery(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i8) {
        String str4;
        if (i8 < 0 || i8 > 100) {
            i8 = 50;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i9 = b.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        if (i9 == 1) {
            boolean endsWith = str.endsWith(".png");
            str4 = MimeTypes.IMAGE_PNG;
            if (!endsWith) {
                str = str + ".png";
            }
        } else if (i9 != 2) {
            boolean endsWith2 = str.endsWith(".jpg");
            str4 = MimeTypes.IMAGE_JPEG;
            if (!endsWith2 && !str.endsWith(".jpeg")) {
                str = str + ".jpg";
            }
        } else {
            boolean endsWith3 = str.endsWith(".webp");
            str4 = MimeTypes.IMAGE_WEBP;
            if (!endsWith3) {
                str = str + ".webp";
            }
        }
        String str5 = file.getAbsolutePath() + "/" + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            getChartBitmap().compress(compressFormat, i8, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str5).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put("orientation", (Integer) 0);
            contentValues.put("_data", str5);
            contentValues.put("_size", Long.valueOf(length));
            return getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public boolean saveToPath(String str, String str2) {
        Bitmap chartBitmap = getChartBitmap();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + str2 + "/" + str + ".png");
            chartBitmap.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public void setData(T t7) {
        this.mData = t7;
        this.mOffsetsCalculated = false;
        if (t7 == null) {
            return;
        }
        setupDefaultFormatter(t7.getYMin(), t7.getYMax());
        for (v4.e eVar : this.mData.getDataSets()) {
            if (eVar.needsFormatter() || eVar.getValueFormatter() == this.mDefaultValueFormatter) {
                eVar.setValueFormatter(this.mDefaultValueFormatter);
            }
        }
        notifyDataSetChanged();
        if (this.mLogEnabled) {
            Log.i(LOG_TAG, "Data is set.");
        }
    }

    public void setDescription(com.github.mikephil.charting.components.c cVar) {
        this.mDescription = cVar;
    }

    public void setDragDecelerationEnabled(boolean z7) {
        this.mDragDecelerationEnabled = z7;
    }

    public void setDragDecelerationFrictionCoef(float f8) {
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 >= 1.0f) {
            f8 = 0.999f;
        }
        this.mDragDecelerationFrictionCoef = f8;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z7) {
        setDrawMarkers(z7);
    }

    public void setDrawMarkers(boolean z7) {
        this.mDrawMarkers = z7;
    }

    public void setExtraBottomOffset(float f8) {
        this.mExtraBottomOffset = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setExtraLeftOffset(float f8) {
        this.mExtraLeftOffset = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setExtraOffsets(float f8, float f9, float f10, float f11) {
        setExtraLeftOffset(f8);
        setExtraTopOffset(f9);
        setExtraRightOffset(f10);
        setExtraBottomOffset(f11);
    }

    public void setExtraRightOffset(float f8) {
        this.mExtraRightOffset = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setExtraTopOffset(float f8) {
        this.mExtraTopOffset = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setHardwareAccelerationEnabled(boolean z7) {
        if (z7) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z7) {
        this.mHighLightPerTapEnabled = z7;
    }

    public void setHighlighter(com.github.mikephil.charting.highlight.b bVar) {
        this.mHighlighter = bVar;
    }

    protected void setLastHighlighted(d[] dVarArr) {
        d dVar;
        if (dVarArr == null || dVarArr.length <= 0 || (dVar = dVarArr[0]) == null) {
            this.mChartTouchListener.setLastHighlighted(null);
        } else {
            this.mChartTouchListener.setLastHighlighted(dVar);
        }
    }

    public void setLogEnabled(boolean z7) {
        this.mLogEnabled = z7;
    }

    public void setMarker(com.github.mikephil.charting.components.d dVar) {
        this.mMarker = dVar;
    }

    @Deprecated
    public void setMarkerView(com.github.mikephil.charting.components.d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f8) {
        this.mMaxHighlightDistance = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setNoDataText(String str) {
        this.mNoDataText = str;
    }

    public void setNoDataTextColor(int i8) {
        this.mInfoPaint.setColor(i8);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.mInfoPaint.setTypeface(typeface);
    }

    public void setOnChartGestureListener(com.github.mikephil.charting.listener.b bVar) {
    }

    public void setOnChartValueSelectedListener(com.github.mikephil.charting.listener.c cVar) {
        this.mSelectionListener = cVar;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.mChartTouchListener = chartTouchListener;
    }

    public void setPaint(Paint paint, int i8) {
        if (i8 == 7) {
            this.mInfoPaint = paint;
        } else {
            if (i8 != 11) {
                return;
            }
            this.mDescPaint = paint;
        }
    }

    public void setRenderer(g gVar) {
        if (gVar != null) {
            this.mRenderer = gVar;
        }
    }

    public void setTouchEnabled(boolean z7) {
        this.mTouchEnabled = z7;
    }

    public void setUnbindEnabled(boolean z7) {
        this.mUnbind = z7;
    }

    protected void setupDefaultFormatter(float f8, float f9) {
        T t7 = this.mData;
        this.mDefaultValueFormatter.setup(com.github.mikephil.charting.utils.i.getDecimals((t7 == null || t7.getEntryCount() < 2) ? Math.max(Math.abs(f8), Math.abs(f9)) : Math.abs(f9 - f8)));
    }

    public boolean valuesToHighlight() {
        d[] dVarArr = this.mIndicesToHighlight;
        return (dVarArr == null || dVarArr.length <= 0 || dVarArr[0] == null) ? false : true;
    }

    @RequiresApi(11)
    public void animateX(int i8) {
        this.mAnimator.animateX(i8);
    }

    @RequiresApi(11)
    public void animateXY(int i8, int i9, b.c0 c0Var) {
        this.mAnimator.animateXY(i8, i9, c0Var);
    }

    @RequiresApi(11)
    public void animateY(int i8) {
        this.mAnimator.animateY(i8);
    }

    public void highlightValue(float f8, float f9, int i8) {
        highlightValue(f8, f9, i8, true);
    }

    @RequiresApi(11)
    public void animateXY(int i8, int i9) {
        this.mAnimator.animateXY(i8, i9);
    }

    public void highlightValue(float f8, int i8, boolean z7) {
        highlightValue(f8, Float.NaN, i8, z7);
    }

    public void highlightValue(float f8, float f9, int i8, boolean z7) {
        if (i8 >= 0 && i8 < this.mData.getDataSetCount()) {
            highlightValue(new d(f8, f9, i8), z7);
        } else {
            highlightValue((d) null, z7);
        }
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new c(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new j();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public void highlightValue(d dVar) {
        highlightValue(dVar, false);
    }

    public void highlightValue(d dVar, boolean z7) {
        Entry entry = null;
        if (dVar == null) {
            this.mIndicesToHighlight = null;
        } else {
            if (this.mLogEnabled) {
                Log.i(LOG_TAG, "Highlighted: " + dVar.toString());
            }
            Entry entryForHighlight = this.mData.getEntryForHighlight(dVar);
            if (entryForHighlight == null) {
                this.mIndicesToHighlight = null;
                dVar = null;
            } else {
                this.mIndicesToHighlight = new d[]{dVar};
            }
            entry = entryForHighlight;
        }
        setLastHighlighted(this.mIndicesToHighlight);
        if (z7 && this.mSelectionListener != null) {
            if (!valuesToHighlight()) {
                this.mSelectionListener.onNothingSelected();
            } else {
                this.mSelectionListener.onValueSelected(entry, dVar);
            }
        }
        invalidate();
    }

    public Chart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new c(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new j();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public boolean saveToGallery(String str, int i8) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, i8);
    }

    public boolean saveToGallery(String str) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, 40);
    }
}

package com.crrepa.band.my.health.ecg.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.o;
import com.orhanobut.logger.f;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes2.dex */
public class EcgMeasureView extends SurfaceView implements SurfaceHolder.Callback {
    private static final int REFRESH_PERIOD = 20;
    private static final int WAVE_SPEED = 25;
    private int blankLineWidth;
    private Canvas canvas;
    private int centerY;
    Runnable drawRunnable;
    private Queue<Integer> ecgData;
    private int ecgPathWidth;
    private int ecgPerCount;
    private float ecgXOffset;
    private float ecgYOffset;
    private com.crrepa.band.my.health.ecg.view.a girdBackGroundHelper;
    private boolean isRunning;
    private float lockWidth;
    private Paint paint;
    private Rect rect;
    private float startX;
    private float startY;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (EcgMeasureView.this.isRunning) {
                long currentTimeMillis = System.currentTimeMillis();
                EcgMeasureView.this.startDrawWave();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < 20) {
                    try {
                        Thread.sleep(20 - currentTimeMillis2);
                    } catch (InterruptedException e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    public EcgMeasureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ecgData = new LinkedList();
        this.paint = new Paint();
        this.rect = new Rect();
        this.drawRunnable = new a();
        getHolder().addCallback(this);
        this.girdBackGroundHelper = new com.crrepa.band.my.health.ecg.view.a(context);
        this.ecgPathWidth = o.dp2px(context, 1.0f);
        this.blankLineWidth = o.dp2px(context, 30.0f);
    }

    private void drawDirdBackGround(Canvas canvas) {
        this.girdBackGroundHelper.drawDirdBackGround(canvas, getWidth(), getHeight(), true, ContextCompat.getColor(getContext(), R.color.color_ecg_chart_bg));
    }

    private void drawWave() {
        this.paint.setColor(-16777216);
        this.paint.setStrokeWidth(this.ecgPathWidth);
        try {
            int size = this.ecgData.size();
            int i8 = this.ecgPerCount;
            if (size <= i8) {
                float f8 = this.startX;
                float f9 = (int) ((this.ecgXOffset * i8) + f8);
                float f10 = this.centerY;
                this.canvas.drawLine(f8, this.startY, f9, f10, this.paint);
                this.startX = f9;
                this.startY = f10;
                return;
            }
            for (int i9 = 0; i9 < this.ecgPerCount; i9++) {
                float f11 = this.startX + this.ecgXOffset;
                float ecgConver = ecgConver(this.ecgData.poll().intValue());
                this.canvas.drawLine(this.startX, this.startY, f11, ecgConver, this.paint);
                this.startX = f11;
                this.startY = ecgConver;
            }
        } catch (NoSuchElementException e8) {
            e8.printStackTrace();
        }
    }

    private int ecgConver(int i8) {
        return (int) (this.centerY - (i8 * this.ecgYOffset));
    }

    private void init() {
        this.paint.setColor(-16777216);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeWidth(o.dp2px(getContext(), 1.0f));
        int height = getHeight() / 2;
        this.centerY = height;
        this.startY = height;
    }

    private synchronized void setEcgStyle() {
        this.lockWidth = (float) (b.getGirdWidth(getHeight()) * 25.0f * 0.015384615398943424d);
        this.ecgXOffset = b.getTimeOffset(getHeight(), 5);
        this.ecgYOffset = b.getVoltageOffset(getHeight(), b.getDefaultPerGridUvValue());
        this.ecgPerCount = ((int) (this.lockWidth / this.ecgXOffset)) + 1;
        f.d("ecgPerCount: " + this.ecgPerCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDrawWave() {
        Rect rect = this.rect;
        float f8 = this.startX;
        rect.set((int) f8, 0, (int) (f8 + this.lockWidth + this.blankLineWidth), getHeight());
        Canvas lockCanvas = getHolder().lockCanvas(this.rect);
        this.canvas = lockCanvas;
        if (lockCanvas == null) {
            return;
        }
        drawDirdBackGround(lockCanvas);
        drawWave();
        getHolder().unlockCanvasAndPost(this.canvas);
        if (this.startX + this.lockWidth > getWidth()) {
            this.startX = 0.0f;
        }
    }

    public void addEcgData(List<Integer> list) {
        if (list == null) {
            return;
        }
        this.ecgData.addAll(list);
    }

    public int getRefreshDataCount() {
        return this.ecgPerCount * 50;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        init();
        setEcgStyle();
    }

    public void release() {
        getHolder().removeCallback(this);
        getHolder().getSurface().release();
    }

    public void reset() {
        if (this.canvas == null) {
            return;
        }
        this.ecgData.clear();
        drawDirdBackGround(this.canvas);
    }

    public void startDraw() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.startX = 0.0f;
        this.startY = this.centerY;
        new Thread(this.drawRunnable).start();
    }

    public void stopDraw() {
        this.isRunning = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Canvas lockCanvas = surfaceHolder.lockCanvas();
        drawDirdBackGround(lockCanvas);
        surfaceHolder.unlockCanvasAndPost(lockCanvas);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f.i("surfaceDestroyed", new Object[0]);
    }
}

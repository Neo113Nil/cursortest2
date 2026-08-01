package com.luckyarcade.spinthrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class KnifeThrowView extends View implements Choreographer.FrameCallback {
    private final Paint bgPaint;
    private int comboStreak;
    private LevelConfig config;
    private float cx;
    private float cy;
    private boolean finished;
    private final float flyDuration;
    private float flyProgress;
    private final Paint handlePaint;
    private final Paint knifeEdgePaint;
    private boolean knifeFlying;
    private float knifeLength;
    private final Paint knifePaint;
    private final Path knifePath;
    private int knivesPlaced;
    private long lastFrameNanos;
    private Listener listener;
    private int lives;
    private final Paint readyPaint;
    private final Paint rimPaint;
    private final Paint ringPaint;
    private boolean running;
    private int score;
    private final float[] stuckAngles;
    private int stuckCount;
    private float wheelAngle;
    private float wheelRadius;
    private final Paint woodInnerPaint;
    private final Paint woodMidPaint;
    private final Paint woodOuterPaint;

    public interface Listener {
        void onDefeat(int i);

        void onScoreChanged(int i, int i2, int i3);

        void onVictory(int i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KnifeThrowView(Context context) {
        this(context, null, 0, 6, null);
        X0.f.e(context, "context");
    }

    private final float angularDistance(float f2, float f3) {
        float abs = Math.abs(normalizeAngle(f2) - normalizeAngle(f3));
        return abs > 180.0f ? 360.0f - abs : abs;
    }

    private final boolean collides(float f2) {
        float minGapDeg = this.config.getMinGapDeg();
        float knifeAngularSpanDeg = knifeAngularSpanDeg();
        int i = this.stuckCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (angularDistance(f2, this.stuckAngles[i2]) < minGapDeg + knifeAngularSpanDeg) {
                return true;
            }
        }
        return false;
    }

    private final void drawKnifeAtAngle(Canvas canvas, float f2, float f3) {
        canvas.save();
        canvas.rotate(f2);
        canvas.translate(0.0f, this.wheelRadius);
        drawKnifePointingOut(canvas, f3);
        canvas.restore();
    }

    private final void drawKnifePointingOut(Canvas canvas, float f2) {
        this.knifePath.reset();
        float f3 = 0.08f * f2;
        this.knifePath.moveTo(0.0f, 0.0f);
        float f4 = -f3;
        float f5 = 0.35f * f2;
        this.knifePath.lineTo(f4, f5);
        float f6 = f4 * 0.5f;
        this.knifePath.lineTo(f6, f5);
        this.knifePath.lineTo(f6, f2);
        float f7 = 0.5f * f3;
        this.knifePath.lineTo(f7, f2);
        this.knifePath.lineTo(f7, f5);
        this.knifePath.lineTo(f3, f5);
        this.knifePath.close();
        canvas.drawPath(this.knifePath, this.knifePaint);
        canvas.drawPath(this.knifePath, this.knifeEdgePaint);
        canvas.drawRect(f4 * 0.55f, f2 * 0.72f, f3 * 0.55f, f2, this.handlePaint);
    }

    private final void drawKnifePointingUp(Canvas canvas, float f2) {
        this.knifePath.reset();
        float f3 = 0.08f * f2;
        float f4 = -f2;
        this.knifePath.moveTo(0.0f, f4);
        float f5 = -f3;
        float f6 = 0.65f * f4;
        this.knifePath.lineTo(f5, f6);
        float f7 = f5 * 0.5f;
        this.knifePath.lineTo(f7, f6);
        this.knifePath.lineTo(f7, 0.0f);
        float f8 = 0.5f * f3;
        this.knifePath.lineTo(f8, 0.0f);
        this.knifePath.lineTo(f8, f6);
        this.knifePath.lineTo(f3, f6);
        this.knifePath.close();
        canvas.drawPath(this.knifePath, this.knifePaint);
        canvas.drawPath(this.knifePath, this.knifeEdgePaint);
        canvas.drawRect(f5 * 0.55f, f4 * 0.28f, f3 * 0.55f, 0.0f, this.handlePaint);
    }

    private final void finishDefeat() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        this.running = false;
        Choreographer.getInstance().removeFrameCallback(this);
        post(new e(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishDefeat$lambda$11(KnifeThrowView knifeThrowView) {
        Listener listener = knifeThrowView.listener;
        if (listener != null) {
            listener.onDefeat(knifeThrowView.score);
        }
    }

    private final void finishVictory() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        this.running = false;
        Choreographer.getInstance().removeFrameCallback(this);
        post(new e(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishVictory$lambda$10(KnifeThrowView knifeThrowView) {
        Listener listener = knifeThrowView.listener;
        if (listener != null) {
            listener.onVictory(knifeThrowView.score);
        }
    }

    private final float knifeAngularSpanDeg() {
        if (this.wheelRadius <= 0.0f) {
            return 0.0f;
        }
        return (float) Math.toDegrees((float) Math.atan2(this.knifeLength * 0.08f * 2.0f, r0));
    }

    private final float normalizeAngle(float f2) {
        float f3 = f2 % 360.0f;
        return f3 < 0.0f ? f3 + 360.0f : f3;
    }

    private final void notifyHud() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onScoreChanged(this.score, this.lives, this.config.getKnivesRequired() - this.knivesPlaced);
        }
    }

    private final void resolveHit() {
        float normalizeAngle = normalizeAngle(-this.wheelAngle);
        if (collides(normalizeAngle)) {
            this.comboStreak = 0;
            this.lives--;
            notifyHud();
            if (this.lives <= 0) {
                finishDefeat();
                return;
            }
            return;
        }
        int i = this.stuckCount;
        float[] fArr = this.stuckAngles;
        if (i < fArr.length) {
            fArr[i] = normalizeAngle;
            this.stuckCount = i + 1;
        }
        this.knivesPlaced++;
        int i2 = this.comboStreak + 1;
        this.comboStreak = i2;
        int i3 = this.score;
        this.score = i3 + 10;
        if (i2 > 0 && i2 % 3 == 0) {
            this.score = i3 + 15;
        }
        notifyHud();
        if (this.knivesPlaced >= this.config.getKnivesRequired()) {
            finishVictory();
        }
    }

    private final void tryThrow() {
        if (this.finished || this.knifeFlying || !this.running) {
            return;
        }
        this.knifeFlying = true;
        this.flyProgress = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r0 > 0.05f) goto L13;
     */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doFrame(long j2) {
        if (!this.running || this.finished) {
            return;
        }
        if (this.lastFrameNanos == 0) {
            this.lastFrameNanos = j2;
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        float f2 = (j2 - r0) / 1.0E9f;
        float f3 = f2 >= 0.0f ? 0.05f : 0.0f;
        f2 = f3;
        this.lastFrameNanos = j2;
        this.wheelAngle = normalizeAngle((this.config.getRotationDegPerSec() * f2) + this.wheelAngle);
        if (this.knifeFlying) {
            float f4 = (f2 / this.flyDuration) + this.flyProgress;
            this.flyProgress = f4;
            if (f4 >= 1.0f) {
                this.flyProgress = 1.0f;
                this.knifeFlying = false;
                resolveHit();
            }
        }
        invalidate();
        Choreographer.getInstance().postFrameCallback(this);
    }

    public final Listener getListener() {
        return this.listener;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pauseGame();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        X0.f.e(canvas, "canvas");
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
        canvas.save();
        canvas.translate(this.cx, this.cy);
        canvas.rotate(this.wheelAngle);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius, this.woodOuterPaint);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius * 0.72f, this.woodMidPaint);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius * 0.38f, this.woodInnerPaint);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius * 0.12f, this.rimPaint);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius * 0.72f, this.ringPaint);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius * 0.38f, this.ringPaint);
        canvas.drawCircle(0.0f, 0.0f, this.wheelRadius, this.rimPaint);
        int i = this.stuckCount;
        for (int i2 = 0; i2 < i; i2++) {
            drawKnifeAtAngle(canvas, this.stuckAngles[i2], this.knifeLength);
        }
        canvas.restore();
        if (this.knifeFlying) {
            float height = getHeight() - (this.knifeLength * 0.3f);
            float f2 = (((this.cy + this.wheelRadius) - height) * this.flyProgress) + height;
            canvas.save();
            canvas.translate(this.cx, f2);
            drawKnifePointingUp(canvas, this.knifeLength);
            canvas.restore();
            return;
        }
        if (this.finished) {
            return;
        }
        canvas.save();
        canvas.translate(this.cx, getHeight() - (this.knifeLength * 0.3f));
        int color = this.knifePaint.getColor();
        this.knifePaint.setColor(this.readyPaint.getColor());
        drawKnifePointingUp(canvas, this.knifeLength);
        this.knifePaint.setColor(color);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.cx = i * 0.5f;
        this.cy = i2 * 0.38f;
        float min = Math.min(i, i2) * 0.28f;
        this.wheelRadius = min;
        this.knifeLength = min * 0.55f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        X0.f.e(motionEvent, "event");
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        tryThrow();
        return true;
    }

    public final void pauseGame() {
        this.running = false;
        Choreographer.getInstance().removeFrameCallback(this);
    }

    public final void resumeGame() {
        if (this.finished || this.running) {
            return;
        }
        this.running = true;
        this.lastFrameNanos = 0L;
        Choreographer.getInstance().postFrameCallback(this);
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void startLevel(LevelConfig levelConfig) {
        X0.f.e(levelConfig, "levelConfig");
        this.config = levelConfig;
        this.wheelAngle = 0.0f;
        this.lives = levelConfig.getLives();
        this.score = 0;
        this.knivesPlaced = 0;
        this.comboStreak = 0;
        this.stuckCount = 0;
        this.knifeFlying = false;
        this.flyProgress = 0.0f;
        this.finished = false;
        this.running = true;
        this.lastFrameNanos = 0L;
        Choreographer.getInstance().postFrameCallback(this);
        notifyHud();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KnifeThrowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        X0.f.e(context, "context");
    }

    public /* synthetic */ KnifeThrowView(Context context, AttributeSet attributeSet, int i, int i2, X0.c cVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnifeThrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.f.e(context, "context");
        this.config = GameConfig.INSTANCE.forDifficulty(Difficulty.EASY);
        this.lives = 5;
        this.stuckAngles = new float[24];
        this.flyDuration = 0.22f;
        Paint paint = new Paint(1);
        paint.setColor(-16119276);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-7644629);
        paint2.setStyle(style);
        this.woodOuterPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-6262449);
        paint3.setStyle(style);
        this.woodMidPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(-9614294);
        paint4.setStyle(style);
        this.woodInnerPaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(-16718337);
        Paint.Style style2 = Paint.Style.STROKE;
        paint5.setStyle(style2);
        paint5.setStrokeWidth(4.0f);
        this.rimPaint = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(855638016);
        paint6.setStyle(style2);
        paint6.setStrokeWidth(2.0f);
        this.ringPaint = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(-1513240);
        paint7.setStyle(style);
        this.knifePaint = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(-16718337);
        paint8.setStyle(style2);
        paint8.setStrokeWidth(2.0f);
        this.knifeEdgePaint = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(-53867);
        paint9.setStyle(style);
        this.handlePaint = paint9;
        Paint paint10 = new Paint(1);
        paint10.setColor(-8585365);
        paint10.setStyle(style);
        this.readyPaint = paint10;
        this.knifePath = new Path();
    }
}

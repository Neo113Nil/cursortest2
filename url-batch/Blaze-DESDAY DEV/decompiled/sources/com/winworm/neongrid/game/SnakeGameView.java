package com.winworm.neongrid.game;

import A.b;
import D0.p;
import S0.c;
import S0.e;
import S0.f;
import S0.g;
import S0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;
import com.winworm.neongrid.ui.GameActivity;
import g1.d;

/* loaded from: classes.dex */
public final class SnakeGameView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2030a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2031b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2032c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f2033e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f2034f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f2035g;
    public final RectF h;
    public f i;

    /* renamed from: j, reason: collision with root package name */
    public g f2036j;

    /* renamed from: k, reason: collision with root package name */
    public long f2037k;

    /* renamed from: l, reason: collision with root package name */
    public float f2038l;

    /* renamed from: m, reason: collision with root package name */
    public float f2039m;

    /* renamed from: n, reason: collision with root package name */
    public float f2040n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2041o;

    /* renamed from: p, reason: collision with root package name */
    public final GestureDetector f2042p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnakeGameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        this.f2030a = new Handler(Looper.getMainLooper());
        this.f2031b = new p(6, this);
        Paint paint = new Paint(1);
        this.f2032c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f2033e = paint3;
        Paint paint4 = new Paint(1);
        this.f2034f = paint4;
        Paint paint5 = new Paint(1);
        this.f2035g = paint5;
        this.h = new RectF();
        this.f2037k = 200L;
        this.f2042p = new GestureDetector(context, new h(this));
        paint.setColor(b.a(context, R.color.game_background));
        paint2.setColor(b.a(context, R.color.grid_line));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        paint3.setColor(b.a(context, R.color.snake_head));
        paint3.setShadowLayer(8.0f, RecyclerView.f1559A0, RecyclerView.f1559A0, b.a(context, R.color.snake_glow));
        paint4.setColor(b.a(context, R.color.snake_body));
        paint4.setShadowLayer(6.0f, RecyclerView.f1559A0, RecyclerView.f1559A0, b.a(context, R.color.snake_glow));
        paint5.setColor(b.a(context, R.color.food_neon));
        paint5.setShadowLayer(10.0f, RecyclerView.f1559A0, RecyclerView.f1559A0, b.a(context, R.color.food_glow));
        setLayerType(1, null);
    }

    public final int a() {
        if (getWidth() <= 0) {
            return 18;
        }
        return i0.g.e((int) (getWidth() / (getResources().getDisplayMetrics().density * 24.0f)), 16, 22);
    }

    public final int b() {
        if (getHeight() <= 0) {
            return 24;
        }
        int height = (int) (getHeight() / (getResources().getDisplayMetrics().density * 24.0f));
        if (height < 14) {
            return 14;
        }
        return height;
    }

    public final void c(Canvas canvas, int i, int i2, Paint paint, float f2) {
        float f3 = this.f2039m;
        float f4 = this.f2038l;
        float f5 = (i * f4) + f3;
        float f6 = (i2 * f4) + this.f2040n;
        float f7 = f2 * f4;
        RectF rectF = this.h;
        rectF.set(f5 + f7, f6 + f7, (f5 + f4) - f7, (f6 + f4) - f7);
        float f8 = this.f2038l;
        canvas.drawRoundRect(rectF, f8 * 0.2f, f8 * 0.2f, paint);
    }

    public final void d() {
        g gVar;
        f fVar = this.i;
        if (fVar == null || (gVar = this.f2036j) == null) {
            return;
        }
        int i = fVar.h;
        int i2 = fVar.i;
        int i3 = fVar.f783j;
        GameActivity gameActivity = (GameActivity) gVar;
        gameActivity.f2048E = i;
        gameActivity.F = i2;
        gameActivity.v(i, i2, i3);
    }

    public final void e() {
        this.f2041o = false;
        this.f2030a.removeCallbacks(this.f2031b);
        f fVar = this.i;
        if (fVar != null && fVar.f784k == c.f768a) {
            fVar.f784k = c.f769b;
        }
        invalidate();
    }

    public final void f() {
        Handler handler = this.f2030a;
        p pVar = this.f2031b;
        handler.removeCallbacks(pVar);
        handler.postDelayed(pVar, this.f2037k);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f2041o = false;
        this.f2030a.removeCallbacks(this.f2031b);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(RecyclerView.f1559A0, RecyclerView.f1559A0, getWidth(), getHeight(), this.f2032c);
        f fVar = this.i;
        if (fVar == null) {
            return;
        }
        int i = fVar.f778b;
        int i2 = fVar.f779c;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float f2 = i;
        float f3 = i2;
        this.f2038l = Math.min(getWidth() / f2, getHeight() / f3);
        this.f2039m = (getWidth() - (this.f2038l * f2)) / 2.0f;
        this.f2040n = (getHeight() - (this.f2038l * f3)) / 2.0f;
        Paint paint = this.d;
        int i3 = 0;
        if (i >= 0) {
            int i4 = 0;
            while (true) {
                float f4 = this.f2039m;
                float f5 = this.f2038l;
                float f6 = (i4 * f5) + f4;
                float f7 = this.f2040n;
                canvas.drawLine(f6, f7, f6, (f5 * f3) + f7, paint);
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (i2 >= 0) {
            int i5 = 0;
            while (true) {
                float f8 = this.f2040n;
                float f9 = this.f2038l;
                float f10 = (i5 * f9) + f8;
                float f11 = this.f2039m;
                canvas.drawLine(f11, f10, (f9 * f2) + f11, f10, paint);
                if (i5 == i2) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        for (Object obj : V0.g.D0(fVar.d)) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            e eVar = (e) obj;
            c(canvas, eVar.f775a, eVar.f776b, i3 == 0 ? this.f2033e : this.f2034f, i3 == 0 ? 0.12f : 0.18f);
            i3 = i6;
        }
        e eVar2 = fVar.f782g;
        c(canvas, eVar2.f775a, eVar2.f776b, this.f2035g, 0.22f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        f fVar;
        super.onSizeChanged(i, i2, i3, i4);
        if (getWidth() > 0 && getHeight() > 0 && (fVar = this.i) != null) {
            fVar.a(a(), b());
        }
        f fVar2 = this.i;
        if (fVar2 != null) {
            fVar2.a(a(), b());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d.e(motionEvent, "event");
        return this.f2042p.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void setGameListener(g gVar) {
        d.e(gVar, "gameListener");
        this.f2036j = gVar;
    }
}

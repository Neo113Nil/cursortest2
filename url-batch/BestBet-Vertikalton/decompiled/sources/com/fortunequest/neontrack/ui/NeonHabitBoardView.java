package com.fortunequest.neontrack.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import b1.g;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.AbstractC0290d;
import m1.C0289c;
import s1.AbstractC0335s;
import t0.C0359l;
import u0.C0384w;
import w0.b;
import w0.c;
import w0.d;
import w0.e;

/* loaded from: classes.dex */
public final class NeonHabitBoardView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2112b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2113c;
    public final String[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2114e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2115f;

    /* renamed from: g, reason: collision with root package name */
    public final d[] f2116g;
    public c h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2117j;

    /* renamed from: k, reason: collision with root package name */
    public final e f2118k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeonHabitBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k1.e.e(context, "context");
        this.f2111a = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        this.f2112b = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextSize(42.0f);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setTextSize(56.0f);
        this.f2113c = paint3;
        this.d = new String[]{"★", "⚡", "♥", "◆", "🔥", "☾"};
        this.f2114e = new int[]{R.color.neon_cyan, R.color.neon_orange, R.color.neon_cyan, R.color.neon_orange, R.color.neon_orange, R.color.neon_cyan};
        this.f2115f = new ArrayList();
        d[] dVarArr = new d[200];
        for (int i = 0; i < 200; i++) {
            d dVar = new d();
            dVar.f4475a = RecyclerView.f1937A0;
            dVar.f4476b = RecyclerView.f1937A0;
            dVar.f4477c = RecyclerView.f1937A0;
            dVar.d = RecyclerView.f1937A0;
            dVar.f4478e = RecyclerView.f1937A0;
            dVar.f4479f = -1;
            dVar.f4480g = false;
            dVarArr[i] = dVar;
        }
        this.f2116g = dVarArr;
        this.f2118k = new e(this, 0);
    }

    public final void a(long j2) {
        Object obj;
        Iterator it = this.f2115f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((b) obj).f4472a.f4227a == j2) {
                    break;
                }
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            C0384w c0384w = bVar.f4472a;
            long j3 = c0384w.f4227a;
            String str = c0384w.f4228b;
            k1.e.e(str, "title");
            bVar.f4472a = new C0384w(j3, str, c0384w.f4229c, true);
        }
        invalidate();
    }

    public final void b(long j2) {
        Object obj;
        d dVar;
        Iterator it = this.f2115f.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((b) obj).f4472a.f4227a == j2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            bVar.f4474c = true;
            bVar.d = RecyclerView.f1937A0;
            RectF rectF = bVar.f4473b;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            int a2 = A.b.a(getContext(), R.color.neon_cyan);
            int a3 = A.b.a(getContext(), R.color.neon_orange);
            for (int i = 0; i < 40; i++) {
                d[] dVarArr = this.f2116g;
                int length = dVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = dVarArr[i2];
                    if (!dVar.f4480g) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (dVar != null) {
                    C0289c c0289c = AbstractC0290d.f3539a;
                    float a4 = c0289c.a() * 6.28f;
                    float a5 = (c0289c.a() * 8.0f) + 4.0f;
                    dVar.f4475a = centerX;
                    dVar.f4476b = centerY;
                    double d = a4;
                    dVar.f4477c = ((float) Math.cos(d)) * a5;
                    dVar.d = ((float) Math.sin(d)) * a5;
                    dVar.f4478e = 1.0f;
                    dVar.f4479f = AbstractC0290d.f3540b.a().nextBoolean() ? a2 : a3;
                    dVar.f4480g = true;
                }
            }
            Choreographer.getInstance().postFrameCallback(this.f2118k);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        k1.e.e(canvas, "canvas");
        Iterator it = this.f2115f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            paint = this.f2111a;
            if (!hasNext) {
                break;
            }
            b bVar = (b) it.next();
            if (!bVar.f4474c || bVar.d <= 0.7f) {
                float sin = (((float) Math.sin(this.i + bVar.f4472a.f4227a)) + 1.0f) / 2.0f;
                boolean z2 = bVar.f4472a.d;
                int i = z2 ? 80 : (int) ((30 * sin) + 40);
                paint.setColor(z2 ? A.b.a(getContext(), R.color.card_done) : A.b.a(getContext(), R.color.neon_glow_cyan));
                paint.setAlpha(i);
                RectF rectF = bVar.f4473b;
                canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint);
                int a2 = bVar.f4472a.d ? A.b.a(getContext(), R.color.neon_orange) : A.b.a(getContext(), R.color.neon_cyan);
                Paint paint2 = this.f2112b;
                paint2.setColor(a2);
                int i2 = 180;
                if (!bVar.f4472a.d) {
                    int i3 = (int) ((sin * 75) + 180);
                    i2 = i3 > 255 ? 255 : i3;
                }
                paint2.setAlpha(i2);
                if (bVar.f4474c) {
                    paint2.setAlpha((int) ((1.0f - bVar.d) * 255));
                }
                canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint2);
                int i4 = bVar.f4472a.f4229c;
                String[] strArr = this.d;
                k1.e.e(strArr, "<this>");
                int e2 = g.e(i4, strArr.length - 1);
                Paint paint3 = this.f2113c;
                paint3.setColor(A.b.a(getContext(), this.f2114e[e2]));
                canvas.drawText(strArr[e2], rectF.left + 24.0f, rectF.centerY() + 18.0f, paint3);
                AbstractC0091d.f(canvas, bVar.f4472a.f4228b, 90.0f + rectF.left, 14.0f + rectF.centerY(), 38.0f, A.b.a(getContext(), R.color.neon_glow_cyan), bVar.f4472a.d ? A.b.a(getContext(), R.color.neon_orange) : -1, Paint.Align.LEFT);
                if (bVar.f4472a.d) {
                    AbstractC0091d.f(canvas, "✓", rectF.right - 48.0f, rectF.centerY() + 16.0f, 44.0f, A.b.a(getContext(), R.color.neon_glow_orange), A.b.a(getContext(), R.color.neon_orange), Paint.Align.CENTER);
                }
            }
        }
        for (d dVar : this.f2116g) {
            if (dVar.f4480g) {
                paint.setColor(dVar.f4479f);
                paint.setAlpha(g.e((int) (dVar.f4478e * 255), 255));
                canvas.drawCircle(dVar.f4475a, dVar.f4476b, 6.0f, paint);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        float paddingTop = getPaddingTop();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        Iterator it = this.f2115f.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f4473b.set(getPaddingLeft(), paddingTop, getPaddingLeft() + width, 120.0f + paddingTop);
            paddingTop += 136.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize((int) (((r0 - 1) * 16.0f) + (Math.max(this.f2115f.size(), 1) * 120.0f) + getPaddingBottom() + getPaddingTop()), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k1.e.e(motionEvent, "event");
        if (motionEvent.getAction() != 1) {
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        Iterator it = this.f2115f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) it.next();
            if (bVar.f4473b.contains(x2, y2)) {
                C0384w c0384w = bVar.f4472a;
                if (!c0384w.d && !bVar.f4474c) {
                    c cVar = this.h;
                    if (cVar != null) {
                        DailyQuestActivity dailyQuestActivity = (DailyQuestActivity) cVar;
                        AbstractC0335s.g(J.e(dailyQuestActivity), null, new C0359l(dailyQuestActivity, c0384w.f4227a, null), 3);
                    }
                }
            }
        }
        return true;
    }

    public final void setHabits(List<C0384w> list) {
        k1.e.e(list, "habits");
        ArrayList arrayList = this.f2115f;
        arrayList.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b((C0384w) it.next(), new RectF()));
        }
        requestLayout();
        invalidate();
    }

    public final void setListener(c cVar) {
        k1.e.e(cVar, "listener");
        this.h = cVar;
    }
}

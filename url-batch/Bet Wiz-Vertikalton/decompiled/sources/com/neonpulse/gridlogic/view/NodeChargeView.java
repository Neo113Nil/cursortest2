package com.neonpulse.gridlogic.view;

import C0.p;
import T0.b;
import U0.a;
import V0.c;
import W0.h;
import W0.j;
import W0.q;
import W0.s;
import W0.t;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.R;
import e1.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import q.AbstractC0285e;

/* loaded from: classes.dex */
public final class NodeChargeView extends View implements Choreographer.FrameCallback {

    /* renamed from: A, reason: collision with root package name */
    public float f1990A;

    /* renamed from: a, reason: collision with root package name */
    public a f1991a;

    /* renamed from: b, reason: collision with root package name */
    public b f1992b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1993c;
    public List d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1994e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1995f;

    /* renamed from: g, reason: collision with root package name */
    public int f1996g;
    public float h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1997j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f1998k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f1999l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f2000m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f2001n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f2002o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f2003p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2004q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2005r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2006s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2007t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2008u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2009v;

    /* renamed from: w, reason: collision with root package name */
    public float f2010w;

    /* renamed from: x, reason: collision with root package name */
    public float f2011x;

    /* renamed from: y, reason: collision with root package name */
    public float f2012y;

    /* renamed from: z, reason: collision with root package name */
    public float f2013z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeChargeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        this.f1993c = new ArrayList();
        this.d = q.f896a;
        s sVar = s.f898a;
        this.f1994e = sVar;
        this.f1995f = sVar;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(6.0f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.f1998k = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(14.0f);
        paint2.setStrokeCap(cap);
        this.f1999l = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        this.f2000m = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(4.0f);
        this.f2001n = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        this.f2002o = paint5;
        Paint paint6 = new Paint(1);
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTextSize(28.0f);
        paint6.setFakeBoldText(true);
        this.f2003p = paint6;
        this.f2004q = A.b.a(context, R.color.neon_cyan);
        this.f2005r = A.b.a(context, R.color.neon_magenta);
        this.f2006s = A.b.a(context, R.color.neon_green);
        this.f2007t = A.b.a(context, R.color.wire_inactive);
        this.f2008u = A.b.a(context, R.color.node_off);
        this.f2009v = A.b.a(context, R.color.bg_panel);
    }

    public final c a(T0.a aVar) {
        return new c(Float.valueOf((aVar.f844c * this.f2010w) + this.f2012y), Float.valueOf((aVar.f843b * this.f2011x) + this.f2013z));
    }

    public final void b() {
        Object obj;
        Object obj2;
        int i;
        S0.a aVar;
        Integer num;
        T0.a aVar2;
        ArrayList arrayList = this.f1993c;
        List<c> list = this.d;
        d.e(arrayList, "nodes");
        d.e(list, "edges");
        int o02 = t.o0(j.m0(arrayList));
        if (o02 < 16) {
            o02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o02);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((T0.a) next).f842a), next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(Integer.valueOf(((T0.a) it2.next()).f842a), new ArrayList());
        }
        for (c cVar : list) {
            int intValue = ((Number) cVar.f872a).intValue();
            int intValue2 = ((Number) cVar.f873b).intValue();
            T0.a aVar3 = (T0.a) linkedHashMap.get(Integer.valueOf(intValue));
            if (aVar3 != null && (aVar2 = (T0.a) linkedHashMap.get(Integer.valueOf(intValue2))) != null && aVar3.a() && aVar2.a()) {
                List list2 = (List) linkedHashMap2.get(Integer.valueOf(intValue));
                if (list2 != null) {
                    list2.add(Integer.valueOf(intValue2));
                }
                List list3 = (List) linkedHashMap2.get(Integer.valueOf(intValue2));
                if (list3 != null) {
                    list3.add(Integer.valueOf(intValue));
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            obj = null;
            if (it3.hasNext()) {
                obj2 = it3.next();
                if (((T0.a) obj2).d == 1) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        T0.a aVar4 = (T0.a) obj2;
        s sVar = s.f898a;
        if (aVar4 == null) {
            aVar = new S0.a(false, sVar, sVar);
        } else {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                if (((T0.a) next2).d == 2) {
                    obj = next2;
                    break;
                }
            }
            T0.a aVar5 = (T0.a) obj;
            if (aVar5 == null) {
                aVar = new S0.a(false, sVar, sVar);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayDeque arrayDeque = new ArrayDeque();
                int i2 = aVar4.f842a;
                arrayDeque.add(Integer.valueOf(i2));
                linkedHashSet.add(Integer.valueOf(i2));
                while (true) {
                    boolean isEmpty = arrayDeque.isEmpty();
                    i = aVar5.f842a;
                    if (isEmpty || ((num = (Integer) arrayDeque.removeFirst()) != null && num.intValue() == i)) {
                        break;
                    }
                    List list4 = (List) linkedHashMap2.get(num);
                    if (list4 == null) {
                        list4 = q.f896a;
                    }
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        int intValue3 = ((Number) it5.next()).intValue();
                        if (!linkedHashSet.contains(Integer.valueOf(intValue3))) {
                            linkedHashSet.add(Integer.valueOf(intValue3));
                            linkedHashMap3.put(Integer.valueOf(intValue3), num);
                            arrayDeque.add(Integer.valueOf(intValue3));
                        }
                    }
                }
                boolean contains = linkedHashSet.contains(Integer.valueOf(i));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                if (contains) {
                    while (i != i2) {
                        Integer num2 = (Integer) linkedHashMap3.get(Integer.valueOf(i));
                        if (num2 == null) {
                            break;
                        }
                        int intValue4 = num2.intValue();
                        linkedHashSet2.add(intValue4 < i ? new c(num2, Integer.valueOf(i)) : new c(Integer.valueOf(i), num2));
                        i = intValue4;
                    }
                }
                aVar = new S0.a(contains, linkedHashSet, linkedHashSet2);
            }
        }
        this.f1994e = aVar.f786b;
        this.f1995f = aVar.f787c;
        if (!aVar.f785a || this.f1997j) {
            return;
        }
        this.f1997j = true;
        a aVar6 = this.f1991a;
        if (aVar6 != null) {
            int i3 = this.f1996g;
            GameplayActivity gameplayActivity = (GameplayActivity) aVar6;
            if (gameplayActivity.F) {
                return;
            }
            gameplayActivity.F = true;
            CountDownTimer countDownTimer = gameplayActivity.f1970E;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            V0.d dVar = P0.a.f698a;
            b b2 = P0.a.b(gameplayActivity.f1966A);
            int i4 = 15 - i3;
            if (i4 < 0) {
                i4 = 0;
            }
            gameplayActivity.f1968C += b2.i + (i4 * 10) + (b2.f850f ? gameplayActivity.f1969D * 2 : 0);
            V0.d dVar2 = gameplayActivity.f1972z;
            Q0.a aVar7 = (Q0.a) dVar2.a();
            aVar7.f727a.edit().putInt("crystals", aVar7.f727a.getInt("crystals", 0) + b2.h).apply();
            Q0.a aVar8 = (Q0.a) dVar2.a();
            int i5 = gameplayActivity.f1968C;
            SharedPreferences sharedPreferences = aVar8.f727a;
            if (i5 > sharedPreferences.getInt("high_score", 0)) {
                sharedPreferences.edit().putInt("high_score", i5).apply();
            }
            Q0.a aVar9 = (Q0.a) dVar2.a();
            int i6 = gameplayActivity.f1966A;
            aVar9.getClass();
            String str = "best_moves_" + i6;
            SharedPreferences sharedPreferences2 = aVar9.f727a;
            if (i3 < sharedPreferences2.getInt(str, Integer.MAX_VALUE)) {
                sharedPreferences2.edit().putInt("best_moves_" + i6, i3).apply();
            }
            int i7 = gameplayActivity.f1966A + 1;
            int i8 = i7 <= 15 ? i7 : 15;
            Q0.a aVar10 = (Q0.a) dVar2.a();
            if (i8 > aVar10.f727a.getInt("unlocked_level", 1)) {
                aVar10.f727a.edit().putInt("unlocked_level", i8).apply();
            }
            gameplayActivity.t().f730a.postDelayed(new p(5, gameplayActivity), 600L);
        }
    }

    public final void c() {
        b bVar = this.f1992b;
        if (bVar == null) {
            return;
        }
        List<T0.a> list = bVar.d;
        ArrayList arrayList = new ArrayList(j.m0(list));
        for (T0.a aVar : list) {
            arrayList.add(T0.a.b(aVar, aVar.f845e));
        }
        this.f1993c = h.q0(arrayList);
        this.f1996g = 0;
        this.f1997j = false;
        b();
        invalidate();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.i) {
            float f2 = this.h + 0.025f;
            this.h = f2;
            if (f2 > 100.0f) {
                this.h = 0.0f;
            }
            invalidate();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final a getListener() {
        return this.f1991a;
    }

    public final int getMoves() {
        return this.f1996g;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i) {
            return;
        }
        this.i = true;
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Set] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        T0.a aVar;
        d.e(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f1992b == null || this.f2010w == 0.0f) {
            return;
        }
        ArrayList arrayList = this.f1993c;
        int o02 = t.o0(j.m0(arrayList));
        if (o02 < 16) {
            o02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o02);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((T0.a) next).f842a), next);
        }
        Iterator it2 = this.d.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = this.f2006s;
            i2 = this.f2007t;
            i3 = this.f2004q;
            if (!hasNext) {
                break;
            }
            c cVar = (c) it2.next();
            int intValue = ((Number) cVar.f872a).intValue();
            int intValue2 = ((Number) cVar.f873b).intValue();
            T0.a aVar2 = (T0.a) linkedHashMap.get(Integer.valueOf(intValue));
            if (aVar2 != null && (aVar = (T0.a) linkedHashMap.get(Integer.valueOf(intValue2))) != null) {
                c a2 = a(aVar2);
                float floatValue = ((Number) a2.f872a).floatValue();
                float floatValue2 = ((Number) a2.f873b).floatValue();
                c a3 = a(aVar);
                float floatValue3 = ((Number) a3.f872a).floatValue();
                float floatValue4 = ((Number) a3.f873b).floatValue();
                boolean contains = this.f1995f.contains(intValue < intValue2 ? new c(Integer.valueOf(intValue), Integer.valueOf(intValue2)) : new c(Integer.valueOf(intValue2), Integer.valueOf(intValue)));
                Paint paint = this.f1998k;
                if (contains) {
                    Paint paint2 = this.f1999l;
                    paint2.setColor(i3);
                    paint2.setAlpha(55);
                    canvas.drawLine(floatValue, floatValue2, floatValue3, floatValue4, paint2);
                    paint.setColor(i3);
                    paint.setStrokeWidth(7.0f);
                    paint = paint;
                } else {
                    paint.setColor(i2);
                    paint.setStrokeWidth(5.0f);
                }
                canvas.drawLine(floatValue, floatValue2, floatValue3, floatValue4, paint);
                if (contains) {
                    float f2 = this.h % 1.0f;
                    Paint paint3 = this.f2002o;
                    paint3.setColor(i);
                    paint3.setAlpha(200);
                    canvas.drawCircle(((floatValue3 - floatValue) * f2) + floatValue, ((floatValue4 - floatValue2) * f2) + floatValue2, this.f1990A * 0.22f, paint3);
                }
            }
        }
        Iterator it3 = this.f1993c.iterator();
        while (it3.hasNext()) {
            T0.a aVar3 = (T0.a) it3.next();
            c a4 = a(aVar3);
            float floatValue5 = ((Number) a4.f872a).floatValue();
            float floatValue6 = ((Number) a4.f873b).floatValue();
            boolean contains2 = this.f1994e.contains(Integer.valueOf(aVar3.f842a));
            int a5 = AbstractC0285e.a(aVar3.d);
            Paint paint4 = this.f2003p;
            Paint paint5 = this.f2001n;
            Paint paint6 = this.f2000m;
            int i4 = this.f2009v;
            if (a5 != 0) {
                Iterator it4 = it3;
                int i5 = this.f2008u;
                if (a5 == 1) {
                    paint6.setColor(i4);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A, paint6);
                    int i6 = this.f2005r;
                    paint5.setColor(i6);
                    paint5.setStrokeWidth(5.0f);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A, paint5);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A * 0.65f, paint5);
                    if (contains2) {
                        i5 = i6;
                    }
                    paint6.setColor(i5);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A * 0.3f, paint6);
                    paint4.setColor(i6);
                    paint4.setTextSize(this.f1990A * 0.55f);
                    canvas.drawText("T", floatValue5, (paint4.getTextSize() * 0.35f) + floatValue6, paint4);
                } else if (a5 == 2) {
                    boolean z2 = aVar3.f845e;
                    if (z2) {
                        i5 = i4;
                    }
                    paint6.setColor(i5);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A, paint6);
                    paint5.setColor(z2 ? i : i2);
                    paint5.setStrokeWidth(4.0f);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A, paint5);
                    if (z2) {
                        paint6.setColor(i);
                        float f3 = this.f1990A * 0.35f;
                        canvas.drawRect(floatValue5 - f3, floatValue6 - f3, f3 + floatValue5, f3 + floatValue6, paint6);
                        paint6.setColor(i4);
                        float f4 = this.f1990A * 0.15f;
                        canvas.drawRect(floatValue5 - f4, floatValue6 - f4, f4 + floatValue5, f4 + floatValue6, paint6);
                    } else {
                        paint5.setColor(i2);
                        float f5 = this.f1990A * 0.35f;
                        canvas.drawRect(floatValue5 - f5, floatValue6 - f5, f5 + floatValue5, f5 + floatValue6, paint5);
                    }
                } else {
                    if (a5 != 3 && a5 != 4) {
                        throw new V0.b();
                    }
                    paint6.setColor(i4);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A * 0.7f, paint6);
                    paint5.setColor(contains2 ? i3 : i2);
                    paint5.setStrokeWidth(3.0f);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A * 0.7f, paint5);
                    paint6.setColor(contains2 ? i3 : i2);
                    canvas.drawCircle(floatValue5, floatValue6, this.f1990A * 0.25f, paint6);
                }
                it3 = it4;
            } else {
                paint6.setColor(i4);
                canvas.drawCircle(floatValue5, floatValue6, this.f1990A, paint6);
                paint5.setColor(i3);
                paint5.setStrokeWidth(5.0f);
                canvas.drawCircle(floatValue5, floatValue6, this.f1990A, paint5);
                paint6.setColor(i3);
                canvas.drawCircle(floatValue5, floatValue6, this.f1990A * 0.35f, paint6);
                paint4.setColor(i3);
                paint4.setTextSize(this.f1990A * 0.55f);
                canvas.drawText("S", floatValue5, (paint4.getTextSize() * 0.35f) + floatValue6, paint4);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f1992b == null) {
            return;
        }
        float min = Math.min(i, i2) * 0.08f;
        float f2 = 2 * min;
        float f3 = (i - f2) / r4.f848c;
        this.f2010w = f3;
        float f4 = (i2 - f2) / r4.f847b;
        this.f2011x = f4;
        this.f2012y = (f3 / 2.0f) + min;
        this.f2013z = (f4 / 2.0f) + min;
        this.f1990A = Math.min(f3, f4) * 0.28f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d.e(motionEvent, "event");
        if (motionEvent.getAction() == 0 && this.f1992b != null && this.f2010w != 0.0f) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            Iterator it = this.f1993c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T0.a aVar = (T0.a) it.next();
                if (aVar.d == 3) {
                    c a2 = a(aVar);
                    if (((float) Math.hypot(x2 - ((Number) a2.f872a).floatValue(), y2 - ((Number) a2.f873b).floatValue())) <= this.f1990A * 1.4f) {
                        aVar.f845e = !aVar.f845e;
                        this.f1996g++;
                        b();
                        a aVar2 = this.f1991a;
                        if (aVar2 != null) {
                            ((GameplayActivity) aVar2).w();
                        }
                        invalidate();
                    }
                }
            }
        }
        return true;
    }

    public final void setListener(a aVar) {
        this.f1991a = aVar;
    }
}

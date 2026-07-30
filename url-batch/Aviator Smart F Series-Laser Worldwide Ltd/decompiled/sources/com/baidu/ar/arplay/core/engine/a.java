package com.baidu.ar.arplay.core.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.ar.w4;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public c f1659b;

    /* renamed from: m, reason: collision with root package name */
    public f f1670m;

    /* renamed from: n, reason: collision with root package name */
    public f f1671n;

    /* renamed from: o, reason: collision with root package name */
    public f f1672o;

    /* renamed from: p, reason: collision with root package name */
    public f f1673p;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1660c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1661d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1662e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1663f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f1664g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f1665h = 0;

    /* renamed from: i, reason: collision with root package name */
    public d f1666i = d.EStatSingFingerCandidate;

    /* renamed from: j, reason: collision with root package name */
    public f f1667j = null;

    /* renamed from: k, reason: collision with root package name */
    public Map<Integer, Vector<Float>> f1668k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public boolean f1669l = true;

    /* renamed from: q, reason: collision with root package name */
    public double f1674q = -1.0d;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1675r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1676s = false;

    /* renamed from: t, reason: collision with root package name */
    public e f1677t = e.ESWIPE_RIGHT;

    /* renamed from: a, reason: collision with root package name */
    public w4 f1658a = new w4();

    /* renamed from: com.baidu.ar.arplay.core.engine.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0029a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1678a;

        static {
            int[] iArr = new int[d.values().length];
            f1678a = iArr;
            try {
                iArr[d.EStatSingFingerCandidate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1678a[d.EStatTwoFingersCandidate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1678a[d.EStatScroll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1678a[d.EStatSwipe.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1678a[d.EStatTwoFingersScroll.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1678a[d.EStatPinchAndUnpinch.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1678a[d.EStatTwoFingersRotate.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1678a[d.EStatLongPress.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1678a[d.EScrollAfterLongPress.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1678a[d.EStatPinch.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1678a[d.EStatUnPinch.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1678a[d.EStatUnknown.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum b {
        EGESTURE_CLICK,
        EGESTURE_DOUBLE_CLICK,
        EGESTURE_LONG_PRESS,
        EGESTURE_SWIPE,
        EGESTURE_SINGLE_FINGER_SCROLL,
        EGESTURE_TWO_FINGER_SCROLL,
        EGESTURE_TWO_FINGER_PINCH,
        EGESTURE_TWO_FINGER_UNPINCH,
        EGESTURE_TWO_FINGER_ROTATE,
        EGESTURE_CLEAR
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            if (a.this.f1662e) {
                return;
            }
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 == 2 && (obj = message.obj) != null) {
                    f fVar = (f) obj;
                    a.this.a(fVar.f1712d, fVar.f1709a, fVar.f1710b, fVar.f1711c);
                    return;
                }
                return;
            }
            if (a.this.f1666i == d.EStatSingFingerCandidate && a.this.f1669l) {
                a.this.f1666i = d.EStatLongPress;
                a.this.b(System.currentTimeMillis(), a.this.f1670m.f1709a, a.this.f1670m.f1710b, a.this.f1670m.f1711c);
            }
        }
    }

    public enum d {
        EStatSingFingerCandidate,
        EStatTwoFingersCandidate,
        EStatLongPress,
        EStatScroll,
        EStatSwipe,
        EStatTwoFingersScroll,
        EStatPinch,
        EStatUnPinch,
        EScrollAfterLongPress,
        EStatPinchAndUnpinch,
        EStatTwoFingersRotate,
        EStatUnknown
    }

    public enum e {
        ESWIPE_RIGHT,
        ESWIPE_LEFT,
        ESWIPE_UP,
        ESWIPE_DOWN
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public int f1709a;

        /* renamed from: b, reason: collision with root package name */
        public float f1710b;

        /* renamed from: c, reason: collision with root package name */
        public float f1711c;

        /* renamed from: d, reason: collision with root package name */
        public long f1712d;

        public f(a aVar) {
            this.f1709a = -1;
            this.f1710b = -1.0f;
            this.f1711c = -1.0f;
            this.f1712d = -1L;
        }

        public void a(MotionEvent motionEvent, int i8) {
            this.f1709a = motionEvent.getPointerId(i8);
            this.f1710b = motionEvent.getX(i8);
            this.f1711c = motionEvent.getY(i8);
            this.f1712d = motionEvent.getEventTime();
        }

        public String toString() {
            return "fingerId: " + this.f1709a + " && x,y: " + this.f1710b + SystemInfoUtil.COMMA + this.f1711c + " && time: " + this.f1712d;
        }

        public /* synthetic */ f(a aVar, C0029a c0029a) {
            this(aVar);
        }
    }

    public enum g {
        ETOUCH_BEGIN,
        ETOUCH_MOVE,
        ETOUCH_END,
        ETOUCH_CANCEL
    }

    public a(Looper looper) {
        C0029a c0029a = null;
        this.f1670m = new f(this, c0029a);
        this.f1671n = new f(this, c0029a);
        this.f1672o = new f(this, c0029a);
        this.f1673p = new f(this, c0029a);
        this.f1659b = new c(looper);
        e();
    }

    public final double a(double d8, double d9, double d10, double d11) {
        double atan2 = Math.atan2(d11, d10) - Math.atan2(d9, d8);
        return atan2 > 3.141592653589793d ? atan2 - 6.283185307179586d : atan2 < -3.141592653589793d ? atan2 + 6.283185307179586d : atan2;
    }

    public final float b(MotionEvent motionEvent) {
        return (motionEvent.getY(motionEvent.findPointerIndex(this.f1670m.f1709a)) - this.f1670m.f1711c) / (motionEvent.getEventTime() - this.f1671n.f1712d);
    }

    public final float c(MotionEvent motionEvent) {
        return motionEvent.getX(motionEvent.findPointerIndex(this.f1670m.f1709a));
    }

    public final float d(MotionEvent motionEvent) {
        return motionEvent.getY(motionEvent.findPointerIndex(this.f1670m.f1709a));
    }

    public final float e(MotionEvent motionEvent) {
        return (motionEvent.getX(motionEvent.findPointerIndex(this.f1672o.f1709a)) - this.f1673p.f1710b) / (motionEvent.getEventTime() - this.f1673p.f1712d);
    }

    public final float f(MotionEvent motionEvent) {
        return (motionEvent.getY(motionEvent.findPointerIndex(this.f1672o.f1709a)) - this.f1673p.f1711c) / (motionEvent.getEventTime() - this.f1673p.f1712d);
    }

    public final float g(MotionEvent motionEvent) {
        return motionEvent.getX(motionEvent.findPointerIndex(this.f1672o.f1709a));
    }

    public final float h(MotionEvent motionEvent) {
        return motionEvent.getY(motionEvent.findPointerIndex(this.f1672o.f1709a));
    }

    public void i(MotionEvent motionEvent) {
        if (this.f1661d && this.f1660c && !this.f1662e) {
            k(motionEvent);
            j(motionEvent);
            return;
        }
        Log.e("ARPTouchInput", "onTouchEvent mEnginSoLoaded = " + this.f1661d + " && mUserTouchEnable = " + this.f1660c + " && mReleased = " + this.f1662e);
    }

    public final void j(MotionEvent motionEvent) {
        switch (C0029a.f1678a[this.f1666i.ordinal()]) {
            case 1:
                q(motionEvent);
                break;
            case 2:
                s(motionEvent);
                break;
            case 3:
                o(motionEvent);
                break;
            case 4:
                r(motionEvent);
                break;
            case 5:
                u(motionEvent);
                break;
            case 6:
                n(motionEvent);
                break;
            case 7:
                t(motionEvent);
                break;
            case 8:
                m(motionEvent);
                break;
            case 9:
                p(motionEvent);
                break;
            case 10:
            case 11:
            case 12:
                v(motionEvent);
                break;
        }
    }

    public final void k(MotionEvent motionEvent) {
        g gVar;
        float f8;
        float f9;
        int i8;
        int i9;
        if (motionEvent.getPointerCount() <= 0) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x7 = motionEvent.getX(actionIndex);
        float y7 = motionEvent.getY(actionIndex);
        long eventTime = motionEvent.getEventTime();
        float pressure = motionEvent.getPressure(actionIndex);
        float f10 = 0.0f;
        float f11 = 0.0f;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    int i10 = 0;
                    while (i10 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i10);
                        float x8 = motionEvent.getX(i10);
                        float y8 = motionEvent.getY(i10);
                        if (this.f1668k.containsKey(Integer.valueOf(pointerId2))) {
                            Vector<Float> vector = this.f1668k.get(Integer.valueOf(pointerId2));
                            f8 = x8 - vector.firstElement().floatValue();
                            f9 = y8 - vector.lastElement().floatValue();
                            vector.setElementAt(Float.valueOf(x8), 0);
                            vector.setElementAt(Float.valueOf(y8), 1);
                        } else {
                            f8 = 0.0f;
                            f9 = 0.0f;
                        }
                        if (Math.abs(f8) > 0.1f || Math.abs(f9) > 0.1f) {
                            i8 = i10;
                            i9 = pointerCount;
                            a(pointerId2, x8, y8, f8, f9, eventTime, g.ETOUCH_MOVE.ordinal(), motionEvent.getPressure(i10));
                        } else {
                            i8 = i10;
                            i9 = pointerCount;
                        }
                        i10 = i8 + 1;
                        pointerCount = i9;
                    }
                    return;
                }
                if (actionMasked == 3) {
                    if (this.f1668k.containsKey(Integer.valueOf(pointerId))) {
                        Vector<Float> vector2 = this.f1668k.get(Integer.valueOf(pointerId));
                        float floatValue = x7 - vector2.elementAt(0).floatValue();
                        float floatValue2 = y7 - vector2.elementAt(1).floatValue();
                        this.f1668k.remove(Integer.valueOf(pointerId));
                        f11 = floatValue2;
                        f10 = floatValue;
                    }
                    gVar = g.ETOUCH_CANCEL;
                    a(pointerId, x7, y7, f10, f11, eventTime, gVar.ordinal(), pressure);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                }
            }
            if (this.f1668k.containsKey(Integer.valueOf(pointerId))) {
                Vector<Float> vector3 = this.f1668k.get(Integer.valueOf(pointerId));
                float floatValue3 = x7 - vector3.elementAt(0).floatValue();
                float floatValue4 = y7 - vector3.elementAt(1).floatValue();
                this.f1668k.remove(Integer.valueOf(pointerId));
                f11 = floatValue4;
                f10 = floatValue3;
            }
            gVar = g.ETOUCH_END;
            a(pointerId, x7, y7, f10, f11, eventTime, gVar.ordinal(), pressure);
        }
        Vector<Float> vector4 = new Vector<>(2);
        vector4.add(Float.valueOf(x7));
        vector4.add(Float.valueOf(y7));
        this.f1668k.put(Integer.valueOf(pointerId), vector4);
        gVar = g.ETOUCH_BEGIN;
        a(pointerId, x7, y7, f10, f11, eventTime, gVar.ordinal(), pressure);
    }

    public final void l(MotionEvent motionEvent) {
        f fVar;
        this.f1670m.a(motionEvent, motionEvent.getActionIndex());
        a(this.f1670m, this.f1671n);
        Log.d("ARPTouchInput", "touchDownInSingleFingerCandidate() mFirstFingerTouch = " + this.f1670m.toString());
        if (this.f1659b.hasMessages(2) && (fVar = this.f1667j) != null) {
            float f8 = fVar.f1710b;
            float f9 = fVar.f1711c;
            f fVar2 = this.f1670m;
            if (a(f8, f9, fVar2.f1710b, fVar2.f1711c) > 100.0d) {
                g();
            }
        }
        this.f1659b.sendEmptyMessageDelayed(1, 600L);
    }

    public final void m(MotionEvent motionEvent) {
        if (2 != motionEvent.getActionMasked()) {
            if (1 == motionEvent.getActionMasked()) {
                c();
                return;
            } else {
                this.f1666i = d.EStatUnknown;
                return;
            }
        }
        f fVar = this.f1670m;
        if (a(fVar.f1710b, fVar.f1711c, motionEvent.getX(), motionEvent.getY()) > 50.0d) {
            this.f1666i = d.EScrollAfterLongPress;
            a(motionEvent.getEventTime(), this.f1670m.f1709a, motionEvent.getX(), motionEvent.getY(), a(motionEvent), b(motionEvent));
            this.f1670m.f1710b = c(motionEvent);
            this.f1670m.f1711c = d(motionEvent);
            this.f1671n.f1712d = motionEvent.getEventTime();
        }
    }

    public final void n(MotionEvent motionEvent) {
        if (5 == motionEvent.getActionMasked()) {
            this.f1666i = d.EStatUnknown;
            this.f1675r = true;
            return;
        }
        if (6 == motionEvent.getActionMasked()) {
            this.f1666i = d.EStatScroll;
            int action = (motionEvent.getAction() & 65280) >>> 8;
            f fVar = this.f1670m;
            if (action == fVar.f1709a) {
                fVar.f1709a = this.f1672o.f1709a;
            }
            this.f1675r = true;
            b();
            return;
        }
        if (2 != motionEvent.getActionMasked()) {
            this.f1666i = d.EStatUnknown;
            return;
        }
        if (motionEvent.getEventTime() - this.f1671n.f1712d < 1 || motionEvent.getEventTime() - this.f1673p.f1712d < 1) {
            return;
        }
        float c8 = c(motionEvent);
        float d8 = d(motionEvent);
        float g8 = g(motionEvent);
        float h8 = h(motionEvent);
        double a8 = a(c8, d8, g8, h8);
        a(motionEvent.getEventTime(), this.f1670m.f1709a, c8, d8, a(motionEvent), b(motionEvent), this.f1672o.f1709a, g8, h8, e(motionEvent), f(motionEvent), a8 < this.f1674q);
        this.f1674q = a8;
        f fVar2 = this.f1670m;
        fVar2.f1710b = c8;
        fVar2.f1711c = d8;
        this.f1671n.f1712d = motionEvent.getEventTime();
        f fVar3 = this.f1673p;
        fVar3.f1710b = g8;
        fVar3.f1711c = h8;
        fVar3.f1712d = motionEvent.getEventTime();
    }

    public final void o(MotionEvent motionEvent) {
        e eVar;
        try {
            if (5 == motionEvent.getActionMasked()) {
                f fVar = this.f1670m;
                fVar.a(motionEvent, fVar.f1709a);
                a(this.f1670m, this.f1671n);
                this.f1672o.a(motionEvent, motionEvent.getActionIndex());
                a(this.f1672o, this.f1673p);
                this.f1666i = d.EStatTwoFingersCandidate;
                w4 w4Var = this.f1658a;
                if (w4Var == null || !w4Var.h()) {
                    return;
                }
                a();
                return;
            }
            if (6 != motionEvent.getActionMasked()) {
                if (1 == motionEvent.getActionMasked()) {
                    c();
                    return;
                }
                if (2 == motionEvent.getActionMasked()) {
                    if (motionEvent.getEventTime() - this.f1671n.f1712d >= 1) {
                        float c8 = c(motionEvent);
                        float d8 = d(motionEvent);
                        a(motionEvent.getEventTime(), this.f1670m.f1709a, c8, d8, a(motionEvent), b(motionEvent));
                        f fVar2 = this.f1671n;
                        float f8 = c8 - fVar2.f1710b;
                        float f9 = d8 - fVar2.f1711c;
                        float eventTime = f8 / (motionEvent.getEventTime() - this.f1671n.f1712d);
                        float eventTime2 = f9 / (motionEvent.getEventTime() - this.f1671n.f1712d);
                        w4 w4Var2 = this.f1658a;
                        if (w4Var2 != null && w4Var2.i()) {
                            if (Math.abs(f8) > Math.abs(f9) && Math.abs(f8) > 100.0d && Math.abs(eventTime) > 20.0d) {
                                eVar = f8 > 0.0f ? e.ESWIPE_RIGHT : e.ESWIPE_LEFT;
                            } else if (Math.abs(f9) > Math.abs(f8) && Math.abs(f9) > 100.0d && Math.abs(eventTime2) > 20.0d) {
                                eVar = f9 > 0.0f ? e.ESWIPE_DOWN : e.ESWIPE_UP;
                            }
                            this.f1677t = eVar;
                            this.f1666i = d.EStatSwipe;
                        }
                        f fVar3 = this.f1671n;
                        fVar3.f1710b = c8;
                        fVar3.f1711c = d8;
                        fVar3.f1712d = motionEvent.getEventTime();
                        return;
                    }
                    return;
                }
            }
            this.f1666i = d.EStatUnknown;
        } catch (Exception unused) {
            Log.e("ARPTouchInput", "Monkey event.getX Exception");
        }
    }

    public final void p(MotionEvent motionEvent) {
        if (2 != motionEvent.getActionMasked()) {
            if (1 == motionEvent.getActionMasked()) {
                c();
                return;
            } else {
                this.f1666i = d.EStatUnknown;
                return;
            }
        }
        a(motionEvent.getEventTime(), this.f1670m.f1709a, motionEvent.getX(), motionEvent.getY(), a(motionEvent), b(motionEvent));
        this.f1670m.f1710b = c(motionEvent);
        this.f1670m.f1711c = d(motionEvent);
        this.f1671n.f1712d = motionEvent.getEventTime();
    }

    public final void q(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            l(motionEvent);
            return;
        }
        if (actionMasked == 1) {
            y(motionEvent);
        } else if (actionMasked == 2) {
            w(motionEvent);
        } else {
            if (actionMasked != 5) {
                return;
            }
            x(motionEvent);
        }
    }

    public final void r(MotionEvent motionEvent) {
        if (1 == motionEvent.getActionMasked()) {
            a(motionEvent.getEventTime(), this.f1670m.f1709a, this.f1677t.ordinal());
        }
    }

    public final void s(MotionEvent motionEvent) {
        float f8;
        float f9;
        float f10;
        float f11;
        if (2 != motionEvent.getActionMasked()) {
            this.f1666i = d.EStatUnknown;
            return;
        }
        float c8 = c(motionEvent);
        float d8 = d(motionEvent);
        float g8 = g(motionEvent);
        float h8 = h(motionEvent);
        f fVar = this.f1670m;
        double a8 = a(fVar.f1710b, fVar.f1711c, c8, d8);
        f fVar2 = this.f1672o;
        double a9 = a(fVar2.f1710b, fVar2.f1711c, g8, h8);
        if ((a8 > 50.0d || a9 > 50.0d) && a8 > 20.0d && a9 > 20.0d) {
            f fVar3 = this.f1670m;
            float f12 = fVar3.f1710b;
            float f13 = fVar3.f1711c;
            f fVar4 = this.f1672o;
            double a10 = a(f12, f13, c8, d8, fVar4.f1710b, fVar4.f1711c, g8, h8);
            if (a10 < 0.7853981633974483d) {
                this.f1666i = d.EStatTwoFingersScroll;
                f8 = h8;
                f9 = g8;
                a(motionEvent.getDownTime(), this.f1670m.f1709a, c8, d8, a(motionEvent), b(motionEvent), this.f1672o.f1709a, g8, h8, e(motionEvent), f(motionEvent));
                Log.d("ARPTouchInput", "EStatTwoFingersScroll");
            } else {
                f8 = h8;
                f9 = g8;
                if (a10 <= 3.141592653589793d && a10 > 1.5707963267948966d) {
                    f fVar5 = this.f1670m;
                    float f14 = fVar5.f1710b;
                    f fVar6 = this.f1672o;
                    float f15 = (fVar6.f1710b + f14) / 2.0f;
                    float f16 = fVar5.f1711c;
                    float f17 = (fVar6.f1711c + f16) / 2.0f;
                    double a11 = a(f15, f17, f14, f16, f14, f16, c8, d8);
                    f fVar7 = this.f1672o;
                    float f18 = fVar7.f1710b;
                    float f19 = fVar7.f1711c;
                    double a12 = a(f15, f17, f18, f19, f18, f19, f9, f8);
                    if (Math.abs(a11 - 1.5707963267948966d) < 0.6283185307179586d || Math.abs(a12 - 1.5707963267948966d) < 0.6283185307179586d) {
                        this.f1666i = d.EStatTwoFingersRotate;
                    }
                }
                this.f1666i = d.EStatPinchAndUnpinch;
                f10 = f9;
                f11 = f8;
                this.f1674q = a(c8, d8, f10, f11);
            }
            f10 = f9;
            f11 = f8;
        } else {
            f11 = h8;
            f10 = g8;
        }
        f fVar8 = this.f1671n;
        fVar8.f1710b = c8;
        fVar8.f1711c = d8;
        fVar8.f1712d = motionEvent.getEventTime();
        f fVar9 = this.f1673p;
        fVar9.f1710b = f10;
        fVar9.f1711c = f11;
        fVar9.f1712d = motionEvent.getEventTime();
    }

    public final void t(MotionEvent motionEvent) {
        if (2 != motionEvent.getActionMasked()) {
            if (1 == motionEvent.getActionMasked()) {
                c();
                return;
            } else {
                this.f1666i = d.EStatUnknown;
                return;
            }
        }
        float c8 = c(motionEvent);
        float d8 = d(motionEvent);
        float g8 = g(motionEvent);
        float h8 = h(motionEvent);
        float f8 = this.f1673p.f1710b;
        f fVar = this.f1670m;
        a(motionEvent.getEventTime(), this.f1670m.f1709a, c8, d8, this.f1672o.f1709a, g8, h8, (float) a(f8 - fVar.f1710b, r0.f1711c - fVar.f1711c, g8 - c8, h8 - d8));
        f fVar2 = this.f1670m;
        fVar2.f1710b = c8;
        fVar2.f1711c = d8;
        this.f1671n.f1712d = motionEvent.getEventTime();
        f fVar3 = this.f1673p;
        fVar3.f1710b = g8;
        fVar3.f1711c = h8;
        fVar3.f1712d = motionEvent.getEventTime();
    }

    public final void u(MotionEvent motionEvent) {
        if (5 != motionEvent.getActionMasked()) {
            if (6 == motionEvent.getActionMasked()) {
                this.f1666i = d.EStatScroll;
                int action = (motionEvent.getAction() & 65280) >>> 8;
                f fVar = this.f1670m;
                if (action == fVar.f1709a) {
                    a(this.f1672o, fVar);
                    a(this.f1673p, this.f1671n);
                }
                a();
                return;
            }
            if (2 == motionEvent.getActionMasked()) {
                if (motionEvent.getEventTime() - this.f1671n.f1712d < 1 || motionEvent.getEventTime() - this.f1673p.f1712d < 1) {
                    return;
                }
                float c8 = c(motionEvent);
                float d8 = d(motionEvent);
                float g8 = g(motionEvent);
                float h8 = h(motionEvent);
                a(motionEvent.getEventTime(), this.f1670m.f1709a, c8, d8, a(motionEvent), b(motionEvent), this.f1672o.f1709a, g8, h8, e(motionEvent), f(motionEvent));
                f fVar2 = this.f1670m;
                fVar2.f1710b = c8;
                fVar2.f1711c = d8;
                this.f1671n.f1712d = motionEvent.getEventTime();
                f fVar3 = this.f1673p;
                fVar3.f1710b = g8;
                fVar3.f1711c = h8;
                fVar3.f1712d = motionEvent.getEventTime();
                return;
            }
        }
        this.f1666i = d.EStatUnknown;
    }

    public final void v(MotionEvent motionEvent) {
        if (1 == motionEvent.getActionMasked()) {
            c();
        }
    }

    public final void w(MotionEvent motionEvent) {
        f fVar = this.f1670m;
        double a8 = a(fVar.f1710b, fVar.f1711c, motionEvent.getX(), motionEvent.getY());
        Log.d("ARPTouchInput", "touchMoveInSingleFingerCandidate() distance = " + a8);
        if (a8 < 20.0d) {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > 600) {
                this.f1666i = d.EStatLongPress;
                b(motionEvent.getDownTime(), this.f1670m.f1709a, motionEvent.getX(), motionEvent.getY());
                this.f1659b.removeMessages(1);
            }
        } else if (a8 < 50.0d) {
            this.f1669l = false;
        } else {
            g();
            this.f1666i = d.EStatScroll;
            a(motionEvent.getEventTime(), this.f1670m.f1709a, motionEvent.getX(), motionEvent.getY(), a(motionEvent), b(motionEvent));
            this.f1659b.removeMessages(1);
        }
        this.f1671n.a(motionEvent, 0);
    }

    public final void x(MotionEvent motionEvent) {
        d dVar;
        Log.d("ARPTouchInput", "touchPointerDownInSingleFingerCandidate() mFirstFingnerInClickArea = " + this.f1669l);
        if (this.f1669l) {
            this.f1672o.a(motionEvent, motionEvent.getActionIndex());
            a(this.f1672o, this.f1673p);
            dVar = d.EStatTwoFingersCandidate;
        } else {
            dVar = d.EStatUnknown;
        }
        this.f1666i = dVar;
        g();
    }

    public final void y(MotionEvent motionEvent) {
        f fVar = this.f1670m;
        if (a(fVar.f1710b, fVar.f1711c, motionEvent.getX(), motionEvent.getY()) < 20.0d && motionEvent.getEventTime() - motionEvent.getDownTime() < 300) {
            w4 w4Var = this.f1658a;
            if (w4Var != null && w4Var.d()) {
                if (this.f1659b.hasMessages(2)) {
                    this.f1659b.removeMessages(2);
                } else {
                    Message obtain = Message.obtain();
                    obtain.what = 2;
                    f fVar2 = new f(this, null);
                    fVar2.a(motionEvent, 0);
                    obtain.obj = fVar2;
                    this.f1667j = fVar2;
                    this.f1659b.sendMessageDelayed(obtain, 400L);
                }
            }
            a(motionEvent.getDownTime(), motionEvent.getPointerId(0), motionEvent.getX(), motionEvent.getY());
        }
        c();
    }

    public final double a(float f8, float f9, float f10, float f11) {
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        return Math.sqrt((f12 * f12) + (f13 * f13));
    }

    public final void c() {
        this.f1666i = d.EStatSingFingerCandidate;
        this.f1669l = true;
        this.f1674q = -1.0d;
        this.f1659b.removeMessages(1);
        if (this.f1659b.hasMessages(2)) {
            return;
        }
        a();
    }

    public final void e() {
        w4 w4Var = this.f1658a;
        if (w4Var != null) {
            w4Var.k();
        }
    }

    public void f() {
        this.f1662e = true;
        c cVar = this.f1659b;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.f1658a = null;
        }
        w4 w4Var = this.f1658a;
        if (w4Var != null) {
            w4Var.l();
            this.f1658a = null;
        }
    }

    public final void g() {
        if (this.f1659b.hasMessages(2)) {
            this.f1659b.removeMessages(2);
            f fVar = this.f1667j;
            if (fVar != null) {
                a(fVar.f1712d, fVar.f1709a, fVar.f1710b, fVar.f1711c);
                this.f1667j = null;
            }
        }
    }

    public final double a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        Log.d("ARPTouchInput", String.format("vx1 %1.3f vy1 %1.3f vx2 %1.3f vy2 %1.3f", Float.valueOf(f10 - f8), Float.valueOf(f11 - f9), Float.valueOf(f14 - f12), Float.valueOf(f15 - f13)));
        double sqrt = ((r5 * r9) + (r6 * r10)) / (Math.sqrt((r5 * r5) + (r6 * r6)) * Math.sqrt((r9 * r9) + (r10 * r10)));
        try {
            sqrt = Double.parseDouble(new DecimalFormat("#.00").format(sqrt));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        double acos = Math.acos(sqrt);
        Log.d("ARPTouchInput", String.format("angle is %1.3f", Double.valueOf(Math.toDegrees(acos))));
        return acos;
    }

    public final void b() {
        ARPEngine.getInstance().onGestureUpdateWithScaleFinish(b.EGESTURE_CLEAR.ordinal(), -1L, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f, true);
    }

    public void c(boolean z7) {
        this.f1660c = z7;
    }

    public void d() {
        w4 w4Var = this.f1658a;
        if (w4Var != null) {
            w4Var.j();
        }
    }

    public final float a(MotionEvent motionEvent) {
        return (motionEvent.getX(motionEvent.findPointerIndex(this.f1670m.f1709a)) - this.f1670m.f1710b) / (motionEvent.getEventTime() - this.f1671n.f1712d);
    }

    public final void b(long j8, int i8, float f8, float f9) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.e()) {
            return;
        }
        a(b.EGESTURE_LONG_PRESS.ordinal(), j8, i8, f8, f9, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
    }

    public final void a() {
        a(b.EGESTURE_CLEAR.ordinal(), -1L, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
    }

    public void b(boolean z7) {
        Log.d("ARPTouchInput", "setScreenOrientationLandscape landscape = " + z7);
        this.f1663f = z7;
    }

    public final void a(int i8, float f8, float f9, float f10, float f11, long j8, int i9, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        int i11;
        if (this.f1663f) {
            f13 = this.f1664g - f9;
            f15 = f10;
            f14 = -f11;
            f16 = f8;
        } else {
            f13 = f8;
            f14 = f10;
            f15 = f11;
            f16 = f9;
        }
        float[] windowSize = ARPEngine.getInstance().getWindowSize();
        if (windowSize.length == 2) {
            float f17 = windowSize[0];
            if (f17 > 0.0f) {
                float f18 = windowSize[1];
                if (f18 > 0.0f && (i10 = this.f1664g) > 0 && (i11 = this.f1665h) > 0) {
                    float f19 = f17 / i10;
                    float f20 = f18 / i11;
                    f13 *= f19;
                    f14 *= f19;
                    f16 *= f20;
                    f15 *= f20;
                }
            }
        }
        ARPEngine.getInstance().onTouchUpdate(i8, f13, f16, f14, f15, j8, i9, f12);
    }

    public void a(int i8, int i9) {
        Log.d("ARPTouchInput", "setScreenWidthHight width * height = " + i8 + " * " + i9);
        if (this.f1663f) {
            this.f1664g = i9;
            this.f1665h = i8;
        } else {
            this.f1664g = i8;
            this.f1665h = i9;
        }
    }

    public final void a(int i8, long j8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, int i11, float f16) {
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        int i12;
        int i13;
        if (this.f1663f) {
            float f29 = this.f1664g;
            f17 = f29 - f9;
            f20 = f12;
            f19 = f29 - f13;
            f18 = f8;
        } else {
            f17 = f8;
            f18 = f9;
            f19 = f12;
            f20 = f13;
        }
        float[] windowSize = ARPEngine.getInstance().getWindowSize();
        if (windowSize.length == 2) {
            float f30 = windowSize[0];
            if (f30 > 0.0f) {
                float f31 = windowSize[1];
                if (f31 > 0.0f && (i12 = this.f1664g) > 0 && (i13 = this.f1665h) > 0) {
                    float f32 = f30 / i12;
                    float f33 = f31 / i13;
                    f25 = f18 * f33;
                    f26 = f17 * f32;
                    f27 = f20 * f33;
                    f28 = f19 * f32;
                    f24 = f33 * f15;
                    f23 = f32 * f14;
                    f21 = f10 * f32;
                    f22 = f11 * f33;
                    ARPEngine.getInstance().onGestureUpdate(i8, j8, i9, f26, f25, f21, f22, i10, f28, f27, f23, f24, i11, f16);
                }
            }
        }
        f21 = f10;
        f22 = f11;
        f23 = f14;
        f24 = f15;
        f25 = f18;
        f26 = f17;
        f27 = f20;
        f28 = f19;
        ARPEngine.getInstance().onGestureUpdate(i8, j8, i9, f26, f25, f21, f22, i10, f28, f27, f23, f24, i11, f16);
    }

    public final void a(long j8, int i8, float f8, float f9) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.c()) {
            return;
        }
        a(b.EGESTURE_CLICK.ordinal(), j8, i8, f8, f9, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
        a();
    }

    public final void a(long j8, int i8, float f8, float f9, float f10, float f11) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.h()) {
            return;
        }
        a(b.EGESTURE_SINGLE_FINGER_SCROLL.ordinal(), j8, i8, f8, f9, f10, f11, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
    }

    public final void a(long j8, int i8, float f8, float f9, float f10, float f11, int i9, float f12, float f13, float f14, float f15) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.b()) {
            return;
        }
        a(b.EGESTURE_TWO_FINGER_SCROLL.ordinal(), j8, i8, f8, f9, f10, f11, i9, f12, f13, f14, f15, -1, 0.0f);
    }

    public final void a(long j8, int i8, float f8, float f9, float f10, float f11, int i9, float f12, float f13, float f14, float f15, boolean z7) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.f()) {
            return;
        }
        if (!this.f1675r) {
            if ((z7 && !this.f1676s) || (!z7 && this.f1676s)) {
                a();
            }
            this.f1676s = z7;
        }
        int ordinal = b.EGESTURE_TWO_FINGER_UNPINCH.ordinal();
        if (z7) {
            ordinal = b.EGESTURE_TWO_FINGER_PINCH.ordinal();
        }
        a(ordinal, j8, i8, f8, f9, f10, f11, i9, f12, f13, f14, f15, -1, 0.0f);
        if (this.f1675r) {
            this.f1676s = z7;
        }
    }

    public final void a(long j8, int i8, float f8, float f9, int i9, float f10, float f11, float f12) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.g()) {
            return;
        }
        a(b.EGESTURE_TWO_FINGER_ROTATE.ordinal(), j8, i8, f8, f9, -1.0f, -1.0f, i9, f10, f11, -1.0f, -1.0f, -1, f12);
    }

    public final void a(long j8, int i8, int i9) {
        w4 w4Var = this.f1658a;
        if (w4Var == null || !w4Var.i()) {
            return;
        }
        a(b.EGESTURE_SWIPE.ordinal(), j8, i8, -1.0f, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, i9, 0.0f);
        c();
    }

    public final void a(f fVar, f fVar2) {
        fVar2.f1709a = fVar.f1709a;
        fVar2.f1710b = fVar.f1710b;
        fVar2.f1711c = fVar.f1711c;
        fVar2.f1712d = fVar.f1712d;
    }

    public void a(boolean z7) {
        this.f1661d = z7;
    }
}

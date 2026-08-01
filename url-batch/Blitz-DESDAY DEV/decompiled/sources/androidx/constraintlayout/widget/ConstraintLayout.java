package androidx.constraintlayout.widget;

import D.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import s.C0265c;
import u.C0272a;
import u.C0275d;
import u.C0276e;
import u.g;
import u.h;
import u.i;
import v.AbstractC0292o;
import v.C0280c;
import v.C0282e;
import v.C0286i;
import v.C0288k;
import v.C0290m;
import x.AbstractC0302c;
import x.AbstractC0303d;
import x.C0304e;
import x.C0305f;
import x.C0306g;
import x.C0307h;
import x.o;
import x.p;
import x.q;
import x.s;
import x.t;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static t f1458r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1459a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1460b;

    /* renamed from: c, reason: collision with root package name */
    public final C0276e f1461c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1462e;

    /* renamed from: f, reason: collision with root package name */
    public int f1463f;

    /* renamed from: g, reason: collision with root package name */
    public int f1464g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public o f1465j;

    /* renamed from: k, reason: collision with root package name */
    public j f1466k;

    /* renamed from: l, reason: collision with root package name */
    public int f1467l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1468m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1469n;

    /* renamed from: o, reason: collision with root package name */
    public final C0305f f1470o;

    /* renamed from: p, reason: collision with root package name */
    public int f1471p;

    /* renamed from: q, reason: collision with root package name */
    public int f1472q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1459a = new SparseArray();
        this.f1460b = new ArrayList(4);
        this.f1461c = new C0276e();
        this.d = 0;
        this.f1462e = 0;
        this.f1463f = Integer.MAX_VALUE;
        this.f1464g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1465j = null;
        this.f1466k = null;
        this.f1467l = -1;
        this.f1468m = new HashMap();
        this.f1469n = new SparseArray();
        this.f1470o = new C0305f(this, this);
        this.f1471p = 0;
        this.f1472q = 0;
        i(attributeSet, 0);
    }

    public static C0304e g() {
        C0304e c0304e = new C0304e(-2, -2);
        c0304e.f3987a = -1;
        c0304e.f3989b = -1;
        c0304e.f3991c = -1.0f;
        c0304e.d = true;
        c0304e.f3994e = -1;
        c0304e.f3996f = -1;
        c0304e.f3998g = -1;
        c0304e.h = -1;
        c0304e.i = -1;
        c0304e.f4002j = -1;
        c0304e.f4004k = -1;
        c0304e.f4006l = -1;
        c0304e.f4008m = -1;
        c0304e.f4010n = -1;
        c0304e.f4012o = -1;
        c0304e.f4014p = -1;
        c0304e.f4015q = 0;
        c0304e.f4016r = 0.0f;
        c0304e.f4017s = -1;
        c0304e.f4018t = -1;
        c0304e.f4019u = -1;
        c0304e.f4020v = -1;
        c0304e.f4021w = Integer.MIN_VALUE;
        c0304e.f4022x = Integer.MIN_VALUE;
        c0304e.f4023y = Integer.MIN_VALUE;
        c0304e.f4024z = Integer.MIN_VALUE;
        c0304e.f3962A = Integer.MIN_VALUE;
        c0304e.f3963B = Integer.MIN_VALUE;
        c0304e.f3964C = Integer.MIN_VALUE;
        c0304e.f3965D = 0;
        c0304e.f3966E = 0.5f;
        c0304e.f3967F = 0.5f;
        c0304e.f3968G = null;
        c0304e.H = -1.0f;
        c0304e.f3969I = -1.0f;
        c0304e.f3970J = 0;
        c0304e.f3971K = 0;
        c0304e.f3972L = 0;
        c0304e.f3973M = 0;
        c0304e.f3974N = 0;
        c0304e.f3975O = 0;
        c0304e.f3976P = 0;
        c0304e.f3977Q = 0;
        c0304e.f3978R = 1.0f;
        c0304e.f3979S = 1.0f;
        c0304e.f3980T = -1;
        c0304e.f3981U = -1;
        c0304e.f3982V = -1;
        c0304e.f3983W = false;
        c0304e.f3984X = false;
        c0304e.f3985Y = null;
        c0304e.f3986Z = 0;
        c0304e.f3988a0 = true;
        c0304e.f3990b0 = true;
        c0304e.f3992c0 = false;
        c0304e.f3993d0 = false;
        c0304e.f3995e0 = false;
        c0304e.f3997f0 = -1;
        c0304e.f3999g0 = -1;
        c0304e.f4000h0 = -1;
        c0304e.f4001i0 = -1;
        c0304e.f4003j0 = Integer.MIN_VALUE;
        c0304e.f4005k0 = Integer.MIN_VALUE;
        c0304e.f4007l0 = 0.5f;
        c0304e.p0 = new C0275d();
        return c0304e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static t getSharedValues() {
        if (f1458r == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            f1458r = tVar;
        }
        return f1458r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0304e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1460b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0302c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0304e c0304e = new C0304e(context, attributeSet);
        c0304e.f3987a = -1;
        c0304e.f3989b = -1;
        c0304e.f3991c = -1.0f;
        c0304e.d = true;
        c0304e.f3994e = -1;
        c0304e.f3996f = -1;
        c0304e.f3998g = -1;
        c0304e.h = -1;
        c0304e.i = -1;
        c0304e.f4002j = -1;
        c0304e.f4004k = -1;
        c0304e.f4006l = -1;
        c0304e.f4008m = -1;
        c0304e.f4010n = -1;
        c0304e.f4012o = -1;
        c0304e.f4014p = -1;
        c0304e.f4015q = 0;
        c0304e.f4016r = 0.0f;
        c0304e.f4017s = -1;
        c0304e.f4018t = -1;
        c0304e.f4019u = -1;
        c0304e.f4020v = -1;
        c0304e.f4021w = Integer.MIN_VALUE;
        c0304e.f4022x = Integer.MIN_VALUE;
        c0304e.f4023y = Integer.MIN_VALUE;
        c0304e.f4024z = Integer.MIN_VALUE;
        c0304e.f3962A = Integer.MIN_VALUE;
        c0304e.f3963B = Integer.MIN_VALUE;
        c0304e.f3964C = Integer.MIN_VALUE;
        c0304e.f3965D = 0;
        c0304e.f3966E = 0.5f;
        c0304e.f3967F = 0.5f;
        c0304e.f3968G = null;
        c0304e.H = -1.0f;
        c0304e.f3969I = -1.0f;
        c0304e.f3970J = 0;
        c0304e.f3971K = 0;
        c0304e.f3972L = 0;
        c0304e.f3973M = 0;
        c0304e.f3974N = 0;
        c0304e.f3975O = 0;
        c0304e.f3976P = 0;
        c0304e.f3977Q = 0;
        c0304e.f3978R = 1.0f;
        c0304e.f3979S = 1.0f;
        c0304e.f3980T = -1;
        c0304e.f3981U = -1;
        c0304e.f3982V = -1;
        c0304e.f3983W = false;
        c0304e.f3984X = false;
        c0304e.f3985Y = null;
        c0304e.f3986Z = 0;
        c0304e.f3988a0 = true;
        c0304e.f3990b0 = true;
        c0304e.f3992c0 = false;
        c0304e.f3993d0 = false;
        c0304e.f3995e0 = false;
        c0304e.f3997f0 = -1;
        c0304e.f3999g0 = -1;
        c0304e.f4000h0 = -1;
        c0304e.f4001i0 = -1;
        c0304e.f4003j0 = Integer.MIN_VALUE;
        c0304e.f4005k0 = Integer.MIN_VALUE;
        c0304e.f4007l0 = 0.5f;
        c0304e.p0 = new C0275d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4143b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0303d.f3961a.get(index);
            switch (i2) {
                case 1:
                    c0304e.f3982V = obtainStyledAttributes.getInt(index, c0304e.f3982V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0304e.f4014p);
                    c0304e.f4014p = resourceId;
                    if (resourceId == -1) {
                        c0304e.f4014p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0304e.f4015q = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f4015q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0304e.f4016r) % 360.0f;
                    c0304e.f4016r = f2;
                    if (f2 < 0.0f) {
                        c0304e.f4016r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0304e.f3987a = obtainStyledAttributes.getDimensionPixelOffset(index, c0304e.f3987a);
                    break;
                case 6:
                    c0304e.f3989b = obtainStyledAttributes.getDimensionPixelOffset(index, c0304e.f3989b);
                    break;
                case 7:
                    c0304e.f3991c = obtainStyledAttributes.getFloat(index, c0304e.f3991c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0304e.f3994e);
                    c0304e.f3994e = resourceId2;
                    if (resourceId2 == -1) {
                        c0304e.f3994e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0304e.f3996f);
                    c0304e.f3996f = resourceId3;
                    if (resourceId3 == -1) {
                        c0304e.f3996f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0304e.f3998g);
                    c0304e.f3998g = resourceId4;
                    if (resourceId4 == -1) {
                        c0304e.f3998g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0304e.h);
                    c0304e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0304e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0304e.i);
                    c0304e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0304e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0304e.f4002j);
                    c0304e.f4002j = resourceId7;
                    if (resourceId7 == -1) {
                        c0304e.f4002j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0304e.f4004k);
                    c0304e.f4004k = resourceId8;
                    if (resourceId8 == -1) {
                        c0304e.f4004k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0304e.f4006l);
                    c0304e.f4006l = resourceId9;
                    if (resourceId9 == -1) {
                        c0304e.f4006l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0304e.f4008m);
                    c0304e.f4008m = resourceId10;
                    if (resourceId10 == -1) {
                        c0304e.f4008m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0304e.f4017s);
                    c0304e.f4017s = resourceId11;
                    if (resourceId11 == -1) {
                        c0304e.f4017s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0304e.f4018t);
                    c0304e.f4018t = resourceId12;
                    if (resourceId12 == -1) {
                        c0304e.f4018t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0304e.f4019u);
                    c0304e.f4019u = resourceId13;
                    if (resourceId13 == -1) {
                        c0304e.f4019u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0304e.f4020v);
                    c0304e.f4020v = resourceId14;
                    if (resourceId14 == -1) {
                        c0304e.f4020v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0304e.f4021w = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f4021w);
                    break;
                case 22:
                    c0304e.f4022x = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f4022x);
                    break;
                case 23:
                    c0304e.f4023y = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f4023y);
                    break;
                case 24:
                    c0304e.f4024z = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f4024z);
                    break;
                case 25:
                    c0304e.f3962A = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3962A);
                    break;
                case 26:
                    c0304e.f3963B = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3963B);
                    break;
                case 27:
                    c0304e.f3983W = obtainStyledAttributes.getBoolean(index, c0304e.f3983W);
                    break;
                case 28:
                    c0304e.f3984X = obtainStyledAttributes.getBoolean(index, c0304e.f3984X);
                    break;
                case 29:
                    c0304e.f3966E = obtainStyledAttributes.getFloat(index, c0304e.f3966E);
                    break;
                case 30:
                    c0304e.f3967F = obtainStyledAttributes.getFloat(index, c0304e.f3967F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0304e.f3972L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0304e.f3973M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0304e.f3974N = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3974N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0304e.f3974N) == -2) {
                            c0304e.f3974N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0304e.f3976P = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3976P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0304e.f3976P) == -2) {
                            c0304e.f3976P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0304e.f3978R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0304e.f3978R));
                    c0304e.f3972L = 2;
                    break;
                case 36:
                    try {
                        c0304e.f3975O = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3975O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0304e.f3975O) == -2) {
                            c0304e.f3975O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0304e.f3977Q = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3977Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0304e.f3977Q) == -2) {
                            c0304e.f3977Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0304e.f3979S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0304e.f3979S));
                    c0304e.f3973M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            o.h(c0304e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0304e.H = obtainStyledAttributes.getFloat(index, c0304e.H);
                            break;
                        case 46:
                            c0304e.f3969I = obtainStyledAttributes.getFloat(index, c0304e.f3969I);
                            break;
                        case 47:
                            c0304e.f3970J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0304e.f3971K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0304e.f3980T = obtainStyledAttributes.getDimensionPixelOffset(index, c0304e.f3980T);
                            break;
                        case 50:
                            c0304e.f3981U = obtainStyledAttributes.getDimensionPixelOffset(index, c0304e.f3981U);
                            break;
                        case 51:
                            c0304e.f3985Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0304e.f4010n);
                            c0304e.f4010n = resourceId15;
                            if (resourceId15 == -1) {
                                c0304e.f4010n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0304e.f4012o);
                            c0304e.f4012o = resourceId16;
                            if (resourceId16 == -1) {
                                c0304e.f4012o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0304e.f3965D = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3965D);
                            break;
                        case 55:
                            c0304e.f3964C = obtainStyledAttributes.getDimensionPixelSize(index, c0304e.f3964C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    o.g(c0304e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(c0304e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0304e.f3986Z = obtainStyledAttributes.getInt(index, c0304e.f3986Z);
                                    break;
                                case 67:
                                    c0304e.d = obtainStyledAttributes.getBoolean(index, c0304e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0304e.a();
        return c0304e;
    }

    public int getMaxHeight() {
        return this.f1464g;
    }

    public int getMaxWidth() {
        return this.f1463f;
    }

    public int getMinHeight() {
        return this.f1462e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1461c.f3706D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0276e c0276e = this.f1461c;
        if (c0276e.f3681j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0276e.f3681j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0276e.f3681j = "parent";
            }
        }
        if (c0276e.f3679h0 == null) {
            c0276e.f3679h0 = c0276e.f3681j;
            Log.v("ConstraintLayout", " setDebugName " + c0276e.f3679h0);
        }
        Iterator it = c0276e.f3714q0.iterator();
        while (it.hasNext()) {
            C0275d c0275d = (C0275d) it.next();
            View view = c0275d.f3676f0;
            if (view != null) {
                if (c0275d.f3681j == null && (id = view.getId()) != -1) {
                    c0275d.f3681j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0275d.f3679h0 == null) {
                    c0275d.f3679h0 = c0275d.f3681j;
                    Log.v("ConstraintLayout", " setDebugName " + c0275d.f3679h0);
                }
            }
        }
        c0276e.n(sb);
        return sb.toString();
    }

    public final C0275d h(View view) {
        if (view == this) {
            return this.f1461c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0304e) {
            return ((C0304e) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0304e) {
            return ((C0304e) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0276e c0276e = this.f1461c;
        c0276e.f3676f0 = this;
        C0305f c0305f = this.f1470o;
        c0276e.f3718u0 = c0305f;
        c0276e.f3716s0.f3812f = c0305f;
        this.f1459a.put(getId(), this);
        this.f1465j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f4143b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1462e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1462e);
                } else if (index == 14) {
                    this.f1463f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1463f);
                } else if (index == 15) {
                    this.f1464g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1464g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1466k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.f1465j = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1465j = null;
                    }
                    this.f1467l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0276e.f3706D0 = this.i;
        C0265c.f3578p = c0276e.W(512);
    }

    public final void j(int i) {
        int eventType;
        C0306g c0306g;
        Context context = getContext();
        j jVar = new j(19, false);
        jVar.f133b = new SparseArray();
        jVar.f134c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            c0306g = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1466k = jVar;
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    c0306g = new C0306g(context, xml);
                    ((SparseArray) jVar.f133b).put(c0306g.f4031a, c0306g);
                } else if (c2 == 3) {
                    C0307h c0307h = new C0307h(context, xml);
                    if (c0306g != null) {
                        ((ArrayList) c0306g.f4033c).add(c0307h);
                    }
                } else if (c2 == 4) {
                    jVar.E(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(C0276e c0276e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0305f c0305f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0305f c0305f2;
        int i12;
        C0305f c0305f3;
        boolean z4;
        C0288k c0288k;
        C0290m c0290m;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        Iterator it;
        Iterator it2;
        boolean z6;
        C0276e c0276e2 = c0276e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0305f c0305f4 = this.f1470o;
        c0305f4.f4026b = max3;
        c0305f4.f4027c = max4;
        c0305f4.d = paddingWidth;
        c0305f4.f4028e = i19;
        c0305f4.f4029f = i2;
        c0305f4.f4030g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i21 = size - paddingWidth;
        int i22 = size2 - i19;
        int i23 = c0305f4.f4028e;
        int i24 = c0305f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1463f - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.d);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.d);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1464g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1462e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1462e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0276e.q();
        C0282e c0282e = c0276e2.f3716s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0276e.k()) {
            c0282e.f3810c = true;
        }
        c0276e2.f3664Y = 0;
        c0276e2.f3665Z = 0;
        int i26 = this.f1463f - i24;
        int[] iArr = c0276e2.f3643C;
        iArr[0] = i26;
        iArr[1] = this.f1464g - i23;
        c0276e2.f3669b0 = 0;
        c0276e2.f3671c0 = 0;
        c0276e2.M(i20);
        c0276e2.O(i25);
        c0276e2.N(i6);
        c0276e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0276e2.f3669b0 = 0;
        } else {
            c0276e2.f3669b0 = i27;
        }
        int i28 = this.f1462e - i23;
        if (i28 < 0) {
            c0276e2.f3671c0 = 0;
        } else {
            c0276e2.f3671c0 = i28;
        }
        c0276e2.f3721x0 = max5;
        c0276e2.f3722y0 = max3;
        A1.j jVar = c0276e2.f3715r0;
        jVar.getClass();
        C0305f c0305f5 = c0276e2.f3718u0;
        int size3 = c0276e2.f3714q0.size();
        int q3 = c0276e.q();
        int k2 = c0276e.k();
        boolean c2 = u.j.c(i, 128);
        boolean z7 = c2 || u.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0275d c0275d = (C0275d) c0276e2.f3714q0.get(i29);
                int[] iArr2 = c0275d.p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0275d.f3662W > 0.0f;
                if ((c0275d.x() && z8) || ((c0275d.y() && z8) || (c0275d instanceof g) || c0275d.x() || c0275d.y())) {
                    i7 = 1073741824;
                    z7 = false;
                    break;
                }
            }
        }
        i7 = 1073741824;
        boolean z9 = ((mode == i7 && mode2 == i7) || c2) & z7;
        if (z9) {
            int min = Math.min(iArr[0], i21);
            int min2 = Math.min(iArr[1], i22);
            if (mode == 1073741824 && c0276e.q() != min) {
                c0276e2.O(min);
                c0276e2.f3716s0.f3809b = true;
            }
            if (mode2 == 1073741824 && c0276e.k() != min2) {
                c0276e2.L(min2);
                c0276e2.f3716s0.f3809b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0282e.f3809b;
                C0276e c0276e3 = c0282e.f3808a;
                if (z10 || c0282e.f3810c) {
                    Iterator it3 = c0276e3.f3714q0.iterator();
                    while (it3.hasNext()) {
                        C0275d c0275d2 = (C0275d) it3.next();
                        c0275d2.h();
                        c0275d2.f3666a = false;
                        c0275d2.d.n();
                        c0275d2.f3673e.m();
                    }
                    i15 = 0;
                    c0276e3.h();
                    c0276e3.f3666a = false;
                    c0276e3.d.n();
                    c0276e3.f3673e.m();
                    c0282e.f3810c = false;
                } else {
                    i15 = 0;
                }
                c0282e.b(c0282e.d);
                c0276e3.f3664Y = i15;
                c0276e3.f3665Z = i15;
                int j2 = c0276e3.j(i15);
                int j3 = c0276e3.j(1);
                if (c0282e.f3809b) {
                    c0282e.c();
                }
                int r2 = c0276e3.r();
                int s2 = c0276e3.s();
                z2 = z9;
                c0276e3.d.h.d(r2);
                c0276e3.f3673e.h.d(s2);
                c0282e.g();
                ArrayList arrayList2 = c0282e.f3811e;
                c0305f = c0305f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0292o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0276e3.M(1);
                        i8 = q3;
                        c0276e3.O(c0282e.d(c0276e3, 0));
                        c0276e3.d.f3838e.d(c0276e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0276e3.N(1);
                        c0276e3.L(c0282e.d(c0276e3, 1));
                        c0276e3.f3673e.f3838e.d(c0276e3.k());
                        int[] iArr3 = c0276e3.p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0276e3.q() + r2;
                            c0276e3.d.i.d(q4);
                            c0276e3.d.f3838e.d(q4 - r2);
                            c0282e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0276e3.k() + s2;
                                c0276e3.f3673e.i.d(k3);
                                c0276e3.f3673e.f3838e.d(k3 - s2);
                            }
                            c0282e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0292o abstractC0292o = (AbstractC0292o) it.next();
                            if (abstractC0292o.f3836b != c0276e3 || abstractC0292o.f3840g) {
                                abstractC0292o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0292o abstractC0292o2 = (AbstractC0292o) it2.next();
                            if (z5 || abstractC0292o2.f3836b != c0276e3) {
                                if (!abstractC0292o2.h.f3820j || ((!abstractC0292o2.i.f3820j && !(abstractC0292o2 instanceof C0286i)) || (!abstractC0292o2.f3838e.f3820j && !(abstractC0292o2 instanceof C0280c) && !(abstractC0292o2 instanceof C0286i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0276e3.M(j2);
                        c0276e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0276e3.p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0276e3.q() + r2;
                c0276e3.d.i.d(q42);
                c0276e3.d.f3838e.d(q42 - r2);
                c0282e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0276e3.k() + s2;
                c0276e3.f3673e.i.d(k32);
                c0276e3.f3673e.f3838e.d(k32 - s2);
                c0282e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0276e3.M(j2);
                c0276e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0305f = c0305f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0282e.f3809b;
                C0276e c0276e4 = c0282e.f3808a;
                if (z11) {
                    Iterator it5 = c0276e4.f3714q0.iterator();
                    while (it5.hasNext()) {
                        C0275d c0275d3 = (C0275d) it5.next();
                        c0275d3.h();
                        c0275d3.f3666a = false;
                        C0288k c0288k2 = c0275d3.d;
                        c0288k2.f3838e.f3820j = false;
                        c0288k2.f3840g = false;
                        c0288k2.n();
                        C0290m c0290m2 = c0275d3.f3673e;
                        c0290m2.f3838e.f3820j = false;
                        c0290m2.f3840g = false;
                        c0290m2.m();
                    }
                    i13 = 0;
                    c0276e4.h();
                    c0276e4.f3666a = false;
                    C0288k c0288k3 = c0276e4.d;
                    c0288k3.f3838e.f3820j = false;
                    c0288k3.f3840g = false;
                    c0288k3.n();
                    C0290m c0290m3 = c0276e4.f3673e;
                    c0290m3.f3838e.f3820j = false;
                    c0290m3.f3840g = false;
                    c0290m3.m();
                    c0282e.c();
                } else {
                    i13 = 0;
                }
                c0282e.b(c0282e.d);
                c0276e4.f3664Y = i13;
                c0276e4.f3665Z = i13;
                c0276e4.d.h.d(i13);
                c0276e4.f3673e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0276e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0276e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0276e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0305f = c0305f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0276e2.f3706D0;
        if (size3 > 0) {
            int size4 = c0276e2.f3714q0.size();
            boolean W2 = c0276e2.W(64);
            C0305f c0305f6 = c0276e2.f3718u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0275d c0275d4 = (C0275d) c0276e2.f3714q0.get(i31);
                if (!(c0275d4 instanceof h) && !(c0275d4 instanceof C0272a) && !c0275d4.f3646F && (!W2 || (c0288k = c0275d4.d) == null || (c0290m = c0275d4.f3673e) == null || !c0288k.f3838e.f3820j || !c0290m.f3838e.f3820j)) {
                    int j4 = c0275d4.j(0);
                    int j5 = c0275d4.j(1);
                    boolean z12 = j4 == 3 && c0275d4.f3695r != 1 && j5 == 3 && c0275d4.f3696s != 1;
                    if (!z12 && c0276e2.W(1) && !(c0275d4 instanceof g)) {
                        if (j4 == 3 && c0275d4.f3695r == 0 && j5 != 3 && !c0275d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0275d4.f3696s == 0 && j4 != 3 && !c0275d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0275d4.f3662W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                jVar.s(0, c0275d4, c0305f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0305f6.f4025a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1460b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0302c) arrayList3.get(i33)).getClass();
                }
            }
        }
        jVar.y(c0276e2);
        ArrayList arrayList4 = (ArrayList) jVar.f80b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            jVar.w(c0276e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0276e2.p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0276e.q();
            C0276e c0276e5 = (C0276e) jVar.d;
            int max7 = Math.max(q5, c0276e5.f3669b0);
            int max8 = Math.max(c0276e.k(), c0276e5.f3671c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0275d c0275d5 = (C0275d) arrayList4.get(i36);
                if (c0275d5 instanceof g) {
                    int q6 = c0275d5.q();
                    int k4 = c0275d5.k();
                    i12 = i30;
                    c0305f3 = c0305f;
                    boolean s3 = z15 | jVar.s(1, c0275d5, c0305f3);
                    int q7 = c0275d5.q();
                    int k5 = c0275d5.k();
                    if (q7 != q6) {
                        c0275d5.O(q7);
                        if (z13 && c0275d5.r() + c0275d5.f3660U > max7) {
                            max7 = Math.max(max7, c0275d5.i(4).e() + c0275d5.r() + c0275d5.f3660U);
                        }
                        z4 = true;
                    } else {
                        z4 = s3;
                    }
                    if (k5 != k4) {
                        c0275d5.L(k5);
                        if (z14 && c0275d5.s() + c0275d5.f3661V > max8) {
                            max8 = Math.max(max8, c0275d5.i(5).e() + c0275d5.s() + c0275d5.f3661V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0275d5).f3771y0 | z4;
                } else {
                    i12 = i30;
                    c0305f3 = c0305f;
                }
                i36++;
                c0305f = c0305f3;
                i30 = i12;
            }
            int i37 = i30;
            C0305f c0305f7 = c0305f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0275d c0275d6 = (C0275d) arrayList4.get(i39);
                    if (((c0275d6 instanceof i) && !(c0275d6 instanceof g)) || (c0275d6 instanceof h) || c0275d6.f3678g0 == 8 || ((z2 && c0275d6.d.f3838e.f3820j && c0275d6.f3673e.f3838e.f3820j) || (c0275d6 instanceof g))) {
                        c0305f2 = c0305f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q8 = c0275d6.q();
                        int k6 = c0275d6.k();
                        arrayList = arrayList4;
                        int i40 = c0275d6.f3667a0;
                        i11 = size6;
                        boolean s4 = jVar.s(i38 == 1 ? 2 : 1, c0275d6, c0305f7) | z15;
                        int q9 = c0275d6.q();
                        c0305f2 = c0305f7;
                        int k7 = c0275d6.k();
                        if (q9 != q8) {
                            c0275d6.O(q9);
                            if (z13 && c0275d6.r() + c0275d6.f3660U > max7) {
                                max7 = Math.max(max7, c0275d6.i(4).e() + c0275d6.r() + c0275d6.f3660U);
                            }
                            s4 = true;
                        }
                        if (k7 != k6) {
                            c0275d6.L(k7);
                            if (z14 && c0275d6.s() + c0275d6.f3661V > max8) {
                                max8 = Math.max(max8, c0275d6.i(5).e() + c0275d6.s() + c0275d6.f3661V);
                            }
                            s4 = true;
                        }
                        z15 = (!c0275d6.f3645E || i40 == c0275d6.f3667a0) ? s4 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0305f7 = c0305f2;
                }
                C0305f c0305f8 = c0305f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                jVar.w(c0276e, i38, i34, i35);
                c0305f7 = c0305f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0276e2 = c0276e;
            i30 = i37;
        }
        c0276e2.f3706D0 = i30;
        C0265c.f3578p = c0276e2.W(512);
    }

    public final void l(C0275d c0275d, C0304e c0304e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1459a.get(i);
        C0275d c0275d2 = (C0275d) sparseArray.get(i);
        if (c0275d2 == null || view == null || !(view.getLayoutParams() instanceof C0304e)) {
            return;
        }
        c0304e.f3992c0 = true;
        if (i2 == 6) {
            C0304e c0304e2 = (C0304e) view.getLayoutParams();
            c0304e2.f3992c0 = true;
            c0304e2.p0.f3645E = true;
        }
        c0275d.i(6).b(c0275d2.i(i2), c0304e.f3965D, c0304e.f3964C, true);
        c0275d.f3645E = true;
        c0275d.i(3).j();
        c0275d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0304e c0304e = (C0304e) childAt.getLayoutParams();
            C0275d c0275d = c0304e.p0;
            if (childAt.getVisibility() != 8 || c0304e.f3993d0 || c0304e.f3995e0 || isInEditMode) {
                int r2 = c0275d.r();
                int s2 = c0275d.s();
                childAt.layout(r2, s2, c0275d.q() + r2, c0275d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1460b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0302c) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0310  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        C0275d c0275d;
        int i5;
        C0275d c0275d2;
        int i6;
        C0275d c0275d3;
        int i7;
        C0304e c0304e;
        float f2;
        int i8;
        int i9;
        int i10;
        float parseFloat;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String resourceName;
        int id;
        C0275d c0275d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1471p == i) {
            int i12 = constraintLayout.f1472q;
        }
        int i13 = 0;
        if (!constraintLayout.h) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i14).isLayoutRequested()) {
                    constraintLayout.h = true;
                    break;
                }
                i14++;
            }
        }
        constraintLayout.f1471p = i;
        constraintLayout.f1472q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0276e c0276e = constraintLayout.f1461c;
        c0276e.f3719v0 = z3;
        if (constraintLayout.h) {
            constraintLayout.h = false;
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i15).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i15++;
                }
            }
            if (z2) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    C0275d h = constraintLayout.h(constraintLayout.getChildAt(i16));
                    if (h != null) {
                        h.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt = constraintLayout.getChildAt(i17);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f1468m == null) {
                                    constraintLayout.f1468m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1468m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1459a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0275d4 = view == null ? null : ((C0304e) view.getLayoutParams()).p0;
                                c0275d4.f3679h0 = resourceName;
                            }
                        }
                        c0275d4 = c0276e;
                        c0275d4.f3679h0 = resourceName;
                    }
                }
                if (constraintLayout.f1467l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                o oVar = constraintLayout.f1465j;
                if (oVar != null) {
                    oVar.a(constraintLayout);
                }
                c0276e.f3714q0.clear();
                ArrayList arrayList3 = constraintLayout.f1460b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0302c abstractC0302c = (AbstractC0302c) arrayList3.get(i19);
                        if (abstractC0302c.isInEditMode()) {
                            abstractC0302c.setIds(abstractC0302c.f3958e);
                        }
                        i iVar = abstractC0302c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3780r0 = i13;
                            Arrays.fill(iVar.f3779q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0302c.f3956b) {
                                int i21 = abstractC0302c.f3955a[i20];
                                View view2 = (View) constraintLayout.f1459a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0302c.f3960g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0302c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0302c.f3955a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1459a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0302c.d;
                                    C0275d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3780r0 + 1;
                                        C0275d[] c0275dArr = iVar2.f3779q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0275dArr.length) {
                                            iVar2.f3779q0 = (C0275d[]) Arrays.copyOf(c0275dArr, c0275dArr.length * 2);
                                        }
                                        C0275d[] c0275dArr2 = iVar2.f3779q0;
                                        int i23 = iVar2.f3780r0;
                                        c0275dArr2[i23] = h2;
                                        iVar2.f3780r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0302c.d.S();
                        }
                        i19++;
                        arrayList3 = arrayList;
                        obj = null;
                        i13 = 0;
                    }
                }
                for (int i24 = 0; i24 < childCount3; i24++) {
                    constraintLayout.getChildAt(i24);
                }
                SparseArray sparseArray = constraintLayout.f1469n;
                sparseArray.clear();
                sparseArray.put(0, c0276e);
                sparseArray.put(getId(), c0276e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0275d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0304e c0304e2 = (C0304e) childAt3.getLayoutParams();
                        c0276e.f3714q0.add(h3);
                        C0275d c0275d5 = h3.f3659T;
                        if (c0275d5 != null) {
                            ((C0276e) c0275d5).f3714q0.remove(h3);
                            h3.C();
                        }
                        h3.f3659T = c0276e;
                        c0304e2.a();
                        h3.f3678g0 = childAt3.getVisibility();
                        h3.f3676f0 = childAt3;
                        if (childAt3 instanceof AbstractC0302c) {
                            ((AbstractC0302c) childAt3).h(h3, c0276e.f3719v0);
                        }
                        if (c0304e2.f3993d0) {
                            h hVar = (h) h3;
                            int i27 = c0304e2.f4009m0;
                            int i28 = c0304e2.f4011n0;
                            float f4 = c0304e2.f4013o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f3773q0 = f4;
                                    hVar.f3774r0 = -1;
                                    hVar.f3775s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f3773q0 = -1.0f;
                                    hVar.f3774r0 = i27;
                                    hVar.f3775s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f3773q0 = -1.0f;
                                hVar.f3774r0 = -1;
                                hVar.f3775s0 = i28;
                            }
                        } else {
                            int i29 = c0304e2.f3997f0;
                            int i30 = c0304e2.f3999g0;
                            int i31 = c0304e2.f4000h0;
                            int i32 = c0304e2.f4001i0;
                            int i33 = c0304e2.f4003j0;
                            i3 = childCount3;
                            int i34 = c0304e2.f4005k0;
                            float f5 = c0304e2.f4007l0;
                            int i35 = c0304e2.f4014p;
                            if (i35 != -1) {
                                C0275d c0275d6 = (C0275d) sparseArray.get(i35);
                                if (c0275d6 != null) {
                                    float f6 = c0304e2.f4016r;
                                    h3.v(7, 7, c0304e2.f4015q, 0, c0275d6);
                                    h3.f3644D = f6;
                                }
                                c0304e = c0304e2;
                            } else {
                                if (i29 != -1) {
                                    C0275d c0275d7 = (C0275d) sparseArray.get(i29);
                                    if (c0275d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0304e2).leftMargin, i33, c0275d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0275d c0275d8 = (C0275d) sparseArray.get(i30);
                                        if (c0275d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0304e2).leftMargin, i33, c0275d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0275d c0275d9 = (C0275d) sparseArray.get(i31);
                                        if (c0275d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0304e2).rightMargin, i34, c0275d9);
                                        }
                                    } else if (i32 != i4 && (c0275d = (C0275d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0304e2).rightMargin, i34, c0275d);
                                    }
                                    i5 = c0304e2.i;
                                    if (i5 == -1) {
                                        C0275d c0275d10 = (C0275d) sparseArray.get(i5);
                                        if (c0275d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0304e2).topMargin, c0304e2.f4022x, c0275d10);
                                        }
                                    } else {
                                        int i36 = c0304e2.f4002j;
                                        if (i36 != -1 && (c0275d2 = (C0275d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0304e2).topMargin, c0304e2.f4022x, c0275d2);
                                        }
                                    }
                                    i6 = c0304e2.f4004k;
                                    if (i6 == -1) {
                                        C0275d c0275d11 = (C0275d) sparseArray.get(i6);
                                        if (c0275d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0304e2).bottomMargin, c0304e2.f4024z, c0275d11);
                                        }
                                    } else {
                                        int i37 = c0304e2.f4006l;
                                        if (i37 != -1 && (c0275d3 = (C0275d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0304e2).bottomMargin, c0304e2.f4024z, c0275d3);
                                        }
                                    }
                                    i7 = c0304e2.f4008m;
                                    if (i7 == -1) {
                                        c0304e = c0304e2;
                                        l(h3, c0304e2, sparseArray, i7, 6);
                                    } else {
                                        c0304e = c0304e2;
                                        int i38 = c0304e.f4010n;
                                        if (i38 != -1) {
                                            l(h3, c0304e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0304e.f4012o;
                                            if (i39 != -1) {
                                                l(h3, c0304e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3672d0 = f5;
                                    }
                                    f2 = c0304e.f3967F;
                                    if (f2 >= 0.0f) {
                                        h3.f3674e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0304e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0304e2.f4004k;
                                if (i6 == -1) {
                                }
                                i7 = c0304e2.f4008m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0304e.f3967F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0304e.f3980T) != -1 || c0304e.f3981U != -1)) {
                                int i40 = c0304e.f3981U;
                                h3.f3664Y = i11;
                                h3.f3665Z = i40;
                            }
                            if (c0304e.f3988a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0304e).width);
                                if (((ViewGroup.MarginLayoutParams) c0304e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0304e).width == -1) {
                                if (c0304e.f3983W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3640g = ((ViewGroup.MarginLayoutParams) c0304e).leftMargin;
                                h3.i(4).f3640g = ((ViewGroup.MarginLayoutParams) c0304e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0304e.f3990b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0304e).height);
                                if (((ViewGroup.MarginLayoutParams) c0304e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0304e).height == -1) {
                                    if (c0304e.f3984X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3640g = ((ViewGroup.MarginLayoutParams) c0304e).topMargin;
                                    h3.i(5).f3640g = ((ViewGroup.MarginLayoutParams) c0304e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0304e.f3968G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3662W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i9 = i8;
                                    i10 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i9 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i8;
                                    i10 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i10);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i10, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i9 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    h3.f3662W = parseFloat;
                                    h3.f3663X = i9;
                                }
                            }
                            float f7 = c0304e.H;
                            float[] fArr = h3.f3684k0;
                            fArr[0] = f7;
                            fArr[1] = c0304e.f3969I;
                            h3.f3680i0 = c0304e.f3970J;
                            h3.f3682j0 = c0304e.f3971K;
                            int i41 = c0304e.f3986Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3694q = i41;
                            }
                            int i42 = c0304e.f3972L;
                            int i43 = c0304e.f3974N;
                            int i44 = c0304e.f3976P;
                            float f8 = c0304e.f3978R;
                            h3.f3695r = i42;
                            h3.f3698u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3699v = i44;
                            h3.f3700w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3695r = 2;
                            }
                            int i45 = c0304e.f3973M;
                            int i46 = c0304e.f3975O;
                            int i47 = c0304e.f3977Q;
                            float f9 = c0304e.f3979S;
                            h3.f3696s = i45;
                            h3.f3701x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3702y = i47;
                            h3.f3703z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3696s = 2;
                            }
                            i26++;
                            constraintLayout = this;
                            childCount3 = i3;
                        }
                    }
                    i3 = childCount3;
                    i26++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z2) {
                c0276e.f3715r0.y(c0276e);
            }
        }
        k(c0276e, this.i, i, i2);
        int q2 = c0276e.q();
        int k2 = c0276e.k();
        boolean z4 = c0276e.f3707E0;
        boolean z5 = c0276e.f3708F0;
        C0305f c0305f = this.f1470o;
        int i48 = c0305f.f4028e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0305f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1463f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1464g, resolveSizeAndState2);
        if (z4) {
            min |= 16777216;
        }
        if (z5) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0275d h = h(view);
        if ((view instanceof q) && !(h instanceof h)) {
            C0304e c0304e = (C0304e) view.getLayoutParams();
            h hVar = new h();
            c0304e.p0 = hVar;
            c0304e.f3993d0 = true;
            hVar.S(c0304e.f3982V);
        }
        if (view instanceof AbstractC0302c) {
            AbstractC0302c abstractC0302c = (AbstractC0302c) view;
            abstractC0302c.i();
            ((C0304e) view.getLayoutParams()).f3995e0 = true;
            ArrayList arrayList = this.f1460b;
            if (!arrayList.contains(abstractC0302c)) {
                arrayList.add(abstractC0302c);
            }
        }
        this.f1459a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1459a.remove(view.getId());
        C0275d h = h(view);
        this.f1461c.f3714q0.remove(h);
        h.C();
        this.f1460b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.f1465j = oVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1459a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1464g) {
            return;
        }
        this.f1464g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1463f) {
            return;
        }
        this.f1463f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1462e) {
            return;
        }
        this.f1462e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        j jVar = this.f1466k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0276e c0276e = this.f1461c;
        c0276e.f3706D0 = i;
        C0265c.f3578p = c0276e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1459a = new SparseArray();
        this.f1460b = new ArrayList(4);
        this.f1461c = new C0276e();
        this.d = 0;
        this.f1462e = 0;
        this.f1463f = Integer.MAX_VALUE;
        this.f1464g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1465j = null;
        this.f1466k = null;
        this.f1467l = -1;
        this.f1468m = new HashMap();
        this.f1469n = new SparseArray();
        this.f1470o = new C0305f(this, this);
        this.f1471p = 0;
        this.f1472q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0304e c0304e = new C0304e(layoutParams);
        c0304e.f3987a = -1;
        c0304e.f3989b = -1;
        c0304e.f3991c = -1.0f;
        c0304e.d = true;
        c0304e.f3994e = -1;
        c0304e.f3996f = -1;
        c0304e.f3998g = -1;
        c0304e.h = -1;
        c0304e.i = -1;
        c0304e.f4002j = -1;
        c0304e.f4004k = -1;
        c0304e.f4006l = -1;
        c0304e.f4008m = -1;
        c0304e.f4010n = -1;
        c0304e.f4012o = -1;
        c0304e.f4014p = -1;
        c0304e.f4015q = 0;
        c0304e.f4016r = 0.0f;
        c0304e.f4017s = -1;
        c0304e.f4018t = -1;
        c0304e.f4019u = -1;
        c0304e.f4020v = -1;
        c0304e.f4021w = Integer.MIN_VALUE;
        c0304e.f4022x = Integer.MIN_VALUE;
        c0304e.f4023y = Integer.MIN_VALUE;
        c0304e.f4024z = Integer.MIN_VALUE;
        c0304e.f3962A = Integer.MIN_VALUE;
        c0304e.f3963B = Integer.MIN_VALUE;
        c0304e.f3964C = Integer.MIN_VALUE;
        c0304e.f3965D = 0;
        c0304e.f3966E = 0.5f;
        c0304e.f3967F = 0.5f;
        c0304e.f3968G = null;
        c0304e.H = -1.0f;
        c0304e.f3969I = -1.0f;
        c0304e.f3970J = 0;
        c0304e.f3971K = 0;
        c0304e.f3972L = 0;
        c0304e.f3973M = 0;
        c0304e.f3974N = 0;
        c0304e.f3975O = 0;
        c0304e.f3976P = 0;
        c0304e.f3977Q = 0;
        c0304e.f3978R = 1.0f;
        c0304e.f3979S = 1.0f;
        c0304e.f3980T = -1;
        c0304e.f3981U = -1;
        c0304e.f3982V = -1;
        c0304e.f3983W = false;
        c0304e.f3984X = false;
        c0304e.f3985Y = null;
        c0304e.f3986Z = 0;
        c0304e.f3988a0 = true;
        c0304e.f3990b0 = true;
        c0304e.f3992c0 = false;
        c0304e.f3993d0 = false;
        c0304e.f3995e0 = false;
        c0304e.f3997f0 = -1;
        c0304e.f3999g0 = -1;
        c0304e.f4000h0 = -1;
        c0304e.f4001i0 = -1;
        c0304e.f4003j0 = Integer.MIN_VALUE;
        c0304e.f4005k0 = Integer.MIN_VALUE;
        c0304e.f4007l0 = 0.5f;
        c0304e.p0 = new C0275d();
        return c0304e;
    }
}

package androidx.constraintlayout.widget;

import B.j;
import K.C0012m;
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
import com.google.android.material.datepicker.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.C0315c;
import s.C0337a;
import s.C0340d;
import s.C0341e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0358p;
import t.C0345c;
import t.C0347e;
import t.C0351i;
import t.C0353k;
import t.C0355m;
import v.AbstractC0364c;
import v.AbstractC0365d;
import v.C0366e;
import v.C0367f;
import v.C0368g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1393r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1394a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1395b;

    /* renamed from: c, reason: collision with root package name */
    public final C0341e f1396c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1397e;

    /* renamed from: f, reason: collision with root package name */
    public int f1398f;

    /* renamed from: g, reason: collision with root package name */
    public int f1399g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1400j;

    /* renamed from: k, reason: collision with root package name */
    public j f1401k;

    /* renamed from: l, reason: collision with root package name */
    public int f1402l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1403m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1404n;

    /* renamed from: o, reason: collision with root package name */
    public final C0367f f1405o;

    /* renamed from: p, reason: collision with root package name */
    public int f1406p;

    /* renamed from: q, reason: collision with root package name */
    public int f1407q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1394a = new SparseArray();
        this.f1395b = new ArrayList(4);
        this.f1396c = new C0341e();
        this.d = 0;
        this.f1397e = 0;
        this.f1398f = Integer.MAX_VALUE;
        this.f1399g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1400j = null;
        this.f1401k = null;
        this.f1402l = -1;
        this.f1403m = new HashMap();
        this.f1404n = new SparseArray();
        this.f1405o = new C0367f(this, this);
        this.f1406p = 0;
        this.f1407q = 0;
        i(attributeSet, 0);
    }

    public static C0366e g() {
        C0366e c0366e = new C0366e(-2, -2);
        c0366e.f3822a = -1;
        c0366e.f3824b = -1;
        c0366e.f3826c = -1.0f;
        c0366e.d = true;
        c0366e.f3829e = -1;
        c0366e.f3831f = -1;
        c0366e.f3833g = -1;
        c0366e.h = -1;
        c0366e.i = -1;
        c0366e.f3837j = -1;
        c0366e.f3839k = -1;
        c0366e.f3841l = -1;
        c0366e.f3843m = -1;
        c0366e.f3844n = -1;
        c0366e.f3846o = -1;
        c0366e.f3848p = -1;
        c0366e.f3850q = 0;
        c0366e.f3851r = 0.0f;
        c0366e.f3852s = -1;
        c0366e.f3853t = -1;
        c0366e.f3854u = -1;
        c0366e.f3855v = -1;
        c0366e.f3856w = Integer.MIN_VALUE;
        c0366e.f3857x = Integer.MIN_VALUE;
        c0366e.f3858y = Integer.MIN_VALUE;
        c0366e.f3859z = Integer.MIN_VALUE;
        c0366e.f3797A = Integer.MIN_VALUE;
        c0366e.f3798B = Integer.MIN_VALUE;
        c0366e.f3799C = Integer.MIN_VALUE;
        c0366e.f3800D = 0;
        c0366e.f3801E = 0.5f;
        c0366e.F = 0.5f;
        c0366e.f3802G = null;
        c0366e.f3803H = -1.0f;
        c0366e.f3804I = -1.0f;
        c0366e.f3805J = 0;
        c0366e.f3806K = 0;
        c0366e.f3807L = 0;
        c0366e.f3808M = 0;
        c0366e.f3809N = 0;
        c0366e.f3810O = 0;
        c0366e.f3811P = 0;
        c0366e.f3812Q = 0;
        c0366e.f3813R = 1.0f;
        c0366e.f3814S = 1.0f;
        c0366e.f3815T = -1;
        c0366e.f3816U = -1;
        c0366e.f3817V = -1;
        c0366e.f3818W = false;
        c0366e.f3819X = false;
        c0366e.f3820Y = null;
        c0366e.f3821Z = 0;
        c0366e.f3823a0 = true;
        c0366e.f3825b0 = true;
        c0366e.f3827c0 = false;
        c0366e.f3828d0 = false;
        c0366e.f3830e0 = false;
        c0366e.f3832f0 = -1;
        c0366e.f3834g0 = -1;
        c0366e.f3835h0 = -1;
        c0366e.f3836i0 = -1;
        c0366e.f3838j0 = Integer.MIN_VALUE;
        c0366e.f3840k0 = Integer.MIN_VALUE;
        c0366e.f3842l0 = 0.5f;
        c0366e.f3849p0 = new C0340d();
        return c0366e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1393r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1393r = sVar;
        }
        return f1393r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0366e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1395b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0364c) arrayList.get(i)).getClass();
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
        C0366e c0366e = new C0366e(context, attributeSet);
        c0366e.f3822a = -1;
        c0366e.f3824b = -1;
        c0366e.f3826c = -1.0f;
        c0366e.d = true;
        c0366e.f3829e = -1;
        c0366e.f3831f = -1;
        c0366e.f3833g = -1;
        c0366e.h = -1;
        c0366e.i = -1;
        c0366e.f3837j = -1;
        c0366e.f3839k = -1;
        c0366e.f3841l = -1;
        c0366e.f3843m = -1;
        c0366e.f3844n = -1;
        c0366e.f3846o = -1;
        c0366e.f3848p = -1;
        c0366e.f3850q = 0;
        c0366e.f3851r = 0.0f;
        c0366e.f3852s = -1;
        c0366e.f3853t = -1;
        c0366e.f3854u = -1;
        c0366e.f3855v = -1;
        c0366e.f3856w = Integer.MIN_VALUE;
        c0366e.f3857x = Integer.MIN_VALUE;
        c0366e.f3858y = Integer.MIN_VALUE;
        c0366e.f3859z = Integer.MIN_VALUE;
        c0366e.f3797A = Integer.MIN_VALUE;
        c0366e.f3798B = Integer.MIN_VALUE;
        c0366e.f3799C = Integer.MIN_VALUE;
        c0366e.f3800D = 0;
        c0366e.f3801E = 0.5f;
        c0366e.F = 0.5f;
        c0366e.f3802G = null;
        c0366e.f3803H = -1.0f;
        c0366e.f3804I = -1.0f;
        c0366e.f3805J = 0;
        c0366e.f3806K = 0;
        c0366e.f3807L = 0;
        c0366e.f3808M = 0;
        c0366e.f3809N = 0;
        c0366e.f3810O = 0;
        c0366e.f3811P = 0;
        c0366e.f3812Q = 0;
        c0366e.f3813R = 1.0f;
        c0366e.f3814S = 1.0f;
        c0366e.f3815T = -1;
        c0366e.f3816U = -1;
        c0366e.f3817V = -1;
        c0366e.f3818W = false;
        c0366e.f3819X = false;
        c0366e.f3820Y = null;
        c0366e.f3821Z = 0;
        c0366e.f3823a0 = true;
        c0366e.f3825b0 = true;
        c0366e.f3827c0 = false;
        c0366e.f3828d0 = false;
        c0366e.f3830e0 = false;
        c0366e.f3832f0 = -1;
        c0366e.f3834g0 = -1;
        c0366e.f3835h0 = -1;
        c0366e.f3836i0 = -1;
        c0366e.f3838j0 = Integer.MIN_VALUE;
        c0366e.f3840k0 = Integer.MIN_VALUE;
        c0366e.f3842l0 = 0.5f;
        c0366e.f3849p0 = new C0340d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3975b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0365d.f3796a.get(index);
            switch (i2) {
                case 1:
                    c0366e.f3817V = obtainStyledAttributes.getInt(index, c0366e.f3817V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0366e.f3848p);
                    c0366e.f3848p = resourceId;
                    if (resourceId == -1) {
                        c0366e.f3848p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0366e.f3850q = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3850q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0366e.f3851r) % 360.0f;
                    c0366e.f3851r = f2;
                    if (f2 < 0.0f) {
                        c0366e.f3851r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0366e.f3822a = obtainStyledAttributes.getDimensionPixelOffset(index, c0366e.f3822a);
                    break;
                case 6:
                    c0366e.f3824b = obtainStyledAttributes.getDimensionPixelOffset(index, c0366e.f3824b);
                    break;
                case 7:
                    c0366e.f3826c = obtainStyledAttributes.getFloat(index, c0366e.f3826c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0366e.f3829e);
                    c0366e.f3829e = resourceId2;
                    if (resourceId2 == -1) {
                        c0366e.f3829e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0366e.f3831f);
                    c0366e.f3831f = resourceId3;
                    if (resourceId3 == -1) {
                        c0366e.f3831f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0366e.f3833g);
                    c0366e.f3833g = resourceId4;
                    if (resourceId4 == -1) {
                        c0366e.f3833g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0366e.h);
                    c0366e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0366e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0366e.i);
                    c0366e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0366e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0366e.f3837j);
                    c0366e.f3837j = resourceId7;
                    if (resourceId7 == -1) {
                        c0366e.f3837j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0366e.f3839k);
                    c0366e.f3839k = resourceId8;
                    if (resourceId8 == -1) {
                        c0366e.f3839k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0366e.f3841l);
                    c0366e.f3841l = resourceId9;
                    if (resourceId9 == -1) {
                        c0366e.f3841l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0366e.f3843m);
                    c0366e.f3843m = resourceId10;
                    if (resourceId10 == -1) {
                        c0366e.f3843m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0366e.f3852s);
                    c0366e.f3852s = resourceId11;
                    if (resourceId11 == -1) {
                        c0366e.f3852s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0366e.f3853t);
                    c0366e.f3853t = resourceId12;
                    if (resourceId12 == -1) {
                        c0366e.f3853t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0366e.f3854u);
                    c0366e.f3854u = resourceId13;
                    if (resourceId13 == -1) {
                        c0366e.f3854u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0366e.f3855v);
                    c0366e.f3855v = resourceId14;
                    if (resourceId14 == -1) {
                        c0366e.f3855v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0366e.f3856w = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3856w);
                    break;
                case 22:
                    c0366e.f3857x = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3857x);
                    break;
                case 23:
                    c0366e.f3858y = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3858y);
                    break;
                case 24:
                    c0366e.f3859z = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3859z);
                    break;
                case 25:
                    c0366e.f3797A = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3797A);
                    break;
                case 26:
                    c0366e.f3798B = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3798B);
                    break;
                case 27:
                    c0366e.f3818W = obtainStyledAttributes.getBoolean(index, c0366e.f3818W);
                    break;
                case 28:
                    c0366e.f3819X = obtainStyledAttributes.getBoolean(index, c0366e.f3819X);
                    break;
                case 29:
                    c0366e.f3801E = obtainStyledAttributes.getFloat(index, c0366e.f3801E);
                    break;
                case 30:
                    c0366e.F = obtainStyledAttributes.getFloat(index, c0366e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0366e.f3807L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0366e.f3808M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0366e.f3809N = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3809N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0366e.f3809N) == -2) {
                            c0366e.f3809N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0366e.f3811P = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3811P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0366e.f3811P) == -2) {
                            c0366e.f3811P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0366e.f3813R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0366e.f3813R));
                    c0366e.f3807L = 2;
                    break;
                case 36:
                    try {
                        c0366e.f3810O = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3810O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0366e.f3810O) == -2) {
                            c0366e.f3810O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0366e.f3812Q = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3812Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0366e.f3812Q) == -2) {
                            c0366e.f3812Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0366e.f3814S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0366e.f3814S));
                    c0366e.f3808M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0366e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0366e.f3803H = obtainStyledAttributes.getFloat(index, c0366e.f3803H);
                            break;
                        case 46:
                            c0366e.f3804I = obtainStyledAttributes.getFloat(index, c0366e.f3804I);
                            break;
                        case 47:
                            c0366e.f3805J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0366e.f3806K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0366e.f3815T = obtainStyledAttributes.getDimensionPixelOffset(index, c0366e.f3815T);
                            break;
                        case 50:
                            c0366e.f3816U = obtainStyledAttributes.getDimensionPixelOffset(index, c0366e.f3816U);
                            break;
                        case 51:
                            c0366e.f3820Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0366e.f3844n);
                            c0366e.f3844n = resourceId15;
                            if (resourceId15 == -1) {
                                c0366e.f3844n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0366e.f3846o);
                            c0366e.f3846o = resourceId16;
                            if (resourceId16 == -1) {
                                c0366e.f3846o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0366e.f3800D = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3800D);
                            break;
                        case 55:
                            c0366e.f3799C = obtainStyledAttributes.getDimensionPixelSize(index, c0366e.f3799C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0366e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0366e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0366e.f3821Z = obtainStyledAttributes.getInt(index, c0366e.f3821Z);
                                    break;
                                case 67:
                                    c0366e.d = obtainStyledAttributes.getBoolean(index, c0366e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0366e.a();
        return c0366e;
    }

    public int getMaxHeight() {
        return this.f1399g;
    }

    public int getMaxWidth() {
        return this.f1398f;
    }

    public int getMinHeight() {
        return this.f1397e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1396c.f3563D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0341e c0341e = this.f1396c;
        if (c0341e.f3537j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0341e.f3537j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0341e.f3537j = "parent";
            }
        }
        if (c0341e.f3535h0 == null) {
            c0341e.f3535h0 = c0341e.f3537j;
            Log.v("ConstraintLayout", " setDebugName " + c0341e.f3535h0);
        }
        Iterator it = c0341e.q0.iterator();
        while (it.hasNext()) {
            C0340d c0340d = (C0340d) it.next();
            View view = c0340d.f3532f0;
            if (view != null) {
                if (c0340d.f3537j == null && (id = view.getId()) != -1) {
                    c0340d.f3537j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0340d.f3535h0 == null) {
                    c0340d.f3535h0 = c0340d.f3537j;
                    Log.v("ConstraintLayout", " setDebugName " + c0340d.f3535h0);
                }
            }
        }
        c0341e.n(sb);
        return sb.toString();
    }

    public final C0340d h(View view) {
        if (view == this) {
            return this.f1396c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0366e) {
            return ((C0366e) view.getLayoutParams()).f3849p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0366e) {
            return ((C0366e) view.getLayoutParams()).f3849p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0341e c0341e = this.f1396c;
        c0341e.f3532f0 = this;
        C0367f c0367f = this.f1405o;
        c0341e.f3573u0 = c0367f;
        c0341e.f3571s0.f3688f = c0367f;
        this.f1394a.put(getId(), this);
        this.f1400j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3975b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1397e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1397e);
                } else if (index == 14) {
                    this.f1398f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1398f);
                } else if (index == 15) {
                    this.f1399g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1399g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1401k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1400j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1400j = null;
                    }
                    this.f1402l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0341e.f3563D0 = this.i;
        C0315c.f3410p = c0341e.W(512);
    }

    public final void j(int i) {
        int eventType;
        l lVar;
        Context context = getContext();
        j jVar = new j(17, false);
        jVar.f56b = new SparseArray();
        jVar.f57c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            lVar = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1401k = jVar;
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
                    lVar = new l(context, xml);
                    ((SparseArray) jVar.f56b).put(lVar.f1879b, lVar);
                } else if (c2 == 3) {
                    C0368g c0368g = new C0368g(context, xml);
                    if (lVar != null) {
                        ((ArrayList) lVar.f1878a).add(c0368g);
                    }
                } else if (c2 == 4) {
                    jVar.F(context, xml);
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
    public final void k(C0341e c0341e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0367f c0367f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0367f c0367f2;
        int i12;
        C0367f c0367f3;
        boolean z4;
        C0353k c0353k;
        C0355m c0355m;
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
        C0341e c0341e2 = c0341e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0367f c0367f4 = this.f1405o;
        c0367f4.f3861b = max3;
        c0367f4.f3862c = max4;
        c0367f4.d = paddingWidth;
        c0367f4.f3863e = i19;
        c0367f4.f3864f = i2;
        c0367f4.f3865g = i3;
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
        int i23 = c0367f4.f3863e;
        int i24 = c0367f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1398f - i24, i21);
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
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1399g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1397e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1397e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0341e.q();
        C0347e c0347e = c0341e2.f3571s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0341e.k()) {
            c0347e.f3686c = true;
        }
        c0341e2.f3520Y = 0;
        c0341e2.f3521Z = 0;
        int i26 = this.f1398f - i24;
        int[] iArr = c0341e2.f3499C;
        iArr[0] = i26;
        iArr[1] = this.f1399g - i23;
        c0341e2.f3525b0 = 0;
        c0341e2.f3527c0 = 0;
        c0341e2.M(i20);
        c0341e2.O(i25);
        c0341e2.N(i6);
        c0341e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0341e2.f3525b0 = 0;
        } else {
            c0341e2.f3525b0 = i27;
        }
        int i28 = this.f1397e - i23;
        if (i28 < 0) {
            c0341e2.f3527c0 = 0;
        } else {
            c0341e2.f3527c0 = i28;
        }
        c0341e2.f3576x0 = max5;
        c0341e2.f3577y0 = max3;
        C0012m c0012m = c0341e2.f3570r0;
        c0012m.getClass();
        C0367f c0367f5 = c0341e2.f3573u0;
        int size3 = c0341e2.q0.size();
        int q3 = c0341e.q();
        int k2 = c0341e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0340d c0340d = (C0340d) c0341e2.q0.get(i29);
                int[] iArr2 = c0340d.f3549p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0340d.f3518W > 0.0f;
                if ((c0340d.x() && z8) || ((c0340d.y() && z8) || (c0340d instanceof g) || c0340d.x() || c0340d.y())) {
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
            if (mode == 1073741824 && c0341e.q() != min) {
                c0341e2.O(min);
                c0341e2.f3571s0.f3685b = true;
            }
            if (mode2 == 1073741824 && c0341e.k() != min2) {
                c0341e2.L(min2);
                c0341e2.f3571s0.f3685b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0347e.f3685b;
                C0341e c0341e3 = c0347e.f3684a;
                if (z10 || c0347e.f3686c) {
                    Iterator it3 = c0341e3.q0.iterator();
                    while (it3.hasNext()) {
                        C0340d c0340d2 = (C0340d) it3.next();
                        c0340d2.h();
                        c0340d2.f3522a = false;
                        c0340d2.d.n();
                        c0340d2.f3529e.m();
                    }
                    i15 = 0;
                    c0341e3.h();
                    c0341e3.f3522a = false;
                    c0341e3.d.n();
                    c0341e3.f3529e.m();
                    c0347e.f3686c = false;
                } else {
                    i15 = 0;
                }
                c0347e.b(c0347e.d);
                c0341e3.f3520Y = i15;
                c0341e3.f3521Z = i15;
                int j2 = c0341e3.j(i15);
                int j3 = c0341e3.j(1);
                if (c0347e.f3685b) {
                    c0347e.c();
                }
                int r2 = c0341e3.r();
                int s2 = c0341e3.s();
                z2 = z9;
                c0341e3.d.h.d(r2);
                c0341e3.f3529e.h.d(s2);
                c0347e.g();
                ArrayList arrayList2 = c0347e.f3687e;
                c0367f = c0367f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0358p) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0341e3.M(1);
                        i8 = q3;
                        c0341e3.O(c0347e.d(c0341e3, 0));
                        c0341e3.d.f3714e.d(c0341e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0341e3.N(1);
                        c0341e3.L(c0347e.d(c0341e3, 1));
                        c0341e3.f3529e.f3714e.d(c0341e3.k());
                        int[] iArr3 = c0341e3.f3549p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0341e3.q() + r2;
                            c0341e3.d.i.d(q4);
                            c0341e3.d.f3714e.d(q4 - r2);
                            c0347e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0341e3.k() + s2;
                                c0341e3.f3529e.i.d(k3);
                                c0341e3.f3529e.f3714e.d(k3 - s2);
                            }
                            c0347e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0358p abstractC0358p = (AbstractC0358p) it.next();
                            if (abstractC0358p.f3712b != c0341e3 || abstractC0358p.f3716g) {
                                abstractC0358p.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0358p abstractC0358p2 = (AbstractC0358p) it2.next();
                            if (z5 || abstractC0358p2.f3712b != c0341e3) {
                                if (!abstractC0358p2.h.f3696j || ((!abstractC0358p2.i.f3696j && !(abstractC0358p2 instanceof C0351i)) || (!abstractC0358p2.f3714e.f3696j && !(abstractC0358p2 instanceof C0345c) && !(abstractC0358p2 instanceof C0351i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0341e3.M(j2);
                        c0341e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0341e3.f3549p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0341e3.q() + r2;
                c0341e3.d.i.d(q42);
                c0341e3.d.f3714e.d(q42 - r2);
                c0347e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0341e3.k() + s2;
                c0341e3.f3529e.i.d(k32);
                c0341e3.f3529e.f3714e.d(k32 - s2);
                c0347e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0341e3.M(j2);
                c0341e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0367f = c0367f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0347e.f3685b;
                C0341e c0341e4 = c0347e.f3684a;
                if (z11) {
                    Iterator it5 = c0341e4.q0.iterator();
                    while (it5.hasNext()) {
                        C0340d c0340d3 = (C0340d) it5.next();
                        c0340d3.h();
                        c0340d3.f3522a = false;
                        C0353k c0353k2 = c0340d3.d;
                        c0353k2.f3714e.f3696j = false;
                        c0353k2.f3716g = false;
                        c0353k2.n();
                        C0355m c0355m2 = c0340d3.f3529e;
                        c0355m2.f3714e.f3696j = false;
                        c0355m2.f3716g = false;
                        c0355m2.m();
                    }
                    i13 = 0;
                    c0341e4.h();
                    c0341e4.f3522a = false;
                    C0353k c0353k3 = c0341e4.d;
                    c0353k3.f3714e.f3696j = false;
                    c0353k3.f3716g = false;
                    c0353k3.n();
                    C0355m c0355m3 = c0341e4.f3529e;
                    c0355m3.f3714e.f3696j = false;
                    c0355m3.f3716g = false;
                    c0355m3.m();
                    c0347e.c();
                } else {
                    i13 = 0;
                }
                c0347e.b(c0347e.d);
                c0341e4.f3520Y = i13;
                c0341e4.f3521Z = i13;
                c0341e4.d.h.d(i13);
                c0341e4.f3529e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0341e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0341e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0341e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0367f = c0367f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0341e2.f3563D0;
        if (size3 > 0) {
            int size4 = c0341e2.q0.size();
            boolean W2 = c0341e2.W(64);
            C0367f c0367f6 = c0341e2.f3573u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0340d c0340d4 = (C0340d) c0341e2.q0.get(i31);
                if (!(c0340d4 instanceof h) && !(c0340d4 instanceof C0337a) && !c0340d4.F && (!W2 || (c0353k = c0340d4.d) == null || (c0355m = c0340d4.f3529e) == null || !c0353k.f3714e.f3696j || !c0355m.f3714e.f3696j)) {
                    int j4 = c0340d4.j(0);
                    int j5 = c0340d4.j(1);
                    boolean z12 = j4 == 3 && c0340d4.f3551r != 1 && j5 == 3 && c0340d4.f3552s != 1;
                    if (!z12 && c0341e2.W(1) && !(c0340d4 instanceof g)) {
                        if (j4 == 3 && c0340d4.f3551r == 0 && j5 != 3 && !c0340d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0340d4.f3552s == 0 && j4 != 3 && !c0340d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0340d4.f3518W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0012m.q(0, c0340d4, c0367f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0367f6.f3860a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1395b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0364c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0012m.w(c0341e2);
        ArrayList arrayList4 = (ArrayList) c0012m.f422b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0012m.u(c0341e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0341e2.f3549p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0341e.q();
            C0341e c0341e5 = (C0341e) c0012m.d;
            int max7 = Math.max(q5, c0341e5.f3525b0);
            int max8 = Math.max(c0341e.k(), c0341e5.f3527c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0340d c0340d5 = (C0340d) arrayList4.get(i36);
                if (c0340d5 instanceof g) {
                    int q6 = c0340d5.q();
                    int k4 = c0340d5.k();
                    i12 = i30;
                    c0367f3 = c0367f;
                    boolean q7 = z15 | c0012m.q(1, c0340d5, c0367f3);
                    int q8 = c0340d5.q();
                    int k5 = c0340d5.k();
                    if (q8 != q6) {
                        c0340d5.O(q8);
                        if (z13 && c0340d5.r() + c0340d5.f3516U > max7) {
                            max7 = Math.max(max7, c0340d5.i(4).e() + c0340d5.r() + c0340d5.f3516U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0340d5.L(k5);
                        if (z14 && c0340d5.s() + c0340d5.f3517V > max8) {
                            max8 = Math.max(max8, c0340d5.i(5).e() + c0340d5.s() + c0340d5.f3517V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0340d5).f3626y0 | z4;
                } else {
                    i12 = i30;
                    c0367f3 = c0367f;
                }
                i36++;
                c0367f = c0367f3;
                i30 = i12;
            }
            int i37 = i30;
            C0367f c0367f7 = c0367f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0340d c0340d6 = (C0340d) arrayList4.get(i39);
                    if (((c0340d6 instanceof i) && !(c0340d6 instanceof g)) || (c0340d6 instanceof h) || c0340d6.f3534g0 == 8 || ((z2 && c0340d6.d.f3714e.f3696j && c0340d6.f3529e.f3714e.f3696j) || (c0340d6 instanceof g))) {
                        c0367f2 = c0367f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0340d6.q();
                        int k6 = c0340d6.k();
                        arrayList = arrayList4;
                        int i40 = c0340d6.f3523a0;
                        i11 = size6;
                        boolean q10 = c0012m.q(i38 == 1 ? 2 : 1, c0340d6, c0367f7) | z15;
                        int q11 = c0340d6.q();
                        c0367f2 = c0367f7;
                        int k7 = c0340d6.k();
                        if (q11 != q9) {
                            c0340d6.O(q11);
                            if (z13 && c0340d6.r() + c0340d6.f3516U > max7) {
                                max7 = Math.max(max7, c0340d6.i(4).e() + c0340d6.r() + c0340d6.f3516U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0340d6.L(k7);
                            if (z14 && c0340d6.s() + c0340d6.f3517V > max8) {
                                max8 = Math.max(max8, c0340d6.i(5).e() + c0340d6.s() + c0340d6.f3517V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0340d6.f3501E || i40 == c0340d6.f3523a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0367f7 = c0367f2;
                }
                C0367f c0367f8 = c0367f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0012m.u(c0341e, i38, i34, i35);
                c0367f7 = c0367f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0341e2 = c0341e;
            i30 = i37;
        }
        c0341e2.f3563D0 = i30;
        C0315c.f3410p = c0341e2.W(512);
    }

    public final void l(C0340d c0340d, C0366e c0366e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1394a.get(i);
        C0340d c0340d2 = (C0340d) sparseArray.get(i);
        if (c0340d2 == null || view == null || !(view.getLayoutParams() instanceof C0366e)) {
            return;
        }
        c0366e.f3827c0 = true;
        if (i2 == 6) {
            C0366e c0366e2 = (C0366e) view.getLayoutParams();
            c0366e2.f3827c0 = true;
            c0366e2.f3849p0.f3501E = true;
        }
        c0340d.i(6).b(c0340d2.i(i2), c0366e.f3800D, c0366e.f3799C, true);
        c0340d.f3501E = true;
        c0340d.i(3).j();
        c0340d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0366e c0366e = (C0366e) childAt.getLayoutParams();
            C0340d c0340d = c0366e.f3849p0;
            if (childAt.getVisibility() != 8 || c0366e.f3828d0 || c0366e.f3830e0 || isInEditMode) {
                int r2 = c0340d.r();
                int s2 = c0340d.s();
                childAt.layout(r2, s2, c0340d.q() + r2, c0340d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1395b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0364c) arrayList.get(i6)).getClass();
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
        C0340d c0340d;
        int i5;
        C0340d c0340d2;
        int i6;
        C0340d c0340d3;
        int i7;
        C0366e c0366e;
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
        C0340d c0340d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1406p == i) {
            int i12 = constraintLayout.f1407q;
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
        constraintLayout.f1406p = i;
        constraintLayout.f1407q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0341e c0341e = constraintLayout.f1396c;
        c0341e.f3574v0 = z3;
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
                    C0340d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1403m == null) {
                                    constraintLayout.f1403m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1403m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1394a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0340d4 = view == null ? null : ((C0366e) view.getLayoutParams()).f3849p0;
                                c0340d4.f3535h0 = resourceName;
                            }
                        }
                        c0340d4 = c0341e;
                        c0340d4.f3535h0 = resourceName;
                    }
                }
                if (constraintLayout.f1402l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1400j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0341e.q0.clear();
                ArrayList arrayList3 = constraintLayout.f1395b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0364c abstractC0364c = (AbstractC0364c) arrayList3.get(i19);
                        if (abstractC0364c.isInEditMode()) {
                            abstractC0364c.setIds(abstractC0364c.f3793e);
                        }
                        i iVar = abstractC0364c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3633r0 = i13;
                            Arrays.fill(iVar.q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0364c.f3791b) {
                                int i21 = abstractC0364c.f3790a[i20];
                                View view2 = (View) constraintLayout.f1394a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0364c.f3795g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0364c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0364c.f3790a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1394a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0364c.d;
                                    C0340d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3633r0 + 1;
                                        C0340d[] c0340dArr = iVar2.q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0340dArr.length) {
                                            iVar2.q0 = (C0340d[]) Arrays.copyOf(c0340dArr, c0340dArr.length * 2);
                                        }
                                        C0340d[] c0340dArr2 = iVar2.q0;
                                        int i23 = iVar2.f3633r0;
                                        c0340dArr2[i23] = h2;
                                        iVar2.f3633r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0364c.d.S();
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
                SparseArray sparseArray = constraintLayout.f1404n;
                sparseArray.clear();
                sparseArray.put(0, c0341e);
                sparseArray.put(getId(), c0341e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0340d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0366e c0366e2 = (C0366e) childAt3.getLayoutParams();
                        c0341e.q0.add(h3);
                        C0340d c0340d5 = h3.f3515T;
                        if (c0340d5 != null) {
                            ((C0341e) c0340d5).q0.remove(h3);
                            h3.C();
                        }
                        h3.f3515T = c0341e;
                        c0366e2.a();
                        h3.f3534g0 = childAt3.getVisibility();
                        h3.f3532f0 = childAt3;
                        if (childAt3 instanceof AbstractC0364c) {
                            ((AbstractC0364c) childAt3).h(h3, c0341e.f3574v0);
                        }
                        if (c0366e2.f3828d0) {
                            h hVar = (h) h3;
                            int i27 = c0366e2.m0;
                            int i28 = c0366e2.f3845n0;
                            float f4 = c0366e2.f3847o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.q0 = f4;
                                    hVar.f3628r0 = -1;
                                    hVar.f3629s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.q0 = -1.0f;
                                    hVar.f3628r0 = i27;
                                    hVar.f3629s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.q0 = -1.0f;
                                hVar.f3628r0 = -1;
                                hVar.f3629s0 = i28;
                            }
                        } else {
                            int i29 = c0366e2.f3832f0;
                            int i30 = c0366e2.f3834g0;
                            int i31 = c0366e2.f3835h0;
                            int i32 = c0366e2.f3836i0;
                            int i33 = c0366e2.f3838j0;
                            i3 = childCount3;
                            int i34 = c0366e2.f3840k0;
                            float f5 = c0366e2.f3842l0;
                            int i35 = c0366e2.f3848p;
                            if (i35 != -1) {
                                C0340d c0340d6 = (C0340d) sparseArray.get(i35);
                                if (c0340d6 != null) {
                                    float f6 = c0366e2.f3851r;
                                    h3.v(7, 7, c0366e2.f3850q, 0, c0340d6);
                                    h3.f3500D = f6;
                                }
                                c0366e = c0366e2;
                            } else {
                                if (i29 != -1) {
                                    C0340d c0340d7 = (C0340d) sparseArray.get(i29);
                                    if (c0340d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0366e2).leftMargin, i33, c0340d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0340d c0340d8 = (C0340d) sparseArray.get(i30);
                                        if (c0340d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0366e2).leftMargin, i33, c0340d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0340d c0340d9 = (C0340d) sparseArray.get(i31);
                                        if (c0340d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0366e2).rightMargin, i34, c0340d9);
                                        }
                                    } else if (i32 != i4 && (c0340d = (C0340d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0366e2).rightMargin, i34, c0340d);
                                    }
                                    i5 = c0366e2.i;
                                    if (i5 == -1) {
                                        C0340d c0340d10 = (C0340d) sparseArray.get(i5);
                                        if (c0340d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0366e2).topMargin, c0366e2.f3857x, c0340d10);
                                        }
                                    } else {
                                        int i36 = c0366e2.f3837j;
                                        if (i36 != -1 && (c0340d2 = (C0340d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0366e2).topMargin, c0366e2.f3857x, c0340d2);
                                        }
                                    }
                                    i6 = c0366e2.f3839k;
                                    if (i6 == -1) {
                                        C0340d c0340d11 = (C0340d) sparseArray.get(i6);
                                        if (c0340d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0366e2).bottomMargin, c0366e2.f3859z, c0340d11);
                                        }
                                    } else {
                                        int i37 = c0366e2.f3841l;
                                        if (i37 != -1 && (c0340d3 = (C0340d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0366e2).bottomMargin, c0366e2.f3859z, c0340d3);
                                        }
                                    }
                                    i7 = c0366e2.f3843m;
                                    if (i7 == -1) {
                                        c0366e = c0366e2;
                                        l(h3, c0366e2, sparseArray, i7, 6);
                                    } else {
                                        c0366e = c0366e2;
                                        int i38 = c0366e.f3844n;
                                        if (i38 != -1) {
                                            l(h3, c0366e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0366e.f3846o;
                                            if (i39 != -1) {
                                                l(h3, c0366e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3528d0 = f5;
                                    }
                                    f2 = c0366e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f3530e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0366e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0366e2.f3839k;
                                if (i6 == -1) {
                                }
                                i7 = c0366e2.f3843m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0366e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0366e.f3815T) != -1 || c0366e.f3816U != -1)) {
                                int i40 = c0366e.f3816U;
                                h3.f3520Y = i11;
                                h3.f3521Z = i40;
                            }
                            if (c0366e.f3823a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0366e).width);
                                if (((ViewGroup.MarginLayoutParams) c0366e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0366e).width == -1) {
                                if (c0366e.f3818W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3496g = ((ViewGroup.MarginLayoutParams) c0366e).leftMargin;
                                h3.i(4).f3496g = ((ViewGroup.MarginLayoutParams) c0366e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0366e.f3825b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0366e).height);
                                if (((ViewGroup.MarginLayoutParams) c0366e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0366e).height == -1) {
                                    if (c0366e.f3819X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3496g = ((ViewGroup.MarginLayoutParams) c0366e).topMargin;
                                    h3.i(5).f3496g = ((ViewGroup.MarginLayoutParams) c0366e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0366e.f3802G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3518W = 0.0f;
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
                                    h3.f3518W = parseFloat;
                                    h3.f3519X = i9;
                                }
                            }
                            float f7 = c0366e.f3803H;
                            float[] fArr = h3.f3540k0;
                            fArr[0] = f7;
                            fArr[1] = c0366e.f3804I;
                            h3.f3536i0 = c0366e.f3805J;
                            h3.f3538j0 = c0366e.f3806K;
                            int i41 = c0366e.f3821Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3550q = i41;
                            }
                            int i42 = c0366e.f3807L;
                            int i43 = c0366e.f3809N;
                            int i44 = c0366e.f3811P;
                            float f8 = c0366e.f3813R;
                            h3.f3551r = i42;
                            h3.f3554u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3555v = i44;
                            h3.f3556w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3551r = 2;
                            }
                            int i45 = c0366e.f3808M;
                            int i46 = c0366e.f3810O;
                            int i47 = c0366e.f3812Q;
                            float f9 = c0366e.f3814S;
                            h3.f3552s = i45;
                            h3.f3557x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3558y = i47;
                            h3.f3559z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3552s = 2;
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
                c0341e.f3570r0.w(c0341e);
            }
        }
        k(c0341e, this.i, i, i2);
        int q2 = c0341e.q();
        int k2 = c0341e.k();
        boolean z4 = c0341e.E0;
        boolean z5 = c0341e.f3564F0;
        C0367f c0367f = this.f1405o;
        int i48 = c0367f.f3863e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0367f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1398f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1399g, resolveSizeAndState2);
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
        C0340d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0366e c0366e = (C0366e) view.getLayoutParams();
            h hVar = new h();
            c0366e.f3849p0 = hVar;
            c0366e.f3828d0 = true;
            hVar.S(c0366e.f3817V);
        }
        if (view instanceof AbstractC0364c) {
            AbstractC0364c abstractC0364c = (AbstractC0364c) view;
            abstractC0364c.i();
            ((C0366e) view.getLayoutParams()).f3830e0 = true;
            ArrayList arrayList = this.f1395b;
            if (!arrayList.contains(abstractC0364c)) {
                arrayList.add(abstractC0364c);
            }
        }
        this.f1394a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1394a.remove(view.getId());
        C0340d h = h(view);
        this.f1396c.q0.remove(h);
        h.C();
        this.f1395b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1400j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1394a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1399g) {
            return;
        }
        this.f1399g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1398f) {
            return;
        }
        this.f1398f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1397e) {
            return;
        }
        this.f1397e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1401k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0341e c0341e = this.f1396c;
        c0341e.f3563D0 = i;
        C0315c.f3410p = c0341e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1394a = new SparseArray();
        this.f1395b = new ArrayList(4);
        this.f1396c = new C0341e();
        this.d = 0;
        this.f1397e = 0;
        this.f1398f = Integer.MAX_VALUE;
        this.f1399g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1400j = null;
        this.f1401k = null;
        this.f1402l = -1;
        this.f1403m = new HashMap();
        this.f1404n = new SparseArray();
        this.f1405o = new C0367f(this, this);
        this.f1406p = 0;
        this.f1407q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0366e c0366e = new C0366e(layoutParams);
        c0366e.f3822a = -1;
        c0366e.f3824b = -1;
        c0366e.f3826c = -1.0f;
        c0366e.d = true;
        c0366e.f3829e = -1;
        c0366e.f3831f = -1;
        c0366e.f3833g = -1;
        c0366e.h = -1;
        c0366e.i = -1;
        c0366e.f3837j = -1;
        c0366e.f3839k = -1;
        c0366e.f3841l = -1;
        c0366e.f3843m = -1;
        c0366e.f3844n = -1;
        c0366e.f3846o = -1;
        c0366e.f3848p = -1;
        c0366e.f3850q = 0;
        c0366e.f3851r = 0.0f;
        c0366e.f3852s = -1;
        c0366e.f3853t = -1;
        c0366e.f3854u = -1;
        c0366e.f3855v = -1;
        c0366e.f3856w = Integer.MIN_VALUE;
        c0366e.f3857x = Integer.MIN_VALUE;
        c0366e.f3858y = Integer.MIN_VALUE;
        c0366e.f3859z = Integer.MIN_VALUE;
        c0366e.f3797A = Integer.MIN_VALUE;
        c0366e.f3798B = Integer.MIN_VALUE;
        c0366e.f3799C = Integer.MIN_VALUE;
        c0366e.f3800D = 0;
        c0366e.f3801E = 0.5f;
        c0366e.F = 0.5f;
        c0366e.f3802G = null;
        c0366e.f3803H = -1.0f;
        c0366e.f3804I = -1.0f;
        c0366e.f3805J = 0;
        c0366e.f3806K = 0;
        c0366e.f3807L = 0;
        c0366e.f3808M = 0;
        c0366e.f3809N = 0;
        c0366e.f3810O = 0;
        c0366e.f3811P = 0;
        c0366e.f3812Q = 0;
        c0366e.f3813R = 1.0f;
        c0366e.f3814S = 1.0f;
        c0366e.f3815T = -1;
        c0366e.f3816U = -1;
        c0366e.f3817V = -1;
        c0366e.f3818W = false;
        c0366e.f3819X = false;
        c0366e.f3820Y = null;
        c0366e.f3821Z = 0;
        c0366e.f3823a0 = true;
        c0366e.f3825b0 = true;
        c0366e.f3827c0 = false;
        c0366e.f3828d0 = false;
        c0366e.f3830e0 = false;
        c0366e.f3832f0 = -1;
        c0366e.f3834g0 = -1;
        c0366e.f3835h0 = -1;
        c0366e.f3836i0 = -1;
        c0366e.f3838j0 = Integer.MIN_VALUE;
        c0366e.f3840k0 = Integer.MIN_VALUE;
        c0366e.f3842l0 = 0.5f;
        c0366e.f3849p0 = new C0340d();
        return c0366e;
    }
}

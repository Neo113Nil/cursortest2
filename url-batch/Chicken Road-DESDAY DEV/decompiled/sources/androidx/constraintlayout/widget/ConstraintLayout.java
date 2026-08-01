package androidx.constraintlayout.widget;

import B.j;
import K.C0011l;
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
import q.C0286c;
import s.C0293a;
import s.C0296d;
import s.C0297e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0313o;
import t.C0301c;
import t.C0303e;
import t.C0307i;
import t.C0309k;
import t.C0311m;
import t1.y;
import v.AbstractC0321c;
import v.AbstractC0322d;
import v.C0323e;
import v.C0324f;
import v.C0325g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1311r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1313b;

    /* renamed from: c, reason: collision with root package name */
    public final C0297e f1314c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1315e;

    /* renamed from: f, reason: collision with root package name */
    public int f1316f;

    /* renamed from: g, reason: collision with root package name */
    public int f1317g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1318j;

    /* renamed from: k, reason: collision with root package name */
    public j f1319k;

    /* renamed from: l, reason: collision with root package name */
    public int f1320l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1321m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1322n;

    /* renamed from: o, reason: collision with root package name */
    public final C0324f f1323o;

    /* renamed from: p, reason: collision with root package name */
    public int f1324p;

    /* renamed from: q, reason: collision with root package name */
    public int f1325q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1312a = new SparseArray();
        this.f1313b = new ArrayList(4);
        this.f1314c = new C0297e();
        this.d = 0;
        this.f1315e = 0;
        this.f1316f = Integer.MAX_VALUE;
        this.f1317g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1318j = null;
        this.f1319k = null;
        this.f1320l = -1;
        this.f1321m = new HashMap();
        this.f1322n = new SparseArray();
        this.f1323o = new C0324f(this, this);
        this.f1324p = 0;
        this.f1325q = 0;
        i(attributeSet, 0);
    }

    public static C0323e g() {
        C0323e c0323e = new C0323e(-2, -2);
        c0323e.f3945a = -1;
        c0323e.f3947b = -1;
        c0323e.f3949c = -1.0f;
        c0323e.d = true;
        c0323e.f3952e = -1;
        c0323e.f3954f = -1;
        c0323e.f3956g = -1;
        c0323e.h = -1;
        c0323e.i = -1;
        c0323e.f3960j = -1;
        c0323e.f3962k = -1;
        c0323e.f3964l = -1;
        c0323e.f3966m = -1;
        c0323e.f3968n = -1;
        c0323e.f3969o = -1;
        c0323e.f3971p = -1;
        c0323e.f3973q = 0;
        c0323e.f3974r = 0.0f;
        c0323e.f3975s = -1;
        c0323e.f3976t = -1;
        c0323e.f3977u = -1;
        c0323e.f3978v = -1;
        c0323e.f3979w = Integer.MIN_VALUE;
        c0323e.f3980x = Integer.MIN_VALUE;
        c0323e.f3981y = Integer.MIN_VALUE;
        c0323e.f3982z = Integer.MIN_VALUE;
        c0323e.f3920A = Integer.MIN_VALUE;
        c0323e.f3921B = Integer.MIN_VALUE;
        c0323e.f3922C = Integer.MIN_VALUE;
        c0323e.f3923D = 0;
        c0323e.f3924E = 0.5f;
        c0323e.F = 0.5f;
        c0323e.f3925G = null;
        c0323e.f3926H = -1.0f;
        c0323e.f3927I = -1.0f;
        c0323e.f3928J = 0;
        c0323e.f3929K = 0;
        c0323e.f3930L = 0;
        c0323e.f3931M = 0;
        c0323e.f3932N = 0;
        c0323e.f3933O = 0;
        c0323e.f3934P = 0;
        c0323e.f3935Q = 0;
        c0323e.f3936R = 1.0f;
        c0323e.f3937S = 1.0f;
        c0323e.f3938T = -1;
        c0323e.f3939U = -1;
        c0323e.f3940V = -1;
        c0323e.f3941W = false;
        c0323e.f3942X = false;
        c0323e.f3943Y = null;
        c0323e.f3944Z = 0;
        c0323e.f3946a0 = true;
        c0323e.f3948b0 = true;
        c0323e.f3950c0 = false;
        c0323e.f3951d0 = false;
        c0323e.f3953e0 = false;
        c0323e.f3955f0 = -1;
        c0323e.f3957g0 = -1;
        c0323e.f3958h0 = -1;
        c0323e.f3959i0 = -1;
        c0323e.f3961j0 = Integer.MIN_VALUE;
        c0323e.f3963k0 = Integer.MIN_VALUE;
        c0323e.f3965l0 = 0.5f;
        c0323e.f3972p0 = new C0296d();
        return c0323e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1311r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1311r = sVar;
        }
        return f1311r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0323e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1313b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0321c) arrayList.get(i)).getClass();
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
        C0323e c0323e = new C0323e(context, attributeSet);
        c0323e.f3945a = -1;
        c0323e.f3947b = -1;
        c0323e.f3949c = -1.0f;
        c0323e.d = true;
        c0323e.f3952e = -1;
        c0323e.f3954f = -1;
        c0323e.f3956g = -1;
        c0323e.h = -1;
        c0323e.i = -1;
        c0323e.f3960j = -1;
        c0323e.f3962k = -1;
        c0323e.f3964l = -1;
        c0323e.f3966m = -1;
        c0323e.f3968n = -1;
        c0323e.f3969o = -1;
        c0323e.f3971p = -1;
        c0323e.f3973q = 0;
        c0323e.f3974r = 0.0f;
        c0323e.f3975s = -1;
        c0323e.f3976t = -1;
        c0323e.f3977u = -1;
        c0323e.f3978v = -1;
        c0323e.f3979w = Integer.MIN_VALUE;
        c0323e.f3980x = Integer.MIN_VALUE;
        c0323e.f3981y = Integer.MIN_VALUE;
        c0323e.f3982z = Integer.MIN_VALUE;
        c0323e.f3920A = Integer.MIN_VALUE;
        c0323e.f3921B = Integer.MIN_VALUE;
        c0323e.f3922C = Integer.MIN_VALUE;
        c0323e.f3923D = 0;
        c0323e.f3924E = 0.5f;
        c0323e.F = 0.5f;
        c0323e.f3925G = null;
        c0323e.f3926H = -1.0f;
        c0323e.f3927I = -1.0f;
        c0323e.f3928J = 0;
        c0323e.f3929K = 0;
        c0323e.f3930L = 0;
        c0323e.f3931M = 0;
        c0323e.f3932N = 0;
        c0323e.f3933O = 0;
        c0323e.f3934P = 0;
        c0323e.f3935Q = 0;
        c0323e.f3936R = 1.0f;
        c0323e.f3937S = 1.0f;
        c0323e.f3938T = -1;
        c0323e.f3939U = -1;
        c0323e.f3940V = -1;
        c0323e.f3941W = false;
        c0323e.f3942X = false;
        c0323e.f3943Y = null;
        c0323e.f3944Z = 0;
        c0323e.f3946a0 = true;
        c0323e.f3948b0 = true;
        c0323e.f3950c0 = false;
        c0323e.f3951d0 = false;
        c0323e.f3953e0 = false;
        c0323e.f3955f0 = -1;
        c0323e.f3957g0 = -1;
        c0323e.f3958h0 = -1;
        c0323e.f3959i0 = -1;
        c0323e.f3961j0 = Integer.MIN_VALUE;
        c0323e.f3963k0 = Integer.MIN_VALUE;
        c0323e.f3965l0 = 0.5f;
        c0323e.f3972p0 = new C0296d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4098b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0322d.f3919a.get(index);
            switch (i2) {
                case 1:
                    c0323e.f3940V = obtainStyledAttributes.getInt(index, c0323e.f3940V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0323e.f3971p);
                    c0323e.f3971p = resourceId;
                    if (resourceId == -1) {
                        c0323e.f3971p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0323e.f3973q = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3973q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0323e.f3974r) % 360.0f;
                    c0323e.f3974r = f2;
                    if (f2 < 0.0f) {
                        c0323e.f3974r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0323e.f3945a = obtainStyledAttributes.getDimensionPixelOffset(index, c0323e.f3945a);
                    break;
                case 6:
                    c0323e.f3947b = obtainStyledAttributes.getDimensionPixelOffset(index, c0323e.f3947b);
                    break;
                case 7:
                    c0323e.f3949c = obtainStyledAttributes.getFloat(index, c0323e.f3949c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0323e.f3952e);
                    c0323e.f3952e = resourceId2;
                    if (resourceId2 == -1) {
                        c0323e.f3952e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0323e.f3954f);
                    c0323e.f3954f = resourceId3;
                    if (resourceId3 == -1) {
                        c0323e.f3954f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0323e.f3956g);
                    c0323e.f3956g = resourceId4;
                    if (resourceId4 == -1) {
                        c0323e.f3956g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0323e.h);
                    c0323e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0323e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0323e.i);
                    c0323e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0323e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0323e.f3960j);
                    c0323e.f3960j = resourceId7;
                    if (resourceId7 == -1) {
                        c0323e.f3960j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0323e.f3962k);
                    c0323e.f3962k = resourceId8;
                    if (resourceId8 == -1) {
                        c0323e.f3962k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0323e.f3964l);
                    c0323e.f3964l = resourceId9;
                    if (resourceId9 == -1) {
                        c0323e.f3964l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0323e.f3966m);
                    c0323e.f3966m = resourceId10;
                    if (resourceId10 == -1) {
                        c0323e.f3966m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0323e.f3975s);
                    c0323e.f3975s = resourceId11;
                    if (resourceId11 == -1) {
                        c0323e.f3975s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0323e.f3976t);
                    c0323e.f3976t = resourceId12;
                    if (resourceId12 == -1) {
                        c0323e.f3976t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0323e.f3977u);
                    c0323e.f3977u = resourceId13;
                    if (resourceId13 == -1) {
                        c0323e.f3977u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0323e.f3978v);
                    c0323e.f3978v = resourceId14;
                    if (resourceId14 == -1) {
                        c0323e.f3978v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0323e.f3979w = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3979w);
                    break;
                case 22:
                    c0323e.f3980x = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3980x);
                    break;
                case 23:
                    c0323e.f3981y = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3981y);
                    break;
                case 24:
                    c0323e.f3982z = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3982z);
                    break;
                case 25:
                    c0323e.f3920A = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3920A);
                    break;
                case 26:
                    c0323e.f3921B = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3921B);
                    break;
                case 27:
                    c0323e.f3941W = obtainStyledAttributes.getBoolean(index, c0323e.f3941W);
                    break;
                case 28:
                    c0323e.f3942X = obtainStyledAttributes.getBoolean(index, c0323e.f3942X);
                    break;
                case 29:
                    c0323e.f3924E = obtainStyledAttributes.getFloat(index, c0323e.f3924E);
                    break;
                case 30:
                    c0323e.F = obtainStyledAttributes.getFloat(index, c0323e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0323e.f3930L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0323e.f3931M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0323e.f3932N = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3932N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0323e.f3932N) == -2) {
                            c0323e.f3932N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0323e.f3934P = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3934P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0323e.f3934P) == -2) {
                            c0323e.f3934P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0323e.f3936R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0323e.f3936R));
                    c0323e.f3930L = 2;
                    break;
                case 36:
                    try {
                        c0323e.f3933O = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3933O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0323e.f3933O) == -2) {
                            c0323e.f3933O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0323e.f3935Q = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3935Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0323e.f3935Q) == -2) {
                            c0323e.f3935Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0323e.f3937S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0323e.f3937S));
                    c0323e.f3931M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0323e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0323e.f3926H = obtainStyledAttributes.getFloat(index, c0323e.f3926H);
                            break;
                        case 46:
                            c0323e.f3927I = obtainStyledAttributes.getFloat(index, c0323e.f3927I);
                            break;
                        case 47:
                            c0323e.f3928J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0323e.f3929K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0323e.f3938T = obtainStyledAttributes.getDimensionPixelOffset(index, c0323e.f3938T);
                            break;
                        case 50:
                            c0323e.f3939U = obtainStyledAttributes.getDimensionPixelOffset(index, c0323e.f3939U);
                            break;
                        case 51:
                            c0323e.f3943Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0323e.f3968n);
                            c0323e.f3968n = resourceId15;
                            if (resourceId15 == -1) {
                                c0323e.f3968n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0323e.f3969o);
                            c0323e.f3969o = resourceId16;
                            if (resourceId16 == -1) {
                                c0323e.f3969o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0323e.f3923D = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3923D);
                            break;
                        case 55:
                            c0323e.f3922C = obtainStyledAttributes.getDimensionPixelSize(index, c0323e.f3922C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0323e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0323e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0323e.f3944Z = obtainStyledAttributes.getInt(index, c0323e.f3944Z);
                                    break;
                                case 67:
                                    c0323e.d = obtainStyledAttributes.getBoolean(index, c0323e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0323e.a();
        return c0323e;
    }

    public int getMaxHeight() {
        return this.f1317g;
    }

    public int getMaxWidth() {
        return this.f1316f;
    }

    public int getMinHeight() {
        return this.f1315e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1314c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0297e c0297e = this.f1314c;
        if (c0297e.f3589j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0297e.f3589j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0297e.f3589j = "parent";
            }
        }
        if (c0297e.f3587h0 == null) {
            c0297e.f3587h0 = c0297e.f3589j;
            Log.v("ConstraintLayout", " setDebugName " + c0297e.f3587h0);
        }
        Iterator it = c0297e.f3623q0.iterator();
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            View view = c0296d.f3584f0;
            if (view != null) {
                if (c0296d.f3589j == null && (id = view.getId()) != -1) {
                    c0296d.f3589j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0296d.f3587h0 == null) {
                    c0296d.f3587h0 = c0296d.f3589j;
                    Log.v("ConstraintLayout", " setDebugName " + c0296d.f3587h0);
                }
            }
        }
        c0297e.n(sb);
        return sb.toString();
    }

    public final C0296d h(View view) {
        if (view == this) {
            return this.f1314c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0323e) {
            return ((C0323e) view.getLayoutParams()).f3972p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0323e) {
            return ((C0323e) view.getLayoutParams()).f3972p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0297e c0297e = this.f1314c;
        c0297e.f3584f0 = this;
        C0324f c0324f = this.f1323o;
        c0297e.f3627u0 = c0324f;
        c0297e.f3625s0.f3715f = c0324f;
        this.f1312a.put(getId(), this);
        this.f1318j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4098b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1315e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1315e);
                } else if (index == 14) {
                    this.f1316f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1316f);
                } else if (index == 15) {
                    this.f1317g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1317g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1319k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1318j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1318j = null;
                    }
                    this.f1320l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0297e.D0 = this.i;
        C0286c.f3416p = c0297e.W(512);
    }

    public final void j(int i) {
        int eventType;
        y yVar;
        Context context = getContext();
        j jVar = new j(18, false);
        jVar.f27b = new SparseArray();
        jVar.f28c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            yVar = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1319k = jVar;
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
                    yVar = new y(context, xml);
                    ((SparseArray) jVar.f27b).put(yVar.f3854a, yVar);
                } else if (c2 == 3) {
                    C0325g c0325g = new C0325g(context, xml);
                    if (yVar != null) {
                        ((ArrayList) yVar.f3856c).add(c0325g);
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
    public final void k(C0297e c0297e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0324f c0324f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0324f c0324f2;
        int i12;
        C0324f c0324f3;
        boolean z4;
        C0309k c0309k;
        C0311m c0311m;
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
        C0297e c0297e2 = c0297e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0324f c0324f4 = this.f1323o;
        c0324f4.f3984b = max3;
        c0324f4.f3985c = max4;
        c0324f4.d = paddingWidth;
        c0324f4.f3986e = i19;
        c0324f4.f3987f = i2;
        c0324f4.f3988g = i3;
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
        int i23 = c0324f4.f3986e;
        int i24 = c0324f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1316f - i24, i21);
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
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1317g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1315e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1315e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0297e.q();
        C0303e c0303e = c0297e2.f3625s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0297e.k()) {
            c0303e.f3713c = true;
        }
        c0297e2.f3572Y = 0;
        c0297e2.f3573Z = 0;
        int i26 = this.f1316f - i24;
        int[] iArr = c0297e2.f3551C;
        iArr[0] = i26;
        iArr[1] = this.f1317g - i23;
        c0297e2.f3577b0 = 0;
        c0297e2.f3579c0 = 0;
        c0297e2.M(i20);
        c0297e2.O(i25);
        c0297e2.N(i6);
        c0297e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0297e2.f3577b0 = 0;
        } else {
            c0297e2.f3577b0 = i27;
        }
        int i28 = this.f1315e - i23;
        if (i28 < 0) {
            c0297e2.f3579c0 = 0;
        } else {
            c0297e2.f3579c0 = i28;
        }
        c0297e2.f3630x0 = max5;
        c0297e2.y0 = max3;
        C0011l c0011l = c0297e2.f3624r0;
        c0011l.getClass();
        C0324f c0324f5 = c0297e2.f3627u0;
        int size3 = c0297e2.f3623q0.size();
        int q3 = c0297e.q();
        int k2 = c0297e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0296d c0296d = (C0296d) c0297e2.f3623q0.get(i29);
                int[] iArr2 = c0296d.f3601p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0296d.f3570W > 0.0f;
                if ((c0296d.x() && z8) || ((c0296d.y() && z8) || (c0296d instanceof g) || c0296d.x() || c0296d.y())) {
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
            if (mode == 1073741824 && c0297e.q() != min) {
                c0297e2.O(min);
                c0297e2.f3625s0.f3712b = true;
            }
            if (mode2 == 1073741824 && c0297e.k() != min2) {
                c0297e2.L(min2);
                c0297e2.f3625s0.f3712b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0303e.f3712b;
                C0297e c0297e3 = c0303e.f3711a;
                if (z10 || c0303e.f3713c) {
                    Iterator it3 = c0297e3.f3623q0.iterator();
                    while (it3.hasNext()) {
                        C0296d c0296d2 = (C0296d) it3.next();
                        c0296d2.h();
                        c0296d2.f3574a = false;
                        c0296d2.d.n();
                        c0296d2.f3581e.m();
                    }
                    i15 = 0;
                    c0297e3.h();
                    c0297e3.f3574a = false;
                    c0297e3.d.n();
                    c0297e3.f3581e.m();
                    c0303e.f3713c = false;
                } else {
                    i15 = 0;
                }
                c0303e.b(c0303e.d);
                c0297e3.f3572Y = i15;
                c0297e3.f3573Z = i15;
                int j2 = c0297e3.j(i15);
                int j3 = c0297e3.j(1);
                if (c0303e.f3712b) {
                    c0303e.c();
                }
                int r2 = c0297e3.r();
                int s2 = c0297e3.s();
                z2 = z9;
                c0297e3.d.h.d(r2);
                c0297e3.f3581e.h.d(s2);
                c0303e.g();
                ArrayList arrayList2 = c0303e.f3714e;
                c0324f = c0324f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0313o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0297e3.M(1);
                        i8 = q3;
                        c0297e3.O(c0303e.d(c0297e3, 0));
                        c0297e3.d.f3741e.d(c0297e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0297e3.N(1);
                        c0297e3.L(c0303e.d(c0297e3, 1));
                        c0297e3.f3581e.f3741e.d(c0297e3.k());
                        int[] iArr3 = c0297e3.f3601p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0297e3.q() + r2;
                            c0297e3.d.i.d(q4);
                            c0297e3.d.f3741e.d(q4 - r2);
                            c0303e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0297e3.k() + s2;
                                c0297e3.f3581e.i.d(k3);
                                c0297e3.f3581e.f3741e.d(k3 - s2);
                            }
                            c0303e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0313o abstractC0313o = (AbstractC0313o) it.next();
                            if (abstractC0313o.f3739b != c0297e3 || abstractC0313o.f3743g) {
                                abstractC0313o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0313o abstractC0313o2 = (AbstractC0313o) it2.next();
                            if (z5 || abstractC0313o2.f3739b != c0297e3) {
                                if (!abstractC0313o2.h.f3723j || ((!abstractC0313o2.i.f3723j && !(abstractC0313o2 instanceof C0307i)) || (!abstractC0313o2.f3741e.f3723j && !(abstractC0313o2 instanceof C0301c) && !(abstractC0313o2 instanceof C0307i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0297e3.M(j2);
                        c0297e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0297e3.f3601p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0297e3.q() + r2;
                c0297e3.d.i.d(q42);
                c0297e3.d.f3741e.d(q42 - r2);
                c0303e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0297e3.k() + s2;
                c0297e3.f3581e.i.d(k32);
                c0297e3.f3581e.f3741e.d(k32 - s2);
                c0303e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0297e3.M(j2);
                c0297e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0324f = c0324f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0303e.f3712b;
                C0297e c0297e4 = c0303e.f3711a;
                if (z11) {
                    Iterator it5 = c0297e4.f3623q0.iterator();
                    while (it5.hasNext()) {
                        C0296d c0296d3 = (C0296d) it5.next();
                        c0296d3.h();
                        c0296d3.f3574a = false;
                        C0309k c0309k2 = c0296d3.d;
                        c0309k2.f3741e.f3723j = false;
                        c0309k2.f3743g = false;
                        c0309k2.n();
                        C0311m c0311m2 = c0296d3.f3581e;
                        c0311m2.f3741e.f3723j = false;
                        c0311m2.f3743g = false;
                        c0311m2.m();
                    }
                    i13 = 0;
                    c0297e4.h();
                    c0297e4.f3574a = false;
                    C0309k c0309k3 = c0297e4.d;
                    c0309k3.f3741e.f3723j = false;
                    c0309k3.f3743g = false;
                    c0309k3.n();
                    C0311m c0311m3 = c0297e4.f3581e;
                    c0311m3.f3741e.f3723j = false;
                    c0311m3.f3743g = false;
                    c0311m3.m();
                    c0303e.c();
                } else {
                    i13 = 0;
                }
                c0303e.b(c0303e.d);
                c0297e4.f3572Y = i13;
                c0297e4.f3573Z = i13;
                c0297e4.d.h.d(i13);
                c0297e4.f3581e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0297e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0297e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0297e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0324f = c0324f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0297e2.D0;
        if (size3 > 0) {
            int size4 = c0297e2.f3623q0.size();
            boolean W2 = c0297e2.W(64);
            C0324f c0324f6 = c0297e2.f3627u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0296d c0296d4 = (C0296d) c0297e2.f3623q0.get(i31);
                if (!(c0296d4 instanceof h) && !(c0296d4 instanceof C0293a) && !c0296d4.F && (!W2 || (c0309k = c0296d4.d) == null || (c0311m = c0296d4.f3581e) == null || !c0309k.f3741e.f3723j || !c0311m.f3741e.f3723j)) {
                    int j4 = c0296d4.j(0);
                    int j5 = c0296d4.j(1);
                    boolean z12 = j4 == 3 && c0296d4.f3603r != 1 && j5 == 3 && c0296d4.f3604s != 1;
                    if (!z12 && c0297e2.W(1) && !(c0296d4 instanceof g)) {
                        if (j4 == 3 && c0296d4.f3603r == 0 && j5 != 3 && !c0296d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0296d4.f3604s == 0 && j4 != 3 && !c0296d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0296d4.f3570W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0011l.q(0, c0296d4, c0324f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0324f6.f3983a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1313b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0321c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0011l.w(c0297e2);
        ArrayList arrayList4 = (ArrayList) c0011l.f422b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0011l.u(c0297e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0297e2.f3601p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0297e.q();
            C0297e c0297e5 = (C0297e) c0011l.d;
            int max7 = Math.max(q5, c0297e5.f3577b0);
            int max8 = Math.max(c0297e.k(), c0297e5.f3579c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0296d c0296d5 = (C0296d) arrayList4.get(i36);
                if (c0296d5 instanceof g) {
                    int q6 = c0296d5.q();
                    int k4 = c0296d5.k();
                    i12 = i30;
                    c0324f3 = c0324f;
                    boolean q7 = z15 | c0011l.q(1, c0296d5, c0324f3);
                    int q8 = c0296d5.q();
                    int k5 = c0296d5.k();
                    if (q8 != q6) {
                        c0296d5.O(q8);
                        if (z13 && c0296d5.r() + c0296d5.f3568U > max7) {
                            max7 = Math.max(max7, c0296d5.i(4).e() + c0296d5.r() + c0296d5.f3568U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0296d5.L(k5);
                        if (z14 && c0296d5.s() + c0296d5.f3569V > max8) {
                            max8 = Math.max(max8, c0296d5.i(5).e() + c0296d5.s() + c0296d5.f3569V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0296d5).y0 | z4;
                } else {
                    i12 = i30;
                    c0324f3 = c0324f;
                }
                i36++;
                c0324f = c0324f3;
                i30 = i12;
            }
            int i37 = i30;
            C0324f c0324f7 = c0324f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0296d c0296d6 = (C0296d) arrayList4.get(i39);
                    if (((c0296d6 instanceof i) && !(c0296d6 instanceof g)) || (c0296d6 instanceof h) || c0296d6.f3586g0 == 8 || ((z2 && c0296d6.d.f3741e.f3723j && c0296d6.f3581e.f3741e.f3723j) || (c0296d6 instanceof g))) {
                        c0324f2 = c0324f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0296d6.q();
                        int k6 = c0296d6.k();
                        arrayList = arrayList4;
                        int i40 = c0296d6.f3575a0;
                        i11 = size6;
                        boolean q10 = c0011l.q(i38 == 1 ? 2 : 1, c0296d6, c0324f7) | z15;
                        int q11 = c0296d6.q();
                        c0324f2 = c0324f7;
                        int k7 = c0296d6.k();
                        if (q11 != q9) {
                            c0296d6.O(q11);
                            if (z13 && c0296d6.r() + c0296d6.f3568U > max7) {
                                max7 = Math.max(max7, c0296d6.i(4).e() + c0296d6.r() + c0296d6.f3568U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0296d6.L(k7);
                            if (z14 && c0296d6.s() + c0296d6.f3569V > max8) {
                                max8 = Math.max(max8, c0296d6.i(5).e() + c0296d6.s() + c0296d6.f3569V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0296d6.f3553E || i40 == c0296d6.f3575a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0324f7 = c0324f2;
                }
                C0324f c0324f8 = c0324f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0011l.u(c0297e, i38, i34, i35);
                c0324f7 = c0324f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0297e2 = c0297e;
            i30 = i37;
        }
        c0297e2.D0 = i30;
        C0286c.f3416p = c0297e2.W(512);
    }

    public final void l(C0296d c0296d, C0323e c0323e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1312a.get(i);
        C0296d c0296d2 = (C0296d) sparseArray.get(i);
        if (c0296d2 == null || view == null || !(view.getLayoutParams() instanceof C0323e)) {
            return;
        }
        c0323e.f3950c0 = true;
        if (i2 == 6) {
            C0323e c0323e2 = (C0323e) view.getLayoutParams();
            c0323e2.f3950c0 = true;
            c0323e2.f3972p0.f3553E = true;
        }
        c0296d.i(6).b(c0296d2.i(i2), c0323e.f3923D, c0323e.f3922C, true);
        c0296d.f3553E = true;
        c0296d.i(3).j();
        c0296d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0323e c0323e = (C0323e) childAt.getLayoutParams();
            C0296d c0296d = c0323e.f3972p0;
            if (childAt.getVisibility() != 8 || c0323e.f3951d0 || c0323e.f3953e0 || isInEditMode) {
                int r2 = c0296d.r();
                int s2 = c0296d.s();
                childAt.layout(r2, s2, c0296d.q() + r2, c0296d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1313b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0321c) arrayList.get(i6)).getClass();
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
        C0296d c0296d;
        int i5;
        C0296d c0296d2;
        int i6;
        C0296d c0296d3;
        int i7;
        C0323e c0323e;
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
        C0296d c0296d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1324p == i) {
            int i12 = constraintLayout.f1325q;
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
        constraintLayout.f1324p = i;
        constraintLayout.f1325q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0297e c0297e = constraintLayout.f1314c;
        c0297e.f3628v0 = z3;
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
                    C0296d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1321m == null) {
                                    constraintLayout.f1321m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1321m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1312a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0296d4 = view == null ? null : ((C0323e) view.getLayoutParams()).f3972p0;
                                c0296d4.f3587h0 = resourceName;
                            }
                        }
                        c0296d4 = c0297e;
                        c0296d4.f3587h0 = resourceName;
                    }
                }
                if (constraintLayout.f1320l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1318j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0297e.f3623q0.clear();
                ArrayList arrayList3 = constraintLayout.f1313b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0321c abstractC0321c = (AbstractC0321c) arrayList3.get(i19);
                        if (abstractC0321c.isInEditMode()) {
                            abstractC0321c.setIds(abstractC0321c.f3916e);
                        }
                        i iVar = abstractC0321c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3686r0 = i13;
                            Arrays.fill(iVar.f3685q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0321c.f3914b) {
                                int i21 = abstractC0321c.f3913a[i20];
                                View view2 = (View) constraintLayout.f1312a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0321c.f3918g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0321c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0321c.f3913a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1312a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0321c.d;
                                    C0296d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3686r0 + 1;
                                        C0296d[] c0296dArr = iVar2.f3685q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0296dArr.length) {
                                            iVar2.f3685q0 = (C0296d[]) Arrays.copyOf(c0296dArr, c0296dArr.length * 2);
                                        }
                                        C0296d[] c0296dArr2 = iVar2.f3685q0;
                                        int i23 = iVar2.f3686r0;
                                        c0296dArr2[i23] = h2;
                                        iVar2.f3686r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0321c.d.S();
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
                SparseArray sparseArray = constraintLayout.f1322n;
                sparseArray.clear();
                sparseArray.put(0, c0297e);
                sparseArray.put(getId(), c0297e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0296d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0323e c0323e2 = (C0323e) childAt3.getLayoutParams();
                        c0297e.f3623q0.add(h3);
                        C0296d c0296d5 = h3.f3567T;
                        if (c0296d5 != null) {
                            ((C0297e) c0296d5).f3623q0.remove(h3);
                            h3.C();
                        }
                        h3.f3567T = c0297e;
                        c0323e2.a();
                        h3.f3586g0 = childAt3.getVisibility();
                        h3.f3584f0 = childAt3;
                        if (childAt3 instanceof AbstractC0321c) {
                            ((AbstractC0321c) childAt3).h(h3, c0297e.f3628v0);
                        }
                        if (c0323e2.f3951d0) {
                            h hVar = (h) h3;
                            int i27 = c0323e2.f3967m0;
                            int i28 = c0323e2.n0;
                            float f4 = c0323e2.f3970o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f3679q0 = f4;
                                    hVar.f3680r0 = -1;
                                    hVar.f3681s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f3679q0 = -1.0f;
                                    hVar.f3680r0 = i27;
                                    hVar.f3681s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f3679q0 = -1.0f;
                                hVar.f3680r0 = -1;
                                hVar.f3681s0 = i28;
                            }
                        } else {
                            int i29 = c0323e2.f3955f0;
                            int i30 = c0323e2.f3957g0;
                            int i31 = c0323e2.f3958h0;
                            int i32 = c0323e2.f3959i0;
                            int i33 = c0323e2.f3961j0;
                            i3 = childCount3;
                            int i34 = c0323e2.f3963k0;
                            float f5 = c0323e2.f3965l0;
                            int i35 = c0323e2.f3971p;
                            if (i35 != -1) {
                                C0296d c0296d6 = (C0296d) sparseArray.get(i35);
                                if (c0296d6 != null) {
                                    float f6 = c0323e2.f3974r;
                                    h3.v(7, 7, c0323e2.f3973q, 0, c0296d6);
                                    h3.f3552D = f6;
                                }
                                c0323e = c0323e2;
                            } else {
                                if (i29 != -1) {
                                    C0296d c0296d7 = (C0296d) sparseArray.get(i29);
                                    if (c0296d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0323e2).leftMargin, i33, c0296d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0296d c0296d8 = (C0296d) sparseArray.get(i30);
                                        if (c0296d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0323e2).leftMargin, i33, c0296d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0296d c0296d9 = (C0296d) sparseArray.get(i31);
                                        if (c0296d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0323e2).rightMargin, i34, c0296d9);
                                        }
                                    } else if (i32 != i4 && (c0296d = (C0296d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0323e2).rightMargin, i34, c0296d);
                                    }
                                    i5 = c0323e2.i;
                                    if (i5 == -1) {
                                        C0296d c0296d10 = (C0296d) sparseArray.get(i5);
                                        if (c0296d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0323e2).topMargin, c0323e2.f3980x, c0296d10);
                                        }
                                    } else {
                                        int i36 = c0323e2.f3960j;
                                        if (i36 != -1 && (c0296d2 = (C0296d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0323e2).topMargin, c0323e2.f3980x, c0296d2);
                                        }
                                    }
                                    i6 = c0323e2.f3962k;
                                    if (i6 == -1) {
                                        C0296d c0296d11 = (C0296d) sparseArray.get(i6);
                                        if (c0296d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0323e2).bottomMargin, c0323e2.f3982z, c0296d11);
                                        }
                                    } else {
                                        int i37 = c0323e2.f3964l;
                                        if (i37 != -1 && (c0296d3 = (C0296d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0323e2).bottomMargin, c0323e2.f3982z, c0296d3);
                                        }
                                    }
                                    i7 = c0323e2.f3966m;
                                    if (i7 == -1) {
                                        c0323e = c0323e2;
                                        l(h3, c0323e2, sparseArray, i7, 6);
                                    } else {
                                        c0323e = c0323e2;
                                        int i38 = c0323e.f3968n;
                                        if (i38 != -1) {
                                            l(h3, c0323e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0323e.f3969o;
                                            if (i39 != -1) {
                                                l(h3, c0323e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3580d0 = f5;
                                    }
                                    f2 = c0323e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f3582e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0323e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0323e2.f3962k;
                                if (i6 == -1) {
                                }
                                i7 = c0323e2.f3966m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0323e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0323e.f3938T) != -1 || c0323e.f3939U != -1)) {
                                int i40 = c0323e.f3939U;
                                h3.f3572Y = i11;
                                h3.f3573Z = i40;
                            }
                            if (c0323e.f3946a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0323e).width);
                                if (((ViewGroup.MarginLayoutParams) c0323e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0323e).width == -1) {
                                if (c0323e.f3941W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3548g = ((ViewGroup.MarginLayoutParams) c0323e).leftMargin;
                                h3.i(4).f3548g = ((ViewGroup.MarginLayoutParams) c0323e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0323e.f3948b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0323e).height);
                                if (((ViewGroup.MarginLayoutParams) c0323e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0323e).height == -1) {
                                    if (c0323e.f3942X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3548g = ((ViewGroup.MarginLayoutParams) c0323e).topMargin;
                                    h3.i(5).f3548g = ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0323e.f3925G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3570W = 0.0f;
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
                                    h3.f3570W = parseFloat;
                                    h3.f3571X = i9;
                                }
                            }
                            float f7 = c0323e.f3926H;
                            float[] fArr = h3.f3592k0;
                            fArr[0] = f7;
                            fArr[1] = c0323e.f3927I;
                            h3.f3588i0 = c0323e.f3928J;
                            h3.f3590j0 = c0323e.f3929K;
                            int i41 = c0323e.f3944Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3602q = i41;
                            }
                            int i42 = c0323e.f3930L;
                            int i43 = c0323e.f3932N;
                            int i44 = c0323e.f3934P;
                            float f8 = c0323e.f3936R;
                            h3.f3603r = i42;
                            h3.f3606u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3607v = i44;
                            h3.f3608w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3603r = 2;
                            }
                            int i45 = c0323e.f3931M;
                            int i46 = c0323e.f3933O;
                            int i47 = c0323e.f3935Q;
                            float f9 = c0323e.f3937S;
                            h3.f3604s = i45;
                            h3.f3609x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3610y = i47;
                            h3.f3611z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3604s = 2;
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
                c0297e.f3624r0.w(c0297e);
            }
        }
        k(c0297e, this.i, i, i2);
        int q2 = c0297e.q();
        int k2 = c0297e.k();
        boolean z4 = c0297e.f3615E0;
        boolean z5 = c0297e.f3616F0;
        C0324f c0324f = this.f1323o;
        int i48 = c0324f.f3986e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0324f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1316f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1317g, resolveSizeAndState2);
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
        C0296d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0323e c0323e = (C0323e) view.getLayoutParams();
            h hVar = new h();
            c0323e.f3972p0 = hVar;
            c0323e.f3951d0 = true;
            hVar.S(c0323e.f3940V);
        }
        if (view instanceof AbstractC0321c) {
            AbstractC0321c abstractC0321c = (AbstractC0321c) view;
            abstractC0321c.i();
            ((C0323e) view.getLayoutParams()).f3953e0 = true;
            ArrayList arrayList = this.f1313b;
            if (!arrayList.contains(abstractC0321c)) {
                arrayList.add(abstractC0321c);
            }
        }
        this.f1312a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1312a.remove(view.getId());
        C0296d h = h(view);
        this.f1314c.f3623q0.remove(h);
        h.C();
        this.f1313b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1318j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1312a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1317g) {
            return;
        }
        this.f1317g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1316f) {
            return;
        }
        this.f1316f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1315e) {
            return;
        }
        this.f1315e = i;
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
        j jVar = this.f1319k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0297e c0297e = this.f1314c;
        c0297e.D0 = i;
        C0286c.f3416p = c0297e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1312a = new SparseArray();
        this.f1313b = new ArrayList(4);
        this.f1314c = new C0297e();
        this.d = 0;
        this.f1315e = 0;
        this.f1316f = Integer.MAX_VALUE;
        this.f1317g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1318j = null;
        this.f1319k = null;
        this.f1320l = -1;
        this.f1321m = new HashMap();
        this.f1322n = new SparseArray();
        this.f1323o = new C0324f(this, this);
        this.f1324p = 0;
        this.f1325q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0323e c0323e = new C0323e(layoutParams);
        c0323e.f3945a = -1;
        c0323e.f3947b = -1;
        c0323e.f3949c = -1.0f;
        c0323e.d = true;
        c0323e.f3952e = -1;
        c0323e.f3954f = -1;
        c0323e.f3956g = -1;
        c0323e.h = -1;
        c0323e.i = -1;
        c0323e.f3960j = -1;
        c0323e.f3962k = -1;
        c0323e.f3964l = -1;
        c0323e.f3966m = -1;
        c0323e.f3968n = -1;
        c0323e.f3969o = -1;
        c0323e.f3971p = -1;
        c0323e.f3973q = 0;
        c0323e.f3974r = 0.0f;
        c0323e.f3975s = -1;
        c0323e.f3976t = -1;
        c0323e.f3977u = -1;
        c0323e.f3978v = -1;
        c0323e.f3979w = Integer.MIN_VALUE;
        c0323e.f3980x = Integer.MIN_VALUE;
        c0323e.f3981y = Integer.MIN_VALUE;
        c0323e.f3982z = Integer.MIN_VALUE;
        c0323e.f3920A = Integer.MIN_VALUE;
        c0323e.f3921B = Integer.MIN_VALUE;
        c0323e.f3922C = Integer.MIN_VALUE;
        c0323e.f3923D = 0;
        c0323e.f3924E = 0.5f;
        c0323e.F = 0.5f;
        c0323e.f3925G = null;
        c0323e.f3926H = -1.0f;
        c0323e.f3927I = -1.0f;
        c0323e.f3928J = 0;
        c0323e.f3929K = 0;
        c0323e.f3930L = 0;
        c0323e.f3931M = 0;
        c0323e.f3932N = 0;
        c0323e.f3933O = 0;
        c0323e.f3934P = 0;
        c0323e.f3935Q = 0;
        c0323e.f3936R = 1.0f;
        c0323e.f3937S = 1.0f;
        c0323e.f3938T = -1;
        c0323e.f3939U = -1;
        c0323e.f3940V = -1;
        c0323e.f3941W = false;
        c0323e.f3942X = false;
        c0323e.f3943Y = null;
        c0323e.f3944Z = 0;
        c0323e.f3946a0 = true;
        c0323e.f3948b0 = true;
        c0323e.f3950c0 = false;
        c0323e.f3951d0 = false;
        c0323e.f3953e0 = false;
        c0323e.f3955f0 = -1;
        c0323e.f3957g0 = -1;
        c0323e.f3958h0 = -1;
        c0323e.f3959i0 = -1;
        c0323e.f3961j0 = Integer.MIN_VALUE;
        c0323e.f3963k0 = Integer.MIN_VALUE;
        c0323e.f3965l0 = 0.5f;
        c0323e.f3972p0 = new C0296d();
        return c0323e;
    }
}

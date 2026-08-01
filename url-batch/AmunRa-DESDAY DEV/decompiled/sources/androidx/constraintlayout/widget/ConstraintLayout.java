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
import q.C0283c;
import r1.y;
import s.C0292a;
import s.C0295d;
import s.C0296e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0312o;
import t.C0300c;
import t.C0302e;
import t.C0306i;
import t.C0308k;
import t.C0310m;
import v.AbstractC0318c;
import v.AbstractC0319d;
import v.C0320e;
import v.C0321f;
import v.C0322g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1286r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1287a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1288b;

    /* renamed from: c, reason: collision with root package name */
    public final C0296e f1289c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1290e;

    /* renamed from: f, reason: collision with root package name */
    public int f1291f;

    /* renamed from: g, reason: collision with root package name */
    public int f1292g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1293j;

    /* renamed from: k, reason: collision with root package name */
    public j f1294k;

    /* renamed from: l, reason: collision with root package name */
    public int f1295l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1296m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1297n;

    /* renamed from: o, reason: collision with root package name */
    public final C0321f f1298o;

    /* renamed from: p, reason: collision with root package name */
    public int f1299p;

    /* renamed from: q, reason: collision with root package name */
    public int f1300q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1287a = new SparseArray();
        this.f1288b = new ArrayList(4);
        this.f1289c = new C0296e();
        this.d = 0;
        this.f1290e = 0;
        this.f1291f = Integer.MAX_VALUE;
        this.f1292g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1293j = null;
        this.f1294k = null;
        this.f1295l = -1;
        this.f1296m = new HashMap();
        this.f1297n = new SparseArray();
        this.f1298o = new C0321f(this, this);
        this.f1299p = 0;
        this.f1300q = 0;
        i(attributeSet, 0);
    }

    public static C0320e g() {
        C0320e c0320e = new C0320e(-2, -2);
        c0320e.f3951a = -1;
        c0320e.f3953b = -1;
        c0320e.f3955c = -1.0f;
        c0320e.d = true;
        c0320e.f3958e = -1;
        c0320e.f3960f = -1;
        c0320e.f3962g = -1;
        c0320e.h = -1;
        c0320e.i = -1;
        c0320e.f3966j = -1;
        c0320e.f3967k = -1;
        c0320e.f3969l = -1;
        c0320e.f3971m = -1;
        c0320e.f3973n = -1;
        c0320e.f3974o = -1;
        c0320e.f3976p = -1;
        c0320e.f3978q = 0;
        c0320e.f3979r = 0.0f;
        c0320e.f3980s = -1;
        c0320e.f3981t = -1;
        c0320e.f3982u = -1;
        c0320e.f3983v = -1;
        c0320e.f3984w = Integer.MIN_VALUE;
        c0320e.f3985x = Integer.MIN_VALUE;
        c0320e.f3986y = Integer.MIN_VALUE;
        c0320e.f3987z = Integer.MIN_VALUE;
        c0320e.f3926A = Integer.MIN_VALUE;
        c0320e.f3927B = Integer.MIN_VALUE;
        c0320e.f3928C = Integer.MIN_VALUE;
        c0320e.f3929D = 0;
        c0320e.f3930E = 0.5f;
        c0320e.F = 0.5f;
        c0320e.f3931G = null;
        c0320e.f3932H = -1.0f;
        c0320e.f3933I = -1.0f;
        c0320e.f3934J = 0;
        c0320e.f3935K = 0;
        c0320e.f3936L = 0;
        c0320e.f3937M = 0;
        c0320e.f3938N = 0;
        c0320e.f3939O = 0;
        c0320e.f3940P = 0;
        c0320e.f3941Q = 0;
        c0320e.f3942R = 1.0f;
        c0320e.f3943S = 1.0f;
        c0320e.f3944T = -1;
        c0320e.f3945U = -1;
        c0320e.f3946V = -1;
        c0320e.f3947W = false;
        c0320e.f3948X = false;
        c0320e.f3949Y = null;
        c0320e.f3950Z = 0;
        c0320e.f3952a0 = true;
        c0320e.f3954b0 = true;
        c0320e.f3956c0 = false;
        c0320e.f3957d0 = false;
        c0320e.f3959e0 = false;
        c0320e.f3961f0 = -1;
        c0320e.f3963g0 = -1;
        c0320e.f3964h0 = -1;
        c0320e.f3965i0 = -1;
        c0320e.j0 = Integer.MIN_VALUE;
        c0320e.f3968k0 = Integer.MIN_VALUE;
        c0320e.f3970l0 = 0.5f;
        c0320e.f3977p0 = new C0295d();
        return c0320e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1286r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1286r = sVar;
        }
        return f1286r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0320e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1288b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0318c) arrayList.get(i)).getClass();
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
        C0320e c0320e = new C0320e(context, attributeSet);
        c0320e.f3951a = -1;
        c0320e.f3953b = -1;
        c0320e.f3955c = -1.0f;
        c0320e.d = true;
        c0320e.f3958e = -1;
        c0320e.f3960f = -1;
        c0320e.f3962g = -1;
        c0320e.h = -1;
        c0320e.i = -1;
        c0320e.f3966j = -1;
        c0320e.f3967k = -1;
        c0320e.f3969l = -1;
        c0320e.f3971m = -1;
        c0320e.f3973n = -1;
        c0320e.f3974o = -1;
        c0320e.f3976p = -1;
        c0320e.f3978q = 0;
        c0320e.f3979r = 0.0f;
        c0320e.f3980s = -1;
        c0320e.f3981t = -1;
        c0320e.f3982u = -1;
        c0320e.f3983v = -1;
        c0320e.f3984w = Integer.MIN_VALUE;
        c0320e.f3985x = Integer.MIN_VALUE;
        c0320e.f3986y = Integer.MIN_VALUE;
        c0320e.f3987z = Integer.MIN_VALUE;
        c0320e.f3926A = Integer.MIN_VALUE;
        c0320e.f3927B = Integer.MIN_VALUE;
        c0320e.f3928C = Integer.MIN_VALUE;
        c0320e.f3929D = 0;
        c0320e.f3930E = 0.5f;
        c0320e.F = 0.5f;
        c0320e.f3931G = null;
        c0320e.f3932H = -1.0f;
        c0320e.f3933I = -1.0f;
        c0320e.f3934J = 0;
        c0320e.f3935K = 0;
        c0320e.f3936L = 0;
        c0320e.f3937M = 0;
        c0320e.f3938N = 0;
        c0320e.f3939O = 0;
        c0320e.f3940P = 0;
        c0320e.f3941Q = 0;
        c0320e.f3942R = 1.0f;
        c0320e.f3943S = 1.0f;
        c0320e.f3944T = -1;
        c0320e.f3945U = -1;
        c0320e.f3946V = -1;
        c0320e.f3947W = false;
        c0320e.f3948X = false;
        c0320e.f3949Y = null;
        c0320e.f3950Z = 0;
        c0320e.f3952a0 = true;
        c0320e.f3954b0 = true;
        c0320e.f3956c0 = false;
        c0320e.f3957d0 = false;
        c0320e.f3959e0 = false;
        c0320e.f3961f0 = -1;
        c0320e.f3963g0 = -1;
        c0320e.f3964h0 = -1;
        c0320e.f3965i0 = -1;
        c0320e.j0 = Integer.MIN_VALUE;
        c0320e.f3968k0 = Integer.MIN_VALUE;
        c0320e.f3970l0 = 0.5f;
        c0320e.f3977p0 = new C0295d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4102b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0319d.f3925a.get(index);
            switch (i2) {
                case 1:
                    c0320e.f3946V = obtainStyledAttributes.getInt(index, c0320e.f3946V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0320e.f3976p);
                    c0320e.f3976p = resourceId;
                    if (resourceId == -1) {
                        c0320e.f3976p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0320e.f3978q = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3978q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0320e.f3979r) % 360.0f;
                    c0320e.f3979r = f2;
                    if (f2 < 0.0f) {
                        c0320e.f3979r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0320e.f3951a = obtainStyledAttributes.getDimensionPixelOffset(index, c0320e.f3951a);
                    break;
                case 6:
                    c0320e.f3953b = obtainStyledAttributes.getDimensionPixelOffset(index, c0320e.f3953b);
                    break;
                case 7:
                    c0320e.f3955c = obtainStyledAttributes.getFloat(index, c0320e.f3955c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0320e.f3958e);
                    c0320e.f3958e = resourceId2;
                    if (resourceId2 == -1) {
                        c0320e.f3958e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0320e.f3960f);
                    c0320e.f3960f = resourceId3;
                    if (resourceId3 == -1) {
                        c0320e.f3960f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0320e.f3962g);
                    c0320e.f3962g = resourceId4;
                    if (resourceId4 == -1) {
                        c0320e.f3962g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0320e.h);
                    c0320e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0320e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0320e.i);
                    c0320e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0320e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0320e.f3966j);
                    c0320e.f3966j = resourceId7;
                    if (resourceId7 == -1) {
                        c0320e.f3966j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0320e.f3967k);
                    c0320e.f3967k = resourceId8;
                    if (resourceId8 == -1) {
                        c0320e.f3967k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0320e.f3969l);
                    c0320e.f3969l = resourceId9;
                    if (resourceId9 == -1) {
                        c0320e.f3969l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0320e.f3971m);
                    c0320e.f3971m = resourceId10;
                    if (resourceId10 == -1) {
                        c0320e.f3971m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0320e.f3980s);
                    c0320e.f3980s = resourceId11;
                    if (resourceId11 == -1) {
                        c0320e.f3980s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0320e.f3981t);
                    c0320e.f3981t = resourceId12;
                    if (resourceId12 == -1) {
                        c0320e.f3981t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0320e.f3982u);
                    c0320e.f3982u = resourceId13;
                    if (resourceId13 == -1) {
                        c0320e.f3982u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0320e.f3983v);
                    c0320e.f3983v = resourceId14;
                    if (resourceId14 == -1) {
                        c0320e.f3983v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0320e.f3984w = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3984w);
                    break;
                case 22:
                    c0320e.f3985x = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3985x);
                    break;
                case 23:
                    c0320e.f3986y = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3986y);
                    break;
                case 24:
                    c0320e.f3987z = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3987z);
                    break;
                case 25:
                    c0320e.f3926A = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3926A);
                    break;
                case 26:
                    c0320e.f3927B = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3927B);
                    break;
                case 27:
                    c0320e.f3947W = obtainStyledAttributes.getBoolean(index, c0320e.f3947W);
                    break;
                case 28:
                    c0320e.f3948X = obtainStyledAttributes.getBoolean(index, c0320e.f3948X);
                    break;
                case 29:
                    c0320e.f3930E = obtainStyledAttributes.getFloat(index, c0320e.f3930E);
                    break;
                case 30:
                    c0320e.F = obtainStyledAttributes.getFloat(index, c0320e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0320e.f3936L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0320e.f3937M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0320e.f3938N = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3938N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0320e.f3938N) == -2) {
                            c0320e.f3938N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0320e.f3940P = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3940P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0320e.f3940P) == -2) {
                            c0320e.f3940P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0320e.f3942R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0320e.f3942R));
                    c0320e.f3936L = 2;
                    break;
                case 36:
                    try {
                        c0320e.f3939O = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3939O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0320e.f3939O) == -2) {
                            c0320e.f3939O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0320e.f3941Q = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3941Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0320e.f3941Q) == -2) {
                            c0320e.f3941Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0320e.f3943S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0320e.f3943S));
                    c0320e.f3937M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0320e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0320e.f3932H = obtainStyledAttributes.getFloat(index, c0320e.f3932H);
                            break;
                        case 46:
                            c0320e.f3933I = obtainStyledAttributes.getFloat(index, c0320e.f3933I);
                            break;
                        case 47:
                            c0320e.f3934J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0320e.f3935K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0320e.f3944T = obtainStyledAttributes.getDimensionPixelOffset(index, c0320e.f3944T);
                            break;
                        case 50:
                            c0320e.f3945U = obtainStyledAttributes.getDimensionPixelOffset(index, c0320e.f3945U);
                            break;
                        case 51:
                            c0320e.f3949Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0320e.f3973n);
                            c0320e.f3973n = resourceId15;
                            if (resourceId15 == -1) {
                                c0320e.f3973n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0320e.f3974o);
                            c0320e.f3974o = resourceId16;
                            if (resourceId16 == -1) {
                                c0320e.f3974o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0320e.f3929D = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3929D);
                            break;
                        case 55:
                            c0320e.f3928C = obtainStyledAttributes.getDimensionPixelSize(index, c0320e.f3928C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0320e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0320e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0320e.f3950Z = obtainStyledAttributes.getInt(index, c0320e.f3950Z);
                                    break;
                                case 67:
                                    c0320e.d = obtainStyledAttributes.getBoolean(index, c0320e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0320e.a();
        return c0320e;
    }

    public int getMaxHeight() {
        return this.f1292g;
    }

    public int getMaxWidth() {
        return this.f1291f;
    }

    public int getMinHeight() {
        return this.f1290e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1289c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0296e c0296e = this.f1289c;
        if (c0296e.f3703j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0296e.f3703j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0296e.f3703j = "parent";
            }
        }
        if (c0296e.f3701h0 == null) {
            c0296e.f3701h0 = c0296e.f3703j;
            Log.v("ConstraintLayout", " setDebugName " + c0296e.f3701h0);
        }
        Iterator it = c0296e.f3736q0.iterator();
        while (it.hasNext()) {
            C0295d c0295d = (C0295d) it.next();
            View view = c0295d.f3698f0;
            if (view != null) {
                if (c0295d.f3703j == null && (id = view.getId()) != -1) {
                    c0295d.f3703j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0295d.f3701h0 == null) {
                    c0295d.f3701h0 = c0295d.f3703j;
                    Log.v("ConstraintLayout", " setDebugName " + c0295d.f3701h0);
                }
            }
        }
        c0296e.n(sb);
        return sb.toString();
    }

    public final C0295d h(View view) {
        if (view == this) {
            return this.f1289c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0320e) {
            return ((C0320e) view.getLayoutParams()).f3977p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0320e) {
            return ((C0320e) view.getLayoutParams()).f3977p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0296e c0296e = this.f1289c;
        c0296e.f3698f0 = this;
        C0321f c0321f = this.f1298o;
        c0296e.f3740u0 = c0321f;
        c0296e.f3738s0.f3840f = c0321f;
        this.f1287a.put(getId(), this);
        this.f1293j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4102b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1290e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1290e);
                } else if (index == 14) {
                    this.f1291f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1291f);
                } else if (index == 15) {
                    this.f1292g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1292g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1294k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1293j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1293j = null;
                    }
                    this.f1295l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0296e.D0 = this.i;
        C0283c.f3484p = c0296e.W(512);
    }

    public final void j(int i) {
        int eventType;
        y yVar;
        Context context = getContext();
        j jVar = new j(18, false);
        jVar.f25b = new SparseArray();
        jVar.f26c = new SparseArray();
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
                this.f1294k = jVar;
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
                    ((SparseArray) jVar.f25b).put(yVar.f3633a, yVar);
                } else if (c2 == 3) {
                    C0322g c0322g = new C0322g(context, xml);
                    if (yVar != null) {
                        ((ArrayList) yVar.f3635c).add(c0322g);
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
    public final void k(C0296e c0296e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0321f c0321f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0321f c0321f2;
        int i12;
        C0321f c0321f3;
        boolean z4;
        C0308k c0308k;
        C0310m c0310m;
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
        C0296e c0296e2 = c0296e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0321f c0321f4 = this.f1298o;
        c0321f4.f3989b = max3;
        c0321f4.f3990c = max4;
        c0321f4.d = paddingWidth;
        c0321f4.f3991e = i19;
        c0321f4.f3992f = i2;
        c0321f4.f3993g = i3;
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
        int i23 = c0321f4.f3991e;
        int i24 = c0321f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1291f - i24, i21);
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
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1292g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1290e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1290e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0296e.q();
        C0302e c0302e = c0296e2.f3738s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0296e.k()) {
            c0302e.f3838c = true;
        }
        c0296e2.f3686Y = 0;
        c0296e2.f3687Z = 0;
        int i26 = this.f1291f - i24;
        int[] iArr = c0296e2.f3665C;
        iArr[0] = i26;
        iArr[1] = this.f1292g - i23;
        c0296e2.f3691b0 = 0;
        c0296e2.f3693c0 = 0;
        c0296e2.M(i20);
        c0296e2.O(i25);
        c0296e2.N(i6);
        c0296e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0296e2.f3691b0 = 0;
        } else {
            c0296e2.f3691b0 = i27;
        }
        int i28 = this.f1290e - i23;
        if (i28 < 0) {
            c0296e2.f3693c0 = 0;
        } else {
            c0296e2.f3693c0 = i28;
        }
        c0296e2.f3743x0 = max5;
        c0296e2.y0 = max3;
        C0011l c0011l = c0296e2.f3737r0;
        c0011l.getClass();
        C0321f c0321f5 = c0296e2.f3740u0;
        int size3 = c0296e2.f3736q0.size();
        int q3 = c0296e.q();
        int k2 = c0296e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0295d c0295d = (C0295d) c0296e2.f3736q0.get(i29);
                int[] iArr2 = c0295d.f3714p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0295d.f3684W > 0.0f;
                if ((c0295d.x() && z8) || ((c0295d.y() && z8) || (c0295d instanceof g) || c0295d.x() || c0295d.y())) {
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
            if (mode == 1073741824 && c0296e.q() != min) {
                c0296e2.O(min);
                c0296e2.f3738s0.f3837b = true;
            }
            if (mode2 == 1073741824 && c0296e.k() != min2) {
                c0296e2.L(min2);
                c0296e2.f3738s0.f3837b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0302e.f3837b;
                C0296e c0296e3 = c0302e.f3836a;
                if (z10 || c0302e.f3838c) {
                    Iterator it3 = c0296e3.f3736q0.iterator();
                    while (it3.hasNext()) {
                        C0295d c0295d2 = (C0295d) it3.next();
                        c0295d2.h();
                        c0295d2.f3688a = false;
                        c0295d2.d.n();
                        c0295d2.f3695e.m();
                    }
                    i15 = 0;
                    c0296e3.h();
                    c0296e3.f3688a = false;
                    c0296e3.d.n();
                    c0296e3.f3695e.m();
                    c0302e.f3838c = false;
                } else {
                    i15 = 0;
                }
                c0302e.b(c0302e.d);
                c0296e3.f3686Y = i15;
                c0296e3.f3687Z = i15;
                int j2 = c0296e3.j(i15);
                int j3 = c0296e3.j(1);
                if (c0302e.f3837b) {
                    c0302e.c();
                }
                int r2 = c0296e3.r();
                int s2 = c0296e3.s();
                z2 = z9;
                c0296e3.d.h.d(r2);
                c0296e3.f3695e.h.d(s2);
                c0302e.g();
                ArrayList arrayList2 = c0302e.f3839e;
                c0321f = c0321f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0312o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0296e3.M(1);
                        i8 = q3;
                        c0296e3.O(c0302e.d(c0296e3, 0));
                        c0296e3.d.f3866e.d(c0296e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0296e3.N(1);
                        c0296e3.L(c0302e.d(c0296e3, 1));
                        c0296e3.f3695e.f3866e.d(c0296e3.k());
                        int[] iArr3 = c0296e3.f3714p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0296e3.q() + r2;
                            c0296e3.d.i.d(q4);
                            c0296e3.d.f3866e.d(q4 - r2);
                            c0302e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0296e3.k() + s2;
                                c0296e3.f3695e.i.d(k3);
                                c0296e3.f3695e.f3866e.d(k3 - s2);
                            }
                            c0302e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0312o abstractC0312o = (AbstractC0312o) it.next();
                            if (abstractC0312o.f3864b != c0296e3 || abstractC0312o.f3868g) {
                                abstractC0312o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0312o abstractC0312o2 = (AbstractC0312o) it2.next();
                            if (z5 || abstractC0312o2.f3864b != c0296e3) {
                                if (!abstractC0312o2.h.f3848j || ((!abstractC0312o2.i.f3848j && !(abstractC0312o2 instanceof C0306i)) || (!abstractC0312o2.f3866e.f3848j && !(abstractC0312o2 instanceof C0300c) && !(abstractC0312o2 instanceof C0306i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0296e3.M(j2);
                        c0296e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0296e3.f3714p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0296e3.q() + r2;
                c0296e3.d.i.d(q42);
                c0296e3.d.f3866e.d(q42 - r2);
                c0302e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0296e3.k() + s2;
                c0296e3.f3695e.i.d(k32);
                c0296e3.f3695e.f3866e.d(k32 - s2);
                c0302e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0296e3.M(j2);
                c0296e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0321f = c0321f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0302e.f3837b;
                C0296e c0296e4 = c0302e.f3836a;
                if (z11) {
                    Iterator it5 = c0296e4.f3736q0.iterator();
                    while (it5.hasNext()) {
                        C0295d c0295d3 = (C0295d) it5.next();
                        c0295d3.h();
                        c0295d3.f3688a = false;
                        C0308k c0308k2 = c0295d3.d;
                        c0308k2.f3866e.f3848j = false;
                        c0308k2.f3868g = false;
                        c0308k2.n();
                        C0310m c0310m2 = c0295d3.f3695e;
                        c0310m2.f3866e.f3848j = false;
                        c0310m2.f3868g = false;
                        c0310m2.m();
                    }
                    i13 = 0;
                    c0296e4.h();
                    c0296e4.f3688a = false;
                    C0308k c0308k3 = c0296e4.d;
                    c0308k3.f3866e.f3848j = false;
                    c0308k3.f3868g = false;
                    c0308k3.n();
                    C0310m c0310m3 = c0296e4.f3695e;
                    c0310m3.f3866e.f3848j = false;
                    c0310m3.f3868g = false;
                    c0310m3.m();
                    c0302e.c();
                } else {
                    i13 = 0;
                }
                c0302e.b(c0302e.d);
                c0296e4.f3686Y = i13;
                c0296e4.f3687Z = i13;
                c0296e4.d.h.d(i13);
                c0296e4.f3695e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0296e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0296e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0296e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0321f = c0321f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0296e2.D0;
        if (size3 > 0) {
            int size4 = c0296e2.f3736q0.size();
            boolean W2 = c0296e2.W(64);
            C0321f c0321f6 = c0296e2.f3740u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0295d c0295d4 = (C0295d) c0296e2.f3736q0.get(i31);
                if (!(c0295d4 instanceof h) && !(c0295d4 instanceof C0292a) && !c0295d4.F && (!W2 || (c0308k = c0295d4.d) == null || (c0310m = c0295d4.f3695e) == null || !c0308k.f3866e.f3848j || !c0310m.f3866e.f3848j)) {
                    int j4 = c0295d4.j(0);
                    int j5 = c0295d4.j(1);
                    boolean z12 = j4 == 3 && c0295d4.f3716r != 1 && j5 == 3 && c0295d4.f3717s != 1;
                    if (!z12 && c0296e2.W(1) && !(c0295d4 instanceof g)) {
                        if (j4 == 3 && c0295d4.f3716r == 0 && j5 != 3 && !c0295d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0295d4.f3717s == 0 && j4 != 3 && !c0295d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0295d4.f3684W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0011l.q(0, c0295d4, c0321f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0321f6.f3988a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1288b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0318c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0011l.w(c0296e2);
        ArrayList arrayList4 = (ArrayList) c0011l.f415b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0011l.u(c0296e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0296e2.f3714p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0296e.q();
            C0296e c0296e5 = (C0296e) c0011l.d;
            int max7 = Math.max(q5, c0296e5.f3691b0);
            int max8 = Math.max(c0296e.k(), c0296e5.f3693c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0295d c0295d5 = (C0295d) arrayList4.get(i36);
                if (c0295d5 instanceof g) {
                    int q6 = c0295d5.q();
                    int k4 = c0295d5.k();
                    i12 = i30;
                    c0321f3 = c0321f;
                    boolean q7 = z15 | c0011l.q(1, c0295d5, c0321f3);
                    int q8 = c0295d5.q();
                    int k5 = c0295d5.k();
                    if (q8 != q6) {
                        c0295d5.O(q8);
                        if (z13 && c0295d5.r() + c0295d5.f3682U > max7) {
                            max7 = Math.max(max7, c0295d5.i(4).e() + c0295d5.r() + c0295d5.f3682U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0295d5.L(k5);
                        if (z14 && c0295d5.s() + c0295d5.f3683V > max8) {
                            max8 = Math.max(max8, c0295d5.i(5).e() + c0295d5.s() + c0295d5.f3683V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0295d5).y0 | z4;
                } else {
                    i12 = i30;
                    c0321f3 = c0321f;
                }
                i36++;
                c0321f = c0321f3;
                i30 = i12;
            }
            int i37 = i30;
            C0321f c0321f7 = c0321f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0295d c0295d6 = (C0295d) arrayList4.get(i39);
                    if (((c0295d6 instanceof i) && !(c0295d6 instanceof g)) || (c0295d6 instanceof h) || c0295d6.f3700g0 == 8 || ((z2 && c0295d6.d.f3866e.f3848j && c0295d6.f3695e.f3866e.f3848j) || (c0295d6 instanceof g))) {
                        c0321f2 = c0321f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0295d6.q();
                        int k6 = c0295d6.k();
                        arrayList = arrayList4;
                        int i40 = c0295d6.f3689a0;
                        i11 = size6;
                        boolean q10 = c0011l.q(i38 == 1 ? 2 : 1, c0295d6, c0321f7) | z15;
                        int q11 = c0295d6.q();
                        c0321f2 = c0321f7;
                        int k7 = c0295d6.k();
                        if (q11 != q9) {
                            c0295d6.O(q11);
                            if (z13 && c0295d6.r() + c0295d6.f3682U > max7) {
                                max7 = Math.max(max7, c0295d6.i(4).e() + c0295d6.r() + c0295d6.f3682U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0295d6.L(k7);
                            if (z14 && c0295d6.s() + c0295d6.f3683V > max8) {
                                max8 = Math.max(max8, c0295d6.i(5).e() + c0295d6.s() + c0295d6.f3683V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0295d6.f3667E || i40 == c0295d6.f3689a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0321f7 = c0321f2;
                }
                C0321f c0321f8 = c0321f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0011l.u(c0296e, i38, i34, i35);
                c0321f7 = c0321f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0296e2 = c0296e;
            i30 = i37;
        }
        c0296e2.D0 = i30;
        C0283c.f3484p = c0296e2.W(512);
    }

    public final void l(C0295d c0295d, C0320e c0320e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1287a.get(i);
        C0295d c0295d2 = (C0295d) sparseArray.get(i);
        if (c0295d2 == null || view == null || !(view.getLayoutParams() instanceof C0320e)) {
            return;
        }
        c0320e.f3956c0 = true;
        if (i2 == 6) {
            C0320e c0320e2 = (C0320e) view.getLayoutParams();
            c0320e2.f3956c0 = true;
            c0320e2.f3977p0.f3667E = true;
        }
        c0295d.i(6).b(c0295d2.i(i2), c0320e.f3929D, c0320e.f3928C, true);
        c0295d.f3667E = true;
        c0295d.i(3).j();
        c0295d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0320e c0320e = (C0320e) childAt.getLayoutParams();
            C0295d c0295d = c0320e.f3977p0;
            if (childAt.getVisibility() != 8 || c0320e.f3957d0 || c0320e.f3959e0 || isInEditMode) {
                int r2 = c0295d.r();
                int s2 = c0295d.s();
                childAt.layout(r2, s2, c0295d.q() + r2, c0295d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1288b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0318c) arrayList.get(i6)).getClass();
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
        C0295d c0295d;
        int i5;
        C0295d c0295d2;
        int i6;
        C0295d c0295d3;
        int i7;
        C0320e c0320e;
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
        C0295d c0295d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1299p == i) {
            int i12 = constraintLayout.f1300q;
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
        constraintLayout.f1299p = i;
        constraintLayout.f1300q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0296e c0296e = constraintLayout.f1289c;
        c0296e.f3741v0 = z3;
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
                    C0295d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1296m == null) {
                                    constraintLayout.f1296m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1296m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1287a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0295d4 = view == null ? null : ((C0320e) view.getLayoutParams()).f3977p0;
                                c0295d4.f3701h0 = resourceName;
                            }
                        }
                        c0295d4 = c0296e;
                        c0295d4.f3701h0 = resourceName;
                    }
                }
                if (constraintLayout.f1295l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1293j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0296e.f3736q0.clear();
                ArrayList arrayList3 = constraintLayout.f1288b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0318c abstractC0318c = (AbstractC0318c) arrayList3.get(i19);
                        if (abstractC0318c.isInEditMode()) {
                            abstractC0318c.setIds(abstractC0318c.f3922e);
                        }
                        i iVar = abstractC0318c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3799r0 = i13;
                            Arrays.fill(iVar.f3798q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0318c.f3920b) {
                                int i21 = abstractC0318c.f3919a[i20];
                                View view2 = (View) constraintLayout.f1287a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0318c.f3924g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0318c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0318c.f3919a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1287a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0318c.d;
                                    C0295d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3799r0 + 1;
                                        C0295d[] c0295dArr = iVar2.f3798q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0295dArr.length) {
                                            iVar2.f3798q0 = (C0295d[]) Arrays.copyOf(c0295dArr, c0295dArr.length * 2);
                                        }
                                        C0295d[] c0295dArr2 = iVar2.f3798q0;
                                        int i23 = iVar2.f3799r0;
                                        c0295dArr2[i23] = h2;
                                        iVar2.f3799r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0318c.d.S();
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
                SparseArray sparseArray = constraintLayout.f1297n;
                sparseArray.clear();
                sparseArray.put(0, c0296e);
                sparseArray.put(getId(), c0296e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0295d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0320e c0320e2 = (C0320e) childAt3.getLayoutParams();
                        c0296e.f3736q0.add(h3);
                        C0295d c0295d5 = h3.f3681T;
                        if (c0295d5 != null) {
                            ((C0296e) c0295d5).f3736q0.remove(h3);
                            h3.C();
                        }
                        h3.f3681T = c0296e;
                        c0320e2.a();
                        h3.f3700g0 = childAt3.getVisibility();
                        h3.f3698f0 = childAt3;
                        if (childAt3 instanceof AbstractC0318c) {
                            ((AbstractC0318c) childAt3).h(h3, c0296e.f3741v0);
                        }
                        if (c0320e2.f3957d0) {
                            h hVar = (h) h3;
                            int i27 = c0320e2.f3972m0;
                            int i28 = c0320e2.n0;
                            float f4 = c0320e2.f3975o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f3792q0 = f4;
                                    hVar.f3793r0 = -1;
                                    hVar.f3794s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f3792q0 = -1.0f;
                                    hVar.f3793r0 = i27;
                                    hVar.f3794s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f3792q0 = -1.0f;
                                hVar.f3793r0 = -1;
                                hVar.f3794s0 = i28;
                            }
                        } else {
                            int i29 = c0320e2.f3961f0;
                            int i30 = c0320e2.f3963g0;
                            int i31 = c0320e2.f3964h0;
                            int i32 = c0320e2.f3965i0;
                            int i33 = c0320e2.j0;
                            i3 = childCount3;
                            int i34 = c0320e2.f3968k0;
                            float f5 = c0320e2.f3970l0;
                            int i35 = c0320e2.f3976p;
                            if (i35 != -1) {
                                C0295d c0295d6 = (C0295d) sparseArray.get(i35);
                                if (c0295d6 != null) {
                                    float f6 = c0320e2.f3979r;
                                    h3.v(7, 7, c0320e2.f3978q, 0, c0295d6);
                                    h3.f3666D = f6;
                                }
                                c0320e = c0320e2;
                            } else {
                                if (i29 != -1) {
                                    C0295d c0295d7 = (C0295d) sparseArray.get(i29);
                                    if (c0295d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0320e2).leftMargin, i33, c0295d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0295d c0295d8 = (C0295d) sparseArray.get(i30);
                                        if (c0295d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0320e2).leftMargin, i33, c0295d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0295d c0295d9 = (C0295d) sparseArray.get(i31);
                                        if (c0295d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0320e2).rightMargin, i34, c0295d9);
                                        }
                                    } else if (i32 != i4 && (c0295d = (C0295d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0320e2).rightMargin, i34, c0295d);
                                    }
                                    i5 = c0320e2.i;
                                    if (i5 == -1) {
                                        C0295d c0295d10 = (C0295d) sparseArray.get(i5);
                                        if (c0295d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0320e2).topMargin, c0320e2.f3985x, c0295d10);
                                        }
                                    } else {
                                        int i36 = c0320e2.f3966j;
                                        if (i36 != -1 && (c0295d2 = (C0295d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0320e2).topMargin, c0320e2.f3985x, c0295d2);
                                        }
                                    }
                                    i6 = c0320e2.f3967k;
                                    if (i6 == -1) {
                                        C0295d c0295d11 = (C0295d) sparseArray.get(i6);
                                        if (c0295d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0320e2).bottomMargin, c0320e2.f3987z, c0295d11);
                                        }
                                    } else {
                                        int i37 = c0320e2.f3969l;
                                        if (i37 != -1 && (c0295d3 = (C0295d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0320e2).bottomMargin, c0320e2.f3987z, c0295d3);
                                        }
                                    }
                                    i7 = c0320e2.f3971m;
                                    if (i7 == -1) {
                                        c0320e = c0320e2;
                                        l(h3, c0320e2, sparseArray, i7, 6);
                                    } else {
                                        c0320e = c0320e2;
                                        int i38 = c0320e.f3973n;
                                        if (i38 != -1) {
                                            l(h3, c0320e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0320e.f3974o;
                                            if (i39 != -1) {
                                                l(h3, c0320e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3694d0 = f5;
                                    }
                                    f2 = c0320e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f3696e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0320e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0320e2.f3967k;
                                if (i6 == -1) {
                                }
                                i7 = c0320e2.f3971m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0320e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0320e.f3944T) != -1 || c0320e.f3945U != -1)) {
                                int i40 = c0320e.f3945U;
                                h3.f3686Y = i11;
                                h3.f3687Z = i40;
                            }
                            if (c0320e.f3952a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0320e).width);
                                if (((ViewGroup.MarginLayoutParams) c0320e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0320e).width == -1) {
                                if (c0320e.f3947W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3662g = ((ViewGroup.MarginLayoutParams) c0320e).leftMargin;
                                h3.i(4).f3662g = ((ViewGroup.MarginLayoutParams) c0320e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0320e.f3954b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0320e).height);
                                if (((ViewGroup.MarginLayoutParams) c0320e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0320e).height == -1) {
                                    if (c0320e.f3948X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3662g = ((ViewGroup.MarginLayoutParams) c0320e).topMargin;
                                    h3.i(5).f3662g = ((ViewGroup.MarginLayoutParams) c0320e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0320e.f3931G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3684W = 0.0f;
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
                                    h3.f3684W = parseFloat;
                                    h3.f3685X = i9;
                                }
                            }
                            float f7 = c0320e.f3932H;
                            float[] fArr = h3.f3705k0;
                            fArr[0] = f7;
                            fArr[1] = c0320e.f3933I;
                            h3.f3702i0 = c0320e.f3934J;
                            h3.j0 = c0320e.f3935K;
                            int i41 = c0320e.f3950Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3715q = i41;
                            }
                            int i42 = c0320e.f3936L;
                            int i43 = c0320e.f3938N;
                            int i44 = c0320e.f3940P;
                            float f8 = c0320e.f3942R;
                            h3.f3716r = i42;
                            h3.f3719u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3720v = i44;
                            h3.f3721w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3716r = 2;
                            }
                            int i45 = c0320e.f3937M;
                            int i46 = c0320e.f3939O;
                            int i47 = c0320e.f3941Q;
                            float f9 = c0320e.f3943S;
                            h3.f3717s = i45;
                            h3.f3722x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3723y = i47;
                            h3.f3724z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3717s = 2;
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
                c0296e.f3737r0.w(c0296e);
            }
        }
        k(c0296e, this.i, i, i2);
        int q2 = c0296e.q();
        int k2 = c0296e.k();
        boolean z4 = c0296e.f3728E0;
        boolean z5 = c0296e.f3729F0;
        C0321f c0321f = this.f1298o;
        int i48 = c0321f.f3991e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0321f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1291f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1292g, resolveSizeAndState2);
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
        C0295d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0320e c0320e = (C0320e) view.getLayoutParams();
            h hVar = new h();
            c0320e.f3977p0 = hVar;
            c0320e.f3957d0 = true;
            hVar.S(c0320e.f3946V);
        }
        if (view instanceof AbstractC0318c) {
            AbstractC0318c abstractC0318c = (AbstractC0318c) view;
            abstractC0318c.i();
            ((C0320e) view.getLayoutParams()).f3959e0 = true;
            ArrayList arrayList = this.f1288b;
            if (!arrayList.contains(abstractC0318c)) {
                arrayList.add(abstractC0318c);
            }
        }
        this.f1287a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1287a.remove(view.getId());
        C0295d h = h(view);
        this.f1289c.f3736q0.remove(h);
        h.C();
        this.f1288b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1293j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1287a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1292g) {
            return;
        }
        this.f1292g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1291f) {
            return;
        }
        this.f1291f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1290e) {
            return;
        }
        this.f1290e = i;
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
        j jVar = this.f1294k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0296e c0296e = this.f1289c;
        c0296e.D0 = i;
        C0283c.f3484p = c0296e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1287a = new SparseArray();
        this.f1288b = new ArrayList(4);
        this.f1289c = new C0296e();
        this.d = 0;
        this.f1290e = 0;
        this.f1291f = Integer.MAX_VALUE;
        this.f1292g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1293j = null;
        this.f1294k = null;
        this.f1295l = -1;
        this.f1296m = new HashMap();
        this.f1297n = new SparseArray();
        this.f1298o = new C0321f(this, this);
        this.f1299p = 0;
        this.f1300q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0320e c0320e = new C0320e(layoutParams);
        c0320e.f3951a = -1;
        c0320e.f3953b = -1;
        c0320e.f3955c = -1.0f;
        c0320e.d = true;
        c0320e.f3958e = -1;
        c0320e.f3960f = -1;
        c0320e.f3962g = -1;
        c0320e.h = -1;
        c0320e.i = -1;
        c0320e.f3966j = -1;
        c0320e.f3967k = -1;
        c0320e.f3969l = -1;
        c0320e.f3971m = -1;
        c0320e.f3973n = -1;
        c0320e.f3974o = -1;
        c0320e.f3976p = -1;
        c0320e.f3978q = 0;
        c0320e.f3979r = 0.0f;
        c0320e.f3980s = -1;
        c0320e.f3981t = -1;
        c0320e.f3982u = -1;
        c0320e.f3983v = -1;
        c0320e.f3984w = Integer.MIN_VALUE;
        c0320e.f3985x = Integer.MIN_VALUE;
        c0320e.f3986y = Integer.MIN_VALUE;
        c0320e.f3987z = Integer.MIN_VALUE;
        c0320e.f3926A = Integer.MIN_VALUE;
        c0320e.f3927B = Integer.MIN_VALUE;
        c0320e.f3928C = Integer.MIN_VALUE;
        c0320e.f3929D = 0;
        c0320e.f3930E = 0.5f;
        c0320e.F = 0.5f;
        c0320e.f3931G = null;
        c0320e.f3932H = -1.0f;
        c0320e.f3933I = -1.0f;
        c0320e.f3934J = 0;
        c0320e.f3935K = 0;
        c0320e.f3936L = 0;
        c0320e.f3937M = 0;
        c0320e.f3938N = 0;
        c0320e.f3939O = 0;
        c0320e.f3940P = 0;
        c0320e.f3941Q = 0;
        c0320e.f3942R = 1.0f;
        c0320e.f3943S = 1.0f;
        c0320e.f3944T = -1;
        c0320e.f3945U = -1;
        c0320e.f3946V = -1;
        c0320e.f3947W = false;
        c0320e.f3948X = false;
        c0320e.f3949Y = null;
        c0320e.f3950Z = 0;
        c0320e.f3952a0 = true;
        c0320e.f3954b0 = true;
        c0320e.f3956c0 = false;
        c0320e.f3957d0 = false;
        c0320e.f3959e0 = false;
        c0320e.f3961f0 = -1;
        c0320e.f3963g0 = -1;
        c0320e.f3964h0 = -1;
        c0320e.f3965i0 = -1;
        c0320e.j0 = Integer.MIN_VALUE;
        c0320e.f3968k0 = Integer.MIN_VALUE;
        c0320e.f3970l0 = 0.5f;
        c0320e.f3977p0 = new C0295d();
        return c0320e;
    }
}

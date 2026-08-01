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
import s.C0290a;
import s.C0293d;
import s.C0294e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0310o;
import t.C0298c;
import t.C0300e;
import t.C0304i;
import t.C0306k;
import t.C0308m;
import v.AbstractC0316c;
import v.AbstractC0317d;
import v.C0318e;
import v.C0319f;
import v.C0320g;
import v.C0321h;
import v.o;
import v.p;
import v.q;
import v.s;
import v.t;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static t f1356r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1357a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1358b;

    /* renamed from: c, reason: collision with root package name */
    public final C0294e f1359c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1360e;

    /* renamed from: f, reason: collision with root package name */
    public int f1361f;

    /* renamed from: g, reason: collision with root package name */
    public int f1362g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public o f1363j;

    /* renamed from: k, reason: collision with root package name */
    public j f1364k;

    /* renamed from: l, reason: collision with root package name */
    public int f1365l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1366m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1367n;

    /* renamed from: o, reason: collision with root package name */
    public final C0319f f1368o;

    /* renamed from: p, reason: collision with root package name */
    public int f1369p;

    /* renamed from: q, reason: collision with root package name */
    public int f1370q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1357a = new SparseArray();
        this.f1358b = new ArrayList(4);
        this.f1359c = new C0294e();
        this.d = 0;
        this.f1360e = 0;
        this.f1361f = Integer.MAX_VALUE;
        this.f1362g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1363j = null;
        this.f1364k = null;
        this.f1365l = -1;
        this.f1366m = new HashMap();
        this.f1367n = new SparseArray();
        this.f1368o = new C0319f(this, this);
        this.f1369p = 0;
        this.f1370q = 0;
        i(attributeSet, 0);
    }

    public static C0318e g() {
        C0318e c0318e = new C0318e(-2, -2);
        c0318e.f3870a = -1;
        c0318e.f3872b = -1;
        c0318e.f3874c = -1.0f;
        c0318e.d = true;
        c0318e.f3877e = -1;
        c0318e.f3879f = -1;
        c0318e.f3881g = -1;
        c0318e.h = -1;
        c0318e.i = -1;
        c0318e.f3885j = -1;
        c0318e.f3887k = -1;
        c0318e.f3889l = -1;
        c0318e.f3891m = -1;
        c0318e.f3893n = -1;
        c0318e.f3894o = -1;
        c0318e.f3896p = -1;
        c0318e.f3898q = 0;
        c0318e.f3899r = 0.0f;
        c0318e.f3900s = -1;
        c0318e.f3901t = -1;
        c0318e.f3902u = -1;
        c0318e.f3903v = -1;
        c0318e.f3904w = Integer.MIN_VALUE;
        c0318e.f3905x = Integer.MIN_VALUE;
        c0318e.f3906y = Integer.MIN_VALUE;
        c0318e.f3907z = Integer.MIN_VALUE;
        c0318e.f3845A = Integer.MIN_VALUE;
        c0318e.f3846B = Integer.MIN_VALUE;
        c0318e.f3847C = Integer.MIN_VALUE;
        c0318e.f3848D = 0;
        c0318e.f3849E = 0.5f;
        c0318e.F = 0.5f;
        c0318e.f3850G = null;
        c0318e.f3851H = -1.0f;
        c0318e.f3852I = -1.0f;
        c0318e.f3853J = 0;
        c0318e.f3854K = 0;
        c0318e.f3855L = 0;
        c0318e.f3856M = 0;
        c0318e.f3857N = 0;
        c0318e.f3858O = 0;
        c0318e.f3859P = 0;
        c0318e.f3860Q = 0;
        c0318e.f3861R = 1.0f;
        c0318e.f3862S = 1.0f;
        c0318e.f3863T = -1;
        c0318e.f3864U = -1;
        c0318e.f3865V = -1;
        c0318e.f3866W = false;
        c0318e.f3867X = false;
        c0318e.f3868Y = null;
        c0318e.f3869Z = 0;
        c0318e.f3871a0 = true;
        c0318e.f3873b0 = true;
        c0318e.f3875c0 = false;
        c0318e.f3876d0 = false;
        c0318e.f3878e0 = false;
        c0318e.f3880f0 = -1;
        c0318e.f3882g0 = -1;
        c0318e.f3883h0 = -1;
        c0318e.f3884i0 = -1;
        c0318e.f3886j0 = Integer.MIN_VALUE;
        c0318e.f3888k0 = Integer.MIN_VALUE;
        c0318e.f3890l0 = 0.5f;
        c0318e.f3897p0 = new C0293d();
        return c0318e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static t getSharedValues() {
        if (f1356r == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            f1356r = tVar;
        }
        return f1356r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0318e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1358b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0316c) arrayList.get(i)).getClass();
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
        C0318e c0318e = new C0318e(context, attributeSet);
        c0318e.f3870a = -1;
        c0318e.f3872b = -1;
        c0318e.f3874c = -1.0f;
        c0318e.d = true;
        c0318e.f3877e = -1;
        c0318e.f3879f = -1;
        c0318e.f3881g = -1;
        c0318e.h = -1;
        c0318e.i = -1;
        c0318e.f3885j = -1;
        c0318e.f3887k = -1;
        c0318e.f3889l = -1;
        c0318e.f3891m = -1;
        c0318e.f3893n = -1;
        c0318e.f3894o = -1;
        c0318e.f3896p = -1;
        c0318e.f3898q = 0;
        c0318e.f3899r = 0.0f;
        c0318e.f3900s = -1;
        c0318e.f3901t = -1;
        c0318e.f3902u = -1;
        c0318e.f3903v = -1;
        c0318e.f3904w = Integer.MIN_VALUE;
        c0318e.f3905x = Integer.MIN_VALUE;
        c0318e.f3906y = Integer.MIN_VALUE;
        c0318e.f3907z = Integer.MIN_VALUE;
        c0318e.f3845A = Integer.MIN_VALUE;
        c0318e.f3846B = Integer.MIN_VALUE;
        c0318e.f3847C = Integer.MIN_VALUE;
        c0318e.f3848D = 0;
        c0318e.f3849E = 0.5f;
        c0318e.F = 0.5f;
        c0318e.f3850G = null;
        c0318e.f3851H = -1.0f;
        c0318e.f3852I = -1.0f;
        c0318e.f3853J = 0;
        c0318e.f3854K = 0;
        c0318e.f3855L = 0;
        c0318e.f3856M = 0;
        c0318e.f3857N = 0;
        c0318e.f3858O = 0;
        c0318e.f3859P = 0;
        c0318e.f3860Q = 0;
        c0318e.f3861R = 1.0f;
        c0318e.f3862S = 1.0f;
        c0318e.f3863T = -1;
        c0318e.f3864U = -1;
        c0318e.f3865V = -1;
        c0318e.f3866W = false;
        c0318e.f3867X = false;
        c0318e.f3868Y = null;
        c0318e.f3869Z = 0;
        c0318e.f3871a0 = true;
        c0318e.f3873b0 = true;
        c0318e.f3875c0 = false;
        c0318e.f3876d0 = false;
        c0318e.f3878e0 = false;
        c0318e.f3880f0 = -1;
        c0318e.f3882g0 = -1;
        c0318e.f3883h0 = -1;
        c0318e.f3884i0 = -1;
        c0318e.f3886j0 = Integer.MIN_VALUE;
        c0318e.f3888k0 = Integer.MIN_VALUE;
        c0318e.f3890l0 = 0.5f;
        c0318e.f3897p0 = new C0293d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4026b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0317d.f3844a.get(index);
            switch (i2) {
                case 1:
                    c0318e.f3865V = obtainStyledAttributes.getInt(index, c0318e.f3865V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0318e.f3896p);
                    c0318e.f3896p = resourceId;
                    if (resourceId == -1) {
                        c0318e.f3896p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0318e.f3898q = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3898q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0318e.f3899r) % 360.0f;
                    c0318e.f3899r = f2;
                    if (f2 < 0.0f) {
                        c0318e.f3899r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0318e.f3870a = obtainStyledAttributes.getDimensionPixelOffset(index, c0318e.f3870a);
                    break;
                case 6:
                    c0318e.f3872b = obtainStyledAttributes.getDimensionPixelOffset(index, c0318e.f3872b);
                    break;
                case 7:
                    c0318e.f3874c = obtainStyledAttributes.getFloat(index, c0318e.f3874c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0318e.f3877e);
                    c0318e.f3877e = resourceId2;
                    if (resourceId2 == -1) {
                        c0318e.f3877e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0318e.f3879f);
                    c0318e.f3879f = resourceId3;
                    if (resourceId3 == -1) {
                        c0318e.f3879f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0318e.f3881g);
                    c0318e.f3881g = resourceId4;
                    if (resourceId4 == -1) {
                        c0318e.f3881g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0318e.h);
                    c0318e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0318e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0318e.i);
                    c0318e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0318e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0318e.f3885j);
                    c0318e.f3885j = resourceId7;
                    if (resourceId7 == -1) {
                        c0318e.f3885j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0318e.f3887k);
                    c0318e.f3887k = resourceId8;
                    if (resourceId8 == -1) {
                        c0318e.f3887k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0318e.f3889l);
                    c0318e.f3889l = resourceId9;
                    if (resourceId9 == -1) {
                        c0318e.f3889l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0318e.f3891m);
                    c0318e.f3891m = resourceId10;
                    if (resourceId10 == -1) {
                        c0318e.f3891m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0318e.f3900s);
                    c0318e.f3900s = resourceId11;
                    if (resourceId11 == -1) {
                        c0318e.f3900s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0318e.f3901t);
                    c0318e.f3901t = resourceId12;
                    if (resourceId12 == -1) {
                        c0318e.f3901t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0318e.f3902u);
                    c0318e.f3902u = resourceId13;
                    if (resourceId13 == -1) {
                        c0318e.f3902u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0318e.f3903v);
                    c0318e.f3903v = resourceId14;
                    if (resourceId14 == -1) {
                        c0318e.f3903v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0318e.f3904w = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3904w);
                    break;
                case 22:
                    c0318e.f3905x = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3905x);
                    break;
                case 23:
                    c0318e.f3906y = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3906y);
                    break;
                case 24:
                    c0318e.f3907z = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3907z);
                    break;
                case 25:
                    c0318e.f3845A = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3845A);
                    break;
                case 26:
                    c0318e.f3846B = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3846B);
                    break;
                case 27:
                    c0318e.f3866W = obtainStyledAttributes.getBoolean(index, c0318e.f3866W);
                    break;
                case 28:
                    c0318e.f3867X = obtainStyledAttributes.getBoolean(index, c0318e.f3867X);
                    break;
                case 29:
                    c0318e.f3849E = obtainStyledAttributes.getFloat(index, c0318e.f3849E);
                    break;
                case 30:
                    c0318e.F = obtainStyledAttributes.getFloat(index, c0318e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0318e.f3855L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0318e.f3856M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0318e.f3857N = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3857N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0318e.f3857N) == -2) {
                            c0318e.f3857N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0318e.f3859P = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3859P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0318e.f3859P) == -2) {
                            c0318e.f3859P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0318e.f3861R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0318e.f3861R));
                    c0318e.f3855L = 2;
                    break;
                case 36:
                    try {
                        c0318e.f3858O = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3858O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0318e.f3858O) == -2) {
                            c0318e.f3858O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0318e.f3860Q = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3860Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0318e.f3860Q) == -2) {
                            c0318e.f3860Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0318e.f3862S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0318e.f3862S));
                    c0318e.f3856M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            o.h(c0318e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0318e.f3851H = obtainStyledAttributes.getFloat(index, c0318e.f3851H);
                            break;
                        case 46:
                            c0318e.f3852I = obtainStyledAttributes.getFloat(index, c0318e.f3852I);
                            break;
                        case 47:
                            c0318e.f3853J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0318e.f3854K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0318e.f3863T = obtainStyledAttributes.getDimensionPixelOffset(index, c0318e.f3863T);
                            break;
                        case 50:
                            c0318e.f3864U = obtainStyledAttributes.getDimensionPixelOffset(index, c0318e.f3864U);
                            break;
                        case 51:
                            c0318e.f3868Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0318e.f3893n);
                            c0318e.f3893n = resourceId15;
                            if (resourceId15 == -1) {
                                c0318e.f3893n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0318e.f3894o);
                            c0318e.f3894o = resourceId16;
                            if (resourceId16 == -1) {
                                c0318e.f3894o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0318e.f3848D = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3848D);
                            break;
                        case 55:
                            c0318e.f3847C = obtainStyledAttributes.getDimensionPixelSize(index, c0318e.f3847C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    o.g(c0318e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(c0318e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0318e.f3869Z = obtainStyledAttributes.getInt(index, c0318e.f3869Z);
                                    break;
                                case 67:
                                    c0318e.d = obtainStyledAttributes.getBoolean(index, c0318e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0318e.a();
        return c0318e;
    }

    public int getMaxHeight() {
        return this.f1362g;
    }

    public int getMaxWidth() {
        return this.f1361f;
    }

    public int getMinHeight() {
        return this.f1360e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1359c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0294e c0294e = this.f1359c;
        if (c0294e.f3565j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0294e.f3565j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0294e.f3565j = "parent";
            }
        }
        if (c0294e.f3563h0 == null) {
            c0294e.f3563h0 = c0294e.f3565j;
            Log.v("ConstraintLayout", " setDebugName " + c0294e.f3563h0);
        }
        Iterator it = c0294e.f3599q0.iterator();
        while (it.hasNext()) {
            C0293d c0293d = (C0293d) it.next();
            View view = c0293d.f3560f0;
            if (view != null) {
                if (c0293d.f3565j == null && (id = view.getId()) != -1) {
                    c0293d.f3565j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0293d.f3563h0 == null) {
                    c0293d.f3563h0 = c0293d.f3565j;
                    Log.v("ConstraintLayout", " setDebugName " + c0293d.f3563h0);
                }
            }
        }
        c0294e.n(sb);
        return sb.toString();
    }

    public final C0293d h(View view) {
        if (view == this) {
            return this.f1359c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0318e) {
            return ((C0318e) view.getLayoutParams()).f3897p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0318e) {
            return ((C0318e) view.getLayoutParams()).f3897p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0294e c0294e = this.f1359c;
        c0294e.f3560f0 = this;
        C0319f c0319f = this.f1368o;
        c0294e.f3603u0 = c0319f;
        c0294e.f3601s0.f3695f = c0319f;
        this.f1357a.put(getId(), this);
        this.f1363j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f4026b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1360e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1360e);
                } else if (index == 14) {
                    this.f1361f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1361f);
                } else if (index == 15) {
                    this.f1362g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1362g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1364k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.f1363j = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1363j = null;
                    }
                    this.f1365l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0294e.D0 = this.i;
        C0283c.f3462p = c0294e.W(512);
    }

    public final void j(int i) {
        int eventType;
        C0320g c0320g;
        Context context = getContext();
        j jVar = new j(18, false);
        jVar.f25b = new SparseArray();
        jVar.f26c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            c0320g = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1364k = jVar;
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
                    c0320g = new C0320g(context, xml);
                    ((SparseArray) jVar.f25b).put(c0320g.f3914a, c0320g);
                } else if (c2 == 3) {
                    C0321h c0321h = new C0321h(context, xml);
                    if (c0320g != null) {
                        ((ArrayList) c0320g.f3916c).add(c0321h);
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
    public final void k(C0294e c0294e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0319f c0319f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0319f c0319f2;
        int i12;
        C0319f c0319f3;
        boolean z4;
        C0306k c0306k;
        C0308m c0308m;
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
        C0294e c0294e2 = c0294e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0319f c0319f4 = this.f1368o;
        c0319f4.f3909b = max3;
        c0319f4.f3910c = max4;
        c0319f4.d = paddingWidth;
        c0319f4.f3911e = i19;
        c0319f4.f3912f = i2;
        c0319f4.f3913g = i3;
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
        int i23 = c0319f4.f3911e;
        int i24 = c0319f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1361f - i24, i21);
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
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1362g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1360e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1360e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0294e.q();
        C0300e c0300e = c0294e2.f3601s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0294e.k()) {
            c0300e.f3693c = true;
        }
        c0294e2.f3548Y = 0;
        c0294e2.f3549Z = 0;
        int i26 = this.f1361f - i24;
        int[] iArr = c0294e2.f3527C;
        iArr[0] = i26;
        iArr[1] = this.f1362g - i23;
        c0294e2.f3553b0 = 0;
        c0294e2.f3555c0 = 0;
        c0294e2.M(i20);
        c0294e2.O(i25);
        c0294e2.N(i6);
        c0294e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0294e2.f3553b0 = 0;
        } else {
            c0294e2.f3553b0 = i27;
        }
        int i28 = this.f1360e - i23;
        if (i28 < 0) {
            c0294e2.f3555c0 = 0;
        } else {
            c0294e2.f3555c0 = i28;
        }
        c0294e2.f3606x0 = max5;
        c0294e2.y0 = max3;
        C0011l c0011l = c0294e2.f3600r0;
        c0011l.getClass();
        C0319f c0319f5 = c0294e2.f3603u0;
        int size3 = c0294e2.f3599q0.size();
        int q3 = c0294e.q();
        int k2 = c0294e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0293d c0293d = (C0293d) c0294e2.f3599q0.get(i29);
                int[] iArr2 = c0293d.f3577p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0293d.f3546W > 0.0f;
                if ((c0293d.x() && z8) || ((c0293d.y() && z8) || (c0293d instanceof g) || c0293d.x() || c0293d.y())) {
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
            if (mode == 1073741824 && c0294e.q() != min) {
                c0294e2.O(min);
                c0294e2.f3601s0.f3692b = true;
            }
            if (mode2 == 1073741824 && c0294e.k() != min2) {
                c0294e2.L(min2);
                c0294e2.f3601s0.f3692b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0300e.f3692b;
                C0294e c0294e3 = c0300e.f3691a;
                if (z10 || c0300e.f3693c) {
                    Iterator it3 = c0294e3.f3599q0.iterator();
                    while (it3.hasNext()) {
                        C0293d c0293d2 = (C0293d) it3.next();
                        c0293d2.h();
                        c0293d2.f3550a = false;
                        c0293d2.d.n();
                        c0293d2.f3557e.m();
                    }
                    i15 = 0;
                    c0294e3.h();
                    c0294e3.f3550a = false;
                    c0294e3.d.n();
                    c0294e3.f3557e.m();
                    c0300e.f3693c = false;
                } else {
                    i15 = 0;
                }
                c0300e.b(c0300e.d);
                c0294e3.f3548Y = i15;
                c0294e3.f3549Z = i15;
                int j2 = c0294e3.j(i15);
                int j3 = c0294e3.j(1);
                if (c0300e.f3692b) {
                    c0300e.c();
                }
                int r2 = c0294e3.r();
                int s2 = c0294e3.s();
                z2 = z9;
                c0294e3.d.h.d(r2);
                c0294e3.f3557e.h.d(s2);
                c0300e.g();
                ArrayList arrayList2 = c0300e.f3694e;
                c0319f = c0319f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0310o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0294e3.M(1);
                        i8 = q3;
                        c0294e3.O(c0300e.d(c0294e3, 0));
                        c0294e3.d.f3721e.d(c0294e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0294e3.N(1);
                        c0294e3.L(c0300e.d(c0294e3, 1));
                        c0294e3.f3557e.f3721e.d(c0294e3.k());
                        int[] iArr3 = c0294e3.f3577p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0294e3.q() + r2;
                            c0294e3.d.i.d(q4);
                            c0294e3.d.f3721e.d(q4 - r2);
                            c0300e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0294e3.k() + s2;
                                c0294e3.f3557e.i.d(k3);
                                c0294e3.f3557e.f3721e.d(k3 - s2);
                            }
                            c0300e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0310o abstractC0310o = (AbstractC0310o) it.next();
                            if (abstractC0310o.f3719b != c0294e3 || abstractC0310o.f3723g) {
                                abstractC0310o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0310o abstractC0310o2 = (AbstractC0310o) it2.next();
                            if (z5 || abstractC0310o2.f3719b != c0294e3) {
                                if (!abstractC0310o2.h.f3703j || ((!abstractC0310o2.i.f3703j && !(abstractC0310o2 instanceof C0304i)) || (!abstractC0310o2.f3721e.f3703j && !(abstractC0310o2 instanceof C0298c) && !(abstractC0310o2 instanceof C0304i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0294e3.M(j2);
                        c0294e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0294e3.f3577p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0294e3.q() + r2;
                c0294e3.d.i.d(q42);
                c0294e3.d.f3721e.d(q42 - r2);
                c0300e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0294e3.k() + s2;
                c0294e3.f3557e.i.d(k32);
                c0294e3.f3557e.f3721e.d(k32 - s2);
                c0300e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0294e3.M(j2);
                c0294e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0319f = c0319f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0300e.f3692b;
                C0294e c0294e4 = c0300e.f3691a;
                if (z11) {
                    Iterator it5 = c0294e4.f3599q0.iterator();
                    while (it5.hasNext()) {
                        C0293d c0293d3 = (C0293d) it5.next();
                        c0293d3.h();
                        c0293d3.f3550a = false;
                        C0306k c0306k2 = c0293d3.d;
                        c0306k2.f3721e.f3703j = false;
                        c0306k2.f3723g = false;
                        c0306k2.n();
                        C0308m c0308m2 = c0293d3.f3557e;
                        c0308m2.f3721e.f3703j = false;
                        c0308m2.f3723g = false;
                        c0308m2.m();
                    }
                    i13 = 0;
                    c0294e4.h();
                    c0294e4.f3550a = false;
                    C0306k c0306k3 = c0294e4.d;
                    c0306k3.f3721e.f3703j = false;
                    c0306k3.f3723g = false;
                    c0306k3.n();
                    C0308m c0308m3 = c0294e4.f3557e;
                    c0308m3.f3721e.f3703j = false;
                    c0308m3.f3723g = false;
                    c0308m3.m();
                    c0300e.c();
                } else {
                    i13 = 0;
                }
                c0300e.b(c0300e.d);
                c0294e4.f3548Y = i13;
                c0294e4.f3549Z = i13;
                c0294e4.d.h.d(i13);
                c0294e4.f3557e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0294e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0294e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0294e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0319f = c0319f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0294e2.D0;
        if (size3 > 0) {
            int size4 = c0294e2.f3599q0.size();
            boolean W2 = c0294e2.W(64);
            C0319f c0319f6 = c0294e2.f3603u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0293d c0293d4 = (C0293d) c0294e2.f3599q0.get(i31);
                if (!(c0293d4 instanceof h) && !(c0293d4 instanceof C0290a) && !c0293d4.F && (!W2 || (c0306k = c0293d4.d) == null || (c0308m = c0293d4.f3557e) == null || !c0306k.f3721e.f3703j || !c0308m.f3721e.f3703j)) {
                    int j4 = c0293d4.j(0);
                    int j5 = c0293d4.j(1);
                    boolean z12 = j4 == 3 && c0293d4.f3579r != 1 && j5 == 3 && c0293d4.f3580s != 1;
                    if (!z12 && c0294e2.W(1) && !(c0293d4 instanceof g)) {
                        if (j4 == 3 && c0293d4.f3579r == 0 && j5 != 3 && !c0293d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0293d4.f3580s == 0 && j4 != 3 && !c0293d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0293d4.f3546W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0011l.q(0, c0293d4, c0319f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0319f6.f3908a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1358b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0316c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0011l.w(c0294e2);
        ArrayList arrayList4 = (ArrayList) c0011l.f475b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0011l.u(c0294e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0294e2.f3577p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0294e.q();
            C0294e c0294e5 = (C0294e) c0011l.d;
            int max7 = Math.max(q5, c0294e5.f3553b0);
            int max8 = Math.max(c0294e.k(), c0294e5.f3555c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0293d c0293d5 = (C0293d) arrayList4.get(i36);
                if (c0293d5 instanceof g) {
                    int q6 = c0293d5.q();
                    int k4 = c0293d5.k();
                    i12 = i30;
                    c0319f3 = c0319f;
                    boolean q7 = z15 | c0011l.q(1, c0293d5, c0319f3);
                    int q8 = c0293d5.q();
                    int k5 = c0293d5.k();
                    if (q8 != q6) {
                        c0293d5.O(q8);
                        if (z13 && c0293d5.r() + c0293d5.f3544U > max7) {
                            max7 = Math.max(max7, c0293d5.i(4).e() + c0293d5.r() + c0293d5.f3544U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0293d5.L(k5);
                        if (z14 && c0293d5.s() + c0293d5.f3545V > max8) {
                            max8 = Math.max(max8, c0293d5.i(5).e() + c0293d5.s() + c0293d5.f3545V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0293d5).y0 | z4;
                } else {
                    i12 = i30;
                    c0319f3 = c0319f;
                }
                i36++;
                c0319f = c0319f3;
                i30 = i12;
            }
            int i37 = i30;
            C0319f c0319f7 = c0319f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0293d c0293d6 = (C0293d) arrayList4.get(i39);
                    if (((c0293d6 instanceof i) && !(c0293d6 instanceof g)) || (c0293d6 instanceof h) || c0293d6.f3562g0 == 8 || ((z2 && c0293d6.d.f3721e.f3703j && c0293d6.f3557e.f3721e.f3703j) || (c0293d6 instanceof g))) {
                        c0319f2 = c0319f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0293d6.q();
                        int k6 = c0293d6.k();
                        arrayList = arrayList4;
                        int i40 = c0293d6.f3551a0;
                        i11 = size6;
                        boolean q10 = c0011l.q(i38 == 1 ? 2 : 1, c0293d6, c0319f7) | z15;
                        int q11 = c0293d6.q();
                        c0319f2 = c0319f7;
                        int k7 = c0293d6.k();
                        if (q11 != q9) {
                            c0293d6.O(q11);
                            if (z13 && c0293d6.r() + c0293d6.f3544U > max7) {
                                max7 = Math.max(max7, c0293d6.i(4).e() + c0293d6.r() + c0293d6.f3544U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0293d6.L(k7);
                            if (z14 && c0293d6.s() + c0293d6.f3545V > max8) {
                                max8 = Math.max(max8, c0293d6.i(5).e() + c0293d6.s() + c0293d6.f3545V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0293d6.f3529E || i40 == c0293d6.f3551a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0319f7 = c0319f2;
                }
                C0319f c0319f8 = c0319f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0011l.u(c0294e, i38, i34, i35);
                c0319f7 = c0319f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0294e2 = c0294e;
            i30 = i37;
        }
        c0294e2.D0 = i30;
        C0283c.f3462p = c0294e2.W(512);
    }

    public final void l(C0293d c0293d, C0318e c0318e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1357a.get(i);
        C0293d c0293d2 = (C0293d) sparseArray.get(i);
        if (c0293d2 == null || view == null || !(view.getLayoutParams() instanceof C0318e)) {
            return;
        }
        c0318e.f3875c0 = true;
        if (i2 == 6) {
            C0318e c0318e2 = (C0318e) view.getLayoutParams();
            c0318e2.f3875c0 = true;
            c0318e2.f3897p0.f3529E = true;
        }
        c0293d.i(6).b(c0293d2.i(i2), c0318e.f3848D, c0318e.f3847C, true);
        c0293d.f3529E = true;
        c0293d.i(3).j();
        c0293d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0318e c0318e = (C0318e) childAt.getLayoutParams();
            C0293d c0293d = c0318e.f3897p0;
            if (childAt.getVisibility() != 8 || c0318e.f3876d0 || c0318e.f3878e0 || isInEditMode) {
                int r2 = c0293d.r();
                int s2 = c0293d.s();
                childAt.layout(r2, s2, c0293d.q() + r2, c0293d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1358b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0316c) arrayList.get(i6)).getClass();
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
        C0293d c0293d;
        int i5;
        C0293d c0293d2;
        int i6;
        C0293d c0293d3;
        int i7;
        C0318e c0318e;
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
        C0293d c0293d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1369p == i) {
            int i12 = constraintLayout.f1370q;
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
        constraintLayout.f1369p = i;
        constraintLayout.f1370q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0294e c0294e = constraintLayout.f1359c;
        c0294e.f3604v0 = z3;
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
                    C0293d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1366m == null) {
                                    constraintLayout.f1366m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1366m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1357a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0293d4 = view == null ? null : ((C0318e) view.getLayoutParams()).f3897p0;
                                c0293d4.f3563h0 = resourceName;
                            }
                        }
                        c0293d4 = c0294e;
                        c0293d4.f3563h0 = resourceName;
                    }
                }
                if (constraintLayout.f1365l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                o oVar = constraintLayout.f1363j;
                if (oVar != null) {
                    oVar.a(constraintLayout);
                }
                c0294e.f3599q0.clear();
                ArrayList arrayList3 = constraintLayout.f1358b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0316c abstractC0316c = (AbstractC0316c) arrayList3.get(i19);
                        if (abstractC0316c.isInEditMode()) {
                            abstractC0316c.setIds(abstractC0316c.f3841e);
                        }
                        i iVar = abstractC0316c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3663r0 = i13;
                            Arrays.fill(iVar.f3662q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0316c.f3839b) {
                                int i21 = abstractC0316c.f3838a[i20];
                                View view2 = (View) constraintLayout.f1357a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0316c.f3843g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0316c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0316c.f3838a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1357a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0316c.d;
                                    C0293d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3663r0 + 1;
                                        C0293d[] c0293dArr = iVar2.f3662q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0293dArr.length) {
                                            iVar2.f3662q0 = (C0293d[]) Arrays.copyOf(c0293dArr, c0293dArr.length * 2);
                                        }
                                        C0293d[] c0293dArr2 = iVar2.f3662q0;
                                        int i23 = iVar2.f3663r0;
                                        c0293dArr2[i23] = h2;
                                        iVar2.f3663r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0316c.d.S();
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
                SparseArray sparseArray = constraintLayout.f1367n;
                sparseArray.clear();
                sparseArray.put(0, c0294e);
                sparseArray.put(getId(), c0294e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0293d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0318e c0318e2 = (C0318e) childAt3.getLayoutParams();
                        c0294e.f3599q0.add(h3);
                        C0293d c0293d5 = h3.f3543T;
                        if (c0293d5 != null) {
                            ((C0294e) c0293d5).f3599q0.remove(h3);
                            h3.C();
                        }
                        h3.f3543T = c0294e;
                        c0318e2.a();
                        h3.f3562g0 = childAt3.getVisibility();
                        h3.f3560f0 = childAt3;
                        if (childAt3 instanceof AbstractC0316c) {
                            ((AbstractC0316c) childAt3).h(h3, c0294e.f3604v0);
                        }
                        if (c0318e2.f3876d0) {
                            h hVar = (h) h3;
                            int i27 = c0318e2.f3892m0;
                            int i28 = c0318e2.n0;
                            float f4 = c0318e2.f3895o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f3656q0 = f4;
                                    hVar.f3657r0 = -1;
                                    hVar.f3658s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f3656q0 = -1.0f;
                                    hVar.f3657r0 = i27;
                                    hVar.f3658s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f3656q0 = -1.0f;
                                hVar.f3657r0 = -1;
                                hVar.f3658s0 = i28;
                            }
                        } else {
                            int i29 = c0318e2.f3880f0;
                            int i30 = c0318e2.f3882g0;
                            int i31 = c0318e2.f3883h0;
                            int i32 = c0318e2.f3884i0;
                            int i33 = c0318e2.f3886j0;
                            i3 = childCount3;
                            int i34 = c0318e2.f3888k0;
                            float f5 = c0318e2.f3890l0;
                            int i35 = c0318e2.f3896p;
                            if (i35 != -1) {
                                C0293d c0293d6 = (C0293d) sparseArray.get(i35);
                                if (c0293d6 != null) {
                                    float f6 = c0318e2.f3899r;
                                    h3.v(7, 7, c0318e2.f3898q, 0, c0293d6);
                                    h3.f3528D = f6;
                                }
                                c0318e = c0318e2;
                            } else {
                                if (i29 != -1) {
                                    C0293d c0293d7 = (C0293d) sparseArray.get(i29);
                                    if (c0293d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0318e2).leftMargin, i33, c0293d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0293d c0293d8 = (C0293d) sparseArray.get(i30);
                                        if (c0293d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0318e2).leftMargin, i33, c0293d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0293d c0293d9 = (C0293d) sparseArray.get(i31);
                                        if (c0293d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0318e2).rightMargin, i34, c0293d9);
                                        }
                                    } else if (i32 != i4 && (c0293d = (C0293d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0318e2).rightMargin, i34, c0293d);
                                    }
                                    i5 = c0318e2.i;
                                    if (i5 == -1) {
                                        C0293d c0293d10 = (C0293d) sparseArray.get(i5);
                                        if (c0293d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0318e2).topMargin, c0318e2.f3905x, c0293d10);
                                        }
                                    } else {
                                        int i36 = c0318e2.f3885j;
                                        if (i36 != -1 && (c0293d2 = (C0293d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0318e2).topMargin, c0318e2.f3905x, c0293d2);
                                        }
                                    }
                                    i6 = c0318e2.f3887k;
                                    if (i6 == -1) {
                                        C0293d c0293d11 = (C0293d) sparseArray.get(i6);
                                        if (c0293d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0318e2).bottomMargin, c0318e2.f3907z, c0293d11);
                                        }
                                    } else {
                                        int i37 = c0318e2.f3889l;
                                        if (i37 != -1 && (c0293d3 = (C0293d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0318e2).bottomMargin, c0318e2.f3907z, c0293d3);
                                        }
                                    }
                                    i7 = c0318e2.f3891m;
                                    if (i7 == -1) {
                                        c0318e = c0318e2;
                                        l(h3, c0318e2, sparseArray, i7, 6);
                                    } else {
                                        c0318e = c0318e2;
                                        int i38 = c0318e.f3893n;
                                        if (i38 != -1) {
                                            l(h3, c0318e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0318e.f3894o;
                                            if (i39 != -1) {
                                                l(h3, c0318e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3556d0 = f5;
                                    }
                                    f2 = c0318e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f3558e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0318e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0318e2.f3887k;
                                if (i6 == -1) {
                                }
                                i7 = c0318e2.f3891m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0318e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0318e.f3863T) != -1 || c0318e.f3864U != -1)) {
                                int i40 = c0318e.f3864U;
                                h3.f3548Y = i11;
                                h3.f3549Z = i40;
                            }
                            if (c0318e.f3871a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0318e).width);
                                if (((ViewGroup.MarginLayoutParams) c0318e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0318e).width == -1) {
                                if (c0318e.f3866W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3524g = ((ViewGroup.MarginLayoutParams) c0318e).leftMargin;
                                h3.i(4).f3524g = ((ViewGroup.MarginLayoutParams) c0318e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0318e.f3873b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0318e).height);
                                if (((ViewGroup.MarginLayoutParams) c0318e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0318e).height == -1) {
                                    if (c0318e.f3867X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3524g = ((ViewGroup.MarginLayoutParams) c0318e).topMargin;
                                    h3.i(5).f3524g = ((ViewGroup.MarginLayoutParams) c0318e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0318e.f3850G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3546W = 0.0f;
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
                                    h3.f3546W = parseFloat;
                                    h3.f3547X = i9;
                                }
                            }
                            float f7 = c0318e.f3851H;
                            float[] fArr = h3.f3568k0;
                            fArr[0] = f7;
                            fArr[1] = c0318e.f3852I;
                            h3.f3564i0 = c0318e.f3853J;
                            h3.f3566j0 = c0318e.f3854K;
                            int i41 = c0318e.f3869Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3578q = i41;
                            }
                            int i42 = c0318e.f3855L;
                            int i43 = c0318e.f3857N;
                            int i44 = c0318e.f3859P;
                            float f8 = c0318e.f3861R;
                            h3.f3579r = i42;
                            h3.f3582u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3583v = i44;
                            h3.f3584w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3579r = 2;
                            }
                            int i45 = c0318e.f3856M;
                            int i46 = c0318e.f3858O;
                            int i47 = c0318e.f3860Q;
                            float f9 = c0318e.f3862S;
                            h3.f3580s = i45;
                            h3.f3585x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3586y = i47;
                            h3.f3587z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3580s = 2;
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
                c0294e.f3600r0.w(c0294e);
            }
        }
        k(c0294e, this.i, i, i2);
        int q2 = c0294e.q();
        int k2 = c0294e.k();
        boolean z4 = c0294e.f3591E0;
        boolean z5 = c0294e.f3592F0;
        C0319f c0319f = this.f1368o;
        int i48 = c0319f.f3911e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0319f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1361f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1362g, resolveSizeAndState2);
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
        C0293d h = h(view);
        if ((view instanceof q) && !(h instanceof h)) {
            C0318e c0318e = (C0318e) view.getLayoutParams();
            h hVar = new h();
            c0318e.f3897p0 = hVar;
            c0318e.f3876d0 = true;
            hVar.S(c0318e.f3865V);
        }
        if (view instanceof AbstractC0316c) {
            AbstractC0316c abstractC0316c = (AbstractC0316c) view;
            abstractC0316c.i();
            ((C0318e) view.getLayoutParams()).f3878e0 = true;
            ArrayList arrayList = this.f1358b;
            if (!arrayList.contains(abstractC0316c)) {
                arrayList.add(abstractC0316c);
            }
        }
        this.f1357a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1357a.remove(view.getId());
        C0293d h = h(view);
        this.f1359c.f3599q0.remove(h);
        h.C();
        this.f1358b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.f1363j = oVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1357a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1362g) {
            return;
        }
        this.f1362g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1361f) {
            return;
        }
        this.f1361f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1360e) {
            return;
        }
        this.f1360e = i;
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
        j jVar = this.f1364k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0294e c0294e = this.f1359c;
        c0294e.D0 = i;
        C0283c.f3462p = c0294e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1357a = new SparseArray();
        this.f1358b = new ArrayList(4);
        this.f1359c = new C0294e();
        this.d = 0;
        this.f1360e = 0;
        this.f1361f = Integer.MAX_VALUE;
        this.f1362g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1363j = null;
        this.f1364k = null;
        this.f1365l = -1;
        this.f1366m = new HashMap();
        this.f1367n = new SparseArray();
        this.f1368o = new C0319f(this, this);
        this.f1369p = 0;
        this.f1370q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0318e c0318e = new C0318e(layoutParams);
        c0318e.f3870a = -1;
        c0318e.f3872b = -1;
        c0318e.f3874c = -1.0f;
        c0318e.d = true;
        c0318e.f3877e = -1;
        c0318e.f3879f = -1;
        c0318e.f3881g = -1;
        c0318e.h = -1;
        c0318e.i = -1;
        c0318e.f3885j = -1;
        c0318e.f3887k = -1;
        c0318e.f3889l = -1;
        c0318e.f3891m = -1;
        c0318e.f3893n = -1;
        c0318e.f3894o = -1;
        c0318e.f3896p = -1;
        c0318e.f3898q = 0;
        c0318e.f3899r = 0.0f;
        c0318e.f3900s = -1;
        c0318e.f3901t = -1;
        c0318e.f3902u = -1;
        c0318e.f3903v = -1;
        c0318e.f3904w = Integer.MIN_VALUE;
        c0318e.f3905x = Integer.MIN_VALUE;
        c0318e.f3906y = Integer.MIN_VALUE;
        c0318e.f3907z = Integer.MIN_VALUE;
        c0318e.f3845A = Integer.MIN_VALUE;
        c0318e.f3846B = Integer.MIN_VALUE;
        c0318e.f3847C = Integer.MIN_VALUE;
        c0318e.f3848D = 0;
        c0318e.f3849E = 0.5f;
        c0318e.F = 0.5f;
        c0318e.f3850G = null;
        c0318e.f3851H = -1.0f;
        c0318e.f3852I = -1.0f;
        c0318e.f3853J = 0;
        c0318e.f3854K = 0;
        c0318e.f3855L = 0;
        c0318e.f3856M = 0;
        c0318e.f3857N = 0;
        c0318e.f3858O = 0;
        c0318e.f3859P = 0;
        c0318e.f3860Q = 0;
        c0318e.f3861R = 1.0f;
        c0318e.f3862S = 1.0f;
        c0318e.f3863T = -1;
        c0318e.f3864U = -1;
        c0318e.f3865V = -1;
        c0318e.f3866W = false;
        c0318e.f3867X = false;
        c0318e.f3868Y = null;
        c0318e.f3869Z = 0;
        c0318e.f3871a0 = true;
        c0318e.f3873b0 = true;
        c0318e.f3875c0 = false;
        c0318e.f3876d0 = false;
        c0318e.f3878e0 = false;
        c0318e.f3880f0 = -1;
        c0318e.f3882g0 = -1;
        c0318e.f3883h0 = -1;
        c0318e.f3884i0 = -1;
        c0318e.f3886j0 = Integer.MIN_VALUE;
        c0318e.f3888k0 = Integer.MIN_VALUE;
        c0318e.f3890l0 = 0.5f;
        c0318e.f3897p0 = new C0293d();
        return c0318e;
    }
}

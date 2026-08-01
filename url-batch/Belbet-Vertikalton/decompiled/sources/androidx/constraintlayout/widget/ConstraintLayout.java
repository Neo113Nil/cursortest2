package androidx.constraintlayout.widget;

import B1.c;
import G1.A;
import I0.h;
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
import com.winpower.neonfit.data.UserPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import s.C0378c;
import u.C0384a;
import u.C0387d;
import u.C0388e;
import u.g;
import u.i;
import u.j;
import v.AbstractC0406o;
import v.C0394c;
import v.C0396e;
import v.C0400i;
import v.C0402k;
import v.C0404m;
import x.AbstractC0412c;
import x.AbstractC0413d;
import x.C0414e;
import x.C0415f;
import x.C0416g;
import x.n;
import x.o;
import x.p;
import x.r;
import x.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1820r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1821a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1822b;

    /* renamed from: c, reason: collision with root package name */
    public final C0388e f1823c;

    /* renamed from: d, reason: collision with root package name */
    public int f1824d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1825f;

    /* renamed from: g, reason: collision with root package name */
    public int f1826g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1827h;
    public int i;
    public n j;

    /* renamed from: k, reason: collision with root package name */
    public c f1828k;

    /* renamed from: l, reason: collision with root package name */
    public int f1829l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1830m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1831n;

    /* renamed from: o, reason: collision with root package name */
    public final C0415f f1832o;

    /* renamed from: p, reason: collision with root package name */
    public int f1833p;

    /* renamed from: q, reason: collision with root package name */
    public int f1834q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1821a = new SparseArray();
        this.f1822b = new ArrayList(4);
        this.f1823c = new C0388e();
        this.f1824d = 0;
        this.e = 0;
        this.f1825f = Integer.MAX_VALUE;
        this.f1826g = Integer.MAX_VALUE;
        this.f1827h = true;
        this.i = 257;
        this.j = null;
        this.f1828k = null;
        this.f1829l = -1;
        this.f1830m = new HashMap();
        this.f1831n = new SparseArray();
        this.f1832o = new C0415f(this, this);
        this.f1833p = 0;
        this.f1834q = 0;
        i(attributeSet, 0);
    }

    public static C0414e g() {
        C0414e c0414e = new C0414e(-2, -2);
        c0414e.f4548a = -1;
        c0414e.f4550b = -1;
        c0414e.f4552c = -1.0f;
        c0414e.f4554d = true;
        c0414e.e = -1;
        c0414e.f4557f = -1;
        c0414e.f4559g = -1;
        c0414e.f4561h = -1;
        c0414e.i = -1;
        c0414e.j = -1;
        c0414e.f4565k = -1;
        c0414e.f4567l = -1;
        c0414e.f4569m = -1;
        c0414e.f4571n = -1;
        c0414e.f4573o = -1;
        c0414e.f4574p = -1;
        c0414e.f4576q = 0;
        c0414e.f4577r = 0.0f;
        c0414e.f4578s = -1;
        c0414e.f4579t = -1;
        c0414e.f4580u = -1;
        c0414e.f4581v = -1;
        c0414e.f4582w = Integer.MIN_VALUE;
        c0414e.f4583x = Integer.MIN_VALUE;
        c0414e.f4584y = Integer.MIN_VALUE;
        c0414e.f4585z = Integer.MIN_VALUE;
        c0414e.f4523A = Integer.MIN_VALUE;
        c0414e.f4524B = Integer.MIN_VALUE;
        c0414e.f4525C = Integer.MIN_VALUE;
        c0414e.f4526D = 0;
        c0414e.f4527E = 0.5f;
        c0414e.f4528F = 0.5f;
        c0414e.f4529G = null;
        c0414e.H = -1.0f;
        c0414e.f4530I = -1.0f;
        c0414e.f4531J = 0;
        c0414e.f4532K = 0;
        c0414e.f4533L = 0;
        c0414e.f4534M = 0;
        c0414e.f4535N = 0;
        c0414e.f4536O = 0;
        c0414e.f4537P = 0;
        c0414e.f4538Q = 0;
        c0414e.f4539R = 1.0f;
        c0414e.f4540S = 1.0f;
        c0414e.f4541T = -1;
        c0414e.f4542U = -1;
        c0414e.f4543V = -1;
        c0414e.f4544W = false;
        c0414e.f4545X = false;
        c0414e.f4546Y = null;
        c0414e.f4547Z = 0;
        c0414e.f4549a0 = true;
        c0414e.f4551b0 = true;
        c0414e.f4553c0 = false;
        c0414e.f4555d0 = false;
        c0414e.f4556e0 = false;
        c0414e.f4558f0 = -1;
        c0414e.f4560g0 = -1;
        c0414e.f4562h0 = -1;
        c0414e.f4563i0 = -1;
        c0414e.f4564j0 = Integer.MIN_VALUE;
        c0414e.f4566k0 = Integer.MIN_VALUE;
        c0414e.f4568l0 = 0.5f;
        c0414e.f4575p0 = new C0387d();
        return c0414e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1820r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1820r = sVar;
        }
        return f1820r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0414e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1822b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0412c) arrayList.get(i)).getClass();
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
        this.f1827h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0414e c0414e = new C0414e(context, attributeSet);
        c0414e.f4548a = -1;
        c0414e.f4550b = -1;
        c0414e.f4552c = -1.0f;
        c0414e.f4554d = true;
        c0414e.e = -1;
        c0414e.f4557f = -1;
        c0414e.f4559g = -1;
        c0414e.f4561h = -1;
        c0414e.i = -1;
        c0414e.j = -1;
        c0414e.f4565k = -1;
        c0414e.f4567l = -1;
        c0414e.f4569m = -1;
        c0414e.f4571n = -1;
        c0414e.f4573o = -1;
        c0414e.f4574p = -1;
        c0414e.f4576q = 0;
        c0414e.f4577r = 0.0f;
        c0414e.f4578s = -1;
        c0414e.f4579t = -1;
        c0414e.f4580u = -1;
        c0414e.f4581v = -1;
        c0414e.f4582w = Integer.MIN_VALUE;
        c0414e.f4583x = Integer.MIN_VALUE;
        c0414e.f4584y = Integer.MIN_VALUE;
        c0414e.f4585z = Integer.MIN_VALUE;
        c0414e.f4523A = Integer.MIN_VALUE;
        c0414e.f4524B = Integer.MIN_VALUE;
        c0414e.f4525C = Integer.MIN_VALUE;
        c0414e.f4526D = 0;
        c0414e.f4527E = 0.5f;
        c0414e.f4528F = 0.5f;
        c0414e.f4529G = null;
        c0414e.H = -1.0f;
        c0414e.f4530I = -1.0f;
        c0414e.f4531J = 0;
        c0414e.f4532K = 0;
        c0414e.f4533L = 0;
        c0414e.f4534M = 0;
        c0414e.f4535N = 0;
        c0414e.f4536O = 0;
        c0414e.f4537P = 0;
        c0414e.f4538Q = 0;
        c0414e.f4539R = 1.0f;
        c0414e.f4540S = 1.0f;
        c0414e.f4541T = -1;
        c0414e.f4542U = -1;
        c0414e.f4543V = -1;
        c0414e.f4544W = false;
        c0414e.f4545X = false;
        c0414e.f4546Y = null;
        c0414e.f4547Z = 0;
        c0414e.f4549a0 = true;
        c0414e.f4551b0 = true;
        c0414e.f4553c0 = false;
        c0414e.f4555d0 = false;
        c0414e.f4556e0 = false;
        c0414e.f4558f0 = -1;
        c0414e.f4560g0 = -1;
        c0414e.f4562h0 = -1;
        c0414e.f4563i0 = -1;
        c0414e.f4564j0 = Integer.MIN_VALUE;
        c0414e.f4566k0 = Integer.MIN_VALUE;
        c0414e.f4568l0 = 0.5f;
        c0414e.f4575p0 = new C0387d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4703b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0413d.f4522a.get(index);
            switch (i2) {
                case 1:
                    c0414e.f4543V = obtainStyledAttributes.getInt(index, c0414e.f4543V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0414e.f4574p);
                    c0414e.f4574p = resourceId;
                    if (resourceId == -1) {
                        c0414e.f4574p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0414e.f4576q = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4576q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0414e.f4577r) % 360.0f;
                    c0414e.f4577r = f2;
                    if (f2 < 0.0f) {
                        c0414e.f4577r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0414e.f4548a = obtainStyledAttributes.getDimensionPixelOffset(index, c0414e.f4548a);
                    break;
                case 6:
                    c0414e.f4550b = obtainStyledAttributes.getDimensionPixelOffset(index, c0414e.f4550b);
                    break;
                case 7:
                    c0414e.f4552c = obtainStyledAttributes.getFloat(index, c0414e.f4552c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0414e.e);
                    c0414e.e = resourceId2;
                    if (resourceId2 == -1) {
                        c0414e.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0414e.f4557f);
                    c0414e.f4557f = resourceId3;
                    if (resourceId3 == -1) {
                        c0414e.f4557f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0414e.f4559g);
                    c0414e.f4559g = resourceId4;
                    if (resourceId4 == -1) {
                        c0414e.f4559g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0414e.f4561h);
                    c0414e.f4561h = resourceId5;
                    if (resourceId5 == -1) {
                        c0414e.f4561h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0414e.i);
                    c0414e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0414e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0414e.j);
                    c0414e.j = resourceId7;
                    if (resourceId7 == -1) {
                        c0414e.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0414e.f4565k);
                    c0414e.f4565k = resourceId8;
                    if (resourceId8 == -1) {
                        c0414e.f4565k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0414e.f4567l);
                    c0414e.f4567l = resourceId9;
                    if (resourceId9 == -1) {
                        c0414e.f4567l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0414e.f4569m);
                    c0414e.f4569m = resourceId10;
                    if (resourceId10 == -1) {
                        c0414e.f4569m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0414e.f4578s);
                    c0414e.f4578s = resourceId11;
                    if (resourceId11 == -1) {
                        c0414e.f4578s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0414e.f4579t);
                    c0414e.f4579t = resourceId12;
                    if (resourceId12 == -1) {
                        c0414e.f4579t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0414e.f4580u);
                    c0414e.f4580u = resourceId13;
                    if (resourceId13 == -1) {
                        c0414e.f4580u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0414e.f4581v);
                    c0414e.f4581v = resourceId14;
                    if (resourceId14 == -1) {
                        c0414e.f4581v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0414e.f4582w = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4582w);
                    break;
                case 22:
                    c0414e.f4583x = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4583x);
                    break;
                case 23:
                    c0414e.f4584y = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4584y);
                    break;
                case 24:
                    c0414e.f4585z = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4585z);
                    break;
                case 25:
                    c0414e.f4523A = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4523A);
                    break;
                case 26:
                    c0414e.f4524B = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4524B);
                    break;
                case 27:
                    c0414e.f4544W = obtainStyledAttributes.getBoolean(index, c0414e.f4544W);
                    break;
                case 28:
                    c0414e.f4545X = obtainStyledAttributes.getBoolean(index, c0414e.f4545X);
                    break;
                case 29:
                    c0414e.f4527E = obtainStyledAttributes.getFloat(index, c0414e.f4527E);
                    break;
                case 30:
                    c0414e.f4528F = obtainStyledAttributes.getFloat(index, c0414e.f4528F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0414e.f4533L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0414e.f4534M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0414e.f4535N = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4535N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0414e.f4535N) == -2) {
                            c0414e.f4535N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0414e.f4537P = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4537P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0414e.f4537P) == -2) {
                            c0414e.f4537P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0414e.f4539R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0414e.f4539R));
                    c0414e.f4533L = 2;
                    break;
                case 36:
                    try {
                        c0414e.f4536O = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4536O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0414e.f4536O) == -2) {
                            c0414e.f4536O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0414e.f4538Q = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4538Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0414e.f4538Q) == -2) {
                            c0414e.f4538Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0414e.f4540S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0414e.f4540S));
                    c0414e.f4534M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0414e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0414e.H = obtainStyledAttributes.getFloat(index, c0414e.H);
                            break;
                        case 46:
                            c0414e.f4530I = obtainStyledAttributes.getFloat(index, c0414e.f4530I);
                            break;
                        case 47:
                            c0414e.f4531J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0414e.f4532K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0414e.f4541T = obtainStyledAttributes.getDimensionPixelOffset(index, c0414e.f4541T);
                            break;
                        case 50:
                            c0414e.f4542U = obtainStyledAttributes.getDimensionPixelOffset(index, c0414e.f4542U);
                            break;
                        case 51:
                            c0414e.f4546Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0414e.f4571n);
                            c0414e.f4571n = resourceId15;
                            if (resourceId15 == -1) {
                                c0414e.f4571n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0414e.f4573o);
                            c0414e.f4573o = resourceId16;
                            if (resourceId16 == -1) {
                                c0414e.f4573o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0414e.f4526D = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4526D);
                            break;
                        case 55:
                            c0414e.f4525C = obtainStyledAttributes.getDimensionPixelSize(index, c0414e.f4525C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0414e, obtainStyledAttributes, index, 0);
                                    break;
                                case UserPreferences.DEFAULT_FAT_GOAL /* 65 */:
                                    n.g(c0414e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0414e.f4547Z = obtainStyledAttributes.getInt(index, c0414e.f4547Z);
                                    break;
                                case 67:
                                    c0414e.f4554d = obtainStyledAttributes.getBoolean(index, c0414e.f4554d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0414e.a();
        return c0414e;
    }

    public int getMaxHeight() {
        return this.f1826g;
    }

    public int getMaxWidth() {
        return this.f1825f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.f1824d;
    }

    public int getOptimizationLevel() {
        return this.f1823c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0388e c0388e = this.f1823c;
        if (c0388e.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0388e.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0388e.j = "parent";
            }
        }
        if (c0388e.f4268h0 == null) {
            c0388e.f4268h0 = c0388e.j;
            Log.v("ConstraintLayout", " setDebugName " + c0388e.f4268h0);
        }
        Iterator it = c0388e.f4303q0.iterator();
        while (it.hasNext()) {
            C0387d c0387d = (C0387d) it.next();
            View view = c0387d.f4264f0;
            if (view != null) {
                if (c0387d.j == null && (id = view.getId()) != -1) {
                    c0387d.j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0387d.f4268h0 == null) {
                    c0387d.f4268h0 = c0387d.j;
                    Log.v("ConstraintLayout", " setDebugName " + c0387d.f4268h0);
                }
            }
        }
        c0388e.n(sb);
        return sb.toString();
    }

    public final C0387d h(View view) {
        if (view == this) {
            return this.f1823c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0414e) {
            return ((C0414e) view.getLayoutParams()).f4575p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0414e) {
            return ((C0414e) view.getLayoutParams()).f4575p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0388e c0388e = this.f1823c;
        c0388e.f4264f0 = this;
        C0415f c0415f = this.f1832o;
        c0388e.f4306u0 = c0415f;
        c0388e.s0.f4412f = c0415f;
        this.f1821a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4703b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1824d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1824d);
                } else if (index == 17) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f1825f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1825f);
                } else if (index == 15) {
                    this.f1826g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1826g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1828k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.f1829l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0388e.D0 = this.i;
        C0378c.f4113p = c0388e.W(512);
    }

    public final void j(int i) {
        int eventType;
        A a2;
        Context context = getContext();
        c cVar = new c(20, false);
        cVar.f68b = new SparseArray();
        cVar.f69c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            a2 = null;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1828k = cVar;
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
                    a2 = new A(context, xml);
                    ((SparseArray) cVar.f68b).put(a2.f338a, a2);
                } else if (c2 == 3) {
                    C0416g c0416g = new C0416g(context, xml);
                    if (a2 != null) {
                        ((ArrayList) a2.f340c).add(c0416g);
                    }
                } else if (c2 == 4) {
                    cVar.H(context, xml);
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
    public final void k(C0388e c0388e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0415f c0415f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0415f c0415f2;
        int i12;
        C0415f c0415f3;
        boolean z4;
        C0402k c0402k;
        C0404m c0404m;
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
        C0388e c0388e2 = c0388e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0415f c0415f4 = this.f1832o;
        c0415f4.f4587b = max3;
        c0415f4.f4588c = max4;
        c0415f4.f4589d = paddingWidth;
        c0415f4.e = i19;
        c0415f4.f4590f = i2;
        c0415f4.f4591g = i3;
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
        int i23 = c0415f4.e;
        int i24 = c0415f4.f4589d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1825f - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f1824d);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f1824d);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1826g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0388e.q();
        C0396e c0396e = c0388e2.s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0388e.k()) {
            c0396e.f4410c = true;
        }
        c0388e2.f4252Y = 0;
        c0388e2.f4253Z = 0;
        int i26 = this.f1825f - i24;
        int[] iArr = c0388e2.f4231C;
        iArr[0] = i26;
        iArr[1] = this.f1826g - i23;
        c0388e2.f4257b0 = 0;
        c0388e2.f4259c0 = 0;
        c0388e2.M(i20);
        c0388e2.O(i25);
        c0388e2.N(i6);
        c0388e2.L(i5);
        int i27 = this.f1824d - i24;
        if (i27 < 0) {
            c0388e2.f4257b0 = 0;
        } else {
            c0388e2.f4257b0 = i27;
        }
        int i28 = this.e - i23;
        if (i28 < 0) {
            c0388e2.f4259c0 = 0;
        } else {
            c0388e2.f4259c0 = i28;
        }
        c0388e2.f4309x0 = max5;
        c0388e2.f4310y0 = max3;
        h hVar = c0388e2.f4304r0;
        hVar.getClass();
        C0415f c0415f5 = c0388e2.f4306u0;
        int size3 = c0388e2.f4303q0.size();
        int q3 = c0388e.q();
        int k2 = c0388e.k();
        boolean c2 = j.c(i, 128);
        boolean z7 = c2 || j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0387d c0387d = (C0387d) c0388e2.f4303q0.get(i29);
                int[] iArr2 = c0387d.f4281p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0387d.f4250W > 0.0f;
                if ((c0387d.x() && z8) || ((c0387d.y() && z8) || (c0387d instanceof g) || c0387d.x() || c0387d.y())) {
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
            if (mode == 1073741824 && c0388e.q() != min) {
                c0388e2.O(min);
                c0388e2.s0.f4409b = true;
            }
            if (mode2 == 1073741824 && c0388e.k() != min2) {
                c0388e2.L(min2);
                c0388e2.s0.f4409b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0396e.f4409b;
                C0388e c0388e3 = c0396e.f4408a;
                if (z10 || c0396e.f4410c) {
                    Iterator it3 = c0388e3.f4303q0.iterator();
                    while (it3.hasNext()) {
                        C0387d c0387d2 = (C0387d) it3.next();
                        c0387d2.h();
                        c0387d2.f4254a = false;
                        c0387d2.f4260d.n();
                        c0387d2.e.m();
                    }
                    i15 = 0;
                    c0388e3.h();
                    c0388e3.f4254a = false;
                    c0388e3.f4260d.n();
                    c0388e3.e.m();
                    c0396e.f4410c = false;
                } else {
                    i15 = 0;
                }
                c0396e.b(c0396e.f4411d);
                c0388e3.f4252Y = i15;
                c0388e3.f4253Z = i15;
                int j = c0388e3.j(i15);
                int j2 = c0388e3.j(1);
                if (c0396e.f4409b) {
                    c0396e.c();
                }
                int r2 = c0388e3.r();
                int s2 = c0388e3.s();
                z2 = z9;
                c0388e3.f4260d.f4442h.d(r2);
                c0388e3.e.f4442h.d(s2);
                c0396e.g();
                ArrayList arrayList2 = c0396e.e;
                c0415f = c0415f5;
                if (j == 2 || j2 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0406o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j == 2) {
                        c0388e3.M(1);
                        i8 = q3;
                        c0388e3.O(c0396e.d(c0388e3, 0));
                        c0388e3.f4260d.e.d(c0388e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j2 == 2) {
                        i16 = 1;
                        c0388e3.N(1);
                        c0388e3.L(c0396e.d(c0388e3, 1));
                        c0388e3.e.e.d(c0388e3.k());
                        int[] iArr3 = c0388e3.f4281p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0388e3.q() + r2;
                            c0388e3.f4260d.i.d(q4);
                            c0388e3.f4260d.e.d(q4 - r2);
                            c0396e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0388e3.k() + s2;
                                c0388e3.e.i.d(k3);
                                c0388e3.e.e.d(k3 - s2);
                            }
                            c0396e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0406o abstractC0406o = (AbstractC0406o) it.next();
                            if (abstractC0406o.f4437b != c0388e3 || abstractC0406o.f4441g) {
                                abstractC0406o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0406o abstractC0406o2 = (AbstractC0406o) it2.next();
                            if (z5 || abstractC0406o2.f4437b != c0388e3) {
                                if (!abstractC0406o2.f4442h.j || ((!abstractC0406o2.i.j && !(abstractC0406o2 instanceof C0400i)) || (!abstractC0406o2.e.j && !(abstractC0406o2 instanceof C0394c) && !(abstractC0406o2 instanceof C0400i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0388e3.M(j);
                        c0388e3.N(j2);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0388e3.f4281p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0388e3.q() + r2;
                c0388e3.f4260d.i.d(q42);
                c0388e3.f4260d.e.d(q42 - r2);
                c0396e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0388e3.k() + s2;
                c0388e3.e.i.d(k32);
                c0388e3.e.e.d(k32 - s2);
                c0396e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0388e3.M(j);
                c0388e3.N(j2);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0415f = c0415f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0396e.f4409b;
                C0388e c0388e4 = c0396e.f4408a;
                if (z11) {
                    Iterator it5 = c0388e4.f4303q0.iterator();
                    while (it5.hasNext()) {
                        C0387d c0387d3 = (C0387d) it5.next();
                        c0387d3.h();
                        c0387d3.f4254a = false;
                        C0402k c0402k2 = c0387d3.f4260d;
                        c0402k2.e.j = false;
                        c0402k2.f4441g = false;
                        c0402k2.n();
                        C0404m c0404m2 = c0387d3.e;
                        c0404m2.e.j = false;
                        c0404m2.f4441g = false;
                        c0404m2.m();
                    }
                    i13 = 0;
                    c0388e4.h();
                    c0388e4.f4254a = false;
                    C0402k c0402k3 = c0388e4.f4260d;
                    c0402k3.e.j = false;
                    c0402k3.f4441g = false;
                    c0402k3.n();
                    C0404m c0404m3 = c0388e4.e;
                    c0404m3.e.j = false;
                    c0404m3.f4441g = false;
                    c0404m3.m();
                    c0396e.c();
                } else {
                    i13 = 0;
                }
                c0396e.b(c0396e.f4411d);
                c0388e4.f4252Y = i13;
                c0388e4.f4253Z = i13;
                c0388e4.f4260d.f4442h.d(i13);
                c0388e4.e.f4442h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0388e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0388e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0388e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0415f = c0415f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0388e2.D0;
        if (size3 > 0) {
            int size4 = c0388e2.f4303q0.size();
            boolean W2 = c0388e2.W(64);
            C0415f c0415f6 = c0388e2.f4306u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0387d c0387d4 = (C0387d) c0388e2.f4303q0.get(i31);
                if (!(c0387d4 instanceof u.h) && !(c0387d4 instanceof C0384a) && !c0387d4.f4234F && (!W2 || (c0402k = c0387d4.f4260d) == null || (c0404m = c0387d4.e) == null || !c0402k.e.j || !c0404m.e.j)) {
                    int j3 = c0387d4.j(0);
                    int j4 = c0387d4.j(1);
                    boolean z12 = j3 == 3 && c0387d4.f4283r != 1 && j4 == 3 && c0387d4.f4284s != 1;
                    if (!z12 && c0388e2.W(1) && !(c0387d4 instanceof g)) {
                        if (j3 == 3 && c0387d4.f4283r == 0 && j4 != 3 && !c0387d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 && c0387d4.f4284s == 0 && j3 != 3 && !c0387d4.x()) {
                            z12 = true;
                        }
                        if (j3 == 3 || j4 == 3) {
                            if (c0387d4.f4250W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                hVar.q(0, c0387d4, c0415f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0415f6.f4586a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1822b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0412c) arrayList3.get(i33)).getClass();
                }
            }
        }
        hVar.w(c0388e2);
        ArrayList arrayList4 = (ArrayList) hVar.f591b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            hVar.u(c0388e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0388e2.f4281p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0388e.q();
            C0388e c0388e5 = (C0388e) hVar.f593d;
            int max7 = Math.max(q5, c0388e5.f4257b0);
            int max8 = Math.max(c0388e.k(), c0388e5.f4259c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0387d c0387d5 = (C0387d) arrayList4.get(i36);
                if (c0387d5 instanceof g) {
                    int q6 = c0387d5.q();
                    int k4 = c0387d5.k();
                    i12 = i30;
                    c0415f3 = c0415f;
                    boolean q7 = z15 | hVar.q(1, c0387d5, c0415f3);
                    int q8 = c0387d5.q();
                    int k5 = c0387d5.k();
                    if (q8 != q6) {
                        c0387d5.O(q8);
                        if (z13 && c0387d5.r() + c0387d5.f4248U > max7) {
                            max7 = Math.max(max7, c0387d5.i(4).e() + c0387d5.r() + c0387d5.f4248U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0387d5.L(k5);
                        if (z14 && c0387d5.s() + c0387d5.f4249V > max8) {
                            max8 = Math.max(max8, c0387d5.i(5).e() + c0387d5.s() + c0387d5.f4249V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0387d5).f4359y0 | z4;
                } else {
                    i12 = i30;
                    c0415f3 = c0415f;
                }
                i36++;
                c0415f = c0415f3;
                i30 = i12;
            }
            int i37 = i30;
            C0415f c0415f7 = c0415f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0387d c0387d6 = (C0387d) arrayList4.get(i39);
                    if (((c0387d6 instanceof i) && !(c0387d6 instanceof g)) || (c0387d6 instanceof u.h) || c0387d6.f4266g0 == 8 || ((z2 && c0387d6.f4260d.e.j && c0387d6.e.e.j) || (c0387d6 instanceof g))) {
                        c0415f2 = c0415f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0387d6.q();
                        int k6 = c0387d6.k();
                        arrayList = arrayList4;
                        int i40 = c0387d6.f4255a0;
                        i11 = size6;
                        boolean q10 = hVar.q(i38 == 1 ? 2 : 1, c0387d6, c0415f7) | z15;
                        int q11 = c0387d6.q();
                        c0415f2 = c0415f7;
                        int k7 = c0387d6.k();
                        if (q11 != q9) {
                            c0387d6.O(q11);
                            if (z13 && c0387d6.r() + c0387d6.f4248U > max7) {
                                max7 = Math.max(max7, c0387d6.i(4).e() + c0387d6.r() + c0387d6.f4248U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0387d6.L(k7);
                            if (z14 && c0387d6.s() + c0387d6.f4249V > max8) {
                                max8 = Math.max(max8, c0387d6.i(5).e() + c0387d6.s() + c0387d6.f4249V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0387d6.f4233E || i40 == c0387d6.f4255a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0415f7 = c0415f2;
                }
                C0415f c0415f8 = c0415f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                hVar.u(c0388e, i38, i34, i35);
                c0415f7 = c0415f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0388e2 = c0388e;
            i30 = i37;
        }
        c0388e2.D0 = i30;
        C0378c.f4113p = c0388e2.W(512);
    }

    public final void l(C0387d c0387d, C0414e c0414e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1821a.get(i);
        C0387d c0387d2 = (C0387d) sparseArray.get(i);
        if (c0387d2 == null || view == null || !(view.getLayoutParams() instanceof C0414e)) {
            return;
        }
        c0414e.f4553c0 = true;
        if (i2 == 6) {
            C0414e c0414e2 = (C0414e) view.getLayoutParams();
            c0414e2.f4553c0 = true;
            c0414e2.f4575p0.f4233E = true;
        }
        c0387d.i(6).b(c0387d2.i(i2), c0414e.f4526D, c0414e.f4525C, true);
        c0387d.f4233E = true;
        c0387d.i(3).j();
        c0387d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0414e c0414e = (C0414e) childAt.getLayoutParams();
            C0387d c0387d = c0414e.f4575p0;
            if (childAt.getVisibility() != 8 || c0414e.f4555d0 || c0414e.f4556e0 || isInEditMode) {
                int r2 = c0387d.r();
                int s2 = c0387d.s();
                childAt.layout(r2, s2, c0387d.q() + r2, c0387d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1822b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0412c) arrayList.get(i6)).getClass();
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
        C0387d c0387d;
        int i5;
        C0387d c0387d2;
        int i6;
        C0387d c0387d3;
        int i7;
        C0414e c0414e;
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
        C0387d c0387d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1833p == i) {
            int i12 = constraintLayout.f1834q;
        }
        int i13 = 0;
        if (!constraintLayout.f1827h) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i14).isLayoutRequested()) {
                    constraintLayout.f1827h = true;
                    break;
                }
                i14++;
            }
        }
        constraintLayout.f1833p = i;
        constraintLayout.f1834q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0388e c0388e = constraintLayout.f1823c;
        c0388e.f4307v0 = z3;
        if (constraintLayout.f1827h) {
            constraintLayout.f1827h = false;
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
                    C0387d h2 = constraintLayout.h(constraintLayout.getChildAt(i16));
                    if (h2 != null) {
                        h2.C();
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
                                if (constraintLayout.f1830m == null) {
                                    constraintLayout.f1830m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1830m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1821a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0387d4 = view == null ? null : ((C0414e) view.getLayoutParams()).f4575p0;
                                c0387d4.f4268h0 = resourceName;
                            }
                        }
                        c0387d4 = c0388e;
                        c0387d4.f4268h0 = resourceName;
                    }
                }
                if (constraintLayout.f1829l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0388e.f4303q0.clear();
                ArrayList arrayList3 = constraintLayout.f1822b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0412c abstractC0412c = (AbstractC0412c) arrayList3.get(i19);
                        if (abstractC0412c.isInEditMode()) {
                            abstractC0412c.setIds(abstractC0412c.e);
                        }
                        i iVar = abstractC0412c.f4519d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f4367r0 = i13;
                            Arrays.fill(iVar.f4366q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0412c.f4517b) {
                                int i21 = abstractC0412c.f4516a[i20];
                                View view2 = (View) constraintLayout.f1821a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0412c.f4521g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0412c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0412c.f4516a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1821a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0412c.f4519d;
                                    C0387d h3 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h3 != iVar2 && h3 != null) {
                                        int i22 = iVar2.f4367r0 + 1;
                                        C0387d[] c0387dArr = iVar2.f4366q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0387dArr.length) {
                                            iVar2.f4366q0 = (C0387d[]) Arrays.copyOf(c0387dArr, c0387dArr.length * 2);
                                        }
                                        C0387d[] c0387dArr2 = iVar2.f4366q0;
                                        int i23 = iVar2.f4367r0;
                                        c0387dArr2[i23] = h3;
                                        iVar2.f4367r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0412c.f4519d.S();
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
                SparseArray sparseArray = constraintLayout.f1831n;
                sparseArray.clear();
                sparseArray.put(0, c0388e);
                sparseArray.put(getId(), c0388e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0387d h4 = constraintLayout.h(childAt3);
                    if (h4 != null) {
                        C0414e c0414e2 = (C0414e) childAt3.getLayoutParams();
                        c0388e.f4303q0.add(h4);
                        C0387d c0387d5 = h4.f4247T;
                        if (c0387d5 != null) {
                            ((C0388e) c0387d5).f4303q0.remove(h4);
                            h4.C();
                        }
                        h4.f4247T = c0388e;
                        c0414e2.a();
                        h4.f4266g0 = childAt3.getVisibility();
                        h4.f4264f0 = childAt3;
                        if (childAt3 instanceof AbstractC0412c) {
                            ((AbstractC0412c) childAt3).h(h4, c0388e.f4307v0);
                        }
                        if (c0414e2.f4555d0) {
                            u.h hVar = (u.h) h4;
                            int i27 = c0414e2.f4570m0;
                            int i28 = c0414e2.f4572n0;
                            float f4 = c0414e2.o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f4361q0 = f4;
                                    hVar.f4362r0 = -1;
                                    hVar.s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f4361q0 = -1.0f;
                                    hVar.f4362r0 = i27;
                                    hVar.s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f4361q0 = -1.0f;
                                hVar.f4362r0 = -1;
                                hVar.s0 = i28;
                            }
                        } else {
                            int i29 = c0414e2.f4558f0;
                            int i30 = c0414e2.f4560g0;
                            int i31 = c0414e2.f4562h0;
                            int i32 = c0414e2.f4563i0;
                            int i33 = c0414e2.f4564j0;
                            i3 = childCount3;
                            int i34 = c0414e2.f4566k0;
                            float f5 = c0414e2.f4568l0;
                            int i35 = c0414e2.f4574p;
                            if (i35 != -1) {
                                C0387d c0387d6 = (C0387d) sparseArray.get(i35);
                                if (c0387d6 != null) {
                                    float f6 = c0414e2.f4577r;
                                    h4.v(7, 7, c0414e2.f4576q, 0, c0387d6);
                                    h4.f4232D = f6;
                                }
                                c0414e = c0414e2;
                            } else {
                                if (i29 != -1) {
                                    C0387d c0387d7 = (C0387d) sparseArray.get(i29);
                                    if (c0387d7 != null) {
                                        h4.v(2, 2, ((ViewGroup.MarginLayoutParams) c0414e2).leftMargin, i33, c0387d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0387d c0387d8 = (C0387d) sparseArray.get(i30);
                                        if (c0387d8 != null) {
                                            h4.v(2, 4, ((ViewGroup.MarginLayoutParams) c0414e2).leftMargin, i33, c0387d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0387d c0387d9 = (C0387d) sparseArray.get(i31);
                                        if (c0387d9 != null) {
                                            h4.v(4, 2, ((ViewGroup.MarginLayoutParams) c0414e2).rightMargin, i34, c0387d9);
                                        }
                                    } else if (i32 != i4 && (c0387d = (C0387d) sparseArray.get(i32)) != null) {
                                        h4.v(4, 4, ((ViewGroup.MarginLayoutParams) c0414e2).rightMargin, i34, c0387d);
                                    }
                                    i5 = c0414e2.i;
                                    if (i5 == -1) {
                                        C0387d c0387d10 = (C0387d) sparseArray.get(i5);
                                        if (c0387d10 != null) {
                                            h4.v(3, 3, ((ViewGroup.MarginLayoutParams) c0414e2).topMargin, c0414e2.f4583x, c0387d10);
                                        }
                                    } else {
                                        int i36 = c0414e2.j;
                                        if (i36 != -1 && (c0387d2 = (C0387d) sparseArray.get(i36)) != null) {
                                            h4.v(3, 5, ((ViewGroup.MarginLayoutParams) c0414e2).topMargin, c0414e2.f4583x, c0387d2);
                                        }
                                    }
                                    i6 = c0414e2.f4565k;
                                    if (i6 == -1) {
                                        C0387d c0387d11 = (C0387d) sparseArray.get(i6);
                                        if (c0387d11 != null) {
                                            h4.v(5, 3, ((ViewGroup.MarginLayoutParams) c0414e2).bottomMargin, c0414e2.f4585z, c0387d11);
                                        }
                                    } else {
                                        int i37 = c0414e2.f4567l;
                                        if (i37 != -1 && (c0387d3 = (C0387d) sparseArray.get(i37)) != null) {
                                            h4.v(5, 5, ((ViewGroup.MarginLayoutParams) c0414e2).bottomMargin, c0414e2.f4585z, c0387d3);
                                        }
                                    }
                                    i7 = c0414e2.f4569m;
                                    if (i7 == -1) {
                                        c0414e = c0414e2;
                                        l(h4, c0414e2, sparseArray, i7, 6);
                                    } else {
                                        c0414e = c0414e2;
                                        int i38 = c0414e.f4571n;
                                        if (i38 != -1) {
                                            l(h4, c0414e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0414e.f4573o;
                                            if (i39 != -1) {
                                                l(h4, c0414e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h4.f4261d0 = f5;
                                    }
                                    f2 = c0414e.f4528F;
                                    if (f2 >= 0.0f) {
                                        h4.f4262e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0414e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0414e2.f4565k;
                                if (i6 == -1) {
                                }
                                i7 = c0414e2.f4569m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0414e.f4528F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0414e.f4541T) != -1 || c0414e.f4542U != -1)) {
                                int i40 = c0414e.f4542U;
                                h4.f4252Y = i11;
                                h4.f4253Z = i40;
                            }
                            if (c0414e.f4549a0) {
                                h4.M(1);
                                h4.O(((ViewGroup.MarginLayoutParams) c0414e).width);
                                if (((ViewGroup.MarginLayoutParams) c0414e).width == -2) {
                                    h4.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0414e).width == -1) {
                                if (c0414e.f4544W) {
                                    h4.M(3);
                                } else {
                                    h4.M(4);
                                }
                                h4.i(2).f4227g = ((ViewGroup.MarginLayoutParams) c0414e).leftMargin;
                                h4.i(4).f4227g = ((ViewGroup.MarginLayoutParams) c0414e).rightMargin;
                            } else {
                                h4.M(3);
                                h4.O(0);
                            }
                            if (c0414e.f4551b0) {
                                i8 = -1;
                                h4.N(1);
                                h4.L(((ViewGroup.MarginLayoutParams) c0414e).height);
                                if (((ViewGroup.MarginLayoutParams) c0414e).height == -2) {
                                    h4.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0414e).height == -1) {
                                    if (c0414e.f4545X) {
                                        h4.N(3);
                                    } else {
                                        h4.N(4);
                                    }
                                    h4.i(3).f4227g = ((ViewGroup.MarginLayoutParams) c0414e).topMargin;
                                    h4.i(5).f4227g = ((ViewGroup.MarginLayoutParams) c0414e).bottomMargin;
                                } else {
                                    h4.N(3);
                                    h4.L(0);
                                }
                            }
                            String str2 = c0414e.f4529G;
                            if (str2 == null || str2.length() == 0) {
                                h4.f4250W = 0.0f;
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
                                    h4.f4250W = parseFloat;
                                    h4.f4251X = i9;
                                }
                            }
                            float f7 = c0414e.H;
                            float[] fArr = h4.f4272k0;
                            fArr[0] = f7;
                            fArr[1] = c0414e.f4530I;
                            h4.f4269i0 = c0414e.f4531J;
                            h4.f4270j0 = c0414e.f4532K;
                            int i41 = c0414e.f4547Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h4.f4282q = i41;
                            }
                            int i42 = c0414e.f4533L;
                            int i43 = c0414e.f4535N;
                            int i44 = c0414e.f4537P;
                            float f8 = c0414e.f4539R;
                            h4.f4283r = i42;
                            h4.f4286u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h4.f4287v = i44;
                            h4.f4288w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h4.f4283r = 2;
                            }
                            int i45 = c0414e.f4534M;
                            int i46 = c0414e.f4536O;
                            int i47 = c0414e.f4538Q;
                            float f9 = c0414e.f4540S;
                            h4.f4284s = i45;
                            h4.f4289x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h4.f4290y = i47;
                            h4.f4291z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h4.f4284s = 2;
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
                c0388e.f4304r0.w(c0388e);
            }
        }
        k(c0388e, this.i, i, i2);
        int q2 = c0388e.q();
        int k2 = c0388e.k();
        boolean z4 = c0388e.f4295E0;
        boolean z5 = c0388e.f4296F0;
        C0415f c0415f = this.f1832o;
        int i48 = c0415f.e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0415f.f4589d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1825f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1826g, resolveSizeAndState2);
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
        C0387d h2 = h(view);
        if ((view instanceof p) && !(h2 instanceof u.h)) {
            C0414e c0414e = (C0414e) view.getLayoutParams();
            u.h hVar = new u.h();
            c0414e.f4575p0 = hVar;
            c0414e.f4555d0 = true;
            hVar.S(c0414e.f4543V);
        }
        if (view instanceof AbstractC0412c) {
            AbstractC0412c abstractC0412c = (AbstractC0412c) view;
            abstractC0412c.i();
            ((C0414e) view.getLayoutParams()).f4556e0 = true;
            ArrayList arrayList = this.f1822b;
            if (!arrayList.contains(abstractC0412c)) {
                arrayList.add(abstractC0412c);
            }
        }
        this.f1821a.put(view.getId(), view);
        this.f1827h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1821a.remove(view.getId());
        C0387d h2 = h(view);
        this.f1823c.f4303q0.remove(h2);
        h2.C();
        this.f1822b.remove(view);
        this.f1827h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1827h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1821a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1826g) {
            return;
        }
        this.f1826g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1825f) {
            return;
        }
        this.f1825f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1824d) {
            return;
        }
        this.f1824d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        c cVar = this.f1828k;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0388e c0388e = this.f1823c;
        c0388e.D0 = i;
        C0378c.f4113p = c0388e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1821a = new SparseArray();
        this.f1822b = new ArrayList(4);
        this.f1823c = new C0388e();
        this.f1824d = 0;
        this.e = 0;
        this.f1825f = Integer.MAX_VALUE;
        this.f1826g = Integer.MAX_VALUE;
        this.f1827h = true;
        this.i = 257;
        this.j = null;
        this.f1828k = null;
        this.f1829l = -1;
        this.f1830m = new HashMap();
        this.f1831n = new SparseArray();
        this.f1832o = new C0415f(this, this);
        this.f1833p = 0;
        this.f1834q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0414e c0414e = new C0414e(layoutParams);
        c0414e.f4548a = -1;
        c0414e.f4550b = -1;
        c0414e.f4552c = -1.0f;
        c0414e.f4554d = true;
        c0414e.e = -1;
        c0414e.f4557f = -1;
        c0414e.f4559g = -1;
        c0414e.f4561h = -1;
        c0414e.i = -1;
        c0414e.j = -1;
        c0414e.f4565k = -1;
        c0414e.f4567l = -1;
        c0414e.f4569m = -1;
        c0414e.f4571n = -1;
        c0414e.f4573o = -1;
        c0414e.f4574p = -1;
        c0414e.f4576q = 0;
        c0414e.f4577r = 0.0f;
        c0414e.f4578s = -1;
        c0414e.f4579t = -1;
        c0414e.f4580u = -1;
        c0414e.f4581v = -1;
        c0414e.f4582w = Integer.MIN_VALUE;
        c0414e.f4583x = Integer.MIN_VALUE;
        c0414e.f4584y = Integer.MIN_VALUE;
        c0414e.f4585z = Integer.MIN_VALUE;
        c0414e.f4523A = Integer.MIN_VALUE;
        c0414e.f4524B = Integer.MIN_VALUE;
        c0414e.f4525C = Integer.MIN_VALUE;
        c0414e.f4526D = 0;
        c0414e.f4527E = 0.5f;
        c0414e.f4528F = 0.5f;
        c0414e.f4529G = null;
        c0414e.H = -1.0f;
        c0414e.f4530I = -1.0f;
        c0414e.f4531J = 0;
        c0414e.f4532K = 0;
        c0414e.f4533L = 0;
        c0414e.f4534M = 0;
        c0414e.f4535N = 0;
        c0414e.f4536O = 0;
        c0414e.f4537P = 0;
        c0414e.f4538Q = 0;
        c0414e.f4539R = 1.0f;
        c0414e.f4540S = 1.0f;
        c0414e.f4541T = -1;
        c0414e.f4542U = -1;
        c0414e.f4543V = -1;
        c0414e.f4544W = false;
        c0414e.f4545X = false;
        c0414e.f4546Y = null;
        c0414e.f4547Z = 0;
        c0414e.f4549a0 = true;
        c0414e.f4551b0 = true;
        c0414e.f4553c0 = false;
        c0414e.f4555d0 = false;
        c0414e.f4556e0 = false;
        c0414e.f4558f0 = -1;
        c0414e.f4560g0 = -1;
        c0414e.f4562h0 = -1;
        c0414e.f4563i0 = -1;
        c0414e.f4564j0 = Integer.MIN_VALUE;
        c0414e.f4566k0 = Integer.MIN_VALUE;
        c0414e.f4568l0 = 0.5f;
        c0414e.f4575p0 = new C0387d();
        return c0414e;
    }
}

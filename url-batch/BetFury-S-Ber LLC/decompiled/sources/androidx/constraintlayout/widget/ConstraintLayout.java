package androidx.constraintlayout.widget;

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
import defpackage.af;
import defpackage.bi;
import defpackage.cf;
import defpackage.df;
import defpackage.dt;
import defpackage.e8;
import defpackage.ef;
import defpackage.ff;
import defpackage.gf;
import defpackage.i5;
import defpackage.jt;
import defpackage.kj;
import defpackage.of;
import defpackage.os;
import defpackage.ps;
import defpackage.qf;
import defpackage.rf;
import defpackage.rl0;
import defpackage.s6;
import defpackage.sf;
import defpackage.td0;
import defpackage.tf;
import defpackage.uo;
import defpackage.vn0;
import defpackage.we;
import defpackage.x60;
import defpackage.xx;
import defpackage.za;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static td0 u;
    public final SparseArray f;
    public final ArrayList g;
    public final sf h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public of o;
    public i5 p;
    public int q;
    public HashMap r;
    public final SparseArray s;
    public final ef t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new sf();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = new SparseArray();
        this.t = new ef(this, this);
        i(attributeSet, 0);
    }

    public static df g() {
        df dfVar = new df(-2, -2);
        dfVar.a = -1;
        dfVar.b = -1;
        dfVar.c = -1.0f;
        dfVar.d = true;
        dfVar.e = -1;
        dfVar.f = -1;
        dfVar.g = -1;
        dfVar.h = -1;
        dfVar.i = -1;
        dfVar.j = -1;
        dfVar.k = -1;
        dfVar.l = -1;
        dfVar.m = -1;
        dfVar.n = -1;
        dfVar.o = -1;
        dfVar.p = -1;
        dfVar.q = 0;
        dfVar.r = 0.0f;
        dfVar.s = -1;
        dfVar.t = -1;
        dfVar.u = -1;
        dfVar.v = -1;
        dfVar.w = Integer.MIN_VALUE;
        dfVar.x = Integer.MIN_VALUE;
        dfVar.y = Integer.MIN_VALUE;
        dfVar.z = Integer.MIN_VALUE;
        dfVar.A = Integer.MIN_VALUE;
        dfVar.B = Integer.MIN_VALUE;
        dfVar.C = Integer.MIN_VALUE;
        dfVar.D = 0;
        dfVar.E = 0.5f;
        dfVar.F = 0.5f;
        dfVar.G = null;
        dfVar.H = -1.0f;
        dfVar.I = -1.0f;
        dfVar.J = 0;
        dfVar.K = 0;
        dfVar.L = 0;
        dfVar.M = 0;
        dfVar.N = 0;
        dfVar.O = 0;
        dfVar.P = 0;
        dfVar.Q = 0;
        dfVar.R = 1.0f;
        dfVar.S = 1.0f;
        dfVar.T = -1;
        dfVar.U = -1;
        dfVar.V = -1;
        dfVar.W = false;
        dfVar.X = false;
        dfVar.Y = null;
        dfVar.Z = 0;
        dfVar.a0 = true;
        dfVar.b0 = true;
        dfVar.c0 = false;
        dfVar.d0 = false;
        dfVar.e0 = false;
        dfVar.f0 = -1;
        dfVar.g0 = -1;
        dfVar.h0 = -1;
        dfVar.i0 = -1;
        dfVar.j0 = Integer.MIN_VALUE;
        dfVar.k0 = Integer.MIN_VALUE;
        dfVar.l0 = 0.5f;
        dfVar.p0 = new rf();
        return dfVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static td0 getSharedValues() {
        if (u == null) {
            td0 td0Var = new td0();
            new SparseIntArray();
            new HashMap();
            u = td0Var;
        }
        return u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof df;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((af) arrayList.get(i)).getClass();
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
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        df dfVar = new df(context, attributeSet);
        dfVar.a = -1;
        dfVar.b = -1;
        dfVar.c = -1.0f;
        dfVar.d = true;
        dfVar.e = -1;
        dfVar.f = -1;
        dfVar.g = -1;
        dfVar.h = -1;
        dfVar.i = -1;
        dfVar.j = -1;
        dfVar.k = -1;
        dfVar.l = -1;
        dfVar.m = -1;
        dfVar.n = -1;
        dfVar.o = -1;
        dfVar.p = -1;
        dfVar.q = 0;
        dfVar.r = 0.0f;
        dfVar.s = -1;
        dfVar.t = -1;
        dfVar.u = -1;
        dfVar.v = -1;
        dfVar.w = Integer.MIN_VALUE;
        dfVar.x = Integer.MIN_VALUE;
        dfVar.y = Integer.MIN_VALUE;
        dfVar.z = Integer.MIN_VALUE;
        dfVar.A = Integer.MIN_VALUE;
        dfVar.B = Integer.MIN_VALUE;
        dfVar.C = Integer.MIN_VALUE;
        dfVar.D = 0;
        dfVar.E = 0.5f;
        dfVar.F = 0.5f;
        dfVar.G = null;
        dfVar.H = -1.0f;
        dfVar.I = -1.0f;
        dfVar.J = 0;
        dfVar.K = 0;
        dfVar.L = 0;
        dfVar.M = 0;
        dfVar.N = 0;
        dfVar.O = 0;
        dfVar.P = 0;
        dfVar.Q = 0;
        dfVar.R = 1.0f;
        dfVar.S = 1.0f;
        dfVar.T = -1;
        dfVar.U = -1;
        dfVar.V = -1;
        dfVar.W = false;
        dfVar.X = false;
        dfVar.Y = null;
        dfVar.Z = 0;
        dfVar.a0 = true;
        dfVar.b0 = true;
        dfVar.c0 = false;
        dfVar.d0 = false;
        dfVar.e0 = false;
        dfVar.f0 = -1;
        dfVar.g0 = -1;
        dfVar.h0 = -1;
        dfVar.i0 = -1;
        dfVar.j0 = Integer.MIN_VALUE;
        dfVar.k0 = Integer.MIN_VALUE;
        dfVar.l0 = 0.5f;
        dfVar.p0 = new rf();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x60.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = cf.a.get(index);
            switch (i2) {
                case 1:
                    dfVar.V = obtainStyledAttributes.getInt(index, dfVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, dfVar.p);
                    dfVar.p = resourceId;
                    if (resourceId == -1) {
                        dfVar.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    dfVar.q = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, dfVar.r) % 360.0f;
                    dfVar.r = f;
                    if (f < 0.0f) {
                        dfVar.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dfVar.a = obtainStyledAttributes.getDimensionPixelOffset(index, dfVar.a);
                    break;
                case 6:
                    dfVar.b = obtainStyledAttributes.getDimensionPixelOffset(index, dfVar.b);
                    break;
                case 7:
                    dfVar.c = obtainStyledAttributes.getFloat(index, dfVar.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, dfVar.e);
                    dfVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        dfVar.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, dfVar.f);
                    dfVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        dfVar.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, dfVar.g);
                    dfVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        dfVar.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, dfVar.h);
                    dfVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        dfVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, dfVar.i);
                    dfVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        dfVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, dfVar.j);
                    dfVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        dfVar.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, dfVar.k);
                    dfVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        dfVar.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, dfVar.l);
                    dfVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        dfVar.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, dfVar.m);
                    dfVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        dfVar.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, dfVar.s);
                    dfVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        dfVar.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, dfVar.t);
                    dfVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        dfVar.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, dfVar.u);
                    dfVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        dfVar.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, dfVar.v);
                    dfVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        dfVar.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    dfVar.w = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.w);
                    break;
                case 22:
                    dfVar.x = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.x);
                    break;
                case 23:
                    dfVar.y = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.y);
                    break;
                case 24:
                    dfVar.z = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.z);
                    break;
                case 25:
                    dfVar.A = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.A);
                    break;
                case 26:
                    dfVar.B = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.B);
                    break;
                case 27:
                    dfVar.W = obtainStyledAttributes.getBoolean(index, dfVar.W);
                    break;
                case 28:
                    dfVar.X = obtainStyledAttributes.getBoolean(index, dfVar.X);
                    break;
                case 29:
                    dfVar.E = obtainStyledAttributes.getFloat(index, dfVar.E);
                    break;
                case 30:
                    dfVar.F = obtainStyledAttributes.getFloat(index, dfVar.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    dfVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    dfVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        dfVar.N = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, dfVar.N) == -2) {
                            dfVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        dfVar.P = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, dfVar.P) == -2) {
                            dfVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    dfVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dfVar.R));
                    dfVar.L = 2;
                    break;
                case 36:
                    try {
                        dfVar.O = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, dfVar.O) == -2) {
                            dfVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        dfVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, dfVar.Q) == -2) {
                            dfVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    dfVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dfVar.S));
                    dfVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            of.h(dfVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dfVar.H = obtainStyledAttributes.getFloat(index, dfVar.H);
                            break;
                        case 46:
                            dfVar.I = obtainStyledAttributes.getFloat(index, dfVar.I);
                            break;
                        case 47:
                            dfVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dfVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dfVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, dfVar.T);
                            break;
                        case 50:
                            dfVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, dfVar.U);
                            break;
                        case 51:
                            dfVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, dfVar.n);
                            dfVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                dfVar.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, dfVar.o);
                            dfVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                dfVar.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            dfVar.D = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.D);
                            break;
                        case 55:
                            dfVar.C = obtainStyledAttributes.getDimensionPixelSize(index, dfVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    of.g(dfVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    of.g(dfVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dfVar.Z = obtainStyledAttributes.getInt(index, dfVar.Z);
                                    break;
                                case 67:
                                    dfVar.d = obtainStyledAttributes.getBoolean(index, dfVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        dfVar.a();
        return dfVar;
    }

    public int getMaxHeight() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMinHeight() {
        return this.j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        sf sfVar = this.h;
        if (sfVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                sfVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                sfVar.j = "parent";
            }
        }
        if (sfVar.i0 == null) {
            sfVar.i0 = sfVar.j;
            Log.v("ConstraintLayout", " setDebugName " + sfVar.i0);
        }
        ArrayList arrayList = sfVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rf rfVar = (rf) obj;
            View view = rfVar.g0;
            if (view != null) {
                if (rfVar.j == null && (id = view.getId()) != -1) {
                    rfVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (rfVar.i0 == null) {
                    rfVar.i0 = rfVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + rfVar.i0);
                }
            }
        }
        sfVar.n(sb);
        return sb.toString();
    }

    public final rf h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof df) {
            return ((df) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof df) {
            return ((df) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        sf sfVar = this.h;
        sfVar.g0 = this;
        ef efVar = this.t;
        sfVar.u0 = efVar;
        sfVar.s0.f = efVar;
        this.f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x60.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 17) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == 14) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == 15) {
                    this.l = obtainStyledAttributes.getDimensionPixelOffset(index, this.l);
                } else if (index == 113) {
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        of ofVar = new of();
                        this.o = ofVar;
                        ofVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        sfVar.D0 = this.n;
        xx.q = sfVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        i5 i5Var = new i5(11, false);
        i5Var.g = new SparseArray();
        i5Var.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            ff ffVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                i5Var.K(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                ff ffVar2 = new ff(context, xml);
                                ((SparseArray) i5Var.g).put(ffVar2.a, ffVar2);
                                ffVar = ffVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                gf gfVar = new gf(context, xml);
                                if (ffVar != null) {
                                    ((ArrayList) ffVar.c).add(gfVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.p = i5Var;
    }

    public final void k(sf sfVar, int i, int i2, int i3) {
        qf qfVar;
        qf qfVar2;
        int i4;
        int i5;
        int max;
        int max2;
        char c;
        int i6;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        ef efVar;
        boolean z3;
        int i7;
        int i8;
        ef efVar2;
        int i9;
        boolean z4;
        boolean z5;
        boolean z6;
        ef efVar3;
        jt jtVar;
        rl0 rl0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z7;
        boolean z8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i14 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        ef efVar4 = this.t;
        efVar4.b = max3;
        efVar4.c = max4;
        efVar4.d = paddingWidth;
        efVar4.e = i14;
        efVar4.f = i2;
        efVar4.g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        int i17 = efVar4.e;
        int i18 = efVar4.d;
        qf qfVar3 = qf.FIXED;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            qfVar = qf.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.i);
                qf qfVar4 = qfVar;
                i5 = max;
                qfVar2 = qfVar4;
                i4 = Integer.MIN_VALUE;
            } else {
                qfVar2 = qfVar;
                i4 = Integer.MIN_VALUE;
                i5 = i15;
            }
        } else if (mode != 0) {
            i5 = mode != 1073741824 ? 0 : Math.min(this.k - i18, i15);
            i4 = Integer.MIN_VALUE;
            qfVar2 = qfVar3;
        } else {
            qfVar = qf.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.i);
                qf qfVar42 = qfVar;
                i5 = max;
                qfVar2 = qfVar42;
                i4 = Integer.MIN_VALUE;
            } else {
                i5 = 0;
                i4 = Integer.MIN_VALUE;
                qfVar2 = qfVar;
            }
        }
        if (mode2 == i4) {
            qfVar3 = qf.WRAP_CONTENT;
            max2 = childCount == 0 ? Math.max(0, this.j) : i16;
        } else if (mode2 != 0) {
            if (mode2 == 1073741824) {
                max2 = Math.min(this.l - i17, i16);
            }
            max2 = 0;
        } else {
            qfVar3 = qf.WRAP_CONTENT;
            if (childCount == 0) {
                max2 = Math.max(0, this.j);
            }
            max2 = 0;
        }
        int q = sfVar.q();
        kj kjVar = sfVar.s0;
        int[] iArr = sfVar.C;
        if (i5 == q && max2 == sfVar.k()) {
            c = 1;
        } else {
            kjVar.c = true;
            c = 1;
        }
        sfVar.Z = 0;
        sfVar.a0 = 0;
        iArr[0] = this.k - i18;
        iArr[c] = this.l - i17;
        sfVar.c0 = 0;
        sfVar.d0 = 0;
        sfVar.M(qfVar2);
        sfVar.O(i5);
        sfVar.N(qfVar3);
        sfVar.L(max2);
        int i19 = this.i - i18;
        if (i19 < 0) {
            sfVar.c0 = 0;
        } else {
            sfVar.c0 = i19;
        }
        int i20 = this.j - i17;
        if (i20 < 0) {
            sfVar.d0 = 0;
        } else {
            sfVar.d0 = i20;
        }
        sfVar.x0 = max5;
        sfVar.y0 = max3;
        s6 s6Var = sfVar.r0;
        sf sfVar2 = (sf) s6Var.d;
        ArrayList arrayList2 = (ArrayList) s6Var.b;
        ef efVar5 = sfVar.u0;
        int size3 = sfVar.q0.size();
        int q2 = sfVar.q();
        int k = sfVar.k();
        boolean y = bi.y(i, 128);
        boolean z9 = y || bi.y(i, 64);
        if (z9) {
            int i21 = 0;
            while (i21 < size3) {
                boolean z10 = z9;
                rf rfVar = (rf) sfVar.q0.get(i21);
                int i22 = i21;
                qf[] qfVarArr = rfVar.T;
                qf qfVar5 = qfVarArr[0];
                i6 = size3;
                qf qfVar6 = qf.MATCH_CONSTRAINT;
                boolean z11 = (qfVar5 == qfVar6) && (qfVarArr[1] == qfVar6) && rfVar.X > 0.0f;
                if ((rfVar.x() && z11) || ((rfVar.y() && z11) || (rfVar instanceof uo) || rfVar.x() || rfVar.y())) {
                    z = false;
                    break;
                } else {
                    i21 = i22 + 1;
                    z9 = z10;
                    size3 = i6;
                }
            }
        }
        i6 = size3;
        z = z9;
        boolean z12 = z & ((mode == 1073741824 && mode2 == 1073741824) || y);
        if (z12) {
            int min = Math.min(iArr[0], i15);
            int min2 = Math.min(iArr[1], i16);
            int i23 = 1073741824;
            if (mode == 1073741824) {
                if (sfVar.q() != min) {
                    sfVar.O(min);
                    kjVar.b = true;
                }
                i23 = 1073741824;
            }
            if (mode2 == i23 && sfVar.k() != min2) {
                sfVar.L(min2);
                kjVar.b = true;
            }
            if (mode == i23 && mode2 == i23) {
                ArrayList arrayList3 = kjVar.e;
                sf sfVar3 = kjVar.a;
                if (kjVar.b || kjVar.c) {
                    ArrayList arrayList4 = sfVar3.q0;
                    int size4 = arrayList4.size();
                    z2 = z12;
                    int i24 = 0;
                    while (i24 < size4) {
                        Object obj = arrayList4.get(i24);
                        int i25 = i24 + 1;
                        rf rfVar2 = (rf) obj;
                        rfVar2.h();
                        rfVar2.a = false;
                        rfVar2.d.n();
                        rfVar2.e.m();
                        arrayList4 = arrayList4;
                        i24 = i25;
                    }
                    sfVar3.h();
                    i12 = 0;
                    sfVar3.a = false;
                    sfVar3.d.n();
                    sfVar3.e.m();
                    kjVar.c = false;
                } else {
                    z2 = z12;
                    i12 = 0;
                }
                kjVar.b(kjVar.d);
                sfVar3.Z = i12;
                qf[] qfVarArr2 = sfVar3.T;
                sfVar3.a0 = i12;
                qf j = sfVar3.j(i12);
                qf j2 = sfVar3.j(1);
                if (kjVar.b) {
                    kjVar.c();
                }
                int r = sfVar3.r();
                efVar = efVar5;
                int s = sfVar3.s();
                arrayList = arrayList2;
                sfVar3.d.h.d(r);
                sfVar3.e.h.d(s);
                kjVar.g();
                qf qfVar7 = qf.WRAP_CONTENT;
                if (j == qfVar7 || j2 == qfVar7) {
                    if (y) {
                        int size5 = arrayList3.size();
                        i13 = s;
                        int i26 = 0;
                        while (true) {
                            if (i26 >= size5) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i26);
                            i26++;
                            if (!((vn0) obj2).k()) {
                                y = false;
                                break;
                            }
                        }
                    } else {
                        i13 = s;
                    }
                    if (y && j == qf.WRAP_CONTENT) {
                        sfVar3.M(qf.FIXED);
                        sfVar3.O(kjVar.d(sfVar3, 0));
                        sfVar3.d.e.d(sfVar3.q());
                    }
                    if (y && j2 == qf.WRAP_CONTENT) {
                        sfVar3.N(qf.FIXED);
                        sfVar3.L(kjVar.d(sfVar3, 1));
                        sfVar3.e.e.d(sfVar3.k());
                    }
                } else {
                    i13 = s;
                }
                qf qfVar8 = qfVarArr2[0];
                qf qfVar9 = qf.FIXED;
                if (qfVar8 == qfVar9 || qfVar8 == qf.MATCH_PARENT) {
                    int q3 = sfVar3.q() + r;
                    sfVar3.d.i.d(q3);
                    sfVar3.d.e.d(q3 - r);
                    kjVar.g();
                    qf qfVar10 = qfVarArr2[1];
                    if (qfVar10 == qfVar9 || qfVar10 == qf.MATCH_PARENT) {
                        int k2 = sfVar3.k() + i13;
                        sfVar3.e.i.d(k2);
                        sfVar3.e.e.d(k2 - i13);
                    }
                    kjVar.g();
                    z7 = true;
                } else {
                    z7 = false;
                }
                int size6 = arrayList3.size();
                int i27 = 0;
                while (i27 < size6) {
                    Object obj3 = arrayList3.get(i27);
                    i27++;
                    vn0 vn0Var = (vn0) obj3;
                    if (vn0Var.b != sfVar3 || vn0Var.g) {
                        vn0Var.e();
                    }
                }
                int size7 = arrayList3.size();
                int i28 = 0;
                while (i28 < size7) {
                    Object obj4 = arrayList3.get(i28);
                    i28++;
                    vn0 vn0Var2 = (vn0) obj4;
                    if (z7 || vn0Var2.b != sfVar3) {
                        if (!vn0Var2.h.j || ((!vn0Var2.i.j && !(vn0Var2 instanceof ps)) || (!vn0Var2.e.j && !(vn0Var2 instanceof za) && !(vn0Var2 instanceof ps)))) {
                            z8 = false;
                            break;
                        }
                    }
                }
                z8 = true;
                sfVar3.M(j);
                sfVar3.N(j2);
                z3 = z8;
                i7 = 2;
                i11 = 1073741824;
            } else {
                z2 = z12;
                arrayList = arrayList2;
                efVar = efVar5;
                sf sfVar4 = kjVar.a;
                if (kjVar.b) {
                    ArrayList arrayList5 = sfVar4.q0;
                    int size8 = arrayList5.size();
                    int i29 = 0;
                    while (i29 < size8) {
                        Object obj5 = arrayList5.get(i29);
                        i29++;
                        rf rfVar3 = (rf) obj5;
                        rfVar3.h();
                        rfVar3.a = false;
                        jt jtVar2 = rfVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        jtVar2.e.j = false;
                        jtVar2.g = false;
                        jtVar2.n();
                        rl0 rl0Var2 = rfVar3.e;
                        rl0Var2.e.j = false;
                        rl0Var2.g = false;
                        rl0Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i10 = 0;
                    sfVar4.h();
                    sfVar4.a = false;
                    jt jtVar3 = sfVar4.d;
                    jtVar3.e.j = false;
                    jtVar3.g = false;
                    jtVar3.n();
                    rl0 rl0Var3 = sfVar4.e;
                    rl0Var3.e.j = false;
                    rl0Var3.g = false;
                    rl0Var3.m();
                    kjVar.c();
                } else {
                    i10 = 0;
                }
                kjVar.b(kjVar.d);
                sfVar4.Z = i10;
                sfVar4.a0 = i10;
                sfVar4.d.h.d(i10);
                sfVar4.e.h.d(i10);
                i11 = 1073741824;
                if (mode == 1073741824) {
                    z3 = sfVar.T(i10, y);
                    i7 = 1;
                } else {
                    z3 = true;
                    i7 = 0;
                }
                if (mode2 == 1073741824) {
                    z3 &= sfVar.T(1, y);
                    i7++;
                }
            }
            if (z3) {
                sfVar.P(mode == i11, mode2 == i11);
            }
        } else {
            z2 = z12;
            arrayList = arrayList2;
            efVar = efVar5;
            z3 = false;
            i7 = 0;
        }
        if (z3 && i7 == 2) {
            return;
        }
        int i30 = sfVar.D0;
        if (i6 > 0) {
            int size9 = sfVar.q0.size();
            boolean W = sfVar.W(64);
            ef efVar6 = sfVar.u0;
            for (int i31 = 0; i31 < size9; i31++) {
                rf rfVar4 = (rf) sfVar.q0.get(i31);
                if (!(rfVar4 instanceof os) && !(rfVar4 instanceof e8) && !rfVar4.F && (!W || (jtVar = rfVar4.d) == null || (rl0Var = rfVar4.e) == null || !jtVar.e.j || !rl0Var.e.j)) {
                    qf j3 = rfVar4.j(0);
                    qf j4 = rfVar4.j(1);
                    qf qfVar11 = qf.MATCH_CONSTRAINT;
                    boolean z13 = j3 == qfVar11 && rfVar4.r != 1 && j4 == qfVar11 && rfVar4.s != 1;
                    if (!z13 && sfVar.W(1) && !(rfVar4 instanceof uo)) {
                        if (j3 == qfVar11 && rfVar4.r == 0 && j4 != qfVar11 && !rfVar4.x()) {
                            z13 = true;
                        }
                        if (j4 == qfVar11 && rfVar4.s == 0 && j3 != qfVar11 && !rfVar4.x()) {
                            z13 = true;
                        }
                        if ((j3 == qfVar11 || j4 == qfVar11) && rfVar4.X > 0.0f) {
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        s6Var.s(0, efVar6, rfVar4);
                    }
                }
            }
            ConstraintLayout constraintLayout = efVar6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.g;
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i33 = 0; i33 < size10; i33++) {
                    ((af) arrayList7.get(i33)).getClass();
                }
            }
        }
        s6Var.y(sfVar);
        int size11 = arrayList.size();
        if (i6 > 0) {
            s6Var.w(sfVar, 0, q2, k);
        }
        if (size11 > 0) {
            qf[] qfVarArr3 = sfVar.T;
            qf qfVar12 = qfVarArr3[0];
            qf qfVar13 = qf.WRAP_CONTENT;
            boolean z14 = qfVar12 == qfVar13;
            boolean z15 = qfVarArr3[1] == qfVar13;
            int max7 = Math.max(sfVar.q(), sfVar2.c0);
            int max8 = Math.max(sfVar.k(), sfVar2.d0);
            int i34 = 0;
            boolean z16 = false;
            while (i34 < size11) {
                ArrayList arrayList8 = arrayList;
                rf rfVar5 = (rf) arrayList8.get(i34);
                if (rfVar5 instanceof uo) {
                    int q4 = rfVar5.q();
                    int k3 = rfVar5.k();
                    z5 = z15;
                    z6 = z14;
                    efVar3 = efVar;
                    boolean s2 = z16 | s6Var.s(1, efVar3, rfVar5);
                    int q5 = rfVar5.q();
                    boolean z17 = s2;
                    int k4 = rfVar5.k();
                    if (q5 != q4) {
                        rfVar5.O(q5);
                        if (z6 && rfVar5.r() + rfVar5.V > max7) {
                            max7 = Math.max(max7, rfVar5.i(we.RIGHT).e() + rfVar5.r() + rfVar5.V);
                        }
                        z17 = true;
                    }
                    if (k4 != k3) {
                        rfVar5.L(k4);
                        if (z5 && rfVar5.s() + rfVar5.W > max8) {
                            max8 = Math.max(max8, rfVar5.i(we.BOTTOM).e() + rfVar5.s() + rfVar5.W);
                        }
                        z17 = true;
                    }
                    z16 = z17 | ((uo) rfVar5).y0;
                } else {
                    z5 = z15;
                    z6 = z14;
                    efVar3 = efVar;
                }
                i34++;
                z14 = z6;
                efVar = efVar3;
                arrayList = arrayList8;
                z15 = z5;
            }
            boolean z18 = z15;
            boolean z19 = z14;
            ArrayList arrayList9 = arrayList;
            int i35 = 0;
            while (true) {
                ef efVar7 = efVar;
                if (i35 >= 2) {
                    break;
                }
                int i36 = 0;
                while (i36 < size11) {
                    rf rfVar6 = (rf) arrayList9.get(i36);
                    if (((rfVar6 instanceof dt) && !(rfVar6 instanceof uo)) || (rfVar6 instanceof os) || rfVar6.h0 == 8 || ((z2 && rfVar6.d.e.j && rfVar6.e.e.j) || (rfVar6 instanceof uo))) {
                        i8 = size11;
                        efVar2 = efVar7;
                        i9 = i35;
                    } else {
                        int q6 = rfVar6.q();
                        int k5 = rfVar6.k();
                        i8 = size11;
                        int i37 = rfVar6.b0;
                        boolean s3 = z16 | s6Var.s(i35 == 1 ? 2 : 1, efVar7, rfVar6);
                        efVar2 = efVar7;
                        int q7 = rfVar6.q();
                        i9 = i35;
                        int k6 = rfVar6.k();
                        if (q7 != q6) {
                            rfVar6.O(q7);
                            if (z19 && rfVar6.r() + rfVar6.V > max7) {
                                max7 = Math.max(max7, rfVar6.i(we.RIGHT).e() + rfVar6.r() + rfVar6.V);
                            }
                            z4 = true;
                        } else {
                            z4 = s3;
                        }
                        if (k6 != k5) {
                            rfVar6.L(k6);
                            if (z18 && rfVar6.s() + rfVar6.W > max8) {
                                max8 = Math.max(max8, rfVar6.i(we.BOTTOM).e() + rfVar6.s() + rfVar6.W);
                            }
                            z4 = true;
                        }
                        z16 = (!rfVar6.E || i37 == rfVar6.b0) ? z4 : true;
                    }
                    i36++;
                    size11 = i8;
                    efVar7 = efVar2;
                    i35 = i9;
                }
                int i38 = size11;
                efVar = efVar7;
                int i39 = i35;
                if (!z16) {
                    break;
                }
                i35 = i39 + 1;
                s6Var.w(sfVar, i35, q2, k);
                size11 = i38;
                z16 = false;
            }
        }
        sfVar.D0 = i30;
        xx.q = sfVar.W(512);
    }

    public final void l(rf rfVar, df dfVar, SparseArray sparseArray, int i, we weVar) {
        View view = (View) this.f.get(i);
        rf rfVar2 = (rf) sparseArray.get(i);
        if (rfVar2 == null || view == null || !(view.getLayoutParams() instanceof df)) {
            return;
        }
        dfVar.c0 = true;
        we weVar2 = we.BASELINE;
        if (weVar == weVar2) {
            df dfVar2 = (df) view.getLayoutParams();
            dfVar2.c0 = true;
            dfVar2.p0.E = true;
        }
        rfVar.i(weVar2).b(rfVar2.i(weVar), dfVar.D, dfVar.C, true);
        rfVar.E = true;
        rfVar.i(we.TOP).j();
        rfVar.i(we.BOTTOM).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            df dfVar = (df) childAt.getLayoutParams();
            rf rfVar = dfVar.p0;
            if (childAt.getVisibility() != 8 || dfVar.d0 || dfVar.e0 || isInEditMode) {
                int r = rfVar.r();
                int s = rfVar.s();
                childAt.layout(r, s, rfVar.q() + r, rfVar.k() + s);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((af) arrayList.get(i6)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        rf rfVar;
        rf rfVar2;
        rf rfVar3;
        rf rfVar4;
        rf rfVar5;
        df dfVar;
        rf rfVar6;
        int i4;
        int i5;
        int i6;
        int i7;
        float parseFloat;
        int i8;
        char c;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f;
        int i9;
        String resourceName;
        int id;
        rf rfVar7;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.m;
        constraintLayout.m = z3;
        int i10 = 1;
        int i11 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i12).isLayoutRequested()) {
                    constraintLayout.m = true;
                    break;
                }
                i12++;
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        sf sfVar = constraintLayout.h;
        sfVar.v0 = z4;
        if (constraintLayout.m) {
            constraintLayout.m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i13).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    rf h = constraintLayout.h(constraintLayout.getChildAt(i14));
                    if (h != null) {
                        h.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f;
                if (isInEditMode) {
                    int i15 = 0;
                    while (i15 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i15);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i9 = i10;
                                try {
                                    if (constraintLayout.r == null) {
                                        constraintLayout.r = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i9 = i10;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i9 = i10;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                rfVar7 = view == null ? null : ((df) view.getLayoutParams()).p0;
                                rfVar7.i0 = resourceName;
                                i15++;
                                i10 = i9;
                            }
                        }
                        rfVar7 = sfVar;
                        rfVar7.i0 = resourceName;
                        i15++;
                        i10 = i9;
                    }
                }
                int i16 = i10;
                if (constraintLayout.q != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        constraintLayout.getChildAt(i17).getId();
                    }
                }
                of ofVar = constraintLayout.o;
                if (ofVar != null) {
                    ofVar.a(constraintLayout);
                }
                sfVar.q0.clear();
                ArrayList arrayList3 = constraintLayout.g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i18 < size) {
                        af afVar = (af) arrayList3.get(i18);
                        HashMap hashMap = afVar.l;
                        if (afVar.isInEditMode()) {
                            afVar.setIds(afVar.j);
                        }
                        dt dtVar = afVar.i;
                        if (dtVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            dtVar.r0 = i11;
                            Arrays.fill(dtVar.q0, (Object) null);
                            int i19 = i11;
                            while (i19 < afVar.g) {
                                int i20 = afVar.f[i19];
                                View view2 = (View) sparseArray3.get(i20);
                                if (view2 != null || (f = afVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i20))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    afVar.f[i19] = f;
                                    hashMap.put(Integer.valueOf(f), str);
                                    view2 = (View) sparseArray3.get(f);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    dt dtVar2 = afVar.i;
                                    rf h2 = constraintLayout.h(view3);
                                    dtVar2.getClass();
                                    if (h2 != dtVar2 && h2 != null) {
                                        int i21 = dtVar2.r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        rf[] rfVarArr = dtVar2.q0;
                                        if (i21 > rfVarArr.length) {
                                            dtVar2.q0 = (rf[]) Arrays.copyOf(rfVarArr, rfVarArr.length * 2);
                                        }
                                        rf[] rfVarArr2 = dtVar2.q0;
                                        int i22 = dtVar2.r0;
                                        rfVarArr2[i22] = h2;
                                        dtVar2.r0 = i22 + 1;
                                        i19++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i19++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            afVar.i.S();
                        }
                        i18++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i11 = 0;
                    }
                }
                int i23 = 2;
                for (int i24 = 0; i24 < childCount3; i24++) {
                    constraintLayout.getChildAt(i24);
                }
                SparseArray sparseArray4 = constraintLayout.s;
                sparseArray4.clear();
                sparseArray4.put(0, sfVar);
                sparseArray4.put(constraintLayout.getId(), sfVar);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    rf h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        df dfVar2 = (df) childAt3.getLayoutParams();
                        sfVar.q0.add(h3);
                        rf rfVar8 = h3.U;
                        if (rfVar8 != null) {
                            ((sf) rfVar8).q0.remove(h3);
                            h3.C();
                        }
                        h3.U = sfVar;
                        dfVar2.a();
                        h3.h0 = childAt3.getVisibility();
                        h3.g0 = childAt3;
                        if (childAt3 instanceof af) {
                            ((af) childAt3).h(h3, sfVar.v0);
                        }
                        if (dfVar2.d0) {
                            os osVar = (os) h3;
                            int i27 = dfVar2.m0;
                            int i28 = dfVar2.n0;
                            float f2 = dfVar2.o0;
                            if (f2 == -1.0f) {
                                c = 65535;
                                if (i27 != -1) {
                                    if (i27 > -1) {
                                        osVar.q0 = -1.0f;
                                        osVar.r0 = i27;
                                        osVar.s0 = -1;
                                    }
                                } else if (i28 != -1 && i28 > -1) {
                                    osVar.q0 = -1.0f;
                                    osVar.r0 = -1;
                                    osVar.s0 = i28;
                                }
                                i3 = i26;
                                z2 = z;
                                i5 = i23;
                            } else if (f2 > -1.0f) {
                                osVar.q0 = f2;
                                c = 65535;
                                osVar.r0 = -1;
                                osVar.s0 = -1;
                                i3 = i26;
                                z2 = z;
                                i5 = i23;
                            }
                        } else {
                            int i29 = dfVar2.f0;
                            int i30 = dfVar2.g0;
                            int i31 = dfVar2.h0;
                            int i32 = dfVar2.i0;
                            int i33 = dfVar2.j0;
                            int i34 = dfVar2.k0;
                            i3 = i26;
                            float f3 = dfVar2.l0;
                            int i35 = dfVar2.p;
                            z2 = z;
                            if (i35 != -1) {
                                rf rfVar9 = (rf) sparseArray4.get(i35);
                                if (rfVar9 != null) {
                                    float f4 = dfVar2.r;
                                    int i36 = dfVar2.q;
                                    we weVar = we.CENTER;
                                    h3.v(weVar, rfVar9, weVar, i36, 0);
                                    h3.D = f4;
                                }
                                constraintLayout = this;
                                rfVar6 = h3;
                                dfVar = dfVar2;
                            } else {
                                if (i29 != -1) {
                                    rf rfVar10 = (rf) sparseArray4.get(i29);
                                    if (rfVar10 != null) {
                                        we weVar2 = we.LEFT;
                                        rfVar = h3;
                                        rfVar.v(weVar2, rfVar10, weVar2, ((ViewGroup.MarginLayoutParams) dfVar2).leftMargin, i33);
                                    } else {
                                        rfVar = h3;
                                    }
                                } else {
                                    rfVar = h3;
                                    if (i30 != -1 && (rfVar2 = (rf) sparseArray4.get(i30)) != null) {
                                        rfVar.v(we.LEFT, rfVar2, we.RIGHT, ((ViewGroup.MarginLayoutParams) dfVar2).leftMargin, i33);
                                    }
                                }
                                if (i31 != -1) {
                                    rf rfVar11 = (rf) sparseArray4.get(i31);
                                    if (rfVar11 != null) {
                                        rfVar.v(we.RIGHT, rfVar11, we.LEFT, ((ViewGroup.MarginLayoutParams) dfVar2).rightMargin, i34);
                                    }
                                } else if (i32 != -1 && (rfVar3 = (rf) sparseArray4.get(i32)) != null) {
                                    we weVar3 = we.RIGHT;
                                    rfVar.v(weVar3, rfVar3, weVar3, ((ViewGroup.MarginLayoutParams) dfVar2).rightMargin, i34);
                                }
                                int i37 = dfVar2.i;
                                if (i37 != -1) {
                                    rf rfVar12 = (rf) sparseArray4.get(i37);
                                    if (rfVar12 != null) {
                                        we weVar4 = we.TOP;
                                        rfVar.v(weVar4, rfVar12, weVar4, ((ViewGroup.MarginLayoutParams) dfVar2).topMargin, dfVar2.x);
                                    }
                                } else {
                                    int i38 = dfVar2.j;
                                    if (i38 != -1 && (rfVar4 = (rf) sparseArray4.get(i38)) != null) {
                                        rfVar.v(we.TOP, rfVar4, we.BOTTOM, ((ViewGroup.MarginLayoutParams) dfVar2).topMargin, dfVar2.x);
                                    }
                                }
                                int i39 = dfVar2.k;
                                if (i39 != -1) {
                                    rf rfVar13 = (rf) sparseArray4.get(i39);
                                    if (rfVar13 != null) {
                                        rfVar.v(we.BOTTOM, rfVar13, we.TOP, ((ViewGroup.MarginLayoutParams) dfVar2).bottomMargin, dfVar2.z);
                                    }
                                } else {
                                    int i40 = dfVar2.l;
                                    if (i40 != -1 && (rfVar5 = (rf) sparseArray4.get(i40)) != null) {
                                        we weVar5 = we.BOTTOM;
                                        rfVar.v(weVar5, rfVar5, weVar5, ((ViewGroup.MarginLayoutParams) dfVar2).bottomMargin, dfVar2.z);
                                    }
                                }
                                dfVar = dfVar2;
                                int i41 = dfVar.m;
                                if (i41 != -1) {
                                    constraintLayout = this;
                                    rfVar6 = rfVar;
                                    constraintLayout.l(rfVar6, dfVar, sparseArray4, i41, we.BASELINE);
                                } else {
                                    int i42 = dfVar.n;
                                    if (i42 != -1) {
                                        constraintLayout = this;
                                        rfVar6 = rfVar;
                                        constraintLayout.l(rfVar6, dfVar, sparseArray4, i42, we.TOP);
                                    } else {
                                        int i43 = dfVar.o;
                                        if (i43 != -1) {
                                            constraintLayout = this;
                                            rfVar6 = rfVar;
                                            constraintLayout.l(rfVar6, dfVar, sparseArray4, i43, we.BOTTOM);
                                        } else {
                                            constraintLayout = this;
                                            rfVar6 = rfVar;
                                        }
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    rfVar6.e0 = f3;
                                }
                                float f5 = dfVar.F;
                                if (f5 >= 0.0f) {
                                    rfVar6.f0 = f5;
                                }
                            }
                            if (isInEditMode && ((i8 = dfVar.T) != -1 || dfVar.U != -1)) {
                                int i44 = dfVar.U;
                                rfVar6.Z = i8;
                                rfVar6.a0 = i44;
                            }
                            if (dfVar.a0) {
                                rfVar6.M(qf.FIXED);
                                rfVar6.O(((ViewGroup.MarginLayoutParams) dfVar).width);
                                if (((ViewGroup.MarginLayoutParams) dfVar).width == -2) {
                                    rfVar6.M(qf.WRAP_CONTENT);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) dfVar).width == -1) {
                                if (dfVar.W) {
                                    rfVar6.M(qf.MATCH_CONSTRAINT);
                                } else {
                                    rfVar6.M(qf.MATCH_PARENT);
                                }
                                rfVar6.i(we.LEFT).g = ((ViewGroup.MarginLayoutParams) dfVar).leftMargin;
                                rfVar6.i(we.RIGHT).g = ((ViewGroup.MarginLayoutParams) dfVar).rightMargin;
                            } else {
                                rfVar6.M(qf.MATCH_CONSTRAINT);
                                rfVar6.O(0);
                            }
                            if (dfVar.b0) {
                                i4 = -1;
                                rfVar6.N(qf.FIXED);
                                rfVar6.L(((ViewGroup.MarginLayoutParams) dfVar).height);
                                if (((ViewGroup.MarginLayoutParams) dfVar).height == -2) {
                                    rfVar6.N(qf.WRAP_CONTENT);
                                }
                            } else {
                                i4 = -1;
                                if (((ViewGroup.MarginLayoutParams) dfVar).height == -1) {
                                    if (dfVar.X) {
                                        rfVar6.N(qf.MATCH_CONSTRAINT);
                                    } else {
                                        rfVar6.N(qf.MATCH_PARENT);
                                    }
                                    rfVar6.i(we.TOP).g = ((ViewGroup.MarginLayoutParams) dfVar).topMargin;
                                    rfVar6.i(we.BOTTOM).g = ((ViewGroup.MarginLayoutParams) dfVar).bottomMargin;
                                } else {
                                    rfVar6.N(qf.MATCH_CONSTRAINT);
                                    rfVar6.L(0);
                                }
                            }
                            String str2 = dfVar.G;
                            if (str2 == null || str2.length() == 0) {
                                rfVar6.X = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i6 = i4;
                                    i7 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i6 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? i16 : i4;
                                    i7 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i7);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i7, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i6 == i16 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    rfVar6.X = parseFloat;
                                    rfVar6.Y = i6;
                                }
                            }
                            float f6 = dfVar.H;
                            float[] fArr = rfVar6.l0;
                            fArr[0] = f6;
                            i16 = 1;
                            fArr[1] = dfVar.I;
                            rfVar6.j0 = dfVar.J;
                            rfVar6.k0 = dfVar.K;
                            int i45 = dfVar.Z;
                            if (i45 >= 0 && i45 <= 3) {
                                rfVar6.q = i45;
                            }
                            int i46 = dfVar.L;
                            int i47 = dfVar.N;
                            int i48 = dfVar.P;
                            float f7 = dfVar.R;
                            rfVar6.r = i46;
                            rfVar6.u = i47;
                            if (i48 == Integer.MAX_VALUE) {
                                i48 = 0;
                            }
                            rfVar6.v = i48;
                            rfVar6.w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i46 == 0) {
                                rfVar6.r = i23;
                            }
                            int i49 = dfVar.M;
                            int i50 = dfVar.O;
                            int i51 = dfVar.Q;
                            float f8 = dfVar.S;
                            rfVar6.s = i49;
                            rfVar6.x = i50;
                            if (i51 == Integer.MAX_VALUE) {
                                i51 = 0;
                            }
                            rfVar6.y = i51;
                            rfVar6.z = f8;
                            if (f8 <= 0.0f || f8 >= 1.0f || i49 != 0) {
                                i5 = 2;
                            } else {
                                i5 = 2;
                                rfVar6.s = 2;
                            }
                        }
                        i26 = i3 + 1;
                        i23 = i5;
                        z = z2;
                    }
                    i3 = i26;
                    z2 = z;
                    i5 = i23;
                    i26 = i3 + 1;
                    i23 = i5;
                    z = z2;
                }
            }
            if (z) {
                sfVar.r0.y(sfVar);
            }
        }
        sfVar.w0.getClass();
        constraintLayout.k(sfVar, constraintLayout.n, i, i2);
        int q = sfVar.q();
        int k = sfVar.k();
        boolean z5 = sfVar.E0;
        boolean z6 = sfVar.F0;
        ef efVar = constraintLayout.t;
        int i52 = efVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(q + efVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k + i52, i2, 0) & 16777215;
        int min = Math.min(constraintLayout.k, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.l, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        rf h = h(view);
        if ((view instanceof Guideline) && !(h instanceof os)) {
            df dfVar = (df) view.getLayoutParams();
            os osVar = new os();
            dfVar.p0 = osVar;
            dfVar.d0 = true;
            osVar.S(dfVar.V);
        }
        if (view instanceof af) {
            af afVar = (af) view;
            afVar.i();
            ((df) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(afVar)) {
                arrayList.add(afVar);
            }
        }
        this.f.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        rf h = h(view);
        this.h.q0.remove(h);
        h.C();
        this.g.remove(view);
        this.m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    public void setConstraintSet(of ofVar) {
        this.o = ofVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(tf tfVar) {
        i5 i5Var = this.p;
        if (i5Var != null) {
            i5Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n = i;
        sf sfVar = this.h;
        sfVar.D0 = i;
        xx.q = sfVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new sf();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = new SparseArray();
        this.t = new ef(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        df dfVar = new df(layoutParams);
        dfVar.a = -1;
        dfVar.b = -1;
        dfVar.c = -1.0f;
        dfVar.d = true;
        dfVar.e = -1;
        dfVar.f = -1;
        dfVar.g = -1;
        dfVar.h = -1;
        dfVar.i = -1;
        dfVar.j = -1;
        dfVar.k = -1;
        dfVar.l = -1;
        dfVar.m = -1;
        dfVar.n = -1;
        dfVar.o = -1;
        dfVar.p = -1;
        dfVar.q = 0;
        dfVar.r = 0.0f;
        dfVar.s = -1;
        dfVar.t = -1;
        dfVar.u = -1;
        dfVar.v = -1;
        dfVar.w = Integer.MIN_VALUE;
        dfVar.x = Integer.MIN_VALUE;
        dfVar.y = Integer.MIN_VALUE;
        dfVar.z = Integer.MIN_VALUE;
        dfVar.A = Integer.MIN_VALUE;
        dfVar.B = Integer.MIN_VALUE;
        dfVar.C = Integer.MIN_VALUE;
        dfVar.D = 0;
        dfVar.E = 0.5f;
        dfVar.F = 0.5f;
        dfVar.G = null;
        dfVar.H = -1.0f;
        dfVar.I = -1.0f;
        dfVar.J = 0;
        dfVar.K = 0;
        dfVar.L = 0;
        dfVar.M = 0;
        dfVar.N = 0;
        dfVar.O = 0;
        dfVar.P = 0;
        dfVar.Q = 0;
        dfVar.R = 1.0f;
        dfVar.S = 1.0f;
        dfVar.T = -1;
        dfVar.U = -1;
        dfVar.V = -1;
        dfVar.W = false;
        dfVar.X = false;
        dfVar.Y = null;
        dfVar.Z = 0;
        dfVar.a0 = true;
        dfVar.b0 = true;
        dfVar.c0 = false;
        dfVar.d0 = false;
        dfVar.e0 = false;
        dfVar.f0 = -1;
        dfVar.g0 = -1;
        dfVar.h0 = -1;
        dfVar.i0 = -1;
        dfVar.j0 = Integer.MIN_VALUE;
        dfVar.k0 = Integer.MIN_VALUE;
        dfVar.l0 = 0.5f;
        dfVar.p0 = new rf();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) dfVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) dfVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) dfVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) dfVar).bottomMargin = marginLayoutParams.bottomMargin;
            dfVar.setMarginStart(marginLayoutParams.getMarginStart());
            dfVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof df)) {
            return dfVar;
        }
        df dfVar2 = (df) layoutParams;
        dfVar.a = dfVar2.a;
        dfVar.b = dfVar2.b;
        dfVar.c = dfVar2.c;
        dfVar.d = dfVar2.d;
        dfVar.e = dfVar2.e;
        dfVar.f = dfVar2.f;
        dfVar.g = dfVar2.g;
        dfVar.h = dfVar2.h;
        dfVar.i = dfVar2.i;
        dfVar.j = dfVar2.j;
        dfVar.k = dfVar2.k;
        dfVar.l = dfVar2.l;
        dfVar.m = dfVar2.m;
        dfVar.n = dfVar2.n;
        dfVar.o = dfVar2.o;
        dfVar.p = dfVar2.p;
        dfVar.q = dfVar2.q;
        dfVar.r = dfVar2.r;
        dfVar.s = dfVar2.s;
        dfVar.t = dfVar2.t;
        dfVar.u = dfVar2.u;
        dfVar.v = dfVar2.v;
        dfVar.w = dfVar2.w;
        dfVar.x = dfVar2.x;
        dfVar.y = dfVar2.y;
        dfVar.z = dfVar2.z;
        dfVar.A = dfVar2.A;
        dfVar.B = dfVar2.B;
        dfVar.C = dfVar2.C;
        dfVar.D = dfVar2.D;
        dfVar.E = dfVar2.E;
        dfVar.F = dfVar2.F;
        dfVar.G = dfVar2.G;
        dfVar.H = dfVar2.H;
        dfVar.I = dfVar2.I;
        dfVar.J = dfVar2.J;
        dfVar.K = dfVar2.K;
        dfVar.W = dfVar2.W;
        dfVar.X = dfVar2.X;
        dfVar.L = dfVar2.L;
        dfVar.M = dfVar2.M;
        dfVar.N = dfVar2.N;
        dfVar.P = dfVar2.P;
        dfVar.O = dfVar2.O;
        dfVar.Q = dfVar2.Q;
        dfVar.R = dfVar2.R;
        dfVar.S = dfVar2.S;
        dfVar.T = dfVar2.T;
        dfVar.U = dfVar2.U;
        dfVar.V = dfVar2.V;
        dfVar.a0 = dfVar2.a0;
        dfVar.b0 = dfVar2.b0;
        dfVar.c0 = dfVar2.c0;
        dfVar.d0 = dfVar2.d0;
        dfVar.f0 = dfVar2.f0;
        dfVar.g0 = dfVar2.g0;
        dfVar.h0 = dfVar2.h0;
        dfVar.i0 = dfVar2.i0;
        dfVar.j0 = dfVar2.j0;
        dfVar.k0 = dfVar2.k0;
        dfVar.l0 = dfVar2.l0;
        dfVar.Y = dfVar2.Y;
        dfVar.Z = dfVar2.Z;
        dfVar.p0 = dfVar2.p0;
        return dfVar;
    }
}

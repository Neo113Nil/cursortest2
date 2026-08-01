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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a30;
import defpackage.bn;
import defpackage.cn;
import defpackage.dd;
import defpackage.ed;
import defpackage.fd;
import defpackage.ff;
import defpackage.fj;
import defpackage.gd;
import defpackage.gy;
import defpackage.h5;
import defpackage.l70;
import defpackage.p80;
import defpackage.p9;
import defpackage.pn;
import defpackage.r6;
import defpackage.ra0;
import defpackage.rc;
import defpackage.sc;
import defpackage.tc;
import defpackage.tn;
import defpackage.u7;
import defpackage.uc;
import defpackage.vc;
import defpackage.wc;
import defpackage.xq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static a30 u;
    public final SparseArray f;
    public final ArrayList g;
    public final fd h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public dd o;
    public h5 p;
    public int q;
    public HashMap r;
    public final SparseArray s;
    public final uc t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new fd();
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
        this.t = new uc(this, this);
        i(attributeSet, 0);
    }

    public static tc g() {
        tc tcVar = new tc(-2, -2);
        tcVar.a = -1;
        tcVar.b = -1;
        tcVar.c = -1.0f;
        tcVar.d = true;
        tcVar.e = -1;
        tcVar.f = -1;
        tcVar.g = -1;
        tcVar.h = -1;
        tcVar.i = -1;
        tcVar.j = -1;
        tcVar.k = -1;
        tcVar.l = -1;
        tcVar.m = -1;
        tcVar.n = -1;
        tcVar.o = -1;
        tcVar.p = -1;
        tcVar.q = 0;
        tcVar.r = 0.0f;
        tcVar.s = -1;
        tcVar.t = -1;
        tcVar.u = -1;
        tcVar.v = -1;
        tcVar.w = Integer.MIN_VALUE;
        tcVar.x = Integer.MIN_VALUE;
        tcVar.y = Integer.MIN_VALUE;
        tcVar.z = Integer.MIN_VALUE;
        tcVar.A = Integer.MIN_VALUE;
        tcVar.B = Integer.MIN_VALUE;
        tcVar.C = Integer.MIN_VALUE;
        tcVar.D = 0;
        tcVar.E = 0.5f;
        tcVar.F = 0.5f;
        tcVar.G = null;
        tcVar.H = -1.0f;
        tcVar.I = -1.0f;
        tcVar.J = 0;
        tcVar.K = 0;
        tcVar.L = 0;
        tcVar.M = 0;
        tcVar.N = 0;
        tcVar.O = 0;
        tcVar.P = 0;
        tcVar.Q = 0;
        tcVar.R = 1.0f;
        tcVar.S = 1.0f;
        tcVar.T = -1;
        tcVar.U = -1;
        tcVar.V = -1;
        tcVar.W = false;
        tcVar.X = false;
        tcVar.Y = null;
        tcVar.Z = 0;
        tcVar.a0 = true;
        tcVar.b0 = true;
        tcVar.c0 = false;
        tcVar.d0 = false;
        tcVar.e0 = false;
        tcVar.f0 = -1;
        tcVar.g0 = -1;
        tcVar.h0 = -1;
        tcVar.i0 = -1;
        tcVar.j0 = Integer.MIN_VALUE;
        tcVar.k0 = Integer.MIN_VALUE;
        tcVar.l0 = 0.5f;
        tcVar.p0 = new ed();
        return tcVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static a30 getSharedValues() {
        if (u == null) {
            a30 a30Var = new a30();
            new SparseIntArray();
            new HashMap();
            u = a30Var;
        }
        return u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((rc) arrayList.get(i)).getClass();
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
        tc tcVar = new tc(context, attributeSet);
        tcVar.a = -1;
        tcVar.b = -1;
        tcVar.c = -1.0f;
        tcVar.d = true;
        tcVar.e = -1;
        tcVar.f = -1;
        tcVar.g = -1;
        tcVar.h = -1;
        tcVar.i = -1;
        tcVar.j = -1;
        tcVar.k = -1;
        tcVar.l = -1;
        tcVar.m = -1;
        tcVar.n = -1;
        tcVar.o = -1;
        tcVar.p = -1;
        tcVar.q = 0;
        tcVar.r = 0.0f;
        tcVar.s = -1;
        tcVar.t = -1;
        tcVar.u = -1;
        tcVar.v = -1;
        tcVar.w = Integer.MIN_VALUE;
        tcVar.x = Integer.MIN_VALUE;
        tcVar.y = Integer.MIN_VALUE;
        tcVar.z = Integer.MIN_VALUE;
        tcVar.A = Integer.MIN_VALUE;
        tcVar.B = Integer.MIN_VALUE;
        tcVar.C = Integer.MIN_VALUE;
        tcVar.D = 0;
        tcVar.E = 0.5f;
        tcVar.F = 0.5f;
        tcVar.G = null;
        tcVar.H = -1.0f;
        tcVar.I = -1.0f;
        tcVar.J = 0;
        tcVar.K = 0;
        tcVar.L = 0;
        tcVar.M = 0;
        tcVar.N = 0;
        tcVar.O = 0;
        tcVar.P = 0;
        tcVar.Q = 0;
        tcVar.R = 1.0f;
        tcVar.S = 1.0f;
        tcVar.T = -1;
        tcVar.U = -1;
        tcVar.V = -1;
        tcVar.W = false;
        tcVar.X = false;
        tcVar.Y = null;
        tcVar.Z = 0;
        tcVar.a0 = true;
        tcVar.b0 = true;
        tcVar.c0 = false;
        tcVar.d0 = false;
        tcVar.e0 = false;
        tcVar.f0 = -1;
        tcVar.g0 = -1;
        tcVar.h0 = -1;
        tcVar.i0 = -1;
        tcVar.j0 = Integer.MIN_VALUE;
        tcVar.k0 = Integer.MIN_VALUE;
        tcVar.l0 = 0.5f;
        tcVar.p0 = new ed();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gy.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = sc.a.get(index);
            switch (i2) {
                case 1:
                    tcVar.V = obtainStyledAttributes.getInt(index, tcVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, tcVar.p);
                    tcVar.p = resourceId;
                    if (resourceId == -1) {
                        tcVar.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    tcVar.q = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, tcVar.r) % 360.0f;
                    tcVar.r = f;
                    if (f < 0.0f) {
                        tcVar.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                    tcVar.a = obtainStyledAttributes.getDimensionPixelOffset(index, tcVar.a);
                    break;
                case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                    tcVar.b = obtainStyledAttributes.getDimensionPixelOffset(index, tcVar.b);
                    break;
                case 7:
                    tcVar.c = obtainStyledAttributes.getFloat(index, tcVar.c);
                    break;
                case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, tcVar.e);
                    tcVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        tcVar.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, tcVar.f);
                    tcVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        tcVar.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, tcVar.g);
                    tcVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        tcVar.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, tcVar.h);
                    tcVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        tcVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, tcVar.i);
                    tcVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        tcVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, tcVar.j);
                    tcVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        tcVar.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, tcVar.k);
                    tcVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        tcVar.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, tcVar.l);
                    tcVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        tcVar.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, tcVar.m);
                    tcVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        tcVar.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, tcVar.s);
                    tcVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        tcVar.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, tcVar.t);
                    tcVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        tcVar.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, tcVar.u);
                    tcVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        tcVar.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, tcVar.v);
                    tcVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        tcVar.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    tcVar.w = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.w);
                    break;
                case 22:
                    tcVar.x = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.x);
                    break;
                case 23:
                    tcVar.y = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.y);
                    break;
                case 24:
                    tcVar.z = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.z);
                    break;
                case 25:
                    tcVar.A = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.A);
                    break;
                case 26:
                    tcVar.B = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.B);
                    break;
                case 27:
                    tcVar.W = obtainStyledAttributes.getBoolean(index, tcVar.W);
                    break;
                case 28:
                    tcVar.X = obtainStyledAttributes.getBoolean(index, tcVar.X);
                    break;
                case 29:
                    tcVar.E = obtainStyledAttributes.getFloat(index, tcVar.E);
                    break;
                case 30:
                    tcVar.F = obtainStyledAttributes.getFloat(index, tcVar.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    tcVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    tcVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        tcVar.N = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, tcVar.N) == -2) {
                            tcVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        tcVar.P = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, tcVar.P) == -2) {
                            tcVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    tcVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, tcVar.R));
                    tcVar.L = 2;
                    break;
                case 36:
                    try {
                        tcVar.O = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, tcVar.O) == -2) {
                            tcVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        tcVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, tcVar.Q) == -2) {
                            tcVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    tcVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, tcVar.S));
                    tcVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            dd.h(tcVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            tcVar.H = obtainStyledAttributes.getFloat(index, tcVar.H);
                            break;
                        case 46:
                            tcVar.I = obtainStyledAttributes.getFloat(index, tcVar.I);
                            break;
                        case 47:
                            tcVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            tcVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            tcVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, tcVar.T);
                            break;
                        case 50:
                            tcVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, tcVar.U);
                            break;
                        case 51:
                            tcVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, tcVar.n);
                            tcVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                tcVar.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, tcVar.o);
                            tcVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                tcVar.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            tcVar.D = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.D);
                            break;
                        case 55:
                            tcVar.C = obtainStyledAttributes.getDimensionPixelSize(index, tcVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    dd.g(tcVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    dd.g(tcVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    tcVar.Z = obtainStyledAttributes.getInt(index, tcVar.Z);
                                    break;
                                case 67:
                                    tcVar.d = obtainStyledAttributes.getBoolean(index, tcVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        tcVar.a();
        return tcVar;
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
        fd fdVar = this.h;
        if (fdVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                fdVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                fdVar.j = "parent";
            }
        }
        if (fdVar.h0 == null) {
            fdVar.h0 = fdVar.j;
            Log.v("ConstraintLayout", " setDebugName " + fdVar.h0);
        }
        ArrayList arrayList = fdVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ed edVar = (ed) obj;
            View view = edVar.f0;
            if (view != null) {
                if (edVar.j == null && (id = view.getId()) != -1) {
                    edVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (edVar.h0 == null) {
                    edVar.h0 = edVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + edVar.h0);
                }
            }
        }
        fdVar.n(sb);
        return sb.toString();
    }

    public final ed h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof tc) {
            return ((tc) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof tc) {
            return ((tc) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        fd fdVar = this.h;
        fdVar.f0 = this;
        uc ucVar = this.t;
        fdVar.u0 = ucVar;
        fdVar.s0.f = ucVar;
        this.f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gy.b, i, 0);
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
                        dd ddVar = new dd();
                        this.o = ddVar;
                        ddVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        fdVar.D0 = this.n;
        xq.q = fdVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        h5 h5Var = new h5(9, false);
        h5Var.g = new SparseArray();
        h5Var.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            vc vcVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h5Var.H(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                vc vcVar2 = new vc(context, xml);
                                ((SparseArray) h5Var.g).put(vcVar2.a, vcVar2);
                                vcVar = vcVar2;
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
                                wc wcVar = new wc(context, xml);
                                if (vcVar != null) {
                                    ((ArrayList) vcVar.c).add(wcVar);
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
        this.p = h5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(fd fdVar, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        char c;
        boolean z;
        int i7;
        int i8;
        boolean z2;
        ArrayList arrayList;
        uc ucVar;
        int i9;
        boolean z3;
        int i10;
        int i11;
        boolean t;
        uc ucVar2;
        boolean z4;
        boolean z5;
        uc ucVar3;
        boolean z6;
        tn tnVar;
        p80 p80Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int size;
        int i19;
        int size2;
        int i20;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i21 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        uc ucVar4 = this.t;
        ucVar4.b = max3;
        ucVar4.c = max4;
        ucVar4.d = paddingWidth;
        ucVar4.e = i21;
        ucVar4.f = i2;
        ucVar4.g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i22 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i23 = size3 - paddingWidth;
        int i24 = size4 - i21;
        int i25 = ucVar4.e;
        int i26 = ucVar4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.k - i26, i23);
                    i22 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.i);
                i4 = max;
                i22 = 2;
            } else {
                i4 = 0;
                i22 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.i);
            i4 = max;
            i22 = 2;
        } else {
            i4 = i23;
            i22 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.l - i25, i24);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.j);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.j);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i24;
            i6 = 2;
        }
        int q = fdVar.q();
        ff ffVar = fdVar.s0;
        int[] iArr = fdVar.C;
        int i27 = i4;
        if (i27 == q && i5 == fdVar.k()) {
            c = 1;
        } else {
            ffVar.c = true;
            c = 1;
        }
        fdVar.Y = 0;
        fdVar.Z = 0;
        iArr[0] = this.k - i26;
        iArr[c] = this.l - i25;
        fdVar.b0 = 0;
        fdVar.c0 = 0;
        fdVar.M(i22);
        fdVar.O(i27);
        fdVar.N(i6);
        fdVar.L(i5);
        int i28 = this.i - i26;
        if (i28 < 0) {
            fdVar.b0 = 0;
        } else {
            fdVar.b0 = i28;
        }
        int i29 = this.j - i25;
        if (i29 < 0) {
            fdVar.c0 = 0;
        } else {
            fdVar.c0 = i29;
        }
        fdVar.x0 = max5;
        fdVar.y0 = max3;
        r6 r6Var = fdVar.r0;
        fd fdVar2 = (fd) r6Var.d;
        ArrayList arrayList2 = (ArrayList) r6Var.b;
        uc ucVar5 = fdVar.u0;
        int size5 = fdVar.q0.size();
        int q2 = fdVar.q();
        int k = fdVar.k();
        boolean o = l70.o(i, 128);
        boolean z8 = o || l70.o(i, 64);
        if (z8) {
            int i30 = 0;
            while (i30 < size5) {
                boolean z9 = z8;
                ed edVar = (ed) fdVar.q0.get(i30);
                i7 = size5;
                int[] iArr2 = edVar.p0;
                int i31 = i30;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && edVar.W > 0.0f;
                if ((edVar.x() && z10) || ((edVar.y() && z10) || (edVar instanceof fj) || edVar.x() || edVar.y())) {
                    i8 = 1073741824;
                    z = false;
                    break;
                } else {
                    i30 = i31 + 1;
                    z8 = z9;
                    size5 = i7;
                }
            }
        }
        z = z8;
        i7 = size5;
        i8 = 1073741824;
        boolean z11 = z & ((mode == i8 && mode2 == i8) || o);
        if (z11) {
            int min = Math.min(iArr[0], i23);
            int min2 = Math.min(iArr[1], i24);
            int i32 = 1073741824;
            if (mode == 1073741824) {
                if (fdVar.q() != min) {
                    fdVar.O(min);
                    ffVar.b = true;
                }
                i32 = 1073741824;
            }
            if (mode2 == i32 && fdVar.k() != min2) {
                fdVar.L(min2);
                ffVar.b = true;
            }
            if (mode == i32 && mode2 == i32) {
                ArrayList arrayList3 = ffVar.e;
                fd fdVar3 = ffVar.a;
                if (ffVar.b || ffVar.c) {
                    ArrayList arrayList4 = fdVar3.q0;
                    int size6 = arrayList4.size();
                    z2 = z11;
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj = arrayList4.get(i33);
                        int i34 = i33 + 1;
                        ed edVar2 = (ed) obj;
                        edVar2.h();
                        edVar2.a = false;
                        edVar2.d.n();
                        edVar2.e.m();
                        arrayList4 = arrayList4;
                        i33 = i34;
                    }
                    fdVar3.h();
                    i14 = 0;
                    fdVar3.a = false;
                    fdVar3.d.n();
                    fdVar3.e.m();
                    ffVar.c = false;
                } else {
                    z2 = z11;
                    i14 = 0;
                }
                ffVar.b(ffVar.d);
                fdVar3.Y = i14;
                int[] iArr3 = fdVar3.p0;
                fdVar3.Z = i14;
                int j = fdVar3.j(i14);
                int j2 = fdVar3.j(1);
                if (ffVar.b) {
                    ffVar.c();
                }
                int r = fdVar3.r();
                ucVar = ucVar5;
                int s = fdVar3.s();
                arrayList = arrayList2;
                fdVar3.d.h.d(r);
                fdVar3.e.h.d(s);
                ffVar.g();
                if (j == 2 || j2 == 2) {
                    if (o) {
                        int size7 = arrayList3.size();
                        i15 = s;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i35);
                            i35++;
                            if (!((ra0) obj2).k()) {
                                o = false;
                                break;
                            }
                        }
                    } else {
                        i15 = s;
                    }
                    if (o && j == 2) {
                        fdVar3.M(1);
                        fdVar3.O(ffVar.d(fdVar3, 0));
                        fdVar3.d.e.d(fdVar3.q());
                    }
                    if (o && j2 == 2) {
                        i16 = 1;
                        fdVar3.N(1);
                        fdVar3.L(ffVar.d(fdVar3, 1));
                        fdVar3.e.e.d(fdVar3.k());
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q3 = fdVar3.q() + r;
                            fdVar3.d.i.d(q3);
                            fdVar3.d.e.d(q3 - r);
                            ffVar.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k2 = fdVar3.k() + i15;
                                fdVar3.e.i.d(k2);
                                fdVar3.e.e.d(k2 - i15);
                            }
                            ffVar.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            ra0 ra0Var = (ra0) obj3;
                            if (ra0Var.b != fdVar3 || ra0Var.g) {
                                ra0Var.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i20 = 0;
                        while (i20 < size2) {
                            Object obj4 = arrayList3.get(i20);
                            i20++;
                            ra0 ra0Var2 = (ra0) obj4;
                            if (z7 || ra0Var2.b != fdVar3) {
                                if (!ra0Var2.h.j || ((!ra0Var2.i.j && !(ra0Var2 instanceof cn)) || (!ra0Var2.e.j && !(ra0Var2 instanceof p9) && !(ra0Var2 instanceof cn)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        fdVar3.M(j);
                        fdVar3.N(j2);
                        i9 = 2;
                        i13 = 1073741824;
                    }
                } else {
                    i15 = s;
                }
                i16 = 1;
                i17 = iArr3[0];
                if (i17 != i16) {
                }
                int q32 = fdVar3.q() + r;
                fdVar3.d.i.d(q32);
                fdVar3.d.e.d(q32 - r);
                ffVar.g();
                i18 = iArr3[1];
                if (i18 != 1) {
                }
                int k22 = fdVar3.k() + i15;
                fdVar3.e.i.d(k22);
                fdVar3.e.e.d(k22 - i15);
                ffVar.g();
                z7 = true;
                size = arrayList3.size();
                i19 = 0;
                while (i19 < size) {
                }
                size2 = arrayList3.size();
                i20 = 0;
                while (i20 < size2) {
                }
                z3 = true;
                fdVar3.M(j);
                fdVar3.N(j2);
                i9 = 2;
                i13 = 1073741824;
            } else {
                z2 = z11;
                arrayList = arrayList2;
                ucVar = ucVar5;
                fd fdVar4 = ffVar.a;
                if (ffVar.b) {
                    ArrayList arrayList5 = fdVar4.q0;
                    int size8 = arrayList5.size();
                    int i36 = 0;
                    while (i36 < size8) {
                        Object obj5 = arrayList5.get(i36);
                        i36++;
                        ed edVar3 = (ed) obj5;
                        edVar3.h();
                        edVar3.a = false;
                        tn tnVar2 = edVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        tnVar2.e.j = false;
                        tnVar2.g = false;
                        tnVar2.n();
                        p80 p80Var2 = edVar3.e;
                        p80Var2.e.j = false;
                        p80Var2.g = false;
                        p80Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    fdVar4.h();
                    fdVar4.a = false;
                    tn tnVar3 = fdVar4.d;
                    tnVar3.e.j = false;
                    tnVar3.g = false;
                    tnVar3.n();
                    p80 p80Var3 = fdVar4.e;
                    p80Var3.e.j = false;
                    p80Var3.g = false;
                    p80Var3.m();
                    ffVar.c();
                } else {
                    i12 = 0;
                }
                ffVar.b(ffVar.d);
                fdVar4.Y = i12;
                fdVar4.Z = i12;
                fdVar4.d.h.d(i12);
                fdVar4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z3 = fdVar.T(i12, o);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= fdVar.T(1, o);
                    i9++;
                }
            }
            if (z3) {
                fdVar.P(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z11;
            arrayList = arrayList2;
            ucVar = ucVar5;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i37 = fdVar.D0;
        if (i7 > 0) {
            int size9 = fdVar.q0.size();
            boolean W = fdVar.W(64);
            uc ucVar6 = fdVar.u0;
            for (int i38 = 0; i38 < size9; i38++) {
                ed edVar4 = (ed) fdVar.q0.get(i38);
                if (!(edVar4 instanceof bn) && !(edVar4 instanceof u7) && !edVar4.F && (!W || (tnVar = edVar4.d) == null || (p80Var = edVar4.e) == null || !tnVar.e.j || !p80Var.e.j)) {
                    int j3 = edVar4.j(0);
                    int j4 = edVar4.j(1);
                    boolean z12 = j3 == 3 && edVar4.r != 1 && j4 == 3 && edVar4.s != 1;
                    if (!z12 && fdVar.W(1) && !(edVar4 instanceof fj)) {
                        if (j3 == 3 && edVar4.r == 0 && j4 != 3 && !edVar4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 && edVar4.s == 0 && j3 != 3 && !edVar4.x()) {
                            z12 = true;
                        }
                        if ((j3 == 3 || j4 == 3) && edVar4.W > 0.0f) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        r6Var.t(0, ucVar6, edVar4);
                    }
                }
            }
            ConstraintLayout constraintLayout = ucVar6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.g;
            for (int i39 = 0; i39 < childCount2; i39++) {
                constraintLayout.getChildAt(i39);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i40 = 0; i40 < size10; i40++) {
                    ((rc) arrayList7.get(i40)).getClass();
                }
            }
        }
        r6Var.z(fdVar);
        int size11 = arrayList.size();
        if (i7 > 0) {
            r6Var.x(fdVar, 0, q2, k);
        }
        if (size11 > 0) {
            int[] iArr4 = fdVar.p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int max7 = Math.max(fdVar.q(), fdVar2.b0);
            int max8 = Math.max(fdVar.k(), fdVar2.c0);
            int i41 = 0;
            boolean z15 = false;
            while (i41 < size11) {
                ArrayList arrayList8 = arrayList;
                ed edVar5 = (ed) arrayList8.get(i41);
                if (edVar5 instanceof fj) {
                    int q4 = edVar5.q();
                    int k3 = edVar5.k();
                    z4 = z14;
                    z5 = z13;
                    ucVar3 = ucVar;
                    boolean t2 = z15 | r6Var.t(1, ucVar3, edVar5);
                    int q5 = edVar5.q();
                    int k4 = edVar5.k();
                    if (q5 != q4) {
                        edVar5.O(q5);
                        if (z5 && edVar5.r() + edVar5.U > max7) {
                            max7 = Math.max(max7, edVar5.i(4).e() + edVar5.r() + edVar5.U);
                        }
                        z6 = true;
                    } else {
                        z6 = t2;
                    }
                    if (k4 != k3) {
                        edVar5.L(k4);
                        if (z4 && edVar5.s() + edVar5.V > max8) {
                            max8 = Math.max(max8, edVar5.i(5).e() + edVar5.s() + edVar5.V);
                        }
                        z6 = true;
                    }
                    z15 = ((fj) edVar5).y0 | z6;
                } else {
                    z4 = z14;
                    z5 = z13;
                    ucVar3 = ucVar;
                }
                i41++;
                ucVar = ucVar3;
                arrayList = arrayList8;
                z13 = z5;
                z14 = z4;
            }
            boolean z16 = z14;
            boolean z17 = z13;
            ArrayList arrayList9 = arrayList;
            int i42 = 0;
            while (true) {
                uc ucVar7 = ucVar;
                if (i42 >= 2) {
                    break;
                }
                int i43 = 0;
                while (i43 < size11) {
                    ed edVar6 = (ed) arrayList9.get(i43);
                    if (((edVar6 instanceof pn) && !(edVar6 instanceof fj)) || (edVar6 instanceof bn) || edVar6.g0 == 8 || ((z2 && edVar6.d.e.j && edVar6.e.e.j) || (edVar6 instanceof fj))) {
                        i10 = size11;
                        ucVar2 = ucVar7;
                        i11 = i43;
                        t = z15;
                    } else {
                        int q6 = edVar6.q();
                        int k5 = edVar6.k();
                        i10 = size11;
                        int i44 = edVar6.a0;
                        i11 = i43;
                        t = r6Var.t(i42 == 1 ? 2 : 1, ucVar7, edVar6) | z15;
                        int q7 = edVar6.q();
                        ucVar2 = ucVar7;
                        int k6 = edVar6.k();
                        if (q7 != q6) {
                            edVar6.O(q7);
                            if (z17 && edVar6.r() + edVar6.U > max7) {
                                max7 = Math.max(max7, edVar6.i(4).e() + edVar6.r() + edVar6.U);
                            }
                            t = true;
                        }
                        if (k6 != k5) {
                            edVar6.L(k6);
                            if (z16 && edVar6.s() + edVar6.V > max8) {
                                max8 = Math.max(max8, edVar6.i(5).e() + edVar6.s() + edVar6.V);
                            }
                            t = true;
                        }
                        if (edVar6.E && i44 != edVar6.a0) {
                            t = true;
                        }
                    }
                    z15 = t;
                    ucVar7 = ucVar2;
                    i43 = i11 + 1;
                    size11 = i10;
                }
                int i45 = size11;
                ucVar = ucVar7;
                if (!z15) {
                    break;
                }
                i42++;
                r6Var.x(fdVar, i42, q2, k);
                size11 = i45;
                z15 = false;
            }
        }
        fdVar.D0 = i37;
        xq.q = fdVar.W(512);
    }

    public final void l(ed edVar, tc tcVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f.get(i);
        ed edVar2 = (ed) sparseArray.get(i);
        if (edVar2 == null || view == null || !(view.getLayoutParams() instanceof tc)) {
            return;
        }
        tcVar.c0 = true;
        if (i2 == 6) {
            tc tcVar2 = (tc) view.getLayoutParams();
            tcVar2.c0 = true;
            tcVar2.p0.E = true;
        }
        edVar.i(6).b(edVar2.i(i2), tcVar.D, tcVar.C, true);
        edVar.E = true;
        edVar.i(3).j();
        edVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            tc tcVar = (tc) childAt.getLayoutParams();
            ed edVar = tcVar.p0;
            if (childAt.getVisibility() != 8 || tcVar.d0 || tcVar.e0 || isInEditMode) {
                int r = edVar.r();
                int s = edVar.s();
                childAt.layout(r, s, edVar.q() + r, edVar.k() + s);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((rc) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x034c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        ed edVar;
        int i4;
        ed edVar2;
        int i5;
        int i6;
        int i7;
        ed edVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ed edVar4;
        int i13;
        int i14;
        ed edVar5;
        tc tcVar;
        int i15;
        ed edVar6;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float parseFloat;
        int i21;
        char c;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f2;
        int i22;
        String resourceName;
        int id;
        ed edVar7;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.m;
        constraintLayout.m = z3;
        int i23 = 1;
        int i24 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i25).isLayoutRequested()) {
                    constraintLayout.m = true;
                    break;
                }
                i25++;
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        fd fdVar = constraintLayout.h;
        fdVar.v0 = z4;
        if (constraintLayout.m) {
            constraintLayout.m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i26 = 0;
            while (true) {
                if (i26 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i26).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i26++;
                }
            }
            if (z) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i27 = 0; i27 < childCount3; i27++) {
                    ed h = constraintLayout.h(constraintLayout.getChildAt(i27));
                    if (h != null) {
                        h.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f;
                if (isInEditMode) {
                    int i28 = 0;
                    while (i28 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i28);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i22 = i23;
                                try {
                                    if (constraintLayout.r == null) {
                                        constraintLayout.r = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i22 = i23;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i22 = i23;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                edVar7 = view == null ? null : ((tc) view.getLayoutParams()).p0;
                                edVar7.h0 = resourceName;
                                i28++;
                                i23 = i22;
                            }
                        }
                        edVar7 = fdVar;
                        edVar7.h0 = resourceName;
                        i28++;
                        i23 = i22;
                    }
                }
                int i29 = i23;
                if (constraintLayout.q != -1) {
                    for (int i30 = 0; i30 < childCount3; i30++) {
                        constraintLayout.getChildAt(i30).getId();
                    }
                }
                dd ddVar = constraintLayout.o;
                if (ddVar != null) {
                    ddVar.a(constraintLayout);
                }
                fdVar.q0.clear();
                ArrayList arrayList3 = constraintLayout.g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i31 = 0;
                    while (i31 < size) {
                        rc rcVar = (rc) arrayList3.get(i31);
                        HashMap hashMap = rcVar.l;
                        if (rcVar.isInEditMode()) {
                            rcVar.setIds(rcVar.j);
                        }
                        pn pnVar = rcVar.i;
                        if (pnVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            pnVar.r0 = i24;
                            Arrays.fill(pnVar.q0, (Object) null);
                            int i32 = i24;
                            while (i32 < rcVar.g) {
                                int i33 = rcVar.f[i32];
                                View view2 = (View) sparseArray3.get(i33);
                                if (view2 != null || (f2 = rcVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i33))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    rcVar.f[i32] = f2;
                                    hashMap.put(Integer.valueOf(f2), str);
                                    view2 = (View) sparseArray3.get(f2);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    pn pnVar2 = rcVar.i;
                                    ed h2 = constraintLayout.h(view3);
                                    pnVar2.getClass();
                                    if (h2 != pnVar2 && h2 != null) {
                                        int i34 = pnVar2.r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        ed[] edVarArr = pnVar2.q0;
                                        if (i34 > edVarArr.length) {
                                            pnVar2.q0 = (ed[]) Arrays.copyOf(edVarArr, edVarArr.length * 2);
                                        }
                                        ed[] edVarArr2 = pnVar2.q0;
                                        int i35 = pnVar2.r0;
                                        edVarArr2[i35] = h2;
                                        pnVar2.r0 = i35 + 1;
                                        i32++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i32++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            rcVar.i.S();
                        }
                        i31++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i24 = 0;
                    }
                }
                int i36 = 2;
                for (int i37 = 0; i37 < childCount3; i37++) {
                    constraintLayout.getChildAt(i37);
                }
                SparseArray sparseArray4 = constraintLayout.s;
                sparseArray4.clear();
                sparseArray4.put(0, fdVar);
                sparseArray4.put(constraintLayout.getId(), fdVar);
                for (int i38 = 0; i38 < childCount3; i38++) {
                    View childAt2 = constraintLayout.getChildAt(i38);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i39 = 0;
                while (i39 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i39);
                    ed h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        tc tcVar2 = (tc) childAt3.getLayoutParams();
                        fdVar.q0.add(h3);
                        ed edVar8 = h3.T;
                        if (edVar8 != null) {
                            ((fd) edVar8).q0.remove(h3);
                            h3.C();
                        }
                        h3.T = fdVar;
                        tcVar2.a();
                        h3.g0 = childAt3.getVisibility();
                        h3.f0 = childAt3;
                        if (childAt3 instanceof rc) {
                            ((rc) childAt3).h(h3, fdVar.v0);
                        }
                        if (tcVar2.d0) {
                            bn bnVar = (bn) h3;
                            int i40 = tcVar2.m0;
                            int i41 = tcVar2.n0;
                            float f3 = tcVar2.o0;
                            if (f3 == -1.0f) {
                                c = 65535;
                                if (i40 != -1) {
                                    if (i40 > -1) {
                                        bnVar.q0 = -1.0f;
                                        bnVar.r0 = i40;
                                        bnVar.s0 = -1;
                                    }
                                } else if (i41 != -1 && i41 > -1) {
                                    bnVar.q0 = -1.0f;
                                    bnVar.r0 = -1;
                                    bnVar.s0 = i41;
                                }
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            } else if (f3 > -1.0f) {
                                bnVar.q0 = f3;
                                c = 65535;
                                bnVar.r0 = -1;
                                bnVar.s0 = -1;
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            }
                        } else {
                            int i42 = tcVar2.f0;
                            int i43 = tcVar2.g0;
                            int i44 = tcVar2.h0;
                            int i45 = tcVar2.i0;
                            int i46 = tcVar2.j0;
                            int i47 = tcVar2.k0;
                            i3 = i39;
                            float f4 = tcVar2.l0;
                            int i48 = tcVar2.p;
                            z2 = z;
                            if (i48 != -1) {
                                ed edVar9 = (ed) sparseArray4.get(i48);
                                if (edVar9 != null) {
                                    float f5 = tcVar2.r;
                                    h3.v(7, 7, tcVar2.q, 0, edVar9);
                                    h3.D = f5;
                                }
                                constraintLayout = this;
                                edVar6 = h3;
                                tcVar = tcVar2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i42 != -1) {
                                    ed edVar10 = (ed) sparseArray4.get(i42);
                                    if (edVar10 != null) {
                                        edVar = h3;
                                        i4 = 2;
                                        edVar.v(2, 2, ((ViewGroup.MarginLayoutParams) tcVar2).leftMargin, i46, edVar10);
                                    } else {
                                        edVar = h3;
                                        i4 = 2;
                                    }
                                } else {
                                    edVar = h3;
                                    i4 = 2;
                                    if (i43 != -1 && (edVar2 = (ed) sparseArray4.get(i43)) != null) {
                                        edVar.v(2, 4, ((ViewGroup.MarginLayoutParams) tcVar2).leftMargin, i46, edVar2);
                                        i5 = 2;
                                        i6 = 4;
                                        if (i44 == -1) {
                                            ed edVar11 = (ed) sparseArray4.get(i44);
                                            if (edVar11 != null) {
                                                edVar.v(i6, i5, ((ViewGroup.MarginLayoutParams) tcVar2).rightMargin, i47, edVar11);
                                            }
                                            i7 = i5;
                                        } else {
                                            i7 = i5;
                                            if (i45 != -1 && (edVar3 = (ed) sparseArray4.get(i45)) != null) {
                                                edVar.v(i6, i6, ((ViewGroup.MarginLayoutParams) tcVar2).rightMargin, i47, edVar3);
                                            }
                                        }
                                        i8 = i6;
                                        i9 = tcVar2.i;
                                        if (i9 == -1) {
                                            ed edVar12 = (ed) sparseArray4.get(i9);
                                            if (edVar12 != null) {
                                                i16 = 3;
                                                edVar.v(3, 3, ((ViewGroup.MarginLayoutParams) tcVar2).topMargin, tcVar2.x, edVar12);
                                            } else {
                                                i16 = 3;
                                            }
                                            i11 = i16;
                                            i12 = 5;
                                            i10 = -1;
                                        } else {
                                            int i49 = tcVar2.j;
                                            i10 = -1;
                                            if (i49 == -1 || (edVar4 = (ed) sparseArray4.get(i49)) == null) {
                                                i11 = 3;
                                                i12 = 5;
                                            } else {
                                                edVar.v(3, 5, ((ViewGroup.MarginLayoutParams) tcVar2).topMargin, tcVar2.x, edVar4);
                                                i11 = 3;
                                                i12 = 5;
                                            }
                                        }
                                        i13 = tcVar2.k;
                                        if (i13 == i10) {
                                            ed edVar13 = (ed) sparseArray4.get(i13);
                                            if (edVar13 != null) {
                                                int i50 = i11;
                                                edVar.v(i12, i50, ((ViewGroup.MarginLayoutParams) tcVar2).bottomMargin, tcVar2.z, edVar13);
                                                i14 = i50;
                                            } else {
                                                i14 = i11;
                                            }
                                        } else {
                                            i14 = i11;
                                            int i51 = tcVar2.l;
                                            if (i51 != i10 && (edVar5 = (ed) sparseArray4.get(i51)) != null) {
                                                edVar.v(i12, i12, ((ViewGroup.MarginLayoutParams) tcVar2).bottomMargin, tcVar2.z, edVar5);
                                            }
                                        }
                                        tcVar = tcVar2;
                                        i15 = tcVar.m;
                                        if (i15 == -1) {
                                            constraintLayout = this;
                                            edVar6 = edVar;
                                            constraintLayout.l(edVar6, tcVar, sparseArray4, i15, 6);
                                        } else {
                                            int i52 = tcVar.n;
                                            if (i52 != -1) {
                                                constraintLayout = this;
                                                edVar6 = edVar;
                                                constraintLayout.l(edVar6, tcVar, sparseArray4, i52, i14);
                                            } else {
                                                int i53 = tcVar.o;
                                                constraintLayout = this;
                                                edVar6 = edVar;
                                                int i54 = i12;
                                                if (i53 != -1) {
                                                    constraintLayout.l(edVar6, tcVar, sparseArray4, i53, i54);
                                                }
                                                if (f4 >= 0.0f) {
                                                    edVar6.d0 = f4;
                                                }
                                                f = tcVar.F;
                                                if (f >= 0.0f) {
                                                    edVar6.e0 = f;
                                                }
                                            }
                                        }
                                        if (f4 >= 0.0f) {
                                        }
                                        f = tcVar.F;
                                        if (f >= 0.0f) {
                                        }
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i44 == -1) {
                                }
                                i8 = i6;
                                i9 = tcVar2.i;
                                if (i9 == -1) {
                                }
                                i13 = tcVar2.k;
                                if (i13 == i10) {
                                }
                                tcVar = tcVar2;
                                i15 = tcVar.m;
                                if (i15 == -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f = tcVar.F;
                                if (f >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i21 = tcVar.T) != -1 || tcVar.U != -1)) {
                                int i55 = tcVar.U;
                                edVar6.Y = i21;
                                edVar6.Z = i55;
                            }
                            if (tcVar.a0) {
                                edVar6.M(i29);
                                edVar6.O(((ViewGroup.MarginLayoutParams) tcVar).width);
                                if (((ViewGroup.MarginLayoutParams) tcVar).width == -2) {
                                    edVar6.M(i36);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) tcVar).width == -1) {
                                if (tcVar.W) {
                                    edVar6.M(3);
                                } else {
                                    edVar6.M(4);
                                }
                                edVar6.i(i7).g = ((ViewGroup.MarginLayoutParams) tcVar).leftMargin;
                                edVar6.i(i8).g = ((ViewGroup.MarginLayoutParams) tcVar).rightMargin;
                            } else {
                                edVar6.M(3);
                                edVar6.O(0);
                            }
                            if (tcVar.b0) {
                                i17 = -1;
                                edVar6.N(1);
                                edVar6.L(((ViewGroup.MarginLayoutParams) tcVar).height);
                                if (((ViewGroup.MarginLayoutParams) tcVar).height == -2) {
                                    edVar6.N(2);
                                }
                            } else {
                                i17 = -1;
                                if (((ViewGroup.MarginLayoutParams) tcVar).height == -1) {
                                    if (tcVar.X) {
                                        edVar6.N(3);
                                    } else {
                                        edVar6.N(4);
                                    }
                                    edVar6.i(3).g = ((ViewGroup.MarginLayoutParams) tcVar).topMargin;
                                    edVar6.i(5).g = ((ViewGroup.MarginLayoutParams) tcVar).bottomMargin;
                                } else {
                                    edVar6.N(3);
                                    edVar6.L(0);
                                }
                            }
                            String str2 = tcVar.G;
                            if (str2 == null || str2.length() == 0) {
                                edVar6.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i19 = i17;
                                    i20 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i19 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i17;
                                    i20 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i20);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i20, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i19 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    edVar6.W = parseFloat;
                                    edVar6.X = i19;
                                }
                            }
                            float f6 = tcVar.H;
                            float[] fArr = edVar6.k0;
                            fArr[0] = f6;
                            i29 = 1;
                            fArr[1] = tcVar.I;
                            edVar6.i0 = tcVar.J;
                            edVar6.j0 = tcVar.K;
                            int i56 = tcVar.Z;
                            if (i56 >= 0 && i56 <= 3) {
                                edVar6.q = i56;
                            }
                            int i57 = tcVar.L;
                            int i58 = tcVar.N;
                            int i59 = tcVar.P;
                            float f7 = tcVar.R;
                            edVar6.r = i57;
                            edVar6.u = i58;
                            if (i59 == Integer.MAX_VALUE) {
                                i59 = 0;
                            }
                            edVar6.v = i59;
                            edVar6.w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i57 == 0) {
                                edVar6.r = 2;
                            }
                            int i60 = tcVar.M;
                            int i61 = tcVar.O;
                            int i62 = tcVar.Q;
                            float f8 = tcVar.S;
                            edVar6.s = i60;
                            edVar6.x = i61;
                            if (i62 == Integer.MAX_VALUE) {
                                i62 = 0;
                            }
                            edVar6.y = i62;
                            edVar6.z = f8;
                            if (f8 <= 0.0f || f8 >= 1.0f || i60 != 0) {
                                i18 = 2;
                            } else {
                                i18 = 2;
                                edVar6.s = 2;
                            }
                        }
                        i39 = i3 + 1;
                        i36 = i18;
                        z = z2;
                    }
                    i3 = i39;
                    z2 = z;
                    i18 = i36;
                    i39 = i3 + 1;
                    i36 = i18;
                    z = z2;
                }
            }
            if (z) {
                fdVar.r0.z(fdVar);
            }
        }
        fdVar.w0.getClass();
        constraintLayout.k(fdVar, constraintLayout.n, i, i2);
        int q = fdVar.q();
        int k = fdVar.k();
        boolean z5 = fdVar.E0;
        boolean z6 = fdVar.F0;
        uc ucVar = constraintLayout.t;
        int i63 = ucVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(q + ucVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k + i63, i2, 0) & 16777215;
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
        ed h = h(view);
        if ((view instanceof Guideline) && !(h instanceof bn)) {
            tc tcVar = (tc) view.getLayoutParams();
            bn bnVar = new bn();
            tcVar.p0 = bnVar;
            tcVar.d0 = true;
            bnVar.S(tcVar.V);
        }
        if (view instanceof rc) {
            rc rcVar = (rc) view;
            rcVar.i();
            ((tc) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(rcVar)) {
                arrayList.add(rcVar);
            }
        }
        this.f.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        ed h = h(view);
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

    public void setConstraintSet(dd ddVar) {
        this.o = ddVar;
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

    public void setOnConstraintsChanged(gd gdVar) {
        h5 h5Var = this.p;
        if (h5Var != null) {
            h5Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n = i;
        fd fdVar = this.h;
        fdVar.D0 = i;
        xq.q = fdVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new fd();
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
        this.t = new uc(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        tc tcVar = new tc(layoutParams);
        tcVar.a = -1;
        tcVar.b = -1;
        tcVar.c = -1.0f;
        tcVar.d = true;
        tcVar.e = -1;
        tcVar.f = -1;
        tcVar.g = -1;
        tcVar.h = -1;
        tcVar.i = -1;
        tcVar.j = -1;
        tcVar.k = -1;
        tcVar.l = -1;
        tcVar.m = -1;
        tcVar.n = -1;
        tcVar.o = -1;
        tcVar.p = -1;
        tcVar.q = 0;
        tcVar.r = 0.0f;
        tcVar.s = -1;
        tcVar.t = -1;
        tcVar.u = -1;
        tcVar.v = -1;
        tcVar.w = Integer.MIN_VALUE;
        tcVar.x = Integer.MIN_VALUE;
        tcVar.y = Integer.MIN_VALUE;
        tcVar.z = Integer.MIN_VALUE;
        tcVar.A = Integer.MIN_VALUE;
        tcVar.B = Integer.MIN_VALUE;
        tcVar.C = Integer.MIN_VALUE;
        tcVar.D = 0;
        tcVar.E = 0.5f;
        tcVar.F = 0.5f;
        tcVar.G = null;
        tcVar.H = -1.0f;
        tcVar.I = -1.0f;
        tcVar.J = 0;
        tcVar.K = 0;
        tcVar.L = 0;
        tcVar.M = 0;
        tcVar.N = 0;
        tcVar.O = 0;
        tcVar.P = 0;
        tcVar.Q = 0;
        tcVar.R = 1.0f;
        tcVar.S = 1.0f;
        tcVar.T = -1;
        tcVar.U = -1;
        tcVar.V = -1;
        tcVar.W = false;
        tcVar.X = false;
        tcVar.Y = null;
        tcVar.Z = 0;
        tcVar.a0 = true;
        tcVar.b0 = true;
        tcVar.c0 = false;
        tcVar.d0 = false;
        tcVar.e0 = false;
        tcVar.f0 = -1;
        tcVar.g0 = -1;
        tcVar.h0 = -1;
        tcVar.i0 = -1;
        tcVar.j0 = Integer.MIN_VALUE;
        tcVar.k0 = Integer.MIN_VALUE;
        tcVar.l0 = 0.5f;
        tcVar.p0 = new ed();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) tcVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) tcVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) tcVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) tcVar).bottomMargin = marginLayoutParams.bottomMargin;
            tcVar.setMarginStart(marginLayoutParams.getMarginStart());
            tcVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof tc)) {
            return tcVar;
        }
        tc tcVar2 = (tc) layoutParams;
        tcVar.a = tcVar2.a;
        tcVar.b = tcVar2.b;
        tcVar.c = tcVar2.c;
        tcVar.d = tcVar2.d;
        tcVar.e = tcVar2.e;
        tcVar.f = tcVar2.f;
        tcVar.g = tcVar2.g;
        tcVar.h = tcVar2.h;
        tcVar.i = tcVar2.i;
        tcVar.j = tcVar2.j;
        tcVar.k = tcVar2.k;
        tcVar.l = tcVar2.l;
        tcVar.m = tcVar2.m;
        tcVar.n = tcVar2.n;
        tcVar.o = tcVar2.o;
        tcVar.p = tcVar2.p;
        tcVar.q = tcVar2.q;
        tcVar.r = tcVar2.r;
        tcVar.s = tcVar2.s;
        tcVar.t = tcVar2.t;
        tcVar.u = tcVar2.u;
        tcVar.v = tcVar2.v;
        tcVar.w = tcVar2.w;
        tcVar.x = tcVar2.x;
        tcVar.y = tcVar2.y;
        tcVar.z = tcVar2.z;
        tcVar.A = tcVar2.A;
        tcVar.B = tcVar2.B;
        tcVar.C = tcVar2.C;
        tcVar.D = tcVar2.D;
        tcVar.E = tcVar2.E;
        tcVar.F = tcVar2.F;
        tcVar.G = tcVar2.G;
        tcVar.H = tcVar2.H;
        tcVar.I = tcVar2.I;
        tcVar.J = tcVar2.J;
        tcVar.K = tcVar2.K;
        tcVar.W = tcVar2.W;
        tcVar.X = tcVar2.X;
        tcVar.L = tcVar2.L;
        tcVar.M = tcVar2.M;
        tcVar.N = tcVar2.N;
        tcVar.P = tcVar2.P;
        tcVar.O = tcVar2.O;
        tcVar.Q = tcVar2.Q;
        tcVar.R = tcVar2.R;
        tcVar.S = tcVar2.S;
        tcVar.T = tcVar2.T;
        tcVar.U = tcVar2.U;
        tcVar.V = tcVar2.V;
        tcVar.a0 = tcVar2.a0;
        tcVar.b0 = tcVar2.b0;
        tcVar.c0 = tcVar2.c0;
        tcVar.d0 = tcVar2.d0;
        tcVar.f0 = tcVar2.f0;
        tcVar.g0 = tcVar2.g0;
        tcVar.h0 = tcVar2.h0;
        tcVar.i0 = tcVar2.i0;
        tcVar.j0 = tcVar2.j0;
        tcVar.k0 = tcVar2.k0;
        tcVar.l0 = tcVar2.l0;
        tcVar.Y = tcVar2.Y;
        tcVar.Z = tcVar2.Z;
        tcVar.p0 = tcVar2.p0;
        return tcVar;
    }
}

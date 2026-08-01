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
import defpackage.a5;
import defpackage.ae;
import defpackage.be;
import defpackage.ce;
import defpackage.eh;
import defpackage.ga;
import defpackage.k6;
import defpackage.kr;
import defpackage.mp;
import defpackage.nd;
import defpackage.od;
import defpackage.ol;
import defpackage.pd;
import defpackage.qd;
import defpackage.qp;
import defpackage.r50;
import defpackage.rd;
import defpackage.rd0;
import defpackage.s7;
import defpackage.sd;
import defpackage.t00;
import defpackage.tb0;
import defpackage.yo;
import defpackage.ys;
import defpackage.zd;
import defpackage.zo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static r50 u;
    public final SparseArray f;
    public final ArrayList g;
    public final be h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public zd o;
    public a5 p;
    public int q;
    public HashMap r;
    public final SparseArray s;
    public final qd t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new be();
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
        this.t = new qd(this, this);
        i(attributeSet, 0);
    }

    public static pd g() {
        pd pdVar = new pd(-2, -2);
        pdVar.a = -1;
        pdVar.b = -1;
        pdVar.c = -1.0f;
        pdVar.d = true;
        pdVar.e = -1;
        pdVar.f = -1;
        pdVar.g = -1;
        pdVar.h = -1;
        pdVar.i = -1;
        pdVar.j = -1;
        pdVar.k = -1;
        pdVar.l = -1;
        pdVar.m = -1;
        pdVar.n = -1;
        pdVar.o = -1;
        pdVar.p = -1;
        pdVar.q = 0;
        pdVar.r = 0.0f;
        pdVar.s = -1;
        pdVar.t = -1;
        pdVar.u = -1;
        pdVar.v = -1;
        pdVar.w = Integer.MIN_VALUE;
        pdVar.x = Integer.MIN_VALUE;
        pdVar.y = Integer.MIN_VALUE;
        pdVar.z = Integer.MIN_VALUE;
        pdVar.A = Integer.MIN_VALUE;
        pdVar.B = Integer.MIN_VALUE;
        pdVar.C = Integer.MIN_VALUE;
        pdVar.D = 0;
        pdVar.E = 0.5f;
        pdVar.F = 0.5f;
        pdVar.G = null;
        pdVar.H = -1.0f;
        pdVar.I = -1.0f;
        pdVar.J = 0;
        pdVar.K = 0;
        pdVar.L = 0;
        pdVar.M = 0;
        pdVar.N = 0;
        pdVar.O = 0;
        pdVar.P = 0;
        pdVar.Q = 0;
        pdVar.R = 1.0f;
        pdVar.S = 1.0f;
        pdVar.T = -1;
        pdVar.U = -1;
        pdVar.V = -1;
        pdVar.W = false;
        pdVar.X = false;
        pdVar.Y = null;
        pdVar.Z = 0;
        pdVar.a0 = true;
        pdVar.b0 = true;
        pdVar.c0 = false;
        pdVar.d0 = false;
        pdVar.e0 = false;
        pdVar.f0 = -1;
        pdVar.g0 = -1;
        pdVar.h0 = -1;
        pdVar.i0 = -1;
        pdVar.j0 = Integer.MIN_VALUE;
        pdVar.k0 = Integer.MIN_VALUE;
        pdVar.l0 = 0.5f;
        pdVar.p0 = new ae();
        return pdVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static r50 getSharedValues() {
        if (u == null) {
            r50 r50Var = new r50();
            new SparseIntArray();
            new HashMap();
            u = r50Var;
        }
        return u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pd;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((nd) arrayList.get(i)).getClass();
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
        pd pdVar = new pd(context, attributeSet);
        pdVar.a = -1;
        pdVar.b = -1;
        pdVar.c = -1.0f;
        pdVar.d = true;
        pdVar.e = -1;
        pdVar.f = -1;
        pdVar.g = -1;
        pdVar.h = -1;
        pdVar.i = -1;
        pdVar.j = -1;
        pdVar.k = -1;
        pdVar.l = -1;
        pdVar.m = -1;
        pdVar.n = -1;
        pdVar.o = -1;
        pdVar.p = -1;
        pdVar.q = 0;
        pdVar.r = 0.0f;
        pdVar.s = -1;
        pdVar.t = -1;
        pdVar.u = -1;
        pdVar.v = -1;
        pdVar.w = Integer.MIN_VALUE;
        pdVar.x = Integer.MIN_VALUE;
        pdVar.y = Integer.MIN_VALUE;
        pdVar.z = Integer.MIN_VALUE;
        pdVar.A = Integer.MIN_VALUE;
        pdVar.B = Integer.MIN_VALUE;
        pdVar.C = Integer.MIN_VALUE;
        pdVar.D = 0;
        pdVar.E = 0.5f;
        pdVar.F = 0.5f;
        pdVar.G = null;
        pdVar.H = -1.0f;
        pdVar.I = -1.0f;
        pdVar.J = 0;
        pdVar.K = 0;
        pdVar.L = 0;
        pdVar.M = 0;
        pdVar.N = 0;
        pdVar.O = 0;
        pdVar.P = 0;
        pdVar.Q = 0;
        pdVar.R = 1.0f;
        pdVar.S = 1.0f;
        pdVar.T = -1;
        pdVar.U = -1;
        pdVar.V = -1;
        pdVar.W = false;
        pdVar.X = false;
        pdVar.Y = null;
        pdVar.Z = 0;
        pdVar.a0 = true;
        pdVar.b0 = true;
        pdVar.c0 = false;
        pdVar.d0 = false;
        pdVar.e0 = false;
        pdVar.f0 = -1;
        pdVar.g0 = -1;
        pdVar.h0 = -1;
        pdVar.i0 = -1;
        pdVar.j0 = Integer.MIN_VALUE;
        pdVar.k0 = Integer.MIN_VALUE;
        pdVar.l0 = 0.5f;
        pdVar.p0 = new ae();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t00.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = od.a.get(index);
            switch (i2) {
                case 1:
                    pdVar.V = obtainStyledAttributes.getInt(index, pdVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, pdVar.p);
                    pdVar.p = resourceId;
                    if (resourceId == -1) {
                        pdVar.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    pdVar.q = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, pdVar.r) % 360.0f;
                    pdVar.r = f;
                    if (f < 0.0f) {
                        pdVar.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    pdVar.a = obtainStyledAttributes.getDimensionPixelOffset(index, pdVar.a);
                    break;
                case 6:
                    pdVar.b = obtainStyledAttributes.getDimensionPixelOffset(index, pdVar.b);
                    break;
                case 7:
                    pdVar.c = obtainStyledAttributes.getFloat(index, pdVar.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, pdVar.e);
                    pdVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        pdVar.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, pdVar.f);
                    pdVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        pdVar.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, pdVar.g);
                    pdVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        pdVar.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, pdVar.h);
                    pdVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        pdVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, pdVar.i);
                    pdVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        pdVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, pdVar.j);
                    pdVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        pdVar.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, pdVar.k);
                    pdVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        pdVar.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, pdVar.l);
                    pdVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        pdVar.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, pdVar.m);
                    pdVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        pdVar.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, pdVar.s);
                    pdVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        pdVar.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, pdVar.t);
                    pdVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        pdVar.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, pdVar.u);
                    pdVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        pdVar.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, pdVar.v);
                    pdVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        pdVar.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    pdVar.w = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.w);
                    break;
                case 22:
                    pdVar.x = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.x);
                    break;
                case 23:
                    pdVar.y = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.y);
                    break;
                case 24:
                    pdVar.z = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.z);
                    break;
                case 25:
                    pdVar.A = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.A);
                    break;
                case 26:
                    pdVar.B = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.B);
                    break;
                case 27:
                    pdVar.W = obtainStyledAttributes.getBoolean(index, pdVar.W);
                    break;
                case 28:
                    pdVar.X = obtainStyledAttributes.getBoolean(index, pdVar.X);
                    break;
                case 29:
                    pdVar.E = obtainStyledAttributes.getFloat(index, pdVar.E);
                    break;
                case 30:
                    pdVar.F = obtainStyledAttributes.getFloat(index, pdVar.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    pdVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    pdVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        pdVar.N = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, pdVar.N) == -2) {
                            pdVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        pdVar.P = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, pdVar.P) == -2) {
                            pdVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    pdVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, pdVar.R));
                    pdVar.L = 2;
                    break;
                case 36:
                    try {
                        pdVar.O = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, pdVar.O) == -2) {
                            pdVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        pdVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, pdVar.Q) == -2) {
                            pdVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    pdVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, pdVar.S));
                    pdVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            zd.h(pdVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            pdVar.H = obtainStyledAttributes.getFloat(index, pdVar.H);
                            break;
                        case 46:
                            pdVar.I = obtainStyledAttributes.getFloat(index, pdVar.I);
                            break;
                        case 47:
                            pdVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            pdVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            pdVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, pdVar.T);
                            break;
                        case 50:
                            pdVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, pdVar.U);
                            break;
                        case 51:
                            pdVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, pdVar.n);
                            pdVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                pdVar.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, pdVar.o);
                            pdVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                pdVar.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            pdVar.D = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.D);
                            break;
                        case 55:
                            pdVar.C = obtainStyledAttributes.getDimensionPixelSize(index, pdVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    zd.g(pdVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    zd.g(pdVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    pdVar.Z = obtainStyledAttributes.getInt(index, pdVar.Z);
                                    break;
                                case 67:
                                    pdVar.d = obtainStyledAttributes.getBoolean(index, pdVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        pdVar.a();
        return pdVar;
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
        be beVar = this.h;
        if (beVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                beVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                beVar.j = "parent";
            }
        }
        if (beVar.h0 == null) {
            beVar.h0 = beVar.j;
            Log.v("ConstraintLayout", " setDebugName " + beVar.h0);
        }
        ArrayList arrayList = beVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ae aeVar = (ae) obj;
            View view = aeVar.f0;
            if (view != null) {
                if (aeVar.j == null && (id = view.getId()) != -1) {
                    aeVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (aeVar.h0 == null) {
                    aeVar.h0 = aeVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + aeVar.h0);
                }
            }
        }
        beVar.n(sb);
        return sb.toString();
    }

    public final ae h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof pd) {
            return ((pd) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof pd) {
            return ((pd) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        be beVar = this.h;
        beVar.f0 = this;
        qd qdVar = this.t;
        beVar.u0 = qdVar;
        beVar.s0.f = qdVar;
        this.f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t00.b, i, 0);
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
                        zd zdVar = new zd();
                        this.o = zdVar;
                        zdVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        beVar.D0 = this.n;
        ys.q = beVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        a5 a5Var = new a5(11, false);
        a5Var.g = new SparseArray();
        a5Var.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            rd rdVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a5Var.N(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                rd rdVar2 = new rd(context, xml);
                                ((SparseArray) a5Var.g).put(rdVar2.a, rdVar2);
                                rdVar = rdVar2;
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
                                sd sdVar = new sd(context, xml);
                                if (rdVar != null) {
                                    ((ArrayList) rdVar.c).add(sdVar);
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
        this.p = a5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(be beVar, int i, int i2, int i3) {
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
        qd qdVar;
        int i9;
        boolean z3;
        int i10;
        int i11;
        boolean y;
        qd qdVar2;
        boolean z4;
        boolean z5;
        qd qdVar3;
        boolean z6;
        qp qpVar;
        tb0 tb0Var;
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
        qd qdVar4 = this.t;
        qdVar4.b = max3;
        qdVar4.c = max4;
        qdVar4.d = paddingWidth;
        qdVar4.e = i21;
        qdVar4.f = i2;
        qdVar4.g = i3;
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
        int i25 = qdVar4.e;
        int i26 = qdVar4.d;
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
        int q = beVar.q();
        eh ehVar = beVar.s0;
        int[] iArr = beVar.C;
        int i27 = i4;
        if (i27 == q && i5 == beVar.k()) {
            c = 1;
        } else {
            ehVar.c = true;
            c = 1;
        }
        beVar.Y = 0;
        beVar.Z = 0;
        iArr[0] = this.k - i26;
        iArr[c] = this.l - i25;
        beVar.b0 = 0;
        beVar.c0 = 0;
        beVar.M(i22);
        beVar.O(i27);
        beVar.N(i6);
        beVar.L(i5);
        int i28 = this.i - i26;
        if (i28 < 0) {
            beVar.b0 = 0;
        } else {
            beVar.b0 = i28;
        }
        int i29 = this.j - i25;
        if (i29 < 0) {
            beVar.c0 = 0;
        } else {
            beVar.c0 = i29;
        }
        beVar.x0 = max5;
        beVar.y0 = max3;
        k6 k6Var = beVar.r0;
        be beVar2 = (be) k6Var.i;
        ArrayList arrayList2 = (ArrayList) k6Var.g;
        qd qdVar5 = beVar.u0;
        int size5 = beVar.q0.size();
        int q2 = beVar.q();
        int k = beVar.k();
        boolean s = kr.s(i, 128);
        boolean z8 = s || kr.s(i, 64);
        if (z8) {
            int i30 = 0;
            while (i30 < size5) {
                boolean z9 = z8;
                ae aeVar = (ae) beVar.q0.get(i30);
                i7 = size5;
                int[] iArr2 = aeVar.p0;
                int i31 = i30;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && aeVar.W > 0.0f;
                if ((aeVar.x() && z10) || ((aeVar.y() && z10) || (aeVar instanceof ol) || aeVar.x() || aeVar.y())) {
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
        boolean z11 = z & ((mode == i8 && mode2 == i8) || s);
        if (z11) {
            int min = Math.min(iArr[0], i23);
            int min2 = Math.min(iArr[1], i24);
            int i32 = 1073741824;
            if (mode == 1073741824) {
                if (beVar.q() != min) {
                    beVar.O(min);
                    ehVar.b = true;
                }
                i32 = 1073741824;
            }
            if (mode2 == i32 && beVar.k() != min2) {
                beVar.L(min2);
                ehVar.b = true;
            }
            if (mode == i32 && mode2 == i32) {
                ArrayList arrayList3 = ehVar.e;
                be beVar3 = ehVar.a;
                if (ehVar.b || ehVar.c) {
                    ArrayList arrayList4 = beVar3.q0;
                    int size6 = arrayList4.size();
                    z2 = z11;
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj = arrayList4.get(i33);
                        int i34 = i33 + 1;
                        ae aeVar2 = (ae) obj;
                        aeVar2.h();
                        aeVar2.a = false;
                        aeVar2.d.n();
                        aeVar2.e.m();
                        arrayList4 = arrayList4;
                        i33 = i34;
                    }
                    beVar3.h();
                    i14 = 0;
                    beVar3.a = false;
                    beVar3.d.n();
                    beVar3.e.m();
                    ehVar.c = false;
                } else {
                    z2 = z11;
                    i14 = 0;
                }
                ehVar.b(ehVar.d);
                beVar3.Y = i14;
                int[] iArr3 = beVar3.p0;
                beVar3.Z = i14;
                int j = beVar3.j(i14);
                int j2 = beVar3.j(1);
                if (ehVar.b) {
                    ehVar.c();
                }
                int r = beVar3.r();
                qdVar = qdVar5;
                int s2 = beVar3.s();
                arrayList = arrayList2;
                beVar3.d.h.d(r);
                beVar3.e.h.d(s2);
                ehVar.g();
                if (j == 2 || j2 == 2) {
                    if (s) {
                        int size7 = arrayList3.size();
                        i15 = s2;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i35);
                            i35++;
                            if (!((rd0) obj2).k()) {
                                s = false;
                                break;
                            }
                        }
                    } else {
                        i15 = s2;
                    }
                    if (s && j == 2) {
                        beVar3.M(1);
                        beVar3.O(ehVar.d(beVar3, 0));
                        beVar3.d.e.d(beVar3.q());
                    }
                    if (s && j2 == 2) {
                        i16 = 1;
                        beVar3.N(1);
                        beVar3.L(ehVar.d(beVar3, 1));
                        beVar3.e.e.d(beVar3.k());
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q3 = beVar3.q() + r;
                            beVar3.d.i.d(q3);
                            beVar3.d.e.d(q3 - r);
                            ehVar.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k2 = beVar3.k() + i15;
                                beVar3.e.i.d(k2);
                                beVar3.e.e.d(k2 - i15);
                            }
                            ehVar.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            rd0 rd0Var = (rd0) obj3;
                            if (rd0Var.b != beVar3 || rd0Var.g) {
                                rd0Var.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i20 = 0;
                        while (i20 < size2) {
                            Object obj4 = arrayList3.get(i20);
                            i20++;
                            rd0 rd0Var2 = (rd0) obj4;
                            if (z7 || rd0Var2.b != beVar3) {
                                if (!rd0Var2.h.j || ((!rd0Var2.i.j && !(rd0Var2 instanceof zo)) || (!rd0Var2.e.j && !(rd0Var2 instanceof ga) && !(rd0Var2 instanceof zo)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        beVar3.M(j);
                        beVar3.N(j2);
                        i9 = 2;
                        i13 = 1073741824;
                    }
                } else {
                    i15 = s2;
                }
                i16 = 1;
                i17 = iArr3[0];
                if (i17 != i16) {
                }
                int q32 = beVar3.q() + r;
                beVar3.d.i.d(q32);
                beVar3.d.e.d(q32 - r);
                ehVar.g();
                i18 = iArr3[1];
                if (i18 != 1) {
                }
                int k22 = beVar3.k() + i15;
                beVar3.e.i.d(k22);
                beVar3.e.e.d(k22 - i15);
                ehVar.g();
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
                beVar3.M(j);
                beVar3.N(j2);
                i9 = 2;
                i13 = 1073741824;
            } else {
                z2 = z11;
                arrayList = arrayList2;
                qdVar = qdVar5;
                be beVar4 = ehVar.a;
                if (ehVar.b) {
                    ArrayList arrayList5 = beVar4.q0;
                    int size8 = arrayList5.size();
                    int i36 = 0;
                    while (i36 < size8) {
                        Object obj5 = arrayList5.get(i36);
                        i36++;
                        ae aeVar3 = (ae) obj5;
                        aeVar3.h();
                        aeVar3.a = false;
                        qp qpVar2 = aeVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        qpVar2.e.j = false;
                        qpVar2.g = false;
                        qpVar2.n();
                        tb0 tb0Var2 = aeVar3.e;
                        tb0Var2.e.j = false;
                        tb0Var2.g = false;
                        tb0Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    beVar4.h();
                    beVar4.a = false;
                    qp qpVar3 = beVar4.d;
                    qpVar3.e.j = false;
                    qpVar3.g = false;
                    qpVar3.n();
                    tb0 tb0Var3 = beVar4.e;
                    tb0Var3.e.j = false;
                    tb0Var3.g = false;
                    tb0Var3.m();
                    ehVar.c();
                } else {
                    i12 = 0;
                }
                ehVar.b(ehVar.d);
                beVar4.Y = i12;
                beVar4.Z = i12;
                beVar4.d.h.d(i12);
                beVar4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z3 = beVar.T(i12, s);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= beVar.T(1, s);
                    i9++;
                }
            }
            if (z3) {
                beVar.P(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z11;
            arrayList = arrayList2;
            qdVar = qdVar5;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i37 = beVar.D0;
        if (i7 > 0) {
            int size9 = beVar.q0.size();
            boolean W = beVar.W(64);
            qd qdVar6 = beVar.u0;
            for (int i38 = 0; i38 < size9; i38++) {
                ae aeVar4 = (ae) beVar.q0.get(i38);
                if (!(aeVar4 instanceof yo) && !(aeVar4 instanceof s7) && !aeVar4.F && (!W || (qpVar = aeVar4.d) == null || (tb0Var = aeVar4.e) == null || !qpVar.e.j || !tb0Var.e.j)) {
                    int j3 = aeVar4.j(0);
                    int j4 = aeVar4.j(1);
                    boolean z12 = j3 == 3 && aeVar4.r != 1 && j4 == 3 && aeVar4.s != 1;
                    if (!z12 && beVar.W(1) && !(aeVar4 instanceof ol)) {
                        if (j3 == 3 && aeVar4.r == 0 && j4 != 3 && !aeVar4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 && aeVar4.s == 0 && j3 != 3 && !aeVar4.x()) {
                            z12 = true;
                        }
                        if ((j3 == 3 || j4 == 3) && aeVar4.W > 0.0f) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        k6Var.y(0, qdVar6, aeVar4);
                    }
                }
            }
            ConstraintLayout constraintLayout = qdVar6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.g;
            for (int i39 = 0; i39 < childCount2; i39++) {
                constraintLayout.getChildAt(i39);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i40 = 0; i40 < size10; i40++) {
                    ((nd) arrayList7.get(i40)).getClass();
                }
            }
        }
        k6Var.E(beVar);
        int size11 = arrayList.size();
        if (i7 > 0) {
            k6Var.C(beVar, 0, q2, k);
        }
        if (size11 > 0) {
            int[] iArr4 = beVar.p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int max7 = Math.max(beVar.q(), beVar2.b0);
            int max8 = Math.max(beVar.k(), beVar2.c0);
            int i41 = 0;
            boolean z15 = false;
            while (i41 < size11) {
                ArrayList arrayList8 = arrayList;
                ae aeVar5 = (ae) arrayList8.get(i41);
                if (aeVar5 instanceof ol) {
                    int q4 = aeVar5.q();
                    int k3 = aeVar5.k();
                    z4 = z14;
                    z5 = z13;
                    qdVar3 = qdVar;
                    boolean y2 = z15 | k6Var.y(1, qdVar3, aeVar5);
                    int q5 = aeVar5.q();
                    int k4 = aeVar5.k();
                    if (q5 != q4) {
                        aeVar5.O(q5);
                        if (z5 && aeVar5.r() + aeVar5.U > max7) {
                            max7 = Math.max(max7, aeVar5.i(4).e() + aeVar5.r() + aeVar5.U);
                        }
                        z6 = true;
                    } else {
                        z6 = y2;
                    }
                    if (k4 != k3) {
                        aeVar5.L(k4);
                        if (z4 && aeVar5.s() + aeVar5.V > max8) {
                            max8 = Math.max(max8, aeVar5.i(5).e() + aeVar5.s() + aeVar5.V);
                        }
                        z6 = true;
                    }
                    z15 = ((ol) aeVar5).y0 | z6;
                } else {
                    z4 = z14;
                    z5 = z13;
                    qdVar3 = qdVar;
                }
                i41++;
                qdVar = qdVar3;
                arrayList = arrayList8;
                z13 = z5;
                z14 = z4;
            }
            boolean z16 = z14;
            boolean z17 = z13;
            ArrayList arrayList9 = arrayList;
            int i42 = 0;
            while (true) {
                qd qdVar7 = qdVar;
                if (i42 >= 2) {
                    break;
                }
                int i43 = 0;
                while (i43 < size11) {
                    ae aeVar6 = (ae) arrayList9.get(i43);
                    if (((aeVar6 instanceof mp) && !(aeVar6 instanceof ol)) || (aeVar6 instanceof yo) || aeVar6.g0 == 8 || ((z2 && aeVar6.d.e.j && aeVar6.e.e.j) || (aeVar6 instanceof ol))) {
                        i10 = size11;
                        qdVar2 = qdVar7;
                        i11 = i43;
                        y = z15;
                    } else {
                        int q6 = aeVar6.q();
                        int k5 = aeVar6.k();
                        i10 = size11;
                        int i44 = aeVar6.a0;
                        i11 = i43;
                        y = k6Var.y(i42 == 1 ? 2 : 1, qdVar7, aeVar6) | z15;
                        int q7 = aeVar6.q();
                        qdVar2 = qdVar7;
                        int k6 = aeVar6.k();
                        if (q7 != q6) {
                            aeVar6.O(q7);
                            if (z17 && aeVar6.r() + aeVar6.U > max7) {
                                max7 = Math.max(max7, aeVar6.i(4).e() + aeVar6.r() + aeVar6.U);
                            }
                            y = true;
                        }
                        if (k6 != k5) {
                            aeVar6.L(k6);
                            if (z16 && aeVar6.s() + aeVar6.V > max8) {
                                max8 = Math.max(max8, aeVar6.i(5).e() + aeVar6.s() + aeVar6.V);
                            }
                            y = true;
                        }
                        if (aeVar6.E && i44 != aeVar6.a0) {
                            y = true;
                        }
                    }
                    z15 = y;
                    qdVar7 = qdVar2;
                    i43 = i11 + 1;
                    size11 = i10;
                }
                int i45 = size11;
                qdVar = qdVar7;
                if (!z15) {
                    break;
                }
                i42++;
                k6Var.C(beVar, i42, q2, k);
                size11 = i45;
                z15 = false;
            }
        }
        beVar.D0 = i37;
        ys.q = beVar.W(512);
    }

    public final void l(ae aeVar, pd pdVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f.get(i);
        ae aeVar2 = (ae) sparseArray.get(i);
        if (aeVar2 == null || view == null || !(view.getLayoutParams() instanceof pd)) {
            return;
        }
        pdVar.c0 = true;
        if (i2 == 6) {
            pd pdVar2 = (pd) view.getLayoutParams();
            pdVar2.c0 = true;
            pdVar2.p0.E = true;
        }
        aeVar.i(6).b(aeVar2.i(i2), pdVar.D, pdVar.C, true);
        aeVar.E = true;
        aeVar.i(3).j();
        aeVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            pd pdVar = (pd) childAt.getLayoutParams();
            ae aeVar = pdVar.p0;
            if (childAt.getVisibility() != 8 || pdVar.d0 || pdVar.e0 || isInEditMode) {
                int r = aeVar.r();
                int s = aeVar.s();
                childAt.layout(r, s, aeVar.q() + r, aeVar.k() + s);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((nd) arrayList.get(i6)).getClass();
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
        ae aeVar;
        int i4;
        ae aeVar2;
        int i5;
        int i6;
        int i7;
        ae aeVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ae aeVar4;
        int i13;
        int i14;
        ae aeVar5;
        pd pdVar;
        int i15;
        ae aeVar6;
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
        ae aeVar7;
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
        be beVar = constraintLayout.h;
        beVar.v0 = z4;
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
                    ae h = constraintLayout.h(constraintLayout.getChildAt(i27));
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
                                aeVar7 = view == null ? null : ((pd) view.getLayoutParams()).p0;
                                aeVar7.h0 = resourceName;
                                i28++;
                                i23 = i22;
                            }
                        }
                        aeVar7 = beVar;
                        aeVar7.h0 = resourceName;
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
                zd zdVar = constraintLayout.o;
                if (zdVar != null) {
                    zdVar.a(constraintLayout);
                }
                beVar.q0.clear();
                ArrayList arrayList3 = constraintLayout.g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i31 = 0;
                    while (i31 < size) {
                        nd ndVar = (nd) arrayList3.get(i31);
                        HashMap hashMap = ndVar.l;
                        if (ndVar.isInEditMode()) {
                            ndVar.setIds(ndVar.j);
                        }
                        mp mpVar = ndVar.i;
                        if (mpVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            mpVar.r0 = i24;
                            Arrays.fill(mpVar.q0, (Object) null);
                            int i32 = i24;
                            while (i32 < ndVar.g) {
                                int i33 = ndVar.f[i32];
                                View view2 = (View) sparseArray3.get(i33);
                                if (view2 != null || (f2 = ndVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i33))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    ndVar.f[i32] = f2;
                                    hashMap.put(Integer.valueOf(f2), str);
                                    view2 = (View) sparseArray3.get(f2);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    mp mpVar2 = ndVar.i;
                                    ae h2 = constraintLayout.h(view3);
                                    mpVar2.getClass();
                                    if (h2 != mpVar2 && h2 != null) {
                                        int i34 = mpVar2.r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        ae[] aeVarArr = mpVar2.q0;
                                        if (i34 > aeVarArr.length) {
                                            mpVar2.q0 = (ae[]) Arrays.copyOf(aeVarArr, aeVarArr.length * 2);
                                        }
                                        ae[] aeVarArr2 = mpVar2.q0;
                                        int i35 = mpVar2.r0;
                                        aeVarArr2[i35] = h2;
                                        mpVar2.r0 = i35 + 1;
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
                            ndVar.i.S();
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
                sparseArray4.put(0, beVar);
                sparseArray4.put(constraintLayout.getId(), beVar);
                for (int i38 = 0; i38 < childCount3; i38++) {
                    View childAt2 = constraintLayout.getChildAt(i38);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i39 = 0;
                while (i39 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i39);
                    ae h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        pd pdVar2 = (pd) childAt3.getLayoutParams();
                        beVar.q0.add(h3);
                        ae aeVar8 = h3.T;
                        if (aeVar8 != null) {
                            ((be) aeVar8).q0.remove(h3);
                            h3.C();
                        }
                        h3.T = beVar;
                        pdVar2.a();
                        h3.g0 = childAt3.getVisibility();
                        h3.f0 = childAt3;
                        if (childAt3 instanceof nd) {
                            ((nd) childAt3).h(h3, beVar.v0);
                        }
                        if (pdVar2.d0) {
                            yo yoVar = (yo) h3;
                            int i40 = pdVar2.m0;
                            int i41 = pdVar2.n0;
                            float f3 = pdVar2.o0;
                            if (f3 == -1.0f) {
                                c = 65535;
                                if (i40 != -1) {
                                    if (i40 > -1) {
                                        yoVar.q0 = -1.0f;
                                        yoVar.r0 = i40;
                                        yoVar.s0 = -1;
                                    }
                                } else if (i41 != -1 && i41 > -1) {
                                    yoVar.q0 = -1.0f;
                                    yoVar.r0 = -1;
                                    yoVar.s0 = i41;
                                }
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            } else if (f3 > -1.0f) {
                                yoVar.q0 = f3;
                                c = 65535;
                                yoVar.r0 = -1;
                                yoVar.s0 = -1;
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            }
                        } else {
                            int i42 = pdVar2.f0;
                            int i43 = pdVar2.g0;
                            int i44 = pdVar2.h0;
                            int i45 = pdVar2.i0;
                            int i46 = pdVar2.j0;
                            int i47 = pdVar2.k0;
                            i3 = i39;
                            float f4 = pdVar2.l0;
                            int i48 = pdVar2.p;
                            z2 = z;
                            if (i48 != -1) {
                                ae aeVar9 = (ae) sparseArray4.get(i48);
                                if (aeVar9 != null) {
                                    float f5 = pdVar2.r;
                                    h3.v(7, 7, pdVar2.q, 0, aeVar9);
                                    h3.D = f5;
                                }
                                constraintLayout = this;
                                aeVar6 = h3;
                                pdVar = pdVar2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i42 != -1) {
                                    ae aeVar10 = (ae) sparseArray4.get(i42);
                                    if (aeVar10 != null) {
                                        aeVar = h3;
                                        i4 = 2;
                                        aeVar.v(2, 2, ((ViewGroup.MarginLayoutParams) pdVar2).leftMargin, i46, aeVar10);
                                    } else {
                                        aeVar = h3;
                                        i4 = 2;
                                    }
                                } else {
                                    aeVar = h3;
                                    i4 = 2;
                                    if (i43 != -1 && (aeVar2 = (ae) sparseArray4.get(i43)) != null) {
                                        aeVar.v(2, 4, ((ViewGroup.MarginLayoutParams) pdVar2).leftMargin, i46, aeVar2);
                                        i5 = 2;
                                        i6 = 4;
                                        if (i44 == -1) {
                                            ae aeVar11 = (ae) sparseArray4.get(i44);
                                            if (aeVar11 != null) {
                                                aeVar.v(i6, i5, ((ViewGroup.MarginLayoutParams) pdVar2).rightMargin, i47, aeVar11);
                                            }
                                            i7 = i5;
                                        } else {
                                            i7 = i5;
                                            if (i45 != -1 && (aeVar3 = (ae) sparseArray4.get(i45)) != null) {
                                                aeVar.v(i6, i6, ((ViewGroup.MarginLayoutParams) pdVar2).rightMargin, i47, aeVar3);
                                            }
                                        }
                                        i8 = i6;
                                        i9 = pdVar2.i;
                                        if (i9 == -1) {
                                            ae aeVar12 = (ae) sparseArray4.get(i9);
                                            if (aeVar12 != null) {
                                                i16 = 3;
                                                aeVar.v(3, 3, ((ViewGroup.MarginLayoutParams) pdVar2).topMargin, pdVar2.x, aeVar12);
                                            } else {
                                                i16 = 3;
                                            }
                                            i11 = i16;
                                            i12 = 5;
                                            i10 = -1;
                                        } else {
                                            int i49 = pdVar2.j;
                                            i10 = -1;
                                            if (i49 == -1 || (aeVar4 = (ae) sparseArray4.get(i49)) == null) {
                                                i11 = 3;
                                                i12 = 5;
                                            } else {
                                                aeVar.v(3, 5, ((ViewGroup.MarginLayoutParams) pdVar2).topMargin, pdVar2.x, aeVar4);
                                                i11 = 3;
                                                i12 = 5;
                                            }
                                        }
                                        i13 = pdVar2.k;
                                        if (i13 == i10) {
                                            ae aeVar13 = (ae) sparseArray4.get(i13);
                                            if (aeVar13 != null) {
                                                int i50 = i11;
                                                aeVar.v(i12, i50, ((ViewGroup.MarginLayoutParams) pdVar2).bottomMargin, pdVar2.z, aeVar13);
                                                i14 = i50;
                                            } else {
                                                i14 = i11;
                                            }
                                        } else {
                                            i14 = i11;
                                            int i51 = pdVar2.l;
                                            if (i51 != i10 && (aeVar5 = (ae) sparseArray4.get(i51)) != null) {
                                                aeVar.v(i12, i12, ((ViewGroup.MarginLayoutParams) pdVar2).bottomMargin, pdVar2.z, aeVar5);
                                            }
                                        }
                                        pdVar = pdVar2;
                                        i15 = pdVar.m;
                                        if (i15 == -1) {
                                            constraintLayout = this;
                                            aeVar6 = aeVar;
                                            constraintLayout.l(aeVar6, pdVar, sparseArray4, i15, 6);
                                        } else {
                                            int i52 = pdVar.n;
                                            if (i52 != -1) {
                                                constraintLayout = this;
                                                aeVar6 = aeVar;
                                                constraintLayout.l(aeVar6, pdVar, sparseArray4, i52, i14);
                                            } else {
                                                int i53 = pdVar.o;
                                                constraintLayout = this;
                                                aeVar6 = aeVar;
                                                int i54 = i12;
                                                if (i53 != -1) {
                                                    constraintLayout.l(aeVar6, pdVar, sparseArray4, i53, i54);
                                                }
                                                if (f4 >= 0.0f) {
                                                    aeVar6.d0 = f4;
                                                }
                                                f = pdVar.F;
                                                if (f >= 0.0f) {
                                                    aeVar6.e0 = f;
                                                }
                                            }
                                        }
                                        if (f4 >= 0.0f) {
                                        }
                                        f = pdVar.F;
                                        if (f >= 0.0f) {
                                        }
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i44 == -1) {
                                }
                                i8 = i6;
                                i9 = pdVar2.i;
                                if (i9 == -1) {
                                }
                                i13 = pdVar2.k;
                                if (i13 == i10) {
                                }
                                pdVar = pdVar2;
                                i15 = pdVar.m;
                                if (i15 == -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f = pdVar.F;
                                if (f >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i21 = pdVar.T) != -1 || pdVar.U != -1)) {
                                int i55 = pdVar.U;
                                aeVar6.Y = i21;
                                aeVar6.Z = i55;
                            }
                            if (pdVar.a0) {
                                aeVar6.M(i29);
                                aeVar6.O(((ViewGroup.MarginLayoutParams) pdVar).width);
                                if (((ViewGroup.MarginLayoutParams) pdVar).width == -2) {
                                    aeVar6.M(i36);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) pdVar).width == -1) {
                                if (pdVar.W) {
                                    aeVar6.M(3);
                                } else {
                                    aeVar6.M(4);
                                }
                                aeVar6.i(i7).g = ((ViewGroup.MarginLayoutParams) pdVar).leftMargin;
                                aeVar6.i(i8).g = ((ViewGroup.MarginLayoutParams) pdVar).rightMargin;
                            } else {
                                aeVar6.M(3);
                                aeVar6.O(0);
                            }
                            if (pdVar.b0) {
                                i17 = -1;
                                aeVar6.N(1);
                                aeVar6.L(((ViewGroup.MarginLayoutParams) pdVar).height);
                                if (((ViewGroup.MarginLayoutParams) pdVar).height == -2) {
                                    aeVar6.N(2);
                                }
                            } else {
                                i17 = -1;
                                if (((ViewGroup.MarginLayoutParams) pdVar).height == -1) {
                                    if (pdVar.X) {
                                        aeVar6.N(3);
                                    } else {
                                        aeVar6.N(4);
                                    }
                                    aeVar6.i(3).g = ((ViewGroup.MarginLayoutParams) pdVar).topMargin;
                                    aeVar6.i(5).g = ((ViewGroup.MarginLayoutParams) pdVar).bottomMargin;
                                } else {
                                    aeVar6.N(3);
                                    aeVar6.L(0);
                                }
                            }
                            String str2 = pdVar.G;
                            if (str2 == null || str2.length() == 0) {
                                aeVar6.W = 0.0f;
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
                                    aeVar6.W = parseFloat;
                                    aeVar6.X = i19;
                                }
                            }
                            float f6 = pdVar.H;
                            float[] fArr = aeVar6.k0;
                            fArr[0] = f6;
                            i29 = 1;
                            fArr[1] = pdVar.I;
                            aeVar6.i0 = pdVar.J;
                            aeVar6.j0 = pdVar.K;
                            int i56 = pdVar.Z;
                            if (i56 >= 0 && i56 <= 3) {
                                aeVar6.q = i56;
                            }
                            int i57 = pdVar.L;
                            int i58 = pdVar.N;
                            int i59 = pdVar.P;
                            float f7 = pdVar.R;
                            aeVar6.r = i57;
                            aeVar6.u = i58;
                            if (i59 == Integer.MAX_VALUE) {
                                i59 = 0;
                            }
                            aeVar6.v = i59;
                            aeVar6.w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i57 == 0) {
                                aeVar6.r = 2;
                            }
                            int i60 = pdVar.M;
                            int i61 = pdVar.O;
                            int i62 = pdVar.Q;
                            float f8 = pdVar.S;
                            aeVar6.s = i60;
                            aeVar6.x = i61;
                            if (i62 == Integer.MAX_VALUE) {
                                i62 = 0;
                            }
                            aeVar6.y = i62;
                            aeVar6.z = f8;
                            if (f8 <= 0.0f || f8 >= 1.0f || i60 != 0) {
                                i18 = 2;
                            } else {
                                i18 = 2;
                                aeVar6.s = 2;
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
                beVar.r0.E(beVar);
            }
        }
        beVar.w0.getClass();
        constraintLayout.k(beVar, constraintLayout.n, i, i2);
        int q = beVar.q();
        int k = beVar.k();
        boolean z5 = beVar.E0;
        boolean z6 = beVar.F0;
        qd qdVar = constraintLayout.t;
        int i63 = qdVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(q + qdVar.d, i, 0);
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
        ae h = h(view);
        if ((view instanceof Guideline) && !(h instanceof yo)) {
            pd pdVar = (pd) view.getLayoutParams();
            yo yoVar = new yo();
            pdVar.p0 = yoVar;
            pdVar.d0 = true;
            yoVar.S(pdVar.V);
        }
        if (view instanceof nd) {
            nd ndVar = (nd) view;
            ndVar.i();
            ((pd) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(ndVar)) {
                arrayList.add(ndVar);
            }
        }
        this.f.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        ae h = h(view);
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

    public void setConstraintSet(zd zdVar) {
        this.o = zdVar;
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

    public void setOnConstraintsChanged(ce ceVar) {
        a5 a5Var = this.p;
        if (a5Var != null) {
            a5Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n = i;
        be beVar = this.h;
        beVar.D0 = i;
        ys.q = beVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new be();
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
        this.t = new qd(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        pd pdVar = new pd(layoutParams);
        pdVar.a = -1;
        pdVar.b = -1;
        pdVar.c = -1.0f;
        pdVar.d = true;
        pdVar.e = -1;
        pdVar.f = -1;
        pdVar.g = -1;
        pdVar.h = -1;
        pdVar.i = -1;
        pdVar.j = -1;
        pdVar.k = -1;
        pdVar.l = -1;
        pdVar.m = -1;
        pdVar.n = -1;
        pdVar.o = -1;
        pdVar.p = -1;
        pdVar.q = 0;
        pdVar.r = 0.0f;
        pdVar.s = -1;
        pdVar.t = -1;
        pdVar.u = -1;
        pdVar.v = -1;
        pdVar.w = Integer.MIN_VALUE;
        pdVar.x = Integer.MIN_VALUE;
        pdVar.y = Integer.MIN_VALUE;
        pdVar.z = Integer.MIN_VALUE;
        pdVar.A = Integer.MIN_VALUE;
        pdVar.B = Integer.MIN_VALUE;
        pdVar.C = Integer.MIN_VALUE;
        pdVar.D = 0;
        pdVar.E = 0.5f;
        pdVar.F = 0.5f;
        pdVar.G = null;
        pdVar.H = -1.0f;
        pdVar.I = -1.0f;
        pdVar.J = 0;
        pdVar.K = 0;
        pdVar.L = 0;
        pdVar.M = 0;
        pdVar.N = 0;
        pdVar.O = 0;
        pdVar.P = 0;
        pdVar.Q = 0;
        pdVar.R = 1.0f;
        pdVar.S = 1.0f;
        pdVar.T = -1;
        pdVar.U = -1;
        pdVar.V = -1;
        pdVar.W = false;
        pdVar.X = false;
        pdVar.Y = null;
        pdVar.Z = 0;
        pdVar.a0 = true;
        pdVar.b0 = true;
        pdVar.c0 = false;
        pdVar.d0 = false;
        pdVar.e0 = false;
        pdVar.f0 = -1;
        pdVar.g0 = -1;
        pdVar.h0 = -1;
        pdVar.i0 = -1;
        pdVar.j0 = Integer.MIN_VALUE;
        pdVar.k0 = Integer.MIN_VALUE;
        pdVar.l0 = 0.5f;
        pdVar.p0 = new ae();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) pdVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) pdVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) pdVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) pdVar).bottomMargin = marginLayoutParams.bottomMargin;
            pdVar.setMarginStart(marginLayoutParams.getMarginStart());
            pdVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof pd)) {
            return pdVar;
        }
        pd pdVar2 = (pd) layoutParams;
        pdVar.a = pdVar2.a;
        pdVar.b = pdVar2.b;
        pdVar.c = pdVar2.c;
        pdVar.d = pdVar2.d;
        pdVar.e = pdVar2.e;
        pdVar.f = pdVar2.f;
        pdVar.g = pdVar2.g;
        pdVar.h = pdVar2.h;
        pdVar.i = pdVar2.i;
        pdVar.j = pdVar2.j;
        pdVar.k = pdVar2.k;
        pdVar.l = pdVar2.l;
        pdVar.m = pdVar2.m;
        pdVar.n = pdVar2.n;
        pdVar.o = pdVar2.o;
        pdVar.p = pdVar2.p;
        pdVar.q = pdVar2.q;
        pdVar.r = pdVar2.r;
        pdVar.s = pdVar2.s;
        pdVar.t = pdVar2.t;
        pdVar.u = pdVar2.u;
        pdVar.v = pdVar2.v;
        pdVar.w = pdVar2.w;
        pdVar.x = pdVar2.x;
        pdVar.y = pdVar2.y;
        pdVar.z = pdVar2.z;
        pdVar.A = pdVar2.A;
        pdVar.B = pdVar2.B;
        pdVar.C = pdVar2.C;
        pdVar.D = pdVar2.D;
        pdVar.E = pdVar2.E;
        pdVar.F = pdVar2.F;
        pdVar.G = pdVar2.G;
        pdVar.H = pdVar2.H;
        pdVar.I = pdVar2.I;
        pdVar.J = pdVar2.J;
        pdVar.K = pdVar2.K;
        pdVar.W = pdVar2.W;
        pdVar.X = pdVar2.X;
        pdVar.L = pdVar2.L;
        pdVar.M = pdVar2.M;
        pdVar.N = pdVar2.N;
        pdVar.P = pdVar2.P;
        pdVar.O = pdVar2.O;
        pdVar.Q = pdVar2.Q;
        pdVar.R = pdVar2.R;
        pdVar.S = pdVar2.S;
        pdVar.T = pdVar2.T;
        pdVar.U = pdVar2.U;
        pdVar.V = pdVar2.V;
        pdVar.a0 = pdVar2.a0;
        pdVar.b0 = pdVar2.b0;
        pdVar.c0 = pdVar2.c0;
        pdVar.d0 = pdVar2.d0;
        pdVar.f0 = pdVar2.f0;
        pdVar.g0 = pdVar2.g0;
        pdVar.h0 = pdVar2.h0;
        pdVar.i0 = pdVar2.i0;
        pdVar.j0 = pdVar2.j0;
        pdVar.k0 = pdVar2.k0;
        pdVar.l0 = pdVar2.l0;
        pdVar.Y = pdVar2.Y;
        pdVar.Z = pdVar2.Z;
        pdVar.p0 = pdVar2.p0;
        return pdVar;
    }
}

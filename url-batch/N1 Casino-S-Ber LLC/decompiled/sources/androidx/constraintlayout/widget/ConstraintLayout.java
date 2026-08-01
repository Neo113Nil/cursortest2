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
import defpackage.a6;
import defpackage.ad;
import defpackage.an;
import defpackage.bd;
import defpackage.cd;
import defpackage.en;
import defpackage.gf;
import defpackage.i7;
import defpackage.i80;
import defpackage.ka0;
import defpackage.kq;
import defpackage.lj;
import defpackage.nc;
import defpackage.oc;
import defpackage.om;
import defpackage.p20;
import defpackage.pc;
import defpackage.pm;
import defpackage.q4;
import defpackage.qc;
import defpackage.qx;
import defpackage.rc;
import defpackage.sc;
import defpackage.t9;
import defpackage.zc;
import defpackage.zo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static p20 u;
    public final SparseArray f;
    public final ArrayList g;
    public final bd h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public zc o;
    public q4 p;
    public int q;
    public HashMap r;
    public final SparseArray s;
    public final qc t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new bd();
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
        this.t = new qc(this, this);
        i(attributeSet, 0);
    }

    public static pc g() {
        pc pcVar = new pc(-2, -2);
        pcVar.a = -1;
        pcVar.b = -1;
        pcVar.c = -1.0f;
        pcVar.d = true;
        pcVar.e = -1;
        pcVar.f = -1;
        pcVar.g = -1;
        pcVar.h = -1;
        pcVar.i = -1;
        pcVar.j = -1;
        pcVar.k = -1;
        pcVar.l = -1;
        pcVar.m = -1;
        pcVar.n = -1;
        pcVar.o = -1;
        pcVar.p = -1;
        pcVar.q = 0;
        pcVar.r = 0.0f;
        pcVar.s = -1;
        pcVar.t = -1;
        pcVar.u = -1;
        pcVar.v = -1;
        pcVar.w = Integer.MIN_VALUE;
        pcVar.x = Integer.MIN_VALUE;
        pcVar.y = Integer.MIN_VALUE;
        pcVar.z = Integer.MIN_VALUE;
        pcVar.A = Integer.MIN_VALUE;
        pcVar.B = Integer.MIN_VALUE;
        pcVar.C = Integer.MIN_VALUE;
        pcVar.D = 0;
        pcVar.E = 0.5f;
        pcVar.F = 0.5f;
        pcVar.G = null;
        pcVar.H = -1.0f;
        pcVar.I = -1.0f;
        pcVar.J = 0;
        pcVar.K = 0;
        pcVar.L = 0;
        pcVar.M = 0;
        pcVar.N = 0;
        pcVar.O = 0;
        pcVar.P = 0;
        pcVar.Q = 0;
        pcVar.R = 1.0f;
        pcVar.S = 1.0f;
        pcVar.T = -1;
        pcVar.U = -1;
        pcVar.V = -1;
        pcVar.W = false;
        pcVar.X = false;
        pcVar.Y = null;
        pcVar.Z = 0;
        pcVar.a0 = true;
        pcVar.b0 = true;
        pcVar.c0 = false;
        pcVar.d0 = false;
        pcVar.e0 = false;
        pcVar.f0 = -1;
        pcVar.g0 = -1;
        pcVar.h0 = -1;
        pcVar.i0 = -1;
        pcVar.j0 = Integer.MIN_VALUE;
        pcVar.k0 = Integer.MIN_VALUE;
        pcVar.l0 = 0.5f;
        pcVar.p0 = new ad();
        return pcVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static p20 getSharedValues() {
        if (u == null) {
            p20 p20Var = new p20();
            new SparseIntArray();
            new HashMap();
            u = p20Var;
        }
        return u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((nc) arrayList.get(i)).getClass();
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
        pc pcVar = new pc(context, attributeSet);
        pcVar.a = -1;
        pcVar.b = -1;
        pcVar.c = -1.0f;
        pcVar.d = true;
        pcVar.e = -1;
        pcVar.f = -1;
        pcVar.g = -1;
        pcVar.h = -1;
        pcVar.i = -1;
        pcVar.j = -1;
        pcVar.k = -1;
        pcVar.l = -1;
        pcVar.m = -1;
        pcVar.n = -1;
        pcVar.o = -1;
        pcVar.p = -1;
        pcVar.q = 0;
        pcVar.r = 0.0f;
        pcVar.s = -1;
        pcVar.t = -1;
        pcVar.u = -1;
        pcVar.v = -1;
        pcVar.w = Integer.MIN_VALUE;
        pcVar.x = Integer.MIN_VALUE;
        pcVar.y = Integer.MIN_VALUE;
        pcVar.z = Integer.MIN_VALUE;
        pcVar.A = Integer.MIN_VALUE;
        pcVar.B = Integer.MIN_VALUE;
        pcVar.C = Integer.MIN_VALUE;
        pcVar.D = 0;
        pcVar.E = 0.5f;
        pcVar.F = 0.5f;
        pcVar.G = null;
        pcVar.H = -1.0f;
        pcVar.I = -1.0f;
        pcVar.J = 0;
        pcVar.K = 0;
        pcVar.L = 0;
        pcVar.M = 0;
        pcVar.N = 0;
        pcVar.O = 0;
        pcVar.P = 0;
        pcVar.Q = 0;
        pcVar.R = 1.0f;
        pcVar.S = 1.0f;
        pcVar.T = -1;
        pcVar.U = -1;
        pcVar.V = -1;
        pcVar.W = false;
        pcVar.X = false;
        pcVar.Y = null;
        pcVar.Z = 0;
        pcVar.a0 = true;
        pcVar.b0 = true;
        pcVar.c0 = false;
        pcVar.d0 = false;
        pcVar.e0 = false;
        pcVar.f0 = -1;
        pcVar.g0 = -1;
        pcVar.h0 = -1;
        pcVar.i0 = -1;
        pcVar.j0 = Integer.MIN_VALUE;
        pcVar.k0 = Integer.MIN_VALUE;
        pcVar.l0 = 0.5f;
        pcVar.p0 = new ad();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qx.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = oc.a.get(index);
            switch (i2) {
                case 1:
                    pcVar.V = obtainStyledAttributes.getInt(index, pcVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, pcVar.p);
                    pcVar.p = resourceId;
                    if (resourceId == -1) {
                        pcVar.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    pcVar.q = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, pcVar.r) % 360.0f;
                    pcVar.r = f;
                    if (f < 0.0f) {
                        pcVar.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    pcVar.a = obtainStyledAttributes.getDimensionPixelOffset(index, pcVar.a);
                    break;
                case 6:
                    pcVar.b = obtainStyledAttributes.getDimensionPixelOffset(index, pcVar.b);
                    break;
                case 7:
                    pcVar.c = obtainStyledAttributes.getFloat(index, pcVar.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, pcVar.e);
                    pcVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        pcVar.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, pcVar.f);
                    pcVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        pcVar.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, pcVar.g);
                    pcVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        pcVar.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, pcVar.h);
                    pcVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        pcVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, pcVar.i);
                    pcVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        pcVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, pcVar.j);
                    pcVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        pcVar.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, pcVar.k);
                    pcVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        pcVar.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, pcVar.l);
                    pcVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        pcVar.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, pcVar.m);
                    pcVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        pcVar.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, pcVar.s);
                    pcVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        pcVar.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, pcVar.t);
                    pcVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        pcVar.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, pcVar.u);
                    pcVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        pcVar.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, pcVar.v);
                    pcVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        pcVar.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    pcVar.w = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.w);
                    break;
                case 22:
                    pcVar.x = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.x);
                    break;
                case 23:
                    pcVar.y = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.y);
                    break;
                case 24:
                    pcVar.z = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.z);
                    break;
                case 25:
                    pcVar.A = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.A);
                    break;
                case 26:
                    pcVar.B = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.B);
                    break;
                case 27:
                    pcVar.W = obtainStyledAttributes.getBoolean(index, pcVar.W);
                    break;
                case 28:
                    pcVar.X = obtainStyledAttributes.getBoolean(index, pcVar.X);
                    break;
                case 29:
                    pcVar.E = obtainStyledAttributes.getFloat(index, pcVar.E);
                    break;
                case 30:
                    pcVar.F = obtainStyledAttributes.getFloat(index, pcVar.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    pcVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    pcVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        pcVar.N = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, pcVar.N) == -2) {
                            pcVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        pcVar.P = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, pcVar.P) == -2) {
                            pcVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    pcVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, pcVar.R));
                    pcVar.L = 2;
                    break;
                case 36:
                    try {
                        pcVar.O = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, pcVar.O) == -2) {
                            pcVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        pcVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, pcVar.Q) == -2) {
                            pcVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    pcVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, pcVar.S));
                    pcVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            zc.h(pcVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            pcVar.H = obtainStyledAttributes.getFloat(index, pcVar.H);
                            break;
                        case 46:
                            pcVar.I = obtainStyledAttributes.getFloat(index, pcVar.I);
                            break;
                        case 47:
                            pcVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            pcVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            pcVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, pcVar.T);
                            break;
                        case 50:
                            pcVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, pcVar.U);
                            break;
                        case 51:
                            pcVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, pcVar.n);
                            pcVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                pcVar.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, pcVar.o);
                            pcVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                pcVar.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            pcVar.D = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.D);
                            break;
                        case 55:
                            pcVar.C = obtainStyledAttributes.getDimensionPixelSize(index, pcVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    zc.g(pcVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    zc.g(pcVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    pcVar.Z = obtainStyledAttributes.getInt(index, pcVar.Z);
                                    break;
                                case 67:
                                    pcVar.d = obtainStyledAttributes.getBoolean(index, pcVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        pcVar.a();
        return pcVar;
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
        bd bdVar = this.h;
        if (bdVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                bdVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                bdVar.j = "parent";
            }
        }
        if (bdVar.h0 == null) {
            bdVar.h0 = bdVar.j;
            Log.v("ConstraintLayout", " setDebugName " + bdVar.h0);
        }
        ArrayList arrayList = bdVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ad adVar = (ad) obj;
            View view = adVar.f0;
            if (view != null) {
                if (adVar.j == null && (id = view.getId()) != -1) {
                    adVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (adVar.h0 == null) {
                    adVar.h0 = adVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + adVar.h0);
                }
            }
        }
        bdVar.n(sb);
        return sb.toString();
    }

    public final ad h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof pc) {
            return ((pc) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof pc) {
            return ((pc) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        bd bdVar = this.h;
        bdVar.f0 = this;
        qc qcVar = this.t;
        bdVar.u0 = qcVar;
        bdVar.s0.f = qcVar;
        this.f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qx.b, i, 0);
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
                        zc zcVar = new zc();
                        this.o = zcVar;
                        zcVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        bdVar.D0 = this.n;
        kq.q = bdVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        q4 q4Var = new q4(12, false);
        q4Var.g = new SparseArray();
        q4Var.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            rc rcVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                q4Var.N(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                rc rcVar2 = new rc(context, xml);
                                ((SparseArray) q4Var.g).put(rcVar2.a, rcVar2);
                                rcVar = rcVar2;
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
                                sc scVar = new sc(context, xml);
                                if (rcVar != null) {
                                    ((ArrayList) rcVar.c).add(scVar);
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
        this.p = q4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(bd bdVar, int i, int i2, int i3) {
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
        qc qcVar;
        int i9;
        boolean z3;
        int i10;
        int i11;
        boolean t;
        qc qcVar2;
        boolean z4;
        boolean z5;
        qc qcVar3;
        boolean z6;
        en enVar;
        i80 i80Var;
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
        qc qcVar4 = this.t;
        qcVar4.b = max3;
        qcVar4.c = max4;
        qcVar4.d = paddingWidth;
        qcVar4.e = i21;
        qcVar4.f = i2;
        qcVar4.g = i3;
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
        int i25 = qcVar4.e;
        int i26 = qcVar4.d;
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
        int q = bdVar.q();
        gf gfVar = bdVar.s0;
        int[] iArr = bdVar.C;
        int i27 = i4;
        if (i27 == q && i5 == bdVar.k()) {
            c = 1;
        } else {
            gfVar.c = true;
            c = 1;
        }
        bdVar.Y = 0;
        bdVar.Z = 0;
        iArr[0] = this.k - i26;
        iArr[c] = this.l - i25;
        bdVar.b0 = 0;
        bdVar.c0 = 0;
        bdVar.M(i22);
        bdVar.O(i27);
        bdVar.N(i6);
        bdVar.L(i5);
        int i28 = this.i - i26;
        if (i28 < 0) {
            bdVar.b0 = 0;
        } else {
            bdVar.b0 = i28;
        }
        int i29 = this.j - i25;
        if (i29 < 0) {
            bdVar.c0 = 0;
        } else {
            bdVar.c0 = i29;
        }
        bdVar.x0 = max5;
        bdVar.y0 = max3;
        a6 a6Var = bdVar.r0;
        bd bdVar2 = (bd) a6Var.d;
        ArrayList arrayList2 = (ArrayList) a6Var.b;
        qc qcVar5 = bdVar.u0;
        int size5 = bdVar.q0.size();
        int q2 = bdVar.q();
        int k = bdVar.k();
        boolean p = zo.p(i, 128);
        boolean z8 = p || zo.p(i, 64);
        if (z8) {
            int i30 = 0;
            while (i30 < size5) {
                boolean z9 = z8;
                ad adVar = (ad) bdVar.q0.get(i30);
                i7 = size5;
                int[] iArr2 = adVar.p0;
                int i31 = i30;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && adVar.W > 0.0f;
                if ((adVar.x() && z10) || ((adVar.y() && z10) || (adVar instanceof lj) || adVar.x() || adVar.y())) {
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
        boolean z11 = z & ((mode == i8 && mode2 == i8) || p);
        if (z11) {
            int min = Math.min(iArr[0], i23);
            int min2 = Math.min(iArr[1], i24);
            int i32 = 1073741824;
            if (mode == 1073741824) {
                if (bdVar.q() != min) {
                    bdVar.O(min);
                    gfVar.b = true;
                }
                i32 = 1073741824;
            }
            if (mode2 == i32 && bdVar.k() != min2) {
                bdVar.L(min2);
                gfVar.b = true;
            }
            if (mode == i32 && mode2 == i32) {
                ArrayList arrayList3 = gfVar.e;
                bd bdVar3 = gfVar.a;
                if (gfVar.b || gfVar.c) {
                    ArrayList arrayList4 = bdVar3.q0;
                    int size6 = arrayList4.size();
                    z2 = z11;
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj = arrayList4.get(i33);
                        int i34 = i33 + 1;
                        ad adVar2 = (ad) obj;
                        adVar2.h();
                        adVar2.a = false;
                        adVar2.d.n();
                        adVar2.e.m();
                        arrayList4 = arrayList4;
                        i33 = i34;
                    }
                    bdVar3.h();
                    i14 = 0;
                    bdVar3.a = false;
                    bdVar3.d.n();
                    bdVar3.e.m();
                    gfVar.c = false;
                } else {
                    z2 = z11;
                    i14 = 0;
                }
                gfVar.b(gfVar.d);
                bdVar3.Y = i14;
                int[] iArr3 = bdVar3.p0;
                bdVar3.Z = i14;
                int j = bdVar3.j(i14);
                int j2 = bdVar3.j(1);
                if (gfVar.b) {
                    gfVar.c();
                }
                int r = bdVar3.r();
                qcVar = qcVar5;
                int s = bdVar3.s();
                arrayList = arrayList2;
                bdVar3.d.h.d(r);
                bdVar3.e.h.d(s);
                gfVar.g();
                if (j == 2 || j2 == 2) {
                    if (p) {
                        int size7 = arrayList3.size();
                        i15 = s;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i35);
                            i35++;
                            if (!((ka0) obj2).k()) {
                                p = false;
                                break;
                            }
                        }
                    } else {
                        i15 = s;
                    }
                    if (p && j == 2) {
                        bdVar3.M(1);
                        bdVar3.O(gfVar.d(bdVar3, 0));
                        bdVar3.d.e.d(bdVar3.q());
                    }
                    if (p && j2 == 2) {
                        i16 = 1;
                        bdVar3.N(1);
                        bdVar3.L(gfVar.d(bdVar3, 1));
                        bdVar3.e.e.d(bdVar3.k());
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q3 = bdVar3.q() + r;
                            bdVar3.d.i.d(q3);
                            bdVar3.d.e.d(q3 - r);
                            gfVar.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k2 = bdVar3.k() + i15;
                                bdVar3.e.i.d(k2);
                                bdVar3.e.e.d(k2 - i15);
                            }
                            gfVar.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            ka0 ka0Var = (ka0) obj3;
                            if (ka0Var.b != bdVar3 || ka0Var.g) {
                                ka0Var.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i20 = 0;
                        while (i20 < size2) {
                            Object obj4 = arrayList3.get(i20);
                            i20++;
                            ka0 ka0Var2 = (ka0) obj4;
                            if (z7 || ka0Var2.b != bdVar3) {
                                if (!ka0Var2.h.j || ((!ka0Var2.i.j && !(ka0Var2 instanceof pm)) || (!ka0Var2.e.j && !(ka0Var2 instanceof t9) && !(ka0Var2 instanceof pm)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        bdVar3.M(j);
                        bdVar3.N(j2);
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
                int q32 = bdVar3.q() + r;
                bdVar3.d.i.d(q32);
                bdVar3.d.e.d(q32 - r);
                gfVar.g();
                i18 = iArr3[1];
                if (i18 != 1) {
                }
                int k22 = bdVar3.k() + i15;
                bdVar3.e.i.d(k22);
                bdVar3.e.e.d(k22 - i15);
                gfVar.g();
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
                bdVar3.M(j);
                bdVar3.N(j2);
                i9 = 2;
                i13 = 1073741824;
            } else {
                z2 = z11;
                arrayList = arrayList2;
                qcVar = qcVar5;
                bd bdVar4 = gfVar.a;
                if (gfVar.b) {
                    ArrayList arrayList5 = bdVar4.q0;
                    int size8 = arrayList5.size();
                    int i36 = 0;
                    while (i36 < size8) {
                        Object obj5 = arrayList5.get(i36);
                        i36++;
                        ad adVar3 = (ad) obj5;
                        adVar3.h();
                        adVar3.a = false;
                        en enVar2 = adVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        enVar2.e.j = false;
                        enVar2.g = false;
                        enVar2.n();
                        i80 i80Var2 = adVar3.e;
                        i80Var2.e.j = false;
                        i80Var2.g = false;
                        i80Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    bdVar4.h();
                    bdVar4.a = false;
                    en enVar3 = bdVar4.d;
                    enVar3.e.j = false;
                    enVar3.g = false;
                    enVar3.n();
                    i80 i80Var3 = bdVar4.e;
                    i80Var3.e.j = false;
                    i80Var3.g = false;
                    i80Var3.m();
                    gfVar.c();
                } else {
                    i12 = 0;
                }
                gfVar.b(gfVar.d);
                bdVar4.Y = i12;
                bdVar4.Z = i12;
                bdVar4.d.h.d(i12);
                bdVar4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z3 = bdVar.T(i12, p);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= bdVar.T(1, p);
                    i9++;
                }
            }
            if (z3) {
                bdVar.P(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z11;
            arrayList = arrayList2;
            qcVar = qcVar5;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i37 = bdVar.D0;
        if (i7 > 0) {
            int size9 = bdVar.q0.size();
            boolean W = bdVar.W(64);
            qc qcVar6 = bdVar.u0;
            for (int i38 = 0; i38 < size9; i38++) {
                ad adVar4 = (ad) bdVar.q0.get(i38);
                if (!(adVar4 instanceof om) && !(adVar4 instanceof i7) && !adVar4.F && (!W || (enVar = adVar4.d) == null || (i80Var = adVar4.e) == null || !enVar.e.j || !i80Var.e.j)) {
                    int j3 = adVar4.j(0);
                    int j4 = adVar4.j(1);
                    boolean z12 = j3 == 3 && adVar4.r != 1 && j4 == 3 && adVar4.s != 1;
                    if (!z12 && bdVar.W(1) && !(adVar4 instanceof lj)) {
                        if (j3 == 3 && adVar4.r == 0 && j4 != 3 && !adVar4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 && adVar4.s == 0 && j3 != 3 && !adVar4.x()) {
                            z12 = true;
                        }
                        if ((j3 == 3 || j4 == 3) && adVar4.W > 0.0f) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        a6Var.t(0, qcVar6, adVar4);
                    }
                }
            }
            ConstraintLayout constraintLayout = qcVar6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.g;
            for (int i39 = 0; i39 < childCount2; i39++) {
                constraintLayout.getChildAt(i39);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i40 = 0; i40 < size10; i40++) {
                    ((nc) arrayList7.get(i40)).getClass();
                }
            }
        }
        a6Var.z(bdVar);
        int size11 = arrayList.size();
        if (i7 > 0) {
            a6Var.x(bdVar, 0, q2, k);
        }
        if (size11 > 0) {
            int[] iArr4 = bdVar.p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int max7 = Math.max(bdVar.q(), bdVar2.b0);
            int max8 = Math.max(bdVar.k(), bdVar2.c0);
            int i41 = 0;
            boolean z15 = false;
            while (i41 < size11) {
                ArrayList arrayList8 = arrayList;
                ad adVar5 = (ad) arrayList8.get(i41);
                if (adVar5 instanceof lj) {
                    int q4 = adVar5.q();
                    int k3 = adVar5.k();
                    z4 = z14;
                    z5 = z13;
                    qcVar3 = qcVar;
                    boolean t2 = z15 | a6Var.t(1, qcVar3, adVar5);
                    int q5 = adVar5.q();
                    int k4 = adVar5.k();
                    if (q5 != q4) {
                        adVar5.O(q5);
                        if (z5 && adVar5.r() + adVar5.U > max7) {
                            max7 = Math.max(max7, adVar5.i(4).e() + adVar5.r() + adVar5.U);
                        }
                        z6 = true;
                    } else {
                        z6 = t2;
                    }
                    if (k4 != k3) {
                        adVar5.L(k4);
                        if (z4 && adVar5.s() + adVar5.V > max8) {
                            max8 = Math.max(max8, adVar5.i(5).e() + adVar5.s() + adVar5.V);
                        }
                        z6 = true;
                    }
                    z15 = ((lj) adVar5).y0 | z6;
                } else {
                    z4 = z14;
                    z5 = z13;
                    qcVar3 = qcVar;
                }
                i41++;
                qcVar = qcVar3;
                arrayList = arrayList8;
                z13 = z5;
                z14 = z4;
            }
            boolean z16 = z14;
            boolean z17 = z13;
            ArrayList arrayList9 = arrayList;
            int i42 = 0;
            while (true) {
                qc qcVar7 = qcVar;
                if (i42 >= 2) {
                    break;
                }
                int i43 = 0;
                while (i43 < size11) {
                    ad adVar6 = (ad) arrayList9.get(i43);
                    if (((adVar6 instanceof an) && !(adVar6 instanceof lj)) || (adVar6 instanceof om) || adVar6.g0 == 8 || ((z2 && adVar6.d.e.j && adVar6.e.e.j) || (adVar6 instanceof lj))) {
                        i10 = size11;
                        qcVar2 = qcVar7;
                        i11 = i43;
                        t = z15;
                    } else {
                        int q6 = adVar6.q();
                        int k5 = adVar6.k();
                        i10 = size11;
                        int i44 = adVar6.a0;
                        i11 = i43;
                        t = a6Var.t(i42 == 1 ? 2 : 1, qcVar7, adVar6) | z15;
                        int q7 = adVar6.q();
                        qcVar2 = qcVar7;
                        int k6 = adVar6.k();
                        if (q7 != q6) {
                            adVar6.O(q7);
                            if (z17 && adVar6.r() + adVar6.U > max7) {
                                max7 = Math.max(max7, adVar6.i(4).e() + adVar6.r() + adVar6.U);
                            }
                            t = true;
                        }
                        if (k6 != k5) {
                            adVar6.L(k6);
                            if (z16 && adVar6.s() + adVar6.V > max8) {
                                max8 = Math.max(max8, adVar6.i(5).e() + adVar6.s() + adVar6.V);
                            }
                            t = true;
                        }
                        if (adVar6.E && i44 != adVar6.a0) {
                            t = true;
                        }
                    }
                    z15 = t;
                    qcVar7 = qcVar2;
                    i43 = i11 + 1;
                    size11 = i10;
                }
                int i45 = size11;
                qcVar = qcVar7;
                if (!z15) {
                    break;
                }
                i42++;
                a6Var.x(bdVar, i42, q2, k);
                size11 = i45;
                z15 = false;
            }
        }
        bdVar.D0 = i37;
        kq.q = bdVar.W(512);
    }

    public final void l(ad adVar, pc pcVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f.get(i);
        ad adVar2 = (ad) sparseArray.get(i);
        if (adVar2 == null || view == null || !(view.getLayoutParams() instanceof pc)) {
            return;
        }
        pcVar.c0 = true;
        if (i2 == 6) {
            pc pcVar2 = (pc) view.getLayoutParams();
            pcVar2.c0 = true;
            pcVar2.p0.E = true;
        }
        adVar.i(6).b(adVar2.i(i2), pcVar.D, pcVar.C, true);
        adVar.E = true;
        adVar.i(3).j();
        adVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            pc pcVar = (pc) childAt.getLayoutParams();
            ad adVar = pcVar.p0;
            if (childAt.getVisibility() != 8 || pcVar.d0 || pcVar.e0 || isInEditMode) {
                int r = adVar.r();
                int s = adVar.s();
                childAt.layout(r, s, adVar.q() + r, adVar.k() + s);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((nc) arrayList.get(i6)).getClass();
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
        ad adVar;
        int i4;
        ad adVar2;
        int i5;
        int i6;
        int i7;
        ad adVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ad adVar4;
        int i13;
        int i14;
        ad adVar5;
        pc pcVar;
        int i15;
        ad adVar6;
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
        ad adVar7;
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
        bd bdVar = constraintLayout.h;
        bdVar.v0 = z4;
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
                    ad h = constraintLayout.h(constraintLayout.getChildAt(i27));
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
                                adVar7 = view == null ? null : ((pc) view.getLayoutParams()).p0;
                                adVar7.h0 = resourceName;
                                i28++;
                                i23 = i22;
                            }
                        }
                        adVar7 = bdVar;
                        adVar7.h0 = resourceName;
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
                zc zcVar = constraintLayout.o;
                if (zcVar != null) {
                    zcVar.a(constraintLayout);
                }
                bdVar.q0.clear();
                ArrayList arrayList3 = constraintLayout.g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i31 = 0;
                    while (i31 < size) {
                        nc ncVar = (nc) arrayList3.get(i31);
                        HashMap hashMap = ncVar.l;
                        if (ncVar.isInEditMode()) {
                            ncVar.setIds(ncVar.j);
                        }
                        an anVar = ncVar.i;
                        if (anVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            anVar.r0 = i24;
                            Arrays.fill(anVar.q0, (Object) null);
                            int i32 = i24;
                            while (i32 < ncVar.g) {
                                int i33 = ncVar.f[i32];
                                View view2 = (View) sparseArray3.get(i33);
                                if (view2 != null || (f2 = ncVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i33))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    ncVar.f[i32] = f2;
                                    hashMap.put(Integer.valueOf(f2), str);
                                    view2 = (View) sparseArray3.get(f2);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    an anVar2 = ncVar.i;
                                    ad h2 = constraintLayout.h(view3);
                                    anVar2.getClass();
                                    if (h2 != anVar2 && h2 != null) {
                                        int i34 = anVar2.r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        ad[] adVarArr = anVar2.q0;
                                        if (i34 > adVarArr.length) {
                                            anVar2.q0 = (ad[]) Arrays.copyOf(adVarArr, adVarArr.length * 2);
                                        }
                                        ad[] adVarArr2 = anVar2.q0;
                                        int i35 = anVar2.r0;
                                        adVarArr2[i35] = h2;
                                        anVar2.r0 = i35 + 1;
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
                            ncVar.i.S();
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
                sparseArray4.put(0, bdVar);
                sparseArray4.put(constraintLayout.getId(), bdVar);
                for (int i38 = 0; i38 < childCount3; i38++) {
                    View childAt2 = constraintLayout.getChildAt(i38);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i39 = 0;
                while (i39 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i39);
                    ad h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        pc pcVar2 = (pc) childAt3.getLayoutParams();
                        bdVar.q0.add(h3);
                        ad adVar8 = h3.T;
                        if (adVar8 != null) {
                            ((bd) adVar8).q0.remove(h3);
                            h3.C();
                        }
                        h3.T = bdVar;
                        pcVar2.a();
                        h3.g0 = childAt3.getVisibility();
                        h3.f0 = childAt3;
                        if (childAt3 instanceof nc) {
                            ((nc) childAt3).h(h3, bdVar.v0);
                        }
                        if (pcVar2.d0) {
                            om omVar = (om) h3;
                            int i40 = pcVar2.m0;
                            int i41 = pcVar2.n0;
                            float f3 = pcVar2.o0;
                            if (f3 == -1.0f) {
                                c = 65535;
                                if (i40 != -1) {
                                    if (i40 > -1) {
                                        omVar.q0 = -1.0f;
                                        omVar.r0 = i40;
                                        omVar.s0 = -1;
                                    }
                                } else if (i41 != -1 && i41 > -1) {
                                    omVar.q0 = -1.0f;
                                    omVar.r0 = -1;
                                    omVar.s0 = i41;
                                }
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            } else if (f3 > -1.0f) {
                                omVar.q0 = f3;
                                c = 65535;
                                omVar.r0 = -1;
                                omVar.s0 = -1;
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            }
                        } else {
                            int i42 = pcVar2.f0;
                            int i43 = pcVar2.g0;
                            int i44 = pcVar2.h0;
                            int i45 = pcVar2.i0;
                            int i46 = pcVar2.j0;
                            int i47 = pcVar2.k0;
                            i3 = i39;
                            float f4 = pcVar2.l0;
                            int i48 = pcVar2.p;
                            z2 = z;
                            if (i48 != -1) {
                                ad adVar9 = (ad) sparseArray4.get(i48);
                                if (adVar9 != null) {
                                    float f5 = pcVar2.r;
                                    h3.v(7, 7, pcVar2.q, 0, adVar9);
                                    h3.D = f5;
                                }
                                constraintLayout = this;
                                adVar6 = h3;
                                pcVar = pcVar2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i42 != -1) {
                                    ad adVar10 = (ad) sparseArray4.get(i42);
                                    if (adVar10 != null) {
                                        adVar = h3;
                                        i4 = 2;
                                        adVar.v(2, 2, ((ViewGroup.MarginLayoutParams) pcVar2).leftMargin, i46, adVar10);
                                    } else {
                                        adVar = h3;
                                        i4 = 2;
                                    }
                                } else {
                                    adVar = h3;
                                    i4 = 2;
                                    if (i43 != -1 && (adVar2 = (ad) sparseArray4.get(i43)) != null) {
                                        adVar.v(2, 4, ((ViewGroup.MarginLayoutParams) pcVar2).leftMargin, i46, adVar2);
                                        i5 = 2;
                                        i6 = 4;
                                        if (i44 == -1) {
                                            ad adVar11 = (ad) sparseArray4.get(i44);
                                            if (adVar11 != null) {
                                                adVar.v(i6, i5, ((ViewGroup.MarginLayoutParams) pcVar2).rightMargin, i47, adVar11);
                                            }
                                            i7 = i5;
                                        } else {
                                            i7 = i5;
                                            if (i45 != -1 && (adVar3 = (ad) sparseArray4.get(i45)) != null) {
                                                adVar.v(i6, i6, ((ViewGroup.MarginLayoutParams) pcVar2).rightMargin, i47, adVar3);
                                            }
                                        }
                                        i8 = i6;
                                        i9 = pcVar2.i;
                                        if (i9 == -1) {
                                            ad adVar12 = (ad) sparseArray4.get(i9);
                                            if (adVar12 != null) {
                                                i16 = 3;
                                                adVar.v(3, 3, ((ViewGroup.MarginLayoutParams) pcVar2).topMargin, pcVar2.x, adVar12);
                                            } else {
                                                i16 = 3;
                                            }
                                            i11 = i16;
                                            i12 = 5;
                                            i10 = -1;
                                        } else {
                                            int i49 = pcVar2.j;
                                            i10 = -1;
                                            if (i49 == -1 || (adVar4 = (ad) sparseArray4.get(i49)) == null) {
                                                i11 = 3;
                                                i12 = 5;
                                            } else {
                                                adVar.v(3, 5, ((ViewGroup.MarginLayoutParams) pcVar2).topMargin, pcVar2.x, adVar4);
                                                i11 = 3;
                                                i12 = 5;
                                            }
                                        }
                                        i13 = pcVar2.k;
                                        if (i13 == i10) {
                                            ad adVar13 = (ad) sparseArray4.get(i13);
                                            if (adVar13 != null) {
                                                int i50 = i11;
                                                adVar.v(i12, i50, ((ViewGroup.MarginLayoutParams) pcVar2).bottomMargin, pcVar2.z, adVar13);
                                                i14 = i50;
                                            } else {
                                                i14 = i11;
                                            }
                                        } else {
                                            i14 = i11;
                                            int i51 = pcVar2.l;
                                            if (i51 != i10 && (adVar5 = (ad) sparseArray4.get(i51)) != null) {
                                                adVar.v(i12, i12, ((ViewGroup.MarginLayoutParams) pcVar2).bottomMargin, pcVar2.z, adVar5);
                                            }
                                        }
                                        pcVar = pcVar2;
                                        i15 = pcVar.m;
                                        if (i15 == -1) {
                                            constraintLayout = this;
                                            adVar6 = adVar;
                                            constraintLayout.l(adVar6, pcVar, sparseArray4, i15, 6);
                                        } else {
                                            int i52 = pcVar.n;
                                            if (i52 != -1) {
                                                constraintLayout = this;
                                                adVar6 = adVar;
                                                constraintLayout.l(adVar6, pcVar, sparseArray4, i52, i14);
                                            } else {
                                                int i53 = pcVar.o;
                                                constraintLayout = this;
                                                adVar6 = adVar;
                                                int i54 = i12;
                                                if (i53 != -1) {
                                                    constraintLayout.l(adVar6, pcVar, sparseArray4, i53, i54);
                                                }
                                                if (f4 >= 0.0f) {
                                                    adVar6.d0 = f4;
                                                }
                                                f = pcVar.F;
                                                if (f >= 0.0f) {
                                                    adVar6.e0 = f;
                                                }
                                            }
                                        }
                                        if (f4 >= 0.0f) {
                                        }
                                        f = pcVar.F;
                                        if (f >= 0.0f) {
                                        }
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i44 == -1) {
                                }
                                i8 = i6;
                                i9 = pcVar2.i;
                                if (i9 == -1) {
                                }
                                i13 = pcVar2.k;
                                if (i13 == i10) {
                                }
                                pcVar = pcVar2;
                                i15 = pcVar.m;
                                if (i15 == -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f = pcVar.F;
                                if (f >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i21 = pcVar.T) != -1 || pcVar.U != -1)) {
                                int i55 = pcVar.U;
                                adVar6.Y = i21;
                                adVar6.Z = i55;
                            }
                            if (pcVar.a0) {
                                adVar6.M(i29);
                                adVar6.O(((ViewGroup.MarginLayoutParams) pcVar).width);
                                if (((ViewGroup.MarginLayoutParams) pcVar).width == -2) {
                                    adVar6.M(i36);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) pcVar).width == -1) {
                                if (pcVar.W) {
                                    adVar6.M(3);
                                } else {
                                    adVar6.M(4);
                                }
                                adVar6.i(i7).g = ((ViewGroup.MarginLayoutParams) pcVar).leftMargin;
                                adVar6.i(i8).g = ((ViewGroup.MarginLayoutParams) pcVar).rightMargin;
                            } else {
                                adVar6.M(3);
                                adVar6.O(0);
                            }
                            if (pcVar.b0) {
                                i17 = -1;
                                adVar6.N(1);
                                adVar6.L(((ViewGroup.MarginLayoutParams) pcVar).height);
                                if (((ViewGroup.MarginLayoutParams) pcVar).height == -2) {
                                    adVar6.N(2);
                                }
                            } else {
                                i17 = -1;
                                if (((ViewGroup.MarginLayoutParams) pcVar).height == -1) {
                                    if (pcVar.X) {
                                        adVar6.N(3);
                                    } else {
                                        adVar6.N(4);
                                    }
                                    adVar6.i(3).g = ((ViewGroup.MarginLayoutParams) pcVar).topMargin;
                                    adVar6.i(5).g = ((ViewGroup.MarginLayoutParams) pcVar).bottomMargin;
                                } else {
                                    adVar6.N(3);
                                    adVar6.L(0);
                                }
                            }
                            String str2 = pcVar.G;
                            if (str2 == null || str2.length() == 0) {
                                adVar6.W = 0.0f;
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
                                    adVar6.W = parseFloat;
                                    adVar6.X = i19;
                                }
                            }
                            float f6 = pcVar.H;
                            float[] fArr = adVar6.k0;
                            fArr[0] = f6;
                            i29 = 1;
                            fArr[1] = pcVar.I;
                            adVar6.i0 = pcVar.J;
                            adVar6.j0 = pcVar.K;
                            int i56 = pcVar.Z;
                            if (i56 >= 0 && i56 <= 3) {
                                adVar6.q = i56;
                            }
                            int i57 = pcVar.L;
                            int i58 = pcVar.N;
                            int i59 = pcVar.P;
                            float f7 = pcVar.R;
                            adVar6.r = i57;
                            adVar6.u = i58;
                            if (i59 == Integer.MAX_VALUE) {
                                i59 = 0;
                            }
                            adVar6.v = i59;
                            adVar6.w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i57 == 0) {
                                adVar6.r = 2;
                            }
                            int i60 = pcVar.M;
                            int i61 = pcVar.O;
                            int i62 = pcVar.Q;
                            float f8 = pcVar.S;
                            adVar6.s = i60;
                            adVar6.x = i61;
                            if (i62 == Integer.MAX_VALUE) {
                                i62 = 0;
                            }
                            adVar6.y = i62;
                            adVar6.z = f8;
                            if (f8 <= 0.0f || f8 >= 1.0f || i60 != 0) {
                                i18 = 2;
                            } else {
                                i18 = 2;
                                adVar6.s = 2;
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
                bdVar.r0.z(bdVar);
            }
        }
        bdVar.w0.getClass();
        constraintLayout.k(bdVar, constraintLayout.n, i, i2);
        int q = bdVar.q();
        int k = bdVar.k();
        boolean z5 = bdVar.E0;
        boolean z6 = bdVar.F0;
        qc qcVar = constraintLayout.t;
        int i63 = qcVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(q + qcVar.d, i, 0);
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
        ad h = h(view);
        if ((view instanceof Guideline) && !(h instanceof om)) {
            pc pcVar = (pc) view.getLayoutParams();
            om omVar = new om();
            pcVar.p0 = omVar;
            pcVar.d0 = true;
            omVar.S(pcVar.V);
        }
        if (view instanceof nc) {
            nc ncVar = (nc) view;
            ncVar.i();
            ((pc) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(ncVar)) {
                arrayList.add(ncVar);
            }
        }
        this.f.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        ad h = h(view);
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

    public void setConstraintSet(zc zcVar) {
        this.o = zcVar;
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

    public void setOnConstraintsChanged(cd cdVar) {
        q4 q4Var = this.p;
        if (q4Var != null) {
            q4Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n = i;
        bd bdVar = this.h;
        bdVar.D0 = i;
        kq.q = bdVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new bd();
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
        this.t = new qc(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        pc pcVar = new pc(layoutParams);
        pcVar.a = -1;
        pcVar.b = -1;
        pcVar.c = -1.0f;
        pcVar.d = true;
        pcVar.e = -1;
        pcVar.f = -1;
        pcVar.g = -1;
        pcVar.h = -1;
        pcVar.i = -1;
        pcVar.j = -1;
        pcVar.k = -1;
        pcVar.l = -1;
        pcVar.m = -1;
        pcVar.n = -1;
        pcVar.o = -1;
        pcVar.p = -1;
        pcVar.q = 0;
        pcVar.r = 0.0f;
        pcVar.s = -1;
        pcVar.t = -1;
        pcVar.u = -1;
        pcVar.v = -1;
        pcVar.w = Integer.MIN_VALUE;
        pcVar.x = Integer.MIN_VALUE;
        pcVar.y = Integer.MIN_VALUE;
        pcVar.z = Integer.MIN_VALUE;
        pcVar.A = Integer.MIN_VALUE;
        pcVar.B = Integer.MIN_VALUE;
        pcVar.C = Integer.MIN_VALUE;
        pcVar.D = 0;
        pcVar.E = 0.5f;
        pcVar.F = 0.5f;
        pcVar.G = null;
        pcVar.H = -1.0f;
        pcVar.I = -1.0f;
        pcVar.J = 0;
        pcVar.K = 0;
        pcVar.L = 0;
        pcVar.M = 0;
        pcVar.N = 0;
        pcVar.O = 0;
        pcVar.P = 0;
        pcVar.Q = 0;
        pcVar.R = 1.0f;
        pcVar.S = 1.0f;
        pcVar.T = -1;
        pcVar.U = -1;
        pcVar.V = -1;
        pcVar.W = false;
        pcVar.X = false;
        pcVar.Y = null;
        pcVar.Z = 0;
        pcVar.a0 = true;
        pcVar.b0 = true;
        pcVar.c0 = false;
        pcVar.d0 = false;
        pcVar.e0 = false;
        pcVar.f0 = -1;
        pcVar.g0 = -1;
        pcVar.h0 = -1;
        pcVar.i0 = -1;
        pcVar.j0 = Integer.MIN_VALUE;
        pcVar.k0 = Integer.MIN_VALUE;
        pcVar.l0 = 0.5f;
        pcVar.p0 = new ad();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) pcVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) pcVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) pcVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) pcVar).bottomMargin = marginLayoutParams.bottomMargin;
            pcVar.setMarginStart(marginLayoutParams.getMarginStart());
            pcVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof pc)) {
            return pcVar;
        }
        pc pcVar2 = (pc) layoutParams;
        pcVar.a = pcVar2.a;
        pcVar.b = pcVar2.b;
        pcVar.c = pcVar2.c;
        pcVar.d = pcVar2.d;
        pcVar.e = pcVar2.e;
        pcVar.f = pcVar2.f;
        pcVar.g = pcVar2.g;
        pcVar.h = pcVar2.h;
        pcVar.i = pcVar2.i;
        pcVar.j = pcVar2.j;
        pcVar.k = pcVar2.k;
        pcVar.l = pcVar2.l;
        pcVar.m = pcVar2.m;
        pcVar.n = pcVar2.n;
        pcVar.o = pcVar2.o;
        pcVar.p = pcVar2.p;
        pcVar.q = pcVar2.q;
        pcVar.r = pcVar2.r;
        pcVar.s = pcVar2.s;
        pcVar.t = pcVar2.t;
        pcVar.u = pcVar2.u;
        pcVar.v = pcVar2.v;
        pcVar.w = pcVar2.w;
        pcVar.x = pcVar2.x;
        pcVar.y = pcVar2.y;
        pcVar.z = pcVar2.z;
        pcVar.A = pcVar2.A;
        pcVar.B = pcVar2.B;
        pcVar.C = pcVar2.C;
        pcVar.D = pcVar2.D;
        pcVar.E = pcVar2.E;
        pcVar.F = pcVar2.F;
        pcVar.G = pcVar2.G;
        pcVar.H = pcVar2.H;
        pcVar.I = pcVar2.I;
        pcVar.J = pcVar2.J;
        pcVar.K = pcVar2.K;
        pcVar.W = pcVar2.W;
        pcVar.X = pcVar2.X;
        pcVar.L = pcVar2.L;
        pcVar.M = pcVar2.M;
        pcVar.N = pcVar2.N;
        pcVar.P = pcVar2.P;
        pcVar.O = pcVar2.O;
        pcVar.Q = pcVar2.Q;
        pcVar.R = pcVar2.R;
        pcVar.S = pcVar2.S;
        pcVar.T = pcVar2.T;
        pcVar.U = pcVar2.U;
        pcVar.V = pcVar2.V;
        pcVar.a0 = pcVar2.a0;
        pcVar.b0 = pcVar2.b0;
        pcVar.c0 = pcVar2.c0;
        pcVar.d0 = pcVar2.d0;
        pcVar.f0 = pcVar2.f0;
        pcVar.g0 = pcVar2.g0;
        pcVar.h0 = pcVar2.h0;
        pcVar.i0 = pcVar2.i0;
        pcVar.j0 = pcVar2.j0;
        pcVar.k0 = pcVar2.k0;
        pcVar.l0 = pcVar2.l0;
        pcVar.Y = pcVar2.Y;
        pcVar.Z = pcVar2.Z;
        pcVar.p0 = pcVar2.p0;
        return pcVar;
    }
}

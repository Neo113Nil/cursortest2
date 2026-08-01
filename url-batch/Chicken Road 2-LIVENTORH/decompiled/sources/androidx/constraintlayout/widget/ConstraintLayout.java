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
import androidx.emoji2.text.q;
import androidx.emoji2.text.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p1.b;
import v.a;
import v.d;
import v.e;
import v.h;
import v.j;
import w.i;
import w.k;
import w.m;
import w.o;
import y.c;
import y.f;
import y.g;
import y.n;
import y.p;
import y.r;
import y.s;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static s f242u;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f243f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f244g;

    /* renamed from: h, reason: collision with root package name */
    public final e f245h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f246j;

    /* renamed from: k, reason: collision with root package name */
    public int f247k;

    /* renamed from: l, reason: collision with root package name */
    public int f248l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f249m;

    /* renamed from: n, reason: collision with root package name */
    public int f250n;

    /* renamed from: o, reason: collision with root package name */
    public n f251o;

    /* renamed from: p, reason: collision with root package name */
    public q f252p;

    /* renamed from: q, reason: collision with root package name */
    public int f253q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f254r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f255s;

    /* renamed from: t, reason: collision with root package name */
    public final f f256t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f243f = new SparseArray();
        this.f244g = new ArrayList(4);
        this.f245h = new e();
        this.i = 0;
        this.f246j = 0;
        this.f247k = Integer.MAX_VALUE;
        this.f248l = Integer.MAX_VALUE;
        this.f249m = true;
        this.f250n = 257;
        this.f251o = null;
        this.f252p = null;
        this.f253q = -1;
        this.f254r = new HashMap();
        this.f255s = new SparseArray();
        this.f256t = new f(this, this);
        i(attributeSet, 0);
    }

    public static y.e g() {
        y.e eVar = new y.e(-2, -2);
        eVar.f3636a = -1;
        eVar.f3638b = -1;
        eVar.f3640c = -1.0f;
        eVar.d = true;
        eVar.f3642e = -1;
        eVar.f3644f = -1;
        eVar.f3646g = -1;
        eVar.f3648h = -1;
        eVar.i = -1;
        eVar.f3650j = -1;
        eVar.f3652k = -1;
        eVar.f3654l = -1;
        eVar.f3656m = -1;
        eVar.f3658n = -1;
        eVar.f3660o = -1;
        eVar.f3662p = -1;
        eVar.f3664q = 0;
        eVar.f3665r = 0.0f;
        eVar.f3666s = -1;
        eVar.f3667t = -1;
        eVar.f3668u = -1;
        eVar.f3669v = -1;
        eVar.f3670w = Integer.MIN_VALUE;
        eVar.f3671x = Integer.MIN_VALUE;
        eVar.f3672y = Integer.MIN_VALUE;
        eVar.f3673z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f3637a0 = true;
        eVar.f3639b0 = true;
        eVar.f3641c0 = false;
        eVar.d0 = false;
        eVar.f3643e0 = false;
        eVar.f3645f0 = -1;
        eVar.f3647g0 = -1;
        eVar.f3649h0 = -1;
        eVar.i0 = -1;
        eVar.f3651j0 = Integer.MIN_VALUE;
        eVar.f3653k0 = Integer.MIN_VALUE;
        eVar.f3655l0 = 0.5f;
        eVar.f3663p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f242u == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f242u = sVar;
        }
        return f242u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f244g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i5 = (int) ((parseInt / 1080.0f) * width);
                        int i6 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i5;
                        float f4 = i6;
                        float f5 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f4, f5, f4, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f4, f5, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f5, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f249m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        y.e eVar = new y.e(context, attributeSet);
        eVar.f3636a = -1;
        eVar.f3638b = -1;
        eVar.f3640c = -1.0f;
        eVar.d = true;
        eVar.f3642e = -1;
        eVar.f3644f = -1;
        eVar.f3646g = -1;
        eVar.f3648h = -1;
        eVar.i = -1;
        eVar.f3650j = -1;
        eVar.f3652k = -1;
        eVar.f3654l = -1;
        eVar.f3656m = -1;
        eVar.f3658n = -1;
        eVar.f3660o = -1;
        eVar.f3662p = -1;
        eVar.f3664q = 0;
        eVar.f3665r = 0.0f;
        eVar.f3666s = -1;
        eVar.f3667t = -1;
        eVar.f3668u = -1;
        eVar.f3669v = -1;
        eVar.f3670w = Integer.MIN_VALUE;
        eVar.f3671x = Integer.MIN_VALUE;
        eVar.f3672y = Integer.MIN_VALUE;
        eVar.f3673z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f3637a0 = true;
        eVar.f3639b0 = true;
        eVar.f3641c0 = false;
        eVar.d0 = false;
        eVar.f3643e0 = false;
        eVar.f3645f0 = -1;
        eVar.f3647g0 = -1;
        eVar.f3649h0 = -1;
        eVar.i0 = -1;
        eVar.f3651j0 = Integer.MIN_VALUE;
        eVar.f3653k0 = Integer.MIN_VALUE;
        eVar.f3655l0 = 0.5f;
        eVar.f3663p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3768b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i4 = y.d.f3635a.get(index);
            switch (i4) {
                case 1:
                    eVar.V = obtainStyledAttributes.getInt(index, eVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f3662p);
                    eVar.f3662p = resourceId;
                    if (resourceId == -1) {
                        eVar.f3662p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f3664q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3664q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, eVar.f3665r) % 360.0f;
                    eVar.f3665r = f2;
                    if (f2 < 0.0f) {
                        eVar.f3665r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f3636a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f3636a);
                    break;
                case 6:
                    eVar.f3638b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f3638b);
                    break;
                case 7:
                    eVar.f3640c = obtainStyledAttributes.getFloat(index, eVar.f3640c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f3642e);
                    eVar.f3642e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f3642e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f3644f);
                    eVar.f3644f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f3644f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f3646g);
                    eVar.f3646g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f3646g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.f3648h);
                    eVar.f3648h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f3648h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, eVar.i);
                    eVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f3650j);
                    eVar.f3650j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f3650j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f3652k);
                    eVar.f3652k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f3652k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f3654l);
                    eVar.f3654l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f3654l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f3656m);
                    eVar.f3656m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f3656m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f3666s);
                    eVar.f3666s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f3666s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f3667t);
                    eVar.f3667t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f3667t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f3668u);
                    eVar.f3668u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f3668u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f3669v);
                    eVar.f3669v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f3669v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f3670w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3670w);
                    break;
                case 22:
                    eVar.f3671x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3671x);
                    break;
                case 23:
                    eVar.f3672y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3672y);
                    break;
                case 24:
                    eVar.f3673z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3673z);
                    break;
                case 25:
                    eVar.A = obtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 26:
                    eVar.B = obtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                    break;
                case 27:
                    eVar.W = obtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 28:
                    eVar.X = obtainStyledAttributes.getBoolean(index, eVar.X);
                    break;
                case 29:
                    eVar.E = obtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 30:
                    eVar.F = obtainStyledAttributes.getFloat(index, eVar.F);
                    break;
                case 31:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    eVar.L = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    eVar.M = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.N = obtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.P = obtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                case 36:
                    try {
                        eVar.O = obtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, eVar.Q) == -2) {
                            eVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    eVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.S));
                    eVar.M = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            n.h(eVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.H = obtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 46:
                            eVar.I = obtainStyledAttributes.getFloat(index, eVar.I);
                            break;
                        case 47:
                            eVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 50:
                            eVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.U);
                            break;
                        case 51:
                            eVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f3658n);
                            eVar.f3658n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f3658n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f3660o);
                            eVar.f3660o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f3660o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.D = obtainStyledAttributes.getDimensionPixelSize(index, eVar.D);
                            break;
                        case 55:
                            eVar.C = obtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    n.g(eVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(eVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Z = obtainStyledAttributes.getInt(index, eVar.Z);
                                    break;
                                case 67:
                                    eVar.d = obtainStyledAttributes.getBoolean(index, eVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f248l;
    }

    public int getMaxWidth() {
        return this.f247k;
    }

    public int getMinHeight() {
        return this.f246j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.f245h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f245h;
        if (eVar.f3405j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f3405j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f3405j = "parent";
            }
        }
        if (eVar.f3404h0 == null) {
            eVar.f3404h0 = eVar.f3405j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f3404h0);
        }
        ArrayList arrayList = eVar.f3429q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) obj;
            View view = dVar.f3400f0;
            if (view != null) {
                if (dVar.f3405j == null && (id = view.getId()) != -1) {
                    dVar.f3405j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f3404h0 == null) {
                    dVar.f3404h0 = dVar.f3405j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f3404h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f245h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof y.e) {
            return ((y.e) view.getLayoutParams()).f3663p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof y.e) {
            return ((y.e) view.getLayoutParams()).f3663p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.f245h;
        eVar.f3400f0 = this;
        f fVar = this.f256t;
        eVar.f3433u0 = fVar;
        eVar.f3431s0.f3524f = fVar;
        this.f243f.put(getId(), this);
        this.f251o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3768b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 17) {
                    this.f246j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f246j);
                } else if (index == 14) {
                    this.f247k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f247k);
                } else if (index == 15) {
                    this.f248l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f248l);
                } else if (index == 113) {
                    this.f250n = obtainStyledAttributes.getInt(index, this.f250n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f252p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f251o = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f251o = null;
                    }
                    this.f253q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f250n;
        t.c.f3244q = eVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        q qVar = new q(20, false);
        qVar.f346g = new SparseArray();
        qVar.f347h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                qVar.D(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                b bVar2 = new b(context, xml);
                                ((SparseArray) qVar.f346g).put(bVar2.f3011a, bVar2);
                                bVar = bVar2;
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
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    ((ArrayList) bVar.f3013c).add(gVar);
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
        } catch (IOException e4) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e4);
        } catch (XmlPullParserException e5) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e5);
        }
        this.f252p = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e eVar, int i, int i4, int i5) {
        int i6;
        int max;
        int i7;
        int max2;
        int i8;
        char c4;
        boolean z3;
        int i9;
        int i10;
        boolean z4;
        ArrayList arrayList;
        f fVar;
        int i11;
        boolean z5;
        int i12;
        int i13;
        f fVar2;
        int i14;
        boolean z6;
        int i15;
        f fVar3;
        k kVar;
        m mVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z7;
        int size;
        int i23;
        int size2;
        int i24;
        int mode = View.MeasureSpec.getMode(i4);
        int size3 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size4 = View.MeasureSpec.getSize(i5);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i25 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f256t;
        fVar4.f3675b = max3;
        fVar4.f3676c = max4;
        fVar4.d = paddingWidth;
        fVar4.f3677e = i25;
        fVar4.f3678f = i4;
        fVar4.f3679g = i5;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i26 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i27 = size3 - paddingWidth;
        int i28 = size4 - i25;
        int i29 = fVar4.f3677e;
        int i30 = fVar4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i6 = 0;
                } else {
                    i6 = Math.min(this.f247k - i30, i27);
                    i26 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.i);
                i6 = max;
                i26 = 2;
            } else {
                i6 = 0;
                i26 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.i);
            i6 = max;
            i26 = 2;
        } else {
            i6 = i27;
            i26 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i7 = mode2 != 1073741824 ? 0 : Math.min(this.f248l - i29, i28);
                i8 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f246j);
                i7 = max2;
                i8 = 2;
            } else {
                i7 = 0;
                i8 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f246j);
            i7 = max2;
            i8 = 2;
        } else {
            i7 = i28;
            i8 = 2;
        }
        int q3 = eVar.q();
        w.e eVar2 = eVar.f3431s0;
        int[] iArr = eVar.C;
        int i31 = i6;
        if (i31 == q3 && i7 == eVar.k()) {
            c4 = 1;
        } else {
            eVar2.f3522c = true;
            c4 = 1;
        }
        eVar.Y = 0;
        eVar.Z = 0;
        iArr[0] = this.f247k - i30;
        iArr[c4] = this.f248l - i29;
        eVar.f3394b0 = 0;
        eVar.f3396c0 = 0;
        eVar.M(i26);
        eVar.O(i31);
        eVar.N(i8);
        eVar.L(i7);
        int i32 = this.i - i30;
        if (i32 < 0) {
            eVar.f3394b0 = 0;
        } else {
            eVar.f3394b0 = i32;
        }
        int i33 = this.f246j - i29;
        if (i33 < 0) {
            eVar.f3396c0 = 0;
        } else {
            eVar.f3396c0 = i33;
        }
        eVar.f3436x0 = max5;
        eVar.f3437y0 = max3;
        t tVar = eVar.f3430r0;
        e eVar3 = (e) tVar.d;
        ArrayList arrayList2 = (ArrayList) tVar.f355b;
        f fVar5 = eVar.f3433u0;
        int size5 = eVar.f3429q0.size();
        int q4 = eVar.q();
        int k4 = eVar.k();
        boolean c5 = j.c(i, 128);
        boolean z8 = c5 || j.c(i, 64);
        if (z8) {
            int i34 = 0;
            while (i34 < size5) {
                boolean z9 = z8;
                d dVar = (d) eVar.f3429q0.get(i34);
                int i35 = i34;
                int[] iArr2 = dVar.f3418p0;
                i9 = size5;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.W > 0.0f;
                if ((dVar.x() && z10) || ((dVar.y() && z10) || (dVar instanceof v.g) || dVar.x() || dVar.y())) {
                    i10 = 1073741824;
                    z3 = false;
                    break;
                } else {
                    i34 = i35 + 1;
                    z8 = z9;
                    size5 = i9;
                }
            }
        }
        z3 = z8;
        i9 = size5;
        i10 = 1073741824;
        boolean z11 = z3 & ((mode == i10 && mode2 == i10) || c5);
        if (z11) {
            int min = Math.min(iArr[0], i27);
            int min2 = Math.min(iArr[1], i28);
            int i36 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.q() != min) {
                    eVar.O(min);
                    eVar2.f3521b = true;
                }
                i36 = 1073741824;
            }
            if (mode2 == i36 && eVar.k() != min2) {
                eVar.L(min2);
                eVar2.f3521b = true;
            }
            if (mode == i36 && mode2 == i36) {
                ArrayList arrayList3 = eVar2.f3523e;
                e eVar4 = eVar2.f3520a;
                if (eVar2.f3521b || eVar2.f3522c) {
                    ArrayList arrayList4 = eVar4.f3429q0;
                    int size6 = arrayList4.size();
                    z4 = z11;
                    int i37 = 0;
                    while (i37 < size6) {
                        Object obj = arrayList4.get(i37);
                        int i38 = i37 + 1;
                        d dVar2 = (d) obj;
                        dVar2.h();
                        dVar2.f3391a = false;
                        dVar2.d.n();
                        dVar2.f3397e.m();
                        arrayList4 = arrayList4;
                        i37 = i38;
                    }
                    eVar4.h();
                    i18 = 0;
                    eVar4.f3391a = false;
                    eVar4.d.n();
                    eVar4.f3397e.m();
                    eVar2.f3522c = false;
                } else {
                    z4 = z11;
                    i18 = 0;
                }
                eVar2.b(eVar2.d);
                eVar4.Y = i18;
                int[] iArr3 = eVar4.f3418p0;
                eVar4.Z = i18;
                int j4 = eVar4.j(i18);
                int j5 = eVar4.j(1);
                if (eVar2.f3521b) {
                    eVar2.c();
                }
                int r3 = eVar4.r();
                fVar = fVar5;
                int s3 = eVar4.s();
                arrayList = arrayList2;
                eVar4.d.f3555h.d(r3);
                eVar4.f3397e.f3555h.d(s3);
                eVar2.g();
                if (j4 == 2 || j5 == 2) {
                    if (c5) {
                        int size7 = arrayList3.size();
                        i19 = r3;
                        int i39 = 0;
                        while (true) {
                            if (i39 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i39);
                            i39++;
                            if (!((o) obj2).k()) {
                                c5 = false;
                                break;
                            }
                        }
                    } else {
                        i19 = r3;
                    }
                    if (c5 && j4 == 2) {
                        eVar4.M(1);
                        eVar4.O(eVar2.d(eVar4, 0));
                        eVar4.d.f3552e.d(eVar4.q());
                    }
                    if (c5 && j5 == 2) {
                        i20 = 1;
                        eVar4.N(1);
                        eVar4.L(eVar2.d(eVar4, 1));
                        eVar4.f3397e.f3552e.d(eVar4.k());
                        i21 = iArr3[0];
                        if (i21 != i20 || i21 == 4) {
                            int q5 = eVar4.q() + i19;
                            eVar4.d.i.d(q5);
                            eVar4.d.f3552e.d(q5 - i19);
                            eVar2.g();
                            i22 = iArr3[1];
                            if (i22 != 1 || i22 == 4) {
                                int k5 = eVar4.k() + s3;
                                eVar4.f3397e.i.d(k5);
                                eVar4.f3397e.f3552e.d(k5 - s3);
                            }
                            eVar2.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i23 = 0;
                        while (i23 < size) {
                            Object obj3 = arrayList3.get(i23);
                            i23++;
                            o oVar = (o) obj3;
                            if (oVar.f3550b != eVar4 || oVar.f3554g) {
                                oVar.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i24 = 0;
                        while (i24 < size2) {
                            Object obj4 = arrayList3.get(i24);
                            i24++;
                            o oVar2 = (o) obj4;
                            if (z7 || oVar2.f3550b != eVar4) {
                                if (!oVar2.f3555h.f3534j || ((!oVar2.i.f3534j && !(oVar2 instanceof i)) || (!oVar2.f3552e.f3534j && !(oVar2 instanceof w.c) && !(oVar2 instanceof i)))) {
                                    z5 = false;
                                    break;
                                }
                            }
                        }
                        z5 = true;
                        eVar4.M(j4);
                        eVar4.N(j5);
                        i11 = 2;
                        i17 = 1073741824;
                    }
                } else {
                    i19 = r3;
                }
                i20 = 1;
                i21 = iArr3[0];
                if (i21 != i20) {
                }
                int q52 = eVar4.q() + i19;
                eVar4.d.i.d(q52);
                eVar4.d.f3552e.d(q52 - i19);
                eVar2.g();
                i22 = iArr3[1];
                if (i22 != 1) {
                }
                int k52 = eVar4.k() + s3;
                eVar4.f3397e.i.d(k52);
                eVar4.f3397e.f3552e.d(k52 - s3);
                eVar2.g();
                z7 = true;
                size = arrayList3.size();
                i23 = 0;
                while (i23 < size) {
                }
                size2 = arrayList3.size();
                i24 = 0;
                while (i24 < size2) {
                }
                z5 = true;
                eVar4.M(j4);
                eVar4.N(j5);
                i11 = 2;
                i17 = 1073741824;
            } else {
                z4 = z11;
                arrayList = arrayList2;
                fVar = fVar5;
                e eVar5 = eVar2.f3520a;
                if (eVar2.f3521b) {
                    ArrayList arrayList5 = eVar5.f3429q0;
                    int size8 = arrayList5.size();
                    int i40 = 0;
                    while (i40 < size8) {
                        Object obj5 = arrayList5.get(i40);
                        i40++;
                        d dVar3 = (d) obj5;
                        dVar3.h();
                        dVar3.f3391a = false;
                        k kVar2 = dVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.f3552e.f3534j = false;
                        kVar2.f3554g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f3397e;
                        mVar2.f3552e.f3534j = false;
                        mVar2.f3554g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i16 = 0;
                    eVar5.h();
                    eVar5.f3391a = false;
                    k kVar3 = eVar5.d;
                    kVar3.f3552e.f3534j = false;
                    kVar3.f3554g = false;
                    kVar3.n();
                    m mVar3 = eVar5.f3397e;
                    mVar3.f3552e.f3534j = false;
                    mVar3.f3554g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i16 = 0;
                }
                eVar2.b(eVar2.d);
                eVar5.Y = i16;
                eVar5.Z = i16;
                eVar5.d.f3555h.d(i16);
                eVar5.f3397e.f3555h.d(i16);
                i17 = 1073741824;
                if (mode == 1073741824) {
                    z5 = eVar.T(i16, c5);
                    i11 = 1;
                } else {
                    i11 = 0;
                    z5 = true;
                }
                if (mode2 == 1073741824) {
                    z5 &= eVar.T(1, c5);
                    i11++;
                }
            }
            if (z5) {
                eVar.P(mode == i17, mode2 == i17);
            }
        } else {
            z4 = z11;
            arrayList = arrayList2;
            fVar = fVar5;
            i11 = 0;
            z5 = false;
        }
        if (z5 && i11 == 2) {
            return;
        }
        int i41 = eVar.D0;
        if (i9 > 0) {
            int size9 = eVar.f3429q0.size();
            boolean W = eVar.W(64);
            f fVar6 = eVar.f3433u0;
            for (int i42 = 0; i42 < size9; i42++) {
                d dVar4 = (d) eVar.f3429q0.get(i42);
                if (!(dVar4 instanceof h) && !(dVar4 instanceof a) && !dVar4.F && (!W || (kVar = dVar4.d) == null || (mVar = dVar4.f3397e) == null || !kVar.f3552e.f3534j || !mVar.f3552e.f3534j)) {
                    int j6 = dVar4.j(0);
                    int j7 = dVar4.j(1);
                    boolean z12 = j6 == 3 && dVar4.f3420r != 1 && j7 == 3 && dVar4.f3421s != 1;
                    if (!z12 && eVar.W(1) && !(dVar4 instanceof v.g)) {
                        if (j6 == 3 && dVar4.f3420r == 0 && j7 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if (j7 == 3 && dVar4.f3421s == 0 && j6 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if ((j6 == 3 || j7 == 3) && dVar4.W > 0.0f) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        tVar.v(0, dVar4, fVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f3674a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f244g;
            for (int i43 = 0; i43 < childCount2; i43++) {
                constraintLayout.getChildAt(i43);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i44 = 0; i44 < size10; i44++) {
                    ((c) arrayList7.get(i44)).getClass();
                }
            }
        }
        tVar.B(eVar);
        int size11 = arrayList.size();
        if (i9 > 0) {
            tVar.z(eVar, 0, q4, k4);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.f3418p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int max7 = Math.max(eVar.q(), eVar3.f3394b0);
            int max8 = Math.max(eVar.k(), eVar3.f3396c0);
            int i45 = 0;
            boolean z15 = false;
            while (i45 < size11) {
                ArrayList arrayList8 = arrayList;
                d dVar5 = (d) arrayList8.get(i45);
                if (dVar5 instanceof v.g) {
                    int q6 = dVar5.q();
                    int k6 = dVar5.k();
                    z6 = z14;
                    i15 = i45;
                    fVar3 = fVar;
                    boolean v3 = z15 | tVar.v(1, dVar5, fVar3);
                    int q7 = dVar5.q();
                    boolean z16 = v3;
                    int k7 = dVar5.k();
                    if (q7 != q6) {
                        dVar5.O(q7);
                        if (z13 && dVar5.r() + dVar5.U > max7) {
                            max7 = Math.max(max7, dVar5.i(4).e() + dVar5.r() + dVar5.U);
                        }
                        z16 = true;
                    }
                    if (k7 != k6) {
                        dVar5.L(k7);
                        if (z6 && dVar5.s() + dVar5.V > max8) {
                            max8 = Math.max(max8, dVar5.i(5).e() + dVar5.s() + dVar5.V);
                        }
                        z16 = true;
                    }
                    z15 = z16 | ((v.g) dVar5).f3463y0;
                } else {
                    z6 = z14;
                    i15 = i45;
                    fVar3 = fVar;
                }
                i45 = i15 + 1;
                fVar = fVar3;
                arrayList = arrayList8;
                z14 = z6;
            }
            boolean z17 = z14;
            ArrayList arrayList9 = arrayList;
            int i46 = 0;
            while (true) {
                f fVar7 = fVar;
                if (i46 >= 2) {
                    break;
                }
                int i47 = 0;
                while (i47 < size11) {
                    d dVar6 = (d) arrayList9.get(i47);
                    if ((!(dVar6 instanceof v.i) || (dVar6 instanceof v.g)) && !(dVar6 instanceof h)) {
                        i12 = size11;
                        if (dVar6.f3402g0 != 8 && ((!z4 || !dVar6.d.f3552e.f3534j || !dVar6.f3397e.f3552e.f3534j) && !(dVar6 instanceof v.g))) {
                            int q8 = dVar6.q();
                            int k8 = dVar6.k();
                            i13 = i47;
                            int i48 = dVar6.f3392a0;
                            z15 |= tVar.v(i46 == 1 ? 2 : 1, dVar6, fVar7);
                            fVar2 = fVar7;
                            int q9 = dVar6.q();
                            i14 = i46;
                            int k9 = dVar6.k();
                            if (q9 != q8) {
                                dVar6.O(q9);
                                if (z13 && dVar6.r() + dVar6.U > max7) {
                                    max7 = Math.max(max7, dVar6.i(4).e() + dVar6.r() + dVar6.U);
                                }
                                z15 = true;
                            }
                            if (k9 != k8) {
                                dVar6.L(k9);
                                if (z17 && dVar6.s() + dVar6.V > max8) {
                                    max8 = Math.max(max8, dVar6.i(5).e() + dVar6.s() + dVar6.V);
                                }
                                z15 = true;
                            }
                            if (dVar6.E && i48 != dVar6.f3392a0) {
                                z15 = true;
                            }
                            i47 = i13 + 1;
                            size11 = i12;
                            fVar7 = fVar2;
                            i46 = i14;
                        }
                    } else {
                        i12 = size11;
                    }
                    fVar2 = fVar7;
                    i14 = i46;
                    i13 = i47;
                    i47 = i13 + 1;
                    size11 = i12;
                    fVar7 = fVar2;
                    i46 = i14;
                }
                int i49 = size11;
                fVar = fVar7;
                int i50 = i46;
                if (!z15) {
                    break;
                }
                int i51 = i50 + 1;
                tVar.z(eVar, i51, q4, k4);
                i46 = i51;
                size11 = i49;
                z15 = false;
            }
        }
        eVar.D0 = i41;
        t.c.f3244q = eVar.W(512);
    }

    public final void l(d dVar, y.e eVar, SparseArray sparseArray, int i, int i4) {
        View view = (View) this.f243f.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof y.e)) {
            return;
        }
        eVar.f3641c0 = true;
        if (i4 == 6) {
            y.e eVar2 = (y.e) view.getLayoutParams();
            eVar2.f3641c0 = true;
            eVar2.f3663p0.E = true;
        }
        dVar.i(6).b(dVar2.i(i4), eVar.D, eVar.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            y.e eVar = (y.e) childAt.getLayoutParams();
            d dVar = eVar.f3663p0;
            if (childAt.getVisibility() != 8 || eVar.d0 || eVar.f3643e0 || isInEditMode) {
                int r3 = dVar.r();
                int s3 = dVar.s();
                childAt.layout(r3, s3, dVar.q() + r3, dVar.k() + s3);
            }
        }
        ArrayList arrayList = this.f244g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((c) arrayList.get(i8)).getClass();
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
    public void onMeasure(int i, int i4) {
        boolean z3;
        int i5;
        boolean z4;
        d dVar;
        int i6;
        d dVar2;
        int i7;
        int i8;
        int i9;
        d dVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        d dVar4;
        int i15;
        int i16;
        d dVar5;
        y.e eVar;
        int i17;
        d dVar6;
        float f2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float parseFloat;
        int i23;
        char c4;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f4;
        int i24;
        String resourceName;
        int id;
        d dVar7;
        ConstraintLayout constraintLayout = this;
        boolean z5 = constraintLayout.f249m;
        constraintLayout.f249m = z5;
        int i25 = 1;
        int i26 = 0;
        if (!z5) {
            int childCount = constraintLayout.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i27).isLayoutRequested()) {
                    constraintLayout.f249m = true;
                    break;
                }
                i27++;
            }
        }
        boolean z6 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.f245h;
        eVar2.f3434v0 = z6;
        if (constraintLayout.f249m) {
            constraintLayout.f249m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount2) {
                    z3 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i28).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i28++;
                }
            }
            if (z3) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i29 = 0; i29 < childCount3; i29++) {
                    d h4 = constraintLayout.h(constraintLayout.getChildAt(i29));
                    if (h4 != null) {
                        h4.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f243f;
                if (isInEditMode) {
                    int i30 = 0;
                    while (i30 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i30);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i24 = i25;
                                try {
                                    if (constraintLayout.f254r == null) {
                                        constraintLayout.f254r = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.f254r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i24 = i25;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i24 = i25;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                dVar7 = view == null ? null : ((y.e) view.getLayoutParams()).f3663p0;
                                dVar7.f3404h0 = resourceName;
                                i30++;
                                i25 = i24;
                            }
                        }
                        dVar7 = eVar2;
                        dVar7.f3404h0 = resourceName;
                        i30++;
                        i25 = i24;
                    }
                }
                int i31 = i25;
                if (constraintLayout.f253q != -1) {
                    for (int i32 = 0; i32 < childCount3; i32++) {
                        constraintLayout.getChildAt(i32).getId();
                    }
                }
                n nVar = constraintLayout.f251o;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar2.f3429q0.clear();
                ArrayList arrayList3 = constraintLayout.f244g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i33 = 0;
                    while (i33 < size) {
                        c cVar = (c) arrayList3.get(i33);
                        HashMap hashMap = cVar.f3634l;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f3632j);
                        }
                        v.i iVar = cVar.i;
                        if (iVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            iVar.f3472r0 = i26;
                            Arrays.fill(iVar.f3471q0, (Object) null);
                            int i34 = i26;
                            while (i34 < cVar.f3630g) {
                                int i35 = cVar.f3629f[i34];
                                View view2 = (View) sparseArray3.get(i35);
                                if (view2 != null || (f4 = cVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i35))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    cVar.f3629f[i34] = f4;
                                    hashMap.put(Integer.valueOf(f4), str);
                                    view2 = (View) sparseArray3.get(f4);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    v.i iVar2 = cVar.i;
                                    d h5 = constraintLayout.h(view3);
                                    iVar2.getClass();
                                    if (h5 != iVar2 && h5 != null) {
                                        int i36 = iVar2.f3472r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        d[] dVarArr = iVar2.f3471q0;
                                        if (i36 > dVarArr.length) {
                                            iVar2.f3471q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f3471q0;
                                        int i37 = iVar2.f3472r0;
                                        dVarArr2[i37] = h5;
                                        iVar2.f3472r0 = i37 + 1;
                                        i34++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i34++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            cVar.i.S();
                        }
                        i33++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i26 = 0;
                    }
                }
                int i38 = 2;
                for (int i39 = 0; i39 < childCount3; i39++) {
                    constraintLayout.getChildAt(i39);
                }
                SparseArray sparseArray4 = constraintLayout.f255s;
                sparseArray4.clear();
                sparseArray4.put(0, eVar2);
                sparseArray4.put(constraintLayout.getId(), eVar2);
                for (int i40 = 0; i40 < childCount3; i40++) {
                    View childAt2 = constraintLayout.getChildAt(i40);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i41 = 0;
                while (i41 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i41);
                    d h6 = constraintLayout.h(childAt3);
                    if (h6 != null) {
                        y.e eVar3 = (y.e) childAt3.getLayoutParams();
                        eVar2.f3429q0.add(h6);
                        d dVar8 = h6.T;
                        if (dVar8 != null) {
                            ((e) dVar8).f3429q0.remove(h6);
                            h6.C();
                        }
                        h6.T = eVar2;
                        eVar3.a();
                        h6.f3402g0 = childAt3.getVisibility();
                        h6.f3400f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h6, eVar2.f3434v0);
                        }
                        if (eVar3.d0) {
                            h hVar = (h) h6;
                            int i42 = eVar3.f3657m0;
                            int i43 = eVar3.f3659n0;
                            float f5 = eVar3.f3661o0;
                            if (f5 == -1.0f) {
                                c4 = 65535;
                                if (i42 != -1) {
                                    if (i42 > -1) {
                                        hVar.f3465q0 = -1.0f;
                                        hVar.f3466r0 = i42;
                                        hVar.f3467s0 = -1;
                                    }
                                } else if (i43 != -1 && i43 > -1) {
                                    hVar.f3465q0 = -1.0f;
                                    hVar.f3466r0 = -1;
                                    hVar.f3467s0 = i43;
                                }
                                i5 = i41;
                                z4 = z3;
                                i20 = i38;
                            } else if (f5 > -1.0f) {
                                hVar.f3465q0 = f5;
                                c4 = 65535;
                                hVar.f3466r0 = -1;
                                hVar.f3467s0 = -1;
                                i5 = i41;
                                z4 = z3;
                                i20 = i38;
                            }
                        } else {
                            int i44 = eVar3.f3645f0;
                            int i45 = eVar3.f3647g0;
                            int i46 = eVar3.f3649h0;
                            int i47 = eVar3.i0;
                            int i48 = eVar3.f3651j0;
                            int i49 = eVar3.f3653k0;
                            i5 = i41;
                            float f6 = eVar3.f3655l0;
                            int i50 = eVar3.f3662p;
                            z4 = z3;
                            if (i50 != -1) {
                                d dVar9 = (d) sparseArray4.get(i50);
                                if (dVar9 != null) {
                                    float f7 = eVar3.f3665r;
                                    h6.v(7, 7, eVar3.f3664q, 0, dVar9);
                                    h6.D = f7;
                                }
                                constraintLayout = this;
                                dVar6 = h6;
                                eVar = eVar3;
                                i10 = 4;
                                i9 = 2;
                            } else {
                                if (i44 != -1) {
                                    d dVar10 = (d) sparseArray4.get(i44);
                                    if (dVar10 != null) {
                                        dVar = h6;
                                        i6 = 2;
                                        dVar.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i48, dVar10);
                                    } else {
                                        dVar = h6;
                                        i6 = 2;
                                    }
                                } else {
                                    dVar = h6;
                                    i6 = 2;
                                    if (i45 != -1 && (dVar2 = (d) sparseArray4.get(i45)) != null) {
                                        dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i48, dVar2);
                                        i7 = 2;
                                        i8 = 4;
                                        if (i46 == -1) {
                                            d dVar11 = (d) sparseArray4.get(i46);
                                            if (dVar11 != null) {
                                                dVar.v(i8, i7, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i49, dVar11);
                                            }
                                            i9 = i7;
                                        } else {
                                            i9 = i7;
                                            if (i47 != -1 && (dVar3 = (d) sparseArray4.get(i47)) != null) {
                                                dVar.v(i8, i8, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i49, dVar3);
                                            }
                                        }
                                        i10 = i8;
                                        i11 = eVar3.i;
                                        if (i11 == -1) {
                                            d dVar12 = (d) sparseArray4.get(i11);
                                            if (dVar12 != null) {
                                                i18 = 3;
                                                dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f3671x, dVar12);
                                            } else {
                                                i18 = 3;
                                            }
                                            i13 = i18;
                                            i14 = 5;
                                            i12 = -1;
                                        } else {
                                            int i51 = eVar3.f3650j;
                                            i12 = -1;
                                            if (i51 == -1 || (dVar4 = (d) sparseArray4.get(i51)) == null) {
                                                i13 = 3;
                                                i14 = 5;
                                            } else {
                                                dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f3671x, dVar4);
                                                i13 = 3;
                                                i14 = 5;
                                            }
                                        }
                                        i15 = eVar3.f3652k;
                                        if (i15 == i12) {
                                            d dVar13 = (d) sparseArray4.get(i15);
                                            if (dVar13 != null) {
                                                int i52 = i13;
                                                dVar.v(i14, i52, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f3673z, dVar13);
                                                i16 = i52;
                                            } else {
                                                i16 = i13;
                                            }
                                        } else {
                                            i16 = i13;
                                            int i53 = eVar3.f3654l;
                                            if (i53 != i12 && (dVar5 = (d) sparseArray4.get(i53)) != null) {
                                                dVar.v(i14, i14, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f3673z, dVar5);
                                            }
                                        }
                                        eVar = eVar3;
                                        i17 = eVar.f3656m;
                                        if (i17 == -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray4, i17, 6);
                                        } else {
                                            int i54 = eVar.f3658n;
                                            if (i54 != -1) {
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                constraintLayout.l(dVar6, eVar, sparseArray4, i54, i16);
                                            } else {
                                                int i55 = eVar.f3660o;
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                int i56 = i14;
                                                if (i55 != -1) {
                                                    constraintLayout.l(dVar6, eVar, sparseArray4, i55, i56);
                                                }
                                                if (f6 >= 0.0f) {
                                                    dVar6.d0 = f6;
                                                }
                                                f2 = eVar.F;
                                                if (f2 >= 0.0f) {
                                                    dVar6.f3398e0 = f2;
                                                }
                                            }
                                        }
                                        if (f6 >= 0.0f) {
                                        }
                                        f2 = eVar.F;
                                        if (f2 >= 0.0f) {
                                        }
                                    }
                                }
                                i7 = i6;
                                i8 = 4;
                                if (i46 == -1) {
                                }
                                i10 = i8;
                                i11 = eVar3.i;
                                if (i11 == -1) {
                                }
                                i15 = eVar3.f3652k;
                                if (i15 == i12) {
                                }
                                eVar = eVar3;
                                i17 = eVar.f3656m;
                                if (i17 == -1) {
                                }
                                if (f6 >= 0.0f) {
                                }
                                f2 = eVar.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i23 = eVar.T) != -1 || eVar.U != -1)) {
                                int i57 = eVar.U;
                                dVar6.Y = i23;
                                dVar6.Z = i57;
                            }
                            if (eVar.f3637a0) {
                                dVar6.M(i31);
                                dVar6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar6.M(i38);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.W) {
                                    dVar6.M(3);
                                } else {
                                    dVar6.M(4);
                                }
                                dVar6.i(i9).f3389g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i10).f3389g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.M(3);
                                dVar6.O(0);
                            }
                            if (eVar.f3639b0) {
                                i19 = -1;
                                dVar6.N(1);
                                dVar6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar6.N(2);
                                }
                            } else {
                                i19 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.X) {
                                        dVar6.N(3);
                                    } else {
                                        dVar6.N(4);
                                    }
                                    dVar6.i(3).f3389g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).f3389g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    dVar6.N(3);
                                    dVar6.L(0);
                                }
                            }
                            String str2 = eVar.G;
                            if (str2 == null || str2.length() == 0) {
                                dVar6.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i21 = i19;
                                    i22 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i21 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i19;
                                    i22 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i22);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i22, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i21 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    dVar6.W = parseFloat;
                                    dVar6.X = i21;
                                }
                            }
                            float f8 = eVar.H;
                            float[] fArr = dVar6.f3408k0;
                            fArr[0] = f8;
                            i31 = 1;
                            fArr[1] = eVar.I;
                            dVar6.i0 = eVar.J;
                            dVar6.f3406j0 = eVar.K;
                            int i58 = eVar.Z;
                            if (i58 >= 0 && i58 <= 3) {
                                dVar6.f3419q = i58;
                            }
                            int i59 = eVar.L;
                            int i60 = eVar.N;
                            int i61 = eVar.P;
                            float f9 = eVar.R;
                            dVar6.f3420r = i59;
                            dVar6.f3423u = i60;
                            if (i61 == Integer.MAX_VALUE) {
                                i61 = 0;
                            }
                            dVar6.f3424v = i61;
                            dVar6.f3425w = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i59 == 0) {
                                dVar6.f3420r = 2;
                            }
                            int i62 = eVar.M;
                            int i63 = eVar.O;
                            int i64 = eVar.Q;
                            float f10 = eVar.S;
                            dVar6.f3421s = i62;
                            dVar6.f3426x = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            dVar6.f3427y = i64;
                            dVar6.f3428z = f10;
                            if (f10 <= 0.0f || f10 >= 1.0f || i62 != 0) {
                                i20 = 2;
                            } else {
                                i20 = 2;
                                dVar6.f3421s = 2;
                            }
                        }
                        i41 = i5 + 1;
                        i38 = i20;
                        z3 = z4;
                    }
                    i5 = i41;
                    z4 = z3;
                    i20 = i38;
                    i41 = i5 + 1;
                    i38 = i20;
                    z3 = z4;
                }
            }
            if (z3) {
                eVar2.f3430r0.B(eVar2);
            }
        }
        eVar2.f3435w0.getClass();
        constraintLayout.k(eVar2, constraintLayout.f250n, i, i4);
        int q3 = eVar2.q();
        int k4 = eVar2.k();
        boolean z7 = eVar2.E0;
        boolean z8 = eVar2.F0;
        f fVar = constraintLayout.f256t;
        int i65 = fVar.f3677e;
        int resolveSizeAndState = View.resolveSizeAndState(q3 + fVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k4 + i65, i4, 0) & 16777215;
        int min = Math.min(constraintLayout.f247k, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f248l, resolveSizeAndState2);
        if (z7) {
            min |= 16777216;
        }
        if (z8) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h4 = h(view);
        if ((view instanceof p) && !(h4 instanceof h)) {
            y.e eVar = (y.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f3663p0 = hVar;
            eVar.d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((y.e) view.getLayoutParams()).f3643e0 = true;
            ArrayList arrayList = this.f244g;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f243f.put(view.getId(), view);
        this.f249m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f243f.remove(view.getId());
        d h4 = h(view);
        this.f245h.f3429q0.remove(h4);
        h4.C();
        this.f244g.remove(view);
        this.f249m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f249m = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f251o = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f243f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f248l) {
            return;
        }
        this.f248l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f247k) {
            return;
        }
        this.f247k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f246j) {
            return;
        }
        this.f246j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(y.o oVar) {
        q qVar = this.f252p;
        if (qVar != null) {
            qVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f250n = i;
        e eVar = this.f245h;
        eVar.D0 = i;
        t.c.f3244q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f243f = new SparseArray();
        this.f244g = new ArrayList(4);
        this.f245h = new e();
        this.i = 0;
        this.f246j = 0;
        this.f247k = Integer.MAX_VALUE;
        this.f248l = Integer.MAX_VALUE;
        this.f249m = true;
        this.f250n = 257;
        this.f251o = null;
        this.f252p = null;
        this.f253q = -1;
        this.f254r = new HashMap();
        this.f255s = new SparseArray();
        this.f256t = new f(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        y.e eVar = new y.e(layoutParams);
        eVar.f3636a = -1;
        eVar.f3638b = -1;
        eVar.f3640c = -1.0f;
        eVar.d = true;
        eVar.f3642e = -1;
        eVar.f3644f = -1;
        eVar.f3646g = -1;
        eVar.f3648h = -1;
        eVar.i = -1;
        eVar.f3650j = -1;
        eVar.f3652k = -1;
        eVar.f3654l = -1;
        eVar.f3656m = -1;
        eVar.f3658n = -1;
        eVar.f3660o = -1;
        eVar.f3662p = -1;
        eVar.f3664q = 0;
        eVar.f3665r = 0.0f;
        eVar.f3666s = -1;
        eVar.f3667t = -1;
        eVar.f3668u = -1;
        eVar.f3669v = -1;
        eVar.f3670w = Integer.MIN_VALUE;
        eVar.f3671x = Integer.MIN_VALUE;
        eVar.f3672y = Integer.MIN_VALUE;
        eVar.f3673z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f3637a0 = true;
        eVar.f3639b0 = true;
        eVar.f3641c0 = false;
        eVar.d0 = false;
        eVar.f3643e0 = false;
        eVar.f3645f0 = -1;
        eVar.f3647g0 = -1;
        eVar.f3649h0 = -1;
        eVar.i0 = -1;
        eVar.f3651j0 = Integer.MIN_VALUE;
        eVar.f3653k0 = Integer.MIN_VALUE;
        eVar.f3655l0 = 0.5f;
        eVar.f3663p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof y.e)) {
            return eVar;
        }
        y.e eVar2 = (y.e) layoutParams;
        eVar.f3636a = eVar2.f3636a;
        eVar.f3638b = eVar2.f3638b;
        eVar.f3640c = eVar2.f3640c;
        eVar.d = eVar2.d;
        eVar.f3642e = eVar2.f3642e;
        eVar.f3644f = eVar2.f3644f;
        eVar.f3646g = eVar2.f3646g;
        eVar.f3648h = eVar2.f3648h;
        eVar.i = eVar2.i;
        eVar.f3650j = eVar2.f3650j;
        eVar.f3652k = eVar2.f3652k;
        eVar.f3654l = eVar2.f3654l;
        eVar.f3656m = eVar2.f3656m;
        eVar.f3658n = eVar2.f3658n;
        eVar.f3660o = eVar2.f3660o;
        eVar.f3662p = eVar2.f3662p;
        eVar.f3664q = eVar2.f3664q;
        eVar.f3665r = eVar2.f3665r;
        eVar.f3666s = eVar2.f3666s;
        eVar.f3667t = eVar2.f3667t;
        eVar.f3668u = eVar2.f3668u;
        eVar.f3669v = eVar2.f3669v;
        eVar.f3670w = eVar2.f3670w;
        eVar.f3671x = eVar2.f3671x;
        eVar.f3672y = eVar2.f3672y;
        eVar.f3673z = eVar2.f3673z;
        eVar.A = eVar2.A;
        eVar.B = eVar2.B;
        eVar.C = eVar2.C;
        eVar.D = eVar2.D;
        eVar.E = eVar2.E;
        eVar.F = eVar2.F;
        eVar.G = eVar2.G;
        eVar.H = eVar2.H;
        eVar.I = eVar2.I;
        eVar.J = eVar2.J;
        eVar.K = eVar2.K;
        eVar.W = eVar2.W;
        eVar.X = eVar2.X;
        eVar.L = eVar2.L;
        eVar.M = eVar2.M;
        eVar.N = eVar2.N;
        eVar.P = eVar2.P;
        eVar.O = eVar2.O;
        eVar.Q = eVar2.Q;
        eVar.R = eVar2.R;
        eVar.S = eVar2.S;
        eVar.T = eVar2.T;
        eVar.U = eVar2.U;
        eVar.V = eVar2.V;
        eVar.f3637a0 = eVar2.f3637a0;
        eVar.f3639b0 = eVar2.f3639b0;
        eVar.f3641c0 = eVar2.f3641c0;
        eVar.d0 = eVar2.d0;
        eVar.f3645f0 = eVar2.f3645f0;
        eVar.f3647g0 = eVar2.f3647g0;
        eVar.f3649h0 = eVar2.f3649h0;
        eVar.i0 = eVar2.i0;
        eVar.f3651j0 = eVar2.f3651j0;
        eVar.f3653k0 = eVar2.f3653k0;
        eVar.f3655l0 = eVar2.f3655l0;
        eVar.Y = eVar2.Y;
        eVar.Z = eVar2.Z;
        eVar.f3663p0 = eVar2.f3663p0;
        return eVar;
    }
}

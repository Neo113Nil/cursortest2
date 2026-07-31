package androidx.constraintlayout.widget;

import a0.a0;
import a0.g1;
import a4.i;
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
import b3.c;
import b3.f;
import b3.g;
import b3.h;
import b3.o;
import b3.p;
import b3.q;
import b3.s;
import b3.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import x.v0;
import y2.a;
import y2.d;
import y2.e;
import y2.j;
import z2.k;
import z2.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public static t f570s;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f571d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f572e;

    /* renamed from: f, reason: collision with root package name */
    public final e f573f;

    /* renamed from: g, reason: collision with root package name */
    public int f574g;

    /* renamed from: h, reason: collision with root package name */
    public int f575h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f576j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f577k;

    /* renamed from: l, reason: collision with root package name */
    public int f578l;

    /* renamed from: m, reason: collision with root package name */
    public o f579m;

    /* renamed from: n, reason: collision with root package name */
    public a0 f580n;

    /* renamed from: o, reason: collision with root package name */
    public int f581o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f582p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f583q;

    /* renamed from: r, reason: collision with root package name */
    public final f f584r;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f571d = new SparseArray();
        this.f572e = new ArrayList(4);
        this.f573f = new e();
        this.f574g = 0;
        this.f575h = 0;
        this.i = Integer.MAX_VALUE;
        this.f576j = Integer.MAX_VALUE;
        this.f577k = true;
        this.f578l = 257;
        this.f579m = null;
        this.f580n = null;
        this.f581o = -1;
        this.f582p = new HashMap();
        this.f583q = new SparseArray();
        this.f584r = new f(this, this);
        i(attributeSet, 0);
    }

    public static b3.e g() {
        b3.e eVar = new b3.e(-2, -2);
        eVar.f1080a = -1;
        eVar.f1082b = -1;
        eVar.f1084c = -1.0f;
        eVar.f1086d = true;
        eVar.f1088e = -1;
        eVar.f1090f = -1;
        eVar.f1092g = -1;
        eVar.f1094h = -1;
        eVar.i = -1;
        eVar.f1097j = -1;
        eVar.f1099k = -1;
        eVar.f1101l = -1;
        eVar.f1103m = -1;
        eVar.f1105n = -1;
        eVar.f1107o = -1;
        eVar.f1109p = -1;
        eVar.f1111q = 0;
        eVar.f1112r = 0.0f;
        eVar.f1113s = -1;
        eVar.f1114t = -1;
        eVar.f1115u = -1;
        eVar.f1116v = -1;
        eVar.f1117w = Integer.MIN_VALUE;
        eVar.f1118x = Integer.MIN_VALUE;
        eVar.f1119y = Integer.MIN_VALUE;
        eVar.f1120z = Integer.MIN_VALUE;
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
        eVar.f1081a0 = true;
        eVar.f1083b0 = true;
        eVar.f1085c0 = false;
        eVar.f1087d0 = false;
        eVar.f1089e0 = false;
        eVar.f1091f0 = -1;
        eVar.f1093g0 = -1;
        eVar.f1095h0 = -1;
        eVar.f1096i0 = -1;
        eVar.f1098j0 = Integer.MIN_VALUE;
        eVar.f1100k0 = Integer.MIN_VALUE;
        eVar.f1102l0 = 0.5f;
        eVar.f1110p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static t getSharedValues() {
        if (f570s == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            f570s = tVar;
        }
        return f570s;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b3.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f572e;
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
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i9;
                        float f8 = i10;
                        float f9 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f8, f9, f8, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f9, f8, f9, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f8, f9, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f9, f8, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f577k = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b3.e eVar = new b3.e(context, attributeSet);
        eVar.f1080a = -1;
        eVar.f1082b = -1;
        eVar.f1084c = -1.0f;
        eVar.f1086d = true;
        eVar.f1088e = -1;
        eVar.f1090f = -1;
        eVar.f1092g = -1;
        eVar.f1094h = -1;
        eVar.i = -1;
        eVar.f1097j = -1;
        eVar.f1099k = -1;
        eVar.f1101l = -1;
        eVar.f1103m = -1;
        eVar.f1105n = -1;
        eVar.f1107o = -1;
        eVar.f1109p = -1;
        eVar.f1111q = 0;
        eVar.f1112r = 0.0f;
        eVar.f1113s = -1;
        eVar.f1114t = -1;
        eVar.f1115u = -1;
        eVar.f1116v = -1;
        eVar.f1117w = Integer.MIN_VALUE;
        eVar.f1118x = Integer.MIN_VALUE;
        eVar.f1119y = Integer.MIN_VALUE;
        eVar.f1120z = Integer.MIN_VALUE;
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
        eVar.f1081a0 = true;
        eVar.f1083b0 = true;
        eVar.f1085c0 = false;
        eVar.f1087d0 = false;
        eVar.f1089e0 = false;
        eVar.f1091f0 = -1;
        eVar.f1093g0 = -1;
        eVar.f1095h0 = -1;
        eVar.f1096i0 = -1;
        eVar.f1098j0 = Integer.MIN_VALUE;
        eVar.f1100k0 = Integer.MIN_VALUE;
        eVar.f1102l0 = 0.5f;
        eVar.f1110p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1229b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i8 = b3.d.f1079a.get(index);
            switch (i8) {
                case 1:
                    eVar.V = obtainStyledAttributes.getInt(index, eVar.V);
                    break;
                case i.FLOAT_FIELD_NUMBER /* 2 */:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f1109p);
                    eVar.f1109p = resourceId;
                    if (resourceId == -1) {
                        eVar.f1109p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case i.INTEGER_FIELD_NUMBER /* 3 */:
                    eVar.f1111q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f1111q);
                    break;
                case i.LONG_FIELD_NUMBER /* 4 */:
                    float f6 = obtainStyledAttributes.getFloat(index, eVar.f1112r) % 360.0f;
                    eVar.f1112r = f6;
                    if (f6 < 0.0f) {
                        eVar.f1112r = (360.0f - f6) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f1080a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1080a);
                    break;
                case 6:
                    eVar.f1082b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1082b);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    eVar.f1084c = obtainStyledAttributes.getFloat(index, eVar.f1084c);
                    break;
                case i.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f1088e);
                    eVar.f1088e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f1088e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case v0.f8304b /* 9 */:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f1090f);
                    eVar.f1090f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f1090f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case v0.f8306d /* 10 */:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f1092g);
                    eVar.f1092g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f1092g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.f1094h);
                    eVar.f1094h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f1094h = obtainStyledAttributes.getInt(index, -1);
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
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f1097j);
                    eVar.f1097j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f1097j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f1099k);
                    eVar.f1099k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f1099k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case v0.f8308f /* 15 */:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f1101l);
                    eVar.f1101l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f1101l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f1103m);
                    eVar.f1103m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f1103m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f1113s);
                    eVar.f1113s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f1113s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f1114t);
                    eVar.f1114t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f1114t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f1115u);
                    eVar.f1115u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f1115u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f1116v);
                    eVar.f1116v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f1116v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f1117w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f1117w);
                    break;
                case 22:
                    eVar.f1118x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f1118x);
                    break;
                case 23:
                    eVar.f1119y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f1119y);
                    break;
                case 24:
                    eVar.f1120z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f1120z);
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
                    int i9 = obtainStyledAttributes.getInt(index, 0);
                    eVar.L = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    eVar.M = i10;
                    if (i10 == 1) {
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
                    switch (i8) {
                        case 44:
                            o.h(eVar, obtainStyledAttributes.getString(index));
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
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f1105n);
                            eVar.f1105n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f1105n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f1107o);
                            eVar.f1107o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f1107o = obtainStyledAttributes.getInt(index, -1);
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
                            switch (i8) {
                                case 64:
                                    o.g(eVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(eVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Z = obtainStyledAttributes.getInt(index, eVar.Z);
                                    break;
                                case 67:
                                    eVar.f1086d = obtainStyledAttributes.getBoolean(index, eVar.f1086d);
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
        return this.f576j;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinHeight() {
        return this.f575h;
    }

    public int getMinWidth() {
        return this.f574g;
    }

    public int getOptimizationLevel() {
        return this.f573f.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f573f;
        if (eVar.f8764j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f8764j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f8764j = "parent";
            }
        }
        if (eVar.f8762h0 == null) {
            eVar.f8762h0 = eVar.f8764j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f8762h0);
        }
        ArrayList arrayList = eVar.f8788q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) obj;
            View view = dVar.f8758f0;
            if (view != null) {
                if (dVar.f8764j == null && (id = view.getId()) != -1) {
                    dVar.f8764j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f8762h0 == null) {
                    dVar.f8762h0 = dVar.f8764j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f8762h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f573f;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b3.e) {
            return ((b3.e) view.getLayoutParams()).f1110p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b3.e) {
            return ((b3.e) view.getLayoutParams()).f1110p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.f573f;
        eVar.f8758f0 = this;
        f fVar = this.f584r;
        eVar.f8792u0 = fVar;
        eVar.f8790s0.f9134f = fVar;
        this.f571d.put(getId(), this);
        this.f579m = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1229b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 16) {
                    this.f574g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f574g);
                } else if (index == 17) {
                    this.f575h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f575h);
                } else if (index == 14) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 15) {
                    this.f576j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f576j);
                } else if (index == 113) {
                    this.f578l = obtainStyledAttributes.getInt(index, this.f578l);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f580n = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.f579m = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f579m = null;
                    }
                    this.f581o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f578l;
        w2.c.f7845q = eVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        a0 a0Var = new a0(2, false);
        a0Var.f11e = new SparseArray();
        a0Var.f12f = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            g gVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a0Var.s(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                g gVar2 = new g(context, xml);
                                ((SparseArray) a0Var.f11e).put(gVar2.f1129d, gVar2);
                                gVar = gVar2;
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
                                h hVar = new h(context, xml);
                                if (gVar != null) {
                                    ((ArrayList) gVar.f1131f).add(hVar);
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
        } catch (IOException e8) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e8);
        } catch (XmlPullParserException e9) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e9);
        }
        this.f580n = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e eVar, int i, int i8, int i9) {
        int i10;
        int max;
        int i11;
        int max2;
        int i12;
        char c8;
        boolean z3;
        int i13;
        int i14;
        boolean z7;
        ArrayList arrayList;
        f fVar;
        int i15;
        boolean z8;
        int i16;
        int i17;
        f fVar2;
        int i18;
        boolean z9;
        int i19;
        f fVar3;
        k kVar;
        m mVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z10;
        int size;
        int i27;
        int size2;
        int i28;
        int mode = View.MeasureSpec.getMode(i8);
        int size3 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size4 = View.MeasureSpec.getSize(i9);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i29 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f584r;
        fVar4.f1122b = max3;
        fVar4.f1123c = max4;
        fVar4.f1124d = paddingWidth;
        fVar4.f1125e = i29;
        fVar4.f1126f = i8;
        fVar4.f1127g = i9;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i30 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i31 = size3 - paddingWidth;
        int i32 = size4 - i29;
        int i33 = fVar4.f1125e;
        int i34 = fVar4.f1124d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i10 = 0;
                } else {
                    i10 = Math.min(this.i - i34, i31);
                    i30 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f574g);
                i10 = max;
                i30 = 2;
            } else {
                i10 = 0;
                i30 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f574g);
            i10 = max;
            i30 = 2;
        } else {
            i10 = i31;
            i30 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i11 = mode2 != 1073741824 ? 0 : Math.min(this.f576j - i33, i32);
                i12 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f575h);
                i11 = max2;
                i12 = 2;
            } else {
                i11 = 0;
                i12 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f575h);
            i11 = max2;
            i12 = 2;
        } else {
            i11 = i32;
            i12 = 2;
        }
        int q4 = eVar.q();
        z2.e eVar2 = eVar.f8790s0;
        int[] iArr = eVar.C;
        int i35 = i10;
        if (i35 == q4 && i11 == eVar.k()) {
            c8 = 1;
        } else {
            eVar2.f9131c = true;
            c8 = 1;
        }
        eVar.Y = 0;
        eVar.Z = 0;
        iArr[0] = this.i - i34;
        iArr[c8] = this.f576j - i33;
        eVar.f8750b0 = 0;
        eVar.f8752c0 = 0;
        eVar.M(i30);
        eVar.O(i35);
        eVar.N(i12);
        eVar.L(i11);
        int i36 = this.f574g - i34;
        if (i36 < 0) {
            eVar.f8750b0 = 0;
        } else {
            eVar.f8750b0 = i36;
        }
        int i37 = this.f575h - i33;
        if (i37 < 0) {
            eVar.f8752c0 = 0;
        } else {
            eVar.f8752c0 = i37;
        }
        eVar.f8795x0 = max5;
        eVar.f8796y0 = max3;
        g1 g1Var = eVar.f8789r0;
        e eVar3 = (e) g1Var.f86d;
        ArrayList arrayList2 = (ArrayList) g1Var.f84b;
        f fVar5 = eVar.f8792u0;
        int size5 = eVar.f8788q0.size();
        int q7 = eVar.q();
        int k3 = eVar.k();
        boolean c9 = j.c(i, 128);
        boolean z11 = c9 || j.c(i, 64);
        if (z11) {
            int i38 = 0;
            while (i38 < size5) {
                boolean z12 = z11;
                d dVar = (d) eVar.f8788q0.get(i38);
                int i39 = i38;
                int[] iArr2 = dVar.f8777p0;
                i13 = size5;
                boolean z13 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.W > 0.0f;
                if ((dVar.x() && z13) || ((dVar.y() && z13) || (dVar instanceof y2.g) || dVar.x() || dVar.y())) {
                    i14 = 1073741824;
                    z3 = false;
                    break;
                } else {
                    i38 = i39 + 1;
                    z11 = z12;
                    size5 = i13;
                }
            }
        }
        z3 = z11;
        i13 = size5;
        i14 = 1073741824;
        boolean z14 = z3 & ((mode == i14 && mode2 == i14) || c9);
        if (z14) {
            int min = Math.min(iArr[0], i31);
            int min2 = Math.min(iArr[1], i32);
            int i40 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.q() != min) {
                    eVar.O(min);
                    eVar2.f9130b = true;
                }
                i40 = 1073741824;
            }
            if (mode2 == i40 && eVar.k() != min2) {
                eVar.L(min2);
                eVar2.f9130b = true;
            }
            if (mode == i40 && mode2 == i40) {
                ArrayList arrayList3 = eVar2.f9133e;
                e eVar4 = eVar2.f9129a;
                if (eVar2.f9130b || eVar2.f9131c) {
                    ArrayList arrayList4 = eVar4.f8788q0;
                    int size6 = arrayList4.size();
                    z7 = z14;
                    int i41 = 0;
                    while (i41 < size6) {
                        Object obj = arrayList4.get(i41);
                        int i42 = i41 + 1;
                        d dVar2 = (d) obj;
                        dVar2.h();
                        dVar2.f8747a = false;
                        dVar2.f8753d.n();
                        dVar2.f8755e.m();
                        arrayList4 = arrayList4;
                        i41 = i42;
                    }
                    eVar4.h();
                    i22 = 0;
                    eVar4.f8747a = false;
                    eVar4.f8753d.n();
                    eVar4.f8755e.m();
                    eVar2.f9131c = false;
                } else {
                    z7 = z14;
                    i22 = 0;
                }
                eVar2.b(eVar2.f9132d);
                eVar4.Y = i22;
                int[] iArr3 = eVar4.f8777p0;
                eVar4.Z = i22;
                int j7 = eVar4.j(i22);
                int j8 = eVar4.j(1);
                if (eVar2.f9130b) {
                    eVar2.c();
                }
                int r7 = eVar4.r();
                fVar = fVar5;
                int s5 = eVar4.s();
                arrayList = arrayList2;
                eVar4.f8753d.f9168h.d(r7);
                eVar4.f8755e.f9168h.d(s5);
                eVar2.g();
                if (j7 == 2 || j8 == 2) {
                    if (c9) {
                        int size7 = arrayList3.size();
                        i23 = r7;
                        int i43 = 0;
                        while (true) {
                            if (i43 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i43);
                            i43++;
                            if (!((z2.o) obj2).k()) {
                                c9 = false;
                                break;
                            }
                        }
                    } else {
                        i23 = r7;
                    }
                    if (c9 && j7 == 2) {
                        eVar4.M(1);
                        eVar4.O(eVar2.d(eVar4, 0));
                        eVar4.f8753d.f9165e.d(eVar4.q());
                    }
                    if (c9 && j8 == 2) {
                        i24 = 1;
                        eVar4.N(1);
                        eVar4.L(eVar2.d(eVar4, 1));
                        eVar4.f8755e.f9165e.d(eVar4.k());
                        i25 = iArr3[0];
                        if (i25 != i24 || i25 == 4) {
                            int q8 = eVar4.q() + i23;
                            eVar4.f8753d.i.d(q8);
                            eVar4.f8753d.f9165e.d(q8 - i23);
                            eVar2.g();
                            i26 = iArr3[1];
                            if (i26 != 1 || i26 == 4) {
                                int k7 = eVar4.k() + s5;
                                eVar4.f8755e.i.d(k7);
                                eVar4.f8755e.f9165e.d(k7 - s5);
                            }
                            eVar2.g();
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        size = arrayList3.size();
                        i27 = 0;
                        while (i27 < size) {
                            Object obj3 = arrayList3.get(i27);
                            i27++;
                            z2.o oVar = (z2.o) obj3;
                            if (oVar.f9162b != eVar4 || oVar.f9167g) {
                                oVar.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i28 = 0;
                        while (i28 < size2) {
                            Object obj4 = arrayList3.get(i28);
                            i28++;
                            z2.o oVar2 = (z2.o) obj4;
                            if (z10 || oVar2.f9162b != eVar4) {
                                if (!oVar2.f9168h.f9145j || ((!oVar2.i.f9145j && !(oVar2 instanceof z2.i)) || (!oVar2.f9165e.f9145j && !(oVar2 instanceof z2.c) && !(oVar2 instanceof z2.i)))) {
                                    z8 = false;
                                    break;
                                }
                            }
                        }
                        z8 = true;
                        eVar4.M(j7);
                        eVar4.N(j8);
                        i15 = 2;
                        i21 = 1073741824;
                    }
                } else {
                    i23 = r7;
                }
                i24 = 1;
                i25 = iArr3[0];
                if (i25 != i24) {
                }
                int q82 = eVar4.q() + i23;
                eVar4.f8753d.i.d(q82);
                eVar4.f8753d.f9165e.d(q82 - i23);
                eVar2.g();
                i26 = iArr3[1];
                if (i26 != 1) {
                }
                int k72 = eVar4.k() + s5;
                eVar4.f8755e.i.d(k72);
                eVar4.f8755e.f9165e.d(k72 - s5);
                eVar2.g();
                z10 = true;
                size = arrayList3.size();
                i27 = 0;
                while (i27 < size) {
                }
                size2 = arrayList3.size();
                i28 = 0;
                while (i28 < size2) {
                }
                z8 = true;
                eVar4.M(j7);
                eVar4.N(j8);
                i15 = 2;
                i21 = 1073741824;
            } else {
                z7 = z14;
                arrayList = arrayList2;
                fVar = fVar5;
                e eVar5 = eVar2.f9129a;
                if (eVar2.f9130b) {
                    ArrayList arrayList5 = eVar5.f8788q0;
                    int size8 = arrayList5.size();
                    int i44 = 0;
                    while (i44 < size8) {
                        Object obj5 = arrayList5.get(i44);
                        i44++;
                        d dVar3 = (d) obj5;
                        dVar3.h();
                        dVar3.f8747a = false;
                        k kVar2 = dVar3.f8753d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.f9165e.f9145j = false;
                        kVar2.f9167g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f8755e;
                        mVar2.f9165e.f9145j = false;
                        mVar2.f9167g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i20 = 0;
                    eVar5.h();
                    eVar5.f8747a = false;
                    k kVar3 = eVar5.f8753d;
                    kVar3.f9165e.f9145j = false;
                    kVar3.f9167g = false;
                    kVar3.n();
                    m mVar3 = eVar5.f8755e;
                    mVar3.f9165e.f9145j = false;
                    mVar3.f9167g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i20 = 0;
                }
                eVar2.b(eVar2.f9132d);
                eVar5.Y = i20;
                eVar5.Z = i20;
                eVar5.f8753d.f9168h.d(i20);
                eVar5.f8755e.f9168h.d(i20);
                i21 = 1073741824;
                if (mode == 1073741824) {
                    z8 = eVar.T(i20, c9);
                    i15 = 1;
                } else {
                    i15 = 0;
                    z8 = true;
                }
                if (mode2 == 1073741824) {
                    z8 &= eVar.T(1, c9);
                    i15++;
                }
            }
            if (z8) {
                eVar.P(mode == i21, mode2 == i21);
            }
        } else {
            z7 = z14;
            arrayList = arrayList2;
            fVar = fVar5;
            i15 = 0;
            z8 = false;
        }
        if (z8 && i15 == 2) {
            return;
        }
        int i45 = eVar.D0;
        if (i13 > 0) {
            int size9 = eVar.f8788q0.size();
            boolean W = eVar.W(64);
            f fVar6 = eVar.f8792u0;
            for (int i46 = 0; i46 < size9; i46++) {
                d dVar4 = (d) eVar.f8788q0.get(i46);
                if (!(dVar4 instanceof y2.h) && !(dVar4 instanceof a) && !dVar4.F && (!W || (kVar = dVar4.f8753d) == null || (mVar = dVar4.f8755e) == null || !kVar.f9165e.f9145j || !mVar.f9165e.f9145j)) {
                    int j9 = dVar4.j(0);
                    int j10 = dVar4.j(1);
                    boolean z15 = j9 == 3 && dVar4.f8779r != 1 && j10 == 3 && dVar4.f8780s != 1;
                    if (!z15 && eVar.W(1) && !(dVar4 instanceof y2.g)) {
                        if (j9 == 3 && dVar4.f8779r == 0 && j10 != 3 && !dVar4.x()) {
                            z15 = true;
                        }
                        if (j10 == 3 && dVar4.f8780s == 0 && j9 != 3 && !dVar4.x()) {
                            z15 = true;
                        }
                        if ((j9 == 3 || j10 == 3) && dVar4.W > 0.0f) {
                            z15 = true;
                        }
                    }
                    if (!z15) {
                        g1Var.C(0, fVar6, dVar4);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f1121a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f572e;
            for (int i47 = 0; i47 < childCount2; i47++) {
                constraintLayout.getChildAt(i47);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i48 = 0; i48 < size10; i48++) {
                    ((c) arrayList7.get(i48)).getClass();
                }
            }
        }
        g1Var.Q(eVar);
        int size11 = arrayList.size();
        if (i13 > 0) {
            g1Var.N(eVar, 0, q7, k3);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.f8777p0;
            boolean z16 = iArr4[0] == 2;
            boolean z17 = iArr4[1] == 2;
            int max7 = Math.max(eVar.q(), eVar3.f8750b0);
            int max8 = Math.max(eVar.k(), eVar3.f8752c0);
            int i49 = 0;
            boolean z18 = false;
            while (i49 < size11) {
                ArrayList arrayList8 = arrayList;
                d dVar5 = (d) arrayList8.get(i49);
                if (dVar5 instanceof y2.g) {
                    int q9 = dVar5.q();
                    int k8 = dVar5.k();
                    z9 = z17;
                    i19 = i49;
                    fVar3 = fVar;
                    boolean C = z18 | g1Var.C(1, fVar3, dVar5);
                    int q10 = dVar5.q();
                    boolean z19 = C;
                    int k9 = dVar5.k();
                    if (q10 != q9) {
                        dVar5.O(q10);
                        if (z16 && dVar5.r() + dVar5.U > max7) {
                            max7 = Math.max(max7, dVar5.i(4).e() + dVar5.r() + dVar5.U);
                        }
                        z19 = true;
                    }
                    if (k9 != k8) {
                        dVar5.L(k9);
                        if (z9 && dVar5.s() + dVar5.V > max8) {
                            max8 = Math.max(max8, dVar5.i(5).e() + dVar5.s() + dVar5.V);
                        }
                        z19 = true;
                    }
                    z18 = z19 | ((y2.g) dVar5).f8823y0;
                } else {
                    z9 = z17;
                    i19 = i49;
                    fVar3 = fVar;
                }
                i49 = i19 + 1;
                fVar = fVar3;
                arrayList = arrayList8;
                z17 = z9;
            }
            boolean z20 = z17;
            ArrayList arrayList9 = arrayList;
            int i50 = 0;
            while (true) {
                f fVar7 = fVar;
                if (i50 >= 2) {
                    break;
                }
                int i51 = 0;
                while (i51 < size11) {
                    d dVar6 = (d) arrayList9.get(i51);
                    if ((!(dVar6 instanceof y2.i) || (dVar6 instanceof y2.g)) && !(dVar6 instanceof y2.h)) {
                        i16 = size11;
                        if (dVar6.f8760g0 != 8 && ((!z7 || !dVar6.f8753d.f9165e.f9145j || !dVar6.f8755e.f9165e.f9145j) && !(dVar6 instanceof y2.g))) {
                            int q11 = dVar6.q();
                            int k10 = dVar6.k();
                            i17 = i51;
                            int i52 = dVar6.f8748a0;
                            z18 |= g1Var.C(i50 == 1 ? 2 : 1, fVar7, dVar6);
                            fVar2 = fVar7;
                            int q12 = dVar6.q();
                            i18 = i50;
                            int k11 = dVar6.k();
                            if (q12 != q11) {
                                dVar6.O(q12);
                                if (z16 && dVar6.r() + dVar6.U > max7) {
                                    max7 = Math.max(max7, dVar6.i(4).e() + dVar6.r() + dVar6.U);
                                }
                                z18 = true;
                            }
                            if (k11 != k10) {
                                dVar6.L(k11);
                                if (z20 && dVar6.s() + dVar6.V > max8) {
                                    max8 = Math.max(max8, dVar6.i(5).e() + dVar6.s() + dVar6.V);
                                }
                                z18 = true;
                            }
                            if (dVar6.E && i52 != dVar6.f8748a0) {
                                z18 = true;
                            }
                            i51 = i17 + 1;
                            size11 = i16;
                            fVar7 = fVar2;
                            i50 = i18;
                        }
                    } else {
                        i16 = size11;
                    }
                    fVar2 = fVar7;
                    i18 = i50;
                    i17 = i51;
                    i51 = i17 + 1;
                    size11 = i16;
                    fVar7 = fVar2;
                    i50 = i18;
                }
                int i53 = size11;
                fVar = fVar7;
                int i54 = i50;
                if (!z18) {
                    break;
                }
                int i55 = i54 + 1;
                g1Var.N(eVar, i55, q7, k3);
                i50 = i55;
                size11 = i53;
                z18 = false;
            }
        }
        eVar.D0 = i45;
        w2.c.f7845q = eVar.W(512);
    }

    public final void l(d dVar, b3.e eVar, SparseArray sparseArray, int i, int i8) {
        View view = (View) this.f571d.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof b3.e)) {
            return;
        }
        eVar.f1085c0 = true;
        if (i8 == 6) {
            b3.e eVar2 = (b3.e) view.getLayoutParams();
            eVar2.f1085c0 = true;
            eVar2.f1110p0.E = true;
        }
        dVar.i(6).b(dVar2.i(i8), eVar.D, eVar.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b3.e eVar = (b3.e) childAt.getLayoutParams();
            d dVar = eVar.f1110p0;
            if (childAt.getVisibility() != 8 || eVar.f1087d0 || eVar.f1089e0 || isInEditMode) {
                int r7 = dVar.r();
                int s5 = dVar.s();
                childAt.layout(r7, s5, dVar.q() + r7, dVar.k() + s5);
            }
        }
        ArrayList arrayList = this.f572e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((c) arrayList.get(i12)).getClass();
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
    public void onMeasure(int i, int i8) {
        boolean z3;
        int i9;
        boolean z7;
        d dVar;
        int i10;
        d dVar2;
        int i11;
        int i12;
        int i13;
        d dVar3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar4;
        int i19;
        int i20;
        d dVar5;
        b3.e eVar;
        int i21;
        d dVar6;
        float f6;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float parseFloat;
        int i27;
        char c8;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f8;
        int i28;
        String resourceName;
        int id;
        d dVar7;
        ConstraintLayout constraintLayout = this;
        boolean z8 = constraintLayout.f577k;
        constraintLayout.f577k = z8;
        int i29 = 1;
        int i30 = 0;
        if (!z8) {
            int childCount = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                    constraintLayout.f577k = true;
                    break;
                }
                i31++;
            }
        }
        boolean z9 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.f573f;
        eVar2.f8793v0 = z9;
        if (constraintLayout.f577k) {
            constraintLayout.f577k = false;
            int childCount2 = constraintLayout.getChildCount();
            int i32 = 0;
            while (true) {
                if (i32 >= childCount2) {
                    z3 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i32++;
                }
            }
            if (z3) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i33 = 0; i33 < childCount3; i33++) {
                    d h8 = constraintLayout.h(constraintLayout.getChildAt(i33));
                    if (h8 != null) {
                        h8.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f571d;
                if (isInEditMode) {
                    int i34 = 0;
                    while (i34 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i34);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i28 = i29;
                                try {
                                    if (constraintLayout.f582p == null) {
                                        constraintLayout.f582p = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.f582p.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i28 = i29;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i28 = i29;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                dVar7 = view == null ? null : ((b3.e) view.getLayoutParams()).f1110p0;
                                dVar7.f8762h0 = resourceName;
                                i34++;
                                i29 = i28;
                            }
                        }
                        dVar7 = eVar2;
                        dVar7.f8762h0 = resourceName;
                        i34++;
                        i29 = i28;
                    }
                }
                int i35 = i29;
                if (constraintLayout.f581o != -1) {
                    for (int i36 = 0; i36 < childCount3; i36++) {
                        constraintLayout.getChildAt(i36).getId();
                    }
                }
                o oVar = constraintLayout.f579m;
                if (oVar != null) {
                    oVar.a(constraintLayout);
                }
                eVar2.f8788q0.clear();
                ArrayList arrayList3 = constraintLayout.f572e;
                int size = arrayList3.size();
                if (size > 0) {
                    int i37 = 0;
                    while (i37 < size) {
                        c cVar = (c) arrayList3.get(i37);
                        HashMap hashMap = cVar.f1078j;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f1077h);
                        }
                        y2.i iVar = cVar.f1076g;
                        if (iVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            iVar.f8832r0 = i30;
                            Arrays.fill(iVar.f8831q0, (Object) null);
                            int i38 = i30;
                            while (i38 < cVar.f1074e) {
                                int i39 = cVar.f1073d[i38];
                                View view2 = (View) sparseArray3.get(i39);
                                if (view2 != null || (f8 = cVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i39))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    cVar.f1073d[i38] = f8;
                                    hashMap.put(Integer.valueOf(f8), str);
                                    view2 = (View) sparseArray3.get(f8);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    y2.i iVar2 = cVar.f1076g;
                                    d h9 = constraintLayout.h(view3);
                                    iVar2.getClass();
                                    if (h9 != iVar2 && h9 != null) {
                                        int i40 = iVar2.f8832r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        d[] dVarArr = iVar2.f8831q0;
                                        if (i40 > dVarArr.length) {
                                            iVar2.f8831q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f8831q0;
                                        int i41 = iVar2.f8832r0;
                                        dVarArr2[i41] = h9;
                                        iVar2.f8832r0 = i41 + 1;
                                        i38++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i38++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            cVar.f1076g.S();
                        }
                        i37++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i30 = 0;
                    }
                }
                int i42 = 2;
                for (int i43 = 0; i43 < childCount3; i43++) {
                    constraintLayout.getChildAt(i43);
                }
                SparseArray sparseArray4 = constraintLayout.f583q;
                sparseArray4.clear();
                sparseArray4.put(0, eVar2);
                sparseArray4.put(constraintLayout.getId(), eVar2);
                for (int i44 = 0; i44 < childCount3; i44++) {
                    View childAt2 = constraintLayout.getChildAt(i44);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i45 = 0;
                while (i45 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i45);
                    d h10 = constraintLayout.h(childAt3);
                    if (h10 != null) {
                        b3.e eVar3 = (b3.e) childAt3.getLayoutParams();
                        eVar2.f8788q0.add(h10);
                        d dVar8 = h10.T;
                        if (dVar8 != null) {
                            ((e) dVar8).f8788q0.remove(h10);
                            h10.C();
                        }
                        h10.T = eVar2;
                        eVar3.a();
                        h10.f8760g0 = childAt3.getVisibility();
                        h10.f8758f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h10, eVar2.f8793v0);
                        }
                        if (eVar3.f1087d0) {
                            y2.h hVar = (y2.h) h10;
                            int i46 = eVar3.f1104m0;
                            int i47 = eVar3.f1106n0;
                            float f9 = eVar3.f1108o0;
                            if (f9 == -1.0f) {
                                c8 = 65535;
                                if (i46 != -1) {
                                    if (i46 > -1) {
                                        hVar.f8825q0 = -1.0f;
                                        hVar.f8826r0 = i46;
                                        hVar.f8827s0 = -1;
                                    }
                                } else if (i47 != -1 && i47 > -1) {
                                    hVar.f8825q0 = -1.0f;
                                    hVar.f8826r0 = -1;
                                    hVar.f8827s0 = i47;
                                }
                                i9 = i45;
                                z7 = z3;
                                i24 = i42;
                            } else if (f9 > -1.0f) {
                                hVar.f8825q0 = f9;
                                c8 = 65535;
                                hVar.f8826r0 = -1;
                                hVar.f8827s0 = -1;
                                i9 = i45;
                                z7 = z3;
                                i24 = i42;
                            }
                        } else {
                            int i48 = eVar3.f1091f0;
                            int i49 = eVar3.f1093g0;
                            int i50 = eVar3.f1095h0;
                            int i51 = eVar3.f1096i0;
                            int i52 = eVar3.f1098j0;
                            int i53 = eVar3.f1100k0;
                            i9 = i45;
                            float f10 = eVar3.f1102l0;
                            int i54 = eVar3.f1109p;
                            z7 = z3;
                            if (i54 != -1) {
                                d dVar9 = (d) sparseArray4.get(i54);
                                if (dVar9 != null) {
                                    float f11 = eVar3.f1112r;
                                    h10.v(7, 7, eVar3.f1111q, 0, dVar9);
                                    h10.D = f11;
                                }
                                constraintLayout = this;
                                dVar6 = h10;
                                eVar = eVar3;
                                i14 = 4;
                                i13 = 2;
                            } else {
                                if (i48 != -1) {
                                    d dVar10 = (d) sparseArray4.get(i48);
                                    if (dVar10 != null) {
                                        dVar = h10;
                                        i10 = 2;
                                        dVar.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i52, dVar10);
                                    } else {
                                        dVar = h10;
                                        i10 = 2;
                                    }
                                } else {
                                    dVar = h10;
                                    i10 = 2;
                                    if (i49 != -1 && (dVar2 = (d) sparseArray4.get(i49)) != null) {
                                        dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i52, dVar2);
                                        i11 = 2;
                                        i12 = 4;
                                        if (i50 == -1) {
                                            d dVar11 = (d) sparseArray4.get(i50);
                                            if (dVar11 != null) {
                                                dVar.v(i12, i11, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i53, dVar11);
                                            }
                                            i13 = i11;
                                        } else {
                                            i13 = i11;
                                            if (i51 != -1 && (dVar3 = (d) sparseArray4.get(i51)) != null) {
                                                dVar.v(i12, i12, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i53, dVar3);
                                            }
                                        }
                                        i14 = i12;
                                        i15 = eVar3.i;
                                        if (i15 == -1) {
                                            d dVar12 = (d) sparseArray4.get(i15);
                                            if (dVar12 != null) {
                                                i22 = 3;
                                                dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f1118x, dVar12);
                                            } else {
                                                i22 = 3;
                                            }
                                            i17 = i22;
                                            i18 = 5;
                                            i16 = -1;
                                        } else {
                                            int i55 = eVar3.f1097j;
                                            i16 = -1;
                                            if (i55 == -1 || (dVar4 = (d) sparseArray4.get(i55)) == null) {
                                                i17 = 3;
                                                i18 = 5;
                                            } else {
                                                dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f1118x, dVar4);
                                                i17 = 3;
                                                i18 = 5;
                                            }
                                        }
                                        i19 = eVar3.f1099k;
                                        if (i19 == i16) {
                                            d dVar13 = (d) sparseArray4.get(i19);
                                            if (dVar13 != null) {
                                                int i56 = i17;
                                                dVar.v(i18, i56, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f1120z, dVar13);
                                                i20 = i56;
                                            } else {
                                                i20 = i17;
                                            }
                                        } else {
                                            i20 = i17;
                                            int i57 = eVar3.f1101l;
                                            if (i57 != i16 && (dVar5 = (d) sparseArray4.get(i57)) != null) {
                                                dVar.v(i18, i18, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f1120z, dVar5);
                                            }
                                        }
                                        eVar = eVar3;
                                        i21 = eVar.f1103m;
                                        if (i21 == -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray4, i21, 6);
                                        } else {
                                            int i58 = eVar.f1105n;
                                            if (i58 != -1) {
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                constraintLayout.l(dVar6, eVar, sparseArray4, i58, i20);
                                            } else {
                                                int i59 = eVar.f1107o;
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                int i60 = i18;
                                                if (i59 != -1) {
                                                    constraintLayout.l(dVar6, eVar, sparseArray4, i59, i60);
                                                }
                                                if (f10 >= 0.0f) {
                                                    dVar6.f8754d0 = f10;
                                                }
                                                f6 = eVar.F;
                                                if (f6 >= 0.0f) {
                                                    dVar6.f8756e0 = f6;
                                                }
                                            }
                                        }
                                        if (f10 >= 0.0f) {
                                        }
                                        f6 = eVar.F;
                                        if (f6 >= 0.0f) {
                                        }
                                    }
                                }
                                i11 = i10;
                                i12 = 4;
                                if (i50 == -1) {
                                }
                                i14 = i12;
                                i15 = eVar3.i;
                                if (i15 == -1) {
                                }
                                i19 = eVar3.f1099k;
                                if (i19 == i16) {
                                }
                                eVar = eVar3;
                                i21 = eVar.f1103m;
                                if (i21 == -1) {
                                }
                                if (f10 >= 0.0f) {
                                }
                                f6 = eVar.F;
                                if (f6 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i27 = eVar.T) != -1 || eVar.U != -1)) {
                                int i61 = eVar.U;
                                dVar6.Y = i27;
                                dVar6.Z = i61;
                            }
                            if (eVar.f1081a0) {
                                dVar6.M(i35);
                                dVar6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar6.M(i42);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.W) {
                                    dVar6.M(3);
                                } else {
                                    dVar6.M(4);
                                }
                                dVar6.i(i13).f8745g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i14).f8745g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.M(3);
                                dVar6.O(0);
                            }
                            if (eVar.f1083b0) {
                                i23 = -1;
                                dVar6.N(1);
                                dVar6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar6.N(2);
                                }
                            } else {
                                i23 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.X) {
                                        dVar6.N(3);
                                    } else {
                                        dVar6.N(4);
                                    }
                                    dVar6.i(3).f8745g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).f8745g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
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
                                    i25 = i23;
                                    i26 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i25 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i23;
                                    i26 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i26);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i26, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i25 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    dVar6.W = parseFloat;
                                    dVar6.X = i25;
                                }
                            }
                            float f12 = eVar.H;
                            float[] fArr = dVar6.f8767k0;
                            fArr[0] = f12;
                            i35 = 1;
                            fArr[1] = eVar.I;
                            dVar6.f8763i0 = eVar.J;
                            dVar6.f8765j0 = eVar.K;
                            int i62 = eVar.Z;
                            if (i62 >= 0 && i62 <= 3) {
                                dVar6.f8778q = i62;
                            }
                            int i63 = eVar.L;
                            int i64 = eVar.N;
                            int i65 = eVar.P;
                            float f13 = eVar.R;
                            dVar6.f8779r = i63;
                            dVar6.f8782u = i64;
                            if (i65 == Integer.MAX_VALUE) {
                                i65 = 0;
                            }
                            dVar6.f8783v = i65;
                            dVar6.f8784w = f13;
                            if (f13 > 0.0f && f13 < 1.0f && i63 == 0) {
                                dVar6.f8779r = 2;
                            }
                            int i66 = eVar.M;
                            int i67 = eVar.O;
                            int i68 = eVar.Q;
                            float f14 = eVar.S;
                            dVar6.f8780s = i66;
                            dVar6.f8785x = i67;
                            if (i68 == Integer.MAX_VALUE) {
                                i68 = 0;
                            }
                            dVar6.f8786y = i68;
                            dVar6.f8787z = f14;
                            if (f14 <= 0.0f || f14 >= 1.0f || i66 != 0) {
                                i24 = 2;
                            } else {
                                i24 = 2;
                                dVar6.f8780s = 2;
                            }
                        }
                        i45 = i9 + 1;
                        i42 = i24;
                        z3 = z7;
                    }
                    i9 = i45;
                    z7 = z3;
                    i24 = i42;
                    i45 = i9 + 1;
                    i42 = i24;
                    z3 = z7;
                }
            }
            if (z3) {
                eVar2.f8789r0.Q(eVar2);
            }
        }
        eVar2.f8794w0.getClass();
        constraintLayout.k(eVar2, constraintLayout.f578l, i, i8);
        int q4 = eVar2.q();
        int k3 = eVar2.k();
        boolean z10 = eVar2.E0;
        boolean z11 = eVar2.F0;
        f fVar = constraintLayout.f584r;
        int i69 = fVar.f1125e;
        int resolveSizeAndState = View.resolveSizeAndState(q4 + fVar.f1124d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k3 + i69, i8, 0) & 16777215;
        int min = Math.min(constraintLayout.i, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f576j, resolveSizeAndState2);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h8 = h(view);
        if ((view instanceof q) && !(h8 instanceof y2.h)) {
            b3.e eVar = (b3.e) view.getLayoutParams();
            y2.h hVar = new y2.h();
            eVar.f1110p0 = hVar;
            eVar.f1087d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((b3.e) view.getLayoutParams()).f1089e0 = true;
            ArrayList arrayList = this.f572e;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f571d.put(view.getId(), view);
        this.f577k = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f571d.remove(view.getId());
        d h8 = h(view);
        this.f573f.f8788q0.remove(h8);
        h8.C();
        this.f572e.remove(view);
        this.f577k = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f577k = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.f579m = oVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f571d;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f576j) {
            return;
        }
        this.f576j = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f575h) {
            return;
        }
        this.f575h = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f574g) {
            return;
        }
        this.f574g = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        a0 a0Var = this.f580n;
        if (a0Var != null) {
            a0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f578l = i;
        e eVar = this.f573f;
        eVar.D0 = i;
        w2.c.f7845q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f571d = new SparseArray();
        this.f572e = new ArrayList(4);
        this.f573f = new e();
        this.f574g = 0;
        this.f575h = 0;
        this.i = Integer.MAX_VALUE;
        this.f576j = Integer.MAX_VALUE;
        this.f577k = true;
        this.f578l = 257;
        this.f579m = null;
        this.f580n = null;
        this.f581o = -1;
        this.f582p = new HashMap();
        this.f583q = new SparseArray();
        this.f584r = new f(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b3.e eVar = new b3.e(layoutParams);
        eVar.f1080a = -1;
        eVar.f1082b = -1;
        eVar.f1084c = -1.0f;
        eVar.f1086d = true;
        eVar.f1088e = -1;
        eVar.f1090f = -1;
        eVar.f1092g = -1;
        eVar.f1094h = -1;
        eVar.i = -1;
        eVar.f1097j = -1;
        eVar.f1099k = -1;
        eVar.f1101l = -1;
        eVar.f1103m = -1;
        eVar.f1105n = -1;
        eVar.f1107o = -1;
        eVar.f1109p = -1;
        eVar.f1111q = 0;
        eVar.f1112r = 0.0f;
        eVar.f1113s = -1;
        eVar.f1114t = -1;
        eVar.f1115u = -1;
        eVar.f1116v = -1;
        eVar.f1117w = Integer.MIN_VALUE;
        eVar.f1118x = Integer.MIN_VALUE;
        eVar.f1119y = Integer.MIN_VALUE;
        eVar.f1120z = Integer.MIN_VALUE;
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
        eVar.f1081a0 = true;
        eVar.f1083b0 = true;
        eVar.f1085c0 = false;
        eVar.f1087d0 = false;
        eVar.f1089e0 = false;
        eVar.f1091f0 = -1;
        eVar.f1093g0 = -1;
        eVar.f1095h0 = -1;
        eVar.f1096i0 = -1;
        eVar.f1098j0 = Integer.MIN_VALUE;
        eVar.f1100k0 = Integer.MIN_VALUE;
        eVar.f1102l0 = 0.5f;
        eVar.f1110p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof b3.e)) {
            return eVar;
        }
        b3.e eVar2 = (b3.e) layoutParams;
        eVar.f1080a = eVar2.f1080a;
        eVar.f1082b = eVar2.f1082b;
        eVar.f1084c = eVar2.f1084c;
        eVar.f1086d = eVar2.f1086d;
        eVar.f1088e = eVar2.f1088e;
        eVar.f1090f = eVar2.f1090f;
        eVar.f1092g = eVar2.f1092g;
        eVar.f1094h = eVar2.f1094h;
        eVar.i = eVar2.i;
        eVar.f1097j = eVar2.f1097j;
        eVar.f1099k = eVar2.f1099k;
        eVar.f1101l = eVar2.f1101l;
        eVar.f1103m = eVar2.f1103m;
        eVar.f1105n = eVar2.f1105n;
        eVar.f1107o = eVar2.f1107o;
        eVar.f1109p = eVar2.f1109p;
        eVar.f1111q = eVar2.f1111q;
        eVar.f1112r = eVar2.f1112r;
        eVar.f1113s = eVar2.f1113s;
        eVar.f1114t = eVar2.f1114t;
        eVar.f1115u = eVar2.f1115u;
        eVar.f1116v = eVar2.f1116v;
        eVar.f1117w = eVar2.f1117w;
        eVar.f1118x = eVar2.f1118x;
        eVar.f1119y = eVar2.f1119y;
        eVar.f1120z = eVar2.f1120z;
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
        eVar.f1081a0 = eVar2.f1081a0;
        eVar.f1083b0 = eVar2.f1083b0;
        eVar.f1085c0 = eVar2.f1085c0;
        eVar.f1087d0 = eVar2.f1087d0;
        eVar.f1091f0 = eVar2.f1091f0;
        eVar.f1093g0 = eVar2.f1093g0;
        eVar.f1095h0 = eVar2.f1095h0;
        eVar.f1096i0 = eVar2.f1096i0;
        eVar.f1098j0 = eVar2.f1098j0;
        eVar.f1100k0 = eVar2.f1100k0;
        eVar.f1102l0 = eVar2.f1102l0;
        eVar.Y = eVar2.Y;
        eVar.Z = eVar2.Z;
        eVar.f1110p0 = eVar2.f1110p0;
        return eVar;
    }
}

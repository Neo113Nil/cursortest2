package androidx.constraintlayout.widget;

import a4.b0;
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
import y.r;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static r f367u;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f368f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f369g;
    public final e h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f370j;

    /* renamed from: k, reason: collision with root package name */
    public int f371k;

    /* renamed from: l, reason: collision with root package name */
    public int f372l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f373m;

    /* renamed from: n, reason: collision with root package name */
    public int f374n;

    /* renamed from: o, reason: collision with root package name */
    public n f375o;

    /* renamed from: p, reason: collision with root package name */
    public q f376p;

    /* renamed from: q, reason: collision with root package name */
    public int f377q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f378r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f379s;

    /* renamed from: t, reason: collision with root package name */
    public final f f380t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f368f = new SparseArray();
        this.f369g = new ArrayList(4);
        this.h = new e();
        this.i = 0;
        this.f370j = 0;
        this.f371k = Integer.MAX_VALUE;
        this.f372l = Integer.MAX_VALUE;
        this.f373m = true;
        this.f374n = 257;
        this.f375o = null;
        this.f376p = null;
        this.f377q = -1;
        this.f378r = new HashMap();
        this.f379s = new SparseArray();
        this.f380t = new f(this, this);
        i(attributeSet, 0);
    }

    public static y.e g() {
        y.e eVar = new y.e(-2, -2);
        eVar.f3962a = -1;
        eVar.f3964b = -1;
        eVar.f3966c = -1.0f;
        eVar.d = true;
        eVar.f3968e = -1;
        eVar.f3970f = -1;
        eVar.f3972g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.f3975j = -1;
        eVar.f3977k = -1;
        eVar.f3979l = -1;
        eVar.f3981m = -1;
        eVar.f3983n = -1;
        eVar.f3985o = -1;
        eVar.f3987p = -1;
        eVar.f3989q = 0;
        eVar.f3990r = 0.0f;
        eVar.f3991s = -1;
        eVar.f3992t = -1;
        eVar.f3993u = -1;
        eVar.f3994v = -1;
        eVar.f3995w = Integer.MIN_VALUE;
        eVar.f3996x = Integer.MIN_VALUE;
        eVar.f3997y = Integer.MIN_VALUE;
        eVar.f3998z = Integer.MIN_VALUE;
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
        eVar.f3963a0 = true;
        eVar.f3965b0 = true;
        eVar.f3967c0 = false;
        eVar.d0 = false;
        eVar.f3969e0 = false;
        eVar.f3971f0 = -1;
        eVar.f3973g0 = -1;
        eVar.f3974h0 = -1;
        eVar.i0 = -1;
        eVar.f3976j0 = Integer.MIN_VALUE;
        eVar.f3978k0 = Integer.MIN_VALUE;
        eVar.f3980l0 = 0.5f;
        eVar.f3988p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static r getSharedValues() {
        if (f367u == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            f367u = rVar;
        }
        return f367u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f369g;
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
                        float f5 = i5;
                        float f6 = i6;
                        float f7 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f5, f6, f7, f6, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f7, f6, f7, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f5, f6, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f5, f6, f7, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f7, f6, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f373m = true;
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
        eVar.f3962a = -1;
        eVar.f3964b = -1;
        eVar.f3966c = -1.0f;
        eVar.d = true;
        eVar.f3968e = -1;
        eVar.f3970f = -1;
        eVar.f3972g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.f3975j = -1;
        eVar.f3977k = -1;
        eVar.f3979l = -1;
        eVar.f3981m = -1;
        eVar.f3983n = -1;
        eVar.f3985o = -1;
        eVar.f3987p = -1;
        eVar.f3989q = 0;
        eVar.f3990r = 0.0f;
        eVar.f3991s = -1;
        eVar.f3992t = -1;
        eVar.f3993u = -1;
        eVar.f3994v = -1;
        eVar.f3995w = Integer.MIN_VALUE;
        eVar.f3996x = Integer.MIN_VALUE;
        eVar.f3997y = Integer.MIN_VALUE;
        eVar.f3998z = Integer.MIN_VALUE;
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
        eVar.f3963a0 = true;
        eVar.f3965b0 = true;
        eVar.f3967c0 = false;
        eVar.d0 = false;
        eVar.f3969e0 = false;
        eVar.f3971f0 = -1;
        eVar.f3973g0 = -1;
        eVar.f3974h0 = -1;
        eVar.i0 = -1;
        eVar.f3976j0 = Integer.MIN_VALUE;
        eVar.f3978k0 = Integer.MIN_VALUE;
        eVar.f3980l0 = 0.5f;
        eVar.f3988p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.q.f4087b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i4 = y.d.f3961a.get(index);
            switch (i4) {
                case 1:
                    eVar.V = obtainStyledAttributes.getInt(index, eVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f3987p);
                    eVar.f3987p = resourceId;
                    if (resourceId == -1) {
                        eVar.f3987p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f3989q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3989q);
                    break;
                case 4:
                    float f5 = obtainStyledAttributes.getFloat(index, eVar.f3990r) % 360.0f;
                    eVar.f3990r = f5;
                    if (f5 < 0.0f) {
                        eVar.f3990r = (360.0f - f5) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f3962a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f3962a);
                    break;
                case 6:
                    eVar.f3964b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f3964b);
                    break;
                case 7:
                    eVar.f3966c = obtainStyledAttributes.getFloat(index, eVar.f3966c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f3968e);
                    eVar.f3968e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f3968e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f3970f);
                    eVar.f3970f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f3970f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f3972g);
                    eVar.f3972g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f3972g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.h);
                    eVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.h = obtainStyledAttributes.getInt(index, -1);
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
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f3975j);
                    eVar.f3975j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f3975j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f3977k);
                    eVar.f3977k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f3977k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f3979l);
                    eVar.f3979l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f3979l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f3981m);
                    eVar.f3981m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f3981m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f3991s);
                    eVar.f3991s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f3991s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f3992t);
                    eVar.f3992t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f3992t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f3993u);
                    eVar.f3993u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f3993u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f3994v);
                    eVar.f3994v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f3994v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f3995w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3995w);
                    break;
                case 22:
                    eVar.f3996x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3996x);
                    break;
                case 23:
                    eVar.f3997y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3997y);
                    break;
                case 24:
                    eVar.f3998z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3998z);
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
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f3983n);
                            eVar.f3983n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f3983n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f3985o);
                            eVar.f3985o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f3985o = obtainStyledAttributes.getInt(index, -1);
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
        return this.f372l;
    }

    public int getMaxWidth() {
        return this.f371k;
    }

    public int getMinHeight() {
        return this.f370j;
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
        e eVar = this.h;
        if (eVar.f3624j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f3624j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f3624j = "parent";
            }
        }
        if (eVar.f3623h0 == null) {
            eVar.f3623h0 = eVar.f3624j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f3623h0);
        }
        ArrayList arrayList = eVar.f3648q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) obj;
            View view = dVar.f3620f0;
            if (view != null) {
                if (dVar.f3624j == null && (id = view.getId()) != -1) {
                    dVar.f3624j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f3623h0 == null) {
                    dVar.f3623h0 = dVar.f3624j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f3623h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof y.e) {
            return ((y.e) view.getLayoutParams()).f3988p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof y.e) {
            return ((y.e) view.getLayoutParams()).f3988p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.h;
        eVar.f3620f0 = this;
        f fVar = this.f380t;
        eVar.f3652u0 = fVar;
        eVar.f3650s0.f3748f = fVar;
        this.f368f.put(getId(), this);
        this.f375o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, y.q.f4087b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 17) {
                    this.f370j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f370j);
                } else if (index == 14) {
                    this.f371k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f371k);
                } else if (index == 15) {
                    this.f372l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f372l);
                } else if (index == 113) {
                    this.f374n = obtainStyledAttributes.getInt(index, this.f374n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f376p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f375o = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f375o = null;
                    }
                    this.f377q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f374n;
        t.c.f3358q = eVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        q qVar = new q(23, false);
        qVar.f466g = new SparseArray();
        qVar.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            b0 b0Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                qVar.F(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                b0 b0Var2 = new b0(context, xml);
                                ((SparseArray) qVar.f466g).put(b0Var2.f142a, b0Var2);
                                b0Var = b0Var2;
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
                                if (b0Var != null) {
                                    ((ArrayList) b0Var.f144c).add(gVar);
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
        this.f376p = qVar;
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
        char c5;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        ArrayList arrayList;
        f fVar;
        int i11;
        boolean z6;
        int i12;
        int i13;
        f fVar2;
        int i14;
        boolean z7;
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
        boolean z8;
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
        f fVar4 = this.f380t;
        fVar4.f4000b = max3;
        fVar4.f4001c = max4;
        fVar4.d = paddingWidth;
        fVar4.f4002e = i25;
        fVar4.f4003f = i4;
        fVar4.f4004g = i5;
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
        int i29 = fVar4.f4002e;
        int i30 = fVar4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i6 = 0;
                } else {
                    i6 = Math.min(this.f371k - i30, i27);
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
                i7 = mode2 != 1073741824 ? 0 : Math.min(this.f372l - i29, i28);
                i8 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f370j);
                i7 = max2;
                i8 = 2;
            } else {
                i7 = 0;
                i8 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f370j);
            i7 = max2;
            i8 = 2;
        } else {
            i7 = i28;
            i8 = 2;
        }
        int q4 = eVar.q();
        w.e eVar2 = eVar.f3650s0;
        int[] iArr = eVar.C;
        int i31 = i6;
        if (i31 == q4 && i7 == eVar.k()) {
            c5 = 1;
        } else {
            eVar2.f3746c = true;
            c5 = 1;
        }
        eVar.Y = 0;
        eVar.Z = 0;
        iArr[0] = this.f371k - i30;
        iArr[c5] = this.f372l - i29;
        eVar.f3614b0 = 0;
        eVar.f3616c0 = 0;
        eVar.M(i26);
        eVar.O(i31);
        eVar.N(i8);
        eVar.L(i7);
        int i32 = this.i - i30;
        if (i32 < 0) {
            eVar.f3614b0 = 0;
        } else {
            eVar.f3614b0 = i32;
        }
        int i33 = this.f370j - i29;
        if (i33 < 0) {
            eVar.f3616c0 = 0;
        } else {
            eVar.f3616c0 = i33;
        }
        eVar.f3655x0 = max5;
        eVar.f3656y0 = max3;
        t tVar = eVar.f3649r0;
        e eVar3 = (e) tVar.f474c;
        ArrayList arrayList2 = (ArrayList) tVar.f472a;
        f fVar5 = eVar.f3652u0;
        int size5 = eVar.f3648q0.size();
        int q5 = eVar.q();
        int k4 = eVar.k();
        boolean c6 = j.c(i, 128);
        boolean z9 = c6 || j.c(i, 64);
        if (z9) {
            int i34 = 0;
            while (i34 < size5) {
                boolean z10 = z9;
                d dVar = (d) eVar.f3648q0.get(i34);
                int i35 = i34;
                int[] iArr2 = dVar.f3637p0;
                i9 = size5;
                boolean z11 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.W > 0.0f;
                if ((dVar.x() && z11) || ((dVar.y() && z11) || (dVar instanceof v.g) || dVar.x() || dVar.y())) {
                    i10 = 1073741824;
                    z4 = false;
                    break;
                } else {
                    i34 = i35 + 1;
                    z9 = z10;
                    size5 = i9;
                }
            }
        }
        z4 = z9;
        i9 = size5;
        i10 = 1073741824;
        boolean z12 = z4 & ((mode == i10 && mode2 == i10) || c6);
        if (z12) {
            int min = Math.min(iArr[0], i27);
            int min2 = Math.min(iArr[1], i28);
            int i36 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.q() != min) {
                    eVar.O(min);
                    eVar2.f3745b = true;
                }
                i36 = 1073741824;
            }
            if (mode2 == i36 && eVar.k() != min2) {
                eVar.L(min2);
                eVar2.f3745b = true;
            }
            if (mode == i36 && mode2 == i36) {
                ArrayList arrayList3 = eVar2.f3747e;
                e eVar4 = eVar2.f3744a;
                if (eVar2.f3745b || eVar2.f3746c) {
                    ArrayList arrayList4 = eVar4.f3648q0;
                    int size6 = arrayList4.size();
                    z5 = z12;
                    int i37 = 0;
                    while (i37 < size6) {
                        Object obj = arrayList4.get(i37);
                        int i38 = i37 + 1;
                        d dVar2 = (d) obj;
                        dVar2.h();
                        dVar2.f3611a = false;
                        dVar2.d.n();
                        dVar2.f3617e.m();
                        arrayList4 = arrayList4;
                        i37 = i38;
                    }
                    eVar4.h();
                    i18 = 0;
                    eVar4.f3611a = false;
                    eVar4.d.n();
                    eVar4.f3617e.m();
                    eVar2.f3746c = false;
                } else {
                    z5 = z12;
                    i18 = 0;
                }
                eVar2.b(eVar2.d);
                eVar4.Y = i18;
                int[] iArr3 = eVar4.f3637p0;
                eVar4.Z = i18;
                int j2 = eVar4.j(i18);
                int j4 = eVar4.j(1);
                if (eVar2.f3745b) {
                    eVar2.c();
                }
                int r4 = eVar4.r();
                fVar = fVar5;
                int s3 = eVar4.s();
                arrayList = arrayList2;
                eVar4.d.h.d(r4);
                eVar4.f3617e.h.d(s3);
                eVar2.g();
                if (j2 == 2 || j4 == 2) {
                    if (c6) {
                        int size7 = arrayList3.size();
                        i19 = r4;
                        int i39 = 0;
                        while (true) {
                            if (i39 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i39);
                            i39++;
                            if (!((o) obj2).k()) {
                                c6 = false;
                                break;
                            }
                        }
                    } else {
                        i19 = r4;
                    }
                    if (c6 && j2 == 2) {
                        eVar4.M(1);
                        eVar4.O(eVar2.d(eVar4, 0));
                        eVar4.d.f3774e.d(eVar4.q());
                    }
                    if (c6 && j4 == 2) {
                        i20 = 1;
                        eVar4.N(1);
                        eVar4.L(eVar2.d(eVar4, 1));
                        eVar4.f3617e.f3774e.d(eVar4.k());
                        i21 = iArr3[0];
                        if (i21 != i20 || i21 == 4) {
                            int q6 = eVar4.q() + i19;
                            eVar4.d.i.d(q6);
                            eVar4.d.f3774e.d(q6 - i19);
                            eVar2.g();
                            i22 = iArr3[1];
                            if (i22 != 1 || i22 == 4) {
                                int k5 = eVar4.k() + s3;
                                eVar4.f3617e.i.d(k5);
                                eVar4.f3617e.f3774e.d(k5 - s3);
                            }
                            eVar2.g();
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        size = arrayList3.size();
                        i23 = 0;
                        while (i23 < size) {
                            Object obj3 = arrayList3.get(i23);
                            i23++;
                            o oVar = (o) obj3;
                            if (oVar.f3772b != eVar4 || oVar.f3776g) {
                                oVar.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i24 = 0;
                        while (i24 < size2) {
                            Object obj4 = arrayList3.get(i24);
                            i24++;
                            o oVar2 = (o) obj4;
                            if (z8 || oVar2.f3772b != eVar4) {
                                if (!oVar2.h.f3756j || ((!oVar2.i.f3756j && !(oVar2 instanceof i)) || (!oVar2.f3774e.f3756j && !(oVar2 instanceof w.c) && !(oVar2 instanceof i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        eVar4.M(j2);
                        eVar4.N(j4);
                        i11 = 2;
                        i17 = 1073741824;
                    }
                } else {
                    i19 = r4;
                }
                i20 = 1;
                i21 = iArr3[0];
                if (i21 != i20) {
                }
                int q62 = eVar4.q() + i19;
                eVar4.d.i.d(q62);
                eVar4.d.f3774e.d(q62 - i19);
                eVar2.g();
                i22 = iArr3[1];
                if (i22 != 1) {
                }
                int k52 = eVar4.k() + s3;
                eVar4.f3617e.i.d(k52);
                eVar4.f3617e.f3774e.d(k52 - s3);
                eVar2.g();
                z8 = true;
                size = arrayList3.size();
                i23 = 0;
                while (i23 < size) {
                }
                size2 = arrayList3.size();
                i24 = 0;
                while (i24 < size2) {
                }
                z6 = true;
                eVar4.M(j2);
                eVar4.N(j4);
                i11 = 2;
                i17 = 1073741824;
            } else {
                z5 = z12;
                arrayList = arrayList2;
                fVar = fVar5;
                e eVar5 = eVar2.f3744a;
                if (eVar2.f3745b) {
                    ArrayList arrayList5 = eVar5.f3648q0;
                    int size8 = arrayList5.size();
                    int i40 = 0;
                    while (i40 < size8) {
                        Object obj5 = arrayList5.get(i40);
                        i40++;
                        d dVar3 = (d) obj5;
                        dVar3.h();
                        dVar3.f3611a = false;
                        k kVar2 = dVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.f3774e.f3756j = false;
                        kVar2.f3776g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f3617e;
                        mVar2.f3774e.f3756j = false;
                        mVar2.f3776g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i16 = 0;
                    eVar5.h();
                    eVar5.f3611a = false;
                    k kVar3 = eVar5.d;
                    kVar3.f3774e.f3756j = false;
                    kVar3.f3776g = false;
                    kVar3.n();
                    m mVar3 = eVar5.f3617e;
                    mVar3.f3774e.f3756j = false;
                    mVar3.f3776g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i16 = 0;
                }
                eVar2.b(eVar2.d);
                eVar5.Y = i16;
                eVar5.Z = i16;
                eVar5.d.h.d(i16);
                eVar5.f3617e.h.d(i16);
                i17 = 1073741824;
                if (mode == 1073741824) {
                    z6 = eVar.T(i16, c6);
                    i11 = 1;
                } else {
                    i11 = 0;
                    z6 = true;
                }
                if (mode2 == 1073741824) {
                    z6 &= eVar.T(1, c6);
                    i11++;
                }
            }
            if (z6) {
                eVar.P(mode == i17, mode2 == i17);
            }
        } else {
            z5 = z12;
            arrayList = arrayList2;
            fVar = fVar5;
            i11 = 0;
            z6 = false;
        }
        if (z6 && i11 == 2) {
            return;
        }
        int i41 = eVar.D0;
        if (i9 > 0) {
            int size9 = eVar.f3648q0.size();
            boolean W = eVar.W(64);
            f fVar6 = eVar.f3652u0;
            for (int i42 = 0; i42 < size9; i42++) {
                d dVar4 = (d) eVar.f3648q0.get(i42);
                if (!(dVar4 instanceof h) && !(dVar4 instanceof a) && !dVar4.F && (!W || (kVar = dVar4.d) == null || (mVar = dVar4.f3617e) == null || !kVar.f3774e.f3756j || !mVar.f3774e.f3756j)) {
                    int j5 = dVar4.j(0);
                    int j6 = dVar4.j(1);
                    boolean z13 = j5 == 3 && dVar4.f3639r != 1 && j6 == 3 && dVar4.f3640s != 1;
                    if (!z13 && eVar.W(1) && !(dVar4 instanceof v.g)) {
                        if (j5 == 3 && dVar4.f3639r == 0 && j6 != 3 && !dVar4.x()) {
                            z13 = true;
                        }
                        if (j6 == 3 && dVar4.f3640s == 0 && j5 != 3 && !dVar4.x()) {
                            z13 = true;
                        }
                        if ((j5 == 3 || j6 == 3) && dVar4.W > 0.0f) {
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        tVar.h(0, dVar4, fVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f3999a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f369g;
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
        tVar.m(eVar);
        int size11 = arrayList.size();
        if (i9 > 0) {
            tVar.l(eVar, 0, q5, k4);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.f3637p0;
            boolean z14 = iArr4[0] == 2;
            boolean z15 = iArr4[1] == 2;
            int max7 = Math.max(eVar.q(), eVar3.f3614b0);
            int max8 = Math.max(eVar.k(), eVar3.f3616c0);
            int i45 = 0;
            boolean z16 = false;
            while (i45 < size11) {
                ArrayList arrayList8 = arrayList;
                d dVar5 = (d) arrayList8.get(i45);
                if (dVar5 instanceof v.g) {
                    int q7 = dVar5.q();
                    int k6 = dVar5.k();
                    z7 = z15;
                    i15 = i45;
                    fVar3 = fVar;
                    boolean h = z16 | tVar.h(1, dVar5, fVar3);
                    int q8 = dVar5.q();
                    boolean z17 = h;
                    int k7 = dVar5.k();
                    if (q8 != q7) {
                        dVar5.O(q8);
                        if (z14 && dVar5.r() + dVar5.U > max7) {
                            max7 = Math.max(max7, dVar5.i(4).e() + dVar5.r() + dVar5.U);
                        }
                        z17 = true;
                    }
                    if (k7 != k6) {
                        dVar5.L(k7);
                        if (z7 && dVar5.s() + dVar5.V > max8) {
                            max8 = Math.max(max8, dVar5.i(5).e() + dVar5.s() + dVar5.V);
                        }
                        z17 = true;
                    }
                    z16 = z17 | ((v.g) dVar5).f3681y0;
                } else {
                    z7 = z15;
                    i15 = i45;
                    fVar3 = fVar;
                }
                i45 = i15 + 1;
                fVar = fVar3;
                arrayList = arrayList8;
                z15 = z7;
            }
            boolean z18 = z15;
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
                        if (dVar6.f3622g0 != 8 && ((!z5 || !dVar6.d.f3774e.f3756j || !dVar6.f3617e.f3774e.f3756j) && !(dVar6 instanceof v.g))) {
                            int q9 = dVar6.q();
                            int k8 = dVar6.k();
                            i13 = i47;
                            int i48 = dVar6.f3612a0;
                            z16 |= tVar.h(i46 == 1 ? 2 : 1, dVar6, fVar7);
                            fVar2 = fVar7;
                            int q10 = dVar6.q();
                            i14 = i46;
                            int k9 = dVar6.k();
                            if (q10 != q9) {
                                dVar6.O(q10);
                                if (z14 && dVar6.r() + dVar6.U > max7) {
                                    max7 = Math.max(max7, dVar6.i(4).e() + dVar6.r() + dVar6.U);
                                }
                                z16 = true;
                            }
                            if (k9 != k8) {
                                dVar6.L(k9);
                                if (z18 && dVar6.s() + dVar6.V > max8) {
                                    max8 = Math.max(max8, dVar6.i(5).e() + dVar6.s() + dVar6.V);
                                }
                                z16 = true;
                            }
                            if (dVar6.E && i48 != dVar6.f3612a0) {
                                z16 = true;
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
                if (!z16) {
                    break;
                }
                int i51 = i50 + 1;
                tVar.l(eVar, i51, q5, k4);
                i46 = i51;
                size11 = i49;
                z16 = false;
            }
        }
        eVar.D0 = i41;
        t.c.f3358q = eVar.W(512);
    }

    public final void l(d dVar, y.e eVar, SparseArray sparseArray, int i, int i4) {
        View view = (View) this.f368f.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof y.e)) {
            return;
        }
        eVar.f3967c0 = true;
        if (i4 == 6) {
            y.e eVar2 = (y.e) view.getLayoutParams();
            eVar2.f3967c0 = true;
            eVar2.f3988p0.E = true;
        }
        dVar.i(6).b(dVar2.i(i4), eVar.D, eVar.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            y.e eVar = (y.e) childAt.getLayoutParams();
            d dVar = eVar.f3988p0;
            if (childAt.getVisibility() != 8 || eVar.d0 || eVar.f3969e0 || isInEditMode) {
                int r4 = dVar.r();
                int s3 = dVar.s();
                childAt.layout(r4, s3, dVar.q() + r4, dVar.k() + s3);
            }
        }
        ArrayList arrayList = this.f369g;
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
        boolean z4;
        int i5;
        boolean z5;
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
        float f5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float parseFloat;
        int i23;
        char c5;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f6;
        int i24;
        String resourceName;
        int id;
        d dVar7;
        ConstraintLayout constraintLayout = this;
        boolean z6 = constraintLayout.f373m;
        constraintLayout.f373m = z6;
        int i25 = 1;
        int i26 = 0;
        if (!z6) {
            int childCount = constraintLayout.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i27).isLayoutRequested()) {
                    constraintLayout.f373m = true;
                    break;
                }
                i27++;
            }
        }
        boolean z7 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.h;
        eVar2.f3653v0 = z7;
        if (constraintLayout.f373m) {
            constraintLayout.f373m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount2) {
                    z4 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i28).isLayoutRequested()) {
                        z4 = true;
                        break;
                    }
                    i28++;
                }
            }
            if (z4) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i29 = 0; i29 < childCount3; i29++) {
                    d h = constraintLayout.h(constraintLayout.getChildAt(i29));
                    if (h != null) {
                        h.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f368f;
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
                                    if (constraintLayout.f378r == null) {
                                        constraintLayout.f378r = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.f378r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
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
                                dVar7 = view == null ? null : ((y.e) view.getLayoutParams()).f3988p0;
                                dVar7.f3623h0 = resourceName;
                                i30++;
                                i25 = i24;
                            }
                        }
                        dVar7 = eVar2;
                        dVar7.f3623h0 = resourceName;
                        i30++;
                        i25 = i24;
                    }
                }
                int i31 = i25;
                if (constraintLayout.f377q != -1) {
                    for (int i32 = 0; i32 < childCount3; i32++) {
                        constraintLayout.getChildAt(i32).getId();
                    }
                }
                n nVar = constraintLayout.f375o;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar2.f3648q0.clear();
                ArrayList arrayList3 = constraintLayout.f369g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i33 = 0;
                    while (i33 < size) {
                        c cVar = (c) arrayList3.get(i33);
                        HashMap hashMap = cVar.f3960l;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f3958j);
                        }
                        v.i iVar = cVar.i;
                        if (iVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            iVar.f3690r0 = i26;
                            Arrays.fill(iVar.f3689q0, (Object) null);
                            int i34 = i26;
                            while (i34 < cVar.f3957g) {
                                int i35 = cVar.f3956f[i34];
                                View view2 = (View) sparseArray3.get(i35);
                                if (view2 != null || (f6 = cVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i35))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    cVar.f3956f[i34] = f6;
                                    hashMap.put(Integer.valueOf(f6), str);
                                    view2 = (View) sparseArray3.get(f6);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    v.i iVar2 = cVar.i;
                                    d h5 = constraintLayout.h(view3);
                                    iVar2.getClass();
                                    if (h5 != iVar2 && h5 != null) {
                                        int i36 = iVar2.f3690r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        d[] dVarArr = iVar2.f3689q0;
                                        if (i36 > dVarArr.length) {
                                            iVar2.f3689q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f3689q0;
                                        int i37 = iVar2.f3690r0;
                                        dVarArr2[i37] = h5;
                                        iVar2.f3690r0 = i37 + 1;
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
                SparseArray sparseArray4 = constraintLayout.f379s;
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
                        eVar2.f3648q0.add(h6);
                        d dVar8 = h6.T;
                        if (dVar8 != null) {
                            ((e) dVar8).f3648q0.remove(h6);
                            h6.C();
                        }
                        h6.T = eVar2;
                        eVar3.a();
                        h6.f3622g0 = childAt3.getVisibility();
                        h6.f3620f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h6, eVar2.f3653v0);
                        }
                        if (eVar3.d0) {
                            h hVar = (h) h6;
                            int i42 = eVar3.f3982m0;
                            int i43 = eVar3.f3984n0;
                            float f7 = eVar3.f3986o0;
                            if (f7 == -1.0f) {
                                c5 = 65535;
                                if (i42 != -1) {
                                    if (i42 > -1) {
                                        hVar.f3683q0 = -1.0f;
                                        hVar.f3684r0 = i42;
                                        hVar.f3685s0 = -1;
                                    }
                                } else if (i43 != -1 && i43 > -1) {
                                    hVar.f3683q0 = -1.0f;
                                    hVar.f3684r0 = -1;
                                    hVar.f3685s0 = i43;
                                }
                                i5 = i41;
                                z5 = z4;
                                i20 = i38;
                            } else if (f7 > -1.0f) {
                                hVar.f3683q0 = f7;
                                c5 = 65535;
                                hVar.f3684r0 = -1;
                                hVar.f3685s0 = -1;
                                i5 = i41;
                                z5 = z4;
                                i20 = i38;
                            }
                        } else {
                            int i44 = eVar3.f3971f0;
                            int i45 = eVar3.f3973g0;
                            int i46 = eVar3.f3974h0;
                            int i47 = eVar3.i0;
                            int i48 = eVar3.f3976j0;
                            int i49 = eVar3.f3978k0;
                            i5 = i41;
                            float f8 = eVar3.f3980l0;
                            int i50 = eVar3.f3987p;
                            z5 = z4;
                            if (i50 != -1) {
                                d dVar9 = (d) sparseArray4.get(i50);
                                if (dVar9 != null) {
                                    float f9 = eVar3.f3990r;
                                    h6.v(7, 7, eVar3.f3989q, 0, dVar9);
                                    h6.D = f9;
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
                                                dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f3996x, dVar12);
                                            } else {
                                                i18 = 3;
                                            }
                                            i13 = i18;
                                            i14 = 5;
                                            i12 = -1;
                                        } else {
                                            int i51 = eVar3.f3975j;
                                            i12 = -1;
                                            if (i51 == -1 || (dVar4 = (d) sparseArray4.get(i51)) == null) {
                                                i13 = 3;
                                                i14 = 5;
                                            } else {
                                                dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f3996x, dVar4);
                                                i13 = 3;
                                                i14 = 5;
                                            }
                                        }
                                        i15 = eVar3.f3977k;
                                        if (i15 == i12) {
                                            d dVar13 = (d) sparseArray4.get(i15);
                                            if (dVar13 != null) {
                                                int i52 = i13;
                                                dVar.v(i14, i52, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f3998z, dVar13);
                                                i16 = i52;
                                            } else {
                                                i16 = i13;
                                            }
                                        } else {
                                            i16 = i13;
                                            int i53 = eVar3.f3979l;
                                            if (i53 != i12 && (dVar5 = (d) sparseArray4.get(i53)) != null) {
                                                dVar.v(i14, i14, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f3998z, dVar5);
                                            }
                                        }
                                        eVar = eVar3;
                                        i17 = eVar.f3981m;
                                        if (i17 == -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray4, i17, 6);
                                        } else {
                                            int i54 = eVar.f3983n;
                                            if (i54 != -1) {
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                constraintLayout.l(dVar6, eVar, sparseArray4, i54, i16);
                                            } else {
                                                int i55 = eVar.f3985o;
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                int i56 = i14;
                                                if (i55 != -1) {
                                                    constraintLayout.l(dVar6, eVar, sparseArray4, i55, i56);
                                                }
                                                if (f8 >= 0.0f) {
                                                    dVar6.d0 = f8;
                                                }
                                                f5 = eVar.F;
                                                if (f5 >= 0.0f) {
                                                    dVar6.f3618e0 = f5;
                                                }
                                            }
                                        }
                                        if (f8 >= 0.0f) {
                                        }
                                        f5 = eVar.F;
                                        if (f5 >= 0.0f) {
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
                                i15 = eVar3.f3977k;
                                if (i15 == i12) {
                                }
                                eVar = eVar3;
                                i17 = eVar.f3981m;
                                if (i17 == -1) {
                                }
                                if (f8 >= 0.0f) {
                                }
                                f5 = eVar.F;
                                if (f5 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i23 = eVar.T) != -1 || eVar.U != -1)) {
                                int i57 = eVar.U;
                                dVar6.Y = i23;
                                dVar6.Z = i57;
                            }
                            if (eVar.f3963a0) {
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
                                dVar6.i(i9).f3610g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i10).f3610g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.M(3);
                                dVar6.O(0);
                            }
                            if (eVar.f3965b0) {
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
                                    dVar6.i(3).f3610g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).f3610g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
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
                            float f10 = eVar.H;
                            float[] fArr = dVar6.f3627k0;
                            fArr[0] = f10;
                            i31 = 1;
                            fArr[1] = eVar.I;
                            dVar6.i0 = eVar.J;
                            dVar6.f3625j0 = eVar.K;
                            int i58 = eVar.Z;
                            if (i58 >= 0 && i58 <= 3) {
                                dVar6.f3638q = i58;
                            }
                            int i59 = eVar.L;
                            int i60 = eVar.N;
                            int i61 = eVar.P;
                            float f11 = eVar.R;
                            dVar6.f3639r = i59;
                            dVar6.f3642u = i60;
                            if (i61 == Integer.MAX_VALUE) {
                                i61 = 0;
                            }
                            dVar6.f3643v = i61;
                            dVar6.f3644w = f11;
                            if (f11 > 0.0f && f11 < 1.0f && i59 == 0) {
                                dVar6.f3639r = 2;
                            }
                            int i62 = eVar.M;
                            int i63 = eVar.O;
                            int i64 = eVar.Q;
                            float f12 = eVar.S;
                            dVar6.f3640s = i62;
                            dVar6.f3645x = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            dVar6.f3646y = i64;
                            dVar6.f3647z = f12;
                            if (f12 <= 0.0f || f12 >= 1.0f || i62 != 0) {
                                i20 = 2;
                            } else {
                                i20 = 2;
                                dVar6.f3640s = 2;
                            }
                        }
                        i41 = i5 + 1;
                        i38 = i20;
                        z4 = z5;
                    }
                    i5 = i41;
                    z5 = z4;
                    i20 = i38;
                    i41 = i5 + 1;
                    i38 = i20;
                    z4 = z5;
                }
            }
            if (z4) {
                eVar2.f3649r0.m(eVar2);
            }
        }
        eVar2.f3654w0.getClass();
        constraintLayout.k(eVar2, constraintLayout.f374n, i, i4);
        int q4 = eVar2.q();
        int k4 = eVar2.k();
        boolean z8 = eVar2.E0;
        boolean z9 = eVar2.F0;
        f fVar = constraintLayout.f380t;
        int i65 = fVar.f4002e;
        int resolveSizeAndState = View.resolveSizeAndState(q4 + fVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k4 + i65, i4, 0) & 16777215;
        int min = Math.min(constraintLayout.f371k, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f372l, resolveSizeAndState2);
        if (z8) {
            min |= 16777216;
        }
        if (z9) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h = h(view);
        if ((view instanceof Guideline) && !(h instanceof h)) {
            y.e eVar = (y.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f3988p0 = hVar;
            eVar.d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((y.e) view.getLayoutParams()).f3969e0 = true;
            ArrayList arrayList = this.f369g;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f368f.put(view.getId(), view);
        this.f373m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f368f.remove(view.getId());
        d h = h(view);
        this.h.f3648q0.remove(h);
        h.C();
        this.f369g.remove(view);
        this.f373m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f373m = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f375o = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f368f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f372l) {
            return;
        }
        this.f372l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f371k) {
            return;
        }
        this.f371k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f370j) {
            return;
        }
        this.f370j = i;
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
        q qVar = this.f376p;
        if (qVar != null) {
            qVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f374n = i;
        e eVar = this.h;
        eVar.D0 = i;
        t.c.f3358q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f368f = new SparseArray();
        this.f369g = new ArrayList(4);
        this.h = new e();
        this.i = 0;
        this.f370j = 0;
        this.f371k = Integer.MAX_VALUE;
        this.f372l = Integer.MAX_VALUE;
        this.f373m = true;
        this.f374n = 257;
        this.f375o = null;
        this.f376p = null;
        this.f377q = -1;
        this.f378r = new HashMap();
        this.f379s = new SparseArray();
        this.f380t = new f(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        y.e eVar = new y.e(layoutParams);
        eVar.f3962a = -1;
        eVar.f3964b = -1;
        eVar.f3966c = -1.0f;
        eVar.d = true;
        eVar.f3968e = -1;
        eVar.f3970f = -1;
        eVar.f3972g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.f3975j = -1;
        eVar.f3977k = -1;
        eVar.f3979l = -1;
        eVar.f3981m = -1;
        eVar.f3983n = -1;
        eVar.f3985o = -1;
        eVar.f3987p = -1;
        eVar.f3989q = 0;
        eVar.f3990r = 0.0f;
        eVar.f3991s = -1;
        eVar.f3992t = -1;
        eVar.f3993u = -1;
        eVar.f3994v = -1;
        eVar.f3995w = Integer.MIN_VALUE;
        eVar.f3996x = Integer.MIN_VALUE;
        eVar.f3997y = Integer.MIN_VALUE;
        eVar.f3998z = Integer.MIN_VALUE;
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
        eVar.f3963a0 = true;
        eVar.f3965b0 = true;
        eVar.f3967c0 = false;
        eVar.d0 = false;
        eVar.f3969e0 = false;
        eVar.f3971f0 = -1;
        eVar.f3973g0 = -1;
        eVar.f3974h0 = -1;
        eVar.i0 = -1;
        eVar.f3976j0 = Integer.MIN_VALUE;
        eVar.f3978k0 = Integer.MIN_VALUE;
        eVar.f3980l0 = 0.5f;
        eVar.f3988p0 = new d();
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
        eVar.f3962a = eVar2.f3962a;
        eVar.f3964b = eVar2.f3964b;
        eVar.f3966c = eVar2.f3966c;
        eVar.d = eVar2.d;
        eVar.f3968e = eVar2.f3968e;
        eVar.f3970f = eVar2.f3970f;
        eVar.f3972g = eVar2.f3972g;
        eVar.h = eVar2.h;
        eVar.i = eVar2.i;
        eVar.f3975j = eVar2.f3975j;
        eVar.f3977k = eVar2.f3977k;
        eVar.f3979l = eVar2.f3979l;
        eVar.f3981m = eVar2.f3981m;
        eVar.f3983n = eVar2.f3983n;
        eVar.f3985o = eVar2.f3985o;
        eVar.f3987p = eVar2.f3987p;
        eVar.f3989q = eVar2.f3989q;
        eVar.f3990r = eVar2.f3990r;
        eVar.f3991s = eVar2.f3991s;
        eVar.f3992t = eVar2.f3992t;
        eVar.f3993u = eVar2.f3993u;
        eVar.f3994v = eVar2.f3994v;
        eVar.f3995w = eVar2.f3995w;
        eVar.f3996x = eVar2.f3996x;
        eVar.f3997y = eVar2.f3997y;
        eVar.f3998z = eVar2.f3998z;
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
        eVar.f3963a0 = eVar2.f3963a0;
        eVar.f3965b0 = eVar2.f3965b0;
        eVar.f3967c0 = eVar2.f3967c0;
        eVar.d0 = eVar2.d0;
        eVar.f3971f0 = eVar2.f3971f0;
        eVar.f3973g0 = eVar2.f3973g0;
        eVar.f3974h0 = eVar2.f3974h0;
        eVar.i0 = eVar2.i0;
        eVar.f3976j0 = eVar2.f3976j0;
        eVar.f3978k0 = eVar2.f3978k0;
        eVar.f3980l0 = eVar2.f3980l0;
        eVar.Y = eVar2.Y;
        eVar.Z = eVar2.Z;
        eVar.f3988p0 = eVar2.f3988p0;
        return eVar;
    }
}

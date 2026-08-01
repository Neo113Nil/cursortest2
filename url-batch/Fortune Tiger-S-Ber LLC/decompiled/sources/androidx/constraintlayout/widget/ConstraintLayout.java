package androidx.constraintlayout.widget;

import a2.s;
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
import j3.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import s.a;
import s.d;
import s.e;
import s.h;
import s.j;
import t.i;
import t.k;
import t.m;
import t.o;
import v.c;
import v.f;
import v.g;
import v.n;
import v.q;
import v.r;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static r f258u;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f259f;
    public final ArrayList g;
    public final e h;

    /* renamed from: i, reason: collision with root package name */
    public int f260i;

    /* renamed from: j, reason: collision with root package name */
    public int f261j;

    /* renamed from: k, reason: collision with root package name */
    public int f262k;

    /* renamed from: l, reason: collision with root package name */
    public int f263l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f264m;

    /* renamed from: n, reason: collision with root package name */
    public int f265n;

    /* renamed from: o, reason: collision with root package name */
    public n f266o;

    /* renamed from: p, reason: collision with root package name */
    public s f267p;

    /* renamed from: q, reason: collision with root package name */
    public int f268q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f269r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f270s;

    /* renamed from: t, reason: collision with root package name */
    public final f f271t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f259f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new e();
        this.f260i = 0;
        this.f261j = 0;
        this.f262k = Integer.MAX_VALUE;
        this.f263l = Integer.MAX_VALUE;
        this.f264m = true;
        this.f265n = 257;
        this.f266o = null;
        this.f267p = null;
        this.f268q = -1;
        this.f269r = new HashMap();
        this.f270s = new SparseArray();
        this.f271t = new f(this, this);
        i(attributeSet, 0);
    }

    public static v.e g() {
        v.e eVar = new v.e(-2, -2);
        eVar.f3445a = -1;
        eVar.f3446b = -1;
        eVar.c = -1.0f;
        eVar.f3449d = true;
        eVar.f3451e = -1;
        eVar.f3453f = -1;
        eVar.g = -1;
        eVar.h = -1;
        eVar.f3456i = -1;
        eVar.f3458j = -1;
        eVar.f3460k = -1;
        eVar.f3462l = -1;
        eVar.f3464m = -1;
        eVar.f3466n = -1;
        eVar.f3468o = -1;
        eVar.f3470p = -1;
        eVar.f3472q = 0;
        eVar.f3473r = 0.0f;
        eVar.f3474s = -1;
        eVar.f3475t = -1;
        eVar.f3476u = -1;
        eVar.f3477v = -1;
        eVar.f3478w = Integer.MIN_VALUE;
        eVar.f3479x = Integer.MIN_VALUE;
        eVar.f3480y = Integer.MIN_VALUE;
        eVar.f3481z = Integer.MIN_VALUE;
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
        eVar.a0 = true;
        eVar.f3447b0 = true;
        eVar.f3448c0 = false;
        eVar.f3450d0 = false;
        eVar.f3452e0 = false;
        eVar.f0 = -1;
        eVar.f3454g0 = -1;
        eVar.f3455h0 = -1;
        eVar.f3457i0 = -1;
        eVar.f3459j0 = Integer.MIN_VALUE;
        eVar.f3461k0 = Integer.MIN_VALUE;
        eVar.f3463l0 = 0.5f;
        eVar.f3471p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static r getSharedValues() {
        if (f258u == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            f258u = rVar;
        }
        return f258u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((c) arrayList.get(i4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((parseInt / 1080.0f) * width);
                        int i7 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f4 = i6;
                        float f5 = i7;
                        float f6 = i6 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f4, f5, f6, f5, paint);
                        float parseInt4 = i7 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f4, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f5, f6, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f6, f5, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f264m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        v.e eVar = new v.e(context, attributeSet);
        eVar.f3445a = -1;
        eVar.f3446b = -1;
        eVar.c = -1.0f;
        eVar.f3449d = true;
        eVar.f3451e = -1;
        eVar.f3453f = -1;
        eVar.g = -1;
        eVar.h = -1;
        eVar.f3456i = -1;
        eVar.f3458j = -1;
        eVar.f3460k = -1;
        eVar.f3462l = -1;
        eVar.f3464m = -1;
        eVar.f3466n = -1;
        eVar.f3468o = -1;
        eVar.f3470p = -1;
        eVar.f3472q = 0;
        eVar.f3473r = 0.0f;
        eVar.f3474s = -1;
        eVar.f3475t = -1;
        eVar.f3476u = -1;
        eVar.f3477v = -1;
        eVar.f3478w = Integer.MIN_VALUE;
        eVar.f3479x = Integer.MIN_VALUE;
        eVar.f3480y = Integer.MIN_VALUE;
        eVar.f3481z = Integer.MIN_VALUE;
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
        eVar.a0 = true;
        eVar.f3447b0 = true;
        eVar.f3448c0 = false;
        eVar.f3450d0 = false;
        eVar.f3452e0 = false;
        eVar.f0 = -1;
        eVar.f3454g0 = -1;
        eVar.f3455h0 = -1;
        eVar.f3457i0 = -1;
        eVar.f3459j0 = Integer.MIN_VALUE;
        eVar.f3461k0 = Integer.MIN_VALUE;
        eVar.f3463l0 = 0.5f;
        eVar.f3471p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3569b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = v.d.f3444a.get(index);
            switch (i5) {
                case 1:
                    eVar.V = obtainStyledAttributes.getInt(index, eVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f3470p);
                    eVar.f3470p = resourceId;
                    if (resourceId == -1) {
                        eVar.f3470p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f3472q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3472q);
                    break;
                case 4:
                    float f4 = obtainStyledAttributes.getFloat(index, eVar.f3473r) % 360.0f;
                    eVar.f3473r = f4;
                    if (f4 < 0.0f) {
                        eVar.f3473r = (360.0f - f4) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f3445a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f3445a);
                    break;
                case 6:
                    eVar.f3446b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f3446b);
                    break;
                case 7:
                    eVar.c = obtainStyledAttributes.getFloat(index, eVar.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f3451e);
                    eVar.f3451e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f3451e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f3453f);
                    eVar.f3453f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f3453f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.g);
                    eVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.g = obtainStyledAttributes.getInt(index, -1);
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
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, eVar.f3456i);
                    eVar.f3456i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f3456i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f3458j);
                    eVar.f3458j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f3458j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f3460k);
                    eVar.f3460k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f3460k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f3462l);
                    eVar.f3462l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f3462l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f3464m);
                    eVar.f3464m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f3464m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f3474s);
                    eVar.f3474s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f3474s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f3475t);
                    eVar.f3475t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f3475t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f3476u);
                    eVar.f3476u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f3476u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f3477v);
                    eVar.f3477v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f3477v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f3478w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3478w);
                    break;
                case 22:
                    eVar.f3479x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3479x);
                    break;
                case 23:
                    eVar.f3480y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3480y);
                    break;
                case 24:
                    eVar.f3481z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f3481z);
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
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    eVar.L = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i7 = obtainStyledAttributes.getInt(index, 0);
                    eVar.M = i7;
                    if (i7 == 1) {
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
                    switch (i5) {
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
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f3466n);
                            eVar.f3466n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f3466n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f3468o);
                            eVar.f3468o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f3468o = obtainStyledAttributes.getInt(index, -1);
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
                            switch (i5) {
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
                                    eVar.f3449d = obtainStyledAttributes.getBoolean(index, eVar.f3449d);
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
        return this.f263l;
    }

    public int getMaxWidth() {
        return this.f262k;
    }

    public int getMinHeight() {
        return this.f261j;
    }

    public int getMinWidth() {
        return this.f260i;
    }

    public int getOptimizationLevel() {
        return this.h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.h;
        if (eVar.f3246j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f3246j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f3246j = "parent";
            }
        }
        if (eVar.f3243h0 == null) {
            eVar.f3243h0 = eVar.f3246j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f3243h0);
        }
        ArrayList arrayList = eVar.f3270q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            d dVar = (d) obj;
            View view = dVar.f0;
            if (view != null) {
                if (dVar.f3246j == null && (id = view.getId()) != -1) {
                    dVar.f3246j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f3243h0 == null) {
                    dVar.f3243h0 = dVar.f3246j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f3243h0);
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
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f3471p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f3471p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i4) {
        e eVar = this.h;
        eVar.f0 = this;
        f fVar = this.f271t;
        eVar.f3274u0 = fVar;
        eVar.f3272s0.f3332f = fVar;
        this.f259f.put(getId(), this);
        this.f266o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f3569b, i4, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 16) {
                    this.f260i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f260i);
                } else if (index == 17) {
                    this.f261j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f261j);
                } else if (index == 14) {
                    this.f262k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f262k);
                } else if (index == 15) {
                    this.f263l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f263l);
                } else if (index == 113) {
                    this.f265n = obtainStyledAttributes.getInt(index, this.f265n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f267p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f266o = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f266o = null;
                    }
                    this.f268q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f265n;
        q.c.f3065q = eVar.W(512);
    }

    public final void j(int i4) {
        String str;
        Context context = getContext();
        s sVar = new s(20, false);
        sVar.g = new SparseArray();
        sVar.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            z zVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                sVar.F(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                z zVar2 = new z(context, xml);
                                ((SparseArray) sVar.g).put(zVar2.f2494a, zVar2);
                                zVar = zVar2;
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
                                if (zVar != null) {
                                    ((ArrayList) zVar.c).add(gVar);
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
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e4);
        } catch (XmlPullParserException e5) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e5);
        }
        this.f267p = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e eVar, int i4, int i5, int i6) {
        int i7;
        int max;
        int i8;
        int max2;
        int i9;
        char c;
        boolean z3;
        int i10;
        int i11;
        boolean z4;
        ArrayList arrayList;
        f fVar;
        int i12;
        boolean z5;
        int i13;
        int i14;
        f fVar2;
        int i15;
        boolean z6;
        int i16;
        f fVar3;
        k kVar;
        m mVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z7;
        int size;
        int i24;
        int size2;
        int i25;
        int mode = View.MeasureSpec.getMode(i5);
        int size3 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size4 = View.MeasureSpec.getSize(i6);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i26 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f271t;
        fVar4.f3483b = max3;
        fVar4.c = max4;
        fVar4.f3484d = paddingWidth;
        fVar4.f3485e = i26;
        fVar4.f3486f = i5;
        fVar4.g = i6;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i27 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i28 = size3 - paddingWidth;
        int i29 = size4 - i26;
        int i30 = fVar4.f3485e;
        int i31 = fVar4.f3484d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i7 = 0;
                } else {
                    i7 = Math.min(this.f262k - i31, i28);
                    i27 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f260i);
                i7 = max;
                i27 = 2;
            } else {
                i7 = 0;
                i27 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f260i);
            i7 = max;
            i27 = 2;
        } else {
            i7 = i28;
            i27 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i8 = mode2 != 1073741824 ? 0 : Math.min(this.f263l - i30, i29);
                i9 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f261j);
                i8 = max2;
                i9 = 2;
            } else {
                i8 = 0;
                i9 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f261j);
            i8 = max2;
            i9 = 2;
        } else {
            i8 = i29;
            i9 = 2;
        }
        int q4 = eVar.q();
        t.e eVar2 = eVar.f3272s0;
        int[] iArr = eVar.C;
        int i32 = i7;
        if (i32 == q4 && i8 == eVar.k()) {
            c = 1;
        } else {
            eVar2.c = true;
            c = 1;
        }
        eVar.Y = 0;
        eVar.Z = 0;
        iArr[0] = this.f262k - i31;
        iArr[c] = this.f263l - i30;
        eVar.f3235b0 = 0;
        eVar.f3236c0 = 0;
        eVar.M(i27);
        eVar.O(i32);
        eVar.N(i9);
        eVar.L(i8);
        int i33 = this.f260i - i31;
        if (i33 < 0) {
            eVar.f3235b0 = 0;
        } else {
            eVar.f3235b0 = i33;
        }
        int i34 = this.f261j - i30;
        if (i34 < 0) {
            eVar.f3236c0 = 0;
        } else {
            eVar.f3236c0 = i34;
        }
        eVar.f3277x0 = max5;
        eVar.f3278y0 = max3;
        androidx.emoji2.text.s sVar = eVar.f3271r0;
        e eVar3 = (e) sVar.f358d;
        ArrayList arrayList2 = (ArrayList) sVar.f357b;
        f fVar5 = eVar.f3274u0;
        int size5 = eVar.f3270q0.size();
        int q5 = eVar.q();
        int k4 = eVar.k();
        boolean c4 = j.c(i4, 128);
        boolean z8 = c4 || j.c(i4, 64);
        if (z8) {
            int i35 = 0;
            while (i35 < size5) {
                boolean z9 = z8;
                d dVar = (d) eVar.f3270q0.get(i35);
                int i36 = i35;
                int[] iArr2 = dVar.f3259p0;
                i10 = size5;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.W > 0.0f;
                if ((dVar.x() && z10) || ((dVar.y() && z10) || (dVar instanceof s.g) || dVar.x() || dVar.y())) {
                    i11 = 1073741824;
                    z3 = false;
                    break;
                } else {
                    i35 = i36 + 1;
                    z8 = z9;
                    size5 = i10;
                }
            }
        }
        z3 = z8;
        i10 = size5;
        i11 = 1073741824;
        boolean z11 = z3 & ((mode == i11 && mode2 == i11) || c4);
        if (z11) {
            int min = Math.min(iArr[0], i28);
            int min2 = Math.min(iArr[1], i29);
            int i37 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.q() != min) {
                    eVar.O(min);
                    eVar2.f3329b = true;
                }
                i37 = 1073741824;
            }
            if (mode2 == i37 && eVar.k() != min2) {
                eVar.L(min2);
                eVar2.f3329b = true;
            }
            if (mode == i37 && mode2 == i37) {
                ArrayList arrayList3 = eVar2.f3331e;
                e eVar4 = eVar2.f3328a;
                if (eVar2.f3329b || eVar2.c) {
                    ArrayList arrayList4 = eVar4.f3270q0;
                    int size6 = arrayList4.size();
                    z4 = z11;
                    int i38 = 0;
                    while (i38 < size6) {
                        Object obj = arrayList4.get(i38);
                        int i39 = i38 + 1;
                        d dVar2 = (d) obj;
                        dVar2.h();
                        dVar2.f3233a = false;
                        dVar2.f3237d.n();
                        dVar2.f3239e.m();
                        arrayList4 = arrayList4;
                        i38 = i39;
                    }
                    eVar4.h();
                    i19 = 0;
                    eVar4.f3233a = false;
                    eVar4.f3237d.n();
                    eVar4.f3239e.m();
                    eVar2.c = false;
                } else {
                    z4 = z11;
                    i19 = 0;
                }
                eVar2.b(eVar2.f3330d);
                eVar4.Y = i19;
                int[] iArr3 = eVar4.f3259p0;
                eVar4.Z = i19;
                int j4 = eVar4.j(i19);
                int j5 = eVar4.j(1);
                if (eVar2.f3329b) {
                    eVar2.c();
                }
                int r3 = eVar4.r();
                fVar = fVar5;
                int s2 = eVar4.s();
                arrayList = arrayList2;
                eVar4.f3237d.h.d(r3);
                eVar4.f3239e.h.d(s2);
                eVar2.g();
                if (j4 == 2 || j5 == 2) {
                    if (c4) {
                        int size7 = arrayList3.size();
                        i20 = r3;
                        int i40 = 0;
                        while (true) {
                            if (i40 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i40);
                            i40++;
                            if (!((o) obj2).k()) {
                                c4 = false;
                                break;
                            }
                        }
                    } else {
                        i20 = r3;
                    }
                    if (c4 && j4 == 2) {
                        eVar4.M(1);
                        eVar4.O(eVar2.d(eVar4, 0));
                        eVar4.f3237d.f3357e.d(eVar4.q());
                    }
                    if (c4 && j5 == 2) {
                        i21 = 1;
                        eVar4.N(1);
                        eVar4.L(eVar2.d(eVar4, 1));
                        eVar4.f3239e.f3357e.d(eVar4.k());
                        i22 = iArr3[0];
                        if (i22 != i21 || i22 == 4) {
                            int q6 = eVar4.q() + i20;
                            eVar4.f3237d.f3359i.d(q6);
                            eVar4.f3237d.f3357e.d(q6 - i20);
                            eVar2.g();
                            i23 = iArr3[1];
                            if (i23 != 1 || i23 == 4) {
                                int k5 = eVar4.k() + s2;
                                eVar4.f3239e.f3359i.d(k5);
                                eVar4.f3239e.f3357e.d(k5 - s2);
                            }
                            eVar2.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i24 = 0;
                        while (i24 < size) {
                            Object obj3 = arrayList3.get(i24);
                            i24++;
                            o oVar = (o) obj3;
                            if (oVar.f3355b != eVar4 || oVar.g) {
                                oVar.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i25 = 0;
                        while (i25 < size2) {
                            Object obj4 = arrayList3.get(i25);
                            i25++;
                            o oVar2 = (o) obj4;
                            if (z7 || oVar2.f3355b != eVar4) {
                                if (!oVar2.h.f3339j || ((!oVar2.f3359i.f3339j && !(oVar2 instanceof i)) || (!oVar2.f3357e.f3339j && !(oVar2 instanceof t.c) && !(oVar2 instanceof i)))) {
                                    z5 = false;
                                    break;
                                }
                            }
                        }
                        z5 = true;
                        eVar4.M(j4);
                        eVar4.N(j5);
                        i12 = 2;
                        i18 = 1073741824;
                    }
                } else {
                    i20 = r3;
                }
                i21 = 1;
                i22 = iArr3[0];
                if (i22 != i21) {
                }
                int q62 = eVar4.q() + i20;
                eVar4.f3237d.f3359i.d(q62);
                eVar4.f3237d.f3357e.d(q62 - i20);
                eVar2.g();
                i23 = iArr3[1];
                if (i23 != 1) {
                }
                int k52 = eVar4.k() + s2;
                eVar4.f3239e.f3359i.d(k52);
                eVar4.f3239e.f3357e.d(k52 - s2);
                eVar2.g();
                z7 = true;
                size = arrayList3.size();
                i24 = 0;
                while (i24 < size) {
                }
                size2 = arrayList3.size();
                i25 = 0;
                while (i25 < size2) {
                }
                z5 = true;
                eVar4.M(j4);
                eVar4.N(j5);
                i12 = 2;
                i18 = 1073741824;
            } else {
                z4 = z11;
                arrayList = arrayList2;
                fVar = fVar5;
                e eVar5 = eVar2.f3328a;
                if (eVar2.f3329b) {
                    ArrayList arrayList5 = eVar5.f3270q0;
                    int size8 = arrayList5.size();
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj5 = arrayList5.get(i41);
                        i41++;
                        d dVar3 = (d) obj5;
                        dVar3.h();
                        dVar3.f3233a = false;
                        k kVar2 = dVar3.f3237d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.f3357e.f3339j = false;
                        kVar2.g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f3239e;
                        mVar2.f3357e.f3339j = false;
                        mVar2.g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i17 = 0;
                    eVar5.h();
                    eVar5.f3233a = false;
                    k kVar3 = eVar5.f3237d;
                    kVar3.f3357e.f3339j = false;
                    kVar3.g = false;
                    kVar3.n();
                    m mVar3 = eVar5.f3239e;
                    mVar3.f3357e.f3339j = false;
                    mVar3.g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i17 = 0;
                }
                eVar2.b(eVar2.f3330d);
                eVar5.Y = i17;
                eVar5.Z = i17;
                eVar5.f3237d.h.d(i17);
                eVar5.f3239e.h.d(i17);
                i18 = 1073741824;
                if (mode == 1073741824) {
                    z5 = eVar.T(i17, c4);
                    i12 = 1;
                } else {
                    i12 = 0;
                    z5 = true;
                }
                if (mode2 == 1073741824) {
                    z5 &= eVar.T(1, c4);
                    i12++;
                }
            }
            if (z5) {
                eVar.P(mode == i18, mode2 == i18);
            }
        } else {
            z4 = z11;
            arrayList = arrayList2;
            fVar = fVar5;
            i12 = 0;
            z5 = false;
        }
        if (z5 && i12 == 2) {
            return;
        }
        int i42 = eVar.D0;
        if (i10 > 0) {
            int size9 = eVar.f3270q0.size();
            boolean W = eVar.W(64);
            f fVar6 = eVar.f3274u0;
            for (int i43 = 0; i43 < size9; i43++) {
                d dVar4 = (d) eVar.f3270q0.get(i43);
                if (!(dVar4 instanceof h) && !(dVar4 instanceof a) && !dVar4.F && (!W || (kVar = dVar4.f3237d) == null || (mVar = dVar4.f3239e) == null || !kVar.f3357e.f3339j || !mVar.f3357e.f3339j)) {
                    int j6 = dVar4.j(0);
                    int j7 = dVar4.j(1);
                    boolean z12 = j6 == 3 && dVar4.f3261r != 1 && j7 == 3 && dVar4.f3262s != 1;
                    if (!z12 && eVar.W(1) && !(dVar4 instanceof s.g)) {
                        if (j6 == 3 && dVar4.f3261r == 0 && j7 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if (j7 == 3 && dVar4.f3262s == 0 && j6 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if ((j6 == 3 || j7 == 3) && dVar4.W > 0.0f) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        sVar.q(0, dVar4, fVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f3482a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.g;
            for (int i44 = 0; i44 < childCount2; i44++) {
                constraintLayout.getChildAt(i44);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i45 = 0; i45 < size10; i45++) {
                    ((c) arrayList7.get(i45)).getClass();
                }
            }
        }
        sVar.w(eVar);
        int size11 = arrayList.size();
        if (i10 > 0) {
            sVar.u(eVar, 0, q5, k4);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.f3259p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int max7 = Math.max(eVar.q(), eVar3.f3235b0);
            int max8 = Math.max(eVar.k(), eVar3.f3236c0);
            int i46 = 0;
            boolean z15 = false;
            while (i46 < size11) {
                ArrayList arrayList8 = arrayList;
                d dVar5 = (d) arrayList8.get(i46);
                if (dVar5 instanceof s.g) {
                    int q7 = dVar5.q();
                    int k6 = dVar5.k();
                    z6 = z14;
                    i16 = i46;
                    fVar3 = fVar;
                    boolean q8 = z15 | sVar.q(1, dVar5, fVar3);
                    int q9 = dVar5.q();
                    boolean z16 = q8;
                    int k7 = dVar5.k();
                    if (q9 != q7) {
                        dVar5.O(q9);
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
                    z15 = z16 | ((s.g) dVar5).f3303y0;
                } else {
                    z6 = z14;
                    i16 = i46;
                    fVar3 = fVar;
                }
                i46 = i16 + 1;
                fVar = fVar3;
                arrayList = arrayList8;
                z14 = z6;
            }
            boolean z17 = z14;
            ArrayList arrayList9 = arrayList;
            int i47 = 0;
            while (true) {
                f fVar7 = fVar;
                if (i47 >= 2) {
                    break;
                }
                int i48 = 0;
                while (i48 < size11) {
                    d dVar6 = (d) arrayList9.get(i48);
                    if ((!(dVar6 instanceof s.i) || (dVar6 instanceof s.g)) && !(dVar6 instanceof h)) {
                        i13 = size11;
                        if (dVar6.f3242g0 != 8 && ((!z4 || !dVar6.f3237d.f3357e.f3339j || !dVar6.f3239e.f3357e.f3339j) && !(dVar6 instanceof s.g))) {
                            int q10 = dVar6.q();
                            int k8 = dVar6.k();
                            i14 = i48;
                            int i49 = dVar6.a0;
                            z15 |= sVar.q(i47 == 1 ? 2 : 1, dVar6, fVar7);
                            fVar2 = fVar7;
                            int q11 = dVar6.q();
                            i15 = i47;
                            int k9 = dVar6.k();
                            if (q11 != q10) {
                                dVar6.O(q11);
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
                            if (dVar6.E && i49 != dVar6.a0) {
                                z15 = true;
                            }
                            i48 = i14 + 1;
                            size11 = i13;
                            fVar7 = fVar2;
                            i47 = i15;
                        }
                    } else {
                        i13 = size11;
                    }
                    fVar2 = fVar7;
                    i15 = i47;
                    i14 = i48;
                    i48 = i14 + 1;
                    size11 = i13;
                    fVar7 = fVar2;
                    i47 = i15;
                }
                int i50 = size11;
                fVar = fVar7;
                int i51 = i47;
                if (!z15) {
                    break;
                }
                int i52 = i51 + 1;
                sVar.u(eVar, i52, q5, k4);
                i47 = i52;
                size11 = i50;
                z15 = false;
            }
        }
        eVar.D0 = i42;
        q.c.f3065q = eVar.W(512);
    }

    public final void l(d dVar, v.e eVar, SparseArray sparseArray, int i4, int i5) {
        View view = (View) this.f259f.get(i4);
        d dVar2 = (d) sparseArray.get(i4);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof v.e)) {
            return;
        }
        eVar.f3448c0 = true;
        if (i5 == 6) {
            v.e eVar2 = (v.e) view.getLayoutParams();
            eVar2.f3448c0 = true;
            eVar2.f3471p0.E = true;
        }
        dVar.i(6).b(dVar2.i(i5), eVar.D, eVar.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            v.e eVar = (v.e) childAt.getLayoutParams();
            d dVar = eVar.f3471p0;
            if (childAt.getVisibility() != 8 || eVar.f3450d0 || eVar.f3452e0 || isInEditMode) {
                int r3 = dVar.r();
                int s2 = dVar.s();
                childAt.layout(r3, s2, dVar.q() + r3, dVar.k() + s2);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((c) arrayList.get(i9)).getClass();
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
    public void onMeasure(int i4, int i5) {
        boolean z3;
        int i6;
        boolean z4;
        d dVar;
        int i7;
        d dVar2;
        int i8;
        int i9;
        int i10;
        d dVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        d dVar4;
        int i16;
        int i17;
        d dVar5;
        v.e eVar;
        int i18;
        d dVar6;
        float f4;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float parseFloat;
        int i24;
        char c;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f5;
        int i25;
        String resourceName;
        int id;
        d dVar7;
        ConstraintLayout constraintLayout = this;
        boolean z5 = constraintLayout.f264m;
        constraintLayout.f264m = z5;
        int i26 = 1;
        int i27 = 0;
        if (!z5) {
            int childCount = constraintLayout.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i28).isLayoutRequested()) {
                    constraintLayout.f264m = true;
                    break;
                }
                i28++;
            }
        }
        boolean z6 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.h;
        eVar2.f3275v0 = z6;
        if (constraintLayout.f264m) {
            constraintLayout.f264m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i29 = 0;
            while (true) {
                if (i29 >= childCount2) {
                    z3 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i29).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i29++;
                }
            }
            if (z3) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i30 = 0; i30 < childCount3; i30++) {
                    d h = constraintLayout.h(constraintLayout.getChildAt(i30));
                    if (h != null) {
                        h.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f259f;
                if (isInEditMode) {
                    int i31 = 0;
                    while (i31 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i31);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i25 = i26;
                                try {
                                    if (constraintLayout.f269r == null) {
                                        constraintLayout.f269r = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.f269r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i25 = i26;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i25 = i26;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                dVar7 = view == null ? null : ((v.e) view.getLayoutParams()).f3471p0;
                                dVar7.f3243h0 = resourceName;
                                i31++;
                                i26 = i25;
                            }
                        }
                        dVar7 = eVar2;
                        dVar7.f3243h0 = resourceName;
                        i31++;
                        i26 = i25;
                    }
                }
                int i32 = i26;
                if (constraintLayout.f268q != -1) {
                    for (int i33 = 0; i33 < childCount3; i33++) {
                        constraintLayout.getChildAt(i33).getId();
                    }
                }
                n nVar = constraintLayout.f266o;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar2.f3270q0.clear();
                ArrayList arrayList3 = constraintLayout.g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i34 = 0;
                    while (i34 < size) {
                        c cVar = (c) arrayList3.get(i34);
                        HashMap hashMap = cVar.f3443l;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f3441j);
                        }
                        s.i iVar = cVar.f3440i;
                        if (iVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            iVar.f3312r0 = i27;
                            Arrays.fill(iVar.f3311q0, (Object) null);
                            int i35 = i27;
                            while (i35 < cVar.g) {
                                int i36 = cVar.f3439f[i35];
                                View view2 = (View) sparseArray3.get(i36);
                                if (view2 != null || (f5 = cVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i36))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    cVar.f3439f[i35] = f5;
                                    hashMap.put(Integer.valueOf(f5), str);
                                    view2 = (View) sparseArray3.get(f5);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    s.i iVar2 = cVar.f3440i;
                                    d h4 = constraintLayout.h(view3);
                                    iVar2.getClass();
                                    if (h4 != iVar2 && h4 != null) {
                                        int i37 = iVar2.f3312r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        d[] dVarArr = iVar2.f3311q0;
                                        if (i37 > dVarArr.length) {
                                            iVar2.f3311q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f3311q0;
                                        int i38 = iVar2.f3312r0;
                                        dVarArr2[i38] = h4;
                                        iVar2.f3312r0 = i38 + 1;
                                        i35++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i35++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            cVar.f3440i.S();
                        }
                        i34++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i27 = 0;
                    }
                }
                int i39 = 2;
                for (int i40 = 0; i40 < childCount3; i40++) {
                    constraintLayout.getChildAt(i40);
                }
                SparseArray sparseArray4 = constraintLayout.f270s;
                sparseArray4.clear();
                sparseArray4.put(0, eVar2);
                sparseArray4.put(constraintLayout.getId(), eVar2);
                for (int i41 = 0; i41 < childCount3; i41++) {
                    View childAt2 = constraintLayout.getChildAt(i41);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i42 = 0;
                while (i42 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i42);
                    d h5 = constraintLayout.h(childAt3);
                    if (h5 != null) {
                        v.e eVar3 = (v.e) childAt3.getLayoutParams();
                        eVar2.f3270q0.add(h5);
                        d dVar8 = h5.T;
                        if (dVar8 != null) {
                            ((e) dVar8).f3270q0.remove(h5);
                            h5.C();
                        }
                        h5.T = eVar2;
                        eVar3.a();
                        h5.f3242g0 = childAt3.getVisibility();
                        h5.f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h5, eVar2.f3275v0);
                        }
                        if (eVar3.f3450d0) {
                            h hVar = (h) h5;
                            int i43 = eVar3.f3465m0;
                            int i44 = eVar3.f3467n0;
                            float f6 = eVar3.f3469o0;
                            if (f6 == -1.0f) {
                                c = 65535;
                                if (i43 != -1) {
                                    if (i43 > -1) {
                                        hVar.f3305q0 = -1.0f;
                                        hVar.f3306r0 = i43;
                                        hVar.f3307s0 = -1;
                                    }
                                } else if (i44 != -1 && i44 > -1) {
                                    hVar.f3305q0 = -1.0f;
                                    hVar.f3306r0 = -1;
                                    hVar.f3307s0 = i44;
                                }
                                i6 = i42;
                                z4 = z3;
                                i21 = i39;
                            } else if (f6 > -1.0f) {
                                hVar.f3305q0 = f6;
                                c = 65535;
                                hVar.f3306r0 = -1;
                                hVar.f3307s0 = -1;
                                i6 = i42;
                                z4 = z3;
                                i21 = i39;
                            }
                        } else {
                            int i45 = eVar3.f0;
                            int i46 = eVar3.f3454g0;
                            int i47 = eVar3.f3455h0;
                            int i48 = eVar3.f3457i0;
                            int i49 = eVar3.f3459j0;
                            int i50 = eVar3.f3461k0;
                            i6 = i42;
                            float f7 = eVar3.f3463l0;
                            int i51 = eVar3.f3470p;
                            z4 = z3;
                            if (i51 != -1) {
                                d dVar9 = (d) sparseArray4.get(i51);
                                if (dVar9 != null) {
                                    float f8 = eVar3.f3473r;
                                    h5.v(7, 7, eVar3.f3472q, 0, dVar9);
                                    h5.D = f8;
                                }
                                constraintLayout = this;
                                dVar6 = h5;
                                eVar = eVar3;
                                i11 = 4;
                                i10 = 2;
                            } else {
                                if (i45 != -1) {
                                    d dVar10 = (d) sparseArray4.get(i45);
                                    if (dVar10 != null) {
                                        dVar = h5;
                                        i7 = 2;
                                        dVar.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i49, dVar10);
                                    } else {
                                        dVar = h5;
                                        i7 = 2;
                                    }
                                } else {
                                    dVar = h5;
                                    i7 = 2;
                                    if (i46 != -1 && (dVar2 = (d) sparseArray4.get(i46)) != null) {
                                        dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i49, dVar2);
                                        i8 = 2;
                                        i9 = 4;
                                        if (i47 == -1) {
                                            d dVar11 = (d) sparseArray4.get(i47);
                                            if (dVar11 != null) {
                                                dVar.v(i9, i8, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i50, dVar11);
                                            }
                                            i10 = i8;
                                        } else {
                                            i10 = i8;
                                            if (i48 != -1 && (dVar3 = (d) sparseArray4.get(i48)) != null) {
                                                dVar.v(i9, i9, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i50, dVar3);
                                            }
                                        }
                                        i11 = i9;
                                        i12 = eVar3.f3456i;
                                        if (i12 == -1) {
                                            d dVar12 = (d) sparseArray4.get(i12);
                                            if (dVar12 != null) {
                                                i19 = 3;
                                                dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f3479x, dVar12);
                                            } else {
                                                i19 = 3;
                                            }
                                            i14 = i19;
                                            i15 = 5;
                                            i13 = -1;
                                        } else {
                                            int i52 = eVar3.f3458j;
                                            i13 = -1;
                                            if (i52 == -1 || (dVar4 = (d) sparseArray4.get(i52)) == null) {
                                                i14 = 3;
                                                i15 = 5;
                                            } else {
                                                dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f3479x, dVar4);
                                                i14 = 3;
                                                i15 = 5;
                                            }
                                        }
                                        i16 = eVar3.f3460k;
                                        if (i16 == i13) {
                                            d dVar13 = (d) sparseArray4.get(i16);
                                            if (dVar13 != null) {
                                                int i53 = i14;
                                                dVar.v(i15, i53, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f3481z, dVar13);
                                                i17 = i53;
                                            } else {
                                                i17 = i14;
                                            }
                                        } else {
                                            i17 = i14;
                                            int i54 = eVar3.f3462l;
                                            if (i54 != i13 && (dVar5 = (d) sparseArray4.get(i54)) != null) {
                                                dVar.v(i15, i15, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f3481z, dVar5);
                                            }
                                        }
                                        eVar = eVar3;
                                        i18 = eVar.f3464m;
                                        if (i18 == -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray4, i18, 6);
                                        } else {
                                            int i55 = eVar.f3466n;
                                            if (i55 != -1) {
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                constraintLayout.l(dVar6, eVar, sparseArray4, i55, i17);
                                            } else {
                                                int i56 = eVar.f3468o;
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                int i57 = i15;
                                                if (i56 != -1) {
                                                    constraintLayout.l(dVar6, eVar, sparseArray4, i56, i57);
                                                }
                                                if (f7 >= 0.0f) {
                                                    dVar6.f3238d0 = f7;
                                                }
                                                f4 = eVar.F;
                                                if (f4 >= 0.0f) {
                                                    dVar6.f3240e0 = f4;
                                                }
                                            }
                                        }
                                        if (f7 >= 0.0f) {
                                        }
                                        f4 = eVar.F;
                                        if (f4 >= 0.0f) {
                                        }
                                    }
                                }
                                i8 = i7;
                                i9 = 4;
                                if (i47 == -1) {
                                }
                                i11 = i9;
                                i12 = eVar3.f3456i;
                                if (i12 == -1) {
                                }
                                i16 = eVar3.f3460k;
                                if (i16 == i13) {
                                }
                                eVar = eVar3;
                                i18 = eVar.f3464m;
                                if (i18 == -1) {
                                }
                                if (f7 >= 0.0f) {
                                }
                                f4 = eVar.F;
                                if (f4 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i24 = eVar.T) != -1 || eVar.U != -1)) {
                                int i58 = eVar.U;
                                dVar6.Y = i24;
                                dVar6.Z = i58;
                            }
                            if (eVar.a0) {
                                dVar6.M(i32);
                                dVar6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar6.M(i39);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.W) {
                                    dVar6.M(3);
                                } else {
                                    dVar6.M(4);
                                }
                                dVar6.i(i10).g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i11).g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.M(3);
                                dVar6.O(0);
                            }
                            if (eVar.f3447b0) {
                                i20 = -1;
                                dVar6.N(1);
                                dVar6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar6.N(2);
                                }
                            } else {
                                i20 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.X) {
                                        dVar6.N(3);
                                    } else {
                                        dVar6.N(4);
                                    }
                                    dVar6.i(3).g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
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
                                    i22 = i20;
                                    i23 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i22 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i20;
                                    i23 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i23);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i23, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i22 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    dVar6.W = parseFloat;
                                    dVar6.X = i22;
                                }
                            }
                            float f9 = eVar.H;
                            float[] fArr = dVar6.f3249k0;
                            fArr[0] = f9;
                            i32 = 1;
                            fArr[1] = eVar.I;
                            dVar6.f3245i0 = eVar.J;
                            dVar6.f3247j0 = eVar.K;
                            int i59 = eVar.Z;
                            if (i59 >= 0 && i59 <= 3) {
                                dVar6.f3260q = i59;
                            }
                            int i60 = eVar.L;
                            int i61 = eVar.N;
                            int i62 = eVar.P;
                            float f10 = eVar.R;
                            dVar6.f3261r = i60;
                            dVar6.f3264u = i61;
                            if (i62 == Integer.MAX_VALUE) {
                                i62 = 0;
                            }
                            dVar6.f3265v = i62;
                            dVar6.f3266w = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i60 == 0) {
                                dVar6.f3261r = 2;
                            }
                            int i63 = eVar.M;
                            int i64 = eVar.O;
                            int i65 = eVar.Q;
                            float f11 = eVar.S;
                            dVar6.f3262s = i63;
                            dVar6.f3267x = i64;
                            if (i65 == Integer.MAX_VALUE) {
                                i65 = 0;
                            }
                            dVar6.f3268y = i65;
                            dVar6.f3269z = f11;
                            if (f11 <= 0.0f || f11 >= 1.0f || i63 != 0) {
                                i21 = 2;
                            } else {
                                i21 = 2;
                                dVar6.f3262s = 2;
                            }
                        }
                        i42 = i6 + 1;
                        i39 = i21;
                        z3 = z4;
                    }
                    i6 = i42;
                    z4 = z3;
                    i21 = i39;
                    i42 = i6 + 1;
                    i39 = i21;
                    z3 = z4;
                }
            }
            if (z3) {
                eVar2.f3271r0.w(eVar2);
            }
        }
        eVar2.f3276w0.getClass();
        constraintLayout.k(eVar2, constraintLayout.f265n, i4, i5);
        int q4 = eVar2.q();
        int k4 = eVar2.k();
        boolean z7 = eVar2.E0;
        boolean z8 = eVar2.F0;
        f fVar = constraintLayout.f271t;
        int i66 = fVar.f3485e;
        int resolveSizeAndState = View.resolveSizeAndState(q4 + fVar.f3484d, i4, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k4 + i66, i5, 0) & 16777215;
        int min = Math.min(constraintLayout.f262k, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f263l, resolveSizeAndState2);
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
        d h = h(view);
        if ((view instanceof Guideline) && !(h instanceof h)) {
            v.e eVar = (v.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f3471p0 = hVar;
            eVar.f3450d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((v.e) view.getLayoutParams()).f3452e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f259f.put(view.getId(), view);
        this.f264m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f259f.remove(view.getId());
        d h = h(view);
        this.h.f3270q0.remove(h);
        h.C();
        this.g.remove(view);
        this.f264m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f264m = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f266o = nVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        int id = getId();
        SparseArray sparseArray = this.f259f;
        sparseArray.remove(id);
        super.setId(i4);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.f263l) {
            return;
        }
        this.f263l = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f262k) {
            return;
        }
        this.f262k = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f261j) {
            return;
        }
        this.f261j = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f260i) {
            return;
        }
        this.f260i = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(v.o oVar) {
        s sVar = this.f267p;
        if (sVar != null) {
            sVar.getClass();
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f265n = i4;
        e eVar = this.h;
        eVar.D0 = i4;
        q.c.f3065q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f259f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new e();
        this.f260i = 0;
        this.f261j = 0;
        this.f262k = Integer.MAX_VALUE;
        this.f263l = Integer.MAX_VALUE;
        this.f264m = true;
        this.f265n = 257;
        this.f266o = null;
        this.f267p = null;
        this.f268q = -1;
        this.f269r = new HashMap();
        this.f270s = new SparseArray();
        this.f271t = new f(this, this);
        i(attributeSet, i4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        v.e eVar = new v.e(layoutParams);
        eVar.f3445a = -1;
        eVar.f3446b = -1;
        eVar.c = -1.0f;
        eVar.f3449d = true;
        eVar.f3451e = -1;
        eVar.f3453f = -1;
        eVar.g = -1;
        eVar.h = -1;
        eVar.f3456i = -1;
        eVar.f3458j = -1;
        eVar.f3460k = -1;
        eVar.f3462l = -1;
        eVar.f3464m = -1;
        eVar.f3466n = -1;
        eVar.f3468o = -1;
        eVar.f3470p = -1;
        eVar.f3472q = 0;
        eVar.f3473r = 0.0f;
        eVar.f3474s = -1;
        eVar.f3475t = -1;
        eVar.f3476u = -1;
        eVar.f3477v = -1;
        eVar.f3478w = Integer.MIN_VALUE;
        eVar.f3479x = Integer.MIN_VALUE;
        eVar.f3480y = Integer.MIN_VALUE;
        eVar.f3481z = Integer.MIN_VALUE;
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
        eVar.a0 = true;
        eVar.f3447b0 = true;
        eVar.f3448c0 = false;
        eVar.f3450d0 = false;
        eVar.f3452e0 = false;
        eVar.f0 = -1;
        eVar.f3454g0 = -1;
        eVar.f3455h0 = -1;
        eVar.f3457i0 = -1;
        eVar.f3459j0 = Integer.MIN_VALUE;
        eVar.f3461k0 = Integer.MIN_VALUE;
        eVar.f3463l0 = 0.5f;
        eVar.f3471p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof v.e)) {
            return eVar;
        }
        v.e eVar2 = (v.e) layoutParams;
        eVar.f3445a = eVar2.f3445a;
        eVar.f3446b = eVar2.f3446b;
        eVar.c = eVar2.c;
        eVar.f3449d = eVar2.f3449d;
        eVar.f3451e = eVar2.f3451e;
        eVar.f3453f = eVar2.f3453f;
        eVar.g = eVar2.g;
        eVar.h = eVar2.h;
        eVar.f3456i = eVar2.f3456i;
        eVar.f3458j = eVar2.f3458j;
        eVar.f3460k = eVar2.f3460k;
        eVar.f3462l = eVar2.f3462l;
        eVar.f3464m = eVar2.f3464m;
        eVar.f3466n = eVar2.f3466n;
        eVar.f3468o = eVar2.f3468o;
        eVar.f3470p = eVar2.f3470p;
        eVar.f3472q = eVar2.f3472q;
        eVar.f3473r = eVar2.f3473r;
        eVar.f3474s = eVar2.f3474s;
        eVar.f3475t = eVar2.f3475t;
        eVar.f3476u = eVar2.f3476u;
        eVar.f3477v = eVar2.f3477v;
        eVar.f3478w = eVar2.f3478w;
        eVar.f3479x = eVar2.f3479x;
        eVar.f3480y = eVar2.f3480y;
        eVar.f3481z = eVar2.f3481z;
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
        eVar.a0 = eVar2.a0;
        eVar.f3447b0 = eVar2.f3447b0;
        eVar.f3448c0 = eVar2.f3448c0;
        eVar.f3450d0 = eVar2.f3450d0;
        eVar.f0 = eVar2.f0;
        eVar.f3454g0 = eVar2.f3454g0;
        eVar.f3455h0 = eVar2.f3455h0;
        eVar.f3457i0 = eVar2.f3457i0;
        eVar.f3459j0 = eVar2.f3459j0;
        eVar.f3461k0 = eVar2.f3461k0;
        eVar.f3463l0 = eVar2.f3463l0;
        eVar.Y = eVar2.Y;
        eVar.Z = eVar2.Z;
        eVar.f3471p0 = eVar2.f3471p0;
        return eVar;
    }
}

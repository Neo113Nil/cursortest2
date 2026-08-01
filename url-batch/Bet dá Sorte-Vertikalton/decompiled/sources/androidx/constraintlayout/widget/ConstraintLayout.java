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
import q.C0271c;
import s.C0278a;
import s.C0281d;
import s.C0282e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0298o;
import t.C0286c;
import t.C0288e;
import t.C0292i;
import t.C0294k;
import t.C0296m;
import t1.y;
import v.AbstractC0308c;
import v.AbstractC0309d;
import v.C0310e;
import v.C0311f;
import v.C0312g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1328r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1330b;

    /* renamed from: c, reason: collision with root package name */
    public final C0282e f1331c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1332e;

    /* renamed from: f, reason: collision with root package name */
    public int f1333f;

    /* renamed from: g, reason: collision with root package name */
    public int f1334g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1335j;

    /* renamed from: k, reason: collision with root package name */
    public j f1336k;

    /* renamed from: l, reason: collision with root package name */
    public int f1337l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1338m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1339n;

    /* renamed from: o, reason: collision with root package name */
    public final C0311f f1340o;

    /* renamed from: p, reason: collision with root package name */
    public int f1341p;

    /* renamed from: q, reason: collision with root package name */
    public int f1342q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1329a = new SparseArray();
        this.f1330b = new ArrayList(4);
        this.f1331c = new C0282e();
        this.d = 0;
        this.f1332e = 0;
        this.f1333f = Integer.MAX_VALUE;
        this.f1334g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1335j = null;
        this.f1336k = null;
        this.f1337l = -1;
        this.f1338m = new HashMap();
        this.f1339n = new SparseArray();
        this.f1340o = new C0311f(this, this);
        this.f1341p = 0;
        this.f1342q = 0;
        i(attributeSet, 0);
    }

    public static C0310e g() {
        C0310e c0310e = new C0310e(-2, -2);
        c0310e.f4007a = -1;
        c0310e.f4009b = -1;
        c0310e.f4011c = -1.0f;
        c0310e.d = true;
        c0310e.f4014e = -1;
        c0310e.f4016f = -1;
        c0310e.f4018g = -1;
        c0310e.h = -1;
        c0310e.i = -1;
        c0310e.f4022j = -1;
        c0310e.f4023k = -1;
        c0310e.f4025l = -1;
        c0310e.f4027m = -1;
        c0310e.f4029n = -1;
        c0310e.f4030o = -1;
        c0310e.f4032p = -1;
        c0310e.f4034q = 0;
        c0310e.f4035r = 0.0f;
        c0310e.f4036s = -1;
        c0310e.f4037t = -1;
        c0310e.f4038u = -1;
        c0310e.f4039v = -1;
        c0310e.f4040w = Integer.MIN_VALUE;
        c0310e.f4041x = Integer.MIN_VALUE;
        c0310e.f4042y = Integer.MIN_VALUE;
        c0310e.f4043z = Integer.MIN_VALUE;
        c0310e.f3982A = Integer.MIN_VALUE;
        c0310e.f3983B = Integer.MIN_VALUE;
        c0310e.f3984C = Integer.MIN_VALUE;
        c0310e.f3985D = 0;
        c0310e.f3986E = 0.5f;
        c0310e.F = 0.5f;
        c0310e.f3987G = null;
        c0310e.f3988H = -1.0f;
        c0310e.f3989I = -1.0f;
        c0310e.f3990J = 0;
        c0310e.f3991K = 0;
        c0310e.f3992L = 0;
        c0310e.f3993M = 0;
        c0310e.f3994N = 0;
        c0310e.f3995O = 0;
        c0310e.f3996P = 0;
        c0310e.f3997Q = 0;
        c0310e.f3998R = 1.0f;
        c0310e.f3999S = 1.0f;
        c0310e.f4000T = -1;
        c0310e.f4001U = -1;
        c0310e.f4002V = -1;
        c0310e.f4003W = false;
        c0310e.f4004X = false;
        c0310e.f4005Y = null;
        c0310e.f4006Z = 0;
        c0310e.f4008a0 = true;
        c0310e.f4010b0 = true;
        c0310e.f4012c0 = false;
        c0310e.f4013d0 = false;
        c0310e.f4015e0 = false;
        c0310e.f4017f0 = -1;
        c0310e.f4019g0 = -1;
        c0310e.f4020h0 = -1;
        c0310e.f4021i0 = -1;
        c0310e.j0 = Integer.MIN_VALUE;
        c0310e.f4024k0 = Integer.MIN_VALUE;
        c0310e.f4026l0 = 0.5f;
        c0310e.f4033p0 = new C0281d();
        return c0310e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1328r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1328r = sVar;
        }
        return f1328r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0310e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1330b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0308c) arrayList.get(i)).getClass();
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
        C0310e c0310e = new C0310e(context, attributeSet);
        c0310e.f4007a = -1;
        c0310e.f4009b = -1;
        c0310e.f4011c = -1.0f;
        c0310e.d = true;
        c0310e.f4014e = -1;
        c0310e.f4016f = -1;
        c0310e.f4018g = -1;
        c0310e.h = -1;
        c0310e.i = -1;
        c0310e.f4022j = -1;
        c0310e.f4023k = -1;
        c0310e.f4025l = -1;
        c0310e.f4027m = -1;
        c0310e.f4029n = -1;
        c0310e.f4030o = -1;
        c0310e.f4032p = -1;
        c0310e.f4034q = 0;
        c0310e.f4035r = 0.0f;
        c0310e.f4036s = -1;
        c0310e.f4037t = -1;
        c0310e.f4038u = -1;
        c0310e.f4039v = -1;
        c0310e.f4040w = Integer.MIN_VALUE;
        c0310e.f4041x = Integer.MIN_VALUE;
        c0310e.f4042y = Integer.MIN_VALUE;
        c0310e.f4043z = Integer.MIN_VALUE;
        c0310e.f3982A = Integer.MIN_VALUE;
        c0310e.f3983B = Integer.MIN_VALUE;
        c0310e.f3984C = Integer.MIN_VALUE;
        c0310e.f3985D = 0;
        c0310e.f3986E = 0.5f;
        c0310e.F = 0.5f;
        c0310e.f3987G = null;
        c0310e.f3988H = -1.0f;
        c0310e.f3989I = -1.0f;
        c0310e.f3990J = 0;
        c0310e.f3991K = 0;
        c0310e.f3992L = 0;
        c0310e.f3993M = 0;
        c0310e.f3994N = 0;
        c0310e.f3995O = 0;
        c0310e.f3996P = 0;
        c0310e.f3997Q = 0;
        c0310e.f3998R = 1.0f;
        c0310e.f3999S = 1.0f;
        c0310e.f4000T = -1;
        c0310e.f4001U = -1;
        c0310e.f4002V = -1;
        c0310e.f4003W = false;
        c0310e.f4004X = false;
        c0310e.f4005Y = null;
        c0310e.f4006Z = 0;
        c0310e.f4008a0 = true;
        c0310e.f4010b0 = true;
        c0310e.f4012c0 = false;
        c0310e.f4013d0 = false;
        c0310e.f4015e0 = false;
        c0310e.f4017f0 = -1;
        c0310e.f4019g0 = -1;
        c0310e.f4020h0 = -1;
        c0310e.f4021i0 = -1;
        c0310e.j0 = Integer.MIN_VALUE;
        c0310e.f4024k0 = Integer.MIN_VALUE;
        c0310e.f4026l0 = 0.5f;
        c0310e.f4033p0 = new C0281d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4158b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0309d.f3981a.get(index);
            switch (i2) {
                case 1:
                    c0310e.f4002V = obtainStyledAttributes.getInt(index, c0310e.f4002V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0310e.f4032p);
                    c0310e.f4032p = resourceId;
                    if (resourceId == -1) {
                        c0310e.f4032p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0310e.f4034q = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f4034q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0310e.f4035r) % 360.0f;
                    c0310e.f4035r = f2;
                    if (f2 < 0.0f) {
                        c0310e.f4035r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0310e.f4007a = obtainStyledAttributes.getDimensionPixelOffset(index, c0310e.f4007a);
                    break;
                case 6:
                    c0310e.f4009b = obtainStyledAttributes.getDimensionPixelOffset(index, c0310e.f4009b);
                    break;
                case 7:
                    c0310e.f4011c = obtainStyledAttributes.getFloat(index, c0310e.f4011c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0310e.f4014e);
                    c0310e.f4014e = resourceId2;
                    if (resourceId2 == -1) {
                        c0310e.f4014e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0310e.f4016f);
                    c0310e.f4016f = resourceId3;
                    if (resourceId3 == -1) {
                        c0310e.f4016f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0310e.f4018g);
                    c0310e.f4018g = resourceId4;
                    if (resourceId4 == -1) {
                        c0310e.f4018g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0310e.h);
                    c0310e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0310e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0310e.i);
                    c0310e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0310e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0310e.f4022j);
                    c0310e.f4022j = resourceId7;
                    if (resourceId7 == -1) {
                        c0310e.f4022j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0310e.f4023k);
                    c0310e.f4023k = resourceId8;
                    if (resourceId8 == -1) {
                        c0310e.f4023k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0310e.f4025l);
                    c0310e.f4025l = resourceId9;
                    if (resourceId9 == -1) {
                        c0310e.f4025l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0310e.f4027m);
                    c0310e.f4027m = resourceId10;
                    if (resourceId10 == -1) {
                        c0310e.f4027m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0310e.f4036s);
                    c0310e.f4036s = resourceId11;
                    if (resourceId11 == -1) {
                        c0310e.f4036s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0310e.f4037t);
                    c0310e.f4037t = resourceId12;
                    if (resourceId12 == -1) {
                        c0310e.f4037t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0310e.f4038u);
                    c0310e.f4038u = resourceId13;
                    if (resourceId13 == -1) {
                        c0310e.f4038u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0310e.f4039v);
                    c0310e.f4039v = resourceId14;
                    if (resourceId14 == -1) {
                        c0310e.f4039v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0310e.f4040w = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f4040w);
                    break;
                case 22:
                    c0310e.f4041x = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f4041x);
                    break;
                case 23:
                    c0310e.f4042y = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f4042y);
                    break;
                case 24:
                    c0310e.f4043z = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f4043z);
                    break;
                case 25:
                    c0310e.f3982A = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3982A);
                    break;
                case 26:
                    c0310e.f3983B = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3983B);
                    break;
                case 27:
                    c0310e.f4003W = obtainStyledAttributes.getBoolean(index, c0310e.f4003W);
                    break;
                case 28:
                    c0310e.f4004X = obtainStyledAttributes.getBoolean(index, c0310e.f4004X);
                    break;
                case 29:
                    c0310e.f3986E = obtainStyledAttributes.getFloat(index, c0310e.f3986E);
                    break;
                case 30:
                    c0310e.F = obtainStyledAttributes.getFloat(index, c0310e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0310e.f3992L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0310e.f3993M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0310e.f3994N = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3994N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0310e.f3994N) == -2) {
                            c0310e.f3994N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0310e.f3996P = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3996P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0310e.f3996P) == -2) {
                            c0310e.f3996P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0310e.f3998R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0310e.f3998R));
                    c0310e.f3992L = 2;
                    break;
                case 36:
                    try {
                        c0310e.f3995O = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3995O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0310e.f3995O) == -2) {
                            c0310e.f3995O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0310e.f3997Q = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3997Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0310e.f3997Q) == -2) {
                            c0310e.f3997Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0310e.f3999S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0310e.f3999S));
                    c0310e.f3993M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0310e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0310e.f3988H = obtainStyledAttributes.getFloat(index, c0310e.f3988H);
                            break;
                        case 46:
                            c0310e.f3989I = obtainStyledAttributes.getFloat(index, c0310e.f3989I);
                            break;
                        case 47:
                            c0310e.f3990J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0310e.f3991K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0310e.f4000T = obtainStyledAttributes.getDimensionPixelOffset(index, c0310e.f4000T);
                            break;
                        case 50:
                            c0310e.f4001U = obtainStyledAttributes.getDimensionPixelOffset(index, c0310e.f4001U);
                            break;
                        case 51:
                            c0310e.f4005Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0310e.f4029n);
                            c0310e.f4029n = resourceId15;
                            if (resourceId15 == -1) {
                                c0310e.f4029n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0310e.f4030o);
                            c0310e.f4030o = resourceId16;
                            if (resourceId16 == -1) {
                                c0310e.f4030o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0310e.f3985D = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3985D);
                            break;
                        case 55:
                            c0310e.f3984C = obtainStyledAttributes.getDimensionPixelSize(index, c0310e.f3984C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0310e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0310e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0310e.f4006Z = obtainStyledAttributes.getInt(index, c0310e.f4006Z);
                                    break;
                                case 67:
                                    c0310e.d = obtainStyledAttributes.getBoolean(index, c0310e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0310e.a();
        return c0310e;
    }

    public int getMaxHeight() {
        return this.f1334g;
    }

    public int getMaxWidth() {
        return this.f1333f;
    }

    public int getMinHeight() {
        return this.f1332e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1331c.f3667D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0282e c0282e = this.f1331c;
        if (c0282e.f3643j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0282e.f3643j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0282e.f3643j = "parent";
            }
        }
        if (c0282e.f3641h0 == null) {
            c0282e.f3641h0 = c0282e.f3643j;
            Log.v("ConstraintLayout", " setDebugName " + c0282e.f3641h0);
        }
        Iterator it = c0282e.f3675q0.iterator();
        while (it.hasNext()) {
            C0281d c0281d = (C0281d) it.next();
            View view = c0281d.f3638f0;
            if (view != null) {
                if (c0281d.f3643j == null && (id = view.getId()) != -1) {
                    c0281d.f3643j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0281d.f3641h0 == null) {
                    c0281d.f3641h0 = c0281d.f3643j;
                    Log.v("ConstraintLayout", " setDebugName " + c0281d.f3641h0);
                }
            }
        }
        c0282e.n(sb);
        return sb.toString();
    }

    public final C0281d h(View view) {
        if (view == this) {
            return this.f1331c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0310e) {
            return ((C0310e) view.getLayoutParams()).f4033p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0310e) {
            return ((C0310e) view.getLayoutParams()).f4033p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0282e c0282e = this.f1331c;
        c0282e.f3638f0 = this;
        C0311f c0311f = this.f1340o;
        c0282e.f3679u0 = c0311f;
        c0282e.f3677s0.f3792f = c0311f;
        this.f1329a.put(getId(), this);
        this.f1335j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4158b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1332e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1332e);
                } else if (index == 14) {
                    this.f1333f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1333f);
                } else if (index == 15) {
                    this.f1334g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1334g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1336k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1335j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1335j = null;
                    }
                    this.f1337l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0282e.f3667D0 = this.i;
        C0271c.f3449p = c0282e.W(512);
    }

    public final void j(int i) {
        int eventType;
        y yVar;
        Context context = getContext();
        j jVar = new j(18, false);
        jVar.f53b = new SparseArray();
        jVar.f54c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            yVar = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1336k = jVar;
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
                    yVar = new y(context, xml);
                    ((SparseArray) jVar.f53b).put(yVar.f3936a, yVar);
                } else if (c2 == 3) {
                    C0312g c0312g = new C0312g(context, xml);
                    if (yVar != null) {
                        ((ArrayList) yVar.f3938c).add(c0312g);
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
    public final void k(C0282e c0282e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0311f c0311f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0311f c0311f2;
        int i12;
        C0311f c0311f3;
        boolean z4;
        C0294k c0294k;
        C0296m c0296m;
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
        C0282e c0282e2 = c0282e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0311f c0311f4 = this.f1340o;
        c0311f4.f4045b = max3;
        c0311f4.f4046c = max4;
        c0311f4.d = paddingWidth;
        c0311f4.f4047e = i19;
        c0311f4.f4048f = i2;
        c0311f4.f4049g = i3;
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
        int i23 = c0311f4.f4047e;
        int i24 = c0311f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1333f - i24, i21);
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
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1334g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1332e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1332e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0282e.q();
        C0288e c0288e = c0282e2.f3677s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0282e.k()) {
            c0288e.f3790c = true;
        }
        c0282e2.f3626Y = 0;
        c0282e2.f3627Z = 0;
        int i26 = this.f1333f - i24;
        int[] iArr = c0282e2.f3605C;
        iArr[0] = i26;
        iArr[1] = this.f1334g - i23;
        c0282e2.f3631b0 = 0;
        c0282e2.f3633c0 = 0;
        c0282e2.M(i20);
        c0282e2.O(i25);
        c0282e2.N(i6);
        c0282e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0282e2.f3631b0 = 0;
        } else {
            c0282e2.f3631b0 = i27;
        }
        int i28 = this.f1332e - i23;
        if (i28 < 0) {
            c0282e2.f3633c0 = 0;
        } else {
            c0282e2.f3633c0 = i28;
        }
        c0282e2.f3682x0 = max5;
        c0282e2.f3683y0 = max3;
        C0011l c0011l = c0282e2.f3676r0;
        c0011l.getClass();
        C0311f c0311f5 = c0282e2.f3679u0;
        int size3 = c0282e2.f3675q0.size();
        int q3 = c0282e.q();
        int k2 = c0282e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0281d c0281d = (C0281d) c0282e2.f3675q0.get(i29);
                int[] iArr2 = c0281d.f3654p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0281d.f3624W > 0.0f;
                if ((c0281d.x() && z8) || ((c0281d.y() && z8) || (c0281d instanceof g) || c0281d.x() || c0281d.y())) {
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
            if (mode == 1073741824 && c0282e.q() != min) {
                c0282e2.O(min);
                c0282e2.f3677s0.f3789b = true;
            }
            if (mode2 == 1073741824 && c0282e.k() != min2) {
                c0282e2.L(min2);
                c0282e2.f3677s0.f3789b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0288e.f3789b;
                C0282e c0282e3 = c0288e.f3788a;
                if (z10 || c0288e.f3790c) {
                    Iterator it3 = c0282e3.f3675q0.iterator();
                    while (it3.hasNext()) {
                        C0281d c0281d2 = (C0281d) it3.next();
                        c0281d2.h();
                        c0281d2.f3628a = false;
                        c0281d2.d.n();
                        c0281d2.f3635e.m();
                    }
                    i15 = 0;
                    c0282e3.h();
                    c0282e3.f3628a = false;
                    c0282e3.d.n();
                    c0282e3.f3635e.m();
                    c0288e.f3790c = false;
                } else {
                    i15 = 0;
                }
                c0288e.b(c0288e.d);
                c0282e3.f3626Y = i15;
                c0282e3.f3627Z = i15;
                int j2 = c0282e3.j(i15);
                int j3 = c0282e3.j(1);
                if (c0288e.f3789b) {
                    c0288e.c();
                }
                int r2 = c0282e3.r();
                int s2 = c0282e3.s();
                z2 = z9;
                c0282e3.d.h.d(r2);
                c0282e3.f3635e.h.d(s2);
                c0288e.g();
                ArrayList arrayList2 = c0288e.f3791e;
                c0311f = c0311f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0298o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0282e3.M(1);
                        i8 = q3;
                        c0282e3.O(c0288e.d(c0282e3, 0));
                        c0282e3.d.f3818e.d(c0282e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0282e3.N(1);
                        c0282e3.L(c0288e.d(c0282e3, 1));
                        c0282e3.f3635e.f3818e.d(c0282e3.k());
                        int[] iArr3 = c0282e3.f3654p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0282e3.q() + r2;
                            c0282e3.d.i.d(q4);
                            c0282e3.d.f3818e.d(q4 - r2);
                            c0288e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0282e3.k() + s2;
                                c0282e3.f3635e.i.d(k3);
                                c0282e3.f3635e.f3818e.d(k3 - s2);
                            }
                            c0288e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0298o abstractC0298o = (AbstractC0298o) it.next();
                            if (abstractC0298o.f3816b != c0282e3 || abstractC0298o.f3820g) {
                                abstractC0298o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0298o abstractC0298o2 = (AbstractC0298o) it2.next();
                            if (z5 || abstractC0298o2.f3816b != c0282e3) {
                                if (!abstractC0298o2.h.f3800j || ((!abstractC0298o2.i.f3800j && !(abstractC0298o2 instanceof C0292i)) || (!abstractC0298o2.f3818e.f3800j && !(abstractC0298o2 instanceof C0286c) && !(abstractC0298o2 instanceof C0292i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0282e3.M(j2);
                        c0282e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0282e3.f3654p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0282e3.q() + r2;
                c0282e3.d.i.d(q42);
                c0282e3.d.f3818e.d(q42 - r2);
                c0288e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0282e3.k() + s2;
                c0282e3.f3635e.i.d(k32);
                c0282e3.f3635e.f3818e.d(k32 - s2);
                c0288e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0282e3.M(j2);
                c0282e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0311f = c0311f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0288e.f3789b;
                C0282e c0282e4 = c0288e.f3788a;
                if (z11) {
                    Iterator it5 = c0282e4.f3675q0.iterator();
                    while (it5.hasNext()) {
                        C0281d c0281d3 = (C0281d) it5.next();
                        c0281d3.h();
                        c0281d3.f3628a = false;
                        C0294k c0294k2 = c0281d3.d;
                        c0294k2.f3818e.f3800j = false;
                        c0294k2.f3820g = false;
                        c0294k2.n();
                        C0296m c0296m2 = c0281d3.f3635e;
                        c0296m2.f3818e.f3800j = false;
                        c0296m2.f3820g = false;
                        c0296m2.m();
                    }
                    i13 = 0;
                    c0282e4.h();
                    c0282e4.f3628a = false;
                    C0294k c0294k3 = c0282e4.d;
                    c0294k3.f3818e.f3800j = false;
                    c0294k3.f3820g = false;
                    c0294k3.n();
                    C0296m c0296m3 = c0282e4.f3635e;
                    c0296m3.f3818e.f3800j = false;
                    c0296m3.f3820g = false;
                    c0296m3.m();
                    c0288e.c();
                } else {
                    i13 = 0;
                }
                c0288e.b(c0288e.d);
                c0282e4.f3626Y = i13;
                c0282e4.f3627Z = i13;
                c0282e4.d.h.d(i13);
                c0282e4.f3635e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0282e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0282e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0282e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0311f = c0311f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0282e2.f3667D0;
        if (size3 > 0) {
            int size4 = c0282e2.f3675q0.size();
            boolean W2 = c0282e2.W(64);
            C0311f c0311f6 = c0282e2.f3679u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0281d c0281d4 = (C0281d) c0282e2.f3675q0.get(i31);
                if (!(c0281d4 instanceof h) && !(c0281d4 instanceof C0278a) && !c0281d4.F && (!W2 || (c0294k = c0281d4.d) == null || (c0296m = c0281d4.f3635e) == null || !c0294k.f3818e.f3800j || !c0296m.f3818e.f3800j)) {
                    int j4 = c0281d4.j(0);
                    int j5 = c0281d4.j(1);
                    boolean z12 = j4 == 3 && c0281d4.f3656r != 1 && j5 == 3 && c0281d4.f3657s != 1;
                    if (!z12 && c0282e2.W(1) && !(c0281d4 instanceof g)) {
                        if (j4 == 3 && c0281d4.f3656r == 0 && j5 != 3 && !c0281d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0281d4.f3657s == 0 && j4 != 3 && !c0281d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0281d4.f3624W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0011l.q(0, c0281d4, c0311f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0311f6.f4044a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1330b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0308c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0011l.w(c0282e2);
        ArrayList arrayList4 = (ArrayList) c0011l.f404b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0011l.u(c0282e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0282e2.f3654p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0282e.q();
            C0282e c0282e5 = (C0282e) c0011l.d;
            int max7 = Math.max(q5, c0282e5.f3631b0);
            int max8 = Math.max(c0282e.k(), c0282e5.f3633c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0281d c0281d5 = (C0281d) arrayList4.get(i36);
                if (c0281d5 instanceof g) {
                    int q6 = c0281d5.q();
                    int k4 = c0281d5.k();
                    i12 = i30;
                    c0311f3 = c0311f;
                    boolean q7 = z15 | c0011l.q(1, c0281d5, c0311f3);
                    int q8 = c0281d5.q();
                    int k5 = c0281d5.k();
                    if (q8 != q6) {
                        c0281d5.O(q8);
                        if (z13 && c0281d5.r() + c0281d5.f3622U > max7) {
                            max7 = Math.max(max7, c0281d5.i(4).e() + c0281d5.r() + c0281d5.f3622U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0281d5.L(k5);
                        if (z14 && c0281d5.s() + c0281d5.f3623V > max8) {
                            max8 = Math.max(max8, c0281d5.i(5).e() + c0281d5.s() + c0281d5.f3623V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0281d5).f3730y0 | z4;
                } else {
                    i12 = i30;
                    c0311f3 = c0311f;
                }
                i36++;
                c0311f = c0311f3;
                i30 = i12;
            }
            int i37 = i30;
            C0311f c0311f7 = c0311f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0281d c0281d6 = (C0281d) arrayList4.get(i39);
                    if (((c0281d6 instanceof i) && !(c0281d6 instanceof g)) || (c0281d6 instanceof h) || c0281d6.f3640g0 == 8 || ((z2 && c0281d6.d.f3818e.f3800j && c0281d6.f3635e.f3818e.f3800j) || (c0281d6 instanceof g))) {
                        c0311f2 = c0311f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0281d6.q();
                        int k6 = c0281d6.k();
                        arrayList = arrayList4;
                        int i40 = c0281d6.f3629a0;
                        i11 = size6;
                        boolean q10 = c0011l.q(i38 == 1 ? 2 : 1, c0281d6, c0311f7) | z15;
                        int q11 = c0281d6.q();
                        c0311f2 = c0311f7;
                        int k7 = c0281d6.k();
                        if (q11 != q9) {
                            c0281d6.O(q11);
                            if (z13 && c0281d6.r() + c0281d6.f3622U > max7) {
                                max7 = Math.max(max7, c0281d6.i(4).e() + c0281d6.r() + c0281d6.f3622U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0281d6.L(k7);
                            if (z14 && c0281d6.s() + c0281d6.f3623V > max8) {
                                max8 = Math.max(max8, c0281d6.i(5).e() + c0281d6.s() + c0281d6.f3623V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0281d6.f3607E || i40 == c0281d6.f3629a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0311f7 = c0311f2;
                }
                C0311f c0311f8 = c0311f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0011l.u(c0282e, i38, i34, i35);
                c0311f7 = c0311f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0282e2 = c0282e;
            i30 = i37;
        }
        c0282e2.f3667D0 = i30;
        C0271c.f3449p = c0282e2.W(512);
    }

    public final void l(C0281d c0281d, C0310e c0310e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1329a.get(i);
        C0281d c0281d2 = (C0281d) sparseArray.get(i);
        if (c0281d2 == null || view == null || !(view.getLayoutParams() instanceof C0310e)) {
            return;
        }
        c0310e.f4012c0 = true;
        if (i2 == 6) {
            C0310e c0310e2 = (C0310e) view.getLayoutParams();
            c0310e2.f4012c0 = true;
            c0310e2.f4033p0.f3607E = true;
        }
        c0281d.i(6).b(c0281d2.i(i2), c0310e.f3985D, c0310e.f3984C, true);
        c0281d.f3607E = true;
        c0281d.i(3).j();
        c0281d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0310e c0310e = (C0310e) childAt.getLayoutParams();
            C0281d c0281d = c0310e.f4033p0;
            if (childAt.getVisibility() != 8 || c0310e.f4013d0 || c0310e.f4015e0 || isInEditMode) {
                int r2 = c0281d.r();
                int s2 = c0281d.s();
                childAt.layout(r2, s2, c0281d.q() + r2, c0281d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1330b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0308c) arrayList.get(i6)).getClass();
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
        C0281d c0281d;
        int i5;
        C0281d c0281d2;
        int i6;
        C0281d c0281d3;
        int i7;
        C0310e c0310e;
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
        C0281d c0281d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1341p == i) {
            int i12 = constraintLayout.f1342q;
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
        constraintLayout.f1341p = i;
        constraintLayout.f1342q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0282e c0282e = constraintLayout.f1331c;
        c0282e.f3680v0 = z3;
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
                    C0281d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1338m == null) {
                                    constraintLayout.f1338m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1338m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1329a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0281d4 = view == null ? null : ((C0310e) view.getLayoutParams()).f4033p0;
                                c0281d4.f3641h0 = resourceName;
                            }
                        }
                        c0281d4 = c0282e;
                        c0281d4.f3641h0 = resourceName;
                    }
                }
                if (constraintLayout.f1337l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1335j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0282e.f3675q0.clear();
                ArrayList arrayList3 = constraintLayout.f1330b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0308c abstractC0308c = (AbstractC0308c) arrayList3.get(i19);
                        if (abstractC0308c.isInEditMode()) {
                            abstractC0308c.setIds(abstractC0308c.f3978e);
                        }
                        i iVar = abstractC0308c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3739r0 = i13;
                            Arrays.fill(iVar.f3738q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0308c.f3976b) {
                                int i21 = abstractC0308c.f3975a[i20];
                                View view2 = (View) constraintLayout.f1329a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0308c.f3980g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0308c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0308c.f3975a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1329a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0308c.d;
                                    C0281d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3739r0 + 1;
                                        C0281d[] c0281dArr = iVar2.f3738q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0281dArr.length) {
                                            iVar2.f3738q0 = (C0281d[]) Arrays.copyOf(c0281dArr, c0281dArr.length * 2);
                                        }
                                        C0281d[] c0281dArr2 = iVar2.f3738q0;
                                        int i23 = iVar2.f3739r0;
                                        c0281dArr2[i23] = h2;
                                        iVar2.f3739r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0308c.d.S();
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
                SparseArray sparseArray = constraintLayout.f1339n;
                sparseArray.clear();
                sparseArray.put(0, c0282e);
                sparseArray.put(getId(), c0282e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0281d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0310e c0310e2 = (C0310e) childAt3.getLayoutParams();
                        c0282e.f3675q0.add(h3);
                        C0281d c0281d5 = h3.f3621T;
                        if (c0281d5 != null) {
                            ((C0282e) c0281d5).f3675q0.remove(h3);
                            h3.C();
                        }
                        h3.f3621T = c0282e;
                        c0310e2.a();
                        h3.f3640g0 = childAt3.getVisibility();
                        h3.f3638f0 = childAt3;
                        if (childAt3 instanceof AbstractC0308c) {
                            ((AbstractC0308c) childAt3).h(h3, c0282e.f3680v0);
                        }
                        if (c0310e2.f4013d0) {
                            h hVar = (h) h3;
                            int i27 = c0310e2.f4028m0;
                            int i28 = c0310e2.n0;
                            float f4 = c0310e2.f4031o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f3732q0 = f4;
                                    hVar.f3733r0 = -1;
                                    hVar.f3734s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f3732q0 = -1.0f;
                                    hVar.f3733r0 = i27;
                                    hVar.f3734s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f3732q0 = -1.0f;
                                hVar.f3733r0 = -1;
                                hVar.f3734s0 = i28;
                            }
                        } else {
                            int i29 = c0310e2.f4017f0;
                            int i30 = c0310e2.f4019g0;
                            int i31 = c0310e2.f4020h0;
                            int i32 = c0310e2.f4021i0;
                            int i33 = c0310e2.j0;
                            i3 = childCount3;
                            int i34 = c0310e2.f4024k0;
                            float f5 = c0310e2.f4026l0;
                            int i35 = c0310e2.f4032p;
                            if (i35 != -1) {
                                C0281d c0281d6 = (C0281d) sparseArray.get(i35);
                                if (c0281d6 != null) {
                                    float f6 = c0310e2.f4035r;
                                    h3.v(7, 7, c0310e2.f4034q, 0, c0281d6);
                                    h3.f3606D = f6;
                                }
                                c0310e = c0310e2;
                            } else {
                                if (i29 != -1) {
                                    C0281d c0281d7 = (C0281d) sparseArray.get(i29);
                                    if (c0281d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0310e2).leftMargin, i33, c0281d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0281d c0281d8 = (C0281d) sparseArray.get(i30);
                                        if (c0281d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0310e2).leftMargin, i33, c0281d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0281d c0281d9 = (C0281d) sparseArray.get(i31);
                                        if (c0281d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0310e2).rightMargin, i34, c0281d9);
                                        }
                                    } else if (i32 != i4 && (c0281d = (C0281d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0310e2).rightMargin, i34, c0281d);
                                    }
                                    i5 = c0310e2.i;
                                    if (i5 == -1) {
                                        C0281d c0281d10 = (C0281d) sparseArray.get(i5);
                                        if (c0281d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0310e2).topMargin, c0310e2.f4041x, c0281d10);
                                        }
                                    } else {
                                        int i36 = c0310e2.f4022j;
                                        if (i36 != -1 && (c0281d2 = (C0281d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0310e2).topMargin, c0310e2.f4041x, c0281d2);
                                        }
                                    }
                                    i6 = c0310e2.f4023k;
                                    if (i6 == -1) {
                                        C0281d c0281d11 = (C0281d) sparseArray.get(i6);
                                        if (c0281d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0310e2).bottomMargin, c0310e2.f4043z, c0281d11);
                                        }
                                    } else {
                                        int i37 = c0310e2.f4025l;
                                        if (i37 != -1 && (c0281d3 = (C0281d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0310e2).bottomMargin, c0310e2.f4043z, c0281d3);
                                        }
                                    }
                                    i7 = c0310e2.f4027m;
                                    if (i7 == -1) {
                                        c0310e = c0310e2;
                                        l(h3, c0310e2, sparseArray, i7, 6);
                                    } else {
                                        c0310e = c0310e2;
                                        int i38 = c0310e.f4029n;
                                        if (i38 != -1) {
                                            l(h3, c0310e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0310e.f4030o;
                                            if (i39 != -1) {
                                                l(h3, c0310e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3634d0 = f5;
                                    }
                                    f2 = c0310e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f3636e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0310e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0310e2.f4023k;
                                if (i6 == -1) {
                                }
                                i7 = c0310e2.f4027m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0310e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0310e.f4000T) != -1 || c0310e.f4001U != -1)) {
                                int i40 = c0310e.f4001U;
                                h3.f3626Y = i11;
                                h3.f3627Z = i40;
                            }
                            if (c0310e.f4008a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0310e).width);
                                if (((ViewGroup.MarginLayoutParams) c0310e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0310e).width == -1) {
                                if (c0310e.f4003W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3602g = ((ViewGroup.MarginLayoutParams) c0310e).leftMargin;
                                h3.i(4).f3602g = ((ViewGroup.MarginLayoutParams) c0310e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0310e.f4010b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0310e).height);
                                if (((ViewGroup.MarginLayoutParams) c0310e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0310e).height == -1) {
                                    if (c0310e.f4004X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3602g = ((ViewGroup.MarginLayoutParams) c0310e).topMargin;
                                    h3.i(5).f3602g = ((ViewGroup.MarginLayoutParams) c0310e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0310e.f3987G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3624W = 0.0f;
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
                                    h3.f3624W = parseFloat;
                                    h3.f3625X = i9;
                                }
                            }
                            float f7 = c0310e.f3988H;
                            float[] fArr = h3.f3645k0;
                            fArr[0] = f7;
                            fArr[1] = c0310e.f3989I;
                            h3.f3642i0 = c0310e.f3990J;
                            h3.j0 = c0310e.f3991K;
                            int i41 = c0310e.f4006Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3655q = i41;
                            }
                            int i42 = c0310e.f3992L;
                            int i43 = c0310e.f3994N;
                            int i44 = c0310e.f3996P;
                            float f8 = c0310e.f3998R;
                            h3.f3656r = i42;
                            h3.f3659u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3660v = i44;
                            h3.f3661w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3656r = 2;
                            }
                            int i45 = c0310e.f3993M;
                            int i46 = c0310e.f3995O;
                            int i47 = c0310e.f3997Q;
                            float f9 = c0310e.f3999S;
                            h3.f3657s = i45;
                            h3.f3662x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3663y = i47;
                            h3.f3664z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3657s = 2;
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
                c0282e.f3676r0.w(c0282e);
            }
        }
        k(c0282e, this.i, i, i2);
        int q2 = c0282e.q();
        int k2 = c0282e.k();
        boolean z4 = c0282e.f3668E0;
        boolean z5 = c0282e.f3669F0;
        C0311f c0311f = this.f1340o;
        int i48 = c0311f.f4047e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0311f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1333f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1334g, resolveSizeAndState2);
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
        C0281d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0310e c0310e = (C0310e) view.getLayoutParams();
            h hVar = new h();
            c0310e.f4033p0 = hVar;
            c0310e.f4013d0 = true;
            hVar.S(c0310e.f4002V);
        }
        if (view instanceof AbstractC0308c) {
            AbstractC0308c abstractC0308c = (AbstractC0308c) view;
            abstractC0308c.i();
            ((C0310e) view.getLayoutParams()).f4015e0 = true;
            ArrayList arrayList = this.f1330b;
            if (!arrayList.contains(abstractC0308c)) {
                arrayList.add(abstractC0308c);
            }
        }
        this.f1329a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1329a.remove(view.getId());
        C0281d h = h(view);
        this.f1331c.f3675q0.remove(h);
        h.C();
        this.f1330b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1335j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1329a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1334g) {
            return;
        }
        this.f1334g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1333f) {
            return;
        }
        this.f1333f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1332e) {
            return;
        }
        this.f1332e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1336k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0282e c0282e = this.f1331c;
        c0282e.f3667D0 = i;
        C0271c.f3449p = c0282e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1329a = new SparseArray();
        this.f1330b = new ArrayList(4);
        this.f1331c = new C0282e();
        this.d = 0;
        this.f1332e = 0;
        this.f1333f = Integer.MAX_VALUE;
        this.f1334g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1335j = null;
        this.f1336k = null;
        this.f1337l = -1;
        this.f1338m = new HashMap();
        this.f1339n = new SparseArray();
        this.f1340o = new C0311f(this, this);
        this.f1341p = 0;
        this.f1342q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0310e c0310e = new C0310e(layoutParams);
        c0310e.f4007a = -1;
        c0310e.f4009b = -1;
        c0310e.f4011c = -1.0f;
        c0310e.d = true;
        c0310e.f4014e = -1;
        c0310e.f4016f = -1;
        c0310e.f4018g = -1;
        c0310e.h = -1;
        c0310e.i = -1;
        c0310e.f4022j = -1;
        c0310e.f4023k = -1;
        c0310e.f4025l = -1;
        c0310e.f4027m = -1;
        c0310e.f4029n = -1;
        c0310e.f4030o = -1;
        c0310e.f4032p = -1;
        c0310e.f4034q = 0;
        c0310e.f4035r = 0.0f;
        c0310e.f4036s = -1;
        c0310e.f4037t = -1;
        c0310e.f4038u = -1;
        c0310e.f4039v = -1;
        c0310e.f4040w = Integer.MIN_VALUE;
        c0310e.f4041x = Integer.MIN_VALUE;
        c0310e.f4042y = Integer.MIN_VALUE;
        c0310e.f4043z = Integer.MIN_VALUE;
        c0310e.f3982A = Integer.MIN_VALUE;
        c0310e.f3983B = Integer.MIN_VALUE;
        c0310e.f3984C = Integer.MIN_VALUE;
        c0310e.f3985D = 0;
        c0310e.f3986E = 0.5f;
        c0310e.F = 0.5f;
        c0310e.f3987G = null;
        c0310e.f3988H = -1.0f;
        c0310e.f3989I = -1.0f;
        c0310e.f3990J = 0;
        c0310e.f3991K = 0;
        c0310e.f3992L = 0;
        c0310e.f3993M = 0;
        c0310e.f3994N = 0;
        c0310e.f3995O = 0;
        c0310e.f3996P = 0;
        c0310e.f3997Q = 0;
        c0310e.f3998R = 1.0f;
        c0310e.f3999S = 1.0f;
        c0310e.f4000T = -1;
        c0310e.f4001U = -1;
        c0310e.f4002V = -1;
        c0310e.f4003W = false;
        c0310e.f4004X = false;
        c0310e.f4005Y = null;
        c0310e.f4006Z = 0;
        c0310e.f4008a0 = true;
        c0310e.f4010b0 = true;
        c0310e.f4012c0 = false;
        c0310e.f4013d0 = false;
        c0310e.f4015e0 = false;
        c0310e.f4017f0 = -1;
        c0310e.f4019g0 = -1;
        c0310e.f4020h0 = -1;
        c0310e.f4021i0 = -1;
        c0310e.j0 = Integer.MIN_VALUE;
        c0310e.f4024k0 = Integer.MIN_VALUE;
        c0310e.f4026l0 = 0.5f;
        c0310e.f4033p0 = new C0281d();
        return c0310e;
    }
}

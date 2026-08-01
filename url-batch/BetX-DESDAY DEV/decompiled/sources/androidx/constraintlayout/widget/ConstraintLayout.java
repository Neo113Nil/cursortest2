package androidx.constraintlayout.widget;

import B.j;
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
import com.luckyarcade.spinthrow.GameConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p1.y;
import q.C0317c;
import s.C0324a;
import s.C0327d;
import s.C0328e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0344o;
import t.C0332c;
import t.C0334e;
import t.C0338i;
import t.C0340k;
import t.C0342m;
import v.AbstractC0349c;
import v.AbstractC0350d;
import v.C0351e;
import v.C0352f;
import v.C0353g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1110r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1111a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1112b;

    /* renamed from: c, reason: collision with root package name */
    public final C0328e f1113c;

    /* renamed from: d, reason: collision with root package name */
    public int f1114d;

    /* renamed from: e, reason: collision with root package name */
    public int f1115e;

    /* renamed from: f, reason: collision with root package name */
    public int f1116f;

    /* renamed from: g, reason: collision with root package name */
    public int f1117g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1118j;

    /* renamed from: k, reason: collision with root package name */
    public j f1119k;

    /* renamed from: l, reason: collision with root package name */
    public int f1120l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1121m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1122n;

    /* renamed from: o, reason: collision with root package name */
    public final C0352f f1123o;

    /* renamed from: p, reason: collision with root package name */
    public int f1124p;

    /* renamed from: q, reason: collision with root package name */
    public int f1125q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1111a = new SparseArray();
        this.f1112b = new ArrayList(4);
        this.f1113c = new C0328e();
        this.f1114d = 0;
        this.f1115e = 0;
        this.f1116f = Integer.MAX_VALUE;
        this.f1117g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1118j = null;
        this.f1119k = null;
        this.f1120l = -1;
        this.f1121m = new HashMap();
        this.f1122n = new SparseArray();
        this.f1123o = new C0352f(this, this);
        this.f1124p = 0;
        this.f1125q = 0;
        i(attributeSet, 0);
    }

    public static C0351e g() {
        C0351e c0351e = new C0351e(-2, -2);
        c0351e.f4281a = -1;
        c0351e.f4283b = -1;
        c0351e.f4285c = -1.0f;
        c0351e.f4287d = true;
        c0351e.f4289e = -1;
        c0351e.f4291f = -1;
        c0351e.f4293g = -1;
        c0351e.h = -1;
        c0351e.i = -1;
        c0351e.f4296j = -1;
        c0351e.f4298k = -1;
        c0351e.f4300l = -1;
        c0351e.f4302m = -1;
        c0351e.f4303n = -1;
        c0351e.f4305o = -1;
        c0351e.f4307p = -1;
        c0351e.f4309q = 0;
        c0351e.f4310r = 0.0f;
        c0351e.f4311s = -1;
        c0351e.f4312t = -1;
        c0351e.f4313u = -1;
        c0351e.f4314v = -1;
        c0351e.f4315w = Integer.MIN_VALUE;
        c0351e.f4316x = Integer.MIN_VALUE;
        c0351e.f4317y = Integer.MIN_VALUE;
        c0351e.f4318z = Integer.MIN_VALUE;
        c0351e.f4256A = Integer.MIN_VALUE;
        c0351e.f4257B = Integer.MIN_VALUE;
        c0351e.f4258C = Integer.MIN_VALUE;
        c0351e.f4259D = 0;
        c0351e.f4260E = 0.5f;
        c0351e.F = 0.5f;
        c0351e.f4261G = null;
        c0351e.f4262H = -1.0f;
        c0351e.f4263I = -1.0f;
        c0351e.f4264J = 0;
        c0351e.f4265K = 0;
        c0351e.f4266L = 0;
        c0351e.f4267M = 0;
        c0351e.f4268N = 0;
        c0351e.f4269O = 0;
        c0351e.f4270P = 0;
        c0351e.f4271Q = 0;
        c0351e.f4272R = 1.0f;
        c0351e.f4273S = 1.0f;
        c0351e.f4274T = -1;
        c0351e.f4275U = -1;
        c0351e.f4276V = -1;
        c0351e.f4277W = false;
        c0351e.f4278X = false;
        c0351e.f4279Y = null;
        c0351e.f4280Z = 0;
        c0351e.f4282a0 = true;
        c0351e.f4284b0 = true;
        c0351e.f4286c0 = false;
        c0351e.f4288d0 = false;
        c0351e.f4290e0 = false;
        c0351e.f4292f0 = -1;
        c0351e.f4294g0 = -1;
        c0351e.f4295h0 = -1;
        c0351e.i0 = -1;
        c0351e.f4297j0 = Integer.MIN_VALUE;
        c0351e.f4299k0 = Integer.MIN_VALUE;
        c0351e.f4301l0 = 0.5f;
        c0351e.f4308p0 = new C0327d();
        return c0351e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1110r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1110r = sVar;
        }
        return f1110r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0351e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1112b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0349c) arrayList.get(i)).getClass();
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
        C0351e c0351e = new C0351e(context, attributeSet);
        c0351e.f4281a = -1;
        c0351e.f4283b = -1;
        c0351e.f4285c = -1.0f;
        c0351e.f4287d = true;
        c0351e.f4289e = -1;
        c0351e.f4291f = -1;
        c0351e.f4293g = -1;
        c0351e.h = -1;
        c0351e.i = -1;
        c0351e.f4296j = -1;
        c0351e.f4298k = -1;
        c0351e.f4300l = -1;
        c0351e.f4302m = -1;
        c0351e.f4303n = -1;
        c0351e.f4305o = -1;
        c0351e.f4307p = -1;
        c0351e.f4309q = 0;
        c0351e.f4310r = 0.0f;
        c0351e.f4311s = -1;
        c0351e.f4312t = -1;
        c0351e.f4313u = -1;
        c0351e.f4314v = -1;
        c0351e.f4315w = Integer.MIN_VALUE;
        c0351e.f4316x = Integer.MIN_VALUE;
        c0351e.f4317y = Integer.MIN_VALUE;
        c0351e.f4318z = Integer.MIN_VALUE;
        c0351e.f4256A = Integer.MIN_VALUE;
        c0351e.f4257B = Integer.MIN_VALUE;
        c0351e.f4258C = Integer.MIN_VALUE;
        c0351e.f4259D = 0;
        c0351e.f4260E = 0.5f;
        c0351e.F = 0.5f;
        c0351e.f4261G = null;
        c0351e.f4262H = -1.0f;
        c0351e.f4263I = -1.0f;
        c0351e.f4264J = 0;
        c0351e.f4265K = 0;
        c0351e.f4266L = 0;
        c0351e.f4267M = 0;
        c0351e.f4268N = 0;
        c0351e.f4269O = 0;
        c0351e.f4270P = 0;
        c0351e.f4271Q = 0;
        c0351e.f4272R = 1.0f;
        c0351e.f4273S = 1.0f;
        c0351e.f4274T = -1;
        c0351e.f4275U = -1;
        c0351e.f4276V = -1;
        c0351e.f4277W = false;
        c0351e.f4278X = false;
        c0351e.f4279Y = null;
        c0351e.f4280Z = 0;
        c0351e.f4282a0 = true;
        c0351e.f4284b0 = true;
        c0351e.f4286c0 = false;
        c0351e.f4288d0 = false;
        c0351e.f4290e0 = false;
        c0351e.f4292f0 = -1;
        c0351e.f4294g0 = -1;
        c0351e.f4295h0 = -1;
        c0351e.i0 = -1;
        c0351e.f4297j0 = Integer.MIN_VALUE;
        c0351e.f4299k0 = Integer.MIN_VALUE;
        c0351e.f4301l0 = 0.5f;
        c0351e.f4308p0 = new C0327d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4442b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0350d.f4255a.get(index);
            switch (i2) {
                case 1:
                    c0351e.f4276V = obtainStyledAttributes.getInt(index, c0351e.f4276V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0351e.f4307p);
                    c0351e.f4307p = resourceId;
                    if (resourceId == -1) {
                        c0351e.f4307p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case GameConfig.COMBO_EVERY /* 3 */:
                    c0351e.f4309q = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4309q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0351e.f4310r) % 360.0f;
                    c0351e.f4310r = f2;
                    if (f2 < 0.0f) {
                        c0351e.f4310r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0351e.f4281a = obtainStyledAttributes.getDimensionPixelOffset(index, c0351e.f4281a);
                    break;
                case 6:
                    c0351e.f4283b = obtainStyledAttributes.getDimensionPixelOffset(index, c0351e.f4283b);
                    break;
                case 7:
                    c0351e.f4285c = obtainStyledAttributes.getFloat(index, c0351e.f4285c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0351e.f4289e);
                    c0351e.f4289e = resourceId2;
                    if (resourceId2 == -1) {
                        c0351e.f4289e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0351e.f4291f);
                    c0351e.f4291f = resourceId3;
                    if (resourceId3 == -1) {
                        c0351e.f4291f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case GameConfig.SCORE_PER_STICK /* 10 */:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0351e.f4293g);
                    c0351e.f4293g = resourceId4;
                    if (resourceId4 == -1) {
                        c0351e.f4293g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0351e.h);
                    c0351e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0351e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0351e.i);
                    c0351e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0351e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0351e.f4296j);
                    c0351e.f4296j = resourceId7;
                    if (resourceId7 == -1) {
                        c0351e.f4296j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0351e.f4298k);
                    c0351e.f4298k = resourceId8;
                    if (resourceId8 == -1) {
                        c0351e.f4298k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0351e.f4300l);
                    c0351e.f4300l = resourceId9;
                    if (resourceId9 == -1) {
                        c0351e.f4300l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0351e.f4302m);
                    c0351e.f4302m = resourceId10;
                    if (resourceId10 == -1) {
                        c0351e.f4302m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0351e.f4311s);
                    c0351e.f4311s = resourceId11;
                    if (resourceId11 == -1) {
                        c0351e.f4311s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0351e.f4312t);
                    c0351e.f4312t = resourceId12;
                    if (resourceId12 == -1) {
                        c0351e.f4312t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0351e.f4313u);
                    c0351e.f4313u = resourceId13;
                    if (resourceId13 == -1) {
                        c0351e.f4313u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0351e.f4314v);
                    c0351e.f4314v = resourceId14;
                    if (resourceId14 == -1) {
                        c0351e.f4314v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0351e.f4315w = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4315w);
                    break;
                case 22:
                    c0351e.f4316x = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4316x);
                    break;
                case 23:
                    c0351e.f4317y = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4317y);
                    break;
                case 24:
                    c0351e.f4318z = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4318z);
                    break;
                case 25:
                    c0351e.f4256A = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4256A);
                    break;
                case 26:
                    c0351e.f4257B = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4257B);
                    break;
                case 27:
                    c0351e.f4277W = obtainStyledAttributes.getBoolean(index, c0351e.f4277W);
                    break;
                case 28:
                    c0351e.f4278X = obtainStyledAttributes.getBoolean(index, c0351e.f4278X);
                    break;
                case 29:
                    c0351e.f4260E = obtainStyledAttributes.getFloat(index, c0351e.f4260E);
                    break;
                case 30:
                    c0351e.F = obtainStyledAttributes.getFloat(index, c0351e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0351e.f4266L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0351e.f4267M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0351e.f4268N = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4268N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0351e.f4268N) == -2) {
                            c0351e.f4268N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0351e.f4270P = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4270P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0351e.f4270P) == -2) {
                            c0351e.f4270P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0351e.f4272R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0351e.f4272R));
                    c0351e.f4266L = 2;
                    break;
                case 36:
                    try {
                        c0351e.f4269O = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4269O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0351e.f4269O) == -2) {
                            c0351e.f4269O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0351e.f4271Q = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4271Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0351e.f4271Q) == -2) {
                            c0351e.f4271Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0351e.f4273S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0351e.f4273S));
                    c0351e.f4267M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0351e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0351e.f4262H = obtainStyledAttributes.getFloat(index, c0351e.f4262H);
                            break;
                        case 46:
                            c0351e.f4263I = obtainStyledAttributes.getFloat(index, c0351e.f4263I);
                            break;
                        case 47:
                            c0351e.f4264J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0351e.f4265K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0351e.f4274T = obtainStyledAttributes.getDimensionPixelOffset(index, c0351e.f4274T);
                            break;
                        case 50:
                            c0351e.f4275U = obtainStyledAttributes.getDimensionPixelOffset(index, c0351e.f4275U);
                            break;
                        case 51:
                            c0351e.f4279Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0351e.f4303n);
                            c0351e.f4303n = resourceId15;
                            if (resourceId15 == -1) {
                                c0351e.f4303n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0351e.f4305o);
                            c0351e.f4305o = resourceId16;
                            if (resourceId16 == -1) {
                                c0351e.f4305o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0351e.f4259D = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4259D);
                            break;
                        case 55:
                            c0351e.f4258C = obtainStyledAttributes.getDimensionPixelSize(index, c0351e.f4258C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0351e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0351e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0351e.f4280Z = obtainStyledAttributes.getInt(index, c0351e.f4280Z);
                                    break;
                                case 67:
                                    c0351e.f4287d = obtainStyledAttributes.getBoolean(index, c0351e.f4287d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0351e.a();
        return c0351e;
    }

    public int getMaxHeight() {
        return this.f1117g;
    }

    public int getMaxWidth() {
        return this.f1116f;
    }

    public int getMinHeight() {
        return this.f1115e;
    }

    public int getMinWidth() {
        return this.f1114d;
    }

    public int getOptimizationLevel() {
        return this.f1113c.f4074D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0328e c0328e = this.f1113c;
        if (c0328e.f4049j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0328e.f4049j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0328e.f4049j = "parent";
            }
        }
        if (c0328e.f4048h0 == null) {
            c0328e.f4048h0 = c0328e.f4049j;
            Log.v("ConstraintLayout", " setDebugName " + c0328e.f4048h0);
        }
        Iterator it = c0328e.f4083q0.iterator();
        while (it.hasNext()) {
            C0327d c0327d = (C0327d) it.next();
            View view = c0327d.f4045f0;
            if (view != null) {
                if (c0327d.f4049j == null && (id = view.getId()) != -1) {
                    c0327d.f4049j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0327d.f4048h0 == null) {
                    c0327d.f4048h0 = c0327d.f4049j;
                    Log.v("ConstraintLayout", " setDebugName " + c0327d.f4048h0);
                }
            }
        }
        c0328e.n(sb);
        return sb.toString();
    }

    public final C0327d h(View view) {
        if (view == this) {
            return this.f1113c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0351e) {
            return ((C0351e) view.getLayoutParams()).f4308p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0351e) {
            return ((C0351e) view.getLayoutParams()).f4308p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0328e c0328e = this.f1113c;
        c0328e.f4045f0 = this;
        C0352f c0352f = this.f1123o;
        c0328e.f4087u0 = c0352f;
        c0328e.f4085s0.f4170f = c0352f;
        this.f1111a.put(getId(), this);
        this.f1118j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4442b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1114d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1114d);
                } else if (index == 17) {
                    this.f1115e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1115e);
                } else if (index == 14) {
                    this.f1116f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1116f);
                } else if (index == 15) {
                    this.f1117g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1117g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1119k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1118j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1118j = null;
                    }
                    this.f1120l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0328e.f4074D0 = this.i;
        C0317c.f3906p = c0328e.W(512);
    }

    public final void j(int i) {
        int eventType;
        y yVar;
        Context context = getContext();
        j jVar = new j(16, false);
        jVar.f36b = new SparseArray();
        jVar.f37c = new SparseArray();
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
                this.f1119k = jVar;
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
                    ((SparseArray) jVar.f36b).put(yVar.f3887a, yVar);
                } else if (c2 == 3) {
                    C0353g c0353g = new C0353g(context, xml);
                    if (yVar != null) {
                        ((ArrayList) yVar.f3889c).add(c0353g);
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
    public final void k(C0328e c0328e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0352f c0352f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0352f c0352f2;
        int i12;
        C0352f c0352f3;
        boolean z4;
        C0340k c0340k;
        C0342m c0342m;
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
        C0328e c0328e2 = c0328e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0352f c0352f4 = this.f1123o;
        c0352f4.f4320b = max3;
        c0352f4.f4321c = max4;
        c0352f4.f4322d = paddingWidth;
        c0352f4.f4323e = i19;
        c0352f4.f4324f = i2;
        c0352f4.f4325g = i3;
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
        int i23 = c0352f4.f4323e;
        int i24 = c0352f4.f4322d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1116f - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f1114d);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f1114d);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1117g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1115e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1115e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0328e.q();
        C0334e c0334e = c0328e2.f4085s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0328e.k()) {
            c0334e.f4167c = true;
        }
        c0328e2.f4032Y = 0;
        c0328e2.f4033Z = 0;
        int i26 = this.f1116f - i24;
        int[] iArr = c0328e2.f4011C;
        iArr[0] = i26;
        iArr[1] = this.f1117g - i23;
        c0328e2.f4037b0 = 0;
        c0328e2.f4039c0 = 0;
        c0328e2.M(i20);
        c0328e2.O(i25);
        c0328e2.N(i6);
        c0328e2.L(i5);
        int i27 = this.f1114d - i24;
        if (i27 < 0) {
            c0328e2.f4037b0 = 0;
        } else {
            c0328e2.f4037b0 = i27;
        }
        int i28 = this.f1115e - i23;
        if (i28 < 0) {
            c0328e2.f4039c0 = 0;
        } else {
            c0328e2.f4039c0 = i28;
        }
        c0328e2.x0 = max5;
        c0328e2.f4090y0 = max3;
        T.r rVar = c0328e2.f4084r0;
        rVar.getClass();
        C0352f c0352f5 = c0328e2.f4087u0;
        int size3 = c0328e2.f4083q0.size();
        int q3 = c0328e.q();
        int k2 = c0328e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0327d c0327d = (C0327d) c0328e2.f4083q0.get(i29);
                int[] iArr2 = c0327d.f4061p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0327d.f4030W > 0.0f;
                if ((c0327d.x() && z8) || ((c0327d.y() && z8) || (c0327d instanceof g) || c0327d.x() || c0327d.y())) {
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
            if (mode == 1073741824 && c0328e.q() != min) {
                c0328e2.O(min);
                c0328e2.f4085s0.f4166b = true;
            }
            if (mode2 == 1073741824 && c0328e.k() != min2) {
                c0328e2.L(min2);
                c0328e2.f4085s0.f4166b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0334e.f4166b;
                C0328e c0328e3 = c0334e.f4165a;
                if (z10 || c0334e.f4167c) {
                    Iterator it3 = c0328e3.f4083q0.iterator();
                    while (it3.hasNext()) {
                        C0327d c0327d2 = (C0327d) it3.next();
                        c0327d2.h();
                        c0327d2.f4034a = false;
                        c0327d2.f4040d.n();
                        c0327d2.f4042e.m();
                    }
                    i15 = 0;
                    c0328e3.h();
                    c0328e3.f4034a = false;
                    c0328e3.f4040d.n();
                    c0328e3.f4042e.m();
                    c0334e.f4167c = false;
                } else {
                    i15 = 0;
                }
                c0334e.b(c0334e.f4168d);
                c0328e3.f4032Y = i15;
                c0328e3.f4033Z = i15;
                int j2 = c0328e3.j(i15);
                int j3 = c0328e3.j(1);
                if (c0334e.f4166b) {
                    c0334e.c();
                }
                int r2 = c0328e3.r();
                int s2 = c0328e3.s();
                z2 = z9;
                c0328e3.f4040d.h.d(r2);
                c0328e3.f4042e.h.d(s2);
                c0334e.g();
                ArrayList arrayList2 = c0334e.f4169e;
                c0352f = c0352f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0344o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0328e3.M(1);
                        i8 = q3;
                        c0328e3.O(c0334e.d(c0328e3, 0));
                        c0328e3.f4040d.f4199e.d(c0328e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0328e3.N(1);
                        c0328e3.L(c0334e.d(c0328e3, 1));
                        c0328e3.f4042e.f4199e.d(c0328e3.k());
                        int[] iArr3 = c0328e3.f4061p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0328e3.q() + r2;
                            c0328e3.f4040d.i.d(q4);
                            c0328e3.f4040d.f4199e.d(q4 - r2);
                            c0334e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0328e3.k() + s2;
                                c0328e3.f4042e.i.d(k3);
                                c0328e3.f4042e.f4199e.d(k3 - s2);
                            }
                            c0334e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0344o abstractC0344o = (AbstractC0344o) it.next();
                            if (abstractC0344o.f4196b != c0328e3 || abstractC0344o.f4201g) {
                                abstractC0344o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0344o abstractC0344o2 = (AbstractC0344o) it2.next();
                            if (z5 || abstractC0344o2.f4196b != c0328e3) {
                                if (!abstractC0344o2.h.f4179j || ((!abstractC0344o2.i.f4179j && !(abstractC0344o2 instanceof C0338i)) || (!abstractC0344o2.f4199e.f4179j && !(abstractC0344o2 instanceof C0332c) && !(abstractC0344o2 instanceof C0338i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0328e3.M(j2);
                        c0328e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0328e3.f4061p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0328e3.q() + r2;
                c0328e3.f4040d.i.d(q42);
                c0328e3.f4040d.f4199e.d(q42 - r2);
                c0334e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0328e3.k() + s2;
                c0328e3.f4042e.i.d(k32);
                c0328e3.f4042e.f4199e.d(k32 - s2);
                c0334e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0328e3.M(j2);
                c0328e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0352f = c0352f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0334e.f4166b;
                C0328e c0328e4 = c0334e.f4165a;
                if (z11) {
                    Iterator it5 = c0328e4.f4083q0.iterator();
                    while (it5.hasNext()) {
                        C0327d c0327d3 = (C0327d) it5.next();
                        c0327d3.h();
                        c0327d3.f4034a = false;
                        C0340k c0340k2 = c0327d3.f4040d;
                        c0340k2.f4199e.f4179j = false;
                        c0340k2.f4201g = false;
                        c0340k2.n();
                        C0342m c0342m2 = c0327d3.f4042e;
                        c0342m2.f4199e.f4179j = false;
                        c0342m2.f4201g = false;
                        c0342m2.m();
                    }
                    i13 = 0;
                    c0328e4.h();
                    c0328e4.f4034a = false;
                    C0340k c0340k3 = c0328e4.f4040d;
                    c0340k3.f4199e.f4179j = false;
                    c0340k3.f4201g = false;
                    c0340k3.n();
                    C0342m c0342m3 = c0328e4.f4042e;
                    c0342m3.f4199e.f4179j = false;
                    c0342m3.f4201g = false;
                    c0342m3.m();
                    c0334e.c();
                } else {
                    i13 = 0;
                }
                c0334e.b(c0334e.f4168d);
                c0328e4.f4032Y = i13;
                c0328e4.f4033Z = i13;
                c0328e4.f4040d.h.d(i13);
                c0328e4.f4042e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0328e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0328e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0328e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0352f = c0352f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0328e2.f4074D0;
        if (size3 > 0) {
            int size4 = c0328e2.f4083q0.size();
            boolean W2 = c0328e2.W(64);
            C0352f c0352f6 = c0328e2.f4087u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0327d c0327d4 = (C0327d) c0328e2.f4083q0.get(i31);
                if (!(c0327d4 instanceof h) && !(c0327d4 instanceof C0324a) && !c0327d4.F && (!W2 || (c0340k = c0327d4.f4040d) == null || (c0342m = c0327d4.f4042e) == null || !c0340k.f4199e.f4179j || !c0342m.f4199e.f4179j)) {
                    int j4 = c0327d4.j(0);
                    int j5 = c0327d4.j(1);
                    boolean z12 = j4 == 3 && c0327d4.f4063r != 1 && j5 == 3 && c0327d4.f4064s != 1;
                    if (!z12 && c0328e2.W(1) && !(c0327d4 instanceof g)) {
                        if (j4 == 3 && c0327d4.f4063r == 0 && j5 != 3 && !c0327d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0327d4.f4064s == 0 && j4 != 3 && !c0327d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0327d4.f4030W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                rVar.q(0, c0327d4, c0352f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0352f6.f4319a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1112b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0349c) arrayList3.get(i33)).getClass();
                }
            }
        }
        rVar.w(c0328e2);
        ArrayList arrayList4 = (ArrayList) rVar.f811b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            rVar.u(c0328e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0328e2.f4061p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0328e.q();
            C0328e c0328e5 = (C0328e) rVar.f813d;
            int max7 = Math.max(q5, c0328e5.f4037b0);
            int max8 = Math.max(c0328e.k(), c0328e5.f4039c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0327d c0327d5 = (C0327d) arrayList4.get(i36);
                if (c0327d5 instanceof g) {
                    int q6 = c0327d5.q();
                    int k4 = c0327d5.k();
                    i12 = i30;
                    c0352f3 = c0352f;
                    boolean q7 = z15 | rVar.q(1, c0327d5, c0352f3);
                    int q8 = c0327d5.q();
                    int k5 = c0327d5.k();
                    if (q8 != q6) {
                        c0327d5.O(q8);
                        if (z13 && c0327d5.r() + c0327d5.f4028U > max7) {
                            max7 = Math.max(max7, c0327d5.i(4).e() + c0327d5.r() + c0327d5.f4028U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0327d5.L(k5);
                        if (z14 && c0327d5.s() + c0327d5.f4029V > max8) {
                            max8 = Math.max(max8, c0327d5.i(5).e() + c0327d5.s() + c0327d5.f4029V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0327d5).f4138y0 | z4;
                } else {
                    i12 = i30;
                    c0352f3 = c0352f;
                }
                i36++;
                c0352f = c0352f3;
                i30 = i12;
            }
            int i37 = i30;
            C0352f c0352f7 = c0352f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0327d c0327d6 = (C0327d) arrayList4.get(i39);
                    if (((c0327d6 instanceof i) && !(c0327d6 instanceof g)) || (c0327d6 instanceof h) || c0327d6.f4047g0 == 8 || ((z2 && c0327d6.f4040d.f4199e.f4179j && c0327d6.f4042e.f4199e.f4179j) || (c0327d6 instanceof g))) {
                        c0352f2 = c0352f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0327d6.q();
                        int k6 = c0327d6.k();
                        arrayList = arrayList4;
                        int i40 = c0327d6.f4035a0;
                        i11 = size6;
                        boolean q10 = rVar.q(i38 == 1 ? 2 : 1, c0327d6, c0352f7) | z15;
                        int q11 = c0327d6.q();
                        c0352f2 = c0352f7;
                        int k7 = c0327d6.k();
                        if (q11 != q9) {
                            c0327d6.O(q11);
                            if (z13 && c0327d6.r() + c0327d6.f4028U > max7) {
                                max7 = Math.max(max7, c0327d6.i(4).e() + c0327d6.r() + c0327d6.f4028U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0327d6.L(k7);
                            if (z14 && c0327d6.s() + c0327d6.f4029V > max8) {
                                max8 = Math.max(max8, c0327d6.i(5).e() + c0327d6.s() + c0327d6.f4029V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0327d6.f4013E || i40 == c0327d6.f4035a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0352f7 = c0352f2;
                }
                C0352f c0352f8 = c0352f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                rVar.u(c0328e, i38, i34, i35);
                c0352f7 = c0352f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0328e2 = c0328e;
            i30 = i37;
        }
        c0328e2.f4074D0 = i30;
        C0317c.f3906p = c0328e2.W(512);
    }

    public final void l(C0327d c0327d, C0351e c0351e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1111a.get(i);
        C0327d c0327d2 = (C0327d) sparseArray.get(i);
        if (c0327d2 == null || view == null || !(view.getLayoutParams() instanceof C0351e)) {
            return;
        }
        c0351e.f4286c0 = true;
        if (i2 == 6) {
            C0351e c0351e2 = (C0351e) view.getLayoutParams();
            c0351e2.f4286c0 = true;
            c0351e2.f4308p0.f4013E = true;
        }
        c0327d.i(6).b(c0327d2.i(i2), c0351e.f4259D, c0351e.f4258C, true);
        c0327d.f4013E = true;
        c0327d.i(3).j();
        c0327d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0351e c0351e = (C0351e) childAt.getLayoutParams();
            C0327d c0327d = c0351e.f4308p0;
            if (childAt.getVisibility() != 8 || c0351e.f4288d0 || c0351e.f4290e0 || isInEditMode) {
                int r2 = c0327d.r();
                int s2 = c0327d.s();
                childAt.layout(r2, s2, c0327d.q() + r2, c0327d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1112b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0349c) arrayList.get(i6)).getClass();
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
        C0327d c0327d;
        int i5;
        C0327d c0327d2;
        int i6;
        C0327d c0327d3;
        int i7;
        C0351e c0351e;
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
        C0327d c0327d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1124p == i) {
            int i12 = constraintLayout.f1125q;
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
        constraintLayout.f1124p = i;
        constraintLayout.f1125q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0328e c0328e = constraintLayout.f1113c;
        c0328e.f4088v0 = z3;
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
                    C0327d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1121m == null) {
                                    constraintLayout.f1121m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1121m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1111a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0327d4 = view == null ? null : ((C0351e) view.getLayoutParams()).f4308p0;
                                c0327d4.f4048h0 = resourceName;
                            }
                        }
                        c0327d4 = c0328e;
                        c0327d4.f4048h0 = resourceName;
                    }
                }
                if (constraintLayout.f1120l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1118j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0328e.f4083q0.clear();
                ArrayList arrayList3 = constraintLayout.f1112b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0349c abstractC0349c = (AbstractC0349c) arrayList3.get(i19);
                        if (abstractC0349c.isInEditMode()) {
                            abstractC0349c.setIds(abstractC0349c.f4252e);
                        }
                        i iVar = abstractC0349c.f4251d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f4147r0 = i13;
                            Arrays.fill(iVar.f4146q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0349c.f4249b) {
                                int i21 = abstractC0349c.f4248a[i20];
                                View view2 = (View) constraintLayout.f1111a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0349c.f4254g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0349c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0349c.f4248a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1111a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0349c.f4251d;
                                    C0327d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f4147r0 + 1;
                                        C0327d[] c0327dArr = iVar2.f4146q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0327dArr.length) {
                                            iVar2.f4146q0 = (C0327d[]) Arrays.copyOf(c0327dArr, c0327dArr.length * 2);
                                        }
                                        C0327d[] c0327dArr2 = iVar2.f4146q0;
                                        int i23 = iVar2.f4147r0;
                                        c0327dArr2[i23] = h2;
                                        iVar2.f4147r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0349c.f4251d.S();
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
                SparseArray sparseArray = constraintLayout.f1122n;
                sparseArray.clear();
                sparseArray.put(0, c0328e);
                sparseArray.put(getId(), c0328e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0327d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0351e c0351e2 = (C0351e) childAt3.getLayoutParams();
                        c0328e.f4083q0.add(h3);
                        C0327d c0327d5 = h3.f4027T;
                        if (c0327d5 != null) {
                            ((C0328e) c0327d5).f4083q0.remove(h3);
                            h3.C();
                        }
                        h3.f4027T = c0328e;
                        c0351e2.a();
                        h3.f4047g0 = childAt3.getVisibility();
                        h3.f4045f0 = childAt3;
                        if (childAt3 instanceof AbstractC0349c) {
                            ((AbstractC0349c) childAt3).h(h3, c0328e.f4088v0);
                        }
                        if (c0351e2.f4288d0) {
                            h hVar = (h) h3;
                            int i27 = c0351e2.m0;
                            int i28 = c0351e2.f4304n0;
                            float f4 = c0351e2.f4306o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f4140q0 = f4;
                                    hVar.f4141r0 = -1;
                                    hVar.f4142s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f4140q0 = -1.0f;
                                    hVar.f4141r0 = i27;
                                    hVar.f4142s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f4140q0 = -1.0f;
                                hVar.f4141r0 = -1;
                                hVar.f4142s0 = i28;
                            }
                        } else {
                            int i29 = c0351e2.f4292f0;
                            int i30 = c0351e2.f4294g0;
                            int i31 = c0351e2.f4295h0;
                            int i32 = c0351e2.i0;
                            int i33 = c0351e2.f4297j0;
                            i3 = childCount3;
                            int i34 = c0351e2.f4299k0;
                            float f5 = c0351e2.f4301l0;
                            int i35 = c0351e2.f4307p;
                            if (i35 != -1) {
                                C0327d c0327d6 = (C0327d) sparseArray.get(i35);
                                if (c0327d6 != null) {
                                    float f6 = c0351e2.f4310r;
                                    h3.v(7, 7, c0351e2.f4309q, 0, c0327d6);
                                    h3.f4012D = f6;
                                }
                                c0351e = c0351e2;
                            } else {
                                if (i29 != -1) {
                                    C0327d c0327d7 = (C0327d) sparseArray.get(i29);
                                    if (c0327d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0351e2).leftMargin, i33, c0327d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0327d c0327d8 = (C0327d) sparseArray.get(i30);
                                        if (c0327d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0351e2).leftMargin, i33, c0327d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0327d c0327d9 = (C0327d) sparseArray.get(i31);
                                        if (c0327d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0351e2).rightMargin, i34, c0327d9);
                                        }
                                    } else if (i32 != i4 && (c0327d = (C0327d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0351e2).rightMargin, i34, c0327d);
                                    }
                                    i5 = c0351e2.i;
                                    if (i5 == -1) {
                                        C0327d c0327d10 = (C0327d) sparseArray.get(i5);
                                        if (c0327d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0351e2).topMargin, c0351e2.f4316x, c0327d10);
                                        }
                                    } else {
                                        int i36 = c0351e2.f4296j;
                                        if (i36 != -1 && (c0327d2 = (C0327d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0351e2).topMargin, c0351e2.f4316x, c0327d2);
                                        }
                                    }
                                    i6 = c0351e2.f4298k;
                                    if (i6 == -1) {
                                        C0327d c0327d11 = (C0327d) sparseArray.get(i6);
                                        if (c0327d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0351e2).bottomMargin, c0351e2.f4318z, c0327d11);
                                        }
                                    } else {
                                        int i37 = c0351e2.f4300l;
                                        if (i37 != -1 && (c0327d3 = (C0327d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0351e2).bottomMargin, c0351e2.f4318z, c0327d3);
                                        }
                                    }
                                    i7 = c0351e2.f4302m;
                                    if (i7 == -1) {
                                        c0351e = c0351e2;
                                        l(h3, c0351e2, sparseArray, i7, 6);
                                    } else {
                                        c0351e = c0351e2;
                                        int i38 = c0351e.f4303n;
                                        if (i38 != -1) {
                                            l(h3, c0351e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0351e.f4305o;
                                            if (i39 != -1) {
                                                l(h3, c0351e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f4041d0 = f5;
                                    }
                                    f2 = c0351e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f4043e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0351e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0351e2.f4298k;
                                if (i6 == -1) {
                                }
                                i7 = c0351e2.f4302m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0351e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0351e.f4274T) != -1 || c0351e.f4275U != -1)) {
                                int i40 = c0351e.f4275U;
                                h3.f4032Y = i11;
                                h3.f4033Z = i40;
                            }
                            if (c0351e.f4282a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0351e).width);
                                if (((ViewGroup.MarginLayoutParams) c0351e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0351e).width == -1) {
                                if (c0351e.f4277W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f4008g = ((ViewGroup.MarginLayoutParams) c0351e).leftMargin;
                                h3.i(4).f4008g = ((ViewGroup.MarginLayoutParams) c0351e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0351e.f4284b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0351e).height);
                                if (((ViewGroup.MarginLayoutParams) c0351e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0351e).height == -1) {
                                    if (c0351e.f4278X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f4008g = ((ViewGroup.MarginLayoutParams) c0351e).topMargin;
                                    h3.i(5).f4008g = ((ViewGroup.MarginLayoutParams) c0351e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0351e.f4261G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f4030W = 0.0f;
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
                                    h3.f4030W = parseFloat;
                                    h3.f4031X = i9;
                                }
                            }
                            float f7 = c0351e.f4262H;
                            float[] fArr = h3.f4052k0;
                            fArr[0] = f7;
                            fArr[1] = c0351e.f4263I;
                            h3.i0 = c0351e.f4264J;
                            h3.f4050j0 = c0351e.f4265K;
                            int i41 = c0351e.f4280Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f4062q = i41;
                            }
                            int i42 = c0351e.f4266L;
                            int i43 = c0351e.f4268N;
                            int i44 = c0351e.f4270P;
                            float f8 = c0351e.f4272R;
                            h3.f4063r = i42;
                            h3.f4066u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f4067v = i44;
                            h3.f4068w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f4063r = 2;
                            }
                            int i45 = c0351e.f4267M;
                            int i46 = c0351e.f4269O;
                            int i47 = c0351e.f4271Q;
                            float f9 = c0351e.f4273S;
                            h3.f4064s = i45;
                            h3.f4069x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f4070y = i47;
                            h3.f4071z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f4064s = 2;
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
                c0328e.f4084r0.w(c0328e);
            }
        }
        k(c0328e, this.i, i, i2);
        int q2 = c0328e.q();
        int k2 = c0328e.k();
        boolean z4 = c0328e.f4075E0;
        boolean z5 = c0328e.f4076F0;
        C0352f c0352f = this.f1123o;
        int i48 = c0352f.f4323e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0352f.f4322d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1116f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1117g, resolveSizeAndState2);
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
        C0327d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0351e c0351e = (C0351e) view.getLayoutParams();
            h hVar = new h();
            c0351e.f4308p0 = hVar;
            c0351e.f4288d0 = true;
            hVar.S(c0351e.f4276V);
        }
        if (view instanceof AbstractC0349c) {
            AbstractC0349c abstractC0349c = (AbstractC0349c) view;
            abstractC0349c.i();
            ((C0351e) view.getLayoutParams()).f4290e0 = true;
            ArrayList arrayList = this.f1112b;
            if (!arrayList.contains(abstractC0349c)) {
                arrayList.add(abstractC0349c);
            }
        }
        this.f1111a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1111a.remove(view.getId());
        C0327d h = h(view);
        this.f1113c.f4083q0.remove(h);
        h.C();
        this.f1112b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1118j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1111a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1117g) {
            return;
        }
        this.f1117g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1116f) {
            return;
        }
        this.f1116f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1115e) {
            return;
        }
        this.f1115e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1114d) {
            return;
        }
        this.f1114d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1119k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0328e c0328e = this.f1113c;
        c0328e.f4074D0 = i;
        C0317c.f3906p = c0328e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1111a = new SparseArray();
        this.f1112b = new ArrayList(4);
        this.f1113c = new C0328e();
        this.f1114d = 0;
        this.f1115e = 0;
        this.f1116f = Integer.MAX_VALUE;
        this.f1117g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1118j = null;
        this.f1119k = null;
        this.f1120l = -1;
        this.f1121m = new HashMap();
        this.f1122n = new SparseArray();
        this.f1123o = new C0352f(this, this);
        this.f1124p = 0;
        this.f1125q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0351e c0351e = new C0351e(layoutParams);
        c0351e.f4281a = -1;
        c0351e.f4283b = -1;
        c0351e.f4285c = -1.0f;
        c0351e.f4287d = true;
        c0351e.f4289e = -1;
        c0351e.f4291f = -1;
        c0351e.f4293g = -1;
        c0351e.h = -1;
        c0351e.i = -1;
        c0351e.f4296j = -1;
        c0351e.f4298k = -1;
        c0351e.f4300l = -1;
        c0351e.f4302m = -1;
        c0351e.f4303n = -1;
        c0351e.f4305o = -1;
        c0351e.f4307p = -1;
        c0351e.f4309q = 0;
        c0351e.f4310r = 0.0f;
        c0351e.f4311s = -1;
        c0351e.f4312t = -1;
        c0351e.f4313u = -1;
        c0351e.f4314v = -1;
        c0351e.f4315w = Integer.MIN_VALUE;
        c0351e.f4316x = Integer.MIN_VALUE;
        c0351e.f4317y = Integer.MIN_VALUE;
        c0351e.f4318z = Integer.MIN_VALUE;
        c0351e.f4256A = Integer.MIN_VALUE;
        c0351e.f4257B = Integer.MIN_VALUE;
        c0351e.f4258C = Integer.MIN_VALUE;
        c0351e.f4259D = 0;
        c0351e.f4260E = 0.5f;
        c0351e.F = 0.5f;
        c0351e.f4261G = null;
        c0351e.f4262H = -1.0f;
        c0351e.f4263I = -1.0f;
        c0351e.f4264J = 0;
        c0351e.f4265K = 0;
        c0351e.f4266L = 0;
        c0351e.f4267M = 0;
        c0351e.f4268N = 0;
        c0351e.f4269O = 0;
        c0351e.f4270P = 0;
        c0351e.f4271Q = 0;
        c0351e.f4272R = 1.0f;
        c0351e.f4273S = 1.0f;
        c0351e.f4274T = -1;
        c0351e.f4275U = -1;
        c0351e.f4276V = -1;
        c0351e.f4277W = false;
        c0351e.f4278X = false;
        c0351e.f4279Y = null;
        c0351e.f4280Z = 0;
        c0351e.f4282a0 = true;
        c0351e.f4284b0 = true;
        c0351e.f4286c0 = false;
        c0351e.f4288d0 = false;
        c0351e.f4290e0 = false;
        c0351e.f4292f0 = -1;
        c0351e.f4294g0 = -1;
        c0351e.f4295h0 = -1;
        c0351e.i0 = -1;
        c0351e.f4297j0 = Integer.MIN_VALUE;
        c0351e.f4299k0 = Integer.MIN_VALUE;
        c0351e.f4301l0 = 0.5f;
        c0351e.f4308p0 = new C0327d();
        return c0351e;
    }
}

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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p1.y;
import q.C0315c;
import s.C0322a;
import s.C0325d;
import s.C0326e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0342o;
import t.C0330c;
import t.C0332e;
import t.C0336i;
import t.C0338k;
import t.C0340m;
import v.AbstractC0347c;
import v.AbstractC0348d;
import v.C0349e;
import v.C0350f;
import v.C0351g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1109r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1110a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1111b;

    /* renamed from: c, reason: collision with root package name */
    public final C0326e f1112c;

    /* renamed from: d, reason: collision with root package name */
    public int f1113d;

    /* renamed from: e, reason: collision with root package name */
    public int f1114e;

    /* renamed from: f, reason: collision with root package name */
    public int f1115f;

    /* renamed from: g, reason: collision with root package name */
    public int f1116g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1117j;

    /* renamed from: k, reason: collision with root package name */
    public j f1118k;

    /* renamed from: l, reason: collision with root package name */
    public int f1119l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1120m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1121n;

    /* renamed from: o, reason: collision with root package name */
    public final C0350f f1122o;

    /* renamed from: p, reason: collision with root package name */
    public int f1123p;

    /* renamed from: q, reason: collision with root package name */
    public int f1124q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1110a = new SparseArray();
        this.f1111b = new ArrayList(4);
        this.f1112c = new C0326e();
        this.f1113d = 0;
        this.f1114e = 0;
        this.f1115f = Integer.MAX_VALUE;
        this.f1116g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1117j = null;
        this.f1118k = null;
        this.f1119l = -1;
        this.f1120m = new HashMap();
        this.f1121n = new SparseArray();
        this.f1122o = new C0350f(this, this);
        this.f1123p = 0;
        this.f1124q = 0;
        i(attributeSet, 0);
    }

    public static C0349e g() {
        C0349e c0349e = new C0349e(-2, -2);
        c0349e.f4277a = -1;
        c0349e.f4279b = -1;
        c0349e.f4281c = -1.0f;
        c0349e.f4283d = true;
        c0349e.f4285e = -1;
        c0349e.f4287f = -1;
        c0349e.f4289g = -1;
        c0349e.h = -1;
        c0349e.i = -1;
        c0349e.f4292j = -1;
        c0349e.f4294k = -1;
        c0349e.f4296l = -1;
        c0349e.f4298m = -1;
        c0349e.f4299n = -1;
        c0349e.f4301o = -1;
        c0349e.f4303p = -1;
        c0349e.f4305q = 0;
        c0349e.f4306r = 0.0f;
        c0349e.f4307s = -1;
        c0349e.f4308t = -1;
        c0349e.f4309u = -1;
        c0349e.f4310v = -1;
        c0349e.f4311w = Integer.MIN_VALUE;
        c0349e.f4312x = Integer.MIN_VALUE;
        c0349e.f4313y = Integer.MIN_VALUE;
        c0349e.f4314z = Integer.MIN_VALUE;
        c0349e.f4252A = Integer.MIN_VALUE;
        c0349e.f4253B = Integer.MIN_VALUE;
        c0349e.f4254C = Integer.MIN_VALUE;
        c0349e.f4255D = 0;
        c0349e.f4256E = 0.5f;
        c0349e.F = 0.5f;
        c0349e.f4257G = null;
        c0349e.f4258H = -1.0f;
        c0349e.f4259I = -1.0f;
        c0349e.f4260J = 0;
        c0349e.f4261K = 0;
        c0349e.f4262L = 0;
        c0349e.f4263M = 0;
        c0349e.f4264N = 0;
        c0349e.f4265O = 0;
        c0349e.f4266P = 0;
        c0349e.f4267Q = 0;
        c0349e.f4268R = 1.0f;
        c0349e.f4269S = 1.0f;
        c0349e.f4270T = -1;
        c0349e.f4271U = -1;
        c0349e.f4272V = -1;
        c0349e.f4273W = false;
        c0349e.f4274X = false;
        c0349e.f4275Y = null;
        c0349e.f4276Z = 0;
        c0349e.f4278a0 = true;
        c0349e.f4280b0 = true;
        c0349e.f4282c0 = false;
        c0349e.f4284d0 = false;
        c0349e.f4286e0 = false;
        c0349e.f4288f0 = -1;
        c0349e.f4290g0 = -1;
        c0349e.f4291h0 = -1;
        c0349e.i0 = -1;
        c0349e.f4293j0 = Integer.MIN_VALUE;
        c0349e.f4295k0 = Integer.MIN_VALUE;
        c0349e.f4297l0 = 0.5f;
        c0349e.f4304p0 = new C0325d();
        return c0349e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1109r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1109r = sVar;
        }
        return f1109r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0349e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1111b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0347c) arrayList.get(i)).getClass();
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
        C0349e c0349e = new C0349e(context, attributeSet);
        c0349e.f4277a = -1;
        c0349e.f4279b = -1;
        c0349e.f4281c = -1.0f;
        c0349e.f4283d = true;
        c0349e.f4285e = -1;
        c0349e.f4287f = -1;
        c0349e.f4289g = -1;
        c0349e.h = -1;
        c0349e.i = -1;
        c0349e.f4292j = -1;
        c0349e.f4294k = -1;
        c0349e.f4296l = -1;
        c0349e.f4298m = -1;
        c0349e.f4299n = -1;
        c0349e.f4301o = -1;
        c0349e.f4303p = -1;
        c0349e.f4305q = 0;
        c0349e.f4306r = 0.0f;
        c0349e.f4307s = -1;
        c0349e.f4308t = -1;
        c0349e.f4309u = -1;
        c0349e.f4310v = -1;
        c0349e.f4311w = Integer.MIN_VALUE;
        c0349e.f4312x = Integer.MIN_VALUE;
        c0349e.f4313y = Integer.MIN_VALUE;
        c0349e.f4314z = Integer.MIN_VALUE;
        c0349e.f4252A = Integer.MIN_VALUE;
        c0349e.f4253B = Integer.MIN_VALUE;
        c0349e.f4254C = Integer.MIN_VALUE;
        c0349e.f4255D = 0;
        c0349e.f4256E = 0.5f;
        c0349e.F = 0.5f;
        c0349e.f4257G = null;
        c0349e.f4258H = -1.0f;
        c0349e.f4259I = -1.0f;
        c0349e.f4260J = 0;
        c0349e.f4261K = 0;
        c0349e.f4262L = 0;
        c0349e.f4263M = 0;
        c0349e.f4264N = 0;
        c0349e.f4265O = 0;
        c0349e.f4266P = 0;
        c0349e.f4267Q = 0;
        c0349e.f4268R = 1.0f;
        c0349e.f4269S = 1.0f;
        c0349e.f4270T = -1;
        c0349e.f4271U = -1;
        c0349e.f4272V = -1;
        c0349e.f4273W = false;
        c0349e.f4274X = false;
        c0349e.f4275Y = null;
        c0349e.f4276Z = 0;
        c0349e.f4278a0 = true;
        c0349e.f4280b0 = true;
        c0349e.f4282c0 = false;
        c0349e.f4284d0 = false;
        c0349e.f4286e0 = false;
        c0349e.f4288f0 = -1;
        c0349e.f4290g0 = -1;
        c0349e.f4291h0 = -1;
        c0349e.i0 = -1;
        c0349e.f4293j0 = Integer.MIN_VALUE;
        c0349e.f4295k0 = Integer.MIN_VALUE;
        c0349e.f4297l0 = 0.5f;
        c0349e.f4304p0 = new C0325d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4438b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0348d.f4251a.get(index);
            switch (i2) {
                case 1:
                    c0349e.f4272V = obtainStyledAttributes.getInt(index, c0349e.f4272V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0349e.f4303p);
                    c0349e.f4303p = resourceId;
                    if (resourceId == -1) {
                        c0349e.f4303p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0349e.f4305q = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4305q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0349e.f4306r) % 360.0f;
                    c0349e.f4306r = f2;
                    if (f2 < 0.0f) {
                        c0349e.f4306r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0349e.f4277a = obtainStyledAttributes.getDimensionPixelOffset(index, c0349e.f4277a);
                    break;
                case 6:
                    c0349e.f4279b = obtainStyledAttributes.getDimensionPixelOffset(index, c0349e.f4279b);
                    break;
                case 7:
                    c0349e.f4281c = obtainStyledAttributes.getFloat(index, c0349e.f4281c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0349e.f4285e);
                    c0349e.f4285e = resourceId2;
                    if (resourceId2 == -1) {
                        c0349e.f4285e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0349e.f4287f);
                    c0349e.f4287f = resourceId3;
                    if (resourceId3 == -1) {
                        c0349e.f4287f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0349e.f4289g);
                    c0349e.f4289g = resourceId4;
                    if (resourceId4 == -1) {
                        c0349e.f4289g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0349e.h);
                    c0349e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0349e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0349e.i);
                    c0349e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0349e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0349e.f4292j);
                    c0349e.f4292j = resourceId7;
                    if (resourceId7 == -1) {
                        c0349e.f4292j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0349e.f4294k);
                    c0349e.f4294k = resourceId8;
                    if (resourceId8 == -1) {
                        c0349e.f4294k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0349e.f4296l);
                    c0349e.f4296l = resourceId9;
                    if (resourceId9 == -1) {
                        c0349e.f4296l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0349e.f4298m);
                    c0349e.f4298m = resourceId10;
                    if (resourceId10 == -1) {
                        c0349e.f4298m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0349e.f4307s);
                    c0349e.f4307s = resourceId11;
                    if (resourceId11 == -1) {
                        c0349e.f4307s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0349e.f4308t);
                    c0349e.f4308t = resourceId12;
                    if (resourceId12 == -1) {
                        c0349e.f4308t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0349e.f4309u);
                    c0349e.f4309u = resourceId13;
                    if (resourceId13 == -1) {
                        c0349e.f4309u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0349e.f4310v);
                    c0349e.f4310v = resourceId14;
                    if (resourceId14 == -1) {
                        c0349e.f4310v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0349e.f4311w = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4311w);
                    break;
                case 22:
                    c0349e.f4312x = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4312x);
                    break;
                case 23:
                    c0349e.f4313y = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4313y);
                    break;
                case 24:
                    c0349e.f4314z = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4314z);
                    break;
                case 25:
                    c0349e.f4252A = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4252A);
                    break;
                case 26:
                    c0349e.f4253B = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4253B);
                    break;
                case 27:
                    c0349e.f4273W = obtainStyledAttributes.getBoolean(index, c0349e.f4273W);
                    break;
                case 28:
                    c0349e.f4274X = obtainStyledAttributes.getBoolean(index, c0349e.f4274X);
                    break;
                case 29:
                    c0349e.f4256E = obtainStyledAttributes.getFloat(index, c0349e.f4256E);
                    break;
                case 30:
                    c0349e.F = obtainStyledAttributes.getFloat(index, c0349e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0349e.f4262L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0349e.f4263M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0349e.f4264N = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4264N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0349e.f4264N) == -2) {
                            c0349e.f4264N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0349e.f4266P = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4266P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0349e.f4266P) == -2) {
                            c0349e.f4266P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0349e.f4268R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0349e.f4268R));
                    c0349e.f4262L = 2;
                    break;
                case 36:
                    try {
                        c0349e.f4265O = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4265O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0349e.f4265O) == -2) {
                            c0349e.f4265O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0349e.f4267Q = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4267Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0349e.f4267Q) == -2) {
                            c0349e.f4267Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0349e.f4269S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0349e.f4269S));
                    c0349e.f4263M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0349e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0349e.f4258H = obtainStyledAttributes.getFloat(index, c0349e.f4258H);
                            break;
                        case 46:
                            c0349e.f4259I = obtainStyledAttributes.getFloat(index, c0349e.f4259I);
                            break;
                        case 47:
                            c0349e.f4260J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0349e.f4261K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0349e.f4270T = obtainStyledAttributes.getDimensionPixelOffset(index, c0349e.f4270T);
                            break;
                        case 50:
                            c0349e.f4271U = obtainStyledAttributes.getDimensionPixelOffset(index, c0349e.f4271U);
                            break;
                        case 51:
                            c0349e.f4275Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0349e.f4299n);
                            c0349e.f4299n = resourceId15;
                            if (resourceId15 == -1) {
                                c0349e.f4299n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0349e.f4301o);
                            c0349e.f4301o = resourceId16;
                            if (resourceId16 == -1) {
                                c0349e.f4301o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0349e.f4255D = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4255D);
                            break;
                        case 55:
                            c0349e.f4254C = obtainStyledAttributes.getDimensionPixelSize(index, c0349e.f4254C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0349e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0349e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0349e.f4276Z = obtainStyledAttributes.getInt(index, c0349e.f4276Z);
                                    break;
                                case 67:
                                    c0349e.f4283d = obtainStyledAttributes.getBoolean(index, c0349e.f4283d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0349e.a();
        return c0349e;
    }

    public int getMaxHeight() {
        return this.f1116g;
    }

    public int getMaxWidth() {
        return this.f1115f;
    }

    public int getMinHeight() {
        return this.f1114e;
    }

    public int getMinWidth() {
        return this.f1113d;
    }

    public int getOptimizationLevel() {
        return this.f1112c.f4070D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0326e c0326e = this.f1112c;
        if (c0326e.f4045j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0326e.f4045j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0326e.f4045j = "parent";
            }
        }
        if (c0326e.f4044h0 == null) {
            c0326e.f4044h0 = c0326e.f4045j;
            Log.v("ConstraintLayout", " setDebugName " + c0326e.f4044h0);
        }
        Iterator it = c0326e.f4079q0.iterator();
        while (it.hasNext()) {
            C0325d c0325d = (C0325d) it.next();
            View view = c0325d.f4041f0;
            if (view != null) {
                if (c0325d.f4045j == null && (id = view.getId()) != -1) {
                    c0325d.f4045j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0325d.f4044h0 == null) {
                    c0325d.f4044h0 = c0325d.f4045j;
                    Log.v("ConstraintLayout", " setDebugName " + c0325d.f4044h0);
                }
            }
        }
        c0326e.n(sb);
        return sb.toString();
    }

    public final C0325d h(View view) {
        if (view == this) {
            return this.f1112c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0349e) {
            return ((C0349e) view.getLayoutParams()).f4304p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0349e) {
            return ((C0349e) view.getLayoutParams()).f4304p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0326e c0326e = this.f1112c;
        c0326e.f4041f0 = this;
        C0350f c0350f = this.f1122o;
        c0326e.f4083u0 = c0350f;
        c0326e.f4081s0.f4166f = c0350f;
        this.f1110a.put(getId(), this);
        this.f1117j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4438b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1113d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1113d);
                } else if (index == 17) {
                    this.f1114e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1114e);
                } else if (index == 14) {
                    this.f1115f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1115f);
                } else if (index == 15) {
                    this.f1116g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1116g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1118k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1117j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1117j = null;
                    }
                    this.f1119l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0326e.f4070D0 = this.i;
        C0315c.f3902p = c0326e.W(512);
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
                this.f1118k = jVar;
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
                    ((SparseArray) jVar.f36b).put(yVar.f3883a, yVar);
                } else if (c2 == 3) {
                    C0351g c0351g = new C0351g(context, xml);
                    if (yVar != null) {
                        ((ArrayList) yVar.f3885c).add(c0351g);
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
    public final void k(C0326e c0326e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0350f c0350f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0350f c0350f2;
        int i12;
        C0350f c0350f3;
        boolean z4;
        C0338k c0338k;
        C0340m c0340m;
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
        C0326e c0326e2 = c0326e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0350f c0350f4 = this.f1122o;
        c0350f4.f4316b = max3;
        c0350f4.f4317c = max4;
        c0350f4.f4318d = paddingWidth;
        c0350f4.f4319e = i19;
        c0350f4.f4320f = i2;
        c0350f4.f4321g = i3;
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
        int i23 = c0350f4.f4319e;
        int i24 = c0350f4.f4318d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1115f - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f1113d);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f1113d);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1116g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1114e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1114e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0326e.q();
        C0332e c0332e = c0326e2.f4081s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0326e.k()) {
            c0332e.f4163c = true;
        }
        c0326e2.f4028Y = 0;
        c0326e2.f4029Z = 0;
        int i26 = this.f1115f - i24;
        int[] iArr = c0326e2.f4007C;
        iArr[0] = i26;
        iArr[1] = this.f1116g - i23;
        c0326e2.f4033b0 = 0;
        c0326e2.f4035c0 = 0;
        c0326e2.M(i20);
        c0326e2.O(i25);
        c0326e2.N(i6);
        c0326e2.L(i5);
        int i27 = this.f1113d - i24;
        if (i27 < 0) {
            c0326e2.f4033b0 = 0;
        } else {
            c0326e2.f4033b0 = i27;
        }
        int i28 = this.f1114e - i23;
        if (i28 < 0) {
            c0326e2.f4035c0 = 0;
        } else {
            c0326e2.f4035c0 = i28;
        }
        c0326e2.x0 = max5;
        c0326e2.f4086y0 = max3;
        T.r rVar = c0326e2.f4080r0;
        rVar.getClass();
        C0350f c0350f5 = c0326e2.f4083u0;
        int size3 = c0326e2.f4079q0.size();
        int q3 = c0326e.q();
        int k2 = c0326e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0325d c0325d = (C0325d) c0326e2.f4079q0.get(i29);
                int[] iArr2 = c0325d.f4057p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0325d.f4026W > 0.0f;
                if ((c0325d.x() && z8) || ((c0325d.y() && z8) || (c0325d instanceof g) || c0325d.x() || c0325d.y())) {
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
            if (mode == 1073741824 && c0326e.q() != min) {
                c0326e2.O(min);
                c0326e2.f4081s0.f4162b = true;
            }
            if (mode2 == 1073741824 && c0326e.k() != min2) {
                c0326e2.L(min2);
                c0326e2.f4081s0.f4162b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0332e.f4162b;
                C0326e c0326e3 = c0332e.f4161a;
                if (z10 || c0332e.f4163c) {
                    Iterator it3 = c0326e3.f4079q0.iterator();
                    while (it3.hasNext()) {
                        C0325d c0325d2 = (C0325d) it3.next();
                        c0325d2.h();
                        c0325d2.f4030a = false;
                        c0325d2.f4036d.n();
                        c0325d2.f4038e.m();
                    }
                    i15 = 0;
                    c0326e3.h();
                    c0326e3.f4030a = false;
                    c0326e3.f4036d.n();
                    c0326e3.f4038e.m();
                    c0332e.f4163c = false;
                } else {
                    i15 = 0;
                }
                c0332e.b(c0332e.f4164d);
                c0326e3.f4028Y = i15;
                c0326e3.f4029Z = i15;
                int j2 = c0326e3.j(i15);
                int j3 = c0326e3.j(1);
                if (c0332e.f4162b) {
                    c0332e.c();
                }
                int r2 = c0326e3.r();
                int s2 = c0326e3.s();
                z2 = z9;
                c0326e3.f4036d.h.d(r2);
                c0326e3.f4038e.h.d(s2);
                c0332e.g();
                ArrayList arrayList2 = c0332e.f4165e;
                c0350f = c0350f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0342o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0326e3.M(1);
                        i8 = q3;
                        c0326e3.O(c0332e.d(c0326e3, 0));
                        c0326e3.f4036d.f4195e.d(c0326e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0326e3.N(1);
                        c0326e3.L(c0332e.d(c0326e3, 1));
                        c0326e3.f4038e.f4195e.d(c0326e3.k());
                        int[] iArr3 = c0326e3.f4057p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0326e3.q() + r2;
                            c0326e3.f4036d.i.d(q4);
                            c0326e3.f4036d.f4195e.d(q4 - r2);
                            c0332e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0326e3.k() + s2;
                                c0326e3.f4038e.i.d(k3);
                                c0326e3.f4038e.f4195e.d(k3 - s2);
                            }
                            c0332e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0342o abstractC0342o = (AbstractC0342o) it.next();
                            if (abstractC0342o.f4192b != c0326e3 || abstractC0342o.f4197g) {
                                abstractC0342o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0342o abstractC0342o2 = (AbstractC0342o) it2.next();
                            if (z5 || abstractC0342o2.f4192b != c0326e3) {
                                if (!abstractC0342o2.h.f4175j || ((!abstractC0342o2.i.f4175j && !(abstractC0342o2 instanceof C0336i)) || (!abstractC0342o2.f4195e.f4175j && !(abstractC0342o2 instanceof C0330c) && !(abstractC0342o2 instanceof C0336i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0326e3.M(j2);
                        c0326e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0326e3.f4057p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0326e3.q() + r2;
                c0326e3.f4036d.i.d(q42);
                c0326e3.f4036d.f4195e.d(q42 - r2);
                c0332e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0326e3.k() + s2;
                c0326e3.f4038e.i.d(k32);
                c0326e3.f4038e.f4195e.d(k32 - s2);
                c0332e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0326e3.M(j2);
                c0326e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0350f = c0350f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0332e.f4162b;
                C0326e c0326e4 = c0332e.f4161a;
                if (z11) {
                    Iterator it5 = c0326e4.f4079q0.iterator();
                    while (it5.hasNext()) {
                        C0325d c0325d3 = (C0325d) it5.next();
                        c0325d3.h();
                        c0325d3.f4030a = false;
                        C0338k c0338k2 = c0325d3.f4036d;
                        c0338k2.f4195e.f4175j = false;
                        c0338k2.f4197g = false;
                        c0338k2.n();
                        C0340m c0340m2 = c0325d3.f4038e;
                        c0340m2.f4195e.f4175j = false;
                        c0340m2.f4197g = false;
                        c0340m2.m();
                    }
                    i13 = 0;
                    c0326e4.h();
                    c0326e4.f4030a = false;
                    C0338k c0338k3 = c0326e4.f4036d;
                    c0338k3.f4195e.f4175j = false;
                    c0338k3.f4197g = false;
                    c0338k3.n();
                    C0340m c0340m3 = c0326e4.f4038e;
                    c0340m3.f4195e.f4175j = false;
                    c0340m3.f4197g = false;
                    c0340m3.m();
                    c0332e.c();
                } else {
                    i13 = 0;
                }
                c0332e.b(c0332e.f4164d);
                c0326e4.f4028Y = i13;
                c0326e4.f4029Z = i13;
                c0326e4.f4036d.h.d(i13);
                c0326e4.f4038e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0326e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0326e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0326e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0350f = c0350f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0326e2.f4070D0;
        if (size3 > 0) {
            int size4 = c0326e2.f4079q0.size();
            boolean W2 = c0326e2.W(64);
            C0350f c0350f6 = c0326e2.f4083u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0325d c0325d4 = (C0325d) c0326e2.f4079q0.get(i31);
                if (!(c0325d4 instanceof h) && !(c0325d4 instanceof C0322a) && !c0325d4.F && (!W2 || (c0338k = c0325d4.f4036d) == null || (c0340m = c0325d4.f4038e) == null || !c0338k.f4195e.f4175j || !c0340m.f4195e.f4175j)) {
                    int j4 = c0325d4.j(0);
                    int j5 = c0325d4.j(1);
                    boolean z12 = j4 == 3 && c0325d4.f4059r != 1 && j5 == 3 && c0325d4.f4060s != 1;
                    if (!z12 && c0326e2.W(1) && !(c0325d4 instanceof g)) {
                        if (j4 == 3 && c0325d4.f4059r == 0 && j5 != 3 && !c0325d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0325d4.f4060s == 0 && j4 != 3 && !c0325d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0325d4.f4026W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                rVar.q(0, c0325d4, c0350f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0350f6.f4315a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1111b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0347c) arrayList3.get(i33)).getClass();
                }
            }
        }
        rVar.w(c0326e2);
        ArrayList arrayList4 = (ArrayList) rVar.f810b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            rVar.u(c0326e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0326e2.f4057p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0326e.q();
            C0326e c0326e5 = (C0326e) rVar.f812d;
            int max7 = Math.max(q5, c0326e5.f4033b0);
            int max8 = Math.max(c0326e.k(), c0326e5.f4035c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0325d c0325d5 = (C0325d) arrayList4.get(i36);
                if (c0325d5 instanceof g) {
                    int q6 = c0325d5.q();
                    int k4 = c0325d5.k();
                    i12 = i30;
                    c0350f3 = c0350f;
                    boolean q7 = z15 | rVar.q(1, c0325d5, c0350f3);
                    int q8 = c0325d5.q();
                    int k5 = c0325d5.k();
                    if (q8 != q6) {
                        c0325d5.O(q8);
                        if (z13 && c0325d5.r() + c0325d5.f4024U > max7) {
                            max7 = Math.max(max7, c0325d5.i(4).e() + c0325d5.r() + c0325d5.f4024U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0325d5.L(k5);
                        if (z14 && c0325d5.s() + c0325d5.f4025V > max8) {
                            max8 = Math.max(max8, c0325d5.i(5).e() + c0325d5.s() + c0325d5.f4025V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0325d5).f4134y0 | z4;
                } else {
                    i12 = i30;
                    c0350f3 = c0350f;
                }
                i36++;
                c0350f = c0350f3;
                i30 = i12;
            }
            int i37 = i30;
            C0350f c0350f7 = c0350f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0325d c0325d6 = (C0325d) arrayList4.get(i39);
                    if (((c0325d6 instanceof i) && !(c0325d6 instanceof g)) || (c0325d6 instanceof h) || c0325d6.f4043g0 == 8 || ((z2 && c0325d6.f4036d.f4195e.f4175j && c0325d6.f4038e.f4195e.f4175j) || (c0325d6 instanceof g))) {
                        c0350f2 = c0350f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0325d6.q();
                        int k6 = c0325d6.k();
                        arrayList = arrayList4;
                        int i40 = c0325d6.f4031a0;
                        i11 = size6;
                        boolean q10 = rVar.q(i38 == 1 ? 2 : 1, c0325d6, c0350f7) | z15;
                        int q11 = c0325d6.q();
                        c0350f2 = c0350f7;
                        int k7 = c0325d6.k();
                        if (q11 != q9) {
                            c0325d6.O(q11);
                            if (z13 && c0325d6.r() + c0325d6.f4024U > max7) {
                                max7 = Math.max(max7, c0325d6.i(4).e() + c0325d6.r() + c0325d6.f4024U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0325d6.L(k7);
                            if (z14 && c0325d6.s() + c0325d6.f4025V > max8) {
                                max8 = Math.max(max8, c0325d6.i(5).e() + c0325d6.s() + c0325d6.f4025V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0325d6.f4009E || i40 == c0325d6.f4031a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0350f7 = c0350f2;
                }
                C0350f c0350f8 = c0350f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                rVar.u(c0326e, i38, i34, i35);
                c0350f7 = c0350f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0326e2 = c0326e;
            i30 = i37;
        }
        c0326e2.f4070D0 = i30;
        C0315c.f3902p = c0326e2.W(512);
    }

    public final void l(C0325d c0325d, C0349e c0349e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1110a.get(i);
        C0325d c0325d2 = (C0325d) sparseArray.get(i);
        if (c0325d2 == null || view == null || !(view.getLayoutParams() instanceof C0349e)) {
            return;
        }
        c0349e.f4282c0 = true;
        if (i2 == 6) {
            C0349e c0349e2 = (C0349e) view.getLayoutParams();
            c0349e2.f4282c0 = true;
            c0349e2.f4304p0.f4009E = true;
        }
        c0325d.i(6).b(c0325d2.i(i2), c0349e.f4255D, c0349e.f4254C, true);
        c0325d.f4009E = true;
        c0325d.i(3).j();
        c0325d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0349e c0349e = (C0349e) childAt.getLayoutParams();
            C0325d c0325d = c0349e.f4304p0;
            if (childAt.getVisibility() != 8 || c0349e.f4284d0 || c0349e.f4286e0 || isInEditMode) {
                int r2 = c0325d.r();
                int s2 = c0325d.s();
                childAt.layout(r2, s2, c0325d.q() + r2, c0325d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1111b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0347c) arrayList.get(i6)).getClass();
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
        C0325d c0325d;
        int i5;
        C0325d c0325d2;
        int i6;
        C0325d c0325d3;
        int i7;
        C0349e c0349e;
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
        C0325d c0325d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1123p == i) {
            int i12 = constraintLayout.f1124q;
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
        constraintLayout.f1123p = i;
        constraintLayout.f1124q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0326e c0326e = constraintLayout.f1112c;
        c0326e.f4084v0 = z3;
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
                    C0325d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1120m == null) {
                                    constraintLayout.f1120m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1120m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1110a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0325d4 = view == null ? null : ((C0349e) view.getLayoutParams()).f4304p0;
                                c0325d4.f4044h0 = resourceName;
                            }
                        }
                        c0325d4 = c0326e;
                        c0325d4.f4044h0 = resourceName;
                    }
                }
                if (constraintLayout.f1119l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1117j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0326e.f4079q0.clear();
                ArrayList arrayList3 = constraintLayout.f1111b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0347c abstractC0347c = (AbstractC0347c) arrayList3.get(i19);
                        if (abstractC0347c.isInEditMode()) {
                            abstractC0347c.setIds(abstractC0347c.f4248e);
                        }
                        i iVar = abstractC0347c.f4247d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f4143r0 = i13;
                            Arrays.fill(iVar.f4142q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0347c.f4245b) {
                                int i21 = abstractC0347c.f4244a[i20];
                                View view2 = (View) constraintLayout.f1110a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0347c.f4250g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0347c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0347c.f4244a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1110a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0347c.f4247d;
                                    C0325d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f4143r0 + 1;
                                        C0325d[] c0325dArr = iVar2.f4142q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0325dArr.length) {
                                            iVar2.f4142q0 = (C0325d[]) Arrays.copyOf(c0325dArr, c0325dArr.length * 2);
                                        }
                                        C0325d[] c0325dArr2 = iVar2.f4142q0;
                                        int i23 = iVar2.f4143r0;
                                        c0325dArr2[i23] = h2;
                                        iVar2.f4143r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0347c.f4247d.S();
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
                SparseArray sparseArray = constraintLayout.f1121n;
                sparseArray.clear();
                sparseArray.put(0, c0326e);
                sparseArray.put(getId(), c0326e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0325d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0349e c0349e2 = (C0349e) childAt3.getLayoutParams();
                        c0326e.f4079q0.add(h3);
                        C0325d c0325d5 = h3.f4023T;
                        if (c0325d5 != null) {
                            ((C0326e) c0325d5).f4079q0.remove(h3);
                            h3.C();
                        }
                        h3.f4023T = c0326e;
                        c0349e2.a();
                        h3.f4043g0 = childAt3.getVisibility();
                        h3.f4041f0 = childAt3;
                        if (childAt3 instanceof AbstractC0347c) {
                            ((AbstractC0347c) childAt3).h(h3, c0326e.f4084v0);
                        }
                        if (c0349e2.f4284d0) {
                            h hVar = (h) h3;
                            int i27 = c0349e2.m0;
                            int i28 = c0349e2.f4300n0;
                            float f4 = c0349e2.f4302o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f4136q0 = f4;
                                    hVar.f4137r0 = -1;
                                    hVar.f4138s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f4136q0 = -1.0f;
                                    hVar.f4137r0 = i27;
                                    hVar.f4138s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f4136q0 = -1.0f;
                                hVar.f4137r0 = -1;
                                hVar.f4138s0 = i28;
                            }
                        } else {
                            int i29 = c0349e2.f4288f0;
                            int i30 = c0349e2.f4290g0;
                            int i31 = c0349e2.f4291h0;
                            int i32 = c0349e2.i0;
                            int i33 = c0349e2.f4293j0;
                            i3 = childCount3;
                            int i34 = c0349e2.f4295k0;
                            float f5 = c0349e2.f4297l0;
                            int i35 = c0349e2.f4303p;
                            if (i35 != -1) {
                                C0325d c0325d6 = (C0325d) sparseArray.get(i35);
                                if (c0325d6 != null) {
                                    float f6 = c0349e2.f4306r;
                                    h3.v(7, 7, c0349e2.f4305q, 0, c0325d6);
                                    h3.f4008D = f6;
                                }
                                c0349e = c0349e2;
                            } else {
                                if (i29 != -1) {
                                    C0325d c0325d7 = (C0325d) sparseArray.get(i29);
                                    if (c0325d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0349e2).leftMargin, i33, c0325d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0325d c0325d8 = (C0325d) sparseArray.get(i30);
                                        if (c0325d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0349e2).leftMargin, i33, c0325d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0325d c0325d9 = (C0325d) sparseArray.get(i31);
                                        if (c0325d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0349e2).rightMargin, i34, c0325d9);
                                        }
                                    } else if (i32 != i4 && (c0325d = (C0325d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0349e2).rightMargin, i34, c0325d);
                                    }
                                    i5 = c0349e2.i;
                                    if (i5 == -1) {
                                        C0325d c0325d10 = (C0325d) sparseArray.get(i5);
                                        if (c0325d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0349e2).topMargin, c0349e2.f4312x, c0325d10);
                                        }
                                    } else {
                                        int i36 = c0349e2.f4292j;
                                        if (i36 != -1 && (c0325d2 = (C0325d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0349e2).topMargin, c0349e2.f4312x, c0325d2);
                                        }
                                    }
                                    i6 = c0349e2.f4294k;
                                    if (i6 == -1) {
                                        C0325d c0325d11 = (C0325d) sparseArray.get(i6);
                                        if (c0325d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0349e2).bottomMargin, c0349e2.f4314z, c0325d11);
                                        }
                                    } else {
                                        int i37 = c0349e2.f4296l;
                                        if (i37 != -1 && (c0325d3 = (C0325d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0349e2).bottomMargin, c0349e2.f4314z, c0325d3);
                                        }
                                    }
                                    i7 = c0349e2.f4298m;
                                    if (i7 == -1) {
                                        c0349e = c0349e2;
                                        l(h3, c0349e2, sparseArray, i7, 6);
                                    } else {
                                        c0349e = c0349e2;
                                        int i38 = c0349e.f4299n;
                                        if (i38 != -1) {
                                            l(h3, c0349e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0349e.f4301o;
                                            if (i39 != -1) {
                                                l(h3, c0349e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f4037d0 = f5;
                                    }
                                    f2 = c0349e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f4039e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0349e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0349e2.f4294k;
                                if (i6 == -1) {
                                }
                                i7 = c0349e2.f4298m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0349e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0349e.f4270T) != -1 || c0349e.f4271U != -1)) {
                                int i40 = c0349e.f4271U;
                                h3.f4028Y = i11;
                                h3.f4029Z = i40;
                            }
                            if (c0349e.f4278a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0349e).width);
                                if (((ViewGroup.MarginLayoutParams) c0349e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0349e).width == -1) {
                                if (c0349e.f4273W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f4004g = ((ViewGroup.MarginLayoutParams) c0349e).leftMargin;
                                h3.i(4).f4004g = ((ViewGroup.MarginLayoutParams) c0349e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0349e.f4280b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0349e).height);
                                if (((ViewGroup.MarginLayoutParams) c0349e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0349e).height == -1) {
                                    if (c0349e.f4274X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f4004g = ((ViewGroup.MarginLayoutParams) c0349e).topMargin;
                                    h3.i(5).f4004g = ((ViewGroup.MarginLayoutParams) c0349e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0349e.f4257G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f4026W = 0.0f;
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
                                    h3.f4026W = parseFloat;
                                    h3.f4027X = i9;
                                }
                            }
                            float f7 = c0349e.f4258H;
                            float[] fArr = h3.f4048k0;
                            fArr[0] = f7;
                            fArr[1] = c0349e.f4259I;
                            h3.i0 = c0349e.f4260J;
                            h3.f4046j0 = c0349e.f4261K;
                            int i41 = c0349e.f4276Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f4058q = i41;
                            }
                            int i42 = c0349e.f4262L;
                            int i43 = c0349e.f4264N;
                            int i44 = c0349e.f4266P;
                            float f8 = c0349e.f4268R;
                            h3.f4059r = i42;
                            h3.f4062u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f4063v = i44;
                            h3.f4064w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f4059r = 2;
                            }
                            int i45 = c0349e.f4263M;
                            int i46 = c0349e.f4265O;
                            int i47 = c0349e.f4267Q;
                            float f9 = c0349e.f4269S;
                            h3.f4060s = i45;
                            h3.f4065x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f4066y = i47;
                            h3.f4067z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f4060s = 2;
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
                c0326e.f4080r0.w(c0326e);
            }
        }
        k(c0326e, this.i, i, i2);
        int q2 = c0326e.q();
        int k2 = c0326e.k();
        boolean z4 = c0326e.f4071E0;
        boolean z5 = c0326e.f4072F0;
        C0350f c0350f = this.f1122o;
        int i48 = c0350f.f4319e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0350f.f4318d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1115f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1116g, resolveSizeAndState2);
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
        C0325d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0349e c0349e = (C0349e) view.getLayoutParams();
            h hVar = new h();
            c0349e.f4304p0 = hVar;
            c0349e.f4284d0 = true;
            hVar.S(c0349e.f4272V);
        }
        if (view instanceof AbstractC0347c) {
            AbstractC0347c abstractC0347c = (AbstractC0347c) view;
            abstractC0347c.i();
            ((C0349e) view.getLayoutParams()).f4286e0 = true;
            ArrayList arrayList = this.f1111b;
            if (!arrayList.contains(abstractC0347c)) {
                arrayList.add(abstractC0347c);
            }
        }
        this.f1110a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1110a.remove(view.getId());
        C0325d h = h(view);
        this.f1112c.f4079q0.remove(h);
        h.C();
        this.f1111b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1117j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1110a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1116g) {
            return;
        }
        this.f1116g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1115f) {
            return;
        }
        this.f1115f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1114e) {
            return;
        }
        this.f1114e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1113d) {
            return;
        }
        this.f1113d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1118k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0326e c0326e = this.f1112c;
        c0326e.f4070D0 = i;
        C0315c.f3902p = c0326e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1110a = new SparseArray();
        this.f1111b = new ArrayList(4);
        this.f1112c = new C0326e();
        this.f1113d = 0;
        this.f1114e = 0;
        this.f1115f = Integer.MAX_VALUE;
        this.f1116g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1117j = null;
        this.f1118k = null;
        this.f1119l = -1;
        this.f1120m = new HashMap();
        this.f1121n = new SparseArray();
        this.f1122o = new C0350f(this, this);
        this.f1123p = 0;
        this.f1124q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0349e c0349e = new C0349e(layoutParams);
        c0349e.f4277a = -1;
        c0349e.f4279b = -1;
        c0349e.f4281c = -1.0f;
        c0349e.f4283d = true;
        c0349e.f4285e = -1;
        c0349e.f4287f = -1;
        c0349e.f4289g = -1;
        c0349e.h = -1;
        c0349e.i = -1;
        c0349e.f4292j = -1;
        c0349e.f4294k = -1;
        c0349e.f4296l = -1;
        c0349e.f4298m = -1;
        c0349e.f4299n = -1;
        c0349e.f4301o = -1;
        c0349e.f4303p = -1;
        c0349e.f4305q = 0;
        c0349e.f4306r = 0.0f;
        c0349e.f4307s = -1;
        c0349e.f4308t = -1;
        c0349e.f4309u = -1;
        c0349e.f4310v = -1;
        c0349e.f4311w = Integer.MIN_VALUE;
        c0349e.f4312x = Integer.MIN_VALUE;
        c0349e.f4313y = Integer.MIN_VALUE;
        c0349e.f4314z = Integer.MIN_VALUE;
        c0349e.f4252A = Integer.MIN_VALUE;
        c0349e.f4253B = Integer.MIN_VALUE;
        c0349e.f4254C = Integer.MIN_VALUE;
        c0349e.f4255D = 0;
        c0349e.f4256E = 0.5f;
        c0349e.F = 0.5f;
        c0349e.f4257G = null;
        c0349e.f4258H = -1.0f;
        c0349e.f4259I = -1.0f;
        c0349e.f4260J = 0;
        c0349e.f4261K = 0;
        c0349e.f4262L = 0;
        c0349e.f4263M = 0;
        c0349e.f4264N = 0;
        c0349e.f4265O = 0;
        c0349e.f4266P = 0;
        c0349e.f4267Q = 0;
        c0349e.f4268R = 1.0f;
        c0349e.f4269S = 1.0f;
        c0349e.f4270T = -1;
        c0349e.f4271U = -1;
        c0349e.f4272V = -1;
        c0349e.f4273W = false;
        c0349e.f4274X = false;
        c0349e.f4275Y = null;
        c0349e.f4276Z = 0;
        c0349e.f4278a0 = true;
        c0349e.f4280b0 = true;
        c0349e.f4282c0 = false;
        c0349e.f4284d0 = false;
        c0349e.f4286e0 = false;
        c0349e.f4288f0 = -1;
        c0349e.f4290g0 = -1;
        c0349e.f4291h0 = -1;
        c0349e.i0 = -1;
        c0349e.f4293j0 = Integer.MIN_VALUE;
        c0349e.f4295k0 = Integer.MIN_VALUE;
        c0349e.f4297l0 = 0.5f;
        c0349e.f4304p0 = new C0325d();
        return c0349e;
    }
}

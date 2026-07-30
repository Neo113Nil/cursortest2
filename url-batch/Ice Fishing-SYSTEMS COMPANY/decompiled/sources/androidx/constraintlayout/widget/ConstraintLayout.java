package androidx.constraintlayout.widget;

import J6.h;
import S0.c;
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
import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.n.a.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import m.Q0;
import org.xmlpull.v1.XmlPullParserException;
import u.C5086c;
import w.C5141a;
import w.C5144d;
import w.C5145e;
import x.AbstractC5199p;
import x.C5186c;
import x.C5188e;
import x.C5192i;
import x.C5194k;
import x.C5196m;
import z.d;
import z.e;
import z.f;
import z.g;
import z.n;
import z.o;
import z.p;
import z.r;
import z.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: I, reason: collision with root package name */
    public static s f4758I;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4759A;

    /* renamed from: B, reason: collision with root package name */
    public int f4760B;

    /* renamed from: C, reason: collision with root package name */
    public n f4761C;

    /* renamed from: D, reason: collision with root package name */
    public c f4762D;

    /* renamed from: E, reason: collision with root package name */
    public int f4763E;

    /* renamed from: F, reason: collision with root package name */
    public HashMap f4764F;

    /* renamed from: G, reason: collision with root package name */
    public final SparseArray f4765G;

    /* renamed from: H, reason: collision with root package name */
    public final f f4766H;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f4767n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4768u;

    /* renamed from: v, reason: collision with root package name */
    public final C5145e f4769v;

    /* renamed from: w, reason: collision with root package name */
    public int f4770w;

    /* renamed from: x, reason: collision with root package name */
    public int f4771x;

    /* renamed from: y, reason: collision with root package name */
    public int f4772y;

    /* renamed from: z, reason: collision with root package name */
    public int f4773z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4767n = new SparseArray();
        this.f4768u = new ArrayList(4);
        this.f4769v = new C5145e();
        this.f4770w = 0;
        this.f4771x = 0;
        this.f4772y = Integer.MAX_VALUE;
        this.f4773z = Integer.MAX_VALUE;
        this.f4759A = true;
        this.f4760B = 257;
        this.f4761C = null;
        this.f4762D = null;
        this.f4763E = -1;
        this.f4764F = new HashMap();
        this.f4765G = new SparseArray();
        this.f4766H = new f(this, this);
        i(attributeSet, 0);
    }

    public static e g() {
        e eVar = new e(-2, -2);
        eVar.f41927a = -1;
        eVar.f41929b = -1;
        eVar.f41931c = -1.0f;
        eVar.f41933d = true;
        eVar.f41935e = -1;
        eVar.f41937f = -1;
        eVar.f41939g = -1;
        eVar.f41941h = -1;
        eVar.i = -1;
        eVar.f41944j = -1;
        eVar.f41946k = -1;
        eVar.f41948l = -1;
        eVar.f41950m = -1;
        eVar.f41951n = -1;
        eVar.f41953o = -1;
        eVar.f41955p = -1;
        eVar.f41957q = 0;
        eVar.f41958r = 0.0f;
        eVar.f41959s = -1;
        eVar.f41960t = -1;
        eVar.f41961u = -1;
        eVar.f41962v = -1;
        eVar.f41963w = Integer.MIN_VALUE;
        eVar.f41964x = Integer.MIN_VALUE;
        eVar.f41965y = Integer.MIN_VALUE;
        eVar.f41966z = Integer.MIN_VALUE;
        eVar.f41903A = Integer.MIN_VALUE;
        eVar.f41904B = Integer.MIN_VALUE;
        eVar.f41905C = Integer.MIN_VALUE;
        eVar.f41906D = 0;
        eVar.f41907E = 0.5f;
        eVar.f41908F = 0.5f;
        eVar.f41909G = null;
        eVar.f41910H = -1.0f;
        eVar.f41911I = -1.0f;
        eVar.J = 0;
        eVar.f41912K = 0;
        eVar.f41913L = 0;
        eVar.f41914M = 0;
        eVar.f41915N = 0;
        eVar.f41916O = 0;
        eVar.f41917P = 0;
        eVar.f41918Q = 0;
        eVar.f41919R = 1.0f;
        eVar.f41920S = 1.0f;
        eVar.f41921T = -1;
        eVar.f41922U = -1;
        eVar.f41923V = -1;
        eVar.f41924W = false;
        eVar.f41925X = false;
        eVar.Y = null;
        eVar.f41926Z = 0;
        eVar.f41928a0 = true;
        eVar.f41930b0 = true;
        eVar.f41932c0 = false;
        eVar.f41934d0 = false;
        eVar.f41936e0 = false;
        eVar.f41938f0 = -1;
        eVar.f41940g0 = -1;
        eVar.f41942h0 = -1;
        eVar.f41943i0 = -1;
        eVar.f41945j0 = Integer.MIN_VALUE;
        eVar.f41947k0 = Integer.MIN_VALUE;
        eVar.f41949l0 = 0.5f;
        eVar.f41956p0 = new C5144d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f4758I == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f4758I = sVar;
        }
        return f4758I;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4768u;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((z.c) arrayList.get(i)).getClass();
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
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i9;
                        float f9 = i10;
                        float f10 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f9, f10, f9, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f9, f10, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4759A = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f41927a = -1;
        eVar.f41929b = -1;
        eVar.f41931c = -1.0f;
        eVar.f41933d = true;
        eVar.f41935e = -1;
        eVar.f41937f = -1;
        eVar.f41939g = -1;
        eVar.f41941h = -1;
        eVar.i = -1;
        eVar.f41944j = -1;
        eVar.f41946k = -1;
        eVar.f41948l = -1;
        eVar.f41950m = -1;
        eVar.f41951n = -1;
        eVar.f41953o = -1;
        eVar.f41955p = -1;
        eVar.f41957q = 0;
        eVar.f41958r = 0.0f;
        eVar.f41959s = -1;
        eVar.f41960t = -1;
        eVar.f41961u = -1;
        eVar.f41962v = -1;
        eVar.f41963w = Integer.MIN_VALUE;
        eVar.f41964x = Integer.MIN_VALUE;
        eVar.f41965y = Integer.MIN_VALUE;
        eVar.f41966z = Integer.MIN_VALUE;
        eVar.f41903A = Integer.MIN_VALUE;
        eVar.f41904B = Integer.MIN_VALUE;
        eVar.f41905C = Integer.MIN_VALUE;
        eVar.f41906D = 0;
        eVar.f41907E = 0.5f;
        eVar.f41908F = 0.5f;
        eVar.f41909G = null;
        eVar.f41910H = -1.0f;
        eVar.f41911I = -1.0f;
        eVar.J = 0;
        eVar.f41912K = 0;
        eVar.f41913L = 0;
        eVar.f41914M = 0;
        eVar.f41915N = 0;
        eVar.f41916O = 0;
        eVar.f41917P = 0;
        eVar.f41918Q = 0;
        eVar.f41919R = 1.0f;
        eVar.f41920S = 1.0f;
        eVar.f41921T = -1;
        eVar.f41922U = -1;
        eVar.f41923V = -1;
        eVar.f41924W = false;
        eVar.f41925X = false;
        eVar.Y = null;
        eVar.f41926Z = 0;
        eVar.f41928a0 = true;
        eVar.f41930b0 = true;
        eVar.f41932c0 = false;
        eVar.f41934d0 = false;
        eVar.f41936e0 = false;
        eVar.f41938f0 = -1;
        eVar.f41940g0 = -1;
        eVar.f41942h0 = -1;
        eVar.f41943i0 = -1;
        eVar.f41945j0 = Integer.MIN_VALUE;
        eVar.f41947k0 = Integer.MIN_VALUE;
        eVar.f41949l0 = 0.5f;
        eVar.f41956p0 = new C5144d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42095b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i4 = d.f41902a.get(index);
            switch (i4) {
                case 1:
                    eVar.f41923V = obtainStyledAttributes.getInt(index, eVar.f41923V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f41955p);
                    eVar.f41955p = resourceId;
                    if (resourceId == -1) {
                        eVar.f41955p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f41957q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41957q);
                    break;
                case 4:
                    float f6 = obtainStyledAttributes.getFloat(index, eVar.f41958r) % 360.0f;
                    eVar.f41958r = f6;
                    if (f6 < 0.0f) {
                        eVar.f41958r = (360.0f - f6) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f41927a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f41927a);
                    break;
                case 6:
                    eVar.f41929b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f41929b);
                    break;
                case 7:
                    eVar.f41931c = obtainStyledAttributes.getFloat(index, eVar.f41931c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f41935e);
                    eVar.f41935e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f41935e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f41937f);
                    eVar.f41937f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f41937f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f41939g);
                    eVar.f41939g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f41939g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.f41941h);
                    eVar.f41941h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f41941h = obtainStyledAttributes.getInt(index, -1);
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
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f41944j);
                    eVar.f41944j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f41944j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f41946k);
                    eVar.f41946k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f41946k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f41948l);
                    eVar.f41948l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f41948l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f41950m);
                    eVar.f41950m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f41950m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f41959s);
                    eVar.f41959s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f41959s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f41960t);
                    eVar.f41960t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f41960t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f41961u);
                    eVar.f41961u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f41961u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f41962v);
                    eVar.f41962v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f41962v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f41963w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41963w);
                    break;
                case 22:
                    eVar.f41964x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41964x);
                    break;
                case 23:
                    eVar.f41965y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41965y);
                    break;
                case 24:
                    eVar.f41966z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41966z);
                    break;
                case 25:
                    eVar.f41903A = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41903A);
                    break;
                case 26:
                    eVar.f41904B = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41904B);
                    break;
                case 27:
                    eVar.f41924W = obtainStyledAttributes.getBoolean(index, eVar.f41924W);
                    break;
                case 28:
                    eVar.f41925X = obtainStyledAttributes.getBoolean(index, eVar.f41925X);
                    break;
                case 29:
                    eVar.f41907E = obtainStyledAttributes.getFloat(index, eVar.f41907E);
                    break;
                case 30:
                    eVar.f41908F = obtainStyledAttributes.getFloat(index, eVar.f41908F);
                    break;
                case 31:
                    int i9 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f41913L = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f41914M = i10;
                    if (i10 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f41915N = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41915N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, eVar.f41915N) == -2) {
                            eVar.f41915N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f41917P = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41917P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, eVar.f41917P) == -2) {
                            eVar.f41917P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f41919R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.f41919R));
                    eVar.f41913L = 2;
                    break;
                case 36:
                    try {
                        eVar.f41916O = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41916O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, eVar.f41916O) == -2) {
                            eVar.f41916O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f41918Q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41918Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, eVar.f41918Q) == -2) {
                            eVar.f41918Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case j.f5963M /* 38 */:
                    eVar.f41920S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, eVar.f41920S));
                    eVar.f41914M = 2;
                    break;
                default:
                    switch (i4) {
                        case j.f5969S /* 44 */:
                            n.h(eVar, obtainStyledAttributes.getString(index));
                            break;
                        case j.f5970T /* 45 */:
                            eVar.f41910H = obtainStyledAttributes.getFloat(index, eVar.f41910H);
                            break;
                        case 46:
                            eVar.f41911I = obtainStyledAttributes.getFloat(index, eVar.f41911I);
                            break;
                        case 47:
                            eVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case j.f5973W /* 48 */:
                            eVar.f41912K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case j.f5974X /* 49 */:
                            eVar.f41921T = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f41921T);
                            break;
                        case 50:
                            eVar.f41922U = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f41922U);
                            break;
                        case 51:
                            eVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f41951n);
                            eVar.f41951n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f41951n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case i.f14980d /* 53 */:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f41953o);
                            eVar.f41953o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f41953o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.f41906D = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41906D);
                            break;
                        case 55:
                            eVar.f41905C = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f41905C);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    n.g(eVar, obtainStyledAttributes, index, 0);
                                    break;
                                case j.v.f12733G /* 65 */:
                                    n.g(eVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f41926Z = obtainStyledAttributes.getInt(index, eVar.f41926Z);
                                    break;
                                case j.v.f12739d /* 67 */:
                                    eVar.f41933d = obtainStyledAttributes.getBoolean(index, eVar.f41933d);
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
        return this.f4773z;
    }

    public int getMaxWidth() {
        return this.f4772y;
    }

    public int getMinHeight() {
        return this.f4771x;
    }

    public int getMinWidth() {
        return this.f4770w;
    }

    public int getOptimizationLevel() {
        return this.f4769v.f41480D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C5145e c5145e = this.f4769v;
        if (c5145e.f41455j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c5145e.f41455j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c5145e.f41455j = "parent";
            }
        }
        if (c5145e.f41453h0 == null) {
            c5145e.f41453h0 = c5145e.f41455j;
            Log.v("ConstraintLayout", " setDebugName " + c5145e.f41453h0);
        }
        Iterator it = c5145e.f41489q0.iterator();
        while (it.hasNext()) {
            C5144d c5144d = (C5144d) it.next();
            View view = c5144d.f41449f0;
            if (view != null) {
                if (c5144d.f41455j == null && (id = view.getId()) != -1) {
                    c5144d.f41455j = getContext().getResources().getResourceEntryName(id);
                }
                if (c5144d.f41453h0 == null) {
                    c5144d.f41453h0 = c5144d.f41455j;
                    Log.v("ConstraintLayout", " setDebugName " + c5144d.f41453h0);
                }
            }
        }
        c5145e.n(sb);
        return sb.toString();
    }

    public final C5144d h(View view) {
        if (view == this) {
            return this.f4769v;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f41956p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f41956p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C5145e c5145e = this.f4769v;
        c5145e.f41449f0 = this;
        f fVar = this.f4766H;
        c5145e.f41493u0 = fVar;
        c5145e.f41491s0.f41730f = fVar;
        this.f4767n.put(getId(), this);
        this.f4761C = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42095b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f4770w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4770w);
                } else if (index == 17) {
                    this.f4771x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4771x);
                } else if (index == 14) {
                    this.f4772y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4772y);
                } else if (index == 15) {
                    this.f4773z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4773z);
                } else if (index == 113) {
                    this.f4760B = obtainStyledAttributes.getInt(index, this.f4760B);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4762D = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f4761C = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4761C = null;
                    }
                    this.f4763E = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c5145e.f41480D0 = this.f4760B;
        C5086c.f40969q = c5145e.W(512);
    }

    public final void j(int i) {
        int eventType;
        h hVar;
        Context context = getContext();
        c cVar = new c(20);
        cVar.f2886u = new SparseArray();
        cVar.f2887v = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            hVar = null;
        } catch (IOException e6) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e6);
        } catch (XmlPullParserException e9) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e9);
        }
        while (true) {
            char c4 = 1;
            if (eventType == 1) {
                this.f4762D = cVar;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                if (c4 == 2) {
                    h hVar2 = new h(context, xml);
                    ((SparseArray) cVar.f2886u).put(hVar2.f1417a, hVar2);
                    hVar = hVar2;
                } else if (c4 == 3) {
                    g gVar = new g(context, xml);
                    if (hVar != null) {
                        hVar.f1418b.add(gVar);
                    }
                } else if (c4 == 4) {
                    cVar.z(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(C5145e c5145e, int i, int i4, int i9) {
        int i10;
        int max;
        int i11;
        int max2;
        int i12;
        boolean z8;
        int i13;
        int i14;
        boolean z9;
        int i15;
        boolean z10;
        ArrayList arrayList;
        int i16;
        boolean z11;
        boolean z12;
        C5194k c5194k;
        C5196m c5196m;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList2;
        int i20;
        int i21;
        int i22;
        boolean z13;
        Iterator it;
        Iterator it2;
        boolean z14;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i23 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar = this.f4766H;
        fVar.f41968b = max3;
        fVar.f41969c = max4;
        fVar.f41970d = paddingWidth;
        fVar.f41971e = i23;
        fVar.f41972f = i4;
        fVar.f41973g = i9;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i24 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i25 = size - paddingWidth;
        int i26 = size2 - i23;
        int i27 = fVar.f41971e;
        int i28 = fVar.f41970d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i10 = 0;
                } else {
                    i10 = Math.min(this.f4772y - i28, i25);
                    i24 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f4770w);
                i10 = max;
                i24 = 2;
            } else {
                i10 = 0;
                i24 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f4770w);
            i10 = max;
            i24 = 2;
        } else {
            i10 = i25;
            i24 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i11 = mode2 != 1073741824 ? 0 : Math.min(this.f4773z - i27, i26);
                i12 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f4771x);
                i11 = max2;
                i12 = 2;
            } else {
                i11 = 0;
                i12 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f4771x);
            i11 = max2;
            i12 = 2;
        } else {
            i11 = i26;
            i12 = 2;
        }
        int q6 = c5145e.q();
        C5188e c5188e = c5145e.f41491s0;
        int i29 = i10;
        if (i29 != q6 || i11 != c5145e.k()) {
            c5188e.f41727c = true;
        }
        c5145e.Y = 0;
        c5145e.f41437Z = 0;
        int i30 = this.f4772y - i28;
        int[] iArr = c5145e.f41416C;
        iArr[0] = i30;
        iArr[1] = this.f4773z - i27;
        c5145e.f41441b0 = 0;
        c5145e.f41443c0 = 0;
        c5145e.M(i24);
        c5145e.O(i29);
        c5145e.N(i12);
        c5145e.L(i11);
        int i31 = this.f4770w - i28;
        if (i31 < 0) {
            c5145e.f41441b0 = 0;
        } else {
            c5145e.f41441b0 = i31;
        }
        int i32 = this.f4771x - i27;
        if (i32 < 0) {
            c5145e.f41443c0 = 0;
        } else {
            c5145e.f41443c0 = i32;
        }
        c5145e.f41496x0 = max5;
        c5145e.f41497y0 = max3;
        Q0 q02 = c5145e.f41490r0;
        q02.getClass();
        f fVar2 = c5145e.f41493u0;
        int size3 = c5145e.f41489q0.size();
        int q9 = c5145e.q();
        int k6 = c5145e.k();
        boolean c4 = w.j.c(i, 128);
        boolean z15 = c4 || w.j.c(i, 64);
        if (z15) {
            int i33 = 0;
            while (i33 < size3) {
                C5144d c5144d = (C5144d) c5145e.f41489q0.get(i33);
                boolean z16 = z15;
                int[] iArr2 = c5144d.f41467p0;
                i13 = size3;
                boolean z17 = (iArr2[0] == 3) && (iArr2[1] == 3) && c5144d.f41435W > 0.0f;
                if ((c5144d.x() && z17) || ((c5144d.y() && z17) || (c5144d instanceof w.g) || c5144d.x() || c5144d.y())) {
                    i14 = 1073741824;
                    z8 = false;
                    break;
                } else {
                    i33++;
                    z15 = z16;
                    size3 = i13;
                }
            }
        }
        z8 = z15;
        i13 = size3;
        i14 = 1073741824;
        boolean z18 = z8 & ((mode == i14 && mode2 == i14) || c4);
        if (z18) {
            int min = Math.min(iArr[0], i25);
            int min2 = Math.min(iArr[1], i26);
            if (mode == 1073741824 && c5145e.q() != min) {
                c5145e.O(min);
                c5145e.f41491s0.f41726b = true;
            }
            if (mode2 == 1073741824 && c5145e.k() != min2) {
                c5145e.L(min2);
                c5145e.f41491s0.f41726b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z19 = c5188e.f41726b;
                C5145e c5145e2 = c5188e.f41725a;
                if (z19 || c5188e.f41727c) {
                    Iterator it3 = c5145e2.f41489q0.iterator();
                    while (it3.hasNext()) {
                        C5144d c5144d2 = (C5144d) it3.next();
                        c5144d2.h();
                        c5144d2.f41438a = false;
                        c5144d2.f41444d.n();
                        c5144d2.f41446e.m();
                    }
                    i19 = 0;
                    c5145e2.h();
                    c5145e2.f41438a = false;
                    c5145e2.f41444d.n();
                    c5145e2.f41446e.m();
                    c5188e.f41727c = false;
                } else {
                    i19 = 0;
                }
                c5188e.b(c5188e.f41728d);
                c5145e2.Y = i19;
                c5145e2.f41437Z = i19;
                int j9 = c5145e2.j(i19);
                int j10 = c5145e2.j(1);
                if (c5188e.f41726b) {
                    c5188e.c();
                }
                int r9 = c5145e2.r();
                int s3 = c5145e2.s();
                c5145e2.f41444d.f41764h.d(r9);
                c5145e2.f41446e.f41764h.d(s3);
                c5188e.g();
                ArrayList arrayList3 = c5188e.f41729e;
                z9 = z18;
                if (j9 == 2 || j10 == 2) {
                    if (c4) {
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC5199p) it4.next()).k()) {
                                    c4 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c4 && j9 == 2) {
                        c5145e2.M(1);
                        arrayList2 = arrayList3;
                        c5145e2.O(c5188e.d(c5145e2, 0));
                        c5145e2.f41444d.f41761e.d(c5145e2.q());
                    } else {
                        arrayList2 = arrayList3;
                    }
                    if (c4 && j10 == 2) {
                        i20 = 1;
                        c5145e2.N(1);
                        c5145e2.L(c5188e.d(c5145e2, 1));
                        c5145e2.f41446e.f41761e.d(c5145e2.k());
                        int[] iArr3 = c5145e2.f41467p0;
                        i21 = iArr3[0];
                        if (i21 != i20 || i21 == 4) {
                            int q10 = c5145e2.q() + r9;
                            c5145e2.f41444d.i.d(q10);
                            c5145e2.f41444d.f41761e.d(q10 - r9);
                            c5188e.g();
                            i22 = iArr3[1];
                            if (i22 != 1 || i22 == 4) {
                                int k9 = c5145e2.k() + s3;
                                c5145e2.f41446e.i.d(k9);
                                c5145e2.f41446e.f41761e.d(k9 - s3);
                            }
                            c5188e.g();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC5199p abstractC5199p = (AbstractC5199p) it.next();
                            if (abstractC5199p.f41758b != c5145e2 || abstractC5199p.f41763g) {
                                abstractC5199p.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC5199p abstractC5199p2 = (AbstractC5199p) it2.next();
                            if (z13 || abstractC5199p2.f41758b != c5145e2) {
                                if (!abstractC5199p2.f41764h.f41741j || ((!abstractC5199p2.i.f41741j && !(abstractC5199p2 instanceof C5192i)) || (!abstractC5199p2.f41761e.f41741j && !(abstractC5199p2 instanceof C5186c) && !(abstractC5199p2 instanceof C5192i)))) {
                                    z14 = false;
                                    break;
                                }
                            }
                        }
                        z14 = true;
                        c5145e2.M(j9);
                        c5145e2.N(j10);
                        z10 = z14;
                        i18 = 1073741824;
                        i15 = 2;
                    }
                } else {
                    arrayList2 = arrayList3;
                }
                i20 = 1;
                int[] iArr32 = c5145e2.f41467p0;
                i21 = iArr32[0];
                if (i21 != i20) {
                }
                int q102 = c5145e2.q() + r9;
                c5145e2.f41444d.i.d(q102);
                c5145e2.f41444d.f41761e.d(q102 - r9);
                c5188e.g();
                i22 = iArr32[1];
                if (i22 != 1) {
                }
                int k92 = c5145e2.k() + s3;
                c5145e2.f41446e.i.d(k92);
                c5145e2.f41446e.f41761e.d(k92 - s3);
                c5188e.g();
                z13 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z14 = true;
                c5145e2.M(j9);
                c5145e2.N(j10);
                z10 = z14;
                i18 = 1073741824;
                i15 = 2;
            } else {
                z9 = z18;
                boolean z20 = c5188e.f41726b;
                C5145e c5145e3 = c5188e.f41725a;
                if (z20) {
                    Iterator it5 = c5145e3.f41489q0.iterator();
                    while (it5.hasNext()) {
                        C5144d c5144d3 = (C5144d) it5.next();
                        c5144d3.h();
                        c5144d3.f41438a = false;
                        C5194k c5194k2 = c5144d3.f41444d;
                        c5194k2.f41761e.f41741j = false;
                        c5194k2.f41763g = false;
                        c5194k2.n();
                        C5196m c5196m2 = c5144d3.f41446e;
                        c5196m2.f41761e.f41741j = false;
                        c5196m2.f41763g = false;
                        c5196m2.m();
                    }
                    i17 = 0;
                    c5145e3.h();
                    c5145e3.f41438a = false;
                    C5194k c5194k3 = c5145e3.f41444d;
                    c5194k3.f41761e.f41741j = false;
                    c5194k3.f41763g = false;
                    c5194k3.n();
                    C5196m c5196m3 = c5145e3.f41446e;
                    c5196m3.f41761e.f41741j = false;
                    c5196m3.f41763g = false;
                    c5196m3.m();
                    c5188e.c();
                } else {
                    i17 = 0;
                }
                c5188e.b(c5188e.f41728d);
                c5145e3.Y = i17;
                c5145e3.f41437Z = i17;
                c5145e3.f41444d.f41764h.d(i17);
                c5145e3.f41446e.f41764h.d(i17);
                i18 = 1073741824;
                if (mode == 1073741824) {
                    z10 = c5145e.T(i17, c4);
                    i15 = 1;
                } else {
                    i15 = 0;
                    z10 = true;
                }
                if (mode2 == 1073741824) {
                    z10 &= c5145e.T(1, c4);
                    i15++;
                }
            }
            if (z10) {
                c5145e.P(mode == i18, mode2 == i18);
            }
        } else {
            z9 = z18;
            i15 = 0;
            z10 = false;
        }
        if (z10 && i15 == 2) {
            return;
        }
        int i34 = c5145e.f41480D0;
        if (i13 > 0) {
            int size4 = c5145e.f41489q0.size();
            boolean W8 = c5145e.W(64);
            f fVar3 = c5145e.f41493u0;
            for (int i35 = 0; i35 < size4; i35++) {
                C5144d c5144d4 = (C5144d) c5145e.f41489q0.get(i35);
                if (!(c5144d4 instanceof w.h) && !(c5144d4 instanceof C5141a) && !c5144d4.f41419F && (!W8 || (c5194k = c5144d4.f41444d) == null || (c5196m = c5144d4.f41446e) == null || !c5194k.f41761e.f41741j || !c5196m.f41761e.f41741j)) {
                    int j11 = c5144d4.j(0);
                    int j12 = c5144d4.j(1);
                    boolean z21 = j11 == 3 && c5144d4.f41469r != 1 && j12 == 3 && c5144d4.f41470s != 1;
                    if (!z21 && c5145e.W(1) && !(c5144d4 instanceof w.g)) {
                        if (j11 == 3 && c5144d4.f41469r == 0 && j12 != 3 && !c5144d4.x()) {
                            z21 = true;
                        }
                        if (j12 == 3 && c5144d4.f41470s == 0 && j11 != 3 && !c5144d4.x()) {
                            z21 = true;
                        }
                        if ((j11 == 3 || j12 == 3) && c5144d4.f41435W > 0.0f) {
                            z21 = true;
                        }
                    }
                    if (!z21) {
                        q02.n(0, c5144d4, fVar3);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar3.f41967a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i36 = 0; i36 < childCount2; i36++) {
                constraintLayout.getChildAt(i36);
            }
            ArrayList arrayList4 = constraintLayout.f4768u;
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i37 = 0; i37 < size5; i37++) {
                    ((z.c) arrayList4.get(i37)).getClass();
                }
            }
        }
        q02.t(c5145e);
        ArrayList arrayList5 = (ArrayList) q02.f39325b;
        int size6 = arrayList5.size();
        if (i13 > 0) {
            q02.r(c5145e, 0, q9, k6);
        }
        if (size6 > 0) {
            int[] iArr4 = c5145e.f41467p0;
            boolean z22 = iArr4[0] == 2;
            boolean z23 = iArr4[1] == 2;
            int q11 = c5145e.q();
            C5145e c5145e4 = (C5145e) q02.f39327d;
            int max7 = Math.max(q11, c5145e4.f41441b0);
            int max8 = Math.max(c5145e.k(), c5145e4.f41443c0);
            int i38 = 0;
            boolean z24 = false;
            while (i38 < size6) {
                C5144d c5144d5 = (C5144d) arrayList5.get(i38);
                if (c5144d5 instanceof w.g) {
                    int q12 = c5144d5.q();
                    z11 = z23;
                    int k10 = c5144d5.k();
                    z12 = z22;
                    boolean n9 = z24 | q02.n(1, c5144d5, fVar2);
                    int q13 = c5144d5.q();
                    boolean z25 = n9;
                    int k11 = c5144d5.k();
                    if (q13 != q12) {
                        c5144d5.O(q13);
                        if (z12 && c5144d5.r() + c5144d5.f41433U > max7) {
                            max7 = Math.max(max7, c5144d5.i(4).e() + c5144d5.r() + c5144d5.f41433U);
                        }
                        z25 = true;
                    }
                    if (k11 != k10) {
                        c5144d5.L(k11);
                        if (z11 && c5144d5.s() + c5144d5.f41434V > max8) {
                            max8 = Math.max(max8, c5144d5.i(5).e() + c5144d5.s() + c5144d5.f41434V);
                        }
                        z25 = true;
                    }
                    z24 = z25 | ((w.g) c5144d5).f41549y0;
                } else {
                    z11 = z23;
                    z12 = z22;
                }
                i38++;
                z23 = z11;
                z22 = z12;
            }
            boolean z26 = z23;
            boolean z27 = z22;
            int i39 = 0;
            while (i39 < 2) {
                int i40 = 0;
                while (i40 < size6) {
                    C5144d c5144d6 = (C5144d) arrayList5.get(i40);
                    if (((c5144d6 instanceof w.i) && !(c5144d6 instanceof w.g)) || (c5144d6 instanceof w.h) || c5144d6.f41451g0 == 8 || ((z9 && c5144d6.f41444d.f41761e.f41741j && c5144d6.f41446e.f41761e.f41741j) || (c5144d6 instanceof w.g))) {
                        arrayList = arrayList5;
                        i16 = size6;
                    } else {
                        int q14 = c5144d6.q();
                        int k12 = c5144d6.k();
                        arrayList = arrayList5;
                        int i41 = c5144d6.f41439a0;
                        i16 = size6;
                        boolean n10 = q02.n(i39 == 1 ? 2 : 1, c5144d6, fVar2) | z24;
                        int q15 = c5144d6.q();
                        boolean z28 = n10;
                        int k13 = c5144d6.k();
                        if (q15 != q14) {
                            c5144d6.O(q15);
                            if (z27 && c5144d6.r() + c5144d6.f41433U > max7) {
                                max7 = Math.max(max7, c5144d6.i(4).e() + c5144d6.r() + c5144d6.f41433U);
                            }
                            z28 = true;
                        }
                        if (k13 != k12) {
                            c5144d6.L(k13);
                            if (z26 && c5144d6.s() + c5144d6.f41434V > max8) {
                                max8 = Math.max(max8, c5144d6.i(5).e() + c5144d6.s() + c5144d6.f41434V);
                            }
                            z28 = true;
                        }
                        z24 = (!c5144d6.f41418E || i41 == c5144d6.f41439a0) ? z28 : true;
                    }
                    i40++;
                    arrayList5 = arrayList;
                    size6 = i16;
                }
                ArrayList arrayList6 = arrayList5;
                int i42 = size6;
                if (!z24) {
                    break;
                }
                i39++;
                q02.r(c5145e, i39, q9, k6);
                arrayList5 = arrayList6;
                size6 = i42;
                z24 = false;
            }
        }
        c5145e.f41480D0 = i34;
        C5086c.f40969q = c5145e.W(512);
    }

    public final void l(C5144d c5144d, e eVar, SparseArray sparseArray, int i, int i4) {
        View view = (View) this.f4767n.get(i);
        C5144d c5144d2 = (C5144d) sparseArray.get(i);
        if (c5144d2 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar.f41932c0 = true;
        if (i4 == 6) {
            e eVar2 = (e) view.getLayoutParams();
            eVar2.f41932c0 = true;
            eVar2.f41956p0.f41418E = true;
        }
        c5144d.i(6).b(c5144d2.i(i4), eVar.f41906D, eVar.f41905C, true);
        c5144d.f41418E = true;
        c5144d.i(3).j();
        c5144d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            C5144d c5144d = eVar.f41956p0;
            if (childAt.getVisibility() != 8 || eVar.f41934d0 || eVar.f41936e0 || isInEditMode) {
                int r9 = c5144d.r();
                int s3 = c5144d.s();
                childAt.layout(r9, s3, c5144d.q() + r9, c5144d.k() + s3);
            }
        }
        ArrayList arrayList = this.f4768u;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((z.c) arrayList.get(i12)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0341  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i4) {
        boolean z8;
        int i9;
        boolean z9;
        C5144d c5144d;
        int i10;
        C5144d c5144d2;
        int i11;
        int i12;
        int i13;
        C5144d c5144d3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C5144d c5144d4;
        int i19;
        int i20;
        C5144d c5144d5;
        e eVar;
        int i21;
        C5144d c5144d6;
        float f6;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float parseFloat;
        int i27;
        char c4;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i28;
        String resourceName;
        int id;
        C5144d c5144d7;
        ConstraintLayout constraintLayout = this;
        boolean z10 = constraintLayout.f4759A;
        constraintLayout.f4759A = z10;
        int i29 = 0;
        int i30 = 1;
        if (!z10) {
            int childCount = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                    constraintLayout.f4759A = true;
                    break;
                }
                i31++;
            }
        }
        boolean z11 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C5145e c5145e = constraintLayout.f4769v;
        c5145e.f41494v0 = z11;
        if (constraintLayout.f4759A) {
            constraintLayout.f4759A = false;
            int childCount2 = constraintLayout.getChildCount();
            int i32 = 0;
            while (true) {
                if (i32 >= childCount2) {
                    z8 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                        z8 = true;
                        break;
                    }
                    i32++;
                }
            }
            if (z8) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i33 = 0; i33 < childCount3; i33++) {
                    C5144d h9 = constraintLayout.h(constraintLayout.getChildAt(i33));
                    if (h9 != null) {
                        h9.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    int i34 = 0;
                    while (i34 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i34);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f4764F == null) {
                                    constraintLayout.f4764F = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                i28 = i30;
                                try {
                                    constraintLayout.f4764F.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i28 = i30;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i28 = i30;
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f4767n.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c5144d7 = view == null ? null : ((e) view.getLayoutParams()).f41956p0;
                                c5144d7.f41453h0 = resourceName;
                                i34++;
                                i30 = i28;
                            }
                        }
                        c5144d7 = c5145e;
                        c5144d7.f41453h0 = resourceName;
                        i34++;
                        i30 = i28;
                    }
                }
                int i35 = i30;
                if (constraintLayout.f4763E != -1) {
                    for (int i36 = 0; i36 < childCount3; i36++) {
                        constraintLayout.getChildAt(i36).getId();
                    }
                }
                n nVar = constraintLayout.f4761C;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c5145e.f41489q0.clear();
                ArrayList arrayList3 = constraintLayout.f4768u;
                int size = arrayList3.size();
                if (size > 0) {
                    int i37 = 0;
                    while (i37 < size) {
                        z.c cVar = (z.c) arrayList3.get(i37);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f41899x);
                        }
                        w.i iVar = cVar.f41898w;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f41558r0 = i29;
                            Arrays.fill(iVar.f41557q0, obj);
                            int i38 = i29;
                            while (i38 < cVar.f41896u) {
                                int i39 = cVar.f41895n[i38];
                                View view2 = (View) constraintLayout.f4767n.get(i39);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i39);
                                    HashMap hashMap = cVar.f41901z;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f9 = cVar.f(constraintLayout, str);
                                    if (f9 != 0) {
                                        cVar.f41895n[i38] = f9;
                                        hashMap.put(Integer.valueOf(f9), str);
                                        view2 = (View) constraintLayout.f4767n.get(f9);
                                    }
                                }
                                if (view2 != null) {
                                    w.i iVar2 = cVar.f41898w;
                                    C5144d h10 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h10 != iVar2 && h10 != null) {
                                        int i40 = iVar2.f41558r0 + 1;
                                        C5144d[] c5144dArr = iVar2.f41557q0;
                                        arrayList2 = arrayList3;
                                        if (i40 > c5144dArr.length) {
                                            iVar2.f41557q0 = (C5144d[]) Arrays.copyOf(c5144dArr, c5144dArr.length * 2);
                                        }
                                        C5144d[] c5144dArr2 = iVar2.f41557q0;
                                        int i41 = iVar2.f41558r0;
                                        c5144dArr2[i41] = h10;
                                        iVar2.f41558r0 = i41 + 1;
                                        i38++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i38++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            cVar.f41898w.S();
                        }
                        i37++;
                        arrayList3 = arrayList;
                        obj = null;
                        i29 = 0;
                    }
                }
                int i42 = 2;
                for (int i43 = 0; i43 < childCount3; i43++) {
                    constraintLayout.getChildAt(i43);
                }
                SparseArray sparseArray = constraintLayout.f4765G;
                sparseArray.clear();
                sparseArray.put(0, c5145e);
                sparseArray.put(constraintLayout.getId(), c5145e);
                for (int i44 = 0; i44 < childCount3; i44++) {
                    View childAt2 = constraintLayout.getChildAt(i44);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i45 = 0;
                while (i45 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i45);
                    C5144d h11 = constraintLayout.h(childAt3);
                    if (h11 != null) {
                        e eVar2 = (e) childAt3.getLayoutParams();
                        c5145e.f41489q0.add(h11);
                        C5144d c5144d8 = h11.f41432T;
                        if (c5144d8 != null) {
                            ((C5145e) c5144d8).f41489q0.remove(h11);
                            h11.C();
                        }
                        h11.f41432T = c5145e;
                        eVar2.a();
                        h11.f41451g0 = childAt3.getVisibility();
                        h11.f41449f0 = childAt3;
                        if (childAt3 instanceof z.c) {
                            ((z.c) childAt3).h(h11, c5145e.f41494v0);
                        }
                        if (eVar2.f41934d0) {
                            w.h hVar = (w.h) h11;
                            int i46 = eVar2.m0;
                            int i47 = eVar2.f41952n0;
                            float f10 = eVar2.f41954o0;
                            if (f10 == -1.0f) {
                                c4 = 65535;
                                if (i46 != -1) {
                                    if (i46 > -1) {
                                        hVar.f41551q0 = -1.0f;
                                        hVar.f41552r0 = i46;
                                        hVar.f41553s0 = -1;
                                    }
                                } else if (i47 != -1 && i47 > -1) {
                                    hVar.f41551q0 = -1.0f;
                                    hVar.f41552r0 = -1;
                                    hVar.f41553s0 = i47;
                                }
                                i9 = i45;
                                z9 = z8;
                                i24 = i42;
                            } else if (f10 > -1.0f) {
                                hVar.f41551q0 = f10;
                                c4 = 65535;
                                hVar.f41552r0 = -1;
                                hVar.f41553s0 = -1;
                                i9 = i45;
                                z9 = z8;
                                i24 = i42;
                            }
                        } else {
                            int i48 = eVar2.f41938f0;
                            int i49 = eVar2.f41940g0;
                            int i50 = eVar2.f41942h0;
                            int i51 = eVar2.f41943i0;
                            int i52 = eVar2.f41945j0;
                            int i53 = eVar2.f41947k0;
                            i9 = i45;
                            float f11 = eVar2.f41949l0;
                            int i54 = eVar2.f41955p;
                            z9 = z8;
                            if (i54 != -1) {
                                C5144d c5144d9 = (C5144d) sparseArray.get(i54);
                                if (c5144d9 != null) {
                                    float f12 = eVar2.f41958r;
                                    h11.v(7, 7, eVar2.f41957q, 0, c5144d9);
                                    h11.f41417D = f12;
                                }
                                constraintLayout = this;
                                c5144d6 = h11;
                                eVar = eVar2;
                                i14 = 4;
                                i13 = 2;
                            } else {
                                if (i48 != -1) {
                                    C5144d c5144d10 = (C5144d) sparseArray.get(i48);
                                    if (c5144d10 != null) {
                                        c5144d = h11;
                                        i10 = 2;
                                        c5144d.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar2).leftMargin, i52, c5144d10);
                                    } else {
                                        c5144d = h11;
                                        i10 = 2;
                                    }
                                } else {
                                    c5144d = h11;
                                    i10 = 2;
                                    if (i49 != -1 && (c5144d2 = (C5144d) sparseArray.get(i49)) != null) {
                                        c5144d.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar2).leftMargin, i52, c5144d2);
                                        i11 = 2;
                                        i12 = 4;
                                        if (i50 == -1) {
                                            C5144d c5144d11 = (C5144d) sparseArray.get(i50);
                                            if (c5144d11 != null) {
                                                c5144d.v(i12, i11, ((ViewGroup.MarginLayoutParams) eVar2).rightMargin, i53, c5144d11);
                                            }
                                            i13 = i11;
                                        } else {
                                            i13 = i11;
                                            if (i51 != -1 && (c5144d3 = (C5144d) sparseArray.get(i51)) != null) {
                                                c5144d.v(i12, i12, ((ViewGroup.MarginLayoutParams) eVar2).rightMargin, i53, c5144d3);
                                            }
                                        }
                                        i14 = i12;
                                        i15 = eVar2.i;
                                        if (i15 == -1) {
                                            C5144d c5144d12 = (C5144d) sparseArray.get(i15);
                                            if (c5144d12 != null) {
                                                i22 = 3;
                                                c5144d.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar2).topMargin, eVar2.f41964x, c5144d12);
                                            } else {
                                                i22 = 3;
                                            }
                                            i17 = i22;
                                            i18 = 5;
                                            i16 = -1;
                                        } else {
                                            int i55 = eVar2.f41944j;
                                            i16 = -1;
                                            if (i55 == -1 || (c5144d4 = (C5144d) sparseArray.get(i55)) == null) {
                                                i17 = 3;
                                                i18 = 5;
                                            } else {
                                                c5144d.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar2).topMargin, eVar2.f41964x, c5144d4);
                                                i17 = 3;
                                                i18 = 5;
                                            }
                                        }
                                        i19 = eVar2.f41946k;
                                        if (i19 == i16) {
                                            C5144d c5144d13 = (C5144d) sparseArray.get(i19);
                                            if (c5144d13 != null) {
                                                int i56 = i17;
                                                c5144d.v(i18, i56, ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin, eVar2.f41966z, c5144d13);
                                                i20 = i56;
                                            } else {
                                                i20 = i17;
                                            }
                                        } else {
                                            i20 = i17;
                                            int i57 = eVar2.f41948l;
                                            if (i57 != i16 && (c5144d5 = (C5144d) sparseArray.get(i57)) != null) {
                                                c5144d.v(i18, i18, ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin, eVar2.f41966z, c5144d5);
                                            }
                                        }
                                        eVar = eVar2;
                                        i21 = eVar.f41950m;
                                        if (i21 == -1) {
                                            constraintLayout = this;
                                            c5144d6 = c5144d;
                                            constraintLayout.l(c5144d6, eVar, sparseArray, i21, 6);
                                        } else {
                                            int i58 = eVar.f41951n;
                                            if (i58 != -1) {
                                                constraintLayout = this;
                                                c5144d6 = c5144d;
                                                constraintLayout.l(c5144d6, eVar, sparseArray, i58, i20);
                                            } else {
                                                int i59 = eVar.f41953o;
                                                constraintLayout = this;
                                                c5144d6 = c5144d;
                                                int i60 = i18;
                                                if (i59 != -1) {
                                                    constraintLayout.l(c5144d6, eVar, sparseArray, i59, i60);
                                                }
                                                if (f11 >= 0.0f) {
                                                    c5144d6.f41445d0 = f11;
                                                }
                                                f6 = eVar.f41908F;
                                                if (f6 >= 0.0f) {
                                                    c5144d6.f41447e0 = f6;
                                                }
                                            }
                                        }
                                        if (f11 >= 0.0f) {
                                        }
                                        f6 = eVar.f41908F;
                                        if (f6 >= 0.0f) {
                                        }
                                    }
                                }
                                i11 = i10;
                                i12 = 4;
                                if (i50 == -1) {
                                }
                                i14 = i12;
                                i15 = eVar2.i;
                                if (i15 == -1) {
                                }
                                i19 = eVar2.f41946k;
                                if (i19 == i16) {
                                }
                                eVar = eVar2;
                                i21 = eVar.f41950m;
                                if (i21 == -1) {
                                }
                                if (f11 >= 0.0f) {
                                }
                                f6 = eVar.f41908F;
                                if (f6 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i27 = eVar.f41921T) != -1 || eVar.f41922U != -1)) {
                                int i61 = eVar.f41922U;
                                c5144d6.Y = i27;
                                c5144d6.f41437Z = i61;
                            }
                            if (eVar.f41928a0) {
                                c5144d6.M(i35);
                                c5144d6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    c5144d6.M(i42);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.f41924W) {
                                    c5144d6.M(3);
                                } else {
                                    c5144d6.M(4);
                                }
                                c5144d6.i(i13).f41412g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                c5144d6.i(i14).f41412g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                c5144d6.M(3);
                                c5144d6.O(0);
                            }
                            if (eVar.f41930b0) {
                                i23 = -1;
                                c5144d6.N(1);
                                c5144d6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    c5144d6.N(2);
                                }
                            } else {
                                i23 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.f41925X) {
                                        c5144d6.N(3);
                                    } else {
                                        c5144d6.N(4);
                                    }
                                    c5144d6.i(3).f41412g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    c5144d6.i(5).f41412g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    c5144d6.N(3);
                                    c5144d6.L(0);
                                }
                            }
                            String str2 = eVar.f41909G;
                            if (str2 == null || str2.length() == 0) {
                                c5144d6.f41435W = 0.0f;
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
                                    c5144d6.f41435W = parseFloat;
                                    c5144d6.f41436X = i25;
                                }
                            }
                            float f13 = eVar.f41910H;
                            float[] fArr = c5144d6.f41458k0;
                            fArr[0] = f13;
                            i35 = 1;
                            fArr[1] = eVar.f41911I;
                            c5144d6.f41454i0 = eVar.J;
                            c5144d6.f41456j0 = eVar.f41912K;
                            int i62 = eVar.f41926Z;
                            if (i62 >= 0 && i62 <= 3) {
                                c5144d6.f41468q = i62;
                            }
                            int i63 = eVar.f41913L;
                            int i64 = eVar.f41915N;
                            int i65 = eVar.f41917P;
                            float f14 = eVar.f41919R;
                            c5144d6.f41469r = i63;
                            c5144d6.f41472u = i64;
                            if (i65 == Integer.MAX_VALUE) {
                                i65 = 0;
                            }
                            c5144d6.f41473v = i65;
                            c5144d6.f41474w = f14;
                            if (f14 > 0.0f && f14 < 1.0f && i63 == 0) {
                                c5144d6.f41469r = 2;
                            }
                            int i66 = eVar.f41914M;
                            int i67 = eVar.f41916O;
                            int i68 = eVar.f41918Q;
                            float f15 = eVar.f41920S;
                            c5144d6.f41470s = i66;
                            c5144d6.f41475x = i67;
                            if (i68 == Integer.MAX_VALUE) {
                                i68 = 0;
                            }
                            c5144d6.f41476y = i68;
                            c5144d6.f41477z = f15;
                            if (f15 <= 0.0f || f15 >= 1.0f || i66 != 0) {
                                i24 = 2;
                            } else {
                                i24 = 2;
                                c5144d6.f41470s = 2;
                            }
                        }
                        i45 = i9 + 1;
                        i42 = i24;
                        z8 = z9;
                    }
                    i9 = i45;
                    z9 = z8;
                    i24 = i42;
                    i45 = i9 + 1;
                    i42 = i24;
                    z8 = z9;
                }
            }
            if (z8) {
                c5145e.f41490r0.t(c5145e);
            }
        }
        c5145e.f41495w0.getClass();
        constraintLayout.k(c5145e, constraintLayout.f4760B, i, i4);
        int q6 = c5145e.q();
        int k6 = c5145e.k();
        boolean z12 = c5145e.f41481E0;
        boolean z13 = c5145e.f41482F0;
        f fVar = constraintLayout.f4766H;
        int i69 = fVar.f41971e;
        int resolveSizeAndState = View.resolveSizeAndState(q6 + fVar.f41970d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k6 + i69, i4, 0) & 16777215;
        int min = Math.min(constraintLayout.f4772y, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.f4773z, resolveSizeAndState2);
        if (z12) {
            min |= b.bc;
        }
        if (z13) {
            min2 |= b.bc;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C5144d h9 = h(view);
        if ((view instanceof p) && !(h9 instanceof w.h)) {
            e eVar = (e) view.getLayoutParams();
            w.h hVar = new w.h();
            eVar.f41956p0 = hVar;
            eVar.f41934d0 = true;
            hVar.S(eVar.f41923V);
        }
        if (view instanceof z.c) {
            z.c cVar = (z.c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f41936e0 = true;
            ArrayList arrayList = this.f4768u;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f4767n.put(view.getId(), view);
        this.f4759A = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4767n.remove(view.getId());
        C5144d h9 = h(view);
        this.f4769v.f41489q0.remove(h9);
        h9.C();
        this.f4768u.remove(view);
        this.f4759A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4759A = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f4761C = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f4767n;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f4773z) {
            return;
        }
        this.f4773z = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f4772y) {
            return;
        }
        this.f4772y = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f4771x) {
            return;
        }
        this.f4771x = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f4770w) {
            return;
        }
        this.f4770w = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        c cVar = this.f4762D;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f4760B = i;
        C5145e c5145e = this.f4769v;
        c5145e.f41480D0 = i;
        C5086c.f40969q = c5145e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4767n = new SparseArray();
        this.f4768u = new ArrayList(4);
        this.f4769v = new C5145e();
        this.f4770w = 0;
        this.f4771x = 0;
        this.f4772y = Integer.MAX_VALUE;
        this.f4773z = Integer.MAX_VALUE;
        this.f4759A = true;
        this.f4760B = 257;
        this.f4761C = null;
        this.f4762D = null;
        this.f4763E = -1;
        this.f4764F = new HashMap();
        this.f4765G = new SparseArray();
        this.f4766H = new f(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(layoutParams);
        eVar.f41927a = -1;
        eVar.f41929b = -1;
        eVar.f41931c = -1.0f;
        eVar.f41933d = true;
        eVar.f41935e = -1;
        eVar.f41937f = -1;
        eVar.f41939g = -1;
        eVar.f41941h = -1;
        eVar.i = -1;
        eVar.f41944j = -1;
        eVar.f41946k = -1;
        eVar.f41948l = -1;
        eVar.f41950m = -1;
        eVar.f41951n = -1;
        eVar.f41953o = -1;
        eVar.f41955p = -1;
        eVar.f41957q = 0;
        eVar.f41958r = 0.0f;
        eVar.f41959s = -1;
        eVar.f41960t = -1;
        eVar.f41961u = -1;
        eVar.f41962v = -1;
        eVar.f41963w = Integer.MIN_VALUE;
        eVar.f41964x = Integer.MIN_VALUE;
        eVar.f41965y = Integer.MIN_VALUE;
        eVar.f41966z = Integer.MIN_VALUE;
        eVar.f41903A = Integer.MIN_VALUE;
        eVar.f41904B = Integer.MIN_VALUE;
        eVar.f41905C = Integer.MIN_VALUE;
        eVar.f41906D = 0;
        eVar.f41907E = 0.5f;
        eVar.f41908F = 0.5f;
        eVar.f41909G = null;
        eVar.f41910H = -1.0f;
        eVar.f41911I = -1.0f;
        eVar.J = 0;
        eVar.f41912K = 0;
        eVar.f41913L = 0;
        eVar.f41914M = 0;
        eVar.f41915N = 0;
        eVar.f41916O = 0;
        eVar.f41917P = 0;
        eVar.f41918Q = 0;
        eVar.f41919R = 1.0f;
        eVar.f41920S = 1.0f;
        eVar.f41921T = -1;
        eVar.f41922U = -1;
        eVar.f41923V = -1;
        eVar.f41924W = false;
        eVar.f41925X = false;
        eVar.Y = null;
        eVar.f41926Z = 0;
        eVar.f41928a0 = true;
        eVar.f41930b0 = true;
        eVar.f41932c0 = false;
        eVar.f41934d0 = false;
        eVar.f41936e0 = false;
        eVar.f41938f0 = -1;
        eVar.f41940g0 = -1;
        eVar.f41942h0 = -1;
        eVar.f41943i0 = -1;
        eVar.f41945j0 = Integer.MIN_VALUE;
        eVar.f41947k0 = Integer.MIN_VALUE;
        eVar.f41949l0 = 0.5f;
        eVar.f41956p0 = new C5144d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof e)) {
            return eVar;
        }
        e eVar2 = (e) layoutParams;
        eVar.f41927a = eVar2.f41927a;
        eVar.f41929b = eVar2.f41929b;
        eVar.f41931c = eVar2.f41931c;
        eVar.f41933d = eVar2.f41933d;
        eVar.f41935e = eVar2.f41935e;
        eVar.f41937f = eVar2.f41937f;
        eVar.f41939g = eVar2.f41939g;
        eVar.f41941h = eVar2.f41941h;
        eVar.i = eVar2.i;
        eVar.f41944j = eVar2.f41944j;
        eVar.f41946k = eVar2.f41946k;
        eVar.f41948l = eVar2.f41948l;
        eVar.f41950m = eVar2.f41950m;
        eVar.f41951n = eVar2.f41951n;
        eVar.f41953o = eVar2.f41953o;
        eVar.f41955p = eVar2.f41955p;
        eVar.f41957q = eVar2.f41957q;
        eVar.f41958r = eVar2.f41958r;
        eVar.f41959s = eVar2.f41959s;
        eVar.f41960t = eVar2.f41960t;
        eVar.f41961u = eVar2.f41961u;
        eVar.f41962v = eVar2.f41962v;
        eVar.f41963w = eVar2.f41963w;
        eVar.f41964x = eVar2.f41964x;
        eVar.f41965y = eVar2.f41965y;
        eVar.f41966z = eVar2.f41966z;
        eVar.f41903A = eVar2.f41903A;
        eVar.f41904B = eVar2.f41904B;
        eVar.f41905C = eVar2.f41905C;
        eVar.f41906D = eVar2.f41906D;
        eVar.f41907E = eVar2.f41907E;
        eVar.f41908F = eVar2.f41908F;
        eVar.f41909G = eVar2.f41909G;
        eVar.f41910H = eVar2.f41910H;
        eVar.f41911I = eVar2.f41911I;
        eVar.J = eVar2.J;
        eVar.f41912K = eVar2.f41912K;
        eVar.f41924W = eVar2.f41924W;
        eVar.f41925X = eVar2.f41925X;
        eVar.f41913L = eVar2.f41913L;
        eVar.f41914M = eVar2.f41914M;
        eVar.f41915N = eVar2.f41915N;
        eVar.f41917P = eVar2.f41917P;
        eVar.f41916O = eVar2.f41916O;
        eVar.f41918Q = eVar2.f41918Q;
        eVar.f41919R = eVar2.f41919R;
        eVar.f41920S = eVar2.f41920S;
        eVar.f41921T = eVar2.f41921T;
        eVar.f41922U = eVar2.f41922U;
        eVar.f41923V = eVar2.f41923V;
        eVar.f41928a0 = eVar2.f41928a0;
        eVar.f41930b0 = eVar2.f41930b0;
        eVar.f41932c0 = eVar2.f41932c0;
        eVar.f41934d0 = eVar2.f41934d0;
        eVar.f41938f0 = eVar2.f41938f0;
        eVar.f41940g0 = eVar2.f41940g0;
        eVar.f41942h0 = eVar2.f41942h0;
        eVar.f41943i0 = eVar2.f41943i0;
        eVar.f41945j0 = eVar2.f41945j0;
        eVar.f41947k0 = eVar2.f41947k0;
        eVar.f41949l0 = eVar2.f41949l0;
        eVar.Y = eVar2.Y;
        eVar.f41926Z = eVar2.f41926Z;
        eVar.f41956p0 = eVar2.f41956p0;
        return eVar;
    }
}

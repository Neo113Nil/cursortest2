package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bvw;
import defpackage.rv;
import defpackage.sa;
import defpackage.sd;
import defpackage.se;
import defpackage.sh;
import defpackage.si;
import defpackage.sj;
import defpackage.sk;
import defpackage.sl;
import defpackage.sn;
import defpackage.sp;
import defpackage.st;
import defpackage.sv;
import defpackage.sw;
import defpackage.sy;
import defpackage.tb;
import defpackage.td;
import defpackage.te;
import defpackage.tn;
import defpackage.to;
import defpackage.tp;
import defpackage.tr;
import defpackage.tw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final se c;
    public int d;
    protected boolean e;
    public int f;
    public tn g;
    final te h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new se();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new te(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        se seVar = this.c;
        seVar.ah = this;
        te teVar = this.h;
        seVar.aH = teVar;
        seVar.a.g = teVar;
        this.a.put(getId(), this);
        this.g = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tr.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.f = obtainStyledAttributes.getInt(113, this.f);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            tw.A(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        tn tnVar = new tn();
                        this.g = tnVar;
                        tnVar.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.g = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.X(this.f);
    }

    private final void f() {
        this.e = true;
    }

    private final void g() {
        boolean z;
        sd sdVar;
        sd sdVar2;
        sd sdVar3;
        sd sdVar4;
        sd sdVar5;
        td tdVar;
        sd sdVar6;
        boolean z2;
        int i;
        int i2;
        float parseFloat;
        Throwable th;
        int i3;
        Throwable th2;
        int i4;
        si siVar;
        sd bA;
        sd sdVar7;
        ConstraintLayout constraintLayout = this;
        boolean isInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            sd bA2 = constraintLayout.bA(constraintLayout.getChildAt(i5));
            if (bA2 != null) {
                bA2.t();
            }
        }
        Throwable th3 = null;
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = constraintLayout.getChildAt(i6);
                try {
                    String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer valueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        String substring = indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName;
                        valueOf.getClass();
                        constraintLayout.m.put(substring, Integer.valueOf(id));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        sdVar7 = constraintLayout.c;
                    } else {
                        View view = (View) constraintLayout.a.get(id2);
                        if (view == null && (view = constraintLayout.findViewById(id2)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(view);
                        }
                        sdVar7 = view == constraintLayout ? constraintLayout.c : view == null ? null : ((td) view.getLayoutParams()).av;
                    }
                    sdVar7.aj = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = constraintLayout.getChildAt(i7);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof to)) {
                    throw null;
                }
            }
        }
        tn tnVar = constraintLayout.g;
        if (tnVar != null) {
            tnVar.j(constraintLayout);
        }
        se seVar = constraintLayout.c;
        seVar.aJ.clear();
        ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        int i8 = 1;
        if (size > 0) {
            int i9 = 0;
            while (i9 < size) {
                tb tbVar = (tb) arrayList.get(i9);
                if (tbVar.isInEditMode()) {
                    tbVar.h(tbVar.f);
                }
                si siVar2 = tbVar.i;
                if (siVar2 == null) {
                    th = th3;
                    i3 = i8;
                } else {
                    siVar2.aK = 0;
                    Arrays.fill(siVar2.aJ, th3);
                    int i10 = 0;
                    while (i10 < tbVar.d) {
                        int i11 = tbVar.c[i10];
                        View a = constraintLayout.a(i11);
                        if (a == null) {
                            HashMap hashMap = tbVar.h;
                            String str = (String) hashMap.get(Integer.valueOf(i11));
                            th2 = th3;
                            int d = tbVar.d(constraintLayout, str);
                            if (d != 0) {
                                tbVar.c[i10] = d;
                                hashMap.put(Integer.valueOf(d), str);
                                a = constraintLayout.a(d);
                            }
                        } else {
                            th2 = th3;
                        }
                        if (a == null || (bA = constraintLayout.bA(a)) == (siVar = tbVar.i) || bA == null) {
                            i4 = i8;
                        } else {
                            int i12 = siVar.aK + i8;
                            sd[] sdVarArr = siVar.aJ;
                            i4 = i8;
                            int length = sdVarArr.length;
                            if (i12 > length) {
                                siVar.aJ = (sd[]) Arrays.copyOf(sdVarArr, length + length);
                            }
                            sd[] sdVarArr2 = siVar.aJ;
                            int i13 = siVar.aK;
                            sdVarArr2[i13] = bA;
                            siVar.aK = i13 + 1;
                        }
                        i10++;
                        th3 = th2;
                        i8 = i4;
                    }
                    th = th3;
                    i3 = i8;
                    tbVar.i.Y();
                }
                i9++;
                th3 = th;
                i8 = i3;
            }
        }
        Throwable th4 = th3;
        int i14 = i8;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = constraintLayout.getChildAt(i15);
            if (childAt3 instanceof tp) {
                throw th4;
            }
        }
        SparseArray sparseArray = constraintLayout.n;
        sparseArray.clear();
        sparseArray.put(0, seVar);
        sparseArray.put(constraintLayout.getId(), seVar);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = constraintLayout.getChildAt(i16);
            sparseArray.put(childAt4.getId(), constraintLayout.bA(childAt4));
        }
        int i17 = 0;
        while (i17 < childCount) {
            View childAt5 = constraintLayout.getChildAt(i17);
            sd bA3 = constraintLayout.bA(childAt5);
            if (bA3 != null) {
                td tdVar2 = (td) childAt5.getLayoutParams();
                seVar.aJ.add(bA3);
                sd sdVar8 = bA3.V;
                if (sdVar8 != null) {
                    ((sl) sdVar8).ab(bA3);
                }
                bA3.V = seVar;
                tdVar2.a();
                tdVar2.aw = z3;
                bA3.ai = childAt5.getVisibility();
                boolean z4 = tdVar2.aj;
                bA3.ah = childAt5;
                if (childAt5 instanceof tb) {
                    ((tb) childAt5).c(bA3, seVar.c);
                }
                if (tdVar2.ah) {
                    sh shVar = (sh) bA3;
                    int i18 = tdVar2.as;
                    int i19 = tdVar2.at;
                    float f = tdVar2.au;
                    if (f != -1.0f) {
                        if (f > -1.0f) {
                            shVar.a = f;
                            shVar.b = -1;
                            shVar.c = -1;
                        }
                    } else if (i18 != -1) {
                        if (i18 >= 0) {
                            shVar.a = -1.0f;
                            shVar.b = i18;
                            shVar.c = -1;
                        }
                    } else if (i19 != -1 && i19 >= 0) {
                        shVar.a = -1.0f;
                        shVar.b = -1;
                        shVar.c = i19;
                    }
                } else {
                    int i20 = tdVar2.al;
                    int i21 = tdVar2.am;
                    int i22 = tdVar2.an;
                    int i23 = tdVar2.ao;
                    int i24 = tdVar2.ap;
                    int i25 = tdVar2.aq;
                    float f2 = tdVar2.ar;
                    int i26 = tdVar2.p;
                    z = isInEditMode;
                    if (i26 != -1) {
                        sd sdVar9 = (sd) sparseArray.get(i26);
                        if (sdVar9 != null) {
                            float f3 = tdVar2.r;
                            bA3.R(7, sdVar9, 7, tdVar2.q, 0);
                            bA3.F = f3;
                        }
                        sdVar6 = bA3;
                        tdVar = tdVar2;
                    } else {
                        if (i20 != -1) {
                            sd sdVar10 = (sd) sparseArray.get(i20);
                            if (sdVar10 != null) {
                                sdVar = bA3;
                                sdVar.R(2, sdVar10, 2, tdVar2.leftMargin, i24);
                            } else {
                                sdVar = bA3;
                            }
                        } else {
                            sdVar = bA3;
                            if (i21 != -1 && (sdVar2 = (sd) sparseArray.get(i21)) != null) {
                                sdVar.R(2, sdVar2, 4, tdVar2.leftMargin, i24);
                            }
                        }
                        if (i22 != -1) {
                            sd sdVar11 = (sd) sparseArray.get(i22);
                            if (sdVar11 != null) {
                                sdVar.R(4, sdVar11, 2, tdVar2.rightMargin, i25);
                            }
                        } else if (i23 != -1 && (sdVar3 = (sd) sparseArray.get(i23)) != null) {
                            sdVar.R(4, sdVar3, 4, tdVar2.rightMargin, i25);
                        }
                        int i27 = tdVar2.i;
                        if (i27 != -1) {
                            sd sdVar12 = (sd) sparseArray.get(i27);
                            if (sdVar12 != null) {
                                sdVar.R(3, sdVar12, 3, tdVar2.topMargin, tdVar2.x);
                            }
                        } else {
                            int i28 = tdVar2.j;
                            if (i28 != -1 && (sdVar4 = (sd) sparseArray.get(i28)) != null) {
                                sdVar.R(3, sdVar4, 5, tdVar2.topMargin, tdVar2.x);
                            }
                        }
                        int i29 = tdVar2.k;
                        if (i29 != -1) {
                            sd sdVar13 = (sd) sparseArray.get(i29);
                            if (sdVar13 != null) {
                                sdVar.R(5, sdVar13, 3, tdVar2.bottomMargin, tdVar2.z);
                            }
                        } else {
                            int i30 = tdVar2.l;
                            if (i30 != -1 && (sdVar5 = (sd) sparseArray.get(i30)) != null) {
                                sdVar.R(5, sdVar5, 5, tdVar2.bottomMargin, tdVar2.z);
                            }
                        }
                        tdVar = tdVar2;
                        int i31 = tdVar.m;
                        if (i31 != -1) {
                            sdVar6 = sdVar;
                            h(sdVar6, tdVar, sparseArray, i31, 6);
                        } else {
                            int i32 = tdVar.n;
                            if (i32 != -1) {
                                sdVar6 = sdVar;
                                h(sdVar6, tdVar, sparseArray, i32, 3);
                            } else {
                                int i33 = tdVar.o;
                                if (i33 != -1) {
                                    sdVar6 = sdVar;
                                    h(sdVar6, tdVar, sparseArray, i33, 5);
                                } else {
                                    sdVar6 = sdVar;
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            sdVar6.af = f2;
                        }
                        float f4 = tdVar.H;
                        if (f4 >= 0.0f) {
                            sdVar6.ag = f4;
                        }
                    }
                    if (z) {
                        int i34 = tdVar.X;
                        if (i34 == -1) {
                            if (tdVar.Y != -1) {
                                i34 = -1;
                            }
                        }
                        int i35 = tdVar.Y;
                        sdVar6.aa = i34;
                        sdVar6.ab = i35;
                    }
                    if (tdVar.ae) {
                        sdVar6.S(i14);
                        sdVar6.E(tdVar.width);
                        if (tdVar.width == -2) {
                            sdVar6.S(2);
                        }
                    } else if (tdVar.width == -1) {
                        if (tdVar.aa) {
                            sdVar6.S(3);
                        } else {
                            sdVar6.S(4);
                        }
                        sdVar6.M(2).f = tdVar.leftMargin;
                        sdVar6.M(4).f = tdVar.rightMargin;
                    } else {
                        sdVar6.S(3);
                        sdVar6.E(0);
                    }
                    if (tdVar.af) {
                        sdVar6.T(1);
                        sdVar6.z(tdVar.height);
                        if (tdVar.height == -2) {
                            sdVar6.T(2);
                        }
                    } else if (tdVar.height == -1) {
                        if (tdVar.ab) {
                            sdVar6.T(3);
                        } else {
                            sdVar6.T(4);
                        }
                        sdVar6.M(3).f = tdVar.topMargin;
                        sdVar6.M(5).f = tdVar.bottomMargin;
                    } else {
                        sdVar6.T(3);
                        sdVar6.z(0);
                    }
                    String str2 = tdVar.I;
                    if (str2 == null || str2.length() == 0) {
                        sdVar6.Y = 0.0f;
                    } else {
                        int length2 = str2.length();
                        int indexOf3 = str2.indexOf(44);
                        if (indexOf3 <= 0 || indexOf3 >= length2 - 1) {
                            i = -1;
                            i2 = 0;
                        } else {
                            String substring2 = str2.substring(0, indexOf3);
                            i = substring2.equalsIgnoreCase("W") ? 0 : substring2.equalsIgnoreCase("H") ? 1 : -1;
                            i2 = indexOf3 + 1;
                        }
                        int indexOf4 = str2.indexOf(58);
                        if (indexOf4 < 0 || indexOf4 >= length2 - 1) {
                            String substring3 = str2.substring(i2);
                            if (substring3.length() > 0) {
                                parseFloat = Float.parseFloat(substring3);
                            }
                            parseFloat = 0.0f;
                        } else {
                            String substring4 = str2.substring(i2, indexOf4);
                            String substring5 = str2.substring(indexOf4 + 1);
                            if (substring4.length() > 0 && substring5.length() > 0) {
                                try {
                                    float parseFloat2 = Float.parseFloat(substring4);
                                    float parseFloat3 = Float.parseFloat(substring5);
                                    if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                        parseFloat = i == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            parseFloat = 0.0f;
                        }
                        if (parseFloat > 0.0f) {
                            sdVar6.Y = parseFloat;
                            sdVar6.Z = i;
                        }
                    }
                    float f5 = tdVar.L;
                    float[] fArr = sdVar6.am;
                    z2 = false;
                    fArr[0] = f5;
                    i14 = 1;
                    fArr[1] = tdVar.M;
                    sdVar6.ak = tdVar.N;
                    sdVar6.al = tdVar.O;
                    int i36 = tdVar.ad;
                    if (i36 >= 0 && i36 <= 3) {
                        sdVar6.s = i36;
                    }
                    int i37 = tdVar.P;
                    int i38 = tdVar.R;
                    int i39 = tdVar.T;
                    float f6 = tdVar.V;
                    sdVar6.t = i37;
                    sdVar6.w = i38;
                    if (i39 == Integer.MAX_VALUE) {
                        i39 = 0;
                    }
                    sdVar6.x = i39;
                    sdVar6.y = f6;
                    if (f6 > 0.0f && f6 < 1.0f && i37 == 0) {
                        sdVar6.t = 2;
                    }
                    int i40 = tdVar.Q;
                    int i41 = tdVar.S;
                    int i42 = tdVar.U;
                    float f7 = tdVar.W;
                    sdVar6.u = i40;
                    sdVar6.z = i41;
                    if (i42 == Integer.MAX_VALUE) {
                        i42 = 0;
                    }
                    sdVar6.A = i42;
                    sdVar6.B = f7;
                    if (f7 > 0.0f && f7 < 1.0f && i40 == 0) {
                        sdVar6.u = 2;
                    }
                    i17++;
                    constraintLayout = this;
                    z3 = z2;
                    isInEditMode = z;
                }
            }
            z = isInEditMode;
            z2 = z3;
            i17++;
            constraintLayout = this;
            z3 = z2;
            isInEditMode = z;
        }
    }

    private final void h(sd sdVar, td tdVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        sd sdVar2 = (sd) sparseArray.get(i);
        if (sdVar2 == null || view == null || !(view.getLayoutParams() instanceof td)) {
            return;
        }
        tdVar.ag = true;
        if (i2 == 6) {
            td tdVar2 = (td) view.getLayoutParams();
            tdVar2.ag = true;
            tdVar2.av.G = true;
        }
        sdVar.M(6).l(sdVar2.M(i2), tdVar.D, tdVar.C, true);
        sdVar.G = true;
        sdVar.M(3).e();
        sdVar.M(5).e();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final sd bA(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof td) {
            return ((td) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new td(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof td) {
            return ((td) view.getLayoutParams()).av;
        }
        return null;
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof td;
    }

    public final Object d(Object obj) {
        HashMap hashMap;
        if ((obj instanceof String) && (hashMap = this.m) != null && hashMap.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
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
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        float f = ((int) ((parseInt3 / 1080.0f) * width)) + i4;
                        float f2 = i4;
                        float f3 = i3;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new td();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new td(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            td tdVar = (td) childAt.getLayoutParams();
            sd sdVar = tdVar.av;
            if (childAt.getVisibility() == 8 && !tdVar.ah && !tdVar.ai) {
                boolean z2 = tdVar.ak;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = tdVar.aj;
            int k = sdVar.k();
            int l = sdVar.l();
            childAt.layout(k, l, sdVar.j() + k, sdVar.h() + l);
            if (childAt instanceof tp) {
                throw null;
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x057f, code lost:
    
        if (r11 != 3) goto L292;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int max;
        int i6;
        boolean z;
        boolean z2;
        int[] iArr;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        int size;
        te teVar;
        int i10;
        int i11;
        ArrayList arrayList;
        te teVar2;
        int i12;
        te teVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        sv svVar;
        sw swVar;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        int i19;
        boolean z15;
        int i20;
        int i21;
        int i22;
        boolean z16;
        int size2;
        int i23;
        int size3;
        int i24;
        int i25;
        if (!this.e) {
            int childCount = getChildCount();
            int i26 = 0;
            while (true) {
                if (i26 >= childCount) {
                    break;
                }
                if (getChildAt(i26).isLayoutRequested()) {
                    this.e = true;
                    break;
                }
                i26++;
            }
        }
        se seVar = this.c;
        seVar.c = c();
        if (this.e) {
            this.e = false;
            int childCount2 = getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount2) {
                    break;
                }
                if (getChildAt(i27).isLayoutRequested()) {
                    g();
                    seVar.aI.n(seVar);
                    break;
                }
                i27++;
            }
        }
        rv rvVar = seVar.d;
        int i28 = this.f;
        int mode = View.MeasureSpec.getMode(i);
        int size4 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size5 = View.MeasureSpec.getSize(i2);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i29 = max2 + max3;
        int max4 = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max5 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max5 > 0) {
            max4 = max5;
        }
        te teVar4 = this.h;
        teVar4.b = max2;
        teVar4.c = max3;
        teVar4.d = max4;
        teVar4.e = i29;
        teVar4.f = i;
        teVar4.g = i2;
        int max6 = Math.max(0, getPaddingStart());
        int max7 = Math.max(0, getPaddingEnd());
        if (max6 <= 0 && max7 <= 0) {
            max6 = Math.max(0, getPaddingLeft());
        } else if (c()) {
            max6 = max7;
        }
        int i30 = size4 - max4;
        int i31 = size5 - i29;
        int i32 = teVar4.e;
        int i33 = teVar4.d;
        int childCount3 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount3 == 0) {
                    childCount3 = 0;
                    i3 = i33;
                    i5 = Math.max(0, this.i);
                } else {
                    i3 = i33;
                    i5 = 0;
                }
                i4 = 2;
            } else if (mode != 1073741824) {
                i3 = i33;
                i4 = 1;
                i5 = 0;
            } else {
                i3 = i33;
                i5 = Math.min(this.j - i33, i30);
                i4 = 1;
            }
        } else if (childCount3 == 0) {
            i3 = i33;
            i5 = Math.max(0, this.i);
            i4 = 2;
            childCount3 = 0;
        } else {
            i3 = i33;
            i4 = 2;
            i5 = i30;
        }
        if (mode2 == Integer.MIN_VALUE) {
            max = childCount3 == 0 ? Math.max(0, this.d) : i31;
        } else {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i6 = 1;
                    max = 0;
                } else {
                    max = Math.min(this.k - i32, i31);
                    i6 = 1;
                }
                if (i5 == seVar.j() || max != seVar.h()) {
                    z = true;
                    seVar.a.c = true;
                } else {
                    z = true;
                }
                seVar.aa = 0;
                seVar.ab = 0;
                boolean z17 = z;
                int i34 = this.j - i3;
                int[] iArr2 = seVar.E;
                iArr2[0] = i34;
                iArr2[z17 ? 1 : 0] = this.k - i32;
                seVar.D(0);
                seVar.C(0);
                seVar.S(i4);
                seVar.E(i5);
                seVar.T(i6);
                seVar.z(max);
                seVar.D(this.i - i3);
                seVar.C(this.d - i32);
                seVar.as = max6;
                seVar.at = max2;
                bvw bvwVar = seVar.aI;
                te teVar5 = seVar.aH;
                int size6 = seVar.aJ.size();
                boolean b = sj.b(i28, 128);
                int j = seVar.j();
                int h = seVar.h();
                z2 = !b || sj.b(i28, 64);
                if (z2) {
                    int i35 = 0;
                    while (i35 < size6) {
                        iArr = iArr2;
                        sd sdVar = (sd) seVar.aJ.get(i35);
                        boolean z18 = z2;
                        i7 = size6;
                        int i36 = i35;
                        boolean z19 = sdVar.O() == 3 && sdVar.P() == 3 && sdVar.Y > 0.0f;
                        if (sdVar.J()) {
                            if (z19) {
                                i8 = 1073741824;
                                z3 = false;
                                break;
                            }
                            z19 = false;
                        }
                        if ((!sdVar.K() || !z19) && !(sdVar instanceof sk) && !sdVar.J() && !sdVar.K()) {
                            i35 = i36 + 1;
                            iArr2 = iArr;
                            z2 = z18;
                            size6 = i7;
                        }
                        i8 = 1073741824;
                        z3 = false;
                        break;
                    }
                }
                iArr = iArr2;
                z3 = z2;
                i7 = size6;
                i8 = 1073741824;
                if (mode == i8) {
                    if (mode2 == i8) {
                        z4 = true;
                        mode = 1073741824;
                        mode2 = 1073741824;
                        z5 = z3 & z4;
                        if (z5) {
                            int min = Math.min(iArr[0], i30);
                            int min2 = Math.min(iArr[1], i31);
                            boolean z20 = mode != 1073741824;
                            if (mode == 1073741824 && seVar.j() != min) {
                                seVar.E(min);
                                seVar.c();
                            }
                            boolean z21 = mode2 != 1073741824;
                            if (mode2 == 1073741824 && seVar.h() != min2) {
                                seVar.z(min2);
                                seVar.c();
                            }
                            if (mode == 1073741824) {
                                if (mode2 == 1073741824) {
                                    sp spVar = seVar.a;
                                    if (spVar.b || spVar.c) {
                                        se seVar2 = spVar.a;
                                        ArrayList arrayList2 = seVar2.aJ;
                                        int size7 = arrayList2.size();
                                        int i37 = 0;
                                        while (i37 < size7) {
                                            boolean z22 = z5;
                                            sd sdVar2 = (sd) arrayList2.get(i37);
                                            sdVar2.s();
                                            sdVar2.e = false;
                                            sdVar2.h.g();
                                            sdVar2.i.g();
                                            i37++;
                                            z5 = z22;
                                            z21 = z21;
                                        }
                                        z6 = z5;
                                        z11 = z21;
                                        seVar2.s();
                                        i18 = 0;
                                        seVar2.e = false;
                                        seVar2.h.g();
                                        seVar2.i.g();
                                        spVar.c = false;
                                    } else {
                                        z6 = z5;
                                        z11 = z21;
                                        i18 = 0;
                                    }
                                    spVar.d(spVar.d);
                                    se seVar3 = spVar.a;
                                    seVar3.aa = i18;
                                    seVar3.ab = i18;
                                    int N = seVar3.N(i18);
                                    int N2 = seVar3.N(1);
                                    if (spVar.b) {
                                        spVar.b();
                                    }
                                    int k = seVar3.k();
                                    int l = seVar3.l();
                                    seVar3.h.h.c(k);
                                    seVar3.i.h.c(l);
                                    spVar.c();
                                    if (N == 2) {
                                        z14 = true;
                                        if (b) {
                                            i19 = N2;
                                            z15 = false;
                                        } else {
                                            i19 = N2;
                                            z15 = true;
                                        }
                                    } else if (N2 == 2) {
                                        z14 = true;
                                        z15 = !b;
                                        i19 = 2;
                                    } else {
                                        i20 = k;
                                        int[] iArr3 = seVar3.ar;
                                        i21 = iArr3[0];
                                        if (i21 != 1 || i21 == 4) {
                                            int j2 = i20 + seVar3.j();
                                            seVar3.h.i.c(j2);
                                            seVar3.h.e.c(j2 - i20);
                                            spVar.c();
                                            i22 = iArr3[1];
                                            if (i22 != 1 || i22 == 4) {
                                                int h2 = seVar3.h() + l;
                                                seVar3.i.i.c(h2);
                                                seVar3.i.e.c(h2 - l);
                                            }
                                            spVar.c();
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        ArrayList arrayList3 = spVar.e;
                                        size2 = arrayList3.size();
                                        i23 = 0;
                                        while (i23 < size2) {
                                            sy syVar = (sy) arrayList3.get(i23);
                                            boolean z23 = z16;
                                            if (syVar.d != seVar3 || syVar.g) {
                                                syVar.c();
                                            }
                                            i23++;
                                            z16 = z23;
                                        }
                                        boolean z24 = z16;
                                        size3 = arrayList3.size();
                                        for (i24 = 0; i24 < size3; i24++) {
                                            sy syVar2 = (sy) arrayList3.get(i24);
                                            if ((z24 || syVar2.d != seVar3) && !(syVar2.h.i && ((syVar2.i.i || (syVar2 instanceof st)) && (syVar2.e.i || (syVar2 instanceof sn) || (syVar2 instanceof st))))) {
                                                z7 = false;
                                                break;
                                            }
                                        }
                                        z7 = true;
                                        seVar3.S(N);
                                        seVar3.T(N2);
                                        z12 = z20;
                                        i9 = 2;
                                        if (z7) {
                                            seVar.F(!z12, !z11);
                                        }
                                    }
                                    if (z14 != z15) {
                                        ArrayList arrayList4 = spVar.e;
                                        int size8 = arrayList4.size();
                                        i20 = k;
                                        int i38 = 0;
                                        while (true) {
                                            if (i38 < size8) {
                                                boolean e = ((sy) arrayList4.get(i38)).e();
                                                i38++;
                                                if (!e) {
                                                    break;
                                                }
                                            } else {
                                                if (N == 2) {
                                                    i25 = 1;
                                                    seVar3.S(1);
                                                    seVar3.E(spVar.a(seVar3, 0));
                                                    seVar3.h.e.c(seVar3.j());
                                                    N = 2;
                                                } else {
                                                    i25 = 1;
                                                }
                                                if (i19 == 2) {
                                                    seVar3.T(i25);
                                                    seVar3.z(spVar.a(seVar3, i25));
                                                    seVar3.i.e.c(seVar3.h());
                                                }
                                            }
                                        }
                                    } else {
                                        i20 = k;
                                    }
                                    N2 = i19;
                                    int[] iArr32 = seVar3.ar;
                                    i21 = iArr32[0];
                                    if (i21 != 1) {
                                    }
                                    int j22 = i20 + seVar3.j();
                                    seVar3.h.i.c(j22);
                                    seVar3.h.e.c(j22 - i20);
                                    spVar.c();
                                    i22 = iArr32[1];
                                    if (i22 != 1) {
                                    }
                                    int h22 = seVar3.h() + l;
                                    seVar3.i.i.c(h22);
                                    seVar3.i.e.c(h22 - l);
                                    spVar.c();
                                    z16 = true;
                                    ArrayList arrayList32 = spVar.e;
                                    size2 = arrayList32.size();
                                    i23 = 0;
                                    while (i23 < size2) {
                                    }
                                    boolean z242 = z16;
                                    size3 = arrayList32.size();
                                    while (i24 < size3) {
                                    }
                                    z7 = true;
                                    seVar3.S(N);
                                    seVar3.T(N2);
                                    z12 = z20;
                                    i9 = 2;
                                    if (z7) {
                                    }
                                } else {
                                    mode = 1073741824;
                                }
                            }
                            z6 = z5;
                            z11 = z21;
                            sp spVar2 = seVar.a;
                            if (spVar2.b) {
                                se seVar4 = spVar2.a;
                                ArrayList arrayList5 = seVar4.aJ;
                                int size9 = arrayList5.size();
                                int i39 = 0;
                                while (i39 < size9) {
                                    ArrayList arrayList6 = arrayList5;
                                    sd sdVar3 = (sd) arrayList5.get(i39);
                                    sdVar3.s();
                                    sdVar3.e = false;
                                    int i40 = i39;
                                    sv svVar2 = sdVar3.h;
                                    svVar2.e.i = false;
                                    svVar2.g = false;
                                    svVar2.g();
                                    sw swVar2 = sdVar3.i;
                                    swVar2.e.i = false;
                                    swVar2.g = false;
                                    swVar2.g();
                                    i39 = i40 + 1;
                                    size9 = size9;
                                    arrayList5 = arrayList6;
                                    z20 = z20;
                                }
                                z12 = z20;
                                i17 = 0;
                                seVar4.s();
                                seVar4.e = false;
                                sv svVar3 = seVar4.h;
                                svVar3.e.i = false;
                                svVar3.g = false;
                                svVar3.g();
                                sw swVar3 = seVar4.i;
                                swVar3.e.i = false;
                                swVar3.g = false;
                                swVar3.g();
                                spVar2.b();
                            } else {
                                z12 = z20;
                                i17 = 0;
                            }
                            spVar2.d(spVar2.d);
                            se seVar5 = spVar2.a;
                            seVar5.aa = i17;
                            seVar5.ab = i17;
                            seVar5.h.h.c(i17);
                            seVar5.i.h.c(i17);
                            if (mode == 1073741824) {
                                z13 = seVar.Y(b, i17);
                                i9 = 1;
                            } else {
                                i9 = 0;
                                z13 = true;
                            }
                            if (mode2 == 1073741824) {
                                z7 = seVar.Y(b, 1) & z13;
                                i9++;
                            } else {
                                z7 = z13;
                            }
                            if (z7) {
                            }
                        } else {
                            z6 = z5;
                            z7 = false;
                            i9 = 0;
                        }
                        if (z7 || i9 != 2) {
                            int i41 = seVar.ay;
                            if (i7 > 0) {
                                boolean Z = seVar.Z(64);
                                te teVar6 = seVar.aH;
                                int i42 = 0;
                                for (int size10 = seVar.aJ.size(); i42 < size10; size10 = i13) {
                                    sd sdVar4 = (sd) seVar.aJ.get(i42);
                                    if ((sdVar4 instanceof sh) || (sdVar4 instanceof sa) || sdVar4.H || (Z && (svVar = sdVar4.h) != null && (swVar = sdVar4.i) != null && svVar.e.i && swVar.e.i)) {
                                        i13 = size10;
                                    } else {
                                        int N3 = sdVar4.N(0);
                                        int N4 = sdVar4.N(1);
                                        if (N3 == 3) {
                                            i13 = size10;
                                            i14 = 1;
                                            if (sdVar4.t == 1 || N4 != 3) {
                                                i16 = N4;
                                            } else if (sdVar4.u != 1) {
                                                z8 = true;
                                                i16 = 3;
                                                i15 = 3;
                                                if (!z8) {
                                                    if (seVar.Z(i14) && !(sdVar4 instanceof sk)) {
                                                        boolean z25 = i15 == 3 && sdVar4.t == 0 && i16 != 3 && !sdVar4.J();
                                                        if (i16 == 3 && sdVar4.u == 0 && i15 != 3 && !sdVar4.J()) {
                                                            z25 = true;
                                                        }
                                                        if (i15 != 3) {
                                                        }
                                                        if (sdVar4.Y > 0.0f) {
                                                            i42++;
                                                        }
                                                        if (z25) {
                                                            i42++;
                                                        }
                                                    }
                                                    bvwVar.o(teVar6, sdVar4, 0);
                                                    i42++;
                                                }
                                            } else {
                                                i16 = 3;
                                            }
                                            i15 = 3;
                                        } else {
                                            i13 = size10;
                                            i14 = 1;
                                            i15 = N3;
                                            i16 = N4;
                                        }
                                        z8 = false;
                                        if (!z8) {
                                        }
                                    }
                                    i42++;
                                }
                                ConstraintLayout constraintLayout = teVar6.a;
                                int childCount4 = constraintLayout.getChildCount();
                                for (int i43 = 0; i43 < childCount4; i43++) {
                                    View childAt = constraintLayout.getChildAt(i43);
                                    if (childAt instanceof tp) {
                                        throw null;
                                    }
                                }
                                ArrayList arrayList7 = constraintLayout.b;
                                int size11 = arrayList7.size();
                                if (size11 > 0) {
                                    for (int i44 = 0; i44 < size11; i44++) {
                                    }
                                }
                            }
                            bvwVar.n(seVar);
                            ArrayList arrayList8 = (ArrayList) bvwVar.b;
                            size = arrayList8.size();
                            if (i7 > 0) {
                                bvwVar.p(seVar, 0, j, h);
                            }
                            if (size > 0) {
                                int O = seVar.O();
                                int P = seVar.P();
                                int j3 = seVar.j();
                                sd sdVar5 = (sd) bvwVar.c;
                                int max8 = Math.max(j3, sdVar5.ad);
                                int max9 = Math.max(seVar.h(), sdVar5.ae);
                                int i45 = 0;
                                boolean z26 = false;
                                while (i45 < size) {
                                    sd sdVar6 = (sd) arrayList8.get(i45);
                                    int i46 = i45;
                                    if (sdVar6 instanceof sk) {
                                        int j4 = sdVar6.j();
                                        int h3 = sdVar6.h();
                                        teVar3 = teVar4;
                                        boolean o = z26 | bvwVar.o(teVar5, sdVar6, 1);
                                        int j5 = sdVar6.j();
                                        i12 = i41;
                                        int h4 = sdVar6.h();
                                        if (j5 != j4) {
                                            sdVar6.E(j5);
                                            if (O == 2 && sdVar6.i() > max8) {
                                                max8 = Math.max(max8, sdVar6.i() + sdVar6.M(4).b());
                                            }
                                            o = true;
                                        }
                                        if (h4 != h3) {
                                            sdVar6.z(h4);
                                            if (P == 2 && sdVar6.g() > max9) {
                                                max9 = Math.max(max9, sdVar6.g() + sdVar6.M(5).b());
                                            }
                                            o = true;
                                        }
                                        z26 = o | ((sk) sdVar6).aR;
                                    } else {
                                        i12 = i41;
                                        teVar3 = teVar4;
                                    }
                                    i45 = i46 + 1;
                                    teVar4 = teVar3;
                                    i41 = i12;
                                }
                                int i47 = i41;
                                teVar = teVar4;
                                int i48 = 2;
                                int i49 = 0;
                                while (i49 < i48) {
                                    int i50 = 0;
                                    while (i50 < size) {
                                        sd sdVar7 = (sd) arrayList8.get(i50);
                                        if (((sdVar7 instanceof si) && !(sdVar7 instanceof sk)) || (sdVar7 instanceof sh) || sdVar7.ai == 8 || ((z6 && sdVar7.h.e.i && sdVar7.i.e.i) || (sdVar7 instanceof sk))) {
                                            i11 = i50;
                                            teVar2 = teVar5;
                                            arrayList = arrayList8;
                                        } else {
                                            int j6 = sdVar7.j();
                                            int h5 = sdVar7.h();
                                            i11 = i50;
                                            int i51 = sdVar7.ac;
                                            arrayList = arrayList8;
                                            boolean o2 = z26 | bvwVar.o(teVar5, sdVar7, i49 == 1 ? 2 : 1);
                                            teVar2 = teVar5;
                                            int j7 = sdVar7.j();
                                            z26 = o2;
                                            int h6 = sdVar7.h();
                                            if (j7 != j6) {
                                                sdVar7.E(j7);
                                                if (O == 2 && sdVar7.i() > max8) {
                                                    max8 = Math.max(max8, sdVar7.i() + sdVar7.M(4).b());
                                                }
                                                z26 = true;
                                            }
                                            if (h6 != h5) {
                                                sdVar7.z(h6);
                                                if (P == 2 && sdVar7.g() > max9) {
                                                    max9 = Math.max(max9, sdVar7.g() + sdVar7.M(5).b());
                                                }
                                                z26 = true;
                                            }
                                            if (sdVar7.G && i51 != sdVar7.ac) {
                                                z26 = true;
                                            }
                                        }
                                        i50 = i11 + 1;
                                        arrayList8 = arrayList;
                                        teVar5 = teVar2;
                                    }
                                    te teVar7 = teVar5;
                                    ArrayList arrayList9 = arrayList8;
                                    if (!z26) {
                                        break;
                                    }
                                    i49++;
                                    bvwVar.p(seVar, i49, j, h);
                                    i48 = 2;
                                    arrayList8 = arrayList9;
                                    teVar5 = teVar7;
                                    z26 = false;
                                }
                                i10 = i47;
                            } else {
                                teVar = teVar4;
                                i10 = i41;
                            }
                            seVar.X(i10);
                        } else {
                            teVar = teVar4;
                        }
                        int j8 = seVar.j();
                        int h7 = seVar.h();
                        z9 = seVar.az;
                        z10 = seVar.aA;
                        te teVar8 = teVar;
                        int i52 = teVar8.e;
                        int resolveSizeAndState = resolveSizeAndState(j8 + teVar8.d, i, 0);
                        int resolveSizeAndState2 = resolveSizeAndState(h7 + i52, i2, 0) & 16777215;
                        int min3 = Math.min(this.j, resolveSizeAndState & 16777215);
                        int min4 = Math.min(this.k, resolveSizeAndState2);
                        if (z9) {
                            min3 |= 16777216;
                        }
                        if (z10) {
                            min4 |= 16777216;
                        }
                        setMeasuredDimension(min3, min4);
                    }
                    mode = 1073741824;
                }
                z4 = !b;
                z5 = z3 & z4;
                if (z5) {
                }
                if (z7) {
                }
                int i412 = seVar.ay;
                if (i7 > 0) {
                }
                bvwVar.n(seVar);
                ArrayList arrayList82 = (ArrayList) bvwVar.b;
                size = arrayList82.size();
                if (i7 > 0) {
                }
                if (size > 0) {
                }
                seVar.X(i10);
                int j82 = seVar.j();
                int h72 = seVar.h();
                z9 = seVar.az;
                z10 = seVar.aA;
                te teVar82 = teVar;
                int i522 = teVar82.e;
                int resolveSizeAndState3 = resolveSizeAndState(j82 + teVar82.d, i, 0);
                int resolveSizeAndState22 = resolveSizeAndState(h72 + i522, i2, 0) & 16777215;
                int min32 = Math.min(this.j, resolveSizeAndState3 & 16777215);
                int min42 = Math.min(this.k, resolveSizeAndState22);
                if (z9) {
                }
                if (z10) {
                }
                setMeasuredDimension(min32, min42);
            }
            max = childCount3 == 0 ? Math.max(0, this.d) : 0;
        }
        i6 = 2;
        if (i5 == seVar.j()) {
        }
        z = true;
        seVar.a.c = true;
        seVar.aa = 0;
        seVar.ab = 0;
        boolean z172 = z;
        int i342 = this.j - i3;
        int[] iArr22 = seVar.E;
        iArr22[0] = i342;
        iArr22[z172 ? 1 : 0] = this.k - i32;
        seVar.D(0);
        seVar.C(0);
        seVar.S(i4);
        seVar.E(i5);
        seVar.T(i6);
        seVar.z(max);
        seVar.D(this.i - i3);
        seVar.C(this.d - i32);
        seVar.as = max6;
        seVar.at = max2;
        bvw bvwVar2 = seVar.aI;
        te teVar52 = seVar.aH;
        int size62 = seVar.aJ.size();
        boolean b2 = sj.b(i28, 128);
        int j9 = seVar.j();
        int h8 = seVar.h();
        if (b2) {
        }
        if (z2) {
        }
        iArr = iArr22;
        z3 = z2;
        i7 = size62;
        i8 = 1073741824;
        if (mode == i8) {
        }
        if (!b2) {
        }
        z5 = z3 & z4;
        if (z5) {
        }
        if (z7) {
        }
        int i4122 = seVar.ay;
        if (i7 > 0) {
        }
        bvwVar2.n(seVar);
        ArrayList arrayList822 = (ArrayList) bvwVar2.b;
        size = arrayList822.size();
        if (i7 > 0) {
        }
        if (size > 0) {
        }
        seVar.X(i10);
        int j822 = seVar.j();
        int h722 = seVar.h();
        z9 = seVar.az;
        z10 = seVar.aA;
        te teVar822 = teVar;
        int i5222 = teVar822.e;
        int resolveSizeAndState32 = resolveSizeAndState(j822 + teVar822.d, i, 0);
        int resolveSizeAndState222 = resolveSizeAndState(h722 + i5222, i2, 0) & 16777215;
        int min322 = Math.min(this.j, resolveSizeAndState32 & 16777215);
        int min422 = Math.min(this.k, resolveSizeAndState222);
        if (z9) {
        }
        if (z10) {
        }
        setMeasuredDimension(min322, min422);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        sd bA = bA(view);
        if (z && !(bA instanceof sh)) {
            td tdVar = (td) view.getLayoutParams();
            tdVar.av = new sh();
            tdVar.ah = true;
            ((sh) tdVar.av).c(tdVar.Z);
        }
        if (view instanceof tb) {
            tb tbVar = (tb) view;
            tbVar.k();
            ((td) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(tbVar)) {
                arrayList.add(tbVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.ab(bA(view));
        this.b.remove(view);
        this.e = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new td(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new se();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new te(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new se();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new te(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new se();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new te(this, this);
        e(attributeSet, i, i2);
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.derinko.gbini.n1casino.MainActivity2;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class f1 implements Runnable {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public f1(ze zeVar, ArrayList arrayList, k30 k30Var) {
        this.f = 6;
        this.g = arrayList;
        this.h = k30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        kt ktVar;
        sf sfVar;
        t6 t6Var;
        int i;
        int[] iArr;
        int i2;
        ViewGroup viewGroup;
        RecyclerView recyclerView;
        py adapter;
        int i3 = 1;
        int i4 = 0;
        switch (this.f) {
            case 0:
                d1 d1Var = (d1) this.g;
                h1 h1Var = (h1) this.h;
                mt mtVar = h1Var.h;
                if (mtVar != null && (ktVar = mtVar.e) != null) {
                    ktVar.r(mtVar);
                }
                View view = (View) h1Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (!d1Var.b()) {
                        if (d1Var.f != null) {
                            d1Var.d(0, 0, false, false);
                        }
                    }
                    h1Var.x = d1Var;
                }
                h1Var.z = null;
                return;
            case 1:
                ((p1) this.g).a = this.h;
                return;
            case 2:
                ((Application) this.g).unregisterActivityLifecycleCallbacks((p1) this.h);
                return;
            case 3:
                Object obj = this.h;
                Object obj2 = this.g;
                try {
                    Method method = q1.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        q1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                r6 r6Var = (r6) this.h;
                t6 t6Var2 = r6Var.i;
                if (t6Var2.g == r6Var.h) {
                    ArrayList arrayList = r6Var.g;
                    sf sfVar2 = (sf) this.g;
                    t6Var2.e = arrayList;
                    t6Var2.f = Collections.unmodifiableList(arrayList);
                    k0 k0Var = t6Var2.a;
                    int[] iArr2 = sfVar2.b;
                    ArrayList arrayList2 = sfVar2.a;
                    int i5 = sfVar2.e;
                    k0 k0Var2 = sfVar2.d;
                    x7 x7Var = new x7(k0Var);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i6 = sfVar2.f;
                    int size = arrayList2.size() - 1;
                    int i7 = i6;
                    int i8 = i5;
                    while (size >= 0) {
                        rf rfVar = (rf) arrayList2.get(size);
                        int i9 = rfVar.a;
                        int i10 = rfVar.c;
                        int i11 = i3;
                        int i12 = i9 + i10;
                        int i13 = rfVar.b;
                        int i14 = i13 + i10;
                        while (i8 > i12) {
                            i8--;
                            int i15 = iArr2[i8];
                            if ((i15 & 12) != 0) {
                                t6Var = t6Var2;
                                int i16 = i15 >> 4;
                                i = i12;
                                iArr = iArr2;
                                tf a = sf.a(arrayDeque, i16, false);
                                if (a != null) {
                                    int i17 = (i5 - a.b) - 1;
                                    x7Var.g(i8, i17);
                                    if ((i15 & 4) != 0) {
                                        k0Var2.F(i8, i16);
                                        x7Var.p(i17, i11);
                                    }
                                } else {
                                    boolean z = i11;
                                    arrayDeque.add(new tf(i8, (i5 - i8) - (z ? 1 : 0), z));
                                }
                            } else {
                                t6Var = t6Var2;
                                i = i12;
                                iArr = iArr2;
                                x7Var.f(i8, i11);
                                i5--;
                            }
                            i12 = i;
                            t6Var2 = t6Var;
                            iArr2 = iArr;
                            i11 = 1;
                        }
                        t6 t6Var3 = t6Var2;
                        int[] iArr3 = iArr2;
                        while (i7 > i14) {
                            i7--;
                            int i18 = sfVar2.c[i7];
                            if ((i18 & 12) != 0) {
                                int i19 = i18 >> 4;
                                sfVar = sfVar2;
                                tf a2 = sf.a(arrayDeque, i19, true);
                                if (a2 == null) {
                                    arrayDeque.add(new tf(i7, i5 - i8, false));
                                } else {
                                    x7Var.g((i5 - a2.b) - 1, i8);
                                    if ((i18 & 4) != 0) {
                                        k0Var2.F(i19, i7);
                                        x7Var.p(i8, 1);
                                    }
                                }
                            } else {
                                sfVar = sfVar2;
                                x7Var.q(i8, 1);
                                i5++;
                            }
                            sfVar2 = sfVar;
                        }
                        sf sfVar3 = sfVar2;
                        int i20 = i13;
                        int i21 = i9;
                        for (int i22 = 0; i22 < i10; i22++) {
                            if ((iArr3[i21] & 15) == 2) {
                                k0Var2.F(i21, i20);
                                x7Var.p(i21, 1);
                            }
                            i21++;
                            i20++;
                        }
                        size--;
                        sfVar2 = sfVar3;
                        i3 = 1;
                        i7 = i13;
                        i8 = i9;
                        t6Var2 = t6Var3;
                        iArr2 = iArr3;
                    }
                    x7Var.a();
                    t6Var2.a();
                    return;
                }
                return;
            case 5:
                mr mrVar = (mr) this.g;
                Typeface typeface = (Typeface) this.h;
                jw jwVar = (jw) mrVar.f;
                if (jwVar != null) {
                    jwVar.N(typeface);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList3 = (ArrayList) this.g;
                k30 k30Var = (k30) this.h;
                if (arrayList3.contains(k30Var)) {
                    arrayList3.remove(k30Var);
                    d30.a(k30Var.c.J, k30Var.a);
                    return;
                }
                return;
            case 7:
                RecyclerView recyclerView2 = ((ep) this.h).r;
                if (recyclerView2 == null || !recyclerView2.w) {
                    return;
                }
                bp bpVar = (bp) this.g;
                if (bpVar.k || bpVar.e.b() == -1) {
                    return;
                }
                ty itemAnimator = ((ep) this.h).r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList4 = ((ep) this.h).p;
                    int size2 = arrayList4.size();
                    for (int i23 = 0; i23 < size2; i23++) {
                        if (((bp) arrayList4.get(i23)).l) {
                        }
                    }
                    or orVar = ((ep) this.h).m;
                    nz nzVar = ((bp) this.g).e;
                    orVar.getClass();
                    nzVar.getClass();
                    if (nzVar.s == null || (recyclerView = nzVar.r) == null || (adapter = recyclerView.getAdapter()) == null || (i2 = nzVar.r.G(nzVar)) == -1 || nzVar.s != adapter) {
                        i2 = -1;
                    }
                    jv jvVar = ((MainActivity2) orVar.g).H;
                    if (jvVar == null) {
                        zo.O("adapter");
                        throw null;
                    }
                    List list = jvVar.d.f;
                    list.getClass();
                    ov ovVar = (ov) ((i2 < 0 || i2 >= list.size()) ? null : list.get(i2));
                    if (ovVar == null) {
                        return;
                    }
                    if (!(ovVar instanceof nv)) {
                        jv jvVar2 = ((MainActivity2) orVar.g).H;
                        if (jvVar2 != null) {
                            jvVar2.a.c(i2, 1);
                            return;
                        } else {
                            zo.O("adapter");
                            throw null;
                        }
                    }
                    fv fvVar = ((nv) ovVar).a;
                    mr mrVar2 = ((MainActivity2) orVar.g).G;
                    if (mrVar2 == null) {
                        zo.O("repository");
                        throw null;
                    }
                    mrVar2.d(fvVar.a);
                    ((MainActivity2) orVar.g).q();
                    MainActivity2 mainActivity2 = (MainActivity2) orVar.g;
                    n1 n1Var = mainActivity2.F;
                    if (n1Var == null) {
                        zo.O("binding");
                        throw null;
                    }
                    View view2 = (CoordinatorLayout) n1Var.a;
                    String string = mainActivity2.getString(R.string.note_deleted);
                    int[] iArr4 = w20.B;
                    ViewGroup viewGroup2 = null;
                    while (true) {
                        if (view2 instanceof CoordinatorLayout) {
                            viewGroup = (ViewGroup) view2;
                        } else {
                            if (view2 instanceof FrameLayout) {
                                if (view2.getId() == 16908290) {
                                    viewGroup = (ViewGroup) view2;
                                } else {
                                    viewGroup2 = (ViewGroup) view2;
                                }
                            }
                            if (view2 != null) {
                                ViewParent parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                            if (view2 == null) {
                                viewGroup = viewGroup2;
                            }
                        }
                    }
                    if (viewGroup == null) {
                        t8.k("No suitable parent found from the given view. Please provide a valid view.");
                        return;
                    }
                    Context context = viewGroup.getContext();
                    LayoutInflater from = LayoutInflater.from(context);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w20.B);
                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                    obtainStyledAttributes.recycle();
                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
                    w20 w20Var = new w20(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                    ((SnackbarContentLayout) w20Var.i.getChildAt(0)).getMessageView().setText(string);
                    String string2 = ((MainActivity2) orVar.g).getString(R.string.undo);
                    nr nrVar = new nr((MainActivity2) orVar.g, fvVar, i4);
                    Button actionView = ((SnackbarContentLayout) w20Var.i.getChildAt(0)).getActionView();
                    int i24 = 3;
                    if (TextUtils.isEmpty(string2)) {
                        actionView.setVisibility(8);
                        actionView.setOnClickListener(null);
                        w20Var.A = false;
                    } else {
                        w20Var.A = true;
                        actionView.setVisibility(0);
                        actionView.setText(string2);
                        actionView.setOnClickListener(new nr(w20Var, nrVar, i24));
                    }
                    w20Var.i.setBackgroundTintList(ColorStateList.valueOf(((MainActivity2) orVar.g).getColor(R.color.bg_card)));
                    ((SnackbarContentLayout) w20Var.i.getChildAt(0)).getMessageView().setTextColor(((MainActivity2) orVar.g).getColor(R.color.text_primary));
                    ((SnackbarContentLayout) w20Var.i.getChildAt(0)).getActionView().setTextColor(((MainActivity2) orVar.g).getColor(R.color.color_primary));
                    we o = we.o();
                    AccessibilityManager accessibilityManager = w20Var.z;
                    int i25 = Build.VERSION.SDK_INT;
                    boolean z2 = w20Var.A;
                    int recommendedTimeoutMillis = i25 >= 29 ? accessibilityManager.getRecommendedTimeoutMillis(0, (z2 ? 4 : 0) | 3) : (z2 && accessibilityManager.isTouchExplorationEnabled()) ? -2 : 0;
                    p7 p7Var = w20Var.s;
                    synchronized (o.f) {
                        try {
                            if (o.q(p7Var)) {
                                y20 y20Var = (y20) o.h;
                                y20Var.b = recommendedTimeoutMillis;
                                ((Handler) o.g).removeCallbacksAndMessages(y20Var);
                                o.z((y20) o.h);
                                return;
                            }
                            y20 y20Var2 = (y20) o.i;
                            if (y20Var2 == null || y20Var2.a.get() != p7Var) {
                                i3 = 0;
                            }
                            if (i3 != 0) {
                                ((y20) o.i).b = recommendedTimeoutMillis;
                            } else {
                                o.i = new y20(recommendedTimeoutMillis, p7Var);
                            }
                            y20 y20Var3 = (y20) o.h;
                            if (y20Var3 == null || !o.e(y20Var3, 4)) {
                                o.h = null;
                                o.A();
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                }
                ((ep) this.h).r.post(this);
                return;
            default:
                ((wj) this.g).accept(this.h);
                return;
        }
    }

    public /* synthetic */ f1(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ f1(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public f1(ep epVar, bp bpVar, int i) {
        this.f = 7;
        this.h = epVar;
        this.g = bpVar;
    }
}

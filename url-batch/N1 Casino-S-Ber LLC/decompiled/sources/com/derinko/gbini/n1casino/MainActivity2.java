package com.derinko.gbini.n1casino;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ap;
import defpackage.bl;
import defpackage.bp;
import defpackage.c3;
import defpackage.c40;
import defpackage.d4;
import defpackage.db;
import defpackage.dp;
import defpackage.e7;
import defpackage.ep;
import defpackage.fv;
import defpackage.hb;
import defpackage.i60;
import defpackage.jv;
import defpackage.jw;
import defpackage.k0;
import defpackage.lr;
import defpackage.lv;
import defpackage.mr;
import defpackage.mv;
import defpackage.n1;
import defpackage.nv;
import defpackage.nz;
import defpackage.o8;
import defpackage.ok;
import defpackage.or;
import defpackage.qa;
import defpackage.qa0;
import defpackage.r6;
import defpackage.t6;
import defpackage.t8;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class MainActivity2 extends c3 {
    public static final /* synthetic */ int J = 0;
    public n1 F;
    public mr G;
    public jv H;
    public String I = "";

    @Override // defpackage.c3, defpackage.wb, defpackage.vb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
        int i2 = R.id.appBarLayout;
        if (((AppBarLayout) jw.r(inflate, R.id.appBarLayout)) != null) {
            i2 = R.id.emptyState;
            LinearLayout linearLayout = (LinearLayout) jw.r(inflate, R.id.emptyState);
            if (linearLayout != null) {
                i2 = R.id.fabAdd;
                FloatingActionButton floatingActionButton = (FloatingActionButton) jw.r(inflate, R.id.fabAdd);
                if (floatingActionButton != null) {
                    i2 = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) jw.r(inflate, R.id.recyclerView);
                    if (recyclerView != null) {
                        i2 = R.id.searchView;
                        SearchView searchView = (SearchView) jw.r(inflate, R.id.searchView);
                        if (searchView != null) {
                            i2 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) jw.r(inflate, R.id.toolbar);
                            if (materialToolbar != null) {
                                i2 = R.id.tvEmptyTitle;
                                if (((TextView) jw.r(inflate, R.id.tvEmptyTitle)) != null) {
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                    this.F = new n1(coordinatorLayout, linearLayout, floatingActionButton, recyclerView, searchView, materialToolbar);
                                    setContentView(coordinatorLayout);
                                    mr mrVar = new mr();
                                    SharedPreferences sharedPreferences = getSharedPreferences("win_notes_prefs", 0);
                                    sharedPreferences.getClass();
                                    mrVar.f = sharedPreferences;
                                    this.G = mrVar;
                                    n1 n1Var = this.F;
                                    if (n1Var == null) {
                                        zo.O("binding");
                                        throw null;
                                    }
                                    MaterialToolbar materialToolbar2 = (MaterialToolbar) n1Var.f;
                                    d4 d4Var = (d4) j();
                                    int i3 = 1;
                                    if (d4Var.o instanceof Activity) {
                                        d4Var.A();
                                        o8 o8Var = d4Var.s;
                                        if (o8Var instanceof qa0) {
                                            t8.t("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                                            return;
                                        }
                                        d4Var.t = null;
                                        if (o8Var != null) {
                                            o8Var.Z();
                                        }
                                        d4Var.s = null;
                                        Object obj = d4Var.o;
                                        i60 i60Var = new i60(materialToolbar2, obj instanceof Activity ? ((Activity) obj).getTitle() : d4Var.u, d4Var.r);
                                        d4Var.s = i60Var;
                                        d4Var.r.g = i60Var.u;
                                        materialToolbar2.setBackInvokedCallbackEnabled(true);
                                        d4Var.b();
                                    }
                                    this.H = new jv(new lr(this, i), new lr(this, i3));
                                    n1 n1Var2 = this.F;
                                    if (n1Var2 == null) {
                                        zo.O("binding");
                                        throw null;
                                    }
                                    RecyclerView recyclerView2 = (RecyclerView) n1Var2.d;
                                    recyclerView2.setLayoutManager(new StaggeredGridLayoutManager());
                                    jv jvVar = this.H;
                                    if (jvVar == null) {
                                        zo.O("adapter");
                                        throw null;
                                    }
                                    recyclerView2.setAdapter(jvVar);
                                    recyclerView2.setHasFixedSize(false);
                                    ep epVar = new ep(new or(this));
                                    n1 n1Var3 = this.F;
                                    if (n1Var3 == null) {
                                        zo.O("binding");
                                        throw null;
                                    }
                                    RecyclerView recyclerView3 = (RecyclerView) n1Var3.d;
                                    RecyclerView recyclerView4 = epVar.r;
                                    if (recyclerView4 != recyclerView3) {
                                        ap apVar = epVar.z;
                                        if (recyclerView4 != null) {
                                            recyclerView4.W(epVar);
                                            RecyclerView recyclerView5 = epVar.r;
                                            recyclerView5.u.remove(apVar);
                                            if (recyclerView5.v == apVar) {
                                                recyclerView5.v = null;
                                            }
                                            ArrayList arrayList = epVar.r.G;
                                            if (arrayList != null) {
                                                arrayList.remove(epVar);
                                            }
                                            ArrayList arrayList2 = epVar.p;
                                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                                bp bpVar = (bp) arrayList2.get(0);
                                                bpVar.g.cancel();
                                                nz nzVar = bpVar.e;
                                                epVar.m.getClass();
                                                or.b(nzVar);
                                            }
                                            arrayList2.clear();
                                            epVar.w = null;
                                            VelocityTracker velocityTracker = epVar.t;
                                            if (velocityTracker != null) {
                                                velocityTracker.recycle();
                                                epVar.t = null;
                                            }
                                            dp dpVar = epVar.y;
                                            if (dpVar != null) {
                                                dpVar.a = false;
                                                epVar.y = null;
                                            }
                                            if (epVar.x != null) {
                                                epVar.x = null;
                                            }
                                        }
                                        epVar.r = recyclerView3;
                                        Resources resources = recyclerView3.getResources();
                                        epVar.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                                        epVar.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                                        epVar.q = ViewConfiguration.get(epVar.r.getContext()).getScaledTouchSlop();
                                        epVar.r.g(epVar);
                                        epVar.r.u.add(apVar);
                                        RecyclerView recyclerView6 = epVar.r;
                                        if (recyclerView6.G == null) {
                                            recyclerView6.G = new ArrayList();
                                        }
                                        recyclerView6.G.add(epVar);
                                        epVar.y = new dp(epVar);
                                        epVar.x = new k0(epVar.r.getContext(), epVar.y);
                                    }
                                    n1 n1Var4 = this.F;
                                    if (n1Var4 == null) {
                                        zo.O("binding");
                                        throw null;
                                    }
                                    ((SearchView) n1Var4.e).setOnQueryTextListener(new mr(this));
                                    n1 n1Var5 = this.F;
                                    if (n1Var5 == null) {
                                        zo.O("binding");
                                        throw null;
                                    }
                                    ((FloatingActionButton) n1Var5.c).setOnClickListener(new qa(2, this));
                                    q();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final void q() {
        List list;
        boolean t0 = c40.t0(this.I);
        mr mrVar = this.G;
        if (t0) {
            if (mrVar == null) {
                zo.O("repository");
                throw null;
            }
            list = mrVar.e();
        } else {
            if (mrVar == null) {
                zo.O("repository");
                throw null;
            }
            String str = this.I;
            str.getClass();
            if (c40.t0(str)) {
                list = mrVar.e();
            } else {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                List e = mrVar.e();
                ArrayList arrayList = new ArrayList();
                for (Object obj : e) {
                    fv fvVar = (fv) obj;
                    String str2 = fvVar.b;
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = str2.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (!c40.o0(lowerCase2, lowerCase)) {
                        String lowerCase3 = fvVar.c.toLowerCase(locale);
                        lowerCase3.getClass();
                        if (c40.o0(lowerCase3, lowerCase)) {
                        }
                    }
                    arrayList.add(obj);
                }
                list = arrayList;
            }
        }
        if (this.H == null) {
            zo.O("adapter");
            throw null;
        }
        String string = getString(R.string.pinned);
        string.getClass();
        String string2 = getString(R.string.notes);
        string2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((fv) obj2).e) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (!((fv) obj3).e) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            arrayList4.add(new mv(string));
            ArrayList arrayList5 = new ArrayList(db.G0(arrayList2));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj4 = arrayList2.get(i);
                i++;
                arrayList5.add(new nv((fv) obj4));
            }
            hb.H0(arrayList4, arrayList5);
        }
        if (!arrayList3.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                arrayList4.add(new mv(string2));
            }
            ArrayList arrayList6 = new ArrayList(db.G0(arrayList3));
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj5 = arrayList3.get(i2);
                i2++;
                arrayList6.add(new nv((fv) obj5));
            }
            hb.H0(arrayList4, arrayList6);
        }
        jv jvVar = this.H;
        if (jvVar == null) {
            zo.O("adapter");
            throw null;
        }
        t6 t6Var = jvVar.d;
        k0 k0Var = t6Var.a;
        int i3 = t6Var.g + 1;
        t6Var.g = i3;
        ArrayList arrayList7 = t6Var.e;
        if (arrayList4 != arrayList7) {
            if (arrayList7 == null) {
                t6Var.e = arrayList4;
                t6Var.f = Collections.unmodifiableList(arrayList4);
                k0Var.q(0, arrayList4.size());
                t6Var.a();
            } else {
                ((Executor) t6Var.b.g).execute(new r6(t6Var, arrayList7, arrayList4, i3));
            }
        }
        n1 n1Var = this.F;
        if (n1Var == null) {
            zo.O("binding");
            throw null;
        }
        ((LinearLayout) n1Var.b).setVisibility(list.isEmpty() ? 0 : 8);
    }

    public final void r(fv fvVar) {
        lv lvVar = new lv();
        if (fvVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString("arg_note_json", fvVar.b().toString());
            lvVar.H(bundle);
        }
        lvVar.p0 = new lr(this, 2);
        lvVar.q0 = new lr(this, 3);
        bl blVar = ((ok) this.z.g).r;
        String simpleName = lv.class.getSimpleName();
        lvVar.l0 = false;
        lvVar.m0 = true;
        blVar.getClass();
        e7 e7Var = new e7(blVar);
        e7Var.o = true;
        e7Var.e(0, lvVar, simpleName, 1);
        e7Var.d(false);
    }
}

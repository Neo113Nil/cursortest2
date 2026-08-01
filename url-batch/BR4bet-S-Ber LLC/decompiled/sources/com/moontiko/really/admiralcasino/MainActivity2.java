package com.moontiko.really.admiralcasino;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.a2;
import defpackage.a80;
import defpackage.b40;
import defpackage.c2;
import defpackage.e40;
import defpackage.g9;
import defpackage.hs;
import defpackage.iu;
import defpackage.jl;
import defpackage.kb;
import defpackage.kr;
import defpackage.la0;
import defpackage.m3;
import defpackage.nu;
import defpackage.ny;
import defpackage.o1;
import defpackage.os;
import defpackage.rx;
import defpackage.ry;
import defpackage.tt;
import defpackage.ut;
import defpackage.uy;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class MainActivity2 extends m3 {
    public static final /* synthetic */ int H = 0;
    public o1 E;
    public ny F;
    public final a80 G = new a80(new a2(1, this));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, mu] */
    @Override // defpackage.m3, defpackage.wc, defpackage.vc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object obj = null;
        int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
        int i2 = R.id.appBarLayout;
        if (((AppBarLayout) la0.t(inflate, R.id.appBarLayout)) != null) {
            i2 = R.id.cgCategories;
            ChipGroup chipGroup = (ChipGroup) la0.t(inflate, R.id.cgCategories);
            if (chipGroup != null) {
                i2 = R.id.chipAll;
                if (((Chip) la0.t(inflate, R.id.chipAll)) != null) {
                    i2 = R.id.chipIdeas;
                    if (((Chip) la0.t(inflate, R.id.chipIdeas)) != null) {
                        i2 = R.id.chipOther;
                        if (((Chip) la0.t(inflate, R.id.chipOther)) != null) {
                            i2 = R.id.chipPersonal;
                            if (((Chip) la0.t(inflate, R.id.chipPersonal)) != null) {
                                i2 = R.id.chipStudy;
                                if (((Chip) la0.t(inflate, R.id.chipStudy)) != null) {
                                    i2 = R.id.chipWork;
                                    if (((Chip) la0.t(inflate, R.id.chipWork)) != null) {
                                        i2 = R.id.etSearch;
                                        TextInputEditText textInputEditText = (TextInputEditText) la0.t(inflate, R.id.etSearch);
                                        if (textInputEditText != null) {
                                            i2 = R.id.fabAdd;
                                            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) la0.t(inflate, R.id.fabAdd);
                                            if (extendedFloatingActionButton != null) {
                                                i2 = R.id.layoutEmpty;
                                                LinearLayout linearLayout = (LinearLayout) la0.t(inflate, R.id.layoutEmpty);
                                                if (linearLayout != null) {
                                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                                    i2 = R.id.rvNotes;
                                                    RecyclerView recyclerView = (RecyclerView) la0.t(inflate, R.id.rvNotes);
                                                    if (recyclerView != null) {
                                                        i2 = R.id.tilSearch;
                                                        if (((TextInputLayout) la0.t(inflate, R.id.tilSearch)) != null) {
                                                            this.E = new o1(coordinatorLayout, chipGroup, textInputEditText, extendedFloatingActionButton, linearLayout, coordinatorLayout, recyclerView);
                                                            setContentView(coordinatorLayout);
                                                            int i3 = 1;
                                                            this.F = new ny(new iu(this, i), new iu(this, i3));
                                                            o1 o1Var = this.E;
                                                            if (o1Var == null) {
                                                                kr.g0("binding");
                                                                throw null;
                                                            }
                                                            RecyclerView recyclerView2 = (RecyclerView) o1Var.f;
                                                            recyclerView2.setLayoutManager(new StaggeredGridLayoutManager());
                                                            ny nyVar = this.F;
                                                            if (nyVar == null) {
                                                                kr.g0("adapter");
                                                                throw null;
                                                            }
                                                            recyclerView2.setAdapter(nyVar);
                                                            recyclerView2.setHasFixedSize(false);
                                                            o1 o1Var2 = this.E;
                                                            if (o1Var2 == null) {
                                                                kr.g0("binding");
                                                                throw null;
                                                            }
                                                            ((RecyclerView) o1Var2.f).h(new jl(i3, this));
                                                            o1 o1Var3 = this.E;
                                                            if (o1Var3 == null) {
                                                                kr.g0("binding");
                                                                throw null;
                                                            }
                                                            ((TextInputEditText) o1Var3.b).addTextChangedListener(new nu(this));
                                                            o1 o1Var4 = this.E;
                                                            if (o1Var4 == null) {
                                                                kr.g0("binding");
                                                                throw null;
                                                            }
                                                            int i4 = 2;
                                                            ((ChipGroup) o1Var4.a).setOnCheckedStateChangeListener(new c2(i4, this));
                                                            o1 o1Var5 = this.E;
                                                            if (o1Var5 == null) {
                                                                kr.g0("binding");
                                                                throw null;
                                                            }
                                                            ((ExtendedFloatingActionButton) o1Var5.c).setOnClickListener(new kb(i4, this));
                                                            rx rxVar = r().d;
                                                            final iu iuVar = new iu(this, i4);
                                                            ?? r2 = new uy() { // from class: mu
                                                                @Override // defpackage.uy
                                                                public final /* synthetic */ void a(Object obj2) {
                                                                    iu.this.g(obj2);
                                                                }

                                                                public final boolean equals(Object obj2) {
                                                                    if ((obj2 instanceof uy) && (obj2 instanceof mu)) {
                                                                        return iu.this == iu.this;
                                                                    }
                                                                    return false;
                                                                }

                                                                public final int hashCode() {
                                                                    return iu.this.hashCode();
                                                                }
                                                            };
                                                            rxVar.getClass();
                                                            rx.a("observe");
                                                            os osVar = this.f;
                                                            if (osVar.c == hs.f) {
                                                                return;
                                                            }
                                                            tt ttVar = new tt(rxVar, this, r2);
                                                            e40 e40Var = rxVar.b;
                                                            b40 a = e40Var.a(r2);
                                                            if (a != null) {
                                                                obj = a.g;
                                                            } else {
                                                                b40 b40Var = new b40(r2, ttVar);
                                                                e40Var.i++;
                                                                b40 b40Var2 = e40Var.g;
                                                                if (b40Var2 == null) {
                                                                    e40Var.f = b40Var;
                                                                    e40Var.g = b40Var;
                                                                } else {
                                                                    b40Var2.h = b40Var;
                                                                    b40Var.i = b40Var2;
                                                                    e40Var.g = b40Var;
                                                                }
                                                            }
                                                            ut utVar = (ut) obj;
                                                            if (utVar != null && !utVar.c(this)) {
                                                                g9.i("Cannot add the same observer with different lifecycles");
                                                                return;
                                                            } else {
                                                                if (utVar != null) {
                                                                    return;
                                                                }
                                                                osVar.a(ttVar);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final ry r() {
        return (ry) this.G.a();
    }
}

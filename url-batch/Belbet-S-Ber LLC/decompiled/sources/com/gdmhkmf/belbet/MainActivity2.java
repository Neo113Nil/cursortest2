package com.gdmhkmf.belbet;

import a.k0;
import a.r;
import a0.j;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b4.d;
import c2.b;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import g.i;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import n0.h0;
import n0.p0;
import o1.c;
import o1.e;
import o1.k;
import o1.m;
import o1.n;
import p1.a;
import x2.h;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class MainActivity2 extends i {
    public static final /* synthetic */ int M = 0;
    public a F;
    public a0.a G;
    public c H;
    public boolean K;
    public Object I = q.f3887f;
    public m J = m.f2911f;
    public String L = "";

    @Override // g.i, a.m, c0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a(this);
        int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
        int i4 = R.id.chipAll;
        if (((Chip) d.v(inflate, R.id.chipAll)) != null) {
            i4 = R.id.chipGroupFilter;
            ChipGroup chipGroup = (ChipGroup) d.v(inflate, R.id.chipGroupFilter);
            if (chipGroup != null) {
                i4 = R.id.chipGroupSort;
                ChipGroup chipGroup2 = (ChipGroup) d.v(inflate, R.id.chipGroupSort);
                if (chipGroup2 != null) {
                    i4 = R.id.chipSoon;
                    if (((Chip) d.v(inflate, R.id.chipSoon)) != null) {
                        i4 = R.id.chipSortDate;
                        if (((Chip) d.v(inflate, R.id.chipSortDate)) != null) {
                            i4 = R.id.chipSortName;
                            if (((Chip) d.v(inflate, R.id.chipSortName)) != null) {
                                i4 = R.id.chipThisMonth;
                                if (((Chip) d.v(inflate, R.id.chipThisMonth)) != null) {
                                    i4 = R.id.emptyState;
                                    LinearLayout linearLayout = (LinearLayout) d.v(inflate, R.id.emptyState);
                                    if (linearLayout != null) {
                                        i4 = R.id.etSearch;
                                        TextInputEditText textInputEditText = (TextInputEditText) d.v(inflate, R.id.etSearch);
                                        if (textInputEditText != null) {
                                            i4 = R.id.fabAdd;
                                            FloatingActionButton floatingActionButton = (FloatingActionButton) d.v(inflate, R.id.fabAdd);
                                            if (floatingActionButton != null) {
                                                i4 = R.id.heroCard;
                                                LinearLayout linearLayout2 = (LinearLayout) d.v(inflate, R.id.heroCard);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.rvBirthdays;
                                                    RecyclerView recyclerView = (RecyclerView) d.v(inflate, R.id.rvBirthdays);
                                                    if (recyclerView != null) {
                                                        i4 = R.id.tilSearch;
                                                        if (((TextInputLayout) d.v(inflate, R.id.tilSearch)) != null) {
                                                            i4 = R.id.tvAppSubtitle;
                                                            if (((TextView) d.v(inflate, R.id.tvAppSubtitle)) != null) {
                                                                i4 = R.id.tvAppTitle;
                                                                if (((TextView) d.v(inflate, R.id.tvAppTitle)) != null) {
                                                                    i4 = R.id.tvEmptyMessage;
                                                                    if (((TextView) d.v(inflate, R.id.tvEmptyMessage)) != null) {
                                                                        i4 = R.id.tvEmptyTitle;
                                                                        if (((TextView) d.v(inflate, R.id.tvEmptyTitle)) != null) {
                                                                            i4 = R.id.tvHeroAge;
                                                                            TextView textView = (TextView) d.v(inflate, R.id.tvHeroAge);
                                                                            if (textView != null) {
                                                                                i4 = R.id.tvHeroCountdown;
                                                                                TextView textView2 = (TextView) d.v(inflate, R.id.tvHeroCountdown);
                                                                                if (textView2 != null) {
                                                                                    i4 = R.id.tvHeroLabel;
                                                                                    if (((TextView) d.v(inflate, R.id.tvHeroLabel)) != null) {
                                                                                        i4 = R.id.tvHeroName;
                                                                                        TextView textView3 = (TextView) d.v(inflate, R.id.tvHeroName);
                                                                                        if (textView3 != null) {
                                                                                            i4 = R.id.tvHeroZodiac;
                                                                                            TextView textView4 = (TextView) d.v(inflate, R.id.tvHeroZodiac);
                                                                                            if (textView4 != null) {
                                                                                                i4 = R.id.tvStats;
                                                                                                TextView textView5 = (TextView) d.v(inflate, R.id.tvStats);
                                                                                                if (textView5 != null) {
                                                                                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                                                                                    this.F = new a(coordinatorLayout, chipGroup, chipGroup2, linearLayout, textInputEditText, floatingActionButton, linearLayout2, recyclerView, textView, textView2, textView3, textView4, textView5);
                                                                                                    setContentView(coordinatorLayout);
                                                                                                    a aVar = this.F;
                                                                                                    if (aVar == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    CoordinatorLayout coordinatorLayout2 = aVar.f3055a;
                                                                                                    k0 k0Var = new k0(9);
                                                                                                    WeakHashMap weakHashMap = p0.f2816a;
                                                                                                    h0.c(coordinatorLayout2, k0Var);
                                                                                                    this.G = new a0.a(this);
                                                                                                    this.H = new c(new k(this, 2), new k(this, 3));
                                                                                                    a aVar2 = this.F;
                                                                                                    if (aVar2 == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    int i5 = 1;
                                                                                                    aVar2.h.setLayoutManager(new LinearLayoutManager(1));
                                                                                                    a aVar3 = this.F;
                                                                                                    if (aVar3 == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    RecyclerView recyclerView2 = aVar3.h;
                                                                                                    c cVar = this.H;
                                                                                                    if (cVar == null) {
                                                                                                        i3.d.h("adapter");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    recyclerView2.setAdapter(cVar);
                                                                                                    a aVar4 = this.F;
                                                                                                    if (aVar4 == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    aVar4.f3059f.setOnClickListener(new e(1, this));
                                                                                                    a aVar5 = this.F;
                                                                                                    if (aVar5 == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    aVar5.f3058e.addTextChangedListener(new n(this));
                                                                                                    a aVar6 = this.F;
                                                                                                    if (aVar6 == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    aVar6.f3056b.setOnCheckedStateChangeListener(new k(this, i));
                                                                                                    a aVar7 = this.F;
                                                                                                    if (aVar7 == null) {
                                                                                                        i3.d.h("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    aVar7.f3057c.setOnCheckedStateChangeListener(new k(this, i5));
                                                                                                    r();
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // g.i, android.app.Activity
    public final void onResume() {
        super.onResume();
        s();
    }

    public final void r() {
        a0.a aVar = this.G;
        if (aVar == null) {
            i3.d.h("repository");
            throw null;
        }
        this.I = aVar.F();
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r10 <= 30) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r8.f2900c.getMonth() == r2.getMonth()) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0013 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        Object next;
        long c5;
        long c6;
        String string;
        String string2;
        int i;
        int i4;
        boolean z4;
        int ordinal;
        long c7;
        ?? r12 = this.I;
        ZoneId zoneId = o1.d.f2892a;
        LocalDate e4 = o1.d.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = r12.iterator();
        while (true) {
            boolean z5 = false;
            if (!it.hasNext()) {
                List F = this.K ? h.F(arrayList, new j(4)) : h.F(arrayList, new j(5));
                c cVar = this.H;
                if (cVar == null) {
                    i3.d.h("adapter");
                    throw null;
                }
                g1.e eVar = cVar.d;
                a0.a aVar = eVar.f1634a;
                int i5 = eVar.f1639g + 1;
                eVar.f1639g = i5;
                List list = eVar.f1637e;
                if (F != list) {
                    if (list == null) {
                        eVar.f1637e = F;
                        eVar.f1638f = Collections.unmodifiableList(F);
                        aVar.u(0, F.size());
                        eVar.a();
                    } else {
                        ((Executor) eVar.f1635b.f79g).execute(new g1.c(eVar, list, F, i5));
                    }
                }
                Iterator it2 = this.I.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        ZoneId zoneId2 = o1.d.f2892a;
                        c5 = o1.d.c(((o1.h) next).f2900c, o1.d.e());
                        do {
                            Object next2 = it2.next();
                            ZoneId zoneId3 = o1.d.f2892a;
                            c6 = o1.d.c(((o1.h) next2).f2900c, o1.d.e());
                            if (c5 > c6) {
                                next = next2;
                                c5 = c6;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                o1.h hVar = (o1.h) next;
                if (hVar == null) {
                    a aVar2 = this.F;
                    if (aVar2 == null) {
                        i3.d.h("binding");
                        throw null;
                    }
                    aVar2.f3060g.setVisibility(8);
                    i = 0;
                } else {
                    LocalDate localDate = hVar.f2900c;
                    String str = hVar.f2899b;
                    a aVar3 = this.F;
                    if (aVar3 == null) {
                        i3.d.h("binding");
                        throw null;
                    }
                    aVar3.f3060g.setVisibility(0);
                    a aVar4 = this.F;
                    if (aVar4 == null) {
                        i3.d.h("binding");
                        throw null;
                    }
                    aVar4.f3062k.setText(str);
                    a aVar5 = this.F;
                    if (aVar5 == null) {
                        i3.d.h("binding");
                        throw null;
                    }
                    TextView textView = aVar5.f3061j;
                    ZoneId zoneId4 = o1.d.f2892a;
                    LocalDate e5 = o1.d.e();
                    i3.d.e(localDate, "birthDate");
                    long c8 = o1.d.c(localDate, e5);
                    if (c8 == 0) {
                        string2 = getString(R.string.days_today);
                        i3.d.d(string2, "getString(...)");
                    } else if (c8 == 1) {
                        string2 = getString(R.string.days_tomorrow);
                        i3.d.d(string2, "getString(...)");
                    } else {
                        Integer valueOf = Integer.valueOf((int) c8);
                        int i6 = (int) (c8 % 100);
                        int i7 = (int) (c8 % 10);
                        if (11 <= i6 && i6 < 15) {
                            string = getString(R.string.day_many);
                            i3.d.d(string, "getString(...)");
                        } else if (i7 == 1) {
                            string = getString(R.string.day_one);
                            i3.d.d(string, "getString(...)");
                        } else if (2 > i7 || i7 >= 5) {
                            string = getString(R.string.day_many);
                            i3.d.d(string, "getString(...)");
                        } else {
                            string = getString(R.string.day_few);
                            i3.d.d(string, "getString(...)");
                        }
                        string2 = getString(R.string.days_until_format, valueOf, string);
                        i3.d.d(string2, "getString(...)");
                    }
                    textView.setText(string2);
                    a aVar6 = this.F;
                    if (aVar6 == null) {
                        i3.d.h("binding");
                        throw null;
                    }
                    aVar6.i.setText(o1.d.a(this, localDate));
                    int f5 = o1.d.f(localDate, o1.d.e());
                    String string3 = getString(o1.d.h(localDate));
                    i3.d.d(string3, "getString(...)");
                    String i8 = o1.d.i(localDate);
                    a aVar7 = this.F;
                    if (aVar7 == null) {
                        i3.d.h("binding");
                        throw null;
                    }
                    aVar7.f3063l.setText(getString(R.string.zodiac_display, getString(R.string.zodiac_label), i8, string3));
                    int f6 = o1.d.f(localDate, o1.d.e());
                    if (f6 % 10 == 0 || f6 % 5 == 0) {
                        String str2 = "milestone_" + hVar.f2898a + "_" + f5;
                        i = 0;
                        SharedPreferences sharedPreferences = getSharedPreferences("win_milestone_prefs", 0);
                        if (!sharedPreferences.getBoolean(str2, false)) {
                            b bVar = new b(this);
                            g.b bVar2 = (g.b) bVar.f168b;
                            bVar2.d = bVar2.f1470a.getText(R.string.milestone_title);
                            bVar2.f1474f = getString(R.string.milestone_message, str, Integer.valueOf(f5), o1.d.g(this, f5));
                            bVar2.f1475g = bVar2.f1470a.getText(R.string.action_save);
                            bVar2.h = null;
                            bVar.b().show();
                            sharedPreferences.edit().putBoolean(str2, true).apply();
                        }
                    } else {
                        i = 0;
                    }
                }
                ?? r22 = this.I;
                ZoneId zoneId5 = o1.d.f2892a;
                LocalDate e6 = o1.d.e();
                if (r22 == 0 || !r22.isEmpty()) {
                    Iterator it3 = r22.iterator();
                    i4 = i;
                    while (it3.hasNext()) {
                        if (((o1.h) it3.next()).f2900c.getMonth() == e6.getMonth() && (i4 = i4 + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                } else {
                    i4 = i;
                }
                a aVar8 = this.F;
                if (aVar8 == null) {
                    i3.d.h("binding");
                    throw null;
                }
                aVar8.f3064m.setText(getString(R.string.stats_combined, Integer.valueOf(r22.size()), Integer.valueOf(i4)));
                boolean isEmpty = F.isEmpty();
                a aVar9 = this.F;
                if (aVar9 == null) {
                    i3.d.h("binding");
                    throw null;
                }
                aVar9.d.setVisibility(isEmpty ? i : 8);
                a aVar10 = this.F;
                if (aVar10 != null) {
                    aVar10.h.setVisibility(isEmpty ? 8 : i);
                    return;
                } else {
                    i3.d.h("binding");
                    throw null;
                }
            }
            Object next3 = it.next();
            o1.h hVar2 = (o1.h) next3;
            if (this.L.length() != 0) {
                String str3 = hVar2.f2899b;
                Locale locale = Locale.getDefault();
                i3.d.d(locale, "getDefault(...)");
                String lowerCase = str3.toLowerCase(locale);
                i3.d.d(lowerCase, "toLowerCase(...)");
                if (!p3.d.s0(lowerCase, this.L)) {
                    z4 = false;
                    ordinal = this.J.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new t();
                            }
                            ZoneId zoneId6 = o1.d.f2892a;
                            c7 = o1.d.c(hVar2.f2900c, o1.d.e());
                        }
                        if (!z4 && z5) {
                            arrayList.add(next3);
                        }
                    }
                    z5 = true;
                    if (!z4) {
                        arrayList.add(next3);
                    }
                }
            }
            z4 = true;
            ordinal = this.J.ordinal();
            if (ordinal != 0) {
            }
            z5 = true;
            if (!z4) {
            }
        }
    }
}

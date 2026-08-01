package com.awerser.monnit.betplay;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.as;
import defpackage.en;
import defpackage.in;
import defpackage.j1;
import defpackage.j8;
import defpackage.kp;
import defpackage.lp;
import defpackage.m2;
import defpackage.m9;
import defpackage.op;
import defpackage.r1;
import defpackage.r3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class MainActivity2 extends r3 {
    public static final /* synthetic */ int J = 0;
    public r1 F;
    public j1 G;
    public in H;
    public final ArrayList I = new ArrayList();

    @Override // androidx.fragment.app.k, defpackage.ac, defpackage.zb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
        int i = R.id.fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) j8.m(inflate, R.id.fab);
        if (floatingActionButton != null) {
            i = R.id.layoutEmpty;
            LinearLayout linearLayout = (LinearLayout) j8.m(inflate, R.id.layoutEmpty);
            if (linearLayout != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) j8.m(inflate, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.rvHabits;
                    RecyclerView recyclerView = (RecyclerView) j8.m(inflate, R.id.rvHabits);
                    if (recyclerView != null) {
                        i = R.id.tvDate;
                        TextView textView = (TextView) j8.m(inflate, R.id.tvDate);
                        if (textView != null) {
                            i = R.id.tvGreeting;
                            TextView textView2 = (TextView) j8.m(inflate, R.id.tvGreeting);
                            if (textView2 != null) {
                                i = R.id.tvPercentage;
                                TextView textView3 = (TextView) j8.m(inflate, R.id.tvPercentage);
                                if (textView3 != null) {
                                    i = R.id.tvProgress;
                                    TextView textView4 = (TextView) j8.m(inflate, R.id.tvProgress);
                                    if (textView4 != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                        this.F = new r1(coordinatorLayout, floatingActionButton, linearLayout, progressBar, recyclerView, textView, textView2, textView3, textView4);
                                        setContentView(coordinatorLayout);
                                        j1 j1Var = new j1(this);
                                        this.G = j1Var;
                                        String string = ((SharedPreferences) j1Var.g).getString("habits", "[]");
                                        JSONArray jSONArray = new JSONArray(string != null ? string : "[]");
                                        lp W = op.W(0, jSONArray.length());
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = W.iterator();
                                        while (true) {
                                            kp kpVar = (kp) it;
                                            boolean z = kpVar.h;
                                            if (!z) {
                                                ArrayList arrayList2 = this.I;
                                                arrayList2.addAll(arrayList);
                                                int i2 = Calendar.getInstance().get(11);
                                                r1 r1Var = this.F;
                                                if (r1Var == null) {
                                                    op.T("binding");
                                                    throw null;
                                                }
                                                r1Var.f.setText(getString(i2 < 12 ? R.string.greeting_morning : i2 < 17 ? R.string.greeting_afternoon : R.string.greeting_evening));
                                                r1 r1Var2 = this.F;
                                                if (r1Var2 == null) {
                                                    op.T("binding");
                                                    throw null;
                                                }
                                                r1Var2.e.setText(new SimpleDateFormat("EEEE, MMMM d", Locale.ENGLISH).format(new Date()));
                                                this.H = new in(arrayList2, new as(this, "toggleHabit", "toggleHabit(I)V", 0), new as(this, "confirmDelete", "confirmDelete(I)V", 1));
                                                r1 r1Var3 = this.F;
                                                if (r1Var3 == null) {
                                                    op.T("binding");
                                                    throw null;
                                                }
                                                RecyclerView recyclerView2 = r1Var3.d;
                                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                                in inVar = this.H;
                                                if (inVar == null) {
                                                    op.T("adapter");
                                                    throw null;
                                                }
                                                recyclerView2.setAdapter(inVar);
                                                recyclerView2.setItemAnimator(null);
                                                r1 r1Var4 = this.F;
                                                if (r1Var4 == null) {
                                                    op.T("binding");
                                                    throw null;
                                                }
                                                r1Var4.a.setOnClickListener(new m2(3, this));
                                                r();
                                                return;
                                            }
                                            int i3 = kpVar.i;
                                            if (i3 != kpVar.g) {
                                                kpVar.i = kpVar.f + i3;
                                            } else {
                                                if (!z) {
                                                    throw new NoSuchElementException();
                                                }
                                                kpVar.h = false;
                                            }
                                            JSONObject jSONObject = jSONArray.getJSONObject(i3);
                                            String string2 = jSONObject.getString("id");
                                            string2.getClass();
                                            String string3 = jSONObject.getString("name");
                                            string3.getClass();
                                            String string4 = jSONObject.getString("category");
                                            string4.getClass();
                                            m9 valueOf = m9.valueOf(string4);
                                            int i4 = jSONObject.getInt("streak");
                                            String string5 = jSONObject.getString("lastCompletedDate");
                                            string5.getClass();
                                            arrayList.add(new en(string2, string3, valueOf, i4, string5, jSONObject.getLong("createdAt")));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void r() {
        s();
        boolean isEmpty = this.I.isEmpty();
        r1 r1Var = this.F;
        if (r1Var == null) {
            op.T("binding");
            throw null;
        }
        r1Var.b.setVisibility(isEmpty ? 0 : 8);
        r1 r1Var2 = this.F;
        if (r1Var2 != null) {
            r1Var2.d.setVisibility(isEmpty ? 8 : 0);
        } else {
            op.T("binding");
            throw null;
        }
    }

    public final void s() {
        int i;
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int size2 = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((en) obj).isCompletedToday() && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        int i3 = size > 0 ? (i * 100) / size : 0;
        r1 r1Var = this.F;
        if (r1Var == null) {
            op.T("binding");
            throw null;
        }
        r1Var.h.setText(getString(R.string.progress_format, Integer.valueOf(i), Integer.valueOf(size)));
        r1 r1Var2 = this.F;
        if (r1Var2 == null) {
            op.T("binding");
            throw null;
        }
        r1Var2.g.setText(getString(R.string.percentage_format, Integer.valueOf(i3)));
        r1 r1Var3 = this.F;
        if (r1Var3 == null) {
            op.T("binding");
            throw null;
        }
        ProgressBar progressBar = r1Var3.c;
        if (size <= 0) {
            size = 1;
        }
        progressBar.setMax(size);
        r1 r1Var4 = this.F;
        if (r1Var4 != null) {
            r1Var4.c.setProgress(i);
        } else {
            op.T("binding");
            throw null;
        }
    }
}

package com.playbag.tripgear;

import P0.c;
import P0.d;
import P0.g;
import P0.h;
import P0.m;
import P0.n;
import P0.r;
import Q0.a;
import R0.b;
import R0.e;
import S0.i;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.ChecklistActivity;
import com.playbag.tripgear.SummaryActivity;
import g.AbstractActivityC0106i;
import g0.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k1.l;

/* loaded from: classes.dex */
public final class ChecklistActivity extends AbstractActivityC0106i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1988D = 0;

    /* renamed from: A, reason: collision with root package name */
    public r f1989A;

    /* renamed from: B, reason: collision with root package name */
    public g f1990B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f1991C;

    /* renamed from: y, reason: collision with root package name */
    public final e f1992y = new e(new d(this, 0));

    /* renamed from: z, reason: collision with root package name */
    public C.g f1993z;

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 1;
        final int i2 = 0;
        super.onCreate(bundle);
        setContentView(u().f748a);
        this.f1993z = new C.g((AbstractActivityC0106i) this);
        String stringExtra = getIntent().getStringExtra("extra_trip");
        if (stringExtra == null) {
            stringExtra = "SEA";
        }
        this.f1989A = r.valueOf(stringExtra);
        TextView textView = u().f754j;
        List list = m.f705a;
        r rVar = this.f1989A;
        if (rVar == null) {
            d1.d.h("trip");
            throw null;
        }
        textView.setText(m.b(rVar));
        u().f750c.setOnClickListener(new View.OnClickListener(this) { // from class: P0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistActivity f681b;

            {
                this.f681b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 0;
                ChecklistActivity checklistActivity = this.f681b;
                switch (i2) {
                    case 0:
                        int i4 = ChecklistActivity.f1988D;
                        checklistActivity.finish();
                        return;
                    case 1:
                        C.g gVar = checklistActivity.f1993z;
                        if (gVar == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar2 = checklistActivity.f1989A;
                        if (rVar2 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        SharedPreferences.Editor edit = ((SharedPreferences) gVar.f115b).edit();
                        Iterator it = gVar.y(rVar2).iterator();
                        while (it.hasNext()) {
                            edit.remove(C.g.D(rVar2, (String) it.next()));
                        }
                        edit.apply();
                        ArrayList arrayList = checklistActivity.f1991C;
                        if (arrayList == null) {
                            d1.d.h("rows");
                            throw null;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((h) it2.next()).f694b = false;
                        }
                        g gVar2 = checklistActivity.f1990B;
                        if (gVar2 == null) {
                            d1.d.h("adapter");
                            throw null;
                        }
                        gVar2.f2262a.b();
                        checklistActivity.v();
                        return;
                    case 2:
                        C.g gVar3 = checklistActivity.f1993z;
                        if (gVar3 == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar3 = checklistActivity.f1989A;
                        if (rVar3 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        int size = gVar3.y(rVar3).size();
                        if (size > 0) {
                            ArrayList y2 = gVar3.y(rVar3);
                            if (!y2.isEmpty()) {
                                Iterator it3 = y2.iterator();
                                while (it3.hasNext()) {
                                    if (gVar3.B(rVar3, (String) it3.next()) && (i3 = i3 + 1) < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                            }
                            if (i3 >= size) {
                                Intent intent = new Intent(checklistActivity, (Class<?>) SummaryActivity.class);
                                r rVar4 = checklistActivity.f1989A;
                                if (rVar4 == null) {
                                    d1.d.h("trip");
                                    throw null;
                                }
                                intent.putExtra("extra_trip", rVar4.name());
                                checklistActivity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i5 = ChecklistActivity.f1988D;
                        checklistActivity.t();
                        return;
                }
            }
        });
        u().f751e.setOnClickListener(new View.OnClickListener(this) { // from class: P0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistActivity f681b;

            {
                this.f681b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 0;
                ChecklistActivity checklistActivity = this.f681b;
                switch (i) {
                    case 0:
                        int i4 = ChecklistActivity.f1988D;
                        checklistActivity.finish();
                        return;
                    case 1:
                        C.g gVar = checklistActivity.f1993z;
                        if (gVar == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar2 = checklistActivity.f1989A;
                        if (rVar2 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        SharedPreferences.Editor edit = ((SharedPreferences) gVar.f115b).edit();
                        Iterator it = gVar.y(rVar2).iterator();
                        while (it.hasNext()) {
                            edit.remove(C.g.D(rVar2, (String) it.next()));
                        }
                        edit.apply();
                        ArrayList arrayList = checklistActivity.f1991C;
                        if (arrayList == null) {
                            d1.d.h("rows");
                            throw null;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((h) it2.next()).f694b = false;
                        }
                        g gVar2 = checklistActivity.f1990B;
                        if (gVar2 == null) {
                            d1.d.h("adapter");
                            throw null;
                        }
                        gVar2.f2262a.b();
                        checklistActivity.v();
                        return;
                    case 2:
                        C.g gVar3 = checklistActivity.f1993z;
                        if (gVar3 == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar3 = checklistActivity.f1989A;
                        if (rVar3 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        int size = gVar3.y(rVar3).size();
                        if (size > 0) {
                            ArrayList y2 = gVar3.y(rVar3);
                            if (!y2.isEmpty()) {
                                Iterator it3 = y2.iterator();
                                while (it3.hasNext()) {
                                    if (gVar3.B(rVar3, (String) it3.next()) && (i3 = i3 + 1) < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                            }
                            if (i3 >= size) {
                                Intent intent = new Intent(checklistActivity, (Class<?>) SummaryActivity.class);
                                r rVar4 = checklistActivity.f1989A;
                                if (rVar4 == null) {
                                    d1.d.h("trip");
                                    throw null;
                                }
                                intent.putExtra("extra_trip", rVar4.name());
                                checklistActivity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i5 = ChecklistActivity.f1988D;
                        checklistActivity.t();
                        return;
                }
            }
        });
        final int i3 = 2;
        u().d.setOnClickListener(new View.OnClickListener(this) { // from class: P0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistActivity f681b;

            {
                this.f681b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = 0;
                ChecklistActivity checklistActivity = this.f681b;
                switch (i3) {
                    case 0:
                        int i4 = ChecklistActivity.f1988D;
                        checklistActivity.finish();
                        return;
                    case 1:
                        C.g gVar = checklistActivity.f1993z;
                        if (gVar == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar2 = checklistActivity.f1989A;
                        if (rVar2 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        SharedPreferences.Editor edit = ((SharedPreferences) gVar.f115b).edit();
                        Iterator it = gVar.y(rVar2).iterator();
                        while (it.hasNext()) {
                            edit.remove(C.g.D(rVar2, (String) it.next()));
                        }
                        edit.apply();
                        ArrayList arrayList = checklistActivity.f1991C;
                        if (arrayList == null) {
                            d1.d.h("rows");
                            throw null;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((h) it2.next()).f694b = false;
                        }
                        g gVar2 = checklistActivity.f1990B;
                        if (gVar2 == null) {
                            d1.d.h("adapter");
                            throw null;
                        }
                        gVar2.f2262a.b();
                        checklistActivity.v();
                        return;
                    case 2:
                        C.g gVar3 = checklistActivity.f1993z;
                        if (gVar3 == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar3 = checklistActivity.f1989A;
                        if (rVar3 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        int size = gVar3.y(rVar3).size();
                        if (size > 0) {
                            ArrayList y2 = gVar3.y(rVar3);
                            if (!y2.isEmpty()) {
                                Iterator it3 = y2.iterator();
                                while (it3.hasNext()) {
                                    if (gVar3.B(rVar3, (String) it3.next()) && (i32 = i32 + 1) < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                            }
                            if (i32 >= size) {
                                Intent intent = new Intent(checklistActivity, (Class<?>) SummaryActivity.class);
                                r rVar4 = checklistActivity.f1989A;
                                if (rVar4 == null) {
                                    d1.d.h("trip");
                                    throw null;
                                }
                                intent.putExtra("extra_trip", rVar4.name());
                                checklistActivity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i5 = ChecklistActivity.f1988D;
                        checklistActivity.t();
                        return;
                }
            }
        });
        final int i4 = 3;
        u().f749b.setOnClickListener(new View.OnClickListener(this) { // from class: P0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistActivity f681b;

            {
                this.f681b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = 0;
                ChecklistActivity checklistActivity = this.f681b;
                switch (i4) {
                    case 0:
                        int i42 = ChecklistActivity.f1988D;
                        checklistActivity.finish();
                        return;
                    case 1:
                        C.g gVar = checklistActivity.f1993z;
                        if (gVar == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar2 = checklistActivity.f1989A;
                        if (rVar2 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        SharedPreferences.Editor edit = ((SharedPreferences) gVar.f115b).edit();
                        Iterator it = gVar.y(rVar2).iterator();
                        while (it.hasNext()) {
                            edit.remove(C.g.D(rVar2, (String) it.next()));
                        }
                        edit.apply();
                        ArrayList arrayList = checklistActivity.f1991C;
                        if (arrayList == null) {
                            d1.d.h("rows");
                            throw null;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((h) it2.next()).f694b = false;
                        }
                        g gVar2 = checklistActivity.f1990B;
                        if (gVar2 == null) {
                            d1.d.h("adapter");
                            throw null;
                        }
                        gVar2.f2262a.b();
                        checklistActivity.v();
                        return;
                    case 2:
                        C.g gVar3 = checklistActivity.f1993z;
                        if (gVar3 == null) {
                            d1.d.h("repository");
                            throw null;
                        }
                        r rVar3 = checklistActivity.f1989A;
                        if (rVar3 == null) {
                            d1.d.h("trip");
                            throw null;
                        }
                        int size = gVar3.y(rVar3).size();
                        if (size > 0) {
                            ArrayList y2 = gVar3.y(rVar3);
                            if (!y2.isEmpty()) {
                                Iterator it3 = y2.iterator();
                                while (it3.hasNext()) {
                                    if (gVar3.B(rVar3, (String) it3.next()) && (i32 = i32 + 1) < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                            }
                            if (i32 >= size) {
                                Intent intent = new Intent(checklistActivity, (Class<?>) SummaryActivity.class);
                                r rVar4 = checklistActivity.f1989A;
                                if (rVar4 == null) {
                                    d1.d.h("trip");
                                    throw null;
                                }
                                intent.putExtra("extra_trip", rVar4.name());
                                checklistActivity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i5 = ChecklistActivity.f1988D;
                        checklistActivity.t();
                        return;
                }
            }
        });
        u().f752f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: P0.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                int i6 = ChecklistActivity.f1988D;
                if (i5 != 6) {
                    return false;
                }
                ChecklistActivity.this.t();
                return true;
            }
        });
        r rVar2 = this.f1989A;
        if (rVar2 == null) {
            d1.d.h("trip");
            throw null;
        }
        List<String> a2 = m.a(rVar2);
        ArrayList arrayList = new ArrayList(i.z0(a2));
        for (String str : a2) {
            C.g gVar = this.f1993z;
            if (gVar == null) {
                d1.d.h("repository");
                throw null;
            }
            r rVar3 = this.f1989A;
            if (rVar3 == null) {
                d1.d.h("trip");
                throw null;
            }
            arrayList.add(new h(str, gVar.B(rVar3, str), false));
        }
        C.g gVar2 = this.f1993z;
        if (gVar2 == null) {
            d1.d.h("repository");
            throw null;
        }
        r rVar4 = this.f1989A;
        if (rVar4 == null) {
            d1.d.h("trip");
            throw null;
        }
        List<String> z2 = gVar2.z(rVar4);
        ArrayList arrayList2 = new ArrayList(i.z0(z2));
        for (String str2 : z2) {
            C.g gVar3 = this.f1993z;
            if (gVar3 == null) {
                d1.d.h("repository");
                throw null;
            }
            r rVar5 = this.f1989A;
            if (rVar5 == null) {
                d1.d.h("trip");
                throw null;
            }
            arrayList2.add(new h(str2, gVar3.B(rVar5, str2), true));
        }
        ArrayList arrayList3 = new ArrayList(S0.g.C0(arrayList, arrayList2));
        this.f1991C = arrayList3;
        this.f1990B = new g(arrayList3, new c(this, 0), new c(this, 1));
        u().h.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView = u().h;
        g gVar4 = this.f1990B;
        if (gVar4 == null) {
            d1.d.h("adapter");
            throw null;
        }
        recyclerView.setAdapter(gVar4);
        v();
    }

    public final void t() {
        String str;
        n nVar;
        Editable text = u().f752f.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        C.g gVar = this.f1993z;
        if (gVar == null) {
            d1.d.h("repository");
            throw null;
        }
        r rVar = this.f1989A;
        if (rVar == null) {
            d1.d.h("trip");
            throw null;
        }
        String obj = k1.d.O(str).toString();
        if (obj.length() == 0) {
            nVar = n.f709b;
        } else {
            ArrayList y2 = gVar.y(rVar);
            if (!y2.isEmpty()) {
                Iterator it = y2.iterator();
                while (it.hasNext()) {
                    if (l.u((String) it.next(), obj)) {
                        nVar = n.f710c;
                        break;
                    }
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(gVar.z(rVar));
            linkedHashSet.add(obj);
            ((SharedPreferences) gVar.f115b).edit().putStringSet(C.g.v(rVar), linkedHashSet).apply();
            nVar = n.f708a;
        }
        int ordinal = nVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Toast.makeText(this, R.string.add_item_empty, 0).show();
                return;
            } else {
                if (ordinal != 2) {
                    throw new b();
                }
                Toast.makeText(this, R.string.add_item_duplicate, 0).show();
                return;
            }
        }
        Editable text2 = u().f752f.getText();
        if (text2 != null) {
            text2.clear();
        }
        h hVar = new h(k1.d.O(str).toString(), false, true);
        ArrayList arrayList = this.f1991C;
        if (arrayList == null) {
            d1.d.h("rows");
            throw null;
        }
        arrayList.add(hVar);
        g gVar2 = this.f1990B;
        if (gVar2 == null) {
            d1.d.h("adapter");
            throw null;
        }
        ArrayList arrayList2 = this.f1991C;
        if (arrayList2 == null) {
            d1.d.h("rows");
            throw null;
        }
        gVar2.f2262a.d(S0.h.x0(arrayList2));
        RecyclerView recyclerView = u().h;
        ArrayList arrayList3 = this.f1991C;
        if (arrayList3 == null) {
            d1.d.h("rows");
            throw null;
        }
        int x02 = S0.h.x0(arrayList3);
        if (!recyclerView.f1599x) {
            L l2 = recyclerView.f1580n;
            if (l2 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                l2.z0(recyclerView, x02);
            }
        }
        v();
    }

    public final a u() {
        return (a) this.f1992y.a();
    }

    public final void v() {
        int i;
        g gVar = this.f1990B;
        if (gVar == null) {
            d1.d.h("adapter");
            throw null;
        }
        ArrayList arrayList = gVar.d;
        boolean z2 = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((h) it.next()).f694b && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        } else {
            i = 0;
        }
        ArrayList arrayList2 = this.f1991C;
        if (arrayList2 == null) {
            d1.d.h("rows");
            throw null;
        }
        int size = arrayList2.size();
        u().i.setText(getString(R.string.packed_progress, Integer.valueOf(i), Integer.valueOf(size)));
        u().f753g.setMax(size < 1 ? 1 : size);
        u().f753g.setProgress(i);
        TextView textView = u().d;
        if (i >= size && size > 0) {
            z2 = true;
        }
        textView.setEnabled(z2);
        u().d.setAlpha(u().d.isEnabled() ? 1.0f : 0.45f);
    }
}

package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
class m extends s2 {
    private final n e;
    private final o f;
    private final i8 g;
    private final String h;
    private final List i;
    private final List j;
    private final List k;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends z3 {
        private final i8 p;

        b(i8 i8Var, String str, boolean z) {
            super(i8Var.b().d(), m.this.a);
            this.p = i8Var;
            this.c = StringUtils.createSpannedString(i8Var.b().a(), -16777216, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.b = z;
        }

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.b;
        }

        public i8 v() {
            return this.p;
        }
    }

    m(n nVar, o oVar, i8 i8Var, Context context) {
        super(context);
        this.e = nVar;
        this.g = i8Var;
        this.f = oVar != null ? oVar : nVar.f();
        this.h = oVar != null ? oVar.c() : nVar.d();
        this.i = h();
        this.j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private List l() {
        i8 i8Var = this.g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> e = this.f.e();
        ArrayList arrayList = new ArrayList(e.size());
        for (i8 i8Var2 : e) {
            i8 i8Var3 = this.g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.g == null));
                for (a4 a4Var : i8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i) {
        return i == a.INFO.ordinal() ? this.i : i == a.BIDDERS.ordinal() ? this.j : this.k;
    }

    @Override // com.applovin.impl.s2
    protected int d(int i) {
        return i == a.INFO.ordinal() ? this.i.size() : i == a.BIDDERS.ordinal() ? this.j.size() : this.k.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i) {
        return i == a.INFO.ordinal() ? new v4("INFO") : i == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    public o j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.e.b()).a();
    }

    private List e() {
        i8 i8Var = this.g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> a2 = this.f.a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (i8 i8Var2 : a2) {
            i8 i8Var3 = this.g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.g == null));
            }
        }
        return arrayList;
    }
}

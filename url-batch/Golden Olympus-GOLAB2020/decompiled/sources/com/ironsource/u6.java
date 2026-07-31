package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class u6 {

    /* renamed from: p, reason: collision with root package name */
    private static final int f19883p = 0;

    /* renamed from: a, reason: collision with root package name */
    private C1477h4 f19884a;

    /* renamed from: b, reason: collision with root package name */
    private int f19885b;

    /* renamed from: c, reason: collision with root package name */
    private long f19886c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19887d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<h7> f19888e;

    /* renamed from: f, reason: collision with root package name */
    private h7 f19889f;

    /* renamed from: g, reason: collision with root package name */
    private int f19890g;

    /* renamed from: h, reason: collision with root package name */
    private int f19891h;

    /* renamed from: i, reason: collision with root package name */
    private C1529o5 f19892i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19893j;

    /* renamed from: k, reason: collision with root package name */
    private long f19894k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19895l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19896m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19897n;

    /* renamed from: o, reason: collision with root package name */
    private long f19898o;

    public u6() {
        this.f19884a = new C1477h4();
        this.f19888e = new ArrayList<>();
    }

    public int a() {
        return this.f19885b;
    }

    public long b() {
        return this.f19886c;
    }

    public boolean c() {
        return this.f19887d;
    }

    public C1529o5 d() {
        return this.f19892i;
    }

    public long e() {
        return this.f19894k;
    }

    public int f() {
        return this.f19891h;
    }

    public C1477h4 g() {
        return this.f19884a;
    }

    public int h() {
        return this.f19890g;
    }

    @NotNull
    public h7 i() {
        ArrayList<h7> arrayList = this.f19888e;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            h7 h7Var = arrayList.get(i4);
            i4++;
            h7 h7Var2 = h7Var;
            if (h7Var2.isDefault()) {
                return h7Var2;
            }
        }
        h7 h7Var3 = this.f19889f;
        return h7Var3 != null ? h7Var3 : new lb();
    }

    public long j() {
        return this.f19898o;
    }

    public boolean k() {
        return this.f19893j;
    }

    public boolean l() {
        return this.f19895l;
    }

    public boolean m() {
        return this.f19897n;
    }

    public boolean n() {
        return this.f19896m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f19885b + ", bidderExclusive=" + this.f19887d + '}';
    }

    public u6(int i4, long j4, boolean z4, C1477h4 c1477h4, int i5, C1529o5 c1529o5, int i6, boolean z5, long j5, boolean z6, boolean z7, boolean z8, long j6) {
        this.f19888e = new ArrayList<>();
        this.f19885b = i4;
        this.f19886c = j4;
        this.f19887d = z4;
        this.f19884a = c1477h4;
        this.f19890g = i5;
        this.f19891h = i6;
        this.f19892i = c1529o5;
        this.f19893j = z5;
        this.f19894k = j5;
        this.f19895l = z6;
        this.f19896m = z7;
        this.f19897n = z8;
        this.f19898o = j6;
    }

    public h7 a(String str) {
        ArrayList<h7> arrayList = this.f19888e;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            h7 h7Var = arrayList.get(i4);
            i4++;
            h7 h7Var2 = h7Var;
            if (h7Var2.getPlacementName().equals(str)) {
                return h7Var2;
            }
        }
        return null;
    }

    public void a(h7 h7Var) {
        if (h7Var != null) {
            this.f19888e.add(h7Var);
            if (this.f19889f == null || h7Var.isPlacementId(0)) {
                this.f19889f = h7Var;
            }
        }
    }
}

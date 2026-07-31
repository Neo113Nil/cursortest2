package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class nj {

    /* renamed from: n, reason: collision with root package name */
    private static final int f18348n = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<InterstitialPlacement> f18349a;

    /* renamed from: b, reason: collision with root package name */
    private C1477h4 f18350b;

    /* renamed from: c, reason: collision with root package name */
    private int f18351c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18352d;

    /* renamed from: e, reason: collision with root package name */
    private int f18353e;

    /* renamed from: f, reason: collision with root package name */
    private int f18354f;

    /* renamed from: g, reason: collision with root package name */
    private C1529o5 f18355g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18356h;

    /* renamed from: i, reason: collision with root package name */
    private long f18357i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18358j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18359k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f18360l;

    /* renamed from: m, reason: collision with root package name */
    private InterstitialPlacement f18361m;

    public nj() {
        this.f18349a = new ArrayList<>();
        this.f18350b = new C1477h4();
        this.f18355g = new C1529o5();
    }

    public InterstitialPlacement a() {
        ArrayList<InterstitialPlacement> arrayList = this.f18349a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            InterstitialPlacement interstitialPlacement = arrayList.get(i4);
            i4++;
            InterstitialPlacement interstitialPlacement2 = interstitialPlacement;
            if (interstitialPlacement2.isDefault()) {
                return interstitialPlacement2;
            }
        }
        return this.f18361m;
    }

    public int b() {
        return this.f18354f;
    }

    public int c() {
        return this.f18351c;
    }

    public int d() {
        return this.f18353e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f18353e);
    }

    public boolean f() {
        return this.f18352d;
    }

    public C1529o5 g() {
        return this.f18355g;
    }

    public long h() {
        return this.f18357i;
    }

    public C1477h4 i() {
        return this.f18350b;
    }

    public boolean j() {
        return this.f18356h;
    }

    public boolean k() {
        return this.f18358j;
    }

    public boolean l() {
        return this.f18360l;
    }

    public boolean m() {
        return this.f18359k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f18351c + ", bidderExclusive=" + this.f18352d + '}';
    }

    public nj(int i4, boolean z4, int i5, C1477h4 c1477h4, C1529o5 c1529o5, int i6, boolean z5, long j4, boolean z6, boolean z7, boolean z8) {
        this.f18349a = new ArrayList<>();
        this.f18351c = i4;
        this.f18352d = z4;
        this.f18353e = i5;
        this.f18350b = c1477h4;
        this.f18355g = c1529o5;
        this.f18358j = z6;
        this.f18359k = z7;
        this.f18354f = i6;
        this.f18356h = z5;
        this.f18357i = j4;
        this.f18360l = z8;
    }

    public InterstitialPlacement a(String str) {
        ArrayList<InterstitialPlacement> arrayList = this.f18349a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            InterstitialPlacement interstitialPlacement = arrayList.get(i4);
            i4++;
            InterstitialPlacement interstitialPlacement2 = interstitialPlacement;
            if (interstitialPlacement2.getPlacementName().equals(str)) {
                return interstitialPlacement2;
            }
        }
        return null;
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f18349a.add(interstitialPlacement);
            if (this.f18361m == null || interstitialPlacement.isPlacementId(0)) {
                this.f18361m = interstitialPlacement;
            }
        }
    }
}

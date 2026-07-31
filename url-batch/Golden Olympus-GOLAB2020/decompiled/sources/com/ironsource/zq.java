package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class zq {

    /* renamed from: o, reason: collision with root package name */
    private static final int f20566o = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Placement> f20567a;

    /* renamed from: b, reason: collision with root package name */
    private C1477h4 f20568b;

    /* renamed from: c, reason: collision with root package name */
    private int f20569c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20570d;

    /* renamed from: e, reason: collision with root package name */
    private int f20571e;

    /* renamed from: f, reason: collision with root package name */
    private int f20572f;

    /* renamed from: g, reason: collision with root package name */
    private int f20573g;

    /* renamed from: h, reason: collision with root package name */
    private long f20574h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20575i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20576j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20577k;

    /* renamed from: l, reason: collision with root package name */
    private Placement f20578l;

    /* renamed from: m, reason: collision with root package name */
    private C1529o5 f20579m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20580n;

    public zq() {
        this.f20567a = new ArrayList<>();
        this.f20568b = new C1477h4();
    }

    public Placement a() {
        ArrayList<Placement> arrayList = this.f20567a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Placement placement = arrayList.get(i4);
            i4++;
            Placement placement2 = placement;
            if (placement2.isDefault()) {
                return placement2;
            }
        }
        return this.f20578l;
    }

    public int b() {
        return this.f20573g;
    }

    public int c() {
        return this.f20572f;
    }

    public boolean d() {
        return this.f20580n;
    }

    public ArrayList<Placement> e() {
        return this.f20567a;
    }

    public boolean f() {
        return this.f20575i;
    }

    public int g() {
        return this.f20569c;
    }

    public int h() {
        return this.f20571e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f20571e);
    }

    public boolean j() {
        return this.f20570d;
    }

    public C1529o5 k() {
        return this.f20579m;
    }

    public long l() {
        return this.f20574h;
    }

    public C1477h4 m() {
        return this.f20568b;
    }

    public boolean n() {
        return this.f20577k;
    }

    public boolean o() {
        return this.f20576j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f20569c + ", bidderExclusive=" + this.f20570d + '}';
    }

    public zq(int i4, boolean z4, int i5, int i6, C1477h4 c1477h4, C1529o5 c1529o5, int i7, boolean z5, long j4, boolean z6, boolean z7, boolean z8) {
        this.f20567a = new ArrayList<>();
        this.f20569c = i4;
        this.f20570d = z4;
        this.f20571e = i5;
        this.f20568b = c1477h4;
        this.f20572f = i6;
        this.f20579m = c1529o5;
        this.f20573g = i7;
        this.f20580n = z5;
        this.f20574h = j4;
        this.f20575i = z6;
        this.f20576j = z7;
        this.f20577k = z8;
    }

    public Placement a(String str) {
        ArrayList<Placement> arrayList = this.f20567a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Placement placement = arrayList.get(i4);
            i4++;
            Placement placement2 = placement;
            if (placement2.getPlacementName().equals(str)) {
                return placement2;
            }
        }
        return null;
    }

    public void a(Placement placement) {
        if (placement != null) {
            this.f20567a.add(placement);
            if (this.f20578l == null || placement.isPlacementId(0)) {
                this.f20578l = placement;
            }
        }
    }
}

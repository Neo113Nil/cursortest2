package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.ironsource.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1529o5 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18472a;

    /* renamed from: b, reason: collision with root package name */
    private String f18473b;

    /* renamed from: c, reason: collision with root package name */
    private String f18474c;

    /* renamed from: d, reason: collision with root package name */
    private String f18475d;

    /* renamed from: e, reason: collision with root package name */
    private int f18476e;

    /* renamed from: f, reason: collision with root package name */
    private int f18477f;

    /* renamed from: g, reason: collision with root package name */
    private int f18478g;

    /* renamed from: h, reason: collision with root package name */
    private long f18479h;

    /* renamed from: i, reason: collision with root package name */
    private long f18480i;

    /* renamed from: j, reason: collision with root package name */
    private long f18481j;

    /* renamed from: k, reason: collision with root package name */
    private long f18482k;

    /* renamed from: l, reason: collision with root package name */
    private long f18483l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18484m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f18485n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18486o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18487p;

    /* renamed from: q, reason: collision with root package name */
    private int f18488q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18489r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18490s;

    public C1529o5() {
        this.f18473b = "";
        this.f18474c = "";
        this.f18475d = "";
        this.f18480i = 0L;
        this.f18481j = 0L;
        this.f18482k = 0L;
        this.f18483l = 0L;
        this.f18484m = true;
        this.f18485n = new ArrayList<>();
        this.f18478g = 0;
        this.f18486o = false;
        this.f18487p = false;
        this.f18488q = 1;
    }

    public String a() {
        return this.f18473b;
    }

    public long b() {
        return this.f18481j;
    }

    public int c() {
        return this.f18477f;
    }

    public int d() {
        return this.f18488q;
    }

    public boolean e() {
        return this.f18484m;
    }

    public ArrayList<String> f() {
        return this.f18485n;
    }

    public int g() {
        return this.f18476e;
    }

    public boolean h() {
        return this.f18472a;
    }

    public int i() {
        return this.f18478g;
    }

    public long j() {
        return this.f18482k;
    }

    public long k() {
        return this.f18480i;
    }

    public long l() {
        return this.f18483l;
    }

    public long m() {
        return this.f18479h;
    }

    public boolean n() {
        return this.f18486o;
    }

    public boolean o() {
        return this.f18487p;
    }

    public boolean p() {
        return this.f18490s;
    }

    public boolean q() {
        return this.f18489r;
    }

    C1529o5(String str, String str2, String str3, int i4, int i5, long j4, long j5, long j6, long j7, long j8, boolean z4, int i6, boolean z5, boolean z6, boolean z7, int i7, boolean z8, boolean z9) {
        this.f18473b = str;
        this.f18474c = str2;
        this.f18475d = str3;
        this.f18476e = i4;
        this.f18477f = i5;
        this.f18479h = j4;
        this.f18472a = z7;
        this.f18480i = j5;
        this.f18481j = j6;
        this.f18482k = j7;
        this.f18483l = j8;
        this.f18484m = z4;
        this.f18478g = i6;
        this.f18485n = new ArrayList<>();
        this.f18486o = z5;
        this.f18487p = z6;
        this.f18488q = i7;
        this.f18489r = z8;
        this.f18490s = z9;
    }

    public String a(boolean z4) {
        return z4 ? this.f18475d : this.f18474c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f18485n.add(str);
    }
}

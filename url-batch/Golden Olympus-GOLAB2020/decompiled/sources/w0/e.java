package w0;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f46587a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46588b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46589c;

    /* renamed from: d, reason: collision with root package name */
    private final String f46590d;

    /* renamed from: e, reason: collision with root package name */
    private final String f46591e;

    /* renamed from: f, reason: collision with root package name */
    private final int f46592f;

    /* renamed from: g, reason: collision with root package name */
    private int f46593g;

    public e(String str, String str2, String str3, String str4, String str5, int i4) {
        this.f46593g = 0;
        this.f46587a = str;
        this.f46588b = str2;
        this.f46589c = str3;
        this.f46590d = str4;
        this.f46591e = str5;
        this.f46592f = i4;
        if (str != null) {
            this.f46593g = str.length() / 2;
        }
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.f46587a) || TextUtils.isEmpty(this.f46588b) || TextUtils.isEmpty(this.f46589c) || TextUtils.isEmpty(this.f46590d) || this.f46587a.length() != this.f46588b.length() || this.f46588b.length() != this.f46589c.length() || this.f46589c.length() != this.f46593g * 2 || this.f46592f < 0 || TextUtils.isEmpty(this.f46591e)) ? false : true;
    }

    public String b() {
        return this.f46587a;
    }

    public String c() {
        return this.f46588b;
    }

    public String d() {
        return this.f46589c;
    }

    public String e() {
        return this.f46590d;
    }

    public String f() {
        return this.f46591e;
    }

    public int g() {
        return this.f46592f;
    }

    public int h() {
        return this.f46593g;
    }
}

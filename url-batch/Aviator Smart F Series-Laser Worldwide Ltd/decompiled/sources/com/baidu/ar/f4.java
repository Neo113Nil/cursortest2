package com.baidu.ar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class f4 implements Parcelable {
    public static final Parcelable.Creator<f4> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f2199a;

    /* renamed from: b, reason: collision with root package name */
    public String f2200b;

    /* renamed from: c, reason: collision with root package name */
    public String f2201c;

    /* renamed from: d, reason: collision with root package name */
    public String f2202d;

    /* renamed from: e, reason: collision with root package name */
    public String f2203e;

    /* renamed from: f, reason: collision with root package name */
    public String f2204f;

    /* renamed from: g, reason: collision with root package name */
    public String f2205g;

    /* renamed from: h, reason: collision with root package name */
    public String f2206h;

    /* renamed from: i, reason: collision with root package name */
    public String f2207i;

    /* renamed from: j, reason: collision with root package name */
    public String f2208j;

    /* renamed from: k, reason: collision with root package name */
    public String f2209k;

    /* renamed from: l, reason: collision with root package name */
    public String f2210l;

    /* renamed from: m, reason: collision with root package name */
    public String f2211m;

    /* renamed from: n, reason: collision with root package name */
    public String f2212n;

    /* renamed from: o, reason: collision with root package name */
    public String f2213o;

    public class a implements Parcelable.Creator<f4> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f4 createFromParcel(Parcel parcel) {
            f4 f4Var = new f4();
            f4Var.f2199a = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2200b = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2201c = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2202d = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2203e = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2204f = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2205g = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2206h = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2207i = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2208j = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2209k = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2210l = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2211m = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2212n = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f2213o = (String) parcel.readValue(String.class.getClassLoader());
            return f4Var;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f4[] newArray(int i8) {
            return new f4[i8];
        }
    }

    public String a() {
        return this.f2199a;
    }

    public String b() {
        return this.f2200b;
    }

    public String c() {
        return this.f2201c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeValue(this.f2199a);
        parcel.writeValue(this.f2200b);
        parcel.writeValue(this.f2201c);
        parcel.writeValue(this.f2202d);
        parcel.writeValue(this.f2203e);
        parcel.writeValue(this.f2204f);
        parcel.writeValue(this.f2205g);
        parcel.writeValue(this.f2206h);
        parcel.writeValue(this.f2207i);
        parcel.writeValue(this.f2208j);
        parcel.writeValue(this.f2209k);
        parcel.writeValue(this.f2210l);
        parcel.writeValue(this.f2211m);
        parcel.writeValue(this.f2212n);
        parcel.writeValue(this.f2213o);
    }

    public void d(String str) {
        this.f2201c = str;
    }

    public void e(String str) {
        this.f2202d = str;
    }

    public void f(String str) {
        this.f2203e = str;
    }

    public void g(String str) {
        this.f2204f = str;
    }

    public void h(String str) {
        this.f2205g = str;
    }

    public void i(String str) {
        this.f2212n = str;
    }

    public void j(String str) {
        this.f2211m = str;
    }

    public void k(String str) {
        this.f2213o = str;
    }

    public void l(String str) {
        this.f2206h = str;
    }

    public void m(String str) {
        this.f2207i = str;
    }

    public void n(String str) {
        this.f2208j = str;
    }

    public void o(String str) {
        this.f2209k = str;
    }

    public void a(String str) {
        this.f2199a = str;
    }

    public void b(String str) {
        this.f2210l = str;
    }

    public void c(String str) {
        this.f2200b = str;
    }
}

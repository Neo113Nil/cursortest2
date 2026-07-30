package com.baidu.platform.comapi.bmsdk.style;

import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes2.dex */
public class BmTextStyle extends BmObject implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f8962a;

    /* renamed from: b, reason: collision with root package name */
    private int f8963b;

    /* renamed from: c, reason: collision with root package name */
    private int f8964c;

    /* renamed from: d, reason: collision with root package name */
    private int f8965d;

    /* renamed from: e, reason: collision with root package name */
    private int f8966e;

    public BmTextStyle() {
        super(54, nativeCreate());
        this.f8962a = -13421773;
        this.f8963b = 22;
        this.f8964c = 0;
        this.f8965d = 0;
        this.f8966e = 0;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBorderColor(long j8, int i8);

    private static native boolean nativeSetBorderWidth(long j8, int i8);

    private static native boolean nativeSetFontOption(long j8, int i8);

    private static native boolean nativeSetTextColor(long j8, int i8);

    private static native boolean nativeSetTextSize(long j8, int i8);

    public boolean a(int i8) {
        this.f8964c = i8;
        return nativeSetBorderColor(this.nativeInstance, a.a(i8));
    }

    public boolean b(int i8) {
        this.f8965d = i8;
        return nativeSetBorderWidth(this.nativeInstance, i8);
    }

    public boolean c(int i8) {
        this.f8966e = i8;
        return nativeSetFontOption(this.nativeInstance, i8);
    }

    public boolean d(int i8) {
        this.f8962a = i8;
        return nativeSetTextColor(this.nativeInstance, a.a(i8));
    }

    public boolean e(int i8) {
        this.f8963b = i8;
        return nativeSetTextSize(this.nativeInstance, i8);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BmTextStyle clone() {
        BmTextStyle bmTextStyle = new BmTextStyle();
        bmTextStyle.d(this.f8962a);
        bmTextStyle.e(this.f8963b);
        bmTextStyle.a(this.f8964c);
        bmTextStyle.b(this.f8965d);
        bmTextStyle.c(this.f8966e);
        return bmTextStyle;
    }
}

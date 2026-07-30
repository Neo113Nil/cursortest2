package com.baidu.platform.comapi.bmsdk.ui;

import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;

/* loaded from: classes2.dex */
public class BmLabelUI extends BmBaseUI {

    /* renamed from: g, reason: collision with root package name */
    private String f8985g;

    /* renamed from: h, reason: collision with root package name */
    private BmTextStyle f8986h;

    public BmLabelUI() {
        super(33, nativeCreate());
        this.f8985g = "";
    }

    private static native long nativeCreate();

    private static native boolean nativeSetMaxLines(long j8, int i8);

    private static native boolean nativeSetMinLines(long j8, int i8);

    private static native boolean nativeSetStyle(long j8, long j9);

    private static native boolean nativeSetText(long j8, String str);

    public boolean a(BmTextStyle bmTextStyle) {
        this.f8986h = bmTextStyle;
        return bmTextStyle != null ? nativeSetStyle(this.nativeInstance, bmTextStyle.getNativeInstance()) : nativeSetStyle(this.nativeInstance, 0L);
    }

    public String b() {
        return this.f8985g;
    }

    public boolean j(int i8) {
        if (i8 <= 0) {
            return false;
        }
        return nativeSetMaxLines(this.nativeInstance, i8);
    }

    public boolean b(String str) {
        this.f8985g = str;
        return nativeSetText(this.nativeInstance, str);
    }
}

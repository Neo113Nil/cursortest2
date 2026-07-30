package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.Text;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;

/* loaded from: classes2.dex */
public class BmTextMarker extends BmBaseMarker {

    /* renamed from: w, reason: collision with root package name */
    private String f8913w;

    /* renamed from: x, reason: collision with root package name */
    private BmTextStyle f8914x;

    /* renamed from: y, reason: collision with root package name */
    private Text f8915y;

    public BmTextMarker() {
        super(5, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetStyle(long j8, long j9);

    private static native boolean nativeSetText(long j8, String str);

    public void a(Text text) {
        this.f8915y = text;
    }

    public boolean b(String str) {
        this.f8913w = str;
        return nativeSetText(this.nativeInstance, str);
    }

    public Text d() {
        return this.f8915y;
    }

    public boolean a(BmTextStyle bmTextStyle) {
        this.f8914x = bmTextStyle;
        return bmTextStyle != null ? nativeSetStyle(this.nativeInstance, bmTextStyle.nativeInstance) : nativeSetStyle(this.nativeInstance, 0L);
    }
}

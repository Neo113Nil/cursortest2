package com.baidu.platform.comapi.bmsdk.style;

import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes2.dex */
public class BmLineStyleOption extends BmObject {
    private BmLineStyleOption() {
        super(52, nativeCreate());
    }

    private static native boolean nativeBuildStyleOption(long j8, int i8, long j9);

    private static native long nativeCreate();

    public BmLineStyleOption(int i8, BmLineStyle bmLineStyle) {
        super(52, nativeCreate());
        nativeBuildStyleOption(this.nativeInstance, i8, bmLineStyle != null ? bmLineStyle.getNativeInstance() : 0L);
    }
}

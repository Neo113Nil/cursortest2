package com.baidu.platform.comapi.bmsdk.style;

/* loaded from: classes2.dex */
public class a {
    public static int a(int i8) {
        int i9 = ((-16777216) & i8) >> 24;
        int i10 = (65280 & i8) >> 8;
        return ((i8 & 255) << 16) | (i9 << 24) | (i10 << 8) | ((16711680 & i8) >> 16);
    }
}

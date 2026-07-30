package com.jieli.bmp_convert;

/* loaded from: classes4.dex */
public interface OnConvertListener {
    void onStart(String str);

    void onStop(ConvertResult convertResult, String str);

    @Deprecated
    void onStop(boolean z7, String str);
}

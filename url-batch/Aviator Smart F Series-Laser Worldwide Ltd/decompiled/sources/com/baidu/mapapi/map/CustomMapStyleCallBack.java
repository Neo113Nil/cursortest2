package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public interface CustomMapStyleCallBack {
    boolean onCustomMapStyleLoadFailed(int i8, String str, String str2);

    boolean onCustomMapStyleLoadSuccess(boolean z7, String str);

    boolean onPreLoadLastCustomMapStyle(String str);
}

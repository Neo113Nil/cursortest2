package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

/* compiled from: NetUtils.java */
/* loaded from: classes2.dex */
public class vA {
    public static void pvs(SSWebView sSWebView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        sSWebView.pvs(str, hashMap);
    }
}

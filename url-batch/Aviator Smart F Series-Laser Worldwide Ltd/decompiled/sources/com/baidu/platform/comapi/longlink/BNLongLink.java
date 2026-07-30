package com.baidu.platform.comapi.longlink;

/* loaded from: classes2.dex */
public class BNLongLink {

    /* renamed from: a, reason: collision with root package name */
    private static BNLongLinkInitCallBack f9356a;

    public static void initLongLink() {
        BNLongLinkInitCallBack bNLongLinkInitCallBack = f9356a;
        if (bNLongLinkInitCallBack != null) {
            bNLongLinkInitCallBack.onLongLinkInit();
        }
    }

    public static void registerLongLinkInitCallBack(BNLongLinkInitCallBack bNLongLinkInitCallBack) {
        f9356a = bNLongLinkInitCallBack;
    }

    public static void unRegisterLongLinkInitCallBack(BNLongLinkInitCallBack bNLongLinkInitCallBack) {
        f9356a = bNLongLinkInitCallBack;
    }
}

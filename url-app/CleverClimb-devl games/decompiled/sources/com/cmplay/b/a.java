package com.cmplay.b;

import com.aiming.mdt.utils.Constants;

/* compiled from: EPlatform.java */
/* loaded from: classes.dex */
public enum a {
    Facebook(Constants.PKG_FB, "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias"),
    Twitter("com.twitter.android", "com.twitter.android.composer.ComposerActivity"),
    Messenger("com.facebook.orca", null),
    QQ("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity"),
    QQZone("com.qzone", "com.qzonex.module.operation.ui.QZonePublishMoodActivity"),
    WeChat("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"),
    QQWechatMoment("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI");

    private String h;
    private String i;

    a(String str, String str2) {
        this.h = str;
        this.i = str2;
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }
}

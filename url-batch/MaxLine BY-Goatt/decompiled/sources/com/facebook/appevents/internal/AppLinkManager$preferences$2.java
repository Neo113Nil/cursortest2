package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import defpackage.o81;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppLinkManager$preferences$2 extends o81 implements Function0<SharedPreferences> {
    public static final AppLinkManager$preferences$2 INSTANCE = new AppLinkManager$preferences$2();

    public AppLinkManager$preferences$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(AppLinkManager.APPLINK_INFO, 0);
    }
}

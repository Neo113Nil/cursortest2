package com.facebook.appevents.gps.ara;

import defpackage.o81;
import java.net.URLEncoder;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GpsAraTriggersManager$getEventParameters$1 extends o81 implements Function1<String, String> {
    final /* synthetic */ JSONObject $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsAraTriggersManager$getEventParameters$1(JSONObject jSONObject) {
        super(1);
        this.$params = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        Object opt = this.$params.opt(str);
        if (opt == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8") + '=' + URLEncoder.encode(opt.toString(), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }
}

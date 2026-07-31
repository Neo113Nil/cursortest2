package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class ix2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6837a = w20.f13665b.e();

    public final String a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f6837a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}

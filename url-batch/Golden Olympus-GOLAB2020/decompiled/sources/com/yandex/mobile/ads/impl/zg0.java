package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zg0 extends xg0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f35589e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f35590f;

    public zg0(int i4, jv jvVar, Map map) {
        super(C1877de.a("Response code: ", i4), jvVar, IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS);
        this.f35589e = i4;
        this.f35590f = map;
    }
}

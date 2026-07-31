package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AdaptMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final transient AdaptMetaData f130a = new AdaptMetaData();

    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "5.3.2";

    private AdaptMetaData() {
    }

    public static AdaptMetaData b() {
        return f130a;
    }

    public final AdRules a() {
        return this.adRules;
    }
}

package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class TelephonyDataConfig implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final TelephonyDataConfig f155a = new TelephonyDataConfig();
    private static final long serialVersionUID = -7175662234963204913L;
    private String param;
    private boolean enabled = true;

    @TypeInfo(type = ArrayList.class)
    private List<String> categories = Collections.singletonList(o8.i.f361a);

    public final List a() {
        return this.categories;
    }

    public final String b() {
        return this.param;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TelephonyDataConfig telephonyDataConfig = (TelephonyDataConfig) obj;
            if (this.enabled == telephonyDataConfig.enabled && zh.a(this.categories, telephonyDataConfig.categories) && zh.a((Object) this.param, (Object) telephonyDataConfig.param)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.categories, this.param};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}

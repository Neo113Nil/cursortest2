package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2772l5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39375b;

    public C2772l5(String str, String str2) {
        this.f39374a = str;
        this.f39375b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f39375b);
    }

    public final String b() {
        return this.f39375b;
    }

    public final String c() {
        return this.f39374a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f39374a + BundleUtil.UNDERLINE_TAG + ApiKeyUtils.createPartialApiKey(this.f39375b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2772l5 c2772l5 = (C2772l5) obj;
            String str = this.f39374a;
            if (str == null ? c2772l5.f39374a != null : !str.equals(c2772l5.f39374a)) {
                return false;
            }
            String str2 = this.f39375b;
            String str3 = c2772l5.f39375b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39374a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f39375b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f39374a + BundleUtil.UNDERLINE_TAG + this.f39375b;
    }
}

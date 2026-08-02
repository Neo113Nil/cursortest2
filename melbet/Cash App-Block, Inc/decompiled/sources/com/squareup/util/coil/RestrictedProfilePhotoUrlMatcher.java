package com.squareup.util.coil;

import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class RestrictedProfilePhotoUrlMatcher {
    public static final Set PROFILE_PHOTO_PATH_PREFIXES = ArraysKt___ArraysKt.toSet(new String[]{"/cash-customer-profile/profile-photo/", "/cash-app/profile-photo/"});
    public final Set authenticatedHosts;
    public final boolean enabled;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RestrictedProfilePhotoUrlMatcher(String str, boolean z) {
        Set set;
        String str2;
        this.enabled = z;
        HttpUrl httpUrl = null;
        try {
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            httpUrl = builder.build();
        } catch (IllegalArgumentException unused) {
        }
        if (httpUrl != null && (str2 = httpUrl.host) != null) {
            SetBuilder setBuilder = new SetBuilder();
            setBuilder.add(str2);
            setBuilder.addAll(StringsKt__StringsJVMKt.endsWith(str2, "cashappapistaging.com", false) ? SetsKt__SetsJVMKt.setOf("cashstaging.app") : StringsKt__StringsJVMKt.endsWith(str2, "cashappapi.com", false) ? SetsKt__SetsJVMKt.setOf("cash.app") : EmptySet.INSTANCE);
            set = SetsKt__SetsJVMKt.build(setBuilder);
        }
        set = EmptySet.INSTANCE;
        this.authenticatedHosts = set;
    }
}

package com.squareup.util.coil;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class RoutingImageCallFactory implements Call.Factory {
    public final Call.Factory authenticatedCallFactory;
    public final RestrictedProfilePhotoUrlMatcher matcher;
    public final OkHttpClient plainCallFactory;

    public RoutingImageCallFactory(OkHttpClient okHttpClient, Call.Factory factory, RestrictedProfilePhotoUrlMatcher restrictedProfilePhotoUrlMatcher) {
        this.plainCallFactory = okHttpClient;
        this.authenticatedCallFactory = factory;
        this.matcher = restrictedProfilePhotoUrlMatcher;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        request.getClass();
        HttpUrl httpUrl = request.url;
        httpUrl.getClass();
        RestrictedProfilePhotoUrlMatcher restrictedProfilePhotoUrlMatcher = this.matcher;
        if (restrictedProfilePhotoUrlMatcher.enabled && httpUrl.isHttps() && restrictedProfilePhotoUrlMatcher.authenticatedHosts.contains(httpUrl.host)) {
            Set set = RestrictedProfilePhotoUrlMatcher.PROFILE_PHOTO_PATH_PREFIXES;
            String encodedPath = httpUrl.encodedPath();
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.startsWith(encodedPath, (String) it.next(), false)) {
                        return this.authenticatedCallFactory.newCall(request);
                    }
                }
            }
        }
        return new RealCall(this.plainCallFactory, request, false);
    }
}

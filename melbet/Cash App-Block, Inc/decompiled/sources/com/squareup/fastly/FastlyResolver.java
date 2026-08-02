package com.squareup.fastly;

import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class FastlyResolver {
    public static final MapBuilder hostMapping;

    static {
        Pair[] pairArr = {new Pair("cash-images-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("franklin-assets.s3.amazonaws.com")), new Pair("postoffice-production-f.squarecdn.com", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"square-postoffice-production.s3.amazonaws.com", "square-postoffice-production.s3.us-west-1.amazonaws.com"})), new Pair("square-web-production-f.squarecdn.com", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"d1g145x70srn7h.cloudfront.net", "square-production.s3.amazonaws.com"})), new Pair("items-images-production-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("items-images-production.s3.us-west-2.amazonaws.com")), new Pair("receipts-production-f.squarecdn.com", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"square-receipts-production.s3.amazonaws.com", "d3g64w74of3jgu.cloudfront.net"})), new Pair("beanstalk-production-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-store-production.s3.amazonaws.com")), new Pair("dashboard-production-f.squarecdn.com", EmptyList.INSTANCE), new Pair("appointments-production-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("appointments-production.s3.amazonaws.com")), new Pair("postoffice-images-production-c.squarecdn.com", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"postoffice-images-production.s3.amazonaws.com", "postoffice-images-production.s3.us-west-2.amazonaws.com"})), new Pair("square-web-sandbox-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-web-sandbox.s3.amazonaws.com")), new Pair("items-images-sandbox-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-catalog-sandbox.s3.amazonaws.com")), new Pair("postoffice-staging-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-postoffice-staging.s3.amazonaws.com")), new Pair("square-web-staging-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-staging.s3.amazonaws.com")), new Pair("items-images-staging-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("items-images-staging.s3.us-west-2.amazonaws.com")), new Pair("receipts-staging-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-receipts-staging.s3.amazonaws.com")), new Pair("beanstalk-staging-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("square-store-staging.s3.amazonaws.com")), new Pair("appointments-staging-f.squarecdn.com", CollectionsKt__CollectionsJVMKt.listOf("appointments-staging.s3.amazonaws.com")), new Pair("postoffice-images-staging-c.squarecdn.com", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"postoffice-images-staging.s3.amazonaws.com", "postoffice-images-staging.s3.us-west-2.amazonaws.com"}))};
        MapBuilder mapBuilder = new MapBuilder();
        for (int i = 0; i < 18; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.first;
            List list = (List) pair.second;
            mapBuilder.put(str, str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mapBuilder.put((String) it.next(), str);
            }
        }
        hostMapping = mapBuilder.build();
    }

    public static boolean canHandleRequest(Uri uri) {
        String scheme = uri.getScheme();
        return ("https".equals(scheme) || "http".equals(scheme)) && hostMapping.containsKey(uri.getHost());
    }

    public static Uri resolve(Uri uri, int i, int i2) {
        String str = (String) hostMapping.get(uri.getHost());
        if (str == null) {
            return uri;
        }
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("https://", str, "/");
        String uri2 = uri.toString();
        uri2.getClass();
        Uri parse = Uri.parse(m);
        String scheme = parse.getScheme();
        if (scheme == null || StringsKt.isBlank(scheme)) {
            a$$ExternalSyntheticBUOutline0.m$3("base URL scheme can't be null or blank!");
            return null;
        }
        String authority = parse.getAuthority();
        if (authority == null || StringsKt.isBlank(authority)) {
            a$$ExternalSyntheticBUOutline0.m$3("base URL authority can't be null or blank!");
            return null;
        }
        Uri parse2 = Uri.parse(uri2);
        String path = parse2.getPath();
        String trimEnd = path != null ? StringsKt.trimEnd(path, '/') : null;
        if (trimEnd == null || StringsKt.isBlank(trimEnd)) {
            a$$ExternalSyntheticBUOutline0.m$3("image URL path can't be null or blank!");
            return null;
        }
        Uri.Builder path2 = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse2.getPath());
        path2.getClass();
        if (i > 0) {
            path2.appendQueryParameter("width", String.valueOf(i));
        }
        if (i2 > 0) {
            path2.appendQueryParameter("height", String.valueOf(i2));
        }
        path2.appendQueryParameter("fit", "bounds");
        String builder = path2.toString();
        builder.getClass();
        return Uri.parse(builder);
    }
}

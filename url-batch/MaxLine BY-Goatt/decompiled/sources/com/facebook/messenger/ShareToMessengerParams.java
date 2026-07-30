package com.facebook.messenger;

import android.net.Uri;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ch2;
import defpackage.lh;
import defpackage.q40;
import defpackage.zv;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareToMessengerParams {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> VALID_EXTERNAL_URI_SCHEMES;
    private static final Set<String> VALID_MIME_TYPES;
    private static final Set<String> VALID_URI_SCHEMES;
    private final Uri externalUri;
    private final String metaData;
    private final String mimeType;
    private final Uri uri;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        VALID_MIME_TYPES = zv.Q(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(FirebaseAnalytics.Param.CONTENT);
        hashSet2.add("android.resource");
        hashSet2.add(ShareInternalUtility.STAGING_PARAM);
        VALID_URI_SCHEMES = zv.Q(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("http");
        hashSet3.add(TournamentShareDialogURIBuilder.scheme);
        VALID_EXTERNAL_URI_SCHEMES = zv.Q(hashSet3);
    }

    public ShareToMessengerParams(ShareToMessengerParamsBuilder shareToMessengerParamsBuilder) {
        shareToMessengerParamsBuilder.getClass();
        Uri uri = shareToMessengerParamsBuilder.getUri();
        if (uri == null) {
            lh.g("Must provide non-null uri");
            throw null;
        }
        this.uri = uri;
        String mimeType = shareToMessengerParamsBuilder.getMimeType();
        if (mimeType == null) {
            lh.g("Must provide mimeType");
            throw null;
        }
        this.mimeType = mimeType;
        this.metaData = shareToMessengerParamsBuilder.getMetaData();
        Uri externalUri = shareToMessengerParamsBuilder.getExternalUri();
        this.externalUri = externalUri;
        if (!zv.q(VALID_URI_SCHEMES, uri.getScheme())) {
            ch2.g(uri.getScheme(), "Unsupported URI scheme: ");
            throw null;
        }
        if (!VALID_MIME_TYPES.contains(mimeType)) {
            lh.c(q40.l("Unsupported mime-type: ", mimeType));
            throw null;
        }
        if (externalUri == null || zv.q(VALID_EXTERNAL_URI_SCHEMES, externalUri.getScheme())) {
            return;
        }
        ch2.g(externalUri.getScheme(), "Unsupported external uri scheme: ");
        throw null;
    }

    public static final ShareToMessengerParamsBuilder newBuilder(Uri uri, String str) {
        return Companion.newBuilder(uri, str);
    }

    public final Uri getExternalUri() {
        return this.externalUri;
    }

    public final String getMetaData() {
        return this.metaData;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Uri getUri() {
        return this.uri;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getVALID_EXTERNAL_URI_SCHEMES() {
            return ShareToMessengerParams.VALID_EXTERNAL_URI_SCHEMES;
        }

        public final Set<String> getVALID_MIME_TYPES() {
            return ShareToMessengerParams.VALID_MIME_TYPES;
        }

        public final Set<String> getVALID_URI_SCHEMES() {
            return ShareToMessengerParams.VALID_URI_SCHEMES;
        }

        public final ShareToMessengerParamsBuilder newBuilder(Uri uri, String str) {
            uri.getClass();
            str.getClass();
            return new ShareToMessengerParamsBuilder(uri, str);
        }

        private Companion() {
        }
    }
}

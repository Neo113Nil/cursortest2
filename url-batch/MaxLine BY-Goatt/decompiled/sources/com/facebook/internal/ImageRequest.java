package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.lh;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ImageRequest {
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    public static final Companion Companion = new Companion(null);
    private static final String HEIGHT_PARAM = "height";
    private static final String MIGRATION_PARAM = "migration_overrides";
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    private static final String PATH = "%s/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;
    private static final String WIDTH_PARAM = "width";
    private final boolean allowCachedRedirects;
    private final Callback callback;
    private final Object callerTag;
    private final Context context;
    private final Uri imageUri;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder {
        private boolean allowCachedRedirects;
        private Callback callback;
        private Object callerTag;
        private final Context context;
        private final Uri imageUri;

        public Builder(Context context, Uri uri) {
            context.getClass();
            uri.getClass();
            this.context = context;
            this.imageUri = uri;
        }

        private final Context component1() {
            return this.context;
        }

        private final Uri component2() {
            return this.imageUri;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Context context, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                context = builder.context;
            }
            if ((i & 2) != 0) {
                uri = builder.imageUri;
            }
            return builder.copy(context, uri);
        }

        public final ImageRequest build() {
            Context context = this.context;
            Uri uri = this.imageUri;
            Callback callback = this.callback;
            boolean z = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            }
            return new ImageRequest(context, uri, callback, z, obj, null);
        }

        public final Builder copy(Context context, Uri uri) {
            context.getClass();
            uri.getClass();
            return new Builder(context, uri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return Intrinsics.b(this.context, builder.context) && Intrinsics.b(this.imageUri, builder.imageUri);
        }

        public int hashCode() {
            return this.imageUri.hashCode() + (this.context.hashCode() * 31);
        }

        public final Builder setAllowCachedRedirects(boolean z) {
            this.allowCachedRedirects = z;
            return this;
        }

        public final Builder setCallback(Callback callback) {
            this.callback = callback;
            return this;
        }

        public final Builder setCallerTag(Object obj) {
            this.callerTag = obj;
            return this;
        }

        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Callback {
        void onCompleted(ImageResponse imageResponse);
    }

    private ImageRequest(Context context, Uri uri, Callback callback, boolean z, Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = callback;
        this.allowCachedRedirects = z;
        this.callerTag = obj;
    }

    public static final Uri getProfilePictureUri(String str, int i, int i2) {
        return Companion.getProfilePictureUri(str, i, i2);
    }

    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final Object getCallerTag() {
        return this.callerTag;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final boolean isCachedRedirectAllowed() {
        return this.allowCachedRedirects;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri getProfilePictureUri(String str, int i, int i2, String str2) {
            Validate.notNullOrEmpty(str, "userId");
            int max = Math.max(i, 0);
            int max2 = Math.max(i2, 0);
            if (max == 0 && max2 == 0) {
                lh.e("Either width or height must be greater than 0");
                return null;
            }
            Uri.Builder path = Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon().path(String.format(Locale.US, ImageRequest.PATH, Arrays.copyOf(new Object[]{FacebookSdk.getGraphApiVersion(), str}, 2)));
            if (max2 != 0) {
                path.appendQueryParameter("height", String.valueOf(max2));
            }
            if (max != 0) {
                path.appendQueryParameter("width", String.valueOf(max));
            }
            path.appendQueryParameter(ImageRequest.MIGRATION_PARAM, ImageRequest.MIGRATION_VALUE);
            if (!Utility.isNullOrEmpty(str2)) {
                path.appendQueryParameter("access_token", str2);
            } else if (Utility.isNullOrEmpty(FacebookSdk.getClientToken()) || Utility.isNullOrEmpty(FacebookSdk.getApplicationId())) {
                Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
            } else {
                path.appendQueryParameter("access_token", FacebookSdk.getApplicationId() + '|' + FacebookSdk.getClientToken());
            }
            Uri build = path.build();
            build.getClass();
            return build;
        }

        private Companion() {
        }

        public final Uri getProfilePictureUri(String str, int i, int i2) {
            return getProfilePictureUri(str, i, i2, BuildConfig.FLAVOR);
        }
    }

    public static final Uri getProfilePictureUri(String str, int i, int i2, String str2) {
        return Companion.getProfilePictureUri(str, i, i2, str2);
    }

    public /* synthetic */ ImageRequest(Context context, Uri uri, Callback callback, boolean z, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, callback, z, obj);
    }
}

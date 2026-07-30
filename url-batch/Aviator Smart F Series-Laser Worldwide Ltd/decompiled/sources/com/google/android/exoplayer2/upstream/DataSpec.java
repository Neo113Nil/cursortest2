package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;

    @Nullable
    public final Object customData;
    public final int flags;

    @Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;

    @Nullable
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    public static final class Builder {

        @Nullable
        private Object customData;
        private int flags;

        @Nullable
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;

        @Nullable
        private String key;
        private long length;
        private long position;

        @Nullable
        private Uri uri;
        private long uriPositionOffset;

        public DataSpec build() {
            Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        @CanIgnoreReturnValue
        public Builder setCustomData(@Nullable Object obj) {
            this.customData = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i8) {
            this.flags = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpBody(@Nullable byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpMethod(int i8) {
            this.httpMethod = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKey(@Nullable String str) {
            this.key = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLength(long j8) {
            this.length = j8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPosition(long j8) {
            this.position = j8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUriPositionOffset(long j8) {
            this.uriPositionOffset = j8;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.emptyMap();
            this.length = -1L;
        }

        @CanIgnoreReturnValue
        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.datasource");
    }

    public static String getStringForHttpMethod(int i8) {
        if (i8 == 1) {
            return HttpManager.HTTP_GET;
        }
        if (i8 == 2) {
            return HttpManager.HTTP_POST;
        }
        if (i8 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i8) {
        return (this.flags & i8) == i8;
    }

    public DataSpec subrange(long j8) {
        long j9 = this.length;
        return subrange(j8, j9 != -1 ? j9 - j8 : -1L);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + cn.hutool.core.text.l.SPACE + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + "]";
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap(this.httpRequestHeaders);
        hashMap.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, hashMap, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec subrange(long j8, long j9) {
        return (j8 == 0 && this.length == j9) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j8, j9, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri, long j8, long j9) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j8, j9, null, 0, null);
    }

    @Deprecated
    public DataSpec(Uri uri, int i8) {
        this(uri, 0L, -1L, null, i8);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j9, @Nullable String str) {
        this(uri, j8, j8, j9, str, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j9, @Nullable String str, int i8) {
        this(uri, j8, j8, j9, str, i8);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j9, @Nullable String str, int i8, Map<String, String> map) {
        this(uri, 1, null, j8, j8, j9, str, i8, map);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j9, long j10, @Nullable String str, int i8) {
        this(uri, null, j8, j9, j10, str, i8);
    }

    @Deprecated
    public DataSpec(Uri uri, @Nullable byte[] bArr, long j8, long j9, long j10, @Nullable String str, int i8) {
        this(uri, bArr != null ? 2 : 1, bArr, j8, j9, j10, str, i8);
    }

    @Deprecated
    public DataSpec(Uri uri, int i8, @Nullable byte[] bArr, long j8, long j9, long j10, @Nullable String str, int i9) {
        this(uri, i8, bArr, j8, j9, j10, str, i9, Collections.emptyMap());
    }

    @Deprecated
    public DataSpec(Uri uri, int i8, @Nullable byte[] bArr, long j8, long j9, long j10, @Nullable String str, int i9, Map<String, String> map) {
        this(uri, j8 - j9, i8, bArr, map, j9, j10, str, i9, null);
    }

    private DataSpec(Uri uri, long j8, int i8, @Nullable byte[] bArr, Map<String, String> map, long j9, long j10, @Nullable String str, int i9, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j11 = j8 + j9;
        boolean z7 = true;
        Assertions.checkArgument(j11 >= 0);
        Assertions.checkArgument(j9 >= 0);
        if (j10 <= 0 && j10 != -1) {
            z7 = false;
        }
        Assertions.checkArgument(z7);
        this.uri = uri;
        this.uriPositionOffset = j8;
        this.httpMethod = i8;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j9;
        this.absoluteStreamPosition = j11;
        this.length = j10;
        this.key = str;
        this.flags = i9;
        this.customData = obj;
    }
}

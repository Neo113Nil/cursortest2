package com.stripe.android.core.networking;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes8.dex */
public final class QueryStringFactory$Parameter {
    public final String key;
    public final String value;

    public QueryStringFactory$Parameter(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryStringFactory$Parameter)) {
            return false;
        }
        QueryStringFactory$Parameter queryStringFactory$Parameter = (QueryStringFactory$Parameter) obj;
        return Intrinsics.areEqual(this.key, queryStringFactory$Parameter.key) && Intrinsics.areEqual(this.value, queryStringFactory$Parameter.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        Charset charset = Charsets.UTF_8;
        String encode = URLEncoder.encode(this.key, charset.name());
        encode.getClass();
        String encode2 = URLEncoder.encode(this.value, charset.name());
        encode2.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(encode, "=", encode2);
    }
}

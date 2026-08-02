package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class b {
    public static JsonAdapter a(Moshi moshi, Class cls, String str, String str2) {
        return moshi.adapter(cls, EmptySet.INSTANCE, str);
    }
}

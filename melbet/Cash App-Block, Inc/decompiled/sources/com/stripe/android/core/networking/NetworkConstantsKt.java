package com.stripe.android.core.networking;

import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.ranges.IntRange;

/* loaded from: classes8.dex */
public abstract class NetworkConstantsKt {
    public static final IntRange DEFAULT_RETRY_CODES = new IntRange(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429, 1);
}

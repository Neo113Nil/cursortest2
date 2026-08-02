package com.squareup.cash.treehouse.network;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okio.ByteString;

@Serializable
/* loaded from: classes7.dex */
public final class HttpResponse {
    public final ByteString body;
    public final int code;
    public final HttpHeaders headers;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(8))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/network/HttpResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/network/HttpResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return HttpResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HttpResponse(int i, int i2, HttpHeaders httpHeaders, ByteString byteString) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, HttpResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.code = i2;
        this.headers = httpHeaders;
        this.body = byteString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.code == httpResponse.code && Intrinsics.areEqual(this.headers, httpResponse.headers) && Intrinsics.areEqual(this.body, httpResponse.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.code) * 31, 31, this.headers.namesAndValues);
    }

    public final String toString() {
        return "HttpResponse(code=" + this.code + ", headers=" + this.headers + ", body=" + this.body + ")";
    }

    public HttpResponse(int i, HttpHeaders httpHeaders, ByteString byteString) {
        this.code = i;
        this.headers = httpHeaders;
        this.body = byteString;
    }
}

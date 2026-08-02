package com.squareup.cash.treehouse.network;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public final class HttpRequest {
    public final ByteString body;
    public final HttpHeaders headers;
    public final String method;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(7))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/network/HttpRequest$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/network/HttpRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return HttpRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HttpRequest(int i, String str, String str2, HttpHeaders httpHeaders, ByteString byteString) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, HttpRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.method = str;
        this.url = str2;
        this.headers = httpHeaders;
        if ((i & 8) == 0) {
            this.body = null;
        } else {
            this.body = byteString;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return Intrinsics.areEqual(this.method, httpRequest.method) && Intrinsics.areEqual(this.url, httpRequest.url) && Intrinsics.areEqual(this.headers, httpRequest.headers) && Intrinsics.areEqual(this.body, httpRequest.body);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.method.hashCode() * 31, 31, this.url), 31, this.headers.namesAndValues);
        ByteString byteString = this.body;
        return m + (byteString == null ? 0 : byteString.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HttpRequest(method=", this.method, ", url=", this.url, ", headers=");
        m.append(this.headers);
        m.append(", body=");
        m.append(this.body);
        m.append(")");
        return m.toString();
    }

    public HttpRequest(String str, String str2, HttpHeaders httpHeaders, ByteString byteString) {
        str.getClass();
        str2.getClass();
        this.method = str;
        this.url = str2;
        this.headers = httpHeaders;
        this.body = byteString;
    }
}

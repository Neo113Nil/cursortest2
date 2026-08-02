package com.squareup.cash.treehouse.network;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public final class HttpHeaders {
    public final List namesAndValues;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(6))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/network/HttpHeaders$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/network/HttpHeaders;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return HttpHeaders$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HttpHeaders(int i, List list) {
        if (1 == (i & 1)) {
            this.namesAndValues = list;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, HttpHeaders$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HttpHeaders) && Intrinsics.areEqual(this.namesAndValues, ((HttpHeaders) obj).namesAndValues);
    }

    public final int hashCode() {
        return this.namesAndValues.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("HttpHeaders(namesAndValues=", ")", this.namesAndValues);
    }

    public HttpHeaders(List list) {
        list.getClass();
        this.namesAndValues = list;
    }
}

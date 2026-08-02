package com.squareup.protos.cash.semaphore.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetOnboardingConfigRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetOnboardingConfigRequest> CREATOR;
    public final Country device_locale_country;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Country device_locale_country;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetOnboardingConfigRequest(this.device_locale_country, buildUnknownFields());
                default:
                    return new SubmitFormRequest.ElementResult.CountrySelectorResult(this.device_locale_country, buildUnknownFields());
            }
        }
    }

    static {
        GetOnboardingConfigRequest$Companion$ADAPTER$1 getOnboardingConfigRequest$Companion$ADAPTER$1 = new GetOnboardingConfigRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetOnboardingConfigRequest.class), "type.googleapis.com/squareup.cash.semaphore.api.GetOnboardingConfigRequest", Syntax.PROTO_2, null, "squareup/cash/semaphore/api/GetOnboardingConfig.proto");
        ADAPTER = getOnboardingConfigRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getOnboardingConfigRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOnboardingConfigRequest(Country country, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_locale_country = country;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetOnboardingConfigRequest)) {
            return false;
        }
        GetOnboardingConfigRequest getOnboardingConfigRequest = (GetOnboardingConfigRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getOnboardingConfigRequest.unknownFields()) && this.device_locale_country == getOnboardingConfigRequest.device_locale_country;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Country country = this.device_locale_country;
        int hashCode2 = hashCode + (country != null ? country.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.device_locale_country = this.device_locale_country;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Country country = this.device_locale_country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("device_locale_country=", country, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOnboardingConfigRequest{", "}", 0, null, null, 56);
    }
}

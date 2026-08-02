package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashcustomerprofile/api/v1/GetLocaleConsentAcceptanceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/ResponseMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetLocaleConsentAcceptanceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLocaleConsentAcceptanceResponse> CREATOR;
    public final LanguageDisclosure language_disclosure;
    public final List language_disclosures;

    static {
        GetLocaleConsentAcceptanceResponse$Companion$ADAPTER$1 getLocaleConsentAcceptanceResponse$Companion$ADAPTER$1 = new GetLocaleConsentAcceptanceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLocaleConsentAcceptanceResponse.class), "type.googleapis.com/squareup.cash.cashcustomerprofile.api.v1.GetLocaleConsentAcceptanceResponse", Syntax.PROTO_2, null, "squareup/cash/cashcustomerprofile/api/v1/get_locale_consent_acceptance.proto");
        ADAPTER = getLocaleConsentAcceptanceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getLocaleConsentAcceptanceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLocaleConsentAcceptanceResponse(List list, LanguageDisclosure languageDisclosure, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.language_disclosure = languageDisclosure;
        this.language_disclosures = TransactorKt.immutableCopyOf("language_disclosures", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLocaleConsentAcceptanceResponse)) {
            return false;
        }
        GetLocaleConsentAcceptanceResponse getLocaleConsentAcceptanceResponse = (GetLocaleConsentAcceptanceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getLocaleConsentAcceptanceResponse.unknownFields()) && Intrinsics.areEqual(this.language_disclosures, getLocaleConsentAcceptanceResponse.language_disclosures) && Intrinsics.areEqual(this.language_disclosure, getLocaleConsentAcceptanceResponse.language_disclosure);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.language_disclosures);
        LanguageDisclosure languageDisclosure = this.language_disclosure;
        int hashCode = m + (languageDisclosure != null ? languageDisclosure.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(18);
        builder.errors = this.language_disclosures;
        builder.result = this.language_disclosure;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.language_disclosures;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("language_disclosures=", arrayList, list);
        }
        LanguageDisclosure languageDisclosure = this.language_disclosure;
        if (languageDisclosure != null) {
            arrayList.add("language_disclosure=" + languageDisclosure);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLocaleConsentAcceptanceResponse{", "}", 0, null, null, 56);
    }
}

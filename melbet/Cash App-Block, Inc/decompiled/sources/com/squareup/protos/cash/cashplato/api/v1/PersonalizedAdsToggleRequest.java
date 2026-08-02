package com.squareup.protos.cash.cashplato.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PersonalizedAdsToggleRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizedAdsToggleRequest> CREATOR;
    public final CopyParameters copy_parameters;
    public final OptType opt_type;

    public enum OptType implements WireEnum {
        OPT_TYPE_UNSPECIFIED(0),
        OPT_TYPE_OPT_IN(1),
        OPT_TYPE_OPT_OUT(2);

        public static final PersonalizedAdsToggleRequest$OptType$Companion$ADAPTER$1 ADAPTER;
        public static final ImageLayout.Companion Companion;
        public final int value;

        static {
            OptType optType = OPT_TYPE_UNSPECIFIED;
            Companion = new ImageLayout.Companion();
            ADAPTER = new PersonalizedAdsToggleRequest$OptType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OptType.class), Syntax.PROTO_2, optType);
        }

        OptType(int i) {
            this.value = i;
        }

        public static final OptType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return OPT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPT_TYPE_OPT_IN;
            }
            if (i != 2) {
                return null;
            }
            return OPT_TYPE_OPT_OUT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PersonalizedAdsToggleRequest$Companion$ADAPTER$1 personalizedAdsToggleRequest$Companion$ADAPTER$1 = new PersonalizedAdsToggleRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PersonalizedAdsToggleRequest.class), "type.googleapis.com/squareup.cash.cashplato.api.v1.PersonalizedAdsToggleRequest", Syntax.PROTO_2, null, "squareup/cash/cashplato/api/v1/cash_plato_service.proto");
        ADAPTER = personalizedAdsToggleRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(personalizedAdsToggleRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizedAdsToggleRequest(CopyParameters copyParameters, OptType optType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.copy_parameters = copyParameters;
        this.opt_type = optType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizedAdsToggleRequest)) {
            return false;
        }
        PersonalizedAdsToggleRequest personalizedAdsToggleRequest = (PersonalizedAdsToggleRequest) obj;
        return Intrinsics.areEqual(unknownFields(), personalizedAdsToggleRequest.unknownFields()) && Intrinsics.areEqual(this.copy_parameters, personalizedAdsToggleRequest.copy_parameters) && this.opt_type == personalizedAdsToggleRequest.opt_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CopyParameters copyParameters = this.copy_parameters;
        int hashCode2 = (hashCode + (copyParameters != null ? copyParameters.hashCode() : 0)) * 37;
        OptType optType = this.opt_type;
        int hashCode3 = hashCode2 + (optType != null ? optType.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(6);
        builder.image_url = this.copy_parameters;
        builder.asset = this.opt_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CopyParameters copyParameters = this.copy_parameters;
        if (copyParameters != null) {
            arrayList.add("copy_parameters=" + copyParameters);
        }
        OptType optType = this.opt_type;
        if (optType != null) {
            arrayList.add("opt_type=" + optType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizedAdsToggleRequest{", "}", 0, null, null, 56);
    }
}

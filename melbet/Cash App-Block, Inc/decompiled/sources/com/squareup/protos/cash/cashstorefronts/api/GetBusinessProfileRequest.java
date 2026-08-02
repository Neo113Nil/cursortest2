package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileRequest;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetBusinessProfileRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBusinessProfileRequest> CREATOR;
    public final List afterpay_store_ids;
    public final List identifiers;
    public final List included_profile_fields;
    public final List merchantein_parent_tokens;
    public final List tokens;

    /* loaded from: classes7.dex */
    public enum ProfileField implements WireEnum {
        UNKNOWN_FIELD(0),
        BUSINESS_STATUSES(1),
        FEATURES(2),
        BUSINESS_METADATA(3),
        IMAGE_ASSETS(4);

        public static final GetBusinessProfileRequest$ProfileField$Companion$ADAPTER$1 ADAPTER;
        public static final RadioType.Companion Companion;
        public final int value;

        static {
            ProfileField profileField = UNKNOWN_FIELD;
            Companion = new RadioType.Companion();
            ADAPTER = new GetBusinessProfileRequest$ProfileField$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProfileField.class), Syntax.PROTO_2, profileField);
        }

        ProfileField(int i) {
            this.value = i;
        }

        public static final ProfileField fromValue(int i) {
            Companion.getClass();
            return RadioType.Companion.m3851fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetBusinessProfileRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetBusinessProfileRequest(m, arrayList, arrayList2, arrayList3, arrayList4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 4) {
                        try {
                            GetBusinessProfileRequest.ProfileField.ADAPTER.tryDecode(protoReader, arrayList4);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 5) {
                        arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList3.add(Identifier.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetBusinessProfileRequest getBusinessProfileRequest = (GetBusinessProfileRequest) obj;
                reverseProtoWriter.getClass();
                getBusinessProfileRequest.getClass();
                reverseProtoWriter.writeBytes(getBusinessProfileRequest.unknownFields());
                GetBusinessProfileRequest.ProfileField.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getBusinessProfileRequest.included_profile_fields);
                Identifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, getBusinessProfileRequest.identifiers);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, getBusinessProfileRequest.merchantein_parent_tokens);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, getBusinessProfileRequest.afterpay_store_ids);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, getBusinessProfileRequest.tokens);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetBusinessProfileRequest getBusinessProfileRequest = (GetBusinessProfileRequest) obj;
                getBusinessProfileRequest.getClass();
                int size$okio = getBusinessProfileRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return GetBusinessProfileRequest.ProfileField.ADAPTER.asRepeated().encodedSizeWithTag(4, getBusinessProfileRequest.included_profile_fields) + Identifier.ADAPTER.asRepeated().encodedSizeWithTag(6, getBusinessProfileRequest.identifiers) + protoAdapter2.asRepeated().encodedSizeWithTag(5, getBusinessProfileRequest.merchantein_parent_tokens) + protoAdapter2.asRepeated().encodedSizeWithTag(3, getBusinessProfileRequest.afterpay_store_ids) + protoAdapter2.asRepeated().encodedSizeWithTag(2, getBusinessProfileRequest.tokens) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetBusinessProfileRequest getBusinessProfileRequest = (GetBusinessProfileRequest) obj;
                getBusinessProfileRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(getBusinessProfileRequest.identifiers, Identifier.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                List list = getBusinessProfileRequest.tokens;
                List list2 = getBusinessProfileRequest.afterpay_store_ids;
                List list3 = getBusinessProfileRequest.merchantein_parent_tokens;
                List list4 = getBusinessProfileRequest.included_profile_fields;
                list.getClass();
                list2.getClass();
                list3.getClass();
                list4.getClass();
                byteString.getClass();
                return new GetBusinessProfileRequest(list, list2, list3, m1169redactElements, list4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetBusinessProfileRequest getBusinessProfileRequest = (GetBusinessProfileRequest) obj;
                getBusinessProfileRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, getBusinessProfileRequest.tokens);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, getBusinessProfileRequest.afterpay_store_ids);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, getBusinessProfileRequest.merchantein_parent_tokens);
                Identifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, getBusinessProfileRequest.identifiers);
                GetBusinessProfileRequest.ProfileField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getBusinessProfileRequest.included_profile_fields);
                protoWriter.writeBytes(getBusinessProfileRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBusinessProfileRequest(List list, List list2, List list3, List list4, List list5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        byteString.getClass();
        this.tokens = TransactorKt.immutableCopyOf("tokens", list);
        this.afterpay_store_ids = TransactorKt.immutableCopyOf("afterpay_store_ids", list2);
        this.merchantein_parent_tokens = TransactorKt.immutableCopyOf("merchantein_parent_tokens", list3);
        this.identifiers = TransactorKt.immutableCopyOf("identifiers", list4);
        this.included_profile_fields = TransactorKt.immutableCopyOf("included_profile_fields", list5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBusinessProfileRequest)) {
            return false;
        }
        GetBusinessProfileRequest getBusinessProfileRequest = (GetBusinessProfileRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getBusinessProfileRequest.unknownFields()) && Intrinsics.areEqual(this.tokens, getBusinessProfileRequest.tokens) && Intrinsics.areEqual(this.afterpay_store_ids, getBusinessProfileRequest.afterpay_store_ids) && Intrinsics.areEqual(this.merchantein_parent_tokens, getBusinessProfileRequest.merchantein_parent_tokens) && Intrinsics.areEqual(this.identifiers, getBusinessProfileRequest.identifiers) && Intrinsics.areEqual(this.included_profile_fields, getBusinessProfileRequest.included_profile_fields);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.included_profile_fields.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.tokens), 37, this.afterpay_store_ids), 37, this.merchantein_parent_tokens), 37, this.identifiers);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(14);
        builder.customer_token = this.tokens;
        builder.account_token = this.afterpay_store_ids;
        builder.display_name = this.merchantein_parent_tokens;
        builder.account_type = this.identifiers;
        builder.is_sponsored_account = this.included_profile_fields;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tokens=", arrayList, list);
        }
        List list2 = this.afterpay_store_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("afterpay_store_ids=", arrayList, list2);
        }
        List list3 = this.merchantein_parent_tokens;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("merchantein_parent_tokens=", arrayList, list3);
        }
        List list4 = this.identifiers;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("identifiers=", arrayList, list4);
        }
        List list5 = this.included_profile_fields;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("included_profile_fields=", arrayList, list5);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBusinessProfileRequest{", "}", 0, null, null, 56);
    }
}

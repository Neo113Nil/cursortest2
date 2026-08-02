package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/GetStaffBrandDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetStaffBrandDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetStaffBrandDetailsResponse> CREATOR;
    public final Map brand_details;
    public final LocalErrorResponse error_response;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetStaffBrandDetailsResponse.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.GetStaffBrandDetailsResponse$Companion$ADAPTER$1
            public final Lazy brand_detailsAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.brand_detailsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(17));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetStaffBrandDetailsResponse(m, (LocalErrorResponse) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.putAll((Map) ((ProtoAdapter) this.brand_detailsAdapter$delegate.getValue()).decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetStaffBrandDetailsResponse getStaffBrandDetailsResponse = (GetStaffBrandDetailsResponse) obj;
                reverseProtoWriter.getClass();
                getStaffBrandDetailsResponse.getClass();
                reverseProtoWriter.writeBytes(getStaffBrandDetailsResponse.unknownFields());
                LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getStaffBrandDetailsResponse.error_response);
                ((ProtoAdapter) this.brand_detailsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 1, getStaffBrandDetailsResponse.brand_details);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetStaffBrandDetailsResponse getStaffBrandDetailsResponse = (GetStaffBrandDetailsResponse) obj;
                getStaffBrandDetailsResponse.getClass();
                return LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, getStaffBrandDetailsResponse.error_response) + ((ProtoAdapter) this.brand_detailsAdapter$delegate.getValue()).encodedSizeWithTag(1, getStaffBrandDetailsResponse.brand_details) + getStaffBrandDetailsResponse.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetStaffBrandDetailsResponse getStaffBrandDetailsResponse = (GetStaffBrandDetailsResponse) obj;
                getStaffBrandDetailsResponse.getClass();
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(getStaffBrandDetailsResponse.brand_details, StaffBrandDetails.ADAPTER);
                LocalErrorResponse localErrorResponse = getStaffBrandDetailsResponse.error_response;
                LocalErrorResponse localErrorResponse2 = localErrorResponse != null ? (LocalErrorResponse) LocalErrorResponse.ADAPTER.redact(localErrorResponse) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetStaffBrandDetailsResponse(m1170redactElements, localErrorResponse2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetStaffBrandDetailsResponse getStaffBrandDetailsResponse = (GetStaffBrandDetailsResponse) obj;
                getStaffBrandDetailsResponse.getClass();
                ((ProtoAdapter) this.brand_detailsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 1, getStaffBrandDetailsResponse.brand_details);
                LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, getStaffBrandDetailsResponse.error_response);
                protoWriter.writeBytes(getStaffBrandDetailsResponse.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStaffBrandDetailsResponse(Map map, LocalErrorResponse localErrorResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.error_response = localErrorResponse;
        this.brand_details = TransactorKt.immutableCopyOf("brand_details", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStaffBrandDetailsResponse)) {
            return false;
        }
        GetStaffBrandDetailsResponse getStaffBrandDetailsResponse = (GetStaffBrandDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getStaffBrandDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.brand_details, getStaffBrandDetailsResponse.brand_details) && Intrinsics.areEqual(this.error_response, getStaffBrandDetailsResponse.error_response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(unknownFields().hashCode() * 37, this.brand_details, 37);
        LocalErrorResponse localErrorResponse = this.error_response;
        int hashCode = m + (localErrorResponse != null ? localErrorResponse.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(26);
        EmptyMap.INSTANCE.getClass();
        builder.card_type = this.brand_details;
        builder.card_pii = this.error_response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map map = this.brand_details;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("brand_details=", map, arrayList);
        }
        LocalErrorResponse localErrorResponse = this.error_response;
        if (localErrorResponse != null) {
            arrayList.add("error_response=" + localErrorResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetStaffBrandDetailsResponse{", "}", 0, null, null, 56);
    }
}

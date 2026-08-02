package com.squareup.protos.cash.customersurveyor.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SubmitSupportSurveyRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitSupportSurveyRequest> CREATOR;
    public final String free_text_response;
    public final Integer rating;
    public final Boolean resolution_response;
    public final Integer satisfaction;
    public final List selected_reasons;
    public final String survey_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitSupportSurveyRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.customersurveyor.app.SubmitSupportSurveyRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitSupportSurveyRequest((String) obj, (Boolean) obj2, (Integer) obj3, m, (String) obj4, (Integer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitSupportSurveyRequest submitSupportSurveyRequest = (SubmitSupportSurveyRequest) obj;
                reverseProtoWriter.getClass();
                submitSupportSurveyRequest.getClass();
                reverseProtoWriter.writeBytes(submitSupportSurveyRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, submitSupportSurveyRequest.satisfaction);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 5, submitSupportSurveyRequest.free_text_response);
                protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 4, submitSupportSurveyRequest.selected_reasons);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, submitSupportSurveyRequest.rating);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, submitSupportSurveyRequest.resolution_response);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, submitSupportSurveyRequest.survey_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitSupportSurveyRequest submitSupportSurveyRequest = (SubmitSupportSurveyRequest) obj;
                submitSupportSurveyRequest.getClass();
                int size$okio = submitSupportSurveyRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, submitSupportSurveyRequest.resolution_response) + protoAdapter2.encodedSizeWithTag(1, submitSupportSurveyRequest.survey_token) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                return protoAdapter3.encodedSizeWithTag(6, submitSupportSurveyRequest.satisfaction) + protoAdapter2.encodedSizeWithTag(5, submitSupportSurveyRequest.free_text_response) + protoAdapter2.asRepeated().encodedSizeWithTag(4, submitSupportSurveyRequest.selected_reasons) + protoAdapter3.encodedSizeWithTag(3, submitSupportSurveyRequest.rating) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitSupportSurveyRequest submitSupportSurveyRequest = (SubmitSupportSurveyRequest) obj;
                submitSupportSurveyRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = submitSupportSurveyRequest.survey_token;
                Boolean bool = submitSupportSurveyRequest.resolution_response;
                Integer num = submitSupportSurveyRequest.rating;
                List list = submitSupportSurveyRequest.selected_reasons;
                Integer num2 = submitSupportSurveyRequest.satisfaction;
                list.getClass();
                byteString.getClass();
                return new SubmitSupportSurveyRequest(str, bool, num, list, null, num2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitSupportSurveyRequest submitSupportSurveyRequest = (SubmitSupportSurveyRequest) obj;
                submitSupportSurveyRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, submitSupportSurveyRequest.survey_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, submitSupportSurveyRequest.resolution_response);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(protoWriter, 3, submitSupportSurveyRequest.rating);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, submitSupportSurveyRequest.selected_reasons);
                protoAdapter2.encodeWithTag(protoWriter, 5, submitSupportSurveyRequest.free_text_response);
                protoAdapter3.encodeWithTag(protoWriter, 6, submitSupportSurveyRequest.satisfaction);
                protoWriter.writeBytes(submitSupportSurveyRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitSupportSurveyRequest(String str, Boolean bool, Integer num, List list, String str2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.survey_token = str;
        this.resolution_response = bool;
        this.rating = num;
        this.free_text_response = str2;
        this.satisfaction = num2;
        this.selected_reasons = TransactorKt.immutableCopyOf("selected_reasons", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitSupportSurveyRequest)) {
            return false;
        }
        SubmitSupportSurveyRequest submitSupportSurveyRequest = (SubmitSupportSurveyRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitSupportSurveyRequest.unknownFields()) && Intrinsics.areEqual(this.survey_token, submitSupportSurveyRequest.survey_token) && Intrinsics.areEqual(this.resolution_response, submitSupportSurveyRequest.resolution_response) && Intrinsics.areEqual(this.rating, submitSupportSurveyRequest.rating) && Intrinsics.areEqual(this.selected_reasons, submitSupportSurveyRequest.selected_reasons) && Intrinsics.areEqual(this.free_text_response, submitSupportSurveyRequest.free_text_response) && Intrinsics.areEqual(this.satisfaction, submitSupportSurveyRequest.satisfaction);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.survey_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.resolution_response;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.rating;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.selected_reasons);
        String str2 = this.free_text_response;
        int hashCode4 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num2 = this.satisfaction;
        int hashCode5 = hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder();
        builder.slice_token = this.survey_token;
        builder.requester = this.resolution_response;
        builder.responder = this.rating;
        builder.amount = this.selected_reasons;
        builder.status = this.free_text_response;
        builder.action = this.satisfaction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.survey_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "survey_token=", arrayList);
        }
        Boolean bool = this.resolution_response;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resolution_response=", bool, arrayList);
        }
        Integer num = this.rating;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("rating=", num, arrayList);
        }
        List list = this.selected_reasons;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_reasons=", arrayList, list);
        }
        if (this.free_text_response != null) {
            arrayList.add("free_text_response=██");
        }
        Integer num2 = this.satisfaction;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("satisfaction=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitSupportSurveyRequest{", "}", 0, null, null, 56);
    }
}

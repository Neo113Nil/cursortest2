package com.squareup.protos.cash.weaver.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class DismissRecommendationCandidateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DismissRecommendationCandidateRequest> CREATOR;
    public final String generic_recommendation_name;
    public final String item_id;
    public final RecommendationType recommendation_type;
    public final String source_entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DismissRecommendationCandidateRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.weaver.api.DismissRecommendationCandidateRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DismissRecommendationCandidateRequest((String) obj, (RecommendationType) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = RecommendationType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DismissRecommendationCandidateRequest dismissRecommendationCandidateRequest = (DismissRecommendationCandidateRequest) obj;
                reverseProtoWriter.getClass();
                dismissRecommendationCandidateRequest.getClass();
                reverseProtoWriter.writeBytes(dismissRecommendationCandidateRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, dismissRecommendationCandidateRequest.item_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, dismissRecommendationCandidateRequest.generic_recommendation_name);
                RecommendationType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dismissRecommendationCandidateRequest.recommendation_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, dismissRecommendationCandidateRequest.source_entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DismissRecommendationCandidateRequest dismissRecommendationCandidateRequest = (DismissRecommendationCandidateRequest) obj;
                dismissRecommendationCandidateRequest.getClass();
                int size$okio = dismissRecommendationCandidateRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, dismissRecommendationCandidateRequest.item_id) + protoAdapter2.encodedSizeWithTag(3, dismissRecommendationCandidateRequest.generic_recommendation_name) + RecommendationType.ADAPTER.encodedSizeWithTag(2, dismissRecommendationCandidateRequest.recommendation_type) + protoAdapter2.encodedSizeWithTag(1, dismissRecommendationCandidateRequest.source_entity_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DismissRecommendationCandidateRequest dismissRecommendationCandidateRequest = (DismissRecommendationCandidateRequest) obj;
                dismissRecommendationCandidateRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = dismissRecommendationCandidateRequest.source_entity_token;
                RecommendationType recommendationType = dismissRecommendationCandidateRequest.recommendation_type;
                String str2 = dismissRecommendationCandidateRequest.generic_recommendation_name;
                String str3 = dismissRecommendationCandidateRequest.item_id;
                byteString.getClass();
                return new DismissRecommendationCandidateRequest(str, recommendationType, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DismissRecommendationCandidateRequest dismissRecommendationCandidateRequest = (DismissRecommendationCandidateRequest) obj;
                dismissRecommendationCandidateRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, dismissRecommendationCandidateRequest.source_entity_token);
                RecommendationType.ADAPTER.encodeWithTag(protoWriter, 2, dismissRecommendationCandidateRequest.recommendation_type);
                protoAdapter2.encodeWithTag(protoWriter, 3, dismissRecommendationCandidateRequest.generic_recommendation_name);
                protoAdapter2.encodeWithTag(protoWriter, 4, dismissRecommendationCandidateRequest.item_id);
                protoWriter.writeBytes(dismissRecommendationCandidateRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissRecommendationCandidateRequest(String str, RecommendationType recommendationType, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source_entity_token = str;
        this.recommendation_type = recommendationType;
        this.generic_recommendation_name = str2;
        this.item_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DismissRecommendationCandidateRequest)) {
            return false;
        }
        DismissRecommendationCandidateRequest dismissRecommendationCandidateRequest = (DismissRecommendationCandidateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), dismissRecommendationCandidateRequest.unknownFields()) && Intrinsics.areEqual(this.source_entity_token, dismissRecommendationCandidateRequest.source_entity_token) && this.recommendation_type == dismissRecommendationCandidateRequest.recommendation_type && Intrinsics.areEqual(this.generic_recommendation_name, dismissRecommendationCandidateRequest.generic_recommendation_name) && Intrinsics.areEqual(this.item_id, dismissRecommendationCandidateRequest.item_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.source_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RecommendationType recommendationType = this.recommendation_type;
        int hashCode3 = (hashCode2 + (recommendationType != null ? recommendationType.hashCode() : 0)) * 37;
        String str2 = this.generic_recommendation_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.item_id;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(6);
        builder.button_color = this.source_entity_token;
        builder.text_color = this.recommendation_type;
        builder.text = this.generic_recommendation_name;
        builder.action = this.item_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.source_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_entity_token=", arrayList);
        }
        RecommendationType recommendationType = this.recommendation_type;
        if (recommendationType != null) {
            arrayList.add("recommendation_type=" + recommendationType);
        }
        String str2 = this.generic_recommendation_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "generic_recommendation_name=", arrayList);
        }
        String str3 = this.item_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "item_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DismissRecommendationCandidateRequest{", "}", 0, null, null, 56);
    }
}

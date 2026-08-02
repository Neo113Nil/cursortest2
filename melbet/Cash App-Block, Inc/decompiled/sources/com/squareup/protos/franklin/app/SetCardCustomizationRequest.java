package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class SetCardCustomizationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCardCustomizationRequest> CREATOR;
    public final String card_theme_token;
    public final CardCustomizationData.CustomizationArea customization_area;
    public final ByteString image_bytes;
    public final Boolean include_cashtag;
    public final String mime_type;
    public final RequestContext request_context;
    public final TouchData touch_data;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public String card_theme_token;
        public CardCustomizationData.CustomizationArea customization_area;
        public ByteString image_bytes;
        public Boolean include_cashtag;
        public String mime_type;
        public RequestContext request_context;
        public TouchData touch_data;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new SetCardCustomizationRequest(this.request_context, this.image_bytes, this.mime_type, this.card_theme_token, this.touch_data, this.include_cashtag, this.customization_area, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetCardCustomizationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetCardCustomizationRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetCardCustomizationRequest((RequestContext) obj, (ByteString) obj2, (String) obj3, (String) obj4, (TouchData) obj5, (Boolean) obj6, (CardCustomizationData.CustomizationArea) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj5 = TransactorKt.decodeMessageOrMerge(TouchData.ADAPTER, protoReader, obj5);
                    } else if (nextTag == 5) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 6) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 7) {
                        obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 9) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj7 = CardCustomizationData.CustomizationArea.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetCardCustomizationRequest setCardCustomizationRequest = (SetCardCustomizationRequest) obj;
                reverseProtoWriter.getClass();
                setCardCustomizationRequest.getClass();
                reverseProtoWriter.writeBytes(setCardCustomizationRequest.unknownFields());
                CardCustomizationData.CustomizationArea.ADAPTER.encodeWithTag(reverseProtoWriter, 9, setCardCustomizationRequest.customization_area);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, setCardCustomizationRequest.include_cashtag);
                TouchData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, setCardCustomizationRequest.touch_data);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, setCardCustomizationRequest.card_theme_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, setCardCustomizationRequest.mime_type);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, setCardCustomizationRequest.image_bytes);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, setCardCustomizationRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetCardCustomizationRequest setCardCustomizationRequest = (SetCardCustomizationRequest) obj;
                setCardCustomizationRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, setCardCustomizationRequest.image_bytes) + RequestContext.ADAPTER.encodedSizeWithTag(5, setCardCustomizationRequest.request_context) + setCardCustomizationRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return CardCustomizationData.CustomizationArea.ADAPTER.encodedSizeWithTag(9, setCardCustomizationRequest.customization_area) + ProtoAdapter.BOOL.encodedSizeWithTag(7, setCardCustomizationRequest.include_cashtag) + TouchData.ADAPTER.encodedSizeWithTag(4, setCardCustomizationRequest.touch_data) + protoAdapter2.encodedSizeWithTag(6, setCardCustomizationRequest.card_theme_token) + protoAdapter2.encodedSizeWithTag(2, setCardCustomizationRequest.mime_type) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetCardCustomizationRequest setCardCustomizationRequest = (SetCardCustomizationRequest) obj;
                setCardCustomizationRequest.getClass();
                RequestContext requestContext = setCardCustomizationRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                TouchData touchData = setCardCustomizationRequest.touch_data;
                return SetCardCustomizationRequest.copy$default(setCardCustomizationRequest, requestContext2, touchData != null ? (TouchData) TouchData.ADAPTER.redact(touchData) : null, ByteString.EMPTY, 108);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetCardCustomizationRequest setCardCustomizationRequest = (SetCardCustomizationRequest) obj;
                setCardCustomizationRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 5, setCardCustomizationRequest.request_context);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, setCardCustomizationRequest.image_bytes);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, setCardCustomizationRequest.mime_type);
                protoAdapter2.encodeWithTag(protoWriter, 6, setCardCustomizationRequest.card_theme_token);
                TouchData.ADAPTER.encodeWithTag(protoWriter, 4, setCardCustomizationRequest.touch_data);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, setCardCustomizationRequest.include_cashtag);
                CardCustomizationData.CustomizationArea.ADAPTER.encodeWithTag(protoWriter, 9, setCardCustomizationRequest.customization_area);
                protoWriter.writeBytes(setCardCustomizationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCardCustomizationRequest(RequestContext requestContext, ByteString byteString, String str, String str2, TouchData touchData, Boolean bool, CardCustomizationData.CustomizationArea customizationArea, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.request_context = requestContext;
        this.image_bytes = byteString;
        this.mime_type = str;
        this.card_theme_token = str2;
        this.touch_data = touchData;
        this.include_cashtag = bool;
        this.customization_area = customizationArea;
    }

    public static SetCardCustomizationRequest copy$default(SetCardCustomizationRequest setCardCustomizationRequest, RequestContext requestContext, TouchData touchData, ByteString byteString, int i) {
        ByteString byteString2 = (i & 2) != 0 ? setCardCustomizationRequest.image_bytes : null;
        String str = setCardCustomizationRequest.mime_type;
        String str2 = setCardCustomizationRequest.card_theme_token;
        if ((i & 16) != 0) {
            touchData = setCardCustomizationRequest.touch_data;
        }
        TouchData touchData2 = touchData;
        Boolean bool = setCardCustomizationRequest.include_cashtag;
        CardCustomizationData.CustomizationArea customizationArea = setCardCustomizationRequest.customization_area;
        if ((i & 128) != 0) {
            byteString = setCardCustomizationRequest.unknownFields();
        }
        ByteString byteString3 = byteString;
        setCardCustomizationRequest.getClass();
        byteString3.getClass();
        return new SetCardCustomizationRequest(requestContext, byteString2, str, str2, touchData2, bool, customizationArea, byteString3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCardCustomizationRequest)) {
            return false;
        }
        SetCardCustomizationRequest setCardCustomizationRequest = (SetCardCustomizationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setCardCustomizationRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setCardCustomizationRequest.request_context) && Intrinsics.areEqual(this.image_bytes, setCardCustomizationRequest.image_bytes) && Intrinsics.areEqual(this.mime_type, setCardCustomizationRequest.mime_type) && Intrinsics.areEqual(this.card_theme_token, setCardCustomizationRequest.card_theme_token) && Intrinsics.areEqual(this.touch_data, setCardCustomizationRequest.touch_data) && Intrinsics.areEqual(this.include_cashtag, setCardCustomizationRequest.include_cashtag) && this.customization_area == setCardCustomizationRequest.customization_area;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ByteString byteString = this.image_bytes;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.mime_type;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.card_theme_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        TouchData touchData = this.touch_data;
        int hashCode6 = (hashCode5 + (touchData != null ? touchData.hashCode() : 0)) * 37;
        Boolean bool = this.include_cashtag;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        CardCustomizationData.CustomizationArea customizationArea = this.customization_area;
        int hashCode8 = hashCode7 + (customizationArea != null ? customizationArea.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_context = this.request_context;
        builder.image_bytes = this.image_bytes;
        builder.mime_type = this.mime_type;
        builder.card_theme_token = this.card_theme_token;
        builder.touch_data = this.touch_data;
        builder.include_cashtag = this.include_cashtag;
        builder.customization_area = this.customization_area;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.image_bytes != null) {
            arrayList.add("image_bytes=██");
        }
        String str = this.mime_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "mime_type=", arrayList);
        }
        String str2 = this.card_theme_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "card_theme_token=", arrayList);
        }
        TouchData touchData = this.touch_data;
        if (touchData != null) {
            arrayList.add("touch_data=" + touchData);
        }
        Boolean bool = this.include_cashtag;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_cashtag=", bool, arrayList);
        }
        CardCustomizationData.CustomizationArea customizationArea = this.customization_area;
        if (customizationArea != null) {
            arrayList.add("customization_area=" + customizationArea);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCardCustomizationRequest{", "}", 0, null, null, 56);
    }
}

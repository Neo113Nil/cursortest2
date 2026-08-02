package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AnalyticsEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnalyticsEvent> CREATOR;
    public final List client_generated_params;
    public final Map event_attributes;
    public final String event_name;

    public final class ClientGeneratedParam extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientGeneratedParam> CREATOR;
        public final String name;

        /* renamed from: type, reason: collision with root package name */
        public final ParamType f1336type;

        static {
            AnalyticsEvent$ClientGeneratedParam$Companion$ADAPTER$1 analyticsEvent$ClientGeneratedParam$Companion$ADAPTER$1 = new AnalyticsEvent$ClientGeneratedParam$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientGeneratedParam.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AnalyticsEvent.ClientGeneratedParam", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/AnalyticEvents.proto");
            ADAPTER = analyticsEvent$ClientGeneratedParam$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(analyticsEvent$ClientGeneratedParam$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientGeneratedParam(String str, ParamType paramType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.f1336type = paramType;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientGeneratedParam)) {
                return false;
            }
            ClientGeneratedParam clientGeneratedParam = (ClientGeneratedParam) obj;
            return Intrinsics.areEqual(unknownFields(), clientGeneratedParam.unknownFields()) && Intrinsics.areEqual(this.name, clientGeneratedParam.name) && this.f1336type == clientGeneratedParam.f1336type;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ParamType paramType = this.f1336type;
            int hashCode3 = hashCode2 + (paramType != null ? paramType.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SplitButtons.Builder builder = new SplitButtons.Builder(3);
            builder.primary_button = this.name;
            builder.secondary_button = this.f1336type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            ParamType paramType = this.f1336type;
            if (paramType != null) {
                arrayList.add("type=" + paramType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientGeneratedParam{", "}", 0, null, null, 56);
        }
    }

    public enum ParamType implements WireEnum {
        BROWSE_FLOW_TOKEN(1),
        REFERRER_FLOW_TOKEN(2),
        SOURCE_SECTION(3),
        SOURCE_CATEGORY(4),
        SEARCH_FLOW_TOKEN(5),
        SOURCE_SCREEN(6),
        ORIGIN(7),
        CURRENT_OFFER_TOKEN(8),
        CURRENT_BUSINESS_TOKEN(9),
        CURRENT_BUSINESS_NAME(10),
        BROWSER_SESSION_TOKEN(11),
        MARKETING_SOURCE(12),
        MARKETING_UTM(13),
        APP_LOCATION(14),
        DISMISS_ORIGIN(15),
        SEARCH_TEXT(16),
        FILTERS(17),
        UPDATE_TYPE(18),
        PLASMA_FLOW_TOKEN(19),
        SHOP_FLOW_TOKEN(20),
        FILTERS_SELECTED(21),
        CARD_PLASMA_FLOW_TOKEN(22),
        BUTTON_TYPE(23),
        QUERY_TOKEN(24),
        AFTERPAY_APPLET_FLOW_TOKEN(25),
        FROM_SCREEN(26),
        FROM_SECTION(27);

        public final int value;
        public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
        public static final AnalyticsEvent$ParamType$Companion$ADAPTER$1 ADAPTER = new AnalyticsEvent$ParamType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ParamType.class), Syntax.PROTO_2, null);

        ParamType(int i) {
            this.value = i;
        }

        public static final ParamType fromValue(int i) {
            Companion.getClass();
            return TaxEnvironment.Companion.m3927fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AnalyticsEvent.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent$Companion$ADAPTER$1
            public final Lazy event_attributesAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.event_attributesAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(25));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AnalyticsEvent((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        m.putAll((Map) ((ProtoAdapter) this.event_attributesAdapter$delegate.getValue()).decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(AnalyticsEvent.ClientGeneratedParam.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                reverseProtoWriter.getClass();
                analyticsEvent.getClass();
                reverseProtoWriter.writeBytes(analyticsEvent.unknownFields());
                AnalyticsEvent.ClientGeneratedParam.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, analyticsEvent.client_generated_params);
                ((ProtoAdapter) this.event_attributesAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 2, analyticsEvent.event_attributes);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, analyticsEvent.event_name);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                analyticsEvent.getClass();
                return AnalyticsEvent.ClientGeneratedParam.ADAPTER.asRepeated().encodedSizeWithTag(3, analyticsEvent.client_generated_params) + ((ProtoAdapter) this.event_attributesAdapter$delegate.getValue()).encodedSizeWithTag(2, analyticsEvent.event_attributes) + ProtoAdapter.STRING.encodedSizeWithTag(1, analyticsEvent.event_name) + analyticsEvent.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                analyticsEvent.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(analyticsEvent.client_generated_params, AnalyticsEvent.ClientGeneratedParam.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = analyticsEvent.event_name;
                Map map = analyticsEvent.event_attributes;
                map.getClass();
                byteString.getClass();
                return new AnalyticsEvent(str, map, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                analyticsEvent.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, analyticsEvent.event_name);
                ((ProtoAdapter) this.event_attributesAdapter$delegate.getValue()).encodeWithTag(protoWriter, 2, analyticsEvent.event_attributes);
                AnalyticsEvent.ClientGeneratedParam.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, analyticsEvent.client_generated_params);
                protoWriter.writeBytes(analyticsEvent.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsEvent(String str, Map map, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        list.getClass();
        byteString.getClass();
        this.event_name = str;
        this.event_attributes = TransactorKt.immutableCopyOf("event_attributes", map);
        this.client_generated_params = TransactorKt.immutableCopyOf("client_generated_params", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        return Intrinsics.areEqual(unknownFields(), analyticsEvent.unknownFields()) && Intrinsics.areEqual(this.event_name, analyticsEvent.event_name) && Intrinsics.areEqual(this.event_attributes, analyticsEvent.event_attributes) && Intrinsics.areEqual(this.client_generated_params, analyticsEvent.client_generated_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.event_name;
        int hashCode2 = this.client_generated_params.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, this.event_attributes, 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(17);
        EmptyMap.INSTANCE.getClass();
        builder.overflow_modules = this.event_name;
        builder.card_home_actions = this.event_attributes;
        builder.modules = this.client_generated_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.event_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "event_name=", arrayList);
        }
        Map map = this.event_attributes;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("event_attributes=", map, arrayList);
        }
        List list = this.client_generated_params;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_generated_params=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsEvent{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnalyticsEvent(String str, Map map, int i) {
        this(str, map, EmptyList.INSTANCE, ByteString.EMPTY);
        if ((i & 2) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
    }
}

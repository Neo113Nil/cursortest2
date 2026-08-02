package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Action;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AnalyticsEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnalyticsEvent> CREATOR;
    public final String name;
    public final Map parameters;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AnalyticsEvent.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.genericelements.ui.AnalyticsEvent$Companion$ADAPTER$1
            public final Lazy parametersAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.parametersAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(6));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AnalyticsEvent((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.putAll((Map) ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                reverseProtoWriter.getClass();
                analyticsEvent.getClass();
                reverseProtoWriter.writeBytes(analyticsEvent.unknownFields());
                ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 2, analyticsEvent.parameters);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, analyticsEvent.name);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                analyticsEvent.getClass();
                return ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodedSizeWithTag(2, analyticsEvent.parameters) + ProtoAdapter.STRING.encodedSizeWithTag(1, analyticsEvent.name) + analyticsEvent.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                analyticsEvent.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = analyticsEvent.name;
                Map map = analyticsEvent.parameters;
                map.getClass();
                byteString.getClass();
                return new AnalyticsEvent(str, map, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
                analyticsEvent.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, analyticsEvent.name);
                ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodeWithTag(protoWriter, 2, analyticsEvent.parameters);
                protoWriter.writeBytes(analyticsEvent.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsEvent(String str, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.name = str;
        this.parameters = TransactorKt.immutableCopyOf("parameters", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        return Intrinsics.areEqual(unknownFields(), analyticsEvent.unknownFields()) && Intrinsics.areEqual(this.name, analyticsEvent.name) && Intrinsics.areEqual(this.parameters, analyticsEvent.parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = this.parameters.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(18);
        EmptyMap.INSTANCE.getClass();
        builder.f1268type = this.name;
        builder.details = this.parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        Map map = this.parameters;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("parameters=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsEvent{", "}", 0, null, null, 56);
    }
}

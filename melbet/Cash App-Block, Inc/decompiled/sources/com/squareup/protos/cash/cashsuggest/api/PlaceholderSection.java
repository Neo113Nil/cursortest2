package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.PlaceholderSection;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.grantly.api.Channel;
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
public final class PlaceholderSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlaceholderSection> CREATOR;
    public final Identifier identifier;
    public final Map render_data;

    public enum Identifier implements WireEnum {
        CLIENT_SUGGESTIONS(1),
        CONTACTS_ON_CASH(2),
        CONTACTS_OFF_CASH(3),
        CARD_BOOSTS(4);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final PlaceholderSection$Identifier$Companion$ADAPTER$1 ADAPTER = new PlaceholderSection$Identifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Identifier.class), Syntax.PROTO_2, null);

        Identifier(int i) {
            this.value = i;
        }

        public static final Identifier fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return CLIENT_SUGGESTIONS;
            }
            if (i == 2) {
                return CONTACTS_ON_CASH;
            }
            if (i == 3) {
                return CONTACTS_OFF_CASH;
            }
            if (i != 4) {
                return null;
            }
            return CARD_BOOSTS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlaceholderSection.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsuggest.api.PlaceholderSection$Companion$ADAPTER$1
            public final Lazy render_dataAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.render_dataAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new PlaceholderSection((PlaceholderSection.Identifier) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = PlaceholderSection.Identifier.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.putAll((Map) ((ProtoAdapter) this.render_dataAdapter$delegate.getValue()).decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PlaceholderSection placeholderSection = (PlaceholderSection) obj;
                reverseProtoWriter.getClass();
                placeholderSection.getClass();
                reverseProtoWriter.writeBytes(placeholderSection.unknownFields());
                ((ProtoAdapter) this.render_dataAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 2, placeholderSection.render_data);
                PlaceholderSection.Identifier.ADAPTER.encodeWithTag(reverseProtoWriter, 1, placeholderSection.identifier);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                PlaceholderSection placeholderSection = (PlaceholderSection) obj;
                placeholderSection.getClass();
                return ((ProtoAdapter) this.render_dataAdapter$delegate.getValue()).encodedSizeWithTag(2, placeholderSection.render_data) + PlaceholderSection.Identifier.ADAPTER.encodedSizeWithTag(1, placeholderSection.identifier) + placeholderSection.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PlaceholderSection placeholderSection = (PlaceholderSection) obj;
                placeholderSection.getClass();
                ByteString byteString = ByteString.EMPTY;
                PlaceholderSection.Identifier identifier = placeholderSection.identifier;
                Map map = placeholderSection.render_data;
                map.getClass();
                byteString.getClass();
                return new PlaceholderSection(identifier, map, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PlaceholderSection placeholderSection = (PlaceholderSection) obj;
                placeholderSection.getClass();
                PlaceholderSection.Identifier.ADAPTER.encodeWithTag(protoWriter, 1, placeholderSection.identifier);
                ((ProtoAdapter) this.render_dataAdapter$delegate.getValue()).encodeWithTag(protoWriter, 2, placeholderSection.render_data);
                protoWriter.writeBytes(placeholderSection.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderSection(Identifier identifier, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.identifier = identifier;
        this.render_data = TransactorKt.immutableCopyOf("render_data", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceholderSection)) {
            return false;
        }
        PlaceholderSection placeholderSection = (PlaceholderSection) obj;
        return Intrinsics.areEqual(unknownFields(), placeholderSection.unknownFields()) && this.identifier == placeholderSection.identifier && Intrinsics.areEqual(this.render_data, placeholderSection.render_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Identifier identifier = this.identifier;
        int hashCode2 = this.render_data.hashCode() + ((hashCode + (identifier != null ? identifier.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(22);
        EmptyMap.INSTANCE.getClass();
        builder.image_url = this.identifier;
        builder.asset = this.render_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Identifier identifier = this.identifier;
        if (identifier != null) {
            arrayList.add("identifier=" + identifier);
        }
        Map map = this.render_data;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("render_data=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaceholderSection{", "}", 0, null, null, 56);
    }
}

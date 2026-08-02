package com.squareup.protos.franklin.cards;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f\u001e R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$Builder;", "Lcom/squareup/protos/franklin/cards/CardTheme;", "card_theme", "Lcom/squareup/protos/franklin/cards/CardTheme;", "Lcom/squareup/protos/franklin/cards/TouchData;", "touch_data", "Lcom/squareup/protos/franklin/cards/TouchData;", "", "show_cashtag", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "customization_area", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "is_2d", "is_2d$annotations", "()V", "Lcom/squareup/protos/franklin/api/CardPresentationStyle;", "card_presentation_style", "Lcom/squareup/protos/franklin/api/CardPresentationStyle;", "", "formatted_cashtag", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/cards/PaymentMethod;", "payment_method", "Lcom/squareup/protos/franklin/cards/PaymentMethod;", "Lokio/ByteString;", "image_bytes", "Lokio/ByteString;", "Companion", "Builder", "CustomizationArea", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardCustomizationData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardCustomizationData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.CardPresentationStyle#ADAPTER", schemaIndex = 5, tag = 6)
    public final CardPresentationStyle card_presentation_style;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme#ADAPTER", schemaIndex = 0, tag = 1)
    public final CardTheme card_theme;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardCustomizationData$CustomizationArea#ADAPTER", schemaIndex = 3, tag = 4)
    public final CustomizationArea customization_area;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 7)
    public final String formatted_cashtag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", redacted = true, schemaIndex = 8, tag = 9)
    public final ByteString image_bytes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean is_2d;

    @WireField(adapter = "com.squareup.protos.franklin.cards.PaymentMethod#ADAPTER", schemaIndex = 7, tag = 8)
    public final PaymentMethod payment_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean show_cashtag;

    @WireField(adapter = "com.squareup.protos.franklin.cards.TouchData#ADAPTER", redacted = true, schemaIndex = 1, tag = 2)
    public final TouchData touch_data;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0017J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/CardCustomizationData;", "<init>", "()V", "card_theme", "Lcom/squareup/protos/franklin/cards/CardTheme;", "touch_data", "Lcom/squareup/protos/franklin/cards/TouchData;", "show_cashtag", "", "Ljava/lang/Boolean;", "customization_area", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "is_2d", "card_presentation_style", "Lcom/squareup/protos/franklin/api/CardPresentationStyle;", "formatted_cashtag", "", "payment_method", "Lcom/squareup/protos/franklin/cards/PaymentMethod;", "image_bytes", "Lokio/ByteString;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/cards/CardCustomizationData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public CardPresentationStyle card_presentation_style;
        public CardTheme card_theme;
        public CustomizationArea customization_area;
        public String formatted_cashtag;
        public ByteString image_bytes;
        public Boolean is_2d;
        public PaymentMethod payment_method;
        public Boolean show_cashtag;
        public TouchData touch_data;

        @Override // com.squareup.wire.Message.Builder
        public CardCustomizationData build() {
            return new CardCustomizationData(this.card_theme, this.touch_data, this.show_cashtag, this.customization_area, this.is_2d, this.card_presentation_style, this.formatted_cashtag, this.payment_method, this.image_bytes, buildUnknownFields());
        }

        public final Builder card_presentation_style(CardPresentationStyle card_presentation_style) {
            this.card_presentation_style = card_presentation_style;
            return this;
        }

        public final Builder card_theme(CardTheme card_theme) {
            this.card_theme = card_theme;
            return this;
        }

        public final Builder customization_area(CustomizationArea customization_area) {
            this.customization_area = customization_area;
            return this;
        }

        public final Builder formatted_cashtag(String formatted_cashtag) {
            this.formatted_cashtag = formatted_cashtag;
            return this;
        }

        public final Builder image_bytes(ByteString image_bytes) {
            this.image_bytes = image_bytes;
            return this;
        }

        @Deprecated
        public final Builder is_2d(Boolean is_2d) {
            this.is_2d = is_2d;
            return this;
        }

        public final Builder payment_method(PaymentMethod payment_method) {
            this.payment_method = payment_method;
            return this;
        }

        public final Builder show_cashtag(Boolean show_cashtag) {
            this.show_cashtag = show_cashtag;
            return this;
        }

        public final Builder touch_data(TouchData touch_data) {
            this.touch_data = touch_data;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardCustomizationData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardCustomizationData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CardCustomizationData decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                Object obj3;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CardCustomizationData((CardTheme) obj4, (TouchData) obj5, (Boolean) obj6, (CardCustomizationData.CustomizationArea) obj7, (Boolean) obj8, (CardPresentationStyle) obj9, (String) obj10, (PaymentMethod) obj11, (ByteString) obj12, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj4 = TransactorKt.decodeMessageOrMerge(CardTheme.ADAPTER, reader, obj4);
                            break;
                        case 2:
                            obj5 = TransactorKt.decodeMessageOrMerge(TouchData.ADAPTER, reader, obj5);
                            break;
                        case 3:
                            obj6 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 4:
                            obj = obj6;
                            obj2 = obj7;
                            obj3 = obj8;
                            try {
                                obj6 = obj;
                                obj7 = CardCustomizationData.CustomizationArea.ADAPTER.decode(reader);
                                obj8 = obj3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj8 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            obj = obj6;
                            obj2 = obj7;
                            try {
                                obj6 = obj;
                                obj9 = CardPresentationStyle.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj3 = obj8;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            obj7 = obj2;
                            break;
                        case 7:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            try {
                                obj11 = PaymentMethod.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                obj = obj6;
                                obj2 = obj7;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 9:
                            obj12 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj6;
                            obj2 = obj7;
                            obj3 = obj8;
                            obj6 = obj;
                            obj8 = obj3;
                            obj7 = obj2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CardCustomizationData value) {
                writer.getClass();
                value.getClass();
                CardTheme.ADAPTER.encodeWithTag(writer, 1, value.card_theme);
                TouchData.ADAPTER.encodeWithTag(writer, 2, value.touch_data);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 3, value.show_cashtag);
                CardCustomizationData.CustomizationArea.ADAPTER.encodeWithTag(writer, 4, value.customization_area);
                protoAdapter2.encodeWithTag(writer, 5, value.is_2d);
                CardPresentationStyle.ADAPTER.encodeWithTag(writer, 6, value.card_presentation_style);
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.formatted_cashtag);
                PaymentMethod.ADAPTER.encodeWithTag(writer, 8, value.payment_method);
                ProtoAdapter.BYTES.encodeWithTag(writer, 9, value.image_bytes);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CardCustomizationData value) {
                value.getClass();
                int encodedSizeWithTag = TouchData.ADAPTER.encodedSizeWithTag(2, value.touch_data) + CardTheme.ADAPTER.encodedSizeWithTag(1, value.card_theme) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return ProtoAdapter.BYTES.encodedSizeWithTag(9, value.image_bytes) + PaymentMethod.ADAPTER.encodedSizeWithTag(8, value.payment_method) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.formatted_cashtag) + CardPresentationStyle.ADAPTER.encodedSizeWithTag(6, value.card_presentation_style) + protoAdapter2.encodedSizeWithTag(5, value.is_2d) + CardCustomizationData.CustomizationArea.ADAPTER.encodedSizeWithTag(4, value.customization_area) + protoAdapter2.encodedSizeWithTag(3, value.show_cashtag) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CardCustomizationData redact(CardCustomizationData value) {
                value.getClass();
                CardTheme cardTheme = value.card_theme;
                CardTheme cardTheme2 = cardTheme != null ? (CardTheme) CardTheme.ADAPTER.redact(cardTheme) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.show_cashtag;
                CardCustomizationData.CustomizationArea customizationArea = value.customization_area;
                Boolean bool2 = value.is_2d;
                CardPresentationStyle cardPresentationStyle = value.card_presentation_style;
                PaymentMethod paymentMethod = value.payment_method;
                byteString.getClass();
                return new CardCustomizationData(cardTheme2, null, bool, customizationArea, bool2, cardPresentationStyle, null, paymentMethod, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CardCustomizationData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BYTES.encodeWithTag(writer, 9, value.image_bytes);
                PaymentMethod.ADAPTER.encodeWithTag(writer, 8, value.payment_method);
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.formatted_cashtag);
                CardPresentationStyle.ADAPTER.encodeWithTag(writer, 6, value.card_presentation_style);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 5, value.is_2d);
                CardCustomizationData.CustomizationArea.ADAPTER.encodeWithTag(writer, 4, value.customization_area);
                protoAdapter2.encodeWithTag(writer, 3, value.show_cashtag);
                TouchData.ADAPTER.encodeWithTag(writer, 2, value.touch_data);
                CardTheme.ADAPTER.encodeWithTag(writer, 1, value.card_theme);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCustomizationData(CardTheme cardTheme, TouchData touchData, Boolean bool, CustomizationArea customizationArea, Boolean bool2, CardPresentationStyle cardPresentationStyle, String str, PaymentMethod paymentMethod, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.card_theme = cardTheme;
        this.touch_data = touchData;
        this.show_cashtag = bool;
        this.customization_area = customizationArea;
        this.is_2d = bool2;
        this.card_presentation_style = cardPresentationStyle;
        this.formatted_cashtag = str;
        this.payment_method = paymentMethod;
        this.image_bytes = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardCustomizationData)) {
            return false;
        }
        CardCustomizationData cardCustomizationData = (CardCustomizationData) obj;
        return Intrinsics.areEqual(unknownFields(), cardCustomizationData.unknownFields()) && Intrinsics.areEqual(this.card_theme, cardCustomizationData.card_theme) && Intrinsics.areEqual(this.touch_data, cardCustomizationData.touch_data) && Intrinsics.areEqual(this.show_cashtag, cardCustomizationData.show_cashtag) && this.customization_area == cardCustomizationData.customization_area && Intrinsics.areEqual(this.is_2d, cardCustomizationData.is_2d) && this.card_presentation_style == cardCustomizationData.card_presentation_style && Intrinsics.areEqual(this.formatted_cashtag, cardCustomizationData.formatted_cashtag) && this.payment_method == cardCustomizationData.payment_method && Intrinsics.areEqual(this.image_bytes, cardCustomizationData.image_bytes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardTheme cardTheme = this.card_theme;
        int hashCode2 = (hashCode + (cardTheme != null ? cardTheme.hashCode() : 0)) * 37;
        TouchData touchData = this.touch_data;
        int hashCode3 = (hashCode2 + (touchData != null ? touchData.hashCode() : 0)) * 37;
        Boolean bool = this.show_cashtag;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        CustomizationArea customizationArea = this.customization_area;
        int hashCode5 = (hashCode4 + (customizationArea != null ? customizationArea.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_2d;
        int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        CardPresentationStyle cardPresentationStyle = this.card_presentation_style;
        int hashCode7 = (hashCode6 + (cardPresentationStyle != null ? cardPresentationStyle.hashCode() : 0)) * 37;
        String str = this.formatted_cashtag;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
        PaymentMethod paymentMethod = this.payment_method;
        int hashCode9 = (hashCode8 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 37;
        ByteString byteString = this.image_bytes;
        int hashCode10 = hashCode9 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.card_theme = this.card_theme;
        builder.touch_data = this.touch_data;
        builder.show_cashtag = this.show_cashtag;
        builder.customization_area = this.customization_area;
        builder.is_2d = this.is_2d;
        builder.card_presentation_style = this.card_presentation_style;
        builder.formatted_cashtag = this.formatted_cashtag;
        builder.payment_method = this.payment_method;
        builder.image_bytes = this.image_bytes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardTheme cardTheme = this.card_theme;
        if (cardTheme != null) {
            arrayList.add("card_theme=" + cardTheme);
        }
        if (this.touch_data != null) {
            arrayList.add("touch_data=██");
        }
        Boolean bool = this.show_cashtag;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_cashtag=", bool, arrayList);
        }
        CustomizationArea customizationArea = this.customization_area;
        if (customizationArea != null) {
            arrayList.add("customization_area=" + customizationArea);
        }
        Boolean bool2 = this.is_2d;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_2d=", bool2, arrayList);
        }
        CardPresentationStyle cardPresentationStyle = this.card_presentation_style;
        if (cardPresentationStyle != null) {
            arrayList.add("card_presentation_style=" + cardPresentationStyle);
        }
        if (this.formatted_cashtag != null) {
            arrayList.add("formatted_cashtag=██");
        }
        PaymentMethod paymentMethod = this.payment_method;
        if (paymentMethod != null) {
            arrayList.add("payment_method=" + paymentMethod);
        }
        if (this.image_bytes != null) {
            arrayList.add("image_bytes=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardCustomizationData{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LEGACY", "FULL_FACE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CustomizationArea implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomizationArea[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CustomizationArea FULL_FACE;
        public static final CustomizationArea LEGACY;
        private final int value;

        private static final /* synthetic */ CustomizationArea[] $values() {
            return new CustomizationArea[]{LEGACY, FULL_FACE};
        }

        static {
            final CustomizationArea customizationArea = new CustomizationArea("LEGACY", 0, 0);
            LEGACY = customizationArea;
            FULL_FACE = new CustomizationArea("FULL_FACE", 1, 1);
            CustomizationArea[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CustomizationArea.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, customizationArea) { // from class: com.squareup.protos.franklin.cards.CardCustomizationData$CustomizationArea$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CardCustomizationData.CustomizationArea fromValue(int value) {
                    return CardCustomizationData.CustomizationArea.INSTANCE.fromValue(value);
                }
            };
        }

        private CustomizationArea(String str, int i, int i2) {
            this.value = i2;
        }

        public static final CustomizationArea fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CustomizationArea valueOf(String str) {
            return (CustomizationArea) Enum.valueOf(CustomizationArea.class, str);
        }

        public static CustomizationArea[] values() {
            return (CustomizationArea[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CustomizationArea fromValue(int value) {
                if (value == 0) {
                    return CustomizationArea.LEGACY;
                }
                if (value != 1) {
                    return null;
                }
                return CustomizationArea.FULL_FACE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/CardCustomizationData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/CardCustomizationData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardCustomizationData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}

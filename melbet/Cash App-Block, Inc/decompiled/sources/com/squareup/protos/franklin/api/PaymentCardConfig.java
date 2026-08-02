package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaymentCardConfig$Builder;", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "customization_margin", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "Lcom/squareup/protos/franklin/api/EditionCard;", "edition_card", "Lcom/squareup/protos/franklin/api/EditionCard;", "", "cashtag_supported", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentCardConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentCardConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean cashtag_supported;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme$CardCustomizationMargin#ADAPTER", schemaIndex = 0, tag = 1)
    public final CardTheme.CardCustomizationMargin customization_margin;

    @WireField(adapter = "com.squareup.protos.franklin.api.EditionCard#ADAPTER", schemaIndex = 1, tag = 2)
    public final EditionCard edition_card;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaymentCardConfig;", "<init>", "()V", "customization_margin", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "edition_card", "Lcom/squareup/protos/franklin/api/EditionCard;", "cashtag_supported", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/PaymentCardConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean cashtag_supported;
        public CardTheme.CardCustomizationMargin customization_margin;
        public EditionCard edition_card;

        @Override // com.squareup.wire.Message.Builder
        public PaymentCardConfig build() {
            return new PaymentCardConfig(this.customization_margin, this.edition_card, this.cashtag_supported, buildUnknownFields());
        }

        public final Builder cashtag_supported(Boolean cashtag_supported) {
            this.cashtag_supported = cashtag_supported;
            return this;
        }

        public final Builder customization_margin(CardTheme.CardCustomizationMargin customization_margin) {
            this.customization_margin = customization_margin;
            return this;
        }

        public final Builder edition_card(EditionCard edition_card) {
            this.edition_card = edition_card;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentCardConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaymentCardConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentCardConfig decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentCardConfig((CardTheme.CardCustomizationMargin) obj, (EditionCard) obj2, (Boolean) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(CardTheme.CardCustomizationMargin.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(EditionCard.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentCardConfig value) {
                writer.getClass();
                value.getClass();
                CardTheme.CardCustomizationMargin.ADAPTER.encodeWithTag(writer, 1, value.customization_margin);
                EditionCard.ADAPTER.encodeWithTag(writer, 2, value.edition_card);
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.cashtag_supported);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentCardConfig value) {
                value.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, value.cashtag_supported) + EditionCard.ADAPTER.encodedSizeWithTag(2, value.edition_card) + CardTheme.CardCustomizationMargin.ADAPTER.encodedSizeWithTag(1, value.customization_margin) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentCardConfig redact(PaymentCardConfig value) {
                value.getClass();
                CardTheme.CardCustomizationMargin cardCustomizationMargin = value.customization_margin;
                CardTheme.CardCustomizationMargin cardCustomizationMargin2 = cardCustomizationMargin != null ? (CardTheme.CardCustomizationMargin) CardTheme.CardCustomizationMargin.ADAPTER.redact(cardCustomizationMargin) : null;
                EditionCard editionCard = value.edition_card;
                EditionCard editionCard2 = editionCard != null ? (EditionCard) EditionCard.ADAPTER.redact(editionCard) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.cashtag_supported;
                byteString.getClass();
                return new PaymentCardConfig(cardCustomizationMargin2, editionCard2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentCardConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.cashtag_supported);
                EditionCard.ADAPTER.encodeWithTag(writer, 2, value.edition_card);
                CardTheme.CardCustomizationMargin.ADAPTER.encodeWithTag(writer, 1, value.customization_margin);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentCardConfig(CardTheme.CardCustomizationMargin cardCustomizationMargin, EditionCard editionCard, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customization_margin = cardCustomizationMargin;
        this.edition_card = editionCard;
        this.cashtag_supported = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentCardConfig)) {
            return false;
        }
        PaymentCardConfig paymentCardConfig = (PaymentCardConfig) obj;
        return Intrinsics.areEqual(unknownFields(), paymentCardConfig.unknownFields()) && Intrinsics.areEqual(this.customization_margin, paymentCardConfig.customization_margin) && Intrinsics.areEqual(this.edition_card, paymentCardConfig.edition_card) && Intrinsics.areEqual(this.cashtag_supported, paymentCardConfig.cashtag_supported);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardTheme.CardCustomizationMargin cardCustomizationMargin = this.customization_margin;
        int hashCode2 = (hashCode + (cardCustomizationMargin != null ? cardCustomizationMargin.hashCode() : 0)) * 37;
        EditionCard editionCard = this.edition_card;
        int hashCode3 = (hashCode2 + (editionCard != null ? editionCard.hashCode() : 0)) * 37;
        Boolean bool = this.cashtag_supported;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.customization_margin = this.customization_margin;
        builder.edition_card = this.edition_card;
        builder.cashtag_supported = this.cashtag_supported;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardTheme.CardCustomizationMargin cardCustomizationMargin = this.customization_margin;
        if (cardCustomizationMargin != null) {
            arrayList.add("customization_margin=" + cardCustomizationMargin);
        }
        EditionCard editionCard = this.edition_card;
        if (editionCard != null) {
            arrayList.add("edition_card=" + editionCard);
        }
        Boolean bool = this.cashtag_supported;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cashtag_supported=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentCardConfig{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaymentCardConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaymentCardConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaymentCardConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentCardConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}

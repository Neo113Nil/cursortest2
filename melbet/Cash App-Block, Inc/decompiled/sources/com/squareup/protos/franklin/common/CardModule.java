package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.common.Headers;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardModule> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1373type;

    public final class BubbleModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BubbleModule> CREATOR;
        public final CardModuleElement element;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public CardModuleElement element;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new BubbleModule(this.element, buildUnknownFields());
                    case 1:
                        return new GiftCardsModule(this.element, buildUnknownFields());
                    case 2:
                        return new HeroNullStateModule(this.element, buildUnknownFields());
                    default:
                        return new SpendingInsightsModule(this.element, buildUnknownFields());
                }
            }
        }

        static {
            CardModule$BubbleModule$Companion$ADAPTER$1 cardModule$BubbleModule$Companion$ADAPTER$1 = new CardModule$BubbleModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BubbleModule.class), "type.googleapis.com/squareup.franklin.common.CardModule.BubbleModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
            ADAPTER = cardModule$BubbleModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$BubbleModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BubbleModule(CardModuleElement cardModuleElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = cardModuleElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BubbleModule)) {
                return false;
            }
            BubbleModule bubbleModule = (BubbleModule) obj;
            return Intrinsics.areEqual(unknownFields(), bubbleModule.unknownFields()) && Intrinsics.areEqual(this.element, bubbleModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardModuleElement cardModuleElement = this.element;
            int hashCode2 = hashCode + (cardModuleElement != null ? cardModuleElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardModuleElement cardModuleElement = this.element;
            if (cardModuleElement != null) {
                arrayList.add("element=" + cardModuleElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BubbleModule{", "}", 0, null, null, 56);
        }
    }

    public final class GiftCardsModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GiftCardsModule> CREATOR;
        public final CardModuleElement element;

        static {
            CardModule$GiftCardsModule$Companion$ADAPTER$1 cardModule$GiftCardsModule$Companion$ADAPTER$1 = new CardModule$GiftCardsModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardsModule.class), "type.googleapis.com/squareup.franklin.common.CardModule.GiftCardsModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
            ADAPTER = cardModule$GiftCardsModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$GiftCardsModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GiftCardsModule(CardModuleElement cardModuleElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = cardModuleElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftCardsModule)) {
                return false;
            }
            GiftCardsModule giftCardsModule = (GiftCardsModule) obj;
            return Intrinsics.areEqual(unknownFields(), giftCardsModule.unknownFields()) && Intrinsics.areEqual(this.element, giftCardsModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardModuleElement cardModuleElement = this.element;
            int hashCode2 = hashCode + (cardModuleElement != null ? cardModuleElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BubbleModule.Builder builder = new BubbleModule.Builder(1);
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardModuleElement cardModuleElement = this.element;
            if (cardModuleElement != null) {
                arrayList.add("element=" + cardModuleElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardsModule{", "}", 0, null, null, 56);
        }
    }

    public final class HeroIssuedCardModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeroIssuedCardModule> CREATOR;
        public final IssuedCardElement element;

        static {
            CardModule$HeroIssuedCardModule$Companion$ADAPTER$1 cardModule$HeroIssuedCardModule$Companion$ADAPTER$1 = new CardModule$HeroIssuedCardModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroIssuedCardModule.class), "type.googleapis.com/squareup.franklin.common.CardModule.HeroIssuedCardModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
            ADAPTER = cardModule$HeroIssuedCardModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroIssuedCardModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroIssuedCardModule(IssuedCardElement issuedCardElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = issuedCardElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeroIssuedCardModule)) {
                return false;
            }
            HeroIssuedCardModule heroIssuedCardModule = (HeroIssuedCardModule) obj;
            return Intrinsics.areEqual(unknownFields(), heroIssuedCardModule.unknownFields()) && Intrinsics.areEqual(this.element, heroIssuedCardModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            IssuedCardElement issuedCardElement = this.element;
            int hashCode2 = hashCode + (issuedCardElement != null ? issuedCardElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(25);
            builder.claimable_payment = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            IssuedCardElement issuedCardElement = this.element;
            if (issuedCardElement != null) {
                arrayList.add("element=" + issuedCardElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeroIssuedCardModule{", "}", 0, null, null, 56);
        }
    }

    public final class HeroNullStateModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeroNullStateModule> CREATOR;
        public final CardModuleElement element;

        static {
            CardModule$HeroNullStateModule$Companion$ADAPTER$1 cardModule$HeroNullStateModule$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroNullStateModule.class), "type.googleapis.com/squareup.franklin.common.CardModule.HeroNullStateModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
            ADAPTER = cardModule$HeroNullStateModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroNullStateModule(CardModuleElement cardModuleElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = cardModuleElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeroNullStateModule)) {
                return false;
            }
            HeroNullStateModule heroNullStateModule = (HeroNullStateModule) obj;
            return Intrinsics.areEqual(unknownFields(), heroNullStateModule.unknownFields()) && Intrinsics.areEqual(this.element, heroNullStateModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardModuleElement cardModuleElement = this.element;
            int hashCode2 = hashCode + (cardModuleElement != null ? cardModuleElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BubbleModule.Builder builder = new BubbleModule.Builder(2);
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardModuleElement cardModuleElement = this.element;
            if (cardModuleElement != null) {
                arrayList.add("element=" + cardModuleElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeroNullStateModule{", "}", 0, null, null, 56);
        }
    }

    public final class ListModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListModule> CREATOR;
        public final List elements;

        static {
            CardModule$ListModule$Companion$ADAPTER$1 cardModule$ListModule$Companion$ADAPTER$1 = new CardModule$ListModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListModule.class), "type.googleapis.com/squareup.franklin.common.CardModule.ListModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
            ADAPTER = cardModule$ListModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$ListModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListModule(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListModule)) {
                return false;
            }
            ListModule listModule = (ListModule) obj;
            return Intrinsics.areEqual(unknownFields(), listModule.unknownFields()) && Intrinsics.areEqual(this.elements, listModule.elements);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.elements.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Headers.Builder builder = new Headers.Builder(23, false);
            builder.header = this.elements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.elements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListModule{", "}", 0, null, null, 56);
        }
    }

    public final class SpendingInsightsModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SpendingInsightsModule> CREATOR;
        public final CardModuleElement element;

        static {
            CardModule$SpendingInsightsModule$Companion$ADAPTER$1 cardModule$SpendingInsightsModule$Companion$ADAPTER$1 = new CardModule$SpendingInsightsModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SpendingInsightsModule.class), "type.googleapis.com/squareup.franklin.common.CardModule.SpendingInsightsModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
            ADAPTER = cardModule$SpendingInsightsModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$SpendingInsightsModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpendingInsightsModule(CardModuleElement cardModuleElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = cardModuleElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpendingInsightsModule)) {
                return false;
            }
            SpendingInsightsModule spendingInsightsModule = (SpendingInsightsModule) obj;
            return Intrinsics.areEqual(unknownFields(), spendingInsightsModule.unknownFields()) && Intrinsics.areEqual(this.element, spendingInsightsModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardModuleElement cardModuleElement = this.element;
            int hashCode2 = hashCode + (cardModuleElement != null ? cardModuleElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BubbleModule.Builder builder = new BubbleModule.Builder(3);
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardModuleElement cardModuleElement = this.element;
            if (cardModuleElement != null) {
                arrayList.add("element=" + cardModuleElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SpendingInsightsModule{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes4.dex */
    public abstract class Type {

        /* loaded from: classes8.dex */
        public final class Bubble extends Type {
            public final BubbleModule value;

            public Bubble(BubbleModule bubbleModule) {
                bubbleModule.getClass();
                this.value = bubbleModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Bubble) && Intrinsics.areEqual(this.value, ((Bubble) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Bubble(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class GiftCards extends Type {
            public final GiftCardsModule value;

            public GiftCards(GiftCardsModule giftCardsModule) {
                giftCardsModule.getClass();
                this.value = giftCardsModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GiftCards) && Intrinsics.areEqual(this.value, ((GiftCards) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GiftCards(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class HeroIssuedCard extends Type {
            public final HeroIssuedCardModule value;

            public HeroIssuedCard(HeroIssuedCardModule heroIssuedCardModule) {
                heroIssuedCardModule.getClass();
                this.value = heroIssuedCardModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HeroIssuedCard) && Intrinsics.areEqual(this.value, ((HeroIssuedCard) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "HeroIssuedCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class HeroNullState extends Type {
            public final HeroNullStateModule value;

            public HeroNullState(HeroNullStateModule heroNullStateModule) {
                heroNullStateModule.getClass();
                this.value = heroNullStateModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HeroNullState) && Intrinsics.areEqual(this.value, ((HeroNullState) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "HeroNullState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class List extends Type {
            public final ListModule value;

            public List(ListModule listModule) {
                listModule.getClass();
                this.value = listModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof List) && Intrinsics.areEqual(this.value, ((List) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "List(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SpendingInsights extends Type {
            public final SpendingInsightsModule value;

            public SpendingInsights(SpendingInsightsModule spendingInsightsModule) {
                spendingInsightsModule.getClass();
                this.value = spendingInsightsModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpendingInsights) && Intrinsics.areEqual(this.value, ((SpendingInsights) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SpendingInsights(value=" + this.value + ")";
            }
        }

        public static ResourceEvent.Configuration fromJsonObject(JsonObject jsonObject) {
            try {
                Number asNumber = jsonObject.get("session_sample_rate").getAsNumber();
                JsonElement jsonElement = jsonObject.get("session_replay_sample_rate");
                Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                JsonElement jsonElement2 = jsonObject.get("profiling_sample_rate");
                Number asNumber3 = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
                asNumber.getClass();
                return new ResourceEvent.Configuration(asNumber, asNumber2, asNumber3);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Configuration", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Configuration", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Configuration", e3);
                return null;
            }
        }

        public static java.util.List getDeepLinkSpecs() {
            return ClientRoute.ViewSupport.deepLinkSpecs;
        }
    }

    static {
        CardModule$Companion$ADAPTER$1 cardModule$Companion$ADAPTER$1 = new CardModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardModule.class), "type.googleapis.com/squareup.franklin.common.CardModule", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = cardModule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModule(Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1373type = type2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardModule)) {
            return false;
        }
        CardModule cardModule = (CardModule) obj;
        return Intrinsics.areEqual(unknownFields(), cardModule.unknownFields()) && Intrinsics.areEqual(this.f1373type, cardModule.f1373type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1373type;
        int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(24);
        builder.claimable_payment = this.f1373type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1373type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardModule{", "}", 0, null, null, 56);
    }
}

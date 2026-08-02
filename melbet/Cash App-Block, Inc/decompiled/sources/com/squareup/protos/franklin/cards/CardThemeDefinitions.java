package com.squareup.protos.franklin.cards;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.appthemes.AppThemeDefinitions;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
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

/* loaded from: classes8.dex */
public final class CardThemeDefinitions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardThemeDefinitions> CREATOR;
    public final Map card_theme_definitions;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardThemeDefinitions.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.cards.CardThemeDefinitions$Companion$ADAPTER$1
            public final Lazy card_theme_definitionsAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.card_theme_definitionsAdapter$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CardThemeDefinitions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.putAll((Map) ((ProtoAdapter) this.card_theme_definitionsAdapter$delegate.getValue()).decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj;
                reverseProtoWriter.getClass();
                cardThemeDefinitions.getClass();
                reverseProtoWriter.writeBytes(cardThemeDefinitions.unknownFields());
                ((ProtoAdapter) this.card_theme_definitionsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 1, cardThemeDefinitions.card_theme_definitions);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj;
                cardThemeDefinitions.getClass();
                return ((ProtoAdapter) this.card_theme_definitionsAdapter$delegate.getValue()).encodedSizeWithTag(1, cardThemeDefinitions.card_theme_definitions) + cardThemeDefinitions.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj;
                cardThemeDefinitions.getClass();
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(cardThemeDefinitions.card_theme_definitions, CardThemeDefinition.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new CardThemeDefinitions(m1170redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj;
                cardThemeDefinitions.getClass();
                ((ProtoAdapter) this.card_theme_definitionsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 1, cardThemeDefinitions.card_theme_definitions);
                protoWriter.writeBytes(cardThemeDefinitions.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardThemeDefinitions(Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.card_theme_definitions = TransactorKt.immutableCopyOf("card_theme_definitions", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardThemeDefinitions)) {
            return false;
        }
        CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj;
        return Intrinsics.areEqual(unknownFields(), cardThemeDefinitions.unknownFields()) && Intrinsics.areEqual(this.card_theme_definitions, cardThemeDefinitions.card_theme_definitions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.card_theme_definitions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppThemeDefinitions.Builder builder = new AppThemeDefinitions.Builder(2);
        EmptyMap.INSTANCE.getClass();
        builder.app_themes = this.card_theme_definitions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map map = this.card_theme_definitions;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("card_theme_definitions=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardThemeDefinitions{", "}", 0, null, null, 56);
    }
}

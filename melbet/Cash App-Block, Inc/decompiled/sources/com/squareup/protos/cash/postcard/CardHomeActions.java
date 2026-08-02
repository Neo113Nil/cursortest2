package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
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
public final class CardHomeActions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardHomeActions> CREATOR;
    public final List actions;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardHomeActions.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postcard.CardHomeActions$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CardHomeActions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(CardHomeAction.ADAPTER.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CardHomeActions cardHomeActions = (CardHomeActions) obj;
                reverseProtoWriter.getClass();
                cardHomeActions.getClass();
                reverseProtoWriter.writeBytes(cardHomeActions.unknownFields());
                CardHomeAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardHomeActions.actions);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CardHomeActions cardHomeActions = (CardHomeActions) obj;
                cardHomeActions.getClass();
                return CardHomeAction.ADAPTER.asRepeated().encodedSizeWithTag(1, cardHomeActions.actions) + cardHomeActions.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CardHomeActions cardHomeActions = (CardHomeActions) obj;
                cardHomeActions.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardHomeActions.actions, CardHomeAction.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new CardHomeActions(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CardHomeActions cardHomeActions = (CardHomeActions) obj;
                cardHomeActions.getClass();
                CardHomeAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardHomeActions.actions);
                protoWriter.writeBytes(cardHomeActions.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardHomeActions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardHomeActions)) {
            return false;
        }
        CardHomeActions cardHomeActions = (CardHomeActions) obj;
        return Intrinsics.areEqual(unknownFields(), cardHomeActions.unknownFields()) && Intrinsics.areEqual(this.actions, cardHomeActions.actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.actions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(12);
        builder.pools = this.actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.actions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardHomeActions{", "}", 0, null, null, 56);
    }
}

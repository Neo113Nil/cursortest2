package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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
public final class CardScheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardScheme> CREATOR;
    public final List modules;

    static {
        CardScheme$Companion$ADAPTER$1 cardScheme$Companion$ADAPTER$1 = new CardScheme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardScheme.class), "type.googleapis.com/squareup.franklin.common.CardScheme", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = cardScheme$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardScheme$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScheme(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.modules = TransactorKt.immutableCopyOf("modules", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardScheme)) {
            return false;
        }
        CardScheme cardScheme = (CardScheme) obj;
        return Intrinsics.areEqual(unknownFields(), cardScheme.unknownFields()) && Intrinsics.areEqual(this.modules, cardScheme.modules);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.modules.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(24, false);
        builder.header = this.modules;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.modules;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("modules=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardScheme{", "}", 0, null, null, 56);
    }
}

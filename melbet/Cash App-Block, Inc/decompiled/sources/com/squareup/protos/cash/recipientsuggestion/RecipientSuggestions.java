package com.squareup.protos.cash.recipientsuggestion;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
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

/* loaded from: classes7.dex */
public final class RecipientSuggestions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecipientSuggestions> CREATOR;
    public final List suggestions;

    static {
        RecipientSuggestions$Companion$ADAPTER$1 recipientSuggestions$Companion$ADAPTER$1 = new RecipientSuggestions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientSuggestions.class), "type.googleapis.com/squareup.cash.recipientsuggestion.RecipientSuggestions", Syntax.PROTO_2, null, "squareup/cash/recipientsuggestion/RecipientSuggestions.proto");
        ADAPTER = recipientSuggestions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSuggestions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientSuggestions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.suggestions = TransactorKt.immutableCopyOf("suggestions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecipientSuggestions)) {
            return false;
        }
        RecipientSuggestions recipientSuggestions = (RecipientSuggestions) obj;
        return Intrinsics.areEqual(unknownFields(), recipientSuggestions.unknownFields()) && Intrinsics.areEqual(this.suggestions, recipientSuggestions.suggestions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.suggestions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(16, false);
        builder.pools = this.suggestions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.suggestions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("suggestions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientSuggestions{", "}", 0, null, null, 56);
    }
}

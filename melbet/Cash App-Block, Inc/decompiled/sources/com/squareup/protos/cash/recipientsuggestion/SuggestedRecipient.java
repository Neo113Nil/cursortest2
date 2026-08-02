package com.squareup.protos.cash.recipientsuggestion;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SuggestedRecipient extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SuggestedRecipient> CREATOR;
    public final CustomerData customer_data;
    public final String customer_token;
    public final Double score;
    public final SuggestionSource source;

    static {
        SuggestedRecipient$Companion$ADAPTER$1 suggestedRecipient$Companion$ADAPTER$1 = new SuggestedRecipient$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SuggestedRecipient.class), "type.googleapis.com/squareup.cash.recipientsuggestion.SuggestedRecipient", Syntax.PROTO_2, null, "squareup/cash/recipientsuggestion/RecipientSuggestions.proto");
        ADAPTER = suggestedRecipient$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(suggestedRecipient$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedRecipient(String str, Double d, SuggestionSource suggestionSource, CustomerData customerData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.score = d;
        this.source = suggestionSource;
        this.customer_data = customerData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedRecipient)) {
            return false;
        }
        SuggestedRecipient suggestedRecipient = (SuggestedRecipient) obj;
        return Intrinsics.areEqual(unknownFields(), suggestedRecipient.unknownFields()) && Intrinsics.areEqual(this.customer_token, suggestedRecipient.customer_token) && Intrinsics.areEqual(this.score, suggestedRecipient.score) && this.source == suggestedRecipient.source && Intrinsics.areEqual(this.customer_data, suggestedRecipient.customer_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Double d = this.score;
        int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        SuggestionSource suggestionSource = this.source;
        int hashCode4 = (hashCode3 + (suggestionSource != null ? suggestionSource.hashCode() : 0)) * 37;
        CustomerData customerData = this.customer_data;
        int hashCode5 = hashCode4 + (customerData != null ? customerData.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(11);
        builder.customer_token_hash_email = this.customer_token;
        builder.card_encryption_data = this.score;
        builder.device_metadata = this.source;
        builder.success_screen = this.customer_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Double d = this.score;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("score=", d, arrayList);
        }
        SuggestionSource suggestionSource = this.source;
        if (suggestionSource != null) {
            arrayList.add("source=" + suggestionSource);
        }
        CustomerData customerData = this.customer_data;
        if (customerData != null) {
            arrayList.add("customer_data=" + customerData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuggestedRecipient{", "}", 0, null, null, 56);
    }
}

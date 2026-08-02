package com.squareup.protos.cash.cashbusinessaccounts;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
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
public final class TapToPayDescriptionSuggestions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TapToPayDescriptionSuggestions> CREATOR;
    public final String payment_description_suggestion_algorithm;
    public final List payment_description_suggestions;

    static {
        TapToPayDescriptionSuggestions$Companion$ADAPTER$1 tapToPayDescriptionSuggestions$Companion$ADAPTER$1 = new TapToPayDescriptionSuggestions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TapToPayDescriptionSuggestions.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/sync_values.proto");
        ADAPTER = tapToPayDescriptionSuggestions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tapToPayDescriptionSuggestions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToPayDescriptionSuggestions(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.payment_description_suggestion_algorithm = str;
        this.payment_description_suggestions = TransactorKt.immutableCopyOf("payment_description_suggestions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TapToPayDescriptionSuggestions)) {
            return false;
        }
        TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions = (TapToPayDescriptionSuggestions) obj;
        return Intrinsics.areEqual(unknownFields(), tapToPayDescriptionSuggestions.unknownFields()) && Intrinsics.areEqual(this.payment_description_suggestions, tapToPayDescriptionSuggestions.payment_description_suggestions) && Intrinsics.areEqual(this.payment_description_suggestion_algorithm, tapToPayDescriptionSuggestions.payment_description_suggestion_algorithm);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.payment_description_suggestions);
        String str = this.payment_description_suggestion_algorithm;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(7, false);
        builder.sections = this.payment_description_suggestions;
        builder.toggle_title = this.payment_description_suggestion_algorithm;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.payment_description_suggestions.isEmpty()) {
            arrayList.add("payment_description_suggestions=██");
        }
        String str = this.payment_description_suggestion_algorithm;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_description_suggestion_algorithm=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TapToPayDescriptionSuggestions{", "}", 0, null, null, 56);
    }
}

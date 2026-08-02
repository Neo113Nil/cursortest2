package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
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
public final class DisplayMessageAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayMessageAction> CREATOR;
    public final String message;
    public final String title;

    static {
        DisplayMessageAction$Companion$ADAPTER$1 displayMessageAction$Companion$ADAPTER$1 = new DisplayMessageAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayMessageAction.class), "type.googleapis.com/squareup.cash.marketdata.model.DisplayMessageAction", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/news.proto");
        ADAPTER = displayMessageAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayMessageAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayMessageAction(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayMessageAction)) {
            return false;
        }
        DisplayMessageAction displayMessageAction = (DisplayMessageAction) obj;
        return Intrinsics.areEqual(unknownFields(), displayMessageAction.unknownFields()) && Intrinsics.areEqual(this.title, displayMessageAction.title) && Intrinsics.areEqual(this.message, displayMessageAction.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(27);
        builder.given_name = this.title;
        builder.family_name = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayMessageAction{", "}", 0, null, null, 56);
    }
}

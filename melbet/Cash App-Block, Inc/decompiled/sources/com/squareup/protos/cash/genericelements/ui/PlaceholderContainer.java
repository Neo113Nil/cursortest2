package com.squareup.protos.cash.genericelements.ui;

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
public final class PlaceholderContainer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlaceholderContainer> CREATOR;
    public final String encoded_input_proto;
    public final String proto_type;

    static {
        PlaceholderContainer$Companion$ADAPTER$1 placeholderContainer$Companion$ADAPTER$1 = new PlaceholderContainer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PlaceholderContainer.class), "type.googleapis.com/squareup.cash.genericelements.ui.PlaceholderContainer", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = placeholderContainer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(placeholderContainer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderContainer(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.encoded_input_proto = str;
        this.proto_type = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceholderContainer)) {
            return false;
        }
        PlaceholderContainer placeholderContainer = (PlaceholderContainer) obj;
        return Intrinsics.areEqual(unknownFields(), placeholderContainer.unknownFields()) && Intrinsics.areEqual(this.encoded_input_proto, placeholderContainer.encoded_input_proto) && Intrinsics.areEqual(this.proto_type, placeholderContainer.proto_type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.encoded_input_proto;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.proto_type;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(2);
        builder.given_name = this.encoded_input_proto;
        builder.family_name = this.proto_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.encoded_input_proto;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "encoded_input_proto=", arrayList);
        }
        String str2 = this.proto_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "proto_type=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaceholderContainer{", "}", 0, null, null, 56);
    }
}

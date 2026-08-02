package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class RowItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RowItem> CREATOR;
    public final Text detail;
    public final Text title;

    static {
        RowItem$Companion$ADAPTER$1 rowItem$Companion$ADAPTER$1 = new RowItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowItem.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.RowItem", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/common_ui_elements.proto");
        ADAPTER = rowItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rowItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowItem(Text text, Text text2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.detail = text2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowItem)) {
            return false;
        }
        RowItem rowItem = (RowItem) obj;
        return Intrinsics.areEqual(unknownFields(), rowItem.unknownFields()) && Intrinsics.areEqual(this.title, rowItem.title) && Intrinsics.areEqual(this.detail, rowItem.detail);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.detail;
        int hashCode3 = hashCode2 + (text2 != null ? text2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(11);
        builder.errors = this.title;
        builder.result = this.detail;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.detail;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("detail=", text2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RowItem{", "}", 0, null, null, 56);
    }
}

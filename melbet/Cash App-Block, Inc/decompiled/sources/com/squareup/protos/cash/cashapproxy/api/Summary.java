package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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
public final class Summary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Summary> CREATOR;
    public final TextWithInfo balance_detail;
    public final Text balance_title;
    public final InfoTile info_tile;
    public final TextWithInfo total_owed_detail;
    public final Text total_owed_title;

    static {
        Summary$Companion$ADAPTER$1 summary$Companion$ADAPTER$1 = new Summary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Summary.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.Summary", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_hub.proto");
        ADAPTER = summary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(summary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Summary(Text text, TextWithInfo textWithInfo, Text text2, TextWithInfo textWithInfo2, InfoTile infoTile, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.balance_title = text;
        this.balance_detail = textWithInfo;
        this.total_owed_title = text2;
        this.total_owed_detail = textWithInfo2;
        this.info_tile = infoTile;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return Intrinsics.areEqual(unknownFields(), summary.unknownFields()) && Intrinsics.areEqual(this.balance_title, summary.balance_title) && Intrinsics.areEqual(this.balance_detail, summary.balance_detail) && Intrinsics.areEqual(this.total_owed_title, summary.total_owed_title) && Intrinsics.areEqual(this.total_owed_detail, summary.total_owed_detail) && Intrinsics.areEqual(this.info_tile, summary.info_tile);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.balance_title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        TextWithInfo textWithInfo = this.balance_detail;
        int hashCode3 = (hashCode2 + (textWithInfo != null ? textWithInfo.hashCode() : 0)) * 37;
        Text text2 = this.total_owed_title;
        int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
        TextWithInfo textWithInfo2 = this.total_owed_detail;
        int hashCode5 = (hashCode4 + (textWithInfo2 != null ? textWithInfo2.hashCode() : 0)) * 37;
        InfoTile infoTile = this.info_tile;
        int hashCode6 = hashCode5 + (infoTile != null ? infoTile.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(23);
        builder.for_each = this.balance_title;
        builder.moneybot_scaffold = this.balance_detail;
        builder.compose_platform = this.total_owed_title;
        builder.is_included = this.total_owed_detail;
        builder.motion = this.info_tile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.balance_title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("balance_title=", text, arrayList);
        }
        TextWithInfo textWithInfo = this.balance_detail;
        if (textWithInfo != null) {
            arrayList.add("balance_detail=" + textWithInfo);
        }
        Text text2 = this.total_owed_title;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("total_owed_title=", text2, arrayList);
        }
        TextWithInfo textWithInfo2 = this.total_owed_detail;
        if (textWithInfo2 != null) {
            arrayList.add("total_owed_detail=" + textWithInfo2);
        }
        InfoTile infoTile = this.info_tile;
        if (infoTile != null) {
            arrayList.add("info_tile=" + infoTile);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Summary{", "}", 0, null, null, 56);
    }
}

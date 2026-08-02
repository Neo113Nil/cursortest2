package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.aegis.core.Section;
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
public final class InfoTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InfoTile> CREATOR;
    public final InfoTileIcon icon;
    public final Text info;
    public final Text title;

    static {
        InfoTile$Companion$ADAPTER$1 infoTile$Companion$ADAPTER$1 = new InfoTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoTile.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.InfoTile", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/common_ui_elements.proto");
        ADAPTER = infoTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(infoTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoTile(Text text, Text text2, InfoTileIcon infoTileIcon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.info = text2;
        this.icon = infoTileIcon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InfoTile)) {
            return false;
        }
        InfoTile infoTile = (InfoTile) obj;
        return Intrinsics.areEqual(unknownFields(), infoTile.unknownFields()) && Intrinsics.areEqual(this.title, infoTile.title) && Intrinsics.areEqual(this.info, infoTile.info) && this.icon == infoTile.icon;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.info;
        int hashCode3 = (hashCode2 + (text2 != null ? text2.hashCode() : 0)) * 37;
        InfoTileIcon infoTileIcon = this.icon;
        int hashCode4 = hashCode3 + (infoTileIcon != null ? infoTileIcon.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(19);
        builder.header_text = this.title;
        builder.header_button = this.info;
        builder.groups = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.info;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("info=", text2, arrayList);
        }
        InfoTileIcon infoTileIcon = this.icon;
        if (infoTileIcon != null) {
            arrayList.add("icon=" + infoTileIcon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InfoTile{", "}", 0, null, null, 56);
    }
}

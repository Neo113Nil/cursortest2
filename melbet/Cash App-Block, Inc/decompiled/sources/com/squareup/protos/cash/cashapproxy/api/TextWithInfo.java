package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.aegis.core.Section;
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
public final class TextWithInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextWithInfo> CREATOR;
    public final HalfsheetId halfsheet_id;
    public final List info_halfsheet_contents;
    public final Text text;

    static {
        TextWithInfo$Companion$ADAPTER$1 textWithInfo$Companion$ADAPTER$1 = new TextWithInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextWithInfo.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.TextWithInfo", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_hub.proto");
        ADAPTER = textWithInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textWithInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextWithInfo(Text text, List list, HalfsheetId halfsheetId, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.text = text;
        this.halfsheet_id = halfsheetId;
        this.info_halfsheet_contents = TransactorKt.immutableCopyOf("info_halfsheet_contents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextWithInfo)) {
            return false;
        }
        TextWithInfo textWithInfo = (TextWithInfo) obj;
        return Intrinsics.areEqual(unknownFields(), textWithInfo.unknownFields()) && Intrinsics.areEqual(this.text, textWithInfo.text) && Intrinsics.areEqual(this.info_halfsheet_contents, textWithInfo.info_halfsheet_contents) && this.halfsheet_id == textWithInfo.halfsheet_id;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (text != null ? text.hashCode() : 0)) * 37, 37, this.info_halfsheet_contents);
        HalfsheetId halfsheetId = this.halfsheet_id;
        int hashCode2 = m + (halfsheetId != null ? halfsheetId.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(20);
        builder.header_text = this.text;
        builder.groups = this.info_halfsheet_contents;
        builder.header_button = this.halfsheet_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.text;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("text=", text, arrayList);
        }
        List list = this.info_halfsheet_contents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("info_halfsheet_contents=", arrayList, list);
        }
        HalfsheetId halfsheetId = this.halfsheet_id;
        if (halfsheetId != null) {
            arrayList.add("halfsheet_id=" + halfsheetId);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextWithInfo{", "}", 0, null, null, 56);
    }
}

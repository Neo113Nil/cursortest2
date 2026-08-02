package com.squareup.protos.cash.discover.api.app.v2.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
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
public final class Text extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Text> CREATOR;
    public final Icon icon;
    public final String text;
    public final Color text_color;

    static {
        Text$Companion$ADAPTER$1 text$Companion$ADAPTER$1 = new Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.Text", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/text.proto");
        ADAPTER = text$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(text$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text(String str, Color color, Icon icon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.text_color = color;
        this.icon = icon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.text_color, text.text_color) && Intrinsics.areEqual(this.icon, text.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode4 = hashCode3 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(16);
        builder.loan_type = this.text;
        builder.payment_schedule = this.text_color;
        builder.tila_data = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.Stamp;
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
public final class TextInputSpec extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextInputSpec> CREATOR;
    public final String label;
    public final Integer max_length;
    public final String placeholder;
    public final String prefilled_value;

    static {
        TextInputSpec$Companion$ADAPTER$1 textInputSpec$Companion$ADAPTER$1 = new TextInputSpec$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextInputSpec.class), "type.googleapis.com/squareup.cash.local.client.v1.TextInputSpec", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = textInputSpec$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textInputSpec$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputSpec(Integer num, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = str;
        this.placeholder = str2;
        this.prefilled_value = str3;
        this.max_length = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextInputSpec)) {
            return false;
        }
        TextInputSpec textInputSpec = (TextInputSpec) obj;
        return Intrinsics.areEqual(unknownFields(), textInputSpec.unknownFields()) && Intrinsics.areEqual(this.label, textInputSpec.label) && Intrinsics.areEqual(this.placeholder, textInputSpec.placeholder) && Intrinsics.areEqual(this.prefilled_value, textInputSpec.prefilled_value) && Intrinsics.areEqual(this.max_length, textInputSpec.max_length);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.placeholder;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.prefilled_value;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.max_length;
        int hashCode5 = hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Stamp.Builder builder = new Stamp.Builder(2);
        builder.name = this.label;
        builder.accessibility_text = this.placeholder;
        builder.svg = this.prefilled_value;
        builder.min_scale = this.max_length;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        String str2 = this.placeholder;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "placeholder=", arrayList);
        }
        String str3 = this.prefilled_value;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "prefilled_value=", arrayList);
        }
        Integer num = this.max_length;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_length=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextInputSpec{", "}", 0, null, null, 56);
    }
}

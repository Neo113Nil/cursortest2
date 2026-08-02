package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.cards.TouchData;
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

/* loaded from: classes8.dex */
public final class CustomDesign extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomDesign> CREATOR;
    public final ByteString customization_image_bytes;
    public final String mime_type;
    public final TouchData touch_data;

    static {
        CustomDesign$Companion$ADAPTER$1 customDesign$Companion$ADAPTER$1 = new CustomDesign$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomDesign.class), "type.googleapis.com/squareup.franklin.app.CustomDesign", Syntax.PROTO_2, null, "squareup/franklin/app/payment_device_customization.proto");
        ADAPTER = customDesign$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customDesign$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomDesign(ByteString byteString, String str, TouchData touchData, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.customization_image_bytes = byteString;
        this.mime_type = str;
        this.touch_data = touchData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomDesign)) {
            return false;
        }
        CustomDesign customDesign = (CustomDesign) obj;
        return Intrinsics.areEqual(unknownFields(), customDesign.unknownFields()) && Intrinsics.areEqual(this.customization_image_bytes, customDesign.customization_image_bytes) && Intrinsics.areEqual(this.mime_type, customDesign.mime_type) && Intrinsics.areEqual(this.touch_data, customDesign.touch_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.customization_image_bytes;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.mime_type;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TouchData touchData = this.touch_data;
        int hashCode4 = hashCode3 + (touchData != null ? touchData.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(20);
        builder.f1364type = this.customization_image_bytes;
        builder.canonical_text = this.mime_type;
        builder.formatted = this.touch_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.customization_image_bytes;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("customization_image_bytes=", byteString, arrayList);
        }
        String str = this.mime_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "mime_type=", arrayList);
        }
        TouchData touchData = this.touch_data;
        if (touchData != null) {
            arrayList.add("touch_data=" + touchData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomDesign{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class ImageExifData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageExifData> CREATOR;
    public final String raw_json;

    static {
        ImageExifData$Companion$ADAPTER$1 imageExifData$Companion$ADAPTER$1 = new ImageExifData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageExifData.class), "type.googleapis.com/squareup.cash.contacts.app.ImageExifData", Syntax.PROTO_2, null, "squareup/cash/contacts/app/AddressBookContact.proto");
        ADAPTER = imageExifData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageExifData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageExifData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.raw_json = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageExifData)) {
            return false;
        }
        ImageExifData imageExifData = (ImageExifData) obj;
        return Intrinsics.areEqual(unknownFields(), imageExifData.unknownFields()) && Intrinsics.areEqual(this.raw_json, imageExifData.raw_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.raw_json;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(21);
        builder.banner_color = this.raw_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.raw_json;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "raw_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageExifData{", "}", 0, null, null, 56);
    }
}

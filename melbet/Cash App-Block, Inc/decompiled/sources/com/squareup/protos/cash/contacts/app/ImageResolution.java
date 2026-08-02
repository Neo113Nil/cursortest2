package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tigers.Tigers;
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
public final class ImageResolution extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageResolution> CREATOR;
    public final Long height;
    public final Long width;

    static {
        ImageResolution$Companion$ADAPTER$1 imageResolution$Companion$ADAPTER$1 = new ImageResolution$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageResolution.class), "type.googleapis.com/squareup.cash.contacts.app.ImageResolution", Syntax.PROTO_2, null, "squareup/cash/contacts/app/AddressBookContact.proto");
        ADAPTER = imageResolution$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageResolution$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageResolution(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.width = l;
        this.height = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageResolution)) {
            return false;
        }
        ImageResolution imageResolution = (ImageResolution) obj;
        return Intrinsics.areEqual(unknownFields(), imageResolution.unknownFields()) && Intrinsics.areEqual(this.width, imageResolution.width) && Intrinsics.areEqual(this.height, imageResolution.height);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.width;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.height;
        int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Tigers.Builder builder = new Tigers.Builder(1);
        builder.tiger_count = this.width;
        builder.fetch_version = this.height;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.width;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("width=", l, arrayList);
        }
        Long l2 = this.height;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("height=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageResolution{", "}", 0, null, null, 56);
    }
}

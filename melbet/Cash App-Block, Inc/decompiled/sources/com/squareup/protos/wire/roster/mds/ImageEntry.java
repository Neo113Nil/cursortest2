package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Transfer;
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

/* loaded from: classes8.dex */
public final class ImageEntry extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageEntry> CREATOR;
    public final Integer center_x;
    public final Integer center_y;
    public final String content_digest;
    public final String content_type;
    public final String file_name;
    public final Integer height;
    public final List image_purposes;
    public final String image_url;
    public final Integer width;

    static {
        ImageEntry$Companion$ADAPTER$1 imageEntry$Companion$ADAPTER$1 = new ImageEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageEntry.class), "type.googleapis.com/squareup.roster.mds.ImageEntry", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = imageEntry$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageEntry$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEntry(List list, String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.content_digest = str;
        this.content_type = str2;
        this.image_url = str3;
        this.file_name = str4;
        this.width = num;
        this.height = num2;
        this.center_x = num3;
        this.center_y = num4;
        this.image_purposes = TransactorKt.immutableCopyOf("image_purposes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageEntry)) {
            return false;
        }
        ImageEntry imageEntry = (ImageEntry) obj;
        return Intrinsics.areEqual(unknownFields(), imageEntry.unknownFields()) && Intrinsics.areEqual(this.image_purposes, imageEntry.image_purposes) && Intrinsics.areEqual(this.content_digest, imageEntry.content_digest) && Intrinsics.areEqual(this.content_type, imageEntry.content_type) && Intrinsics.areEqual(this.image_url, imageEntry.image_url) && Intrinsics.areEqual(this.file_name, imageEntry.file_name) && Intrinsics.areEqual(this.width, imageEntry.width) && Intrinsics.areEqual(this.height, imageEntry.height) && Intrinsics.areEqual(this.center_x, imageEntry.center_x) && Intrinsics.areEqual(this.center_y, imageEntry.center_y);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.image_purposes);
        String str = this.content_digest;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.content_type;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.file_name;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num = this.width;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.height;
        int hashCode6 = (hashCode5 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.center_x;
        int hashCode7 = (hashCode6 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.center_y;
        int hashCode8 = hashCode7 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(20, false);
        builder.source = this.image_purposes;
        builder.token = this.content_digest;
        builder.target = this.content_type;
        builder.state = this.image_url;
        builder.amount = this.file_name;
        builder.push_amount = this.width;
        builder.created_at = this.height;
        builder.completed_at = this.center_x;
        builder.failed_at = this.center_y;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.image_purposes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("image_purposes=", arrayList, list);
        }
        String str = this.content_digest;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "content_digest=", arrayList);
        }
        String str2 = this.content_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "content_type=", arrayList);
        }
        String str3 = this.image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "image_url=", arrayList);
        }
        String str4 = this.file_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "file_name=", arrayList);
        }
        Integer num = this.width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("width=", num, arrayList);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("height=", num2, arrayList);
        }
        Integer num3 = this.center_x;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("center_x=", num3, arrayList);
        }
        Integer num4 = this.center_y;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("center_y=", num4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageEntry{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import coil3.Image_androidKt;
import com.squareup.protos.cash.grantly.api.LoanOption;
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

/* loaded from: classes.dex */
public final class EmbeddedImageSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmbeddedImageSection> CREATOR;
    public final Image_androidKt image;
    public final String item_action_url;
    public final ItemMetadata metadata;

    static {
        EmbeddedImageSection$Companion$ADAPTER$1 embeddedImageSection$Companion$ADAPTER$1 = new EmbeddedImageSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmbeddedImageSection.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.EmbeddedImageSection", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = embeddedImageSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(embeddedImageSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedImageSection(ItemMetadata itemMetadata, String str, Image_androidKt image_androidKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = itemMetadata;
        this.item_action_url = str;
        this.image = image_androidKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddedImageSection)) {
            return false;
        }
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        return Intrinsics.areEqual(unknownFields(), embeddedImageSection.unknownFields()) && Intrinsics.areEqual(this.metadata, embeddedImageSection.metadata) && Intrinsics.areEqual(this.item_action_url, embeddedImageSection.item_action_url) && Intrinsics.areEqual(this.image, embeddedImageSection.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ItemMetadata itemMetadata = this.metadata;
        int hashCode2 = (hashCode + (itemMetadata != null ? itemMetadata.hashCode() : 0)) * 37;
        String str = this.item_action_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Image_androidKt image_androidKt = this.image;
        int hashCode4 = hashCode3 + (image_androidKt != null ? image_androidKt.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(11);
        builder.loan_type = this.metadata;
        builder.payment_schedule = this.item_action_url;
        builder.tila_data = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ItemMetadata itemMetadata = this.metadata;
        if (itemMetadata != null) {
            arrayList.add("metadata=" + itemMetadata);
        }
        if (this.item_action_url != null) {
            arrayList.add("item_action_url=██");
        }
        Image_androidKt image_androidKt = this.image;
        if (image_androidKt != null) {
            arrayList.add("image=" + image_androidKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmbeddedImageSection{", "}", 0, null, null, 56);
    }
}

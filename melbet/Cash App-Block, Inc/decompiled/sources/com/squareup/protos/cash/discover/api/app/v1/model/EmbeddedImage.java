package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.EmbeddedImage;
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
public final class EmbeddedImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmbeddedImage> CREATOR;
    public final ByteString dark_mode;
    public final ByteString light_mode;

    static {
        EmbeddedImage$Companion$ADAPTER$1 embeddedImage$Companion$ADAPTER$1 = new EmbeddedImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmbeddedImage.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.EmbeddedImage", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = embeddedImage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(embeddedImage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedImage(ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.light_mode = byteString;
        this.dark_mode = byteString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddedImage)) {
            return false;
        }
        EmbeddedImage embeddedImage = (EmbeddedImage) obj;
        return Intrinsics.areEqual(unknownFields(), embeddedImage.unknownFields()) && Intrinsics.areEqual(this.light_mode, embeddedImage.light_mode) && Intrinsics.areEqual(this.dark_mode, embeddedImage.dark_mode);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.light_mode;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.dark_mode;
        int hashCode3 = hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EmbeddedImage.Builder builder = new EmbeddedImage.Builder(1);
        builder.light_mode = this.light_mode;
        builder.dark_mode = this.dark_mode;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.light_mode;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("light_mode=", byteString, arrayList);
        }
        ByteString byteString2 = this.dark_mode;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("dark_mode=", byteString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmbeddedImage{", "}", 0, null, null, 56);
    }
}

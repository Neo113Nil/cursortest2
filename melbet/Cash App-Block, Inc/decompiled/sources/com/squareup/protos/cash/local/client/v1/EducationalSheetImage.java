package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import com.squareup.protos.cash.groups.GroupParticipant;
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
public final class EducationalSheetImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EducationalSheetImage> CREATOR;
    public final zzhu image;

    static {
        EducationalSheetImage$Companion$ADAPTER$1 educationalSheetImage$Companion$ADAPTER$1 = new EducationalSheetImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EducationalSheetImage.class), "type.googleapis.com/squareup.cash.local.client.v1.EducationalSheetImage", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = educationalSheetImage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(educationalSheetImage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationalSheetImage(zzhu zzhuVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = zzhuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EducationalSheetImage)) {
            return false;
        }
        EducationalSheetImage educationalSheetImage = (EducationalSheetImage) obj;
        return Intrinsics.areEqual(unknownFields(), educationalSheetImage.unknownFields()) && Intrinsics.areEqual(this.image, educationalSheetImage.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzhu zzhuVar = this.image;
        int hashCode2 = hashCode + (zzhuVar != null ? zzhuVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(23);
        builder.f1276type = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzhu zzhuVar = this.image;
        if (zzhuVar != null) {
            arrayList.add("image=" + zzhuVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EducationalSheetImage{", "}", 0, null, null, 56);
    }
}

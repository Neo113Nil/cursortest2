package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class PaginatedSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaginatedSheet> CREATOR;
    public final List contents;
    public final EducationalSheetButton dismiss_button;
    public final EducationalSheetButton primary_button;

    static {
        PaginatedSheet$Companion$ADAPTER$1 paginatedSheet$Companion$ADAPTER$1 = new PaginatedSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaginatedSheet.class), "type.googleapis.com/squareup.cash.local.client.v1.PaginatedSheet", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = paginatedSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paginatedSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginatedSheet(List list, EducationalSheetButton educationalSheetButton, EducationalSheetButton educationalSheetButton2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.primary_button = educationalSheetButton;
        this.dismiss_button = educationalSheetButton2;
        this.contents = TransactorKt.immutableCopyOf("contents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaginatedSheet)) {
            return false;
        }
        PaginatedSheet paginatedSheet = (PaginatedSheet) obj;
        return Intrinsics.areEqual(unknownFields(), paginatedSheet.unknownFields()) && Intrinsics.areEqual(this.contents, paginatedSheet.contents) && Intrinsics.areEqual(this.primary_button, paginatedSheet.primary_button) && Intrinsics.areEqual(this.dismiss_button, paginatedSheet.dismiss_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.contents);
        EducationalSheetButton educationalSheetButton = this.primary_button;
        int hashCode = (m + (educationalSheetButton != null ? educationalSheetButton.hashCode() : 0)) * 37;
        EducationalSheetButton educationalSheetButton2 = this.dismiss_button;
        int hashCode2 = hashCode + (educationalSheetButton2 != null ? educationalSheetButton2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(5, false);
        builder.advertisement_data = this.contents;
        builder.transmission_level = this.primary_button;
        builder.frequency = this.dismiss_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.contents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contents=", arrayList, list);
        }
        EducationalSheetButton educationalSheetButton = this.primary_button;
        if (educationalSheetButton != null) {
            arrayList.add("primary_button=" + educationalSheetButton);
        }
        EducationalSheetButton educationalSheetButton2 = this.dismiss_button;
        if (educationalSheetButton2 != null) {
            arrayList.add("dismiss_button=" + educationalSheetButton2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaginatedSheet{", "}", 0, null, null, 56);
    }
}

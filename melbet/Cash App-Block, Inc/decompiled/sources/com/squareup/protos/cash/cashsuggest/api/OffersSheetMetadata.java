package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class OffersSheetMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersSheetMetadata> CREATOR;
    public final String source_screen;
    public final String source_section;

    static {
        OffersSheetMetadata$Companion$ADAPTER$1 offersSheetMetadata$Companion$ADAPTER$1 = new OffersSheetMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OffersSheetMetadata.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersSheetMetadata", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersSheet.proto");
        ADAPTER = offersSheetMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offersSheetMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetMetadata(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source_screen = str;
        this.source_section = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersSheetMetadata)) {
            return false;
        }
        OffersSheetMetadata offersSheetMetadata = (OffersSheetMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), offersSheetMetadata.unknownFields()) && Intrinsics.areEqual(this.source_screen, offersSheetMetadata.source_screen) && Intrinsics.areEqual(this.source_section, offersSheetMetadata.source_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.source_screen;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.source_section;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(21);
        builder.prefix = this.source_screen;
        builder.name = this.source_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.source_screen;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_screen=", arrayList);
        }
        String str2 = this.source_section;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "source_section=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersSheetMetadata{", "}", 0, null, null, 56);
    }

    public /* synthetic */ OffersSheetMetadata(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }
}

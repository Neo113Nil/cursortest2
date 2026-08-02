package com.squareup.protos.cash.discover.api.app.v2.api;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/discover/api/app/v2/api/SectionPageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Asset$Builder;", "Builder", "RowSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SectionPageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectionPageResponse> CREATOR;
    public final SectionPageResponse$Page$RowSection page;

    static {
        SectionPageResponse$Companion$ADAPTER$1 sectionPageResponse$Companion$ADAPTER$1 = new SectionPageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionPageResponse.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.api.SectionPageResponse", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/api/section.proto");
        ADAPTER = sectionPageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sectionPageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionPageResponse(SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.page = sectionPageResponse$Page$RowSection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionPageResponse)) {
            return false;
        }
        SectionPageResponse sectionPageResponse = (SectionPageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), sectionPageResponse.unknownFields()) && Intrinsics.areEqual(this.page, sectionPageResponse.page);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = this.page;
        int hashCode2 = hashCode + (sectionPageResponse$Page$RowSection != null ? sectionPageResponse$Page$RowSection.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(15);
        builder.asset_type = this.page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = this.page;
        if (sectionPageResponse$Page$RowSection != null) {
            arrayList.add("page=" + sectionPageResponse$Page$RowSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionPageResponse{", "}", 0, null, null, 56);
    }
}

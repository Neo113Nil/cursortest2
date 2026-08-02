package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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
public final class FamilyTileContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamilyTileContent> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final FamilyTileContent$Type$SponsorTileContent f1247type;

    static {
        FamilyTileContent$Companion$ADAPTER$1 familyTileContent$Companion$ADAPTER$1 = new FamilyTileContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FamilyTileContent.class), "type.googleapis.com/squareup.cash.aegis.sync_values.FamilyTileContent", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyTile.proto");
        ADAPTER = familyTileContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(familyTileContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyTileContent(FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1247type = familyTileContent$Type$SponsorTileContent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyTileContent)) {
            return false;
        }
        FamilyTileContent familyTileContent = (FamilyTileContent) obj;
        return Intrinsics.areEqual(unknownFields(), familyTileContent.unknownFields()) && Intrinsics.areEqual(this.f1247type, familyTileContent.f1247type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = this.f1247type;
        int hashCode2 = hashCode + (familyTileContent$Type$SponsorTileContent != null ? familyTileContent$Type$SponsorTileContent.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(22);
        builder.f1245type = this.f1247type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = this.f1247type;
        if (familyTileContent$Type$SponsorTileContent != null) {
            arrayList.add("type=" + familyTileContent$Type$SponsorTileContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamilyTileContent{", "}", 0, null, null, 56);
    }
}

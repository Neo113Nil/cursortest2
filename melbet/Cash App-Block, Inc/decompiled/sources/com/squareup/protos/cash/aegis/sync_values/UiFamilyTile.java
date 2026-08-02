package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.localization.LocalizedString;
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
public final class UiFamilyTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiFamilyTile> CREATOR;
    public final FamilyTileContent family_tile_content;
    public final LocalizedString localized_title;
    public final String tap_url;

    static {
        UiFamilyTile$Companion$ADAPTER$1 uiFamilyTile$Companion$ADAPTER$1 = new UiFamilyTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiFamilyTile.class), "type.googleapis.com/squareup.cash.aegis.sync_values.UiFamilyTile", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyTile.proto");
        ADAPTER = uiFamilyTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiFamilyTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiFamilyTile(LocalizedString localizedString, String str, FamilyTileContent familyTileContent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.localized_title = localizedString;
        this.tap_url = str;
        this.family_tile_content = familyTileContent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiFamilyTile)) {
            return false;
        }
        UiFamilyTile uiFamilyTile = (UiFamilyTile) obj;
        return Intrinsics.areEqual(unknownFields(), uiFamilyTile.unknownFields()) && Intrinsics.areEqual(this.localized_title, uiFamilyTile.localized_title) && Intrinsics.areEqual(this.tap_url, uiFamilyTile.tap_url) && Intrinsics.areEqual(this.family_tile_content, uiFamilyTile.family_tile_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.localized_title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str = this.tap_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        FamilyTileContent familyTileContent = this.family_tile_content;
        int hashCode4 = hashCode3 + (familyTileContent != null ? familyTileContent.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(8);
        builder.header_button = this.localized_title;
        builder.header_text = this.tap_url;
        builder.groups = this.family_tile_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.localized_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizedString, arrayList);
        }
        String str = this.tap_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tap_url=", arrayList);
        }
        FamilyTileContent familyTileContent = this.family_tile_content;
        if (familyTileContent != null) {
            arrayList.add("family_tile_content=" + familyTileContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiFamilyTile{", "}", 0, null, null, 56);
    }
}

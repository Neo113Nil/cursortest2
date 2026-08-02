package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.Bullet;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
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
public final class SearchCommonMessageSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonMessageSection> CREATOR;
    public final Image picture;
    public final Text primary_text;
    public final Text secondary_text;

    static {
        SearchCommonMessageSection$Companion$ADAPTER$1 searchCommonMessageSection$Companion$ADAPTER$1 = new SearchCommonMessageSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonMessageSection.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonMessageSection", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonMessageSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonMessageSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonMessageSection(Image image, Text text, Text text2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.picture = image;
        this.primary_text = text;
        this.secondary_text = text2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonMessageSection)) {
            return false;
        }
        SearchCommonMessageSection searchCommonMessageSection = (SearchCommonMessageSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonMessageSection.unknownFields()) && Intrinsics.areEqual(this.picture, searchCommonMessageSection.picture) && Intrinsics.areEqual(this.primary_text, searchCommonMessageSection.primary_text) && Intrinsics.areEqual(this.secondary_text, searchCommonMessageSection.secondary_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.picture;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Text text = this.primary_text;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.secondary_text;
        int hashCode4 = hashCode3 + (text2 != null ? text2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Bullet.Builder builder = new Bullet.Builder(1);
        builder.bullet_icon = this.picture;
        builder.bullet_title = this.primary_text;
        builder.bullet_body = this.secondary_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.picture;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
        }
        Text text = this.primary_text;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_text=", text, arrayList);
        }
        Text text2 = this.secondary_text;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_text=", text2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonMessageSection{", "}", 0, null, null, 56);
    }
}

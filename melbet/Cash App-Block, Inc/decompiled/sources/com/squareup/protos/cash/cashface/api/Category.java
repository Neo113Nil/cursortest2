package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class Category extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Category> CREATOR;
    public final String display_category;

    static {
        Category$Companion$ADAPTER$1 category$Companion$ADAPTER$1 = new Category$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Category.class), "type.googleapis.com/squareup.cash.cashface.api.Category", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = category$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(category$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Category(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_category = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return Intrinsics.areEqual(unknownFields(), category.unknownFields()) && Intrinsics.areEqual(this.display_category, category.display_category);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_category;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(5);
        builder.banner_color = this.display_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.display_category != null) {
            arrayList.add("display_category=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Category{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import app.cash.zipline.internal.bridge.InternalSerializersKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class ProfileDirectoryRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileDirectoryRow> CREATOR;
    public final String account_holder_token;
    public final InternalSerializersKt action;
    public final String action_url;
    public final Avatar avatar;
    public final Button button;
    public final Image icon;
    public final String merchantein_token;
    public final Metadata metadata;
    public final HighlightText sub_child_title;
    public final HighlightText subtitle;
    public final HighlightText title;
    public final String token;

    static {
        ProfileDirectoryRow$Companion$ADAPTER$1 profileDirectoryRow$Companion$ADAPTER$1 = new ProfileDirectoryRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileDirectoryRow.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectoryRow", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = profileDirectoryRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectoryRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDirectoryRow(String str, String str2, String str3, Avatar avatar, HighlightText highlightText, HighlightText highlightText2, HighlightText highlightText3, Image image, String str4, Button button, Metadata metadata, InternalSerializersKt internalSerializersKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.account_holder_token = str2;
        this.merchantein_token = str3;
        this.avatar = avatar;
        this.title = highlightText;
        this.subtitle = highlightText2;
        this.sub_child_title = highlightText3;
        this.icon = image;
        this.action_url = str4;
        this.button = button;
        this.metadata = metadata;
        this.action = internalSerializersKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileDirectoryRow)) {
            return false;
        }
        ProfileDirectoryRow profileDirectoryRow = (ProfileDirectoryRow) obj;
        return Intrinsics.areEqual(unknownFields(), profileDirectoryRow.unknownFields()) && Intrinsics.areEqual(this.token, profileDirectoryRow.token) && Intrinsics.areEqual(this.account_holder_token, profileDirectoryRow.account_holder_token) && Intrinsics.areEqual(this.merchantein_token, profileDirectoryRow.merchantein_token) && Intrinsics.areEqual(this.avatar, profileDirectoryRow.avatar) && Intrinsics.areEqual(this.title, profileDirectoryRow.title) && Intrinsics.areEqual(this.subtitle, profileDirectoryRow.subtitle) && Intrinsics.areEqual(this.sub_child_title, profileDirectoryRow.sub_child_title) && Intrinsics.areEqual(this.icon, profileDirectoryRow.icon) && Intrinsics.areEqual(this.action_url, profileDirectoryRow.action_url) && Intrinsics.areEqual(this.button, profileDirectoryRow.button) && Intrinsics.areEqual(this.metadata, profileDirectoryRow.metadata) && Intrinsics.areEqual(this.action, profileDirectoryRow.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_holder_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.merchantein_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        HighlightText highlightText = this.title;
        int hashCode6 = (hashCode5 + (highlightText != null ? highlightText.hashCode() : 0)) * 37;
        HighlightText highlightText2 = this.subtitle;
        int hashCode7 = (hashCode6 + (highlightText2 != null ? highlightText2.hashCode() : 0)) * 37;
        HighlightText highlightText3 = this.sub_child_title;
        int hashCode8 = (hashCode7 + (highlightText3 != null ? highlightText3.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode9 = (hashCode8 + (image != null ? image.hashCode() : 0)) * 37;
        String str4 = this.action_url;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode11 = (hashCode10 + (button != null ? button.hashCode() : 0)) * 37;
        Metadata metadata = this.metadata;
        int hashCode12 = (hashCode11 + (metadata != null ? metadata.hashCode() : 0)) * 37;
        InternalSerializersKt internalSerializersKt = this.action;
        int hashCode13 = hashCode12 + (internalSerializersKt != null ? internalSerializersKt.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(7, false);
        builder.string_literal = this.token;
        builder.key_path_ref = this.account_holder_token;
        builder.int_literal = this.merchantein_token;
        builder.float_literal = this.avatar;
        builder.bool_literal = this.title;
        builder.blob_literal = this.subtitle;
        builder.unary_op = this.sub_child_title;
        builder.binary_op = this.icon;
        builder.conditional_op = this.action_url;
        builder.filter_op = this.button;
        builder.collection_literal = this.metadata;
        builder.format_string_op = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.account_holder_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_holder_token=", arrayList);
        }
        String str3 = this.merchantein_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchantein_token=", arrayList);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        if (this.subtitle != null) {
            arrayList.add("subtitle=██");
        }
        if (this.sub_child_title != null) {
            arrayList.add("sub_child_title=██");
        }
        if (this.icon != null) {
            arrayList.add("icon=██");
        }
        if (this.action_url != null) {
            arrayList.add("action_url=██");
        }
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        Metadata metadata = this.metadata;
        if (metadata != null) {
            arrayList.add("metadata=" + metadata);
        }
        InternalSerializersKt internalSerializersKt = this.action;
        if (internalSerializersKt != null) {
            arrayList.add("action=" + internalSerializersKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileDirectoryRow{", "}", 0, null, null, 56);
    }
}

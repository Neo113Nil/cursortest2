package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
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
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class FullCashtag extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FullCashtag> CREATOR;
    public final String avatar_version;
    public final String base_dot_app_url;
    public final String cashtag_display_name;
    public final String cashtag_qr_image_url;
    public final String cashtag_url;
    public final String cashtag_url_display_text;
    public final CurrencyCode currency;
    public final String printable_cashtag_qr_image_url;

    static {
        FullCashtag$Companion$ADAPTER$1 fullCashtag$Companion$ADAPTER$1 = new FullCashtag$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullCashtag.class), "type.googleapis.com/squareup.franklin.ui.FullCashtag", Syntax.PROTO_2, null, "squareup/franklin/ui/full_cashtag.proto");
        ADAPTER = fullCashtag$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fullCashtag$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullCashtag(String str, String str2, CurrencyCode currencyCode, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.base_dot_app_url = str;
        this.cashtag_display_name = str2;
        this.currency = currencyCode;
        this.avatar_version = str3;
        this.cashtag_url = str4;
        this.cashtag_url_display_text = str5;
        this.cashtag_qr_image_url = str6;
        this.printable_cashtag_qr_image_url = str7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullCashtag)) {
            return false;
        }
        FullCashtag fullCashtag = (FullCashtag) obj;
        return Intrinsics.areEqual(unknownFields(), fullCashtag.unknownFields()) && Intrinsics.areEqual(this.base_dot_app_url, fullCashtag.base_dot_app_url) && Intrinsics.areEqual(this.cashtag_display_name, fullCashtag.cashtag_display_name) && this.currency == fullCashtag.currency && Intrinsics.areEqual(this.avatar_version, fullCashtag.avatar_version) && Intrinsics.areEqual(this.cashtag_url, fullCashtag.cashtag_url) && Intrinsics.areEqual(this.cashtag_url_display_text, fullCashtag.cashtag_url_display_text) && Intrinsics.areEqual(this.cashtag_qr_image_url, fullCashtag.cashtag_qr_image_url) && Intrinsics.areEqual(this.printable_cashtag_qr_image_url, fullCashtag.printable_cashtag_qr_image_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.base_dot_app_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag_display_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CurrencyCode currencyCode = this.currency;
        int hashCode4 = (hashCode3 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        String str3 = this.avatar_version;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cashtag_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cashtag_url_display_text;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cashtag_qr_image_url;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.printable_cashtag_qr_image_url;
        int hashCode9 = hashCode8 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(3);
        builder.token = this.base_dot_app_url;
        builder.icon_unicode = this.cashtag_display_name;
        builder.met_goal = this.currency;
        builder.completion_token = this.avatar_version;
        builder.label = this.cashtag_url;
        builder.goal_flow_parameters = this.cashtag_url_display_text;
        builder.goal_amount = this.cashtag_qr_image_url;
        builder.goal_progress_percentage = this.printable_cashtag_qr_image_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.base_dot_app_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "base_dot_app_url=", arrayList);
        }
        if (this.cashtag_display_name != null) {
            arrayList.add("cashtag_display_name=██");
        }
        CurrencyCode currencyCode = this.currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
        }
        String str2 = this.avatar_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "avatar_version=", arrayList);
        }
        if (this.cashtag_url != null) {
            arrayList.add("cashtag_url=██");
        }
        if (this.cashtag_url_display_text != null) {
            arrayList.add("cashtag_url_display_text=██");
        }
        if (this.cashtag_qr_image_url != null) {
            arrayList.add("cashtag_qr_image_url=██");
        }
        if (this.printable_cashtag_qr_image_url != null) {
            arrayList.add("printable_cashtag_qr_image_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FullCashtag{", "}", 0, null, null, 56);
    }
}

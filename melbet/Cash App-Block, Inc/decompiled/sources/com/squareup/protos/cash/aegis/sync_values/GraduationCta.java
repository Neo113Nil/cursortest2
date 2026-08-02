package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.localization.LocalizableString;
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

/* loaded from: classes7.dex */
public final class GraduationCta extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GraduationCta> CREATOR;
    public final String button_text;
    public final Image image;
    public final LocalizableString localizable_button_text;
    public final LocalizableString localizable_subtext;
    public final LocalizableString localizable_title;
    public final String subtext;
    public final String title;
    public final String url;

    static {
        GraduationCta$Companion$ADAPTER$1 graduationCta$Companion$ADAPTER$1 = new GraduationCta$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GraduationCta.class), "type.googleapis.com/squareup.cash.aegis.sync_values.GraduationCta", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = graduationCta$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(graduationCta$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationCta(String str, String str2, String str3, String str4, Image image, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtext = str2;
        this.button_text = str3;
        this.url = str4;
        this.image = image;
        this.localizable_title = localizableString;
        this.localizable_subtext = localizableString2;
        this.localizable_button_text = localizableString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GraduationCta)) {
            return false;
        }
        GraduationCta graduationCta = (GraduationCta) obj;
        return Intrinsics.areEqual(unknownFields(), graduationCta.unknownFields()) && Intrinsics.areEqual(this.title, graduationCta.title) && Intrinsics.areEqual(this.subtext, graduationCta.subtext) && Intrinsics.areEqual(this.button_text, graduationCta.button_text) && Intrinsics.areEqual(this.url, graduationCta.url) && Intrinsics.areEqual(this.image, graduationCta.image) && Intrinsics.areEqual(this.localizable_title, graduationCta.localizable_title) && Intrinsics.areEqual(this.localizable_subtext, graduationCta.localizable_subtext) && Intrinsics.areEqual(this.localizable_button_text, graduationCta.localizable_button_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtext;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_title;
        int hashCode7 = (hashCode6 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_subtext;
        int hashCode8 = (hashCode7 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_button_text;
        int hashCode9 = hashCode8 + (localizableString3 != null ? localizableString3.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(6, false);
        builder.external_token = this.title;
        builder.customer_token = this.subtext;
        builder.external_version = this.button_text;
        builder.updated_at = this.url;
        builder.created_at = this.image;
        builder.is_badged = this.localizable_title;
        builder.item_type = this.localizable_subtext;
        builder.count_groups = this.localizable_button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtext;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtext=", arrayList);
        }
        String str3 = this.button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
        }
        String str4 = this.url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "url=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        LocalizableString localizableString2 = this.localizable_subtext;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_subtext=", localizableString2, arrayList);
        }
        LocalizableString localizableString3 = this.localizable_button_text;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_button_text=", localizableString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GraduationCta{", "}", 0, null, null, 56);
    }
}

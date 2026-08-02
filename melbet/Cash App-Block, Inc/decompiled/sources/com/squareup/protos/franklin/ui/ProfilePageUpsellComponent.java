package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProfilePageUpsellComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfilePageUpsellComponent> CREATOR;
    public final String entity_id;
    public final String header_text;
    public final Icon icon;
    public final String subtext;
    public final String url_on_press;

    public enum Icon implements WireEnum {
        VERIFYING(1),
        VERIFICATION_FAILED(2);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final ProfilePageUpsellComponent$Icon$Companion$ADAPTER$1 ADAPTER = new ProfilePageUpsellComponent$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

        Icon(int i) {
            this.value = i;
        }

        public static final Icon fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return VERIFYING;
            }
            if (i != 2) {
                return null;
            }
            return VERIFICATION_FAILED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ProfilePageUpsellComponent$Companion$ADAPTER$1 profilePageUpsellComponent$Companion$ADAPTER$1 = new ProfilePageUpsellComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfilePageUpsellComponent.class), "type.googleapis.com/squareup.franklin.ui.ProfilePageUpsellComponent", Syntax.PROTO_2, null, "squareup/franklin/ui/profile_page_upsell_component.proto");
        ADAPTER = profilePageUpsellComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profilePageUpsellComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePageUpsellComponent(Icon icon, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.header_text = str;
        this.subtext = str2;
        this.url_on_press = str3;
        this.entity_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfilePageUpsellComponent)) {
            return false;
        }
        ProfilePageUpsellComponent profilePageUpsellComponent = (ProfilePageUpsellComponent) obj;
        return Intrinsics.areEqual(unknownFields(), profilePageUpsellComponent.unknownFields()) && this.icon == profilePageUpsellComponent.icon && Intrinsics.areEqual(this.header_text, profilePageUpsellComponent.header_text) && Intrinsics.areEqual(this.subtext, profilePageUpsellComponent.subtext) && Intrinsics.areEqual(this.url_on_press, profilePageUpsellComponent.url_on_press) && Intrinsics.areEqual(this.entity_id, profilePageUpsellComponent.entity_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.header_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtext;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.url_on_press;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.entity_id;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(21, false);
        builder.alias = this.icon;
        builder.verified = this.header_text;
        builder.expires_at = this.subtext;
        builder.version = this.url_on_press;
        builder.display_date = this.entity_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str = this.header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
        }
        String str2 = this.subtext;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtext=", arrayList);
        }
        String str3 = this.url_on_press;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "url_on_press=", arrayList);
        }
        String str4 = this.entity_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "entity_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfilePageUpsellComponent{", "}", 0, null, null, 56);
    }
}

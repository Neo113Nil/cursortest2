package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileRow;
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
public final class SocialProfile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SocialProfile> CREATOR;
    public final String label;
    public final String service;
    public final String url;
    public final String user_identifier;
    public final String username;

    static {
        SocialProfile$Companion$ADAPTER$1 socialProfile$Companion$ADAPTER$1 = new SocialProfile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SocialProfile.class), "type.googleapis.com/squareup.cash.contacts.app.SocialProfile", Syntax.PROTO_2, null, "squareup/cash/contacts/app/AddressBookContact.proto");
        ADAPTER = socialProfile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(socialProfile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialProfile(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.service = str;
        this.url = str2;
        this.username = str3;
        this.user_identifier = str4;
        this.label = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocialProfile)) {
            return false;
        }
        SocialProfile socialProfile = (SocialProfile) obj;
        return Intrinsics.areEqual(unknownFields(), socialProfile.unknownFields()) && Intrinsics.areEqual(this.service, socialProfile.service) && Intrinsics.areEqual(this.url, socialProfile.url) && Intrinsics.areEqual(this.username, socialProfile.username) && Intrinsics.areEqual(this.user_identifier, socialProfile.user_identifier) && Intrinsics.areEqual(this.label, socialProfile.label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.service;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.username;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.user_identifier;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.label;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileRow.Builder builder = new ProfileRow.Builder(4);
        builder.client_route = this.service;
        builder.icon_id = this.url;
        builder.title = this.username;
        builder.subtitle = this.user_identifier;
        builder.call_to_action = this.label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.service;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "service=", arrayList);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        String str3 = this.username;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "username=", arrayList);
        }
        String str4 = this.user_identifier;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "user_identifier=", arrayList);
        }
        String str5 = this.label;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "label=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SocialProfile{", "}", 0, null, null, 56);
    }
}

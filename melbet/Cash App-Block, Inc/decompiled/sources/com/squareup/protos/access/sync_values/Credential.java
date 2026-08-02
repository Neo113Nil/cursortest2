package com.squareup.protos.access.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiLoyaltyAccount;
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
public final class Credential extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Credential> CREATOR;
    public final String description;
    public final String id;
    public final Long last_used_at_millis;
    public final String localized_creation_device_string;
    public final String localized_creation_string;
    public final Long registered_at_millis;

    static {
        Credential$Companion$ADAPTER$1 credential$Companion$ADAPTER$1 = new Credential$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Credential.class), "type.googleapis.com/squareup.access.sync_values.Credential", Syntax.PROTO_2, null, "squareup/access/sync_values.proto");
        ADAPTER = credential$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(credential$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Credential(String str, String str2, Long l, Long l2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.description = str2;
        this.registered_at_millis = l;
        this.last_used_at_millis = l2;
        this.localized_creation_string = str3;
        this.localized_creation_device_string = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return Intrinsics.areEqual(unknownFields(), credential.unknownFields()) && Intrinsics.areEqual(this.id, credential.id) && Intrinsics.areEqual(this.description, credential.description) && Intrinsics.areEqual(this.registered_at_millis, credential.registered_at_millis) && Intrinsics.areEqual(this.last_used_at_millis, credential.last_used_at_millis) && Intrinsics.areEqual(this.localized_creation_string, credential.localized_creation_string) && Intrinsics.areEqual(this.localized_creation_device_string, credential.localized_creation_device_string);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.registered_at_millis;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.last_used_at_millis;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str3 = this.localized_creation_string;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.localized_creation_device_string;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiLoyaltyAccount.Builder builder = new UiLoyaltyAccount.Builder(1);
        builder.id = this.id;
        builder.phone_number = this.description;
        builder.points_earned = this.registered_at_millis;
        builder.last_time_visited = this.last_used_at_millis;
        builder.account_status_url = this.localized_creation_string;
        builder.loyalty_program_id = this.localized_creation_device_string;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Long l = this.registered_at_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("registered_at_millis=", l, arrayList);
        }
        Long l2 = this.last_used_at_millis;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_used_at_millis=", l2, arrayList);
        }
        String str3 = this.localized_creation_string;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "localized_creation_string=", arrayList);
        }
        String str4 = this.localized_creation_device_string;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "localized_creation_device_string=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Credential{", "}", 0, null, null, 56);
    }
}

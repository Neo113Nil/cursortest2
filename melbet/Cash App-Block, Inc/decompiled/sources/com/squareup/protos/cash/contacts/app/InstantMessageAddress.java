package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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
public final class InstantMessageAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstantMessageAddress> CREATOR;
    public final String label;
    public final String service;
    public final String username;

    static {
        InstantMessageAddress$Companion$ADAPTER$1 instantMessageAddress$Companion$ADAPTER$1 = new InstantMessageAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstantMessageAddress.class), "type.googleapis.com/squareup.cash.contacts.app.InstantMessageAddress", Syntax.PROTO_2, null, "squareup/cash/contacts/app/AddressBookContact.proto");
        ADAPTER = instantMessageAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instantMessageAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantMessageAddress(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.service = str;
        this.username = str2;
        this.label = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstantMessageAddress)) {
            return false;
        }
        InstantMessageAddress instantMessageAddress = (InstantMessageAddress) obj;
        return Intrinsics.areEqual(unknownFields(), instantMessageAddress.unknownFields()) && Intrinsics.areEqual(this.service, instantMessageAddress.service) && Intrinsics.areEqual(this.username, instantMessageAddress.username) && Intrinsics.areEqual(this.label, instantMessageAddress.label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.service;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.username;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.label;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(7);
        builder.contact_support_url = this.service;
        builder.privacy_policy_url = this.username;
        builder.terms_of_service_url = this.label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.service;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "service=", arrayList);
        }
        String str2 = this.username;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "username=", arrayList);
        }
        String str3 = this.label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstantMessageAddress{", "}", 0, null, null, 56);
    }
}

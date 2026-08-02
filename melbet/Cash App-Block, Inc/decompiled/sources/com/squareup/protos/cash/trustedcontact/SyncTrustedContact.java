package com.squareup.protos.cash.trustedcontact;

import android.os.Parcelable;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.time.DateTime;
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

/* loaded from: classes8.dex */
public final class SyncTrustedContact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncTrustedContact> CREATOR;
    public final GlobalAddress address;
    public final String email_address;
    public final String first_name;
    public final String last_name;
    public final String phone_number;

    static {
        SyncTrustedContact$Companion$ADAPTER$1 syncTrustedContact$Companion$ADAPTER$1 = new SyncTrustedContact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncTrustedContact.class), "type.googleapis.com/squareup.cash.trustedcontact.SyncTrustedContact", Syntax.PROTO_2, null, "squareup/cash/trustedcontact/trusted_contact.proto");
        ADAPTER = syncTrustedContact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncTrustedContact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncTrustedContact(GlobalAddress globalAddress, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.first_name = str;
        this.last_name = str2;
        this.email_address = str3;
        this.phone_number = str4;
        this.address = globalAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncTrustedContact)) {
            return false;
        }
        SyncTrustedContact syncTrustedContact = (SyncTrustedContact) obj;
        return Intrinsics.areEqual(unknownFields(), syncTrustedContact.unknownFields()) && Intrinsics.areEqual(this.first_name, syncTrustedContact.first_name) && Intrinsics.areEqual(this.last_name, syncTrustedContact.last_name) && Intrinsics.areEqual(this.email_address, syncTrustedContact.email_address) && Intrinsics.areEqual(this.phone_number, syncTrustedContact.phone_number) && Intrinsics.areEqual(this.address, syncTrustedContact.address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.first_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.email_address;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.phone_number;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.address;
        int hashCode6 = hashCode5 + (globalAddress != null ? globalAddress.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(20, false);
        builder.posix_tz = this.first_name;
        builder.instant_usec = this.last_name;
        builder.ordinal = this.email_address;
        builder.timezone_offset_min = this.phone_number;
        builder.tz_name = this.address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.first_name != null) {
            arrayList.add("first_name=██");
        }
        if (this.last_name != null) {
            arrayList.add("last_name=██");
        }
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        if (this.phone_number != null) {
            arrayList.add("phone_number=██");
        }
        if (this.address != null) {
            arrayList.add("address=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncTrustedContact{", "}", 0, null, null, 56);
    }
}

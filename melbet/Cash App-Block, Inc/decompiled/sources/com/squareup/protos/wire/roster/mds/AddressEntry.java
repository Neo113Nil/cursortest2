package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.address.Verification;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class AddressEntry extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddressEntry> CREATOR;
    public final GlobalAddress address;
    public final String address_token;
    public final String agrex_code;
    public final Names care_of;
    public final Boolean is_corrected;
    public final Boolean is_personal;
    public final Names recipient;
    public final List script_addresses;
    public final Phone shipping_phone_number;
    public final Long updated_ts;
    public final List uses;
    public final Verification verification;

    static {
        AddressEntry$Companion$ADAPTER$1 addressEntry$Companion$ADAPTER$1 = new AddressEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddressEntry.class), "type.googleapis.com/squareup.roster.mds.AddressEntry", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = addressEntry$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addressEntry$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressEntry(String str, GlobalAddress globalAddress, String str2, List list, Boolean bool, Names names, Names names2, Phone phone, Boolean bool2, Long l, List list2, Verification verification, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.address_token = str;
        this.address = globalAddress;
        this.agrex_code = str2;
        this.is_corrected = bool;
        this.recipient = names;
        this.care_of = names2;
        this.shipping_phone_number = phone;
        this.is_personal = bool2;
        this.updated_ts = l;
        this.verification = verification;
        this.uses = TransactorKt.immutableCopyOf("uses", list);
        this.script_addresses = TransactorKt.immutableCopyOf("script_addresses", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddressEntry)) {
            return false;
        }
        AddressEntry addressEntry = (AddressEntry) obj;
        return Intrinsics.areEqual(unknownFields(), addressEntry.unknownFields()) && Intrinsics.areEqual(this.address_token, addressEntry.address_token) && Intrinsics.areEqual(this.address, addressEntry.address) && Intrinsics.areEqual(this.agrex_code, addressEntry.agrex_code) && Intrinsics.areEqual(this.uses, addressEntry.uses) && Intrinsics.areEqual(this.is_corrected, addressEntry.is_corrected) && Intrinsics.areEqual(this.recipient, addressEntry.recipient) && Intrinsics.areEqual(this.care_of, addressEntry.care_of) && Intrinsics.areEqual(this.shipping_phone_number, addressEntry.shipping_phone_number) && Intrinsics.areEqual(this.is_personal, addressEntry.is_personal) && Intrinsics.areEqual(this.updated_ts, addressEntry.updated_ts) && Intrinsics.areEqual(this.script_addresses, addressEntry.script_addresses) && Intrinsics.areEqual(this.verification, addressEntry.verification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.address_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.address;
        int hashCode3 = (hashCode2 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        String str2 = this.agrex_code;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.uses);
        Boolean bool = this.is_corrected;
        int hashCode4 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Names names = this.recipient;
        int hashCode5 = (hashCode4 + (names != null ? names.hashCode() : 0)) * 37;
        Names names2 = this.care_of;
        int hashCode6 = (hashCode5 + (names2 != null ? names2.hashCode() : 0)) * 37;
        Phone phone = this.shipping_phone_number;
        int hashCode7 = (hashCode6 + (phone != null ? phone.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_personal;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Long l = this.updated_ts;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.script_addresses);
        Verification verification = this.verification;
        int hashCode9 = m2 + (verification != null ? verification.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(28, false);
        builder.string_literal = this.address_token;
        builder.key_path_ref = this.address;
        builder.float_literal = this.agrex_code;
        builder.blob_literal = this.uses;
        builder.bool_literal = this.is_corrected;
        builder.unary_op = this.recipient;
        builder.binary_op = this.care_of;
        builder.conditional_op = this.shipping_phone_number;
        builder.filter_op = this.is_personal;
        builder.int_literal = this.updated_ts;
        builder.collection_literal = this.script_addresses;
        builder.format_string_op = this.verification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.address_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "address_token=", arrayList);
        }
        GlobalAddress globalAddress = this.address;
        if (globalAddress != null) {
            arrayList.add("address=" + globalAddress);
        }
        if (this.agrex_code != null) {
            arrayList.add("agrex_code=██");
        }
        List list = this.uses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("uses=", arrayList, list);
        }
        Boolean bool = this.is_corrected;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_corrected=", bool, arrayList);
        }
        if (this.recipient != null) {
            arrayList.add("recipient=██");
        }
        if (this.care_of != null) {
            arrayList.add("care_of=██");
        }
        if (this.shipping_phone_number != null) {
            arrayList.add("shipping_phone_number=██");
        }
        Boolean bool2 = this.is_personal;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_personal=", bool2, arrayList);
        }
        Long l = this.updated_ts;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_ts=", l, arrayList);
        }
        List list2 = this.script_addresses;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("script_addresses=", arrayList, list2);
        }
        Verification verification = this.verification;
        if (verification != null) {
            arrayList.add("verification=" + verification);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddressEntry{", "}", 0, null, null, 56);
    }
}

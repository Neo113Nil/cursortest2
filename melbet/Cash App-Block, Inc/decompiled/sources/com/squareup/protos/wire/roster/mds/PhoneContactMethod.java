package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import com.squareup.protos.common.location.Phone;
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
import squareup.cash.earnings.EarningTool;

/* loaded from: classes8.dex */
public final class PhoneContactMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PhoneContactMethod> CREATOR;
    public final Phone phone_number;

    static {
        PhoneContactMethod$Companion$ADAPTER$1 phoneContactMethod$Companion$ADAPTER$1 = new PhoneContactMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PhoneContactMethod.class), "type.googleapis.com/squareup.roster.mds.PhoneContactMethod", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = phoneContactMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(phoneContactMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneContactMethod(Phone phone, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.phone_number = phone;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneContactMethod)) {
            return false;
        }
        PhoneContactMethod phoneContactMethod = (PhoneContactMethod) obj;
        return Intrinsics.areEqual(unknownFields(), phoneContactMethod.unknownFields()) && Intrinsics.areEqual(this.phone_number, phoneContactMethod.phone_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Phone phone = this.phone_number;
        int hashCode2 = hashCode + (phone != null ? phone.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(4);
        builder.tool = this.phone_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Phone phone = this.phone_number;
        if (phone != null) {
            arrayList.add("phone_number=" + phone);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PhoneContactMethod{", "}", 0, null, null, 56);
    }
}

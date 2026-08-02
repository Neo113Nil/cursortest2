package com.squareup.protos.common.location;

import android.os.Parcelable;
import com.squareup.protos.common.Header;
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
public final class Phone extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Phone> CREATOR;
    public final String calling_code;
    public final String number;

    static {
        Phone$Companion$ADAPTER$1 phone$Companion$ADAPTER$1 = new Phone$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Phone.class), "type.googleapis.com/squareup.common.location.Phone", Syntax.PROTO_2, null, "squareup/common/location.proto");
        ADAPTER = phone$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(phone$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Phone(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.calling_code = str;
        this.number = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        return Intrinsics.areEqual(unknownFields(), phone.unknownFields()) && Intrinsics.areEqual(this.calling_code, phone.calling_code) && Intrinsics.areEqual(this.number, phone.number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.calling_code;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.number;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(23);
        builder.name = this.calling_code;
        builder.value = this.number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.calling_code != null) {
            arrayList.add("calling_code=██");
        }
        if (this.number != null) {
            arrayList.add("number=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Phone{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Phone(String str) {
        this(null, str, ByteString.EMPTY);
    }
}

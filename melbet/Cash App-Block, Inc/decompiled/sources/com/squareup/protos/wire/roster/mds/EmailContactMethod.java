package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
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
import xyz.block.protos.genie.OpenURL;

/* loaded from: classes8.dex */
public final class EmailContactMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmailContactMethod> CREATOR;
    public final String email_address;

    static {
        EmailContactMethod$Companion$ADAPTER$1 emailContactMethod$Companion$ADAPTER$1 = new EmailContactMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmailContactMethod.class), "type.googleapis.com/squareup.roster.mds.EmailContactMethod", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = emailContactMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(emailContactMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailContactMethod(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.email_address = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmailContactMethod)) {
            return false;
        }
        EmailContactMethod emailContactMethod = (EmailContactMethod) obj;
        return Intrinsics.areEqual(unknownFields(), emailContactMethod.unknownFields()) && Intrinsics.areEqual(this.email_address, emailContactMethod.email_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.email_address;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpenURL.Builder builder = new OpenURL.Builder(1);
        builder.url = this.email_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmailContactMethod{", "}", 0, null, null, 56);
    }
}

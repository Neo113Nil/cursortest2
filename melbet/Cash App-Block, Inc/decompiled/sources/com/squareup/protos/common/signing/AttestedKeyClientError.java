package com.squareup.protos.common.signing;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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
public final class AttestedKeyClientError extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AttestedKeyClientError> CREATOR;
    public final String exception_class;
    public final AndroidKeyStoreException key_store_exception;
    public final String message;
    public final String stack_trace;

    static {
        AttestedKeyClientError$Companion$ADAPTER$1 attestedKeyClientError$Companion$ADAPTER$1 = new AttestedKeyClientError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AttestedKeyClientError.class), "type.googleapis.com/squareup.common.signing.AttestedKeyClientError", Syntax.PROTO_2, null, "squareup/common/signing.proto");
        ADAPTER = attestedKeyClientError$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(attestedKeyClientError$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestedKeyClientError(String str, String str2, String str3, AndroidKeyStoreException androidKeyStoreException, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.exception_class = str;
        this.message = str2;
        this.stack_trace = str3;
        this.key_store_exception = androidKeyStoreException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttestedKeyClientError)) {
            return false;
        }
        AttestedKeyClientError attestedKeyClientError = (AttestedKeyClientError) obj;
        return Intrinsics.areEqual(unknownFields(), attestedKeyClientError.unknownFields()) && Intrinsics.areEqual(this.exception_class, attestedKeyClientError.exception_class) && Intrinsics.areEqual(this.message, attestedKeyClientError.message) && Intrinsics.areEqual(this.stack_trace, attestedKeyClientError.stack_trace) && Intrinsics.areEqual(this.key_store_exception, attestedKeyClientError.key_store_exception);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.exception_class;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.stack_trace;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        AndroidKeyStoreException androidKeyStoreException = this.key_store_exception;
        int hashCode5 = hashCode4 + (androidKeyStoreException != null ? androidKeyStoreException.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(9);
        builder.button_color = this.exception_class;
        builder.text_color = this.message;
        builder.text = this.stack_trace;
        builder.action = this.key_store_exception;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.exception_class;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "exception_class=", arrayList);
        }
        String str2 = this.message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
        }
        String str3 = this.stack_trace;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "stack_trace=", arrayList);
        }
        AndroidKeyStoreException androidKeyStoreException = this.key_store_exception;
        if (androidKeyStoreException != null) {
            arrayList.add("key_store_exception=" + androidKeyStoreException);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AttestedKeyClientError{", "}", 0, null, null, 56);
    }
}

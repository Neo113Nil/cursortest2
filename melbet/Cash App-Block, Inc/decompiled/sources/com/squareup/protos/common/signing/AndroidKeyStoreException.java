package com.squareup.protos.common.signing;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
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
public final class AndroidKeyStoreException extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AndroidKeyStoreException> CREATOR;
    public final Integer internal_error_code;
    public final Boolean is_system_error;
    public final Boolean is_transient_failure;
    public final Integer public_error_code;
    public final Boolean requires_user_authentication;
    public final Integer retry_policy;

    static {
        AndroidKeyStoreException$Companion$ADAPTER$1 androidKeyStoreException$Companion$ADAPTER$1 = new AndroidKeyStoreException$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AndroidKeyStoreException.class), "type.googleapis.com/squareup.common.signing.AndroidKeyStoreException", Syntax.PROTO_2, null, "squareup/common/signing.proto");
        ADAPTER = androidKeyStoreException$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(androidKeyStoreException$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidKeyStoreException(Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.public_error_code = num;
        this.internal_error_code = num2;
        this.is_system_error = bool;
        this.is_transient_failure = bool2;
        this.retry_policy = num3;
        this.requires_user_authentication = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidKeyStoreException)) {
            return false;
        }
        AndroidKeyStoreException androidKeyStoreException = (AndroidKeyStoreException) obj;
        return Intrinsics.areEqual(unknownFields(), androidKeyStoreException.unknownFields()) && Intrinsics.areEqual(this.public_error_code, androidKeyStoreException.public_error_code) && Intrinsics.areEqual(this.internal_error_code, androidKeyStoreException.internal_error_code) && Intrinsics.areEqual(this.is_system_error, androidKeyStoreException.is_system_error) && Intrinsics.areEqual(this.is_transient_failure, androidKeyStoreException.is_transient_failure) && Intrinsics.areEqual(this.retry_policy, androidKeyStoreException.retry_policy) && Intrinsics.areEqual(this.requires_user_authentication, androidKeyStoreException.requires_user_authentication);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.public_error_code;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.internal_error_code;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Boolean bool = this.is_system_error;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_transient_failure;
        int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Integer num3 = this.retry_policy;
        int hashCode6 = (hashCode5 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Boolean bool3 = this.requires_user_authentication;
        int hashCode7 = hashCode6 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(10, false);
        builder.category = this.public_error_code;
        builder.token = this.internal_error_code;
        builder.title = this.is_system_error;
        builder.url = this.is_transient_failure;
        builder.owner_token = this.retry_policy;
        builder.document_date = this.requires_user_authentication;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.public_error_code;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("public_error_code=", num, arrayList);
        }
        Integer num2 = this.internal_error_code;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("internal_error_code=", num2, arrayList);
        }
        Boolean bool = this.is_system_error;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_system_error=", bool, arrayList);
        }
        Boolean bool2 = this.is_transient_failure;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_transient_failure=", bool2, arrayList);
        }
        Integer num3 = this.retry_policy;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("retry_policy=", num3, arrayList);
        }
        Boolean bool3 = this.requires_user_authentication;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_user_authentication=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AndroidKeyStoreException{", "}", 0, null, null, 56);
    }
}

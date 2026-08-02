package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/ValidateEmailResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiAppLock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ValidateEmailResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValidateEmailResponse> CREATOR;
    public final Boolean is_valid;

    static {
        ValidateEmailResponse$Companion$ADAPTER$1 validateEmailResponse$Companion$ADAPTER$1 = new ValidateEmailResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ValidateEmailResponse.class), "type.googleapis.com/squareup.cash.supportal.app.ValidateEmailResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = validateEmailResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(validateEmailResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateEmailResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_valid = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidateEmailResponse)) {
            return false;
        }
        ValidateEmailResponse validateEmailResponse = (ValidateEmailResponse) obj;
        return Intrinsics.areEqual(unknownFields(), validateEmailResponse.unknownFields()) && Intrinsics.areEqual(this.is_valid, validateEmailResponse.is_valid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_valid;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(20);
        builder.activated = this.is_valid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_valid=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateEmailResponse{", "}", 0, null, null, 56);
    }
}

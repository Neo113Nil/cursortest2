package com.squareup.protos.cash.local.client.v1;

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
public final class LocalMenuItemOptionValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItemOptionValue> CREATOR;
    public final String option_name;
    public final String option_value_name;
    public final String token;

    static {
        LocalMenuItemOptionValue$Companion$ADAPTER$1 localMenuItemOptionValue$Companion$ADAPTER$1 = new LocalMenuItemOptionValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItemOptionValue.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemOptionValue", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItemOptionValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemOptionValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItemOptionValue(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.option_value_name = str2;
        this.option_name = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemOptionValue)) {
            return false;
        }
        LocalMenuItemOptionValue localMenuItemOptionValue = (LocalMenuItemOptionValue) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItemOptionValue.unknownFields()) && Intrinsics.areEqual(this.token, localMenuItemOptionValue.token) && Intrinsics.areEqual(this.option_value_name, localMenuItemOptionValue.option_value_name) && Intrinsics.areEqual(this.option_name, localMenuItemOptionValue.option_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.option_value_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.option_name;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(18);
        builder.contact_support_url = this.token;
        builder.privacy_policy_url = this.option_value_name;
        builder.terms_of_service_url = this.option_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.option_value_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "option_value_name=", arrayList);
        }
        String str3 = this.option_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "option_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItemOptionValue{", "}", 0, null, null, 56);
    }
}

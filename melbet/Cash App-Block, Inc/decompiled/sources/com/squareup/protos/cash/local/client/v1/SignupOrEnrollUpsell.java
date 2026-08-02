package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileRow;
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
public final class SignupOrEnrollUpsell extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SignupOrEnrollUpsell> CREATOR;
    public final String button_text;
    public final String label_text;
    public final String onboarding_link_payload;
    public final String sub_label_text;
    public final String title_text;

    static {
        SignupOrEnrollUpsell$Companion$ADAPTER$1 signupOrEnrollUpsell$Companion$ADAPTER$1 = new SignupOrEnrollUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SignupOrEnrollUpsell.class), "type.googleapis.com/squareup.cash.local.client.v1.SignupOrEnrollUpsell", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = signupOrEnrollUpsell$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(signupOrEnrollUpsell$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignupOrEnrollUpsell(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.onboarding_link_payload = str;
        this.title_text = str2;
        this.label_text = str3;
        this.sub_label_text = str4;
        this.button_text = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignupOrEnrollUpsell)) {
            return false;
        }
        SignupOrEnrollUpsell signupOrEnrollUpsell = (SignupOrEnrollUpsell) obj;
        return Intrinsics.areEqual(unknownFields(), signupOrEnrollUpsell.unknownFields()) && Intrinsics.areEqual(this.onboarding_link_payload, signupOrEnrollUpsell.onboarding_link_payload) && Intrinsics.areEqual(this.title_text, signupOrEnrollUpsell.title_text) && Intrinsics.areEqual(this.label_text, signupOrEnrollUpsell.label_text) && Intrinsics.areEqual(this.sub_label_text, signupOrEnrollUpsell.sub_label_text) && Intrinsics.areEqual(this.button_text, signupOrEnrollUpsell.button_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.onboarding_link_payload;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.label_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.sub_label_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.button_text;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileRow.Builder builder = new ProfileRow.Builder(6);
        builder.client_route = this.onboarding_link_payload;
        builder.icon_id = this.title_text;
        builder.title = this.label_text;
        builder.subtitle = this.sub_label_text;
        builder.call_to_action = this.button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.onboarding_link_payload;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "onboarding_link_payload=", arrayList);
        }
        String str2 = this.title_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title_text=", arrayList);
        }
        String str3 = this.label_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label_text=", arrayList);
        }
        String str4 = this.sub_label_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sub_label_text=", arrayList);
        }
        String str5 = this.button_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "button_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignupOrEnrollUpsell{", "}", 0, null, null, 56);
    }
}

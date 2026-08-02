package com.squareup.protos.franklin.common;

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

/* loaded from: classes8.dex */
public final class ConfirmationSheetData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmationSheetData> CREATOR;
    public final String cancel_button_text;
    public final String confirm_button_text;
    public final String main_text;
    public final String subtext;
    public final String version_code;

    static {
        ConfirmationSheetData$Companion$ADAPTER$1 confirmationSheetData$Companion$ADAPTER$1 = new ConfirmationSheetData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConfirmationSheetData.class), "type.googleapis.com/squareup.franklin.common.ConfirmationSheetData", Syntax.PROTO_2, null, "squareup/franklin/common/deposit_preference.proto");
        ADAPTER = confirmationSheetData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(confirmationSheetData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationSheetData(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.main_text = str;
        this.confirm_button_text = str2;
        this.cancel_button_text = str3;
        this.subtext = str4;
        this.version_code = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmationSheetData)) {
            return false;
        }
        ConfirmationSheetData confirmationSheetData = (ConfirmationSheetData) obj;
        return Intrinsics.areEqual(unknownFields(), confirmationSheetData.unknownFields()) && Intrinsics.areEqual(this.main_text, confirmationSheetData.main_text) && Intrinsics.areEqual(this.confirm_button_text, confirmationSheetData.confirm_button_text) && Intrinsics.areEqual(this.cancel_button_text, confirmationSheetData.cancel_button_text) && Intrinsics.areEqual(this.subtext, confirmationSheetData.subtext) && Intrinsics.areEqual(this.version_code, confirmationSheetData.version_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.confirm_button_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.cancel_button_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.subtext;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.version_code;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileRow.Builder builder = new ProfileRow.Builder(10);
        builder.client_route = this.main_text;
        builder.icon_id = this.confirm_button_text;
        builder.title = this.cancel_button_text;
        builder.subtitle = this.subtext;
        builder.call_to_action = this.version_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        String str2 = this.confirm_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "confirm_button_text=", arrayList);
        }
        String str3 = this.cancel_button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cancel_button_text=", arrayList);
        }
        String str4 = this.subtext;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "subtext=", arrayList);
        }
        String str5 = this.version_code;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "version_code=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmationSheetData{", "}", 0, null, null, 56);
    }
}

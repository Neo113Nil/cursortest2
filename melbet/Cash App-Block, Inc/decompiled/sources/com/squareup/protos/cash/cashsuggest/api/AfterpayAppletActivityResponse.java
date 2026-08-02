package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Footer;
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
public final class AfterpayAppletActivityResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletActivityResponse> CREATOR;
    public final LocalizedString completed_title;
    public final LocalizedString empty_history_text;
    public final Footer footer;
    public final LocalizedString header_subtitle;
    public final LocalizedString screen_title;
    public final LocalizedString upcoming_title;

    static {
        AfterpayAppletActivityResponse$Companion$ADAPTER$1 afterpayAppletActivityResponse$Companion$ADAPTER$1 = new AfterpayAppletActivityResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletActivityResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletActivityResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletActivity.proto");
        ADAPTER = afterpayAppletActivityResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletActivityResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletActivityResponse(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, Footer footer, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.screen_title = localizedString;
        this.header_subtitle = localizedString2;
        this.upcoming_title = localizedString3;
        this.completed_title = localizedString4;
        this.empty_history_text = localizedString5;
        this.footer = footer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletActivityResponse)) {
            return false;
        }
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = (AfterpayAppletActivityResponse) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletActivityResponse.unknownFields()) && Intrinsics.areEqual(this.screen_title, afterpayAppletActivityResponse.screen_title) && Intrinsics.areEqual(this.header_subtitle, afterpayAppletActivityResponse.header_subtitle) && Intrinsics.areEqual(this.upcoming_title, afterpayAppletActivityResponse.upcoming_title) && Intrinsics.areEqual(this.completed_title, afterpayAppletActivityResponse.completed_title) && Intrinsics.areEqual(this.empty_history_text, afterpayAppletActivityResponse.empty_history_text) && Intrinsics.areEqual(this.footer, afterpayAppletActivityResponse.footer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.screen_title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.header_subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.upcoming_title;
        int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.completed_title;
        int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
        LocalizedString localizedString5 = this.empty_history_text;
        int hashCode6 = (hashCode5 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
        Footer footer = this.footer;
        int hashCode7 = hashCode6 + (footer != null ? footer.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(22, false);
        builder.category = this.screen_title;
        builder.code = this.header_subtitle;
        builder.description = this.upcoming_title;
        builder.field = this.completed_title;
        builder.retryable = this.empty_history_text;
        builder.metadata = this.footer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.screen_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("screen_title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.header_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("header_subtitle=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.upcoming_title;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("upcoming_title=", localizedString3, arrayList);
        }
        LocalizedString localizedString4 = this.completed_title;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("completed_title=", localizedString4, arrayList);
        }
        LocalizedString localizedString5 = this.empty_history_text;
        if (localizedString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("empty_history_text=", localizedString5, arrayList);
        }
        Footer footer = this.footer;
        if (footer != null) {
            arrayList.add("footer=" + footer);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletActivityResponse{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AfterpayAppletActivityResponse(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, Footer footer) {
        this(localizedString, localizedString2, localizedString3, localizedString4, localizedString5, footer, ByteString.EMPTY);
    }
}

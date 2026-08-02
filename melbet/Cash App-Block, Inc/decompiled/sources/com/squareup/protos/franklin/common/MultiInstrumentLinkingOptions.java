package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MultiInstrumentLinkingOptions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiInstrumentLinkingOptions> CREATOR;
    public final String button_text;
    public final List instrument_linking_option;
    public final LocalizableString localizable_button_text;
    public final LocalizableString localizable_sheet_title;
    public final String sheet_title;

    static {
        MultiInstrumentLinkingOptions$Companion$ADAPTER$1 multiInstrumentLinkingOptions$Companion$ADAPTER$1 = new MultiInstrumentLinkingOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MultiInstrumentLinkingOptions.class), "type.googleapis.com/squareup.franklin.MultiInstrumentLinkingOptions", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = multiInstrumentLinkingOptions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(multiInstrumentLinkingOptions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiInstrumentLinkingOptions(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.button_text = str;
        this.localizable_button_text = localizableString;
        this.sheet_title = str2;
        this.localizable_sheet_title = localizableString2;
        this.instrument_linking_option = TransactorKt.immutableCopyOf("instrument_linking_option", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiInstrumentLinkingOptions)) {
            return false;
        }
        MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
        return Intrinsics.areEqual(unknownFields(), multiInstrumentLinkingOptions.unknownFields()) && Intrinsics.areEqual(this.button_text, multiInstrumentLinkingOptions.button_text) && Intrinsics.areEqual(this.localizable_button_text, multiInstrumentLinkingOptions.localizable_button_text) && Intrinsics.areEqual(this.sheet_title, multiInstrumentLinkingOptions.sheet_title) && Intrinsics.areEqual(this.localizable_sheet_title, multiInstrumentLinkingOptions.localizable_sheet_title) && Intrinsics.areEqual(this.instrument_linking_option, multiInstrumentLinkingOptions.instrument_linking_option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.button_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_button_text;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.sheet_title;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_sheet_title;
        int hashCode5 = this.instrument_linking_option.hashCode() + ((hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(11, false);
        builder.alias = this.button_text;
        builder.verified = this.localizable_button_text;
        builder.expires_at = this.sheet_title;
        builder.version = this.localizable_sheet_title;
        builder.display_date = this.instrument_linking_option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.button_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_button_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_button_text=", localizableString, arrayList);
        }
        String str2 = this.sheet_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sheet_title=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_sheet_title;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_sheet_title=", localizableString2, arrayList);
        }
        List list = this.instrument_linking_option;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_linking_option=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiInstrumentLinkingOptions{", "}", 0, null, null, 56);
    }
}

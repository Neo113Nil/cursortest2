package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.document.DocumentEntity;
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
public final class InstrumentLinkingOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentLinkingOption> CREATOR;
    public final LinkingAction action;
    public final String description;
    public final Long fee_bps;
    public final List instrument_types;
    public final LocalizableString localizable_description;
    public final LocalizableString localizable_title;
    public final Boolean show_in_instrument_selector;
    public final String title;

    static {
        InstrumentLinkingOption$Companion$ADAPTER$1 instrumentLinkingOption$Companion$ADAPTER$1 = new InstrumentLinkingOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOption.class), "type.googleapis.com/squareup.franklin.common.InstrumentLinkingOption", Syntax.PROTO_2, null, "squareup/franklin/common/instrument_link.proto");
        ADAPTER = instrumentLinkingOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentLinkingOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentLinkingOption(List list, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Long l, Boolean bool, LinkingAction linkingAction, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.localizable_title = localizableString;
        this.description = str2;
        this.localizable_description = localizableString2;
        this.fee_bps = l;
        this.show_in_instrument_selector = bool;
        this.action = linkingAction;
        this.instrument_types = TransactorKt.immutableCopyOf("instrument_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingOption)) {
            return false;
        }
        InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentLinkingOption.unknownFields()) && Intrinsics.areEqual(this.instrument_types, instrumentLinkingOption.instrument_types) && Intrinsics.areEqual(this.title, instrumentLinkingOption.title) && Intrinsics.areEqual(this.localizable_title, instrumentLinkingOption.localizable_title) && Intrinsics.areEqual(this.description, instrumentLinkingOption.description) && Intrinsics.areEqual(this.localizable_description, instrumentLinkingOption.localizable_description) && Intrinsics.areEqual(this.fee_bps, instrumentLinkingOption.fee_bps) && Intrinsics.areEqual(this.show_in_instrument_selector, instrumentLinkingOption.show_in_instrument_selector) && Intrinsics.areEqual(this.action, instrumentLinkingOption.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.instrument_types);
        String str = this.title;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_title;
        int hashCode2 = (hashCode + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_description;
        int hashCode4 = (hashCode3 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        Long l = this.fee_bps;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.show_in_instrument_selector;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LinkingAction linkingAction = this.action;
        int hashCode7 = hashCode6 + (linkingAction != null ? linkingAction.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(25, false);
        builder.title = this.instrument_types;
        builder.category = this.title;
        builder.localizable_title = this.localizable_title;
        builder.token = this.description;
        builder.client_route = this.localizable_description;
        builder.url = this.fee_bps;
        builder.owner_token = this.show_in_instrument_selector;
        builder.version_data = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.instrument_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_types=", arrayList, list);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_description;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_description=", localizableString2, arrayList);
        }
        Long l = this.fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fee_bps=", l, arrayList);
        }
        Boolean bool = this.show_in_instrument_selector;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_in_instrument_selector=", bool, arrayList);
        }
        LinkingAction linkingAction = this.action;
        if (linkingAction != null) {
            arrayList.add("action=" + linkingAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLinkingOption{", "}", 0, null, null, 56);
    }
}

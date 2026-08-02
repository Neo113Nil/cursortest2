package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.localization.LocalizedString;
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
public final class PrepurchaseCardToggleSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepurchaseCardToggleSection> CREATOR;
    public final ToggleState toggle_turned_off_state;
    public final ToggleState toggle_turned_on_state;

    static {
        PrepurchaseCardToggleSection$Companion$ADAPTER$1 prepurchaseCardToggleSection$Companion$ADAPTER$1 = new PrepurchaseCardToggleSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrepurchaseCardToggleSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.PrepurchaseCardToggleSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/PrepurchaseCardToggleSection.proto");
        ADAPTER = prepurchaseCardToggleSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCardToggleSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseCardToggleSection(ToggleState toggleState, ToggleState toggleState2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.toggle_turned_on_state = toggleState;
        this.toggle_turned_off_state = toggleState2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCardToggleSection)) {
            return false;
        }
        PrepurchaseCardToggleSection prepurchaseCardToggleSection = (PrepurchaseCardToggleSection) obj;
        return Intrinsics.areEqual(unknownFields(), prepurchaseCardToggleSection.unknownFields()) && Intrinsics.areEqual(this.toggle_turned_on_state, prepurchaseCardToggleSection.toggle_turned_on_state) && Intrinsics.areEqual(this.toggle_turned_off_state, prepurchaseCardToggleSection.toggle_turned_off_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ToggleState toggleState = this.toggle_turned_on_state;
        int hashCode2 = (hashCode + (toggleState != null ? toggleState.hashCode() : 0)) * 37;
        ToggleState toggleState2 = this.toggle_turned_off_state;
        int hashCode3 = hashCode2 + (toggleState2 != null ? toggleState2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(23);
        builder.image_url = this.toggle_turned_on_state;
        builder.asset = this.toggle_turned_off_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ToggleState toggleState = this.toggle_turned_on_state;
        if (toggleState != null) {
            arrayList.add("toggle_turned_on_state=" + toggleState);
        }
        ToggleState toggleState2 = this.toggle_turned_off_state;
        if (toggleState2 != null) {
            arrayList.add("toggle_turned_off_state=" + toggleState2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepurchaseCardToggleSection{", "}", 0, null, null, 56);
    }

    public final class ToggleState extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ToggleState> CREATOR;
        public final LocalizedString footer_label;
        public final AppletCardSection.StandardHeader header;

        static {
            PrepurchaseCardToggleSection$ToggleState$Companion$ADAPTER$1 prepurchaseCardToggleSection$ToggleState$Companion$ADAPTER$1 = new PrepurchaseCardToggleSection$ToggleState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToggleState.class), "type.googleapis.com/squareup.cash.cashsuggest.api.PrepurchaseCardToggleSection.ToggleState", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/PrepurchaseCardToggleSection.proto");
            ADAPTER = prepurchaseCardToggleSection$ToggleState$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCardToggleSection$ToggleState$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToggleState(AppletCardSection.StandardHeader standardHeader, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header = standardHeader;
            this.footer_label = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ToggleState)) {
                return false;
            }
            ToggleState toggleState = (ToggleState) obj;
            return Intrinsics.areEqual(unknownFields(), toggleState.unknownFields()) && Intrinsics.areEqual(this.header, toggleState.header) && Intrinsics.areEqual(this.footer_label, toggleState.footer_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AppletCardSection.StandardHeader standardHeader = this.header;
            int hashCode2 = (hashCode + (standardHeader != null ? standardHeader.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.footer_label;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(24);
            builder.image_url = this.header;
            builder.asset = this.footer_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AppletCardSection.StandardHeader standardHeader = this.header;
            if (standardHeader != null) {
                arrayList.add("header=" + standardHeader);
            }
            LocalizedString localizedString = this.footer_label;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("footer_label=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleState{", "}", 0, null, null, 56);
        }

        public /* synthetic */ ToggleState(AppletCardSection.StandardHeader standardHeader, LocalizedString localizedString) {
            this(standardHeader, localizedString, ByteString.EMPTY);
        }
    }

    public /* synthetic */ PrepurchaseCardToggleSection(ToggleState toggleState, ToggleState toggleState2) {
        this(toggleState, toggleState2, ByteString.EMPTY);
    }
}

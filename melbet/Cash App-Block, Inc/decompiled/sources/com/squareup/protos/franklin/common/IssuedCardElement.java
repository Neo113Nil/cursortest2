package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
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
public final class IssuedCardElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IssuedCardElement> CREATOR;
    public final String card_identifier;
    public final List overflow_controls;
    public final CardModuleElement primary_control;

    static {
        IssuedCardElement$Companion$ADAPTER$1 issuedCardElement$Companion$ADAPTER$1 = new IssuedCardElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IssuedCardElement.class), "type.googleapis.com/squareup.franklin.common.IssuedCardElement", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = issuedCardElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(issuedCardElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuedCardElement(String str, CardModuleElement cardModuleElement, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.card_identifier = str;
        this.primary_control = cardModuleElement;
        this.overflow_controls = TransactorKt.immutableCopyOf("overflow_controls", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IssuedCardElement)) {
            return false;
        }
        IssuedCardElement issuedCardElement = (IssuedCardElement) obj;
        return Intrinsics.areEqual(unknownFields(), issuedCardElement.unknownFields()) && Intrinsics.areEqual(this.card_identifier, issuedCardElement.card_identifier) && Intrinsics.areEqual(this.primary_control, issuedCardElement.primary_control) && Intrinsics.areEqual(this.overflow_controls, issuedCardElement.overflow_controls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.card_identifier;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CardModuleElement cardModuleElement = this.primary_control;
        int hashCode3 = this.overflow_controls.hashCode() + ((hashCode2 + (cardModuleElement != null ? cardModuleElement.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(22, false);
        builder.institution_token = this.card_identifier;
        builder.display_info = this.primary_control;
        builder.help_menu_items = this.overflow_controls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.card_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_identifier=", arrayList);
        }
        CardModuleElement cardModuleElement = this.primary_control;
        if (cardModuleElement != null) {
            arrayList.add("primary_control=" + cardModuleElement);
        }
        List list = this.overflow_controls;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("overflow_controls=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IssuedCardElement{", "}", 0, null, null, 56);
    }
}

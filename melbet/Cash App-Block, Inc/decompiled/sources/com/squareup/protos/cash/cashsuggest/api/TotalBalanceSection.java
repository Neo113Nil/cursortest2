package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
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
public final class TotalBalanceSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TotalBalanceSection> CREATOR;
    public final TappableIcon icon;
    public final LocalizedString text;

    static {
        TotalBalanceSection$Companion$ADAPTER$1 totalBalanceSection$Companion$ADAPTER$1 = new TotalBalanceSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TotalBalanceSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.TotalBalanceSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = totalBalanceSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(totalBalanceSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalBalanceSection(LocalizedString localizedString, TappableIcon tappableIcon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = localizedString;
        this.icon = tappableIcon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TotalBalanceSection)) {
            return false;
        }
        TotalBalanceSection totalBalanceSection = (TotalBalanceSection) obj;
        return Intrinsics.areEqual(unknownFields(), totalBalanceSection.unknownFields()) && Intrinsics.areEqual(this.text, totalBalanceSection.text) && Intrinsics.areEqual(this.icon, totalBalanceSection.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        TappableIcon tappableIcon = this.icon;
        int hashCode3 = hashCode2 + (tappableIcon != null ? tappableIcon.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(26);
        builder.image_url = this.text;
        builder.asset = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        TappableIcon tappableIcon = this.icon;
        if (tappableIcon != null) {
            arrayList.add("icon=" + tappableIcon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TotalBalanceSection{", "}", 0, null, null, 56);
    }
}

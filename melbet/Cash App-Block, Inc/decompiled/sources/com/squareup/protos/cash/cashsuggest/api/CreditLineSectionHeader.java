package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import app.cash.redwood.protocol.host.NodeReuseKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditLineSectionHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditLineSectionHeader> CREATOR;
    public final CreditLineType credit_line_type;
    public final DisplayEffect display_effect;
    public final NodeReuseKt subtitle;
    public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
    public final TappableIcon tappable_info;
    public final LocalizedString title;

    public enum DisplayEffect implements WireEnum {
        REGULAR(0),
        FADED(1);

        public static final CreditLineSectionHeader$DisplayEffect$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            DisplayEffect displayEffect = REGULAR;
            Companion = new Alignment.Companion();
            ADAPTER = new CreditLineSectionHeader$DisplayEffect$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayEffect.class), Syntax.PROTO_2, displayEffect);
        }

        DisplayEffect(int i) {
            this.value = i;
        }

        public static final DisplayEffect fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return REGULAR;
            }
            if (i != 1) {
                return null;
            }
            return FADED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CreditLineSectionHeader$Companion$ADAPTER$1 creditLineSectionHeader$Companion$ADAPTER$1 = new CreditLineSectionHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditLineSectionHeader.class), "type.googleapis.com/squareup.cash.cashsuggest.api.CreditLineSectionHeader", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = creditLineSectionHeader$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLineSectionHeader$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLineSectionHeader(LocalizedString localizedString, TappableIcon tappableIcon, CreditLineType creditLineType, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, NodeReuseKt nodeReuseKt, DisplayEffect displayEffect, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.tappable_info = tappableIcon;
        this.credit_line_type = creditLineType;
        this.tap_action = tapAction;
        this.subtitle = nodeReuseKt;
        this.display_effect = displayEffect;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditLineSectionHeader)) {
            return false;
        }
        CreditLineSectionHeader creditLineSectionHeader = (CreditLineSectionHeader) obj;
        return Intrinsics.areEqual(unknownFields(), creditLineSectionHeader.unknownFields()) && Intrinsics.areEqual(this.title, creditLineSectionHeader.title) && Intrinsics.areEqual(this.tappable_info, creditLineSectionHeader.tappable_info) && this.credit_line_type == creditLineSectionHeader.credit_line_type && Intrinsics.areEqual(this.tap_action, creditLineSectionHeader.tap_action) && Intrinsics.areEqual(this.subtitle, creditLineSectionHeader.subtitle) && this.display_effect == creditLineSectionHeader.display_effect;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        TappableIcon tappableIcon = this.tappable_info;
        int hashCode3 = (hashCode2 + (tappableIcon != null ? tappableIcon.hashCode() : 0)) * 37;
        CreditLineType creditLineType = this.credit_line_type;
        int hashCode4 = (hashCode3 + (creditLineType != null ? creditLineType.hashCode() : 0)) * 37;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
        int hashCode5 = (hashCode4 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        NodeReuseKt nodeReuseKt = this.subtitle;
        int hashCode6 = (hashCode5 + (nodeReuseKt != null ? nodeReuseKt.hashCode() : 0)) * 37;
        DisplayEffect displayEffect = this.display_effect;
        int hashCode7 = hashCode6 + (displayEffect != null ? displayEffect.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(26, false);
        builder.category = this.title;
        builder.code = this.tappable_info;
        builder.description = this.credit_line_type;
        builder.field = this.tap_action;
        builder.retryable = this.subtitle;
        builder.metadata = this.display_effect;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        TappableIcon tappableIcon = this.tappable_info;
        if (tappableIcon != null) {
            arrayList.add("tappable_info=" + tappableIcon);
        }
        CreditLineType creditLineType = this.credit_line_type;
        if (creditLineType != null) {
            arrayList.add("credit_line_type=" + creditLineType);
        }
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        NodeReuseKt nodeReuseKt = this.subtitle;
        if (nodeReuseKt != null) {
            arrayList.add("subtitle=" + nodeReuseKt);
        }
        DisplayEffect displayEffect = this.display_effect;
        if (displayEffect != null) {
            arrayList.add("display_effect=" + displayEffect);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditLineSectionHeader{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolVisibility;
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

/* loaded from: classes8.dex */
public final class SectionHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectionHeader> CREATOR;
    public final Button cta_button;
    public final DisplayEffect display_effect;
    public final LocalizedString l_subtitle;
    public final LocalizedString l_title;
    public final StyledText subtitle;
    public final TapAction tap_action;
    public final StyledText title;

    public enum DisplayEffect implements WireEnum {
        UNSPECIFIED(0),
        DEFAULT(1),
        FADED(2);

        public static final SectionHeader$DisplayEffect$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            DisplayEffect displayEffect = UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new SectionHeader$DisplayEffect$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayEffect.class), Syntax.PROTO_2, displayEffect);
        }

        DisplayEffect(int i) {
            this.value = i;
        }

        public static final DisplayEffect fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return DEFAULT;
            }
            if (i != 2) {
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
        SectionHeader$Companion$ADAPTER$1 sectionHeader$Companion$ADAPTER$1 = new SectionHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionHeader.class), "type.googleapis.com/squareup.cash.shop.rendering.api.SectionHeader", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Section.proto");
        ADAPTER = sectionHeader$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sectionHeader$Companion$ADAPTER$1);
    }

    public /* synthetic */ SectionHeader(LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, int i) {
        this(localizedString, (i & 2) != 0 ? null : localizedString2, null, (i & 8) != 0 ? null : tapAction, (i & 16) != 0 ? null : DisplayEffect.DEFAULT, null, null, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionHeader)) {
            return false;
        }
        SectionHeader sectionHeader = (SectionHeader) obj;
        return Intrinsics.areEqual(unknownFields(), sectionHeader.unknownFields()) && Intrinsics.areEqual(this.l_title, sectionHeader.l_title) && Intrinsics.areEqual(this.l_subtitle, sectionHeader.l_subtitle) && Intrinsics.areEqual(this.cta_button, sectionHeader.cta_button) && Intrinsics.areEqual(this.tap_action, sectionHeader.tap_action) && this.display_effect == sectionHeader.display_effect && Intrinsics.areEqual(this.title, sectionHeader.title) && Intrinsics.areEqual(this.subtitle, sectionHeader.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.l_title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.l_subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Button button = this.cta_button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode5 = (hashCode4 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        DisplayEffect displayEffect = this.display_effect;
        int hashCode6 = (hashCode5 + (displayEffect != null ? displayEffect.hashCode() : 0)) * 37;
        StyledText styledText = this.title;
        int hashCode7 = (hashCode6 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        StyledText styledText2 = this.subtitle;
        int hashCode8 = hashCode7 + (styledText2 != null ? styledText2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(23);
        builder.customer_identifier = this.l_title;
        builder.full_name = this.l_subtitle;
        builder.profile_photo_url = this.cta_button;
        builder.cashtag = this.tap_action;
        builder.added_at = this.display_effect;
        builder.participant_type = this.title;
        builder.aggregated_contribution_amount = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.l_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.l_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        DisplayEffect displayEffect = this.display_effect;
        if (displayEffect != null) {
            arrayList.add("display_effect=" + displayEffect);
        }
        StyledText styledText = this.title;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
        }
        StyledText styledText2 = this.subtitle;
        if (styledText2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionHeader{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHeader(LocalizedString localizedString, LocalizedString localizedString2, Button button, TapAction tapAction, DisplayEffect displayEffect, StyledText styledText, StyledText styledText2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.l_title = localizedString;
        this.l_subtitle = localizedString2;
        this.cta_button = button;
        this.tap_action = tapAction;
        this.display_effect = displayEffect;
        this.title = styledText;
        this.subtitle = styledText2;
    }
}

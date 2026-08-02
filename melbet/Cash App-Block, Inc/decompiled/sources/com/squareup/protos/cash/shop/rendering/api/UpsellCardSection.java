package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Headers;
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
public final class UpsellCardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpsellCardSection> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final zzlf cta;
    public final Button cta_button;
    public final LocalizedString subtitle;
    public final TapAction tap_action;
    public final LocalizedString title;
    public final zzlg trailing_content;
    public final Boolean trailing_content_background;

    public final class AvatarStack extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarStack> CREATOR;
        public final List avatars;

        static {
            UpsellCardSection$AvatarStack$Companion$ADAPTER$1 upsellCardSection$AvatarStack$Companion$ADAPTER$1 = new UpsellCardSection$AvatarStack$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarStack.class), "type.googleapis.com/squareup.cash.shop.rendering.api.UpsellCardSection.AvatarStack", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/UpsellCardSection.proto");
            ADAPTER = upsellCardSection$AvatarStack$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(upsellCardSection$AvatarStack$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarStack(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.avatars = TransactorKt.immutableCopyOf("avatars", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarStack)) {
                return false;
            }
            AvatarStack avatarStack = (AvatarStack) obj;
            return Intrinsics.areEqual(unknownFields(), avatarStack.unknownFields()) && Intrinsics.areEqual(this.avatars, avatarStack.avatars);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.avatars.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Headers.Builder builder = new Headers.Builder(2, false);
            builder.header = this.avatars;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.avatars;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("avatars=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarStack{", "}", 0, null, null, 56);
        }
    }

    static {
        UpsellCardSection$Companion$ADAPTER$1 upsellCardSection$Companion$ADAPTER$1 = new UpsellCardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsellCardSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.UpsellCardSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/UpsellCardSection.proto");
        ADAPTER = upsellCardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(upsellCardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsellCardSection(LocalizedString localizedString, LocalizedString localizedString2, Button button, zzlf zzlfVar, zzlg zzlgVar, TapAction tapAction, AnalyticsEvent analyticsEvent, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.cta_button = button;
        this.cta = zzlfVar;
        this.trailing_content = zzlgVar;
        this.tap_action = tapAction;
        this.analytics_view_event = analyticsEvent;
        this.trailing_content_background = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.google.android.gms.internal.mlkit_vision_common.zzlf] */
    public static UpsellCardSection copy$default(UpsellCardSection upsellCardSection, LocalizedString localizedString, LocalizedString localizedString2, Button button, UpsellCardSection$Cta$CtaText upsellCardSection$Cta$CtaText, TapAction tapAction, AnalyticsEvent analyticsEvent, ByteString byteString, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            localizedString = upsellCardSection.title;
        }
        LocalizedString localizedString3 = localizedString;
        if ((i & 2) != 0) {
            localizedString2 = upsellCardSection.subtitle;
        }
        LocalizedString localizedString4 = localizedString2;
        Button button2 = (i & 4) != 0 ? upsellCardSection.cta_button : button;
        UpsellCardSection$Cta$CtaText upsellCardSection$Cta$CtaText2 = (i & 8) != 0 ? upsellCardSection.cta : upsellCardSection$Cta$CtaText;
        zzlg zzlgVar = upsellCardSection.trailing_content;
        TapAction tapAction2 = (i & 32) != 0 ? upsellCardSection.tap_action : tapAction;
        AnalyticsEvent analyticsEvent2 = (i & 64) != 0 ? upsellCardSection.analytics_view_event : analyticsEvent;
        if ((i & 128) != 0) {
            bool = upsellCardSection.trailing_content_background;
        }
        Boolean bool2 = bool;
        ByteString unknownFields = (i & 256) != 0 ? upsellCardSection.unknownFields() : byteString;
        upsellCardSection.getClass();
        unknownFields.getClass();
        return new UpsellCardSection(localizedString3, localizedString4, button2, upsellCardSection$Cta$CtaText2, zzlgVar, tapAction2, analyticsEvent2, bool2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpsellCardSection)) {
            return false;
        }
        UpsellCardSection upsellCardSection = (UpsellCardSection) obj;
        return Intrinsics.areEqual(unknownFields(), upsellCardSection.unknownFields()) && Intrinsics.areEqual(this.title, upsellCardSection.title) && Intrinsics.areEqual(this.subtitle, upsellCardSection.subtitle) && Intrinsics.areEqual(this.cta_button, upsellCardSection.cta_button) && Intrinsics.areEqual(this.cta, upsellCardSection.cta) && Intrinsics.areEqual(this.trailing_content, upsellCardSection.trailing_content) && Intrinsics.areEqual(this.tap_action, upsellCardSection.tap_action) && Intrinsics.areEqual(this.analytics_view_event, upsellCardSection.analytics_view_event) && Intrinsics.areEqual(this.trailing_content_background, upsellCardSection.trailing_content_background);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Button button = this.cta_button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        zzlf zzlfVar = this.cta;
        int hashCode5 = (hashCode4 + (zzlfVar != null ? zzlfVar.hashCode() : 0)) * 37;
        zzlg zzlgVar = this.trailing_content;
        int hashCode6 = (hashCode5 + (zzlgVar != null ? zzlgVar.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode7 = (hashCode6 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode8 = (hashCode7 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        Boolean bool = this.trailing_content_background;
        int hashCode9 = hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(17, false);
        builder.category = this.title;
        builder.token = this.subtitle;
        builder.title = this.cta_button;
        builder.client_route = this.cta;
        builder.url = this.trailing_content;
        builder.owner_token = this.tap_action;
        builder.version_data = this.analytics_view_event;
        builder.localizable_title = this.trailing_content_background;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        zzlf zzlfVar = this.cta;
        if (zzlfVar != null) {
            arrayList.add("cta=" + zzlfVar);
        }
        zzlg zzlgVar = this.trailing_content;
        if (zzlgVar != null) {
            arrayList.add("trailing_content=" + zzlgVar);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        Boolean bool = this.trailing_content_background;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("trailing_content_background=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellCardSection{", "}", 0, null, null, 56);
    }
}

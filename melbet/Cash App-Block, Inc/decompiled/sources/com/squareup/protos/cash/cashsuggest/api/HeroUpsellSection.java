package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
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
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes7.dex */
public final class HeroUpsellSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HeroUpsellSection> CREATOR;
    public final LocalizedString body;
    public final LocalizedString footer;
    public final Image image;
    public final SectionCTA section_cta;
    public final LocalizedString title;

    static {
        HeroUpsellSection$Companion$ADAPTER$1 heroUpsellSection$Companion$ADAPTER$1 = new HeroUpsellSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroUpsellSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroUpsellSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroUpsellSection.proto");
        ADAPTER = heroUpsellSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(heroUpsellSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroUpsellSection(LocalizedString localizedString, LocalizedString localizedString2, Image image, LocalizedString localizedString3, SectionCTA sectionCTA, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.body = localizedString2;
        this.image = image;
        this.footer = localizedString3;
        this.section_cta = sectionCTA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeroUpsellSection)) {
            return false;
        }
        HeroUpsellSection heroUpsellSection = (HeroUpsellSection) obj;
        return Intrinsics.areEqual(unknownFields(), heroUpsellSection.unknownFields()) && Intrinsics.areEqual(this.title, heroUpsellSection.title) && Intrinsics.areEqual(this.body, heroUpsellSection.body) && Intrinsics.areEqual(this.image, heroUpsellSection.image) && Intrinsics.areEqual(this.footer, heroUpsellSection.footer) && Intrinsics.areEqual(this.section_cta, heroUpsellSection.section_cta);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.body;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.footer;
        int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        SectionCTA sectionCTA = this.section_cta;
        int hashCode6 = hashCode5 + (sectionCTA != null ? sectionCTA.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(22, false);
        builder.customer_token = this.title;
        builder.account_token = this.body;
        builder.display_name = this.image;
        builder.account_type = this.footer;
        builder.is_sponsored_account = this.section_cta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.body;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        LocalizedString localizedString3 = this.footer;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("footer=", localizedString3, arrayList);
        }
        SectionCTA sectionCTA = this.section_cta;
        if (sectionCTA != null) {
            arrayList.add("section_cta=" + sectionCTA);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeroUpsellSection{", "}", 0, null, null, 56);
    }

    public final class SectionCTA extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SectionCTA> CREATOR;
        public final LocalizedString title;

        static {
            HeroUpsellSection$SectionCTA$Companion$ADAPTER$1 heroUpsellSection$SectionCTA$Companion$ADAPTER$1 = new HeroUpsellSection$SectionCTA$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionCTA.class), "type.googleapis.com/squareup.cash.cashsuggest.api.HeroUpsellSection.SectionCTA", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/HeroUpsellSection.proto");
            ADAPTER = heroUpsellSection$SectionCTA$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(heroUpsellSection$SectionCTA$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionCTA(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SectionCTA)) {
                return false;
            }
            SectionCTA sectionCTA = (SectionCTA) obj;
            return Intrinsics.areEqual(unknownFields(), sectionCTA.unknownFields()) && Intrinsics.areEqual(this.title, sectionCTA.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(5);
            builder.yield_current_rate_enhanced = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SectionCTA{", "}", 0, null, null, 56);
        }

        public /* synthetic */ SectionCTA(LocalizedString localizedString) {
            this(localizedString, ByteString.EMPTY);
        }
    }

    public /* synthetic */ HeroUpsellSection(LocalizedString localizedString, LocalizedString localizedString2, Image image, LocalizedString localizedString3, SectionCTA sectionCTA) {
        this(localizedString, localizedString2, image, localizedString3, sectionCTA, ByteString.EMPTY);
    }
}

package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.LocalizedDisclosureCopy;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerControls;
import com.squareup.protos.franklin.common.AppLinks;
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

/* loaded from: classes.dex */
public final class LocalizationConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalizationConfig> CREATOR;
    public final List accepted_language_disclosures;
    public final LanguageDisclosure language_disclosure;

    /* loaded from: classes7.dex */
    public final class LanguageDisclosure extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LanguageDisclosure> CREATOR;
        public final Boolean accepted;
        public final List localized_disclosure_copy;
        public final String version;

        static {
            LocalizationConfig$LanguageDisclosure$Companion$ADAPTER$1 localizationConfig$LanguageDisclosure$Companion$ADAPTER$1 = new LocalizationConfig$LanguageDisclosure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LanguageDisclosure.class), "type.googleapis.com/squareup.franklin.common.LocalizationConfig.LanguageDisclosure", Syntax.PROTO_2, null, "squareup/franklin/common/localization_config.proto");
            ADAPTER = localizationConfig$LanguageDisclosure$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localizationConfig$LanguageDisclosure$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LanguageDisclosure(Boolean bool, String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.version = str;
            this.accepted = bool;
            this.localized_disclosure_copy = TransactorKt.immutableCopyOf("localized_disclosure_copy", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LanguageDisclosure)) {
                return false;
            }
            LanguageDisclosure languageDisclosure = (LanguageDisclosure) obj;
            return Intrinsics.areEqual(unknownFields(), languageDisclosure.unknownFields()) && Intrinsics.areEqual(this.version, languageDisclosure.version) && Intrinsics.areEqual(this.accepted, languageDisclosure.accepted) && Intrinsics.areEqual(this.localized_disclosure_copy, languageDisclosure.localized_disclosure_copy);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.version;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.accepted;
            int hashCode3 = this.localized_disclosure_copy.hashCode() + ((hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CustomerControls.Builder builder = new CustomerControls.Builder(2);
            builder.customer_token = this.version;
            builder.trading_enabled = this.accepted;
            builder.trading_limits = this.localized_disclosure_copy;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.version;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "version=", arrayList);
            }
            Boolean bool = this.accepted;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("accepted=", bool, arrayList);
            }
            List list = this.localized_disclosure_copy;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("localized_disclosure_copy=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LanguageDisclosure{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class LocalizedDisclosureCopy extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalizedDisclosureCopy> CREATOR;
        public final String accept_cta;
        public final String disclaimer;
        public final String locale;
        public final String locale_label;
        public final String subtitle;
        public final String terms_body;
        public final String terms_header;
        public final String title;

        static {
            LocalizationConfig$LocalizedDisclosureCopy$Companion$ADAPTER$1 localizationConfig$LocalizedDisclosureCopy$Companion$ADAPTER$1 = new LocalizationConfig$LocalizedDisclosureCopy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalizedDisclosureCopy.class), "type.googleapis.com/squareup.franklin.common.LocalizationConfig.LocalizedDisclosureCopy", Syntax.PROTO_2, null, "squareup/franklin/common/localization_config.proto");
            ADAPTER = localizationConfig$LocalizedDisclosureCopy$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localizationConfig$LocalizedDisclosureCopy$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalizedDisclosureCopy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.locale = str;
            this.locale_label = str2;
            this.title = str3;
            this.subtitle = str4;
            this.terms_header = str5;
            this.terms_body = str6;
            this.disclaimer = str7;
            this.accept_cta = str8;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalizedDisclosureCopy)) {
                return false;
            }
            LocalizedDisclosureCopy localizedDisclosureCopy = (LocalizedDisclosureCopy) obj;
            return Intrinsics.areEqual(unknownFields(), localizedDisclosureCopy.unknownFields()) && Intrinsics.areEqual(this.locale, localizedDisclosureCopy.locale) && Intrinsics.areEqual(this.locale_label, localizedDisclosureCopy.locale_label) && Intrinsics.areEqual(this.title, localizedDisclosureCopy.title) && Intrinsics.areEqual(this.subtitle, localizedDisclosureCopy.subtitle) && Intrinsics.areEqual(this.terms_header, localizedDisclosureCopy.terms_header) && Intrinsics.areEqual(this.terms_body, localizedDisclosureCopy.terms_body) && Intrinsics.areEqual(this.disclaimer, localizedDisclosureCopy.disclaimer) && Intrinsics.areEqual(this.accept_cta, localizedDisclosureCopy.accept_cta);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.locale;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.locale_label;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.title;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.subtitle;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.terms_header;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.terms_body;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.disclaimer;
            int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.accept_cta;
            int hashCode9 = hashCode8 + (str8 != null ? str8.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LocalizedDisclosureCopy.Builder builder = new LocalizedDisclosureCopy.Builder(1);
            builder.locale = this.locale;
            builder.option_label_text = this.locale_label;
            builder.title = this.title;
            builder.intro_body = this.subtitle;
            builder.terms_header = this.terms_header;
            builder.terms_body = this.terms_body;
            builder.disclaimer_text = this.disclaimer;
            builder.accept_cta_text = this.accept_cta;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.locale;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "locale=", arrayList);
            }
            String str2 = this.locale_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "locale_label=", arrayList);
            }
            String str3 = this.title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
            }
            String str4 = this.subtitle;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "subtitle=", arrayList);
            }
            String str5 = this.terms_header;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "terms_header=", arrayList);
            }
            String str6 = this.terms_body;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "terms_body=", arrayList);
            }
            String str7 = this.disclaimer;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "disclaimer=", arrayList);
            }
            String str8 = this.accept_cta;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "accept_cta=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalizedDisclosureCopy{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalizationConfig$Companion$ADAPTER$1 localizationConfig$Companion$ADAPTER$1 = new LocalizationConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalizationConfig.class), "type.googleapis.com/squareup.franklin.common.LocalizationConfig", Syntax.PROTO_2, null, "squareup/franklin/common/localization_config.proto");
        ADAPTER = localizationConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localizationConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizationConfig(List list, LanguageDisclosure languageDisclosure, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.language_disclosure = languageDisclosure;
        this.accepted_language_disclosures = TransactorKt.immutableCopyOf("accepted_language_disclosures", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalizationConfig)) {
            return false;
        }
        LocalizationConfig localizationConfig = (LocalizationConfig) obj;
        return Intrinsics.areEqual(unknownFields(), localizationConfig.unknownFields()) && Intrinsics.areEqual(this.accepted_language_disclosures, localizationConfig.accepted_language_disclosures) && Intrinsics.areEqual(this.language_disclosure, localizationConfig.language_disclosure);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.accepted_language_disclosures);
        LanguageDisclosure languageDisclosure = this.language_disclosure;
        int hashCode = m + (languageDisclosure != null ? languageDisclosure.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder();
        builder.f1372android = this.accepted_language_disclosures;
        builder.ios = this.language_disclosure;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.accepted_language_disclosures;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("accepted_language_disclosures=", arrayList, list);
        }
        LanguageDisclosure languageDisclosure = this.language_disclosure;
        if (languageDisclosure != null) {
            arrayList.add("language_disclosure=" + languageDisclosure);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalizationConfig{", "}", 0, null, null, 56);
    }
}

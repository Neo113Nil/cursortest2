package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.LocalizationConfig;
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
public final class LocalizedDisclosureCopy extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalizedDisclosureCopy> CREATOR;
    public final String accept_cta_text;
    public final String disclaimer_text;
    public final String intro_body;
    public final String locale;
    public final String option_label_text;
    public final String terms_body;
    public final String terms_header;
    public final String title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String accept_cta_text;
        public String disclaimer_text;
        public String intro_body;
        public String locale;
        public String option_label_text;
        public String terms_body;
        public String terms_header;
        public String title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalizedDisclosureCopy(this.locale, this.option_label_text, this.title, this.intro_body, this.terms_header, this.terms_body, this.disclaimer_text, this.accept_cta_text, buildUnknownFields());
                default:
                    return new LocalizationConfig.LocalizedDisclosureCopy(this.locale, this.option_label_text, this.title, this.intro_body, this.terms_header, this.terms_body, this.disclaimer_text, this.accept_cta_text, buildUnknownFields());
            }
        }
    }

    static {
        LocalizedDisclosureCopy$Companion$ADAPTER$1 localizedDisclosureCopy$Companion$ADAPTER$1 = new LocalizedDisclosureCopy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalizedDisclosureCopy.class), "type.googleapis.com/squareup.cash.cashcustomerprofile.api.v1.LocalizedDisclosureCopy", Syntax.PROTO_2, null, "squareup/cash/cashcustomerprofile/api/v1/get_locale_consent_acceptance.proto");
        ADAPTER = localizedDisclosureCopy$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localizedDisclosureCopy$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizedDisclosureCopy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.locale = str;
        this.option_label_text = str2;
        this.title = str3;
        this.intro_body = str4;
        this.terms_header = str5;
        this.terms_body = str6;
        this.disclaimer_text = str7;
        this.accept_cta_text = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalizedDisclosureCopy)) {
            return false;
        }
        LocalizedDisclosureCopy localizedDisclosureCopy = (LocalizedDisclosureCopy) obj;
        return Intrinsics.areEqual(unknownFields(), localizedDisclosureCopy.unknownFields()) && Intrinsics.areEqual(this.locale, localizedDisclosureCopy.locale) && Intrinsics.areEqual(this.option_label_text, localizedDisclosureCopy.option_label_text) && Intrinsics.areEqual(this.title, localizedDisclosureCopy.title) && Intrinsics.areEqual(this.intro_body, localizedDisclosureCopy.intro_body) && Intrinsics.areEqual(this.terms_header, localizedDisclosureCopy.terms_header) && Intrinsics.areEqual(this.terms_body, localizedDisclosureCopy.terms_body) && Intrinsics.areEqual(this.disclaimer_text, localizedDisclosureCopy.disclaimer_text) && Intrinsics.areEqual(this.accept_cta_text, localizedDisclosureCopy.accept_cta_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.locale;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.option_label_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.intro_body;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.terms_header;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.terms_body;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.disclaimer_text;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.accept_cta_text;
        int hashCode9 = hashCode8 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.locale = this.locale;
        builder.option_label_text = this.option_label_text;
        builder.title = this.title;
        builder.intro_body = this.intro_body;
        builder.terms_header = this.terms_header;
        builder.terms_body = this.terms_body;
        builder.disclaimer_text = this.disclaimer_text;
        builder.accept_cta_text = this.accept_cta_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.locale;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "locale=", arrayList);
        }
        String str2 = this.option_label_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "option_label_text=", arrayList);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        String str4 = this.intro_body;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "intro_body=", arrayList);
        }
        String str5 = this.terms_header;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "terms_header=", arrayList);
        }
        String str6 = this.terms_body;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "terms_body=", arrayList);
        }
        String str7 = this.disclaimer_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "disclaimer_text=", arrayList);
        }
        String str8 = this.accept_cta_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "accept_cta_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalizedDisclosureCopy{", "}", 0, null, null, 56);
    }
}

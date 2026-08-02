package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
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

/* loaded from: classes7.dex */
public final class LanguageDisclosure extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LanguageDisclosure> CREATOR;
    public final AcceptanceState acceptance_state;
    public final String locale;
    public final List localized_copy;
    public final String version;

    static {
        LanguageDisclosure$Companion$ADAPTER$1 languageDisclosure$Companion$ADAPTER$1 = new LanguageDisclosure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LanguageDisclosure.class), "type.googleapis.com/squareup.cash.cashcustomerprofile.api.v1.LanguageDisclosure", Syntax.PROTO_2, null, "squareup/cash/cashcustomerprofile/api/v1/get_locale_consent_acceptance.proto");
        ADAPTER = languageDisclosure$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(languageDisclosure$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDisclosure(String str, String str2, AcceptanceState acceptanceState, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.locale = str;
        this.version = str2;
        this.acceptance_state = acceptanceState;
        this.localized_copy = TransactorKt.immutableCopyOf("localized_copy", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LanguageDisclosure)) {
            return false;
        }
        LanguageDisclosure languageDisclosure = (LanguageDisclosure) obj;
        return Intrinsics.areEqual(unknownFields(), languageDisclosure.unknownFields()) && Intrinsics.areEqual(this.locale, languageDisclosure.locale) && Intrinsics.areEqual(this.version, languageDisclosure.version) && this.acceptance_state == languageDisclosure.acceptance_state && Intrinsics.areEqual(this.localized_copy, languageDisclosure.localized_copy);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.locale;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AcceptanceState acceptanceState = this.acceptance_state;
        int hashCode4 = this.localized_copy.hashCode() + ((hashCode3 + (acceptanceState != null ? acceptanceState.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(3, false);
        builder.title = this.locale;
        builder.icon = this.version;
        builder.enabled = this.acceptance_state;
        builder.id = this.localized_copy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.locale;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "locale=", arrayList);
        }
        String str2 = this.version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "version=", arrayList);
        }
        AcceptanceState acceptanceState = this.acceptance_state;
        if (acceptanceState != null) {
            arrayList.add("acceptance_state=" + acceptanceState);
        }
        List list = this.localized_copy;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("localized_copy=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LanguageDisclosure{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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

/* loaded from: classes8.dex */
public final class AcceptedLanguageDisclosure extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AcceptedLanguageDisclosure> CREATOR;
    public final String locale;
    public final String version;

    static {
        AcceptedLanguageDisclosure$Companion$ADAPTER$1 acceptedLanguageDisclosure$Companion$ADAPTER$1 = new AcceptedLanguageDisclosure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AcceptedLanguageDisclosure.class), "type.googleapis.com/squareup.franklin.common.AcceptedLanguageDisclosure", Syntax.PROTO_2, null, "squareup/franklin/common/localization_config.proto");
        ADAPTER = acceptedLanguageDisclosure$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(acceptedLanguageDisclosure$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptedLanguageDisclosure(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.locale = str;
        this.version = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcceptedLanguageDisclosure)) {
            return false;
        }
        AcceptedLanguageDisclosure acceptedLanguageDisclosure = (AcceptedLanguageDisclosure) obj;
        return Intrinsics.areEqual(unknownFields(), acceptedLanguageDisclosure.unknownFields()) && Intrinsics.areEqual(this.locale, acceptedLanguageDisclosure.locale) && Intrinsics.areEqual(this.version, acceptedLanguageDisclosure.version);
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
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(29);
        builder.name = this.locale;
        builder.value = this.version;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "AcceptedLanguageDisclosure{", "}", 0, null, null, 56);
    }
}

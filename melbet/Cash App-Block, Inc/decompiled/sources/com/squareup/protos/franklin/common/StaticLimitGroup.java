package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.AppLinks;
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

/* loaded from: classes.dex */
public final class StaticLimitGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StaticLimitGroup> CREATOR;
    public final SettingsGroup balance_settings_group;
    public final CurrencyCode currency;

    static {
        StaticLimitGroup$Companion$ADAPTER$1 staticLimitGroup$Companion$ADAPTER$1 = new StaticLimitGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StaticLimitGroup.class), "type.googleapis.com/squareup.franklin.common.StaticLimitGroup", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = staticLimitGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(staticLimitGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticLimitGroup(CurrencyCode currencyCode, SettingsGroup settingsGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.currency = currencyCode;
        this.balance_settings_group = settingsGroup;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticLimitGroup)) {
            return false;
        }
        StaticLimitGroup staticLimitGroup = (StaticLimitGroup) obj;
        return Intrinsics.areEqual(unknownFields(), staticLimitGroup.unknownFields()) && this.currency == staticLimitGroup.currency && Intrinsics.areEqual(this.balance_settings_group, staticLimitGroup.balance_settings_group);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.currency;
        int hashCode2 = (hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        SettingsGroup settingsGroup = this.balance_settings_group;
        int hashCode3 = hashCode2 + (settingsGroup != null ? settingsGroup.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(18);
        builder.f1372android = this.currency;
        builder.ios = this.balance_settings_group;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
        }
        SettingsGroup settingsGroup = this.balance_settings_group;
        if (settingsGroup != null) {
            arrayList.add("balance_settings_group=" + settingsGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StaticLimitGroup{", "}", 0, null, null, 56);
    }
}

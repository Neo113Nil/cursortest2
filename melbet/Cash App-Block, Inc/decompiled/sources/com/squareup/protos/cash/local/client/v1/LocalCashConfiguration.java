package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
public final class LocalCashConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashConfiguration> CREATOR;
    public final ApplicationMethod application_method;
    public final String description;
    public final Long local_cash_amount;
    public final LocalMoney local_cash_monetary_value;
    public final Boolean should_apply_by_default;

    public enum ApplicationMethod implements WireEnum {
        APPLICATION_METHOD_UNSPECIFIED(0),
        APPLICATION_METHOD_PRE_TAX_PRE_TIP(1),
        APPLICATION_METHOD_PRE_TAX_POST_TIP(2),
        APPLICATION_METHOD_POST_TAX_PRE_TIP(3),
        APPLICATION_METHOD_POST_TAX_POST_TIP(4);

        public static final LocalCashConfiguration$ApplicationMethod$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            ApplicationMethod applicationMethod = APPLICATION_METHOD_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new LocalCashConfiguration$ApplicationMethod$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ApplicationMethod.class), Syntax.PROTO_2, applicationMethod);
        }

        ApplicationMethod(int i) {
            this.value = i;
        }

        public static final ApplicationMethod fromValue(int i) {
            Companion.getClass();
            return ContactAliasType.Companion.m3893fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalCashConfiguration$Companion$ADAPTER$1 localCashConfiguration$Companion$ADAPTER$1 = new LocalCashConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashConfiguration.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashConfiguration", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = localCashConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashConfiguration(LocalMoney localMoney, String str, Long l, Boolean bool, ApplicationMethod applicationMethod, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.local_cash_monetary_value = localMoney;
        this.description = str;
        this.local_cash_amount = l;
        this.should_apply_by_default = bool;
        this.application_method = applicationMethod;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashConfiguration)) {
            return false;
        }
        LocalCashConfiguration localCashConfiguration = (LocalCashConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), localCashConfiguration.unknownFields()) && Intrinsics.areEqual(this.local_cash_monetary_value, localCashConfiguration.local_cash_monetary_value) && Intrinsics.areEqual(this.description, localCashConfiguration.description) && Intrinsics.areEqual(this.local_cash_amount, localCashConfiguration.local_cash_amount) && Intrinsics.areEqual(this.should_apply_by_default, localCashConfiguration.should_apply_by_default) && this.application_method == localCashConfiguration.application_method;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalMoney localMoney = this.local_cash_monetary_value;
        int hashCode2 = (hashCode + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.local_cash_amount;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.should_apply_by_default;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ApplicationMethod applicationMethod = this.application_method;
        int hashCode6 = hashCode5 + (applicationMethod != null ? applicationMethod.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(5);
        builder.icon = this.local_cash_monetary_value;
        builder.title = this.description;
        builder.subtitle = this.local_cash_amount;
        builder.action = this.should_apply_by_default;
        builder.icon_background_color = this.application_method;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalMoney localMoney = this.local_cash_monetary_value;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("local_cash_monetary_value=", localMoney, arrayList);
        }
        String str = this.description;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
        }
        Long l = this.local_cash_amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("local_cash_amount=", l, arrayList);
        }
        Boolean bool = this.should_apply_by_default;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_apply_by_default=", bool, arrayList);
        }
        ApplicationMethod applicationMethod = this.application_method;
        if (applicationMethod != null) {
            arrayList.add("application_method=" + applicationMethod);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashConfiguration{", "}", 0, null, null, 56);
    }
}

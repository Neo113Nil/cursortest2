package com.squareup.protos.consentsys.service;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.Order;
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
public final class CopyParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CopyParameters> CREATOR;
    public final String copy_group_token;
    public final String locale;
    public final Integer version;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String copy_group_token;
        public String locale;
        public Integer version;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CopyParameters(this.copy_group_token, this.version, this.locale, buildUnknownFields());
                default:
                    return new Order.FeatureMetadata.PaycheckConversionMetadata(this.copy_group_token, this.version, this.locale, buildUnknownFields());
            }
        }
    }

    static {
        CopyParameters$Companion$ADAPTER$1 copyParameters$Companion$ADAPTER$1 = new CopyParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CopyParameters.class), "type.googleapis.com/squareup.consentsys.service.CopyParameters", Syntax.PROTO_2, null, "squareup/consentsys/service.proto");
        ADAPTER = copyParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(copyParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyParameters(String str, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.copy_group_token = str;
        this.locale = str2;
        this.version = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CopyParameters)) {
            return false;
        }
        CopyParameters copyParameters = (CopyParameters) obj;
        return Intrinsics.areEqual(unknownFields(), copyParameters.unknownFields()) && Intrinsics.areEqual(this.copy_group_token, copyParameters.copy_group_token) && Intrinsics.areEqual(this.locale, copyParameters.locale) && Intrinsics.areEqual(this.version, copyParameters.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.copy_group_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.locale;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.version;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.copy_group_token = this.copy_group_token;
        builder.locale = this.locale;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.copy_group_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "copy_group_token=", arrayList);
        }
        String str2 = this.locale;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "locale=", arrayList);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CopyParameters{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CopyParameters(Integer num, String str, String str2) {
        this(str, num, str2, ByteString.EMPTY);
    }
}

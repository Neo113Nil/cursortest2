package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AppContext;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.CardDetailsProto$DisplaySettings;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OnboardResponse;
import com.squareup.protos.cash.local.client.v1.LocalLocationLinks;
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
public final class Identifiers extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Identifiers> CREATOR;
    public final String app_token;
    public final String app_version;
    public final String device_id;
    public final String operating_system;
    public final String operating_system_version;
    public final String vendor_id;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String app_token;
        public String app_version;
        public String device_id;
        public String operating_system;
        public String operating_system_version;
        public String vendor_id;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Identifiers(this.operating_system, this.operating_system_version, this.app_version, this.app_token, this.device_id, this.vendor_id, buildUnknownFields());
                case 1:
                    return new AppContext(this.operating_system, this.operating_system_version, this.app_version, this.app_token, this.device_id, this.vendor_id, buildUnknownFields());
                case 2:
                    return new CardDetailsProto$DisplaySettings(this.operating_system, this.operating_system_version, this.app_version, this.app_token, this.device_id, this.vendor_id, buildUnknownFields());
                case 3:
                    return new OnboardResponse(this.operating_system, this.operating_system_version, this.app_version, this.app_token, this.device_id, this.vendor_id, buildUnknownFields());
                default:
                    return new LocalLocationLinks(this.operating_system, this.operating_system_version, this.app_version, this.app_token, this.device_id, this.vendor_id, buildUnknownFields());
            }
        }
    }

    static {
        Identifiers$Companion$ADAPTER$1 identifiers$Companion$ADAPTER$1 = new Identifiers$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Identifiers.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.Identifiers", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = identifiers$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(identifiers$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Identifiers(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.operating_system = str;
        this.operating_system_version = str2;
        this.app_version = str3;
        this.app_token = str4;
        this.device_id = str5;
        this.vendor_id = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Identifiers)) {
            return false;
        }
        Identifiers identifiers = (Identifiers) obj;
        return Intrinsics.areEqual(unknownFields(), identifiers.unknownFields()) && Intrinsics.areEqual(this.operating_system, identifiers.operating_system) && Intrinsics.areEqual(this.operating_system_version, identifiers.operating_system_version) && Intrinsics.areEqual(this.app_version, identifiers.app_version) && Intrinsics.areEqual(this.app_token, identifiers.app_token) && Intrinsics.areEqual(this.device_id, identifiers.device_id) && Intrinsics.areEqual(this.vendor_id, identifiers.vendor_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.operating_system;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.operating_system_version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.app_version;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.app_token;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.device_id;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.vendor_id;
        int hashCode7 = hashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.operating_system = this.operating_system;
        builder.operating_system_version = this.operating_system_version;
        builder.app_version = this.app_version;
        builder.app_token = this.app_token;
        builder.device_id = this.device_id;
        builder.vendor_id = this.vendor_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.operating_system;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "operating_system=", arrayList);
        }
        String str2 = this.operating_system_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "operating_system_version=", arrayList);
        }
        String str3 = this.app_version;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "app_version=", arrayList);
        }
        String str4 = this.app_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "app_token=", arrayList);
        }
        String str5 = this.device_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "device_id=", arrayList);
        }
        String str6 = this.vendor_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "vendor_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Identifiers{", "}", 0, null, null, 56);
    }
}

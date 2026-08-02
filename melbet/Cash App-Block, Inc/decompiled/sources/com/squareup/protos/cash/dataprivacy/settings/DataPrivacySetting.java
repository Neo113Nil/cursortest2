package com.squareup.protos.cash.dataprivacy.settings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class DataPrivacySetting extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DataPrivacySetting> CREATOR;
    public final Boolean enabled;
    public final System system;

    public enum System implements WireEnum {
        APPSFLYER(1),
        ANALYTICS(2),
        CRASH_REPORTING(3);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final DataPrivacySetting$System$Companion$ADAPTER$1 ADAPTER = new DataPrivacySetting$System$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(System.class), Syntax.PROTO_2, null);

        System(int i) {
            this.value = i;
        }

        public static final System fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return APPSFLYER;
            }
            if (i == 2) {
                return ANALYTICS;
            }
            if (i != 3) {
                return null;
            }
            return CRASH_REPORTING;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DataPrivacySetting$Companion$ADAPTER$1 dataPrivacySetting$Companion$ADAPTER$1 = new DataPrivacySetting$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DataPrivacySetting.class), "type.googleapis.com/squareup.cash.dataprivacy.settings.DataPrivacySetting", Syntax.PROTO_2, null, "squareup/cash/dataprivacy/settings/data_privacy_settings.proto");
        ADAPTER = dataPrivacySetting$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dataPrivacySetting$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataPrivacySetting(System system, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.system = system;
        this.enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataPrivacySetting)) {
            return false;
        }
        DataPrivacySetting dataPrivacySetting = (DataPrivacySetting) obj;
        return Intrinsics.areEqual(unknownFields(), dataPrivacySetting.unknownFields()) && this.system == dataPrivacySetting.system && Intrinsics.areEqual(this.enabled, dataPrivacySetting.enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        System system = this.system;
        int hashCode2 = (hashCode + (system != null ? system.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(6);
        builder.f1268type = this.system;
        builder.details = this.enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        System system = this.system;
        if (system != null) {
            arrayList.add("system=" + system);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DataPrivacySetting{", "}", 0, null, null, 56);
    }
}

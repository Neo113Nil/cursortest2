package com.squareup.protos.cash.dataprivacy.settings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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
public final class DataPrivacySettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DataPrivacySettings> CREATOR;
    public final List settings;

    static {
        DataPrivacySettings$Companion$ADAPTER$1 dataPrivacySettings$Companion$ADAPTER$1 = new DataPrivacySettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DataPrivacySettings.class), "type.googleapis.com/squareup.cash.dataprivacy.settings.DataPrivacySettings", Syntax.PROTO_2, null, "squareup/cash/dataprivacy/settings/data_privacy_settings.proto");
        ADAPTER = dataPrivacySettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dataPrivacySettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataPrivacySettings(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.settings = TransactorKt.immutableCopyOf(PreferenceManager.PREF_SETTINGS, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataPrivacySettings)) {
            return false;
        }
        DataPrivacySettings dataPrivacySettings = (DataPrivacySettings) obj;
        return Intrinsics.areEqual(unknownFields(), dataPrivacySettings.unknownFields()) && Intrinsics.areEqual(this.settings, dataPrivacySettings.settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.settings.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(6, false);
        builder.scenarios = this.settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.settings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("settings=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DataPrivacySettings{", "}", 0, null, null, 56);
    }
}

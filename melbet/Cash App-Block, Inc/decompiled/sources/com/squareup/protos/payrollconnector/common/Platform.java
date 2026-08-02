package com.squareup.protos.payrollconnector.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class Platform extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Platform> CREATOR;
    public final String canonical_name;
    public final SourceIdentifier source_id;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final PlatformType f1405type;

    static {
        Platform$Companion$ADAPTER$1 platform$Companion$ADAPTER$1 = new Platform$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Platform.class), "type.googleapis.com/squareup.payrollconnector.common.Platform", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = platform$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(platform$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Platform(String str, String str2, SourceIdentifier sourceIdentifier, PlatformType platformType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.canonical_name = str2;
        this.source_id = sourceIdentifier;
        this.f1405type = platformType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Platform)) {
            return false;
        }
        Platform platform = (Platform) obj;
        return Intrinsics.areEqual(unknownFields(), platform.unknownFields()) && Intrinsics.areEqual(this.token, platform.token) && Intrinsics.areEqual(this.canonical_name, platform.canonical_name) && Intrinsics.areEqual(this.source_id, platform.source_id) && this.f1405type == platform.f1405type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.canonical_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SourceIdentifier sourceIdentifier = this.source_id;
        int hashCode4 = (hashCode3 + (sourceIdentifier != null ? sourceIdentifier.hashCode() : 0)) * 37;
        PlatformType platformType = this.f1405type;
        int hashCode5 = hashCode4 + (platformType != null ? platformType.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(23);
        builder.account = this.token;
        builder.enabled = this.canonical_name;
        builder.button = this.source_id;
        builder.dda_form = this.f1405type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.canonical_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "canonical_name=", arrayList);
        }
        SourceIdentifier sourceIdentifier = this.source_id;
        if (sourceIdentifier != null) {
            arrayList.add("source_id=" + sourceIdentifier);
        }
        PlatformType platformType = this.f1405type;
        if (platformType != null) {
            arrayList.add("type=" + platformType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Platform{", "}", 0, null, null, 56);
    }
}

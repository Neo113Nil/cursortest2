package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class AndroidSignals extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AndroidSignals> CREATOR;
    public final Boolean is_phone_call_active;

    static {
        AndroidSignals$Companion$ADAPTER$1 androidSignals$Companion$ADAPTER$1 = new AndroidSignals$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AndroidSignals.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.AndroidSignals", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = androidSignals$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(androidSignals$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSignals(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_phone_call_active = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidSignals)) {
            return false;
        }
        AndroidSignals androidSignals = (AndroidSignals) obj;
        return Intrinsics.areEqual(unknownFields(), androidSignals.unknownFields()) && Intrinsics.areEqual(this.is_phone_call_active, androidSignals.is_phone_call_active);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_phone_call_active;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(17);
        builder.activated = this.is_phone_call_active;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_phone_call_active;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_phone_call_active=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AndroidSignals{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AndroidSignals(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }
}

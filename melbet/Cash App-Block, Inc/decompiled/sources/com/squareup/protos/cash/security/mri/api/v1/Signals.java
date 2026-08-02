package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import androidx.tracing.Trace;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class Signals extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Signals> CREATOR;
    public final Boolean is_adb_enabled;
    public final Boolean is_debugger_attached;
    public final Boolean is_developer_mode_enabled;
    public final Boolean is_overlay_on_screen;
    public final Boolean is_screen_being_mirrored;
    public final Boolean is_screen_recording;
    public final Boolean is_se_linux_enforcing;
    public final Boolean is_vpn_connected;
    public final Trace platform_signals;
    public final ThreeDsSignals three_ds_signals;

    public final class Builder extends Message.Builder {
        public Boolean is_adb_enabled;
        public Boolean is_debugger_attached;
        public Boolean is_developer_mode_enabled;
        public Boolean is_overlay_on_screen;
        public Boolean is_screen_being_mirrored;
        public Boolean is_screen_recording;
        public Boolean is_se_linux_enforcing;
        public Boolean is_vpn_connected;
        public Trace platform_signals;
        public ThreeDsSignals three_ds_signals;

        @Override // com.squareup.wire.Message.Builder
        public final Signals build() {
            return new Signals(this.is_developer_mode_enabled, this.is_debugger_attached, this.is_screen_being_mirrored, this.is_vpn_connected, this.is_se_linux_enforcing, this.is_adb_enabled, this.is_screen_recording, this.is_overlay_on_screen, this.three_ds_signals, this.platform_signals, buildUnknownFields());
        }
    }

    static {
        Signals$Companion$ADAPTER$1 signals$Companion$ADAPTER$1 = new Signals$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Signals.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.Signals", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = signals$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(signals$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Signals(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, ThreeDsSignals threeDsSignals, Trace trace, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_developer_mode_enabled = bool;
        this.is_debugger_attached = bool2;
        this.is_screen_being_mirrored = bool3;
        this.is_vpn_connected = bool4;
        this.is_se_linux_enforcing = bool5;
        this.is_adb_enabled = bool6;
        this.is_screen_recording = bool7;
        this.is_overlay_on_screen = bool8;
        this.three_ds_signals = threeDsSignals;
        this.platform_signals = trace;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Signals)) {
            return false;
        }
        Signals signals = (Signals) obj;
        return Intrinsics.areEqual(unknownFields(), signals.unknownFields()) && Intrinsics.areEqual(this.is_developer_mode_enabled, signals.is_developer_mode_enabled) && Intrinsics.areEqual(this.is_debugger_attached, signals.is_debugger_attached) && Intrinsics.areEqual(this.is_screen_being_mirrored, signals.is_screen_being_mirrored) && Intrinsics.areEqual(this.is_vpn_connected, signals.is_vpn_connected) && Intrinsics.areEqual(this.is_se_linux_enforcing, signals.is_se_linux_enforcing) && Intrinsics.areEqual(this.is_adb_enabled, signals.is_adb_enabled) && Intrinsics.areEqual(this.is_screen_recording, signals.is_screen_recording) && Intrinsics.areEqual(this.is_overlay_on_screen, signals.is_overlay_on_screen) && Intrinsics.areEqual(this.three_ds_signals, signals.three_ds_signals) && Intrinsics.areEqual(this.platform_signals, signals.platform_signals);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_developer_mode_enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_debugger_attached;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_screen_being_mirrored;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.is_vpn_connected;
        int hashCode5 = (hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.is_se_linux_enforcing;
        int hashCode6 = (hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.is_adb_enabled;
        int hashCode7 = (hashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.is_screen_recording;
        int hashCode8 = (hashCode7 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        Boolean bool8 = this.is_overlay_on_screen;
        int hashCode9 = (hashCode8 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        ThreeDsSignals threeDsSignals = this.three_ds_signals;
        int hashCode10 = (hashCode9 + (threeDsSignals != null ? threeDsSignals.hashCode() : 0)) * 37;
        Trace trace = this.platform_signals;
        int hashCode11 = hashCode10 + (trace != null ? trace.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.is_developer_mode_enabled = this.is_developer_mode_enabled;
        builder.is_debugger_attached = this.is_debugger_attached;
        builder.is_screen_being_mirrored = this.is_screen_being_mirrored;
        builder.is_vpn_connected = this.is_vpn_connected;
        builder.is_se_linux_enforcing = this.is_se_linux_enforcing;
        builder.is_adb_enabled = this.is_adb_enabled;
        builder.is_screen_recording = this.is_screen_recording;
        builder.is_overlay_on_screen = this.is_overlay_on_screen;
        builder.three_ds_signals = this.three_ds_signals;
        builder.platform_signals = this.platform_signals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_developer_mode_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_developer_mode_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.is_debugger_attached;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_debugger_attached=", bool2, arrayList);
        }
        Boolean bool3 = this.is_screen_being_mirrored;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_screen_being_mirrored=", bool3, arrayList);
        }
        Boolean bool4 = this.is_vpn_connected;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_vpn_connected=", bool4, arrayList);
        }
        Boolean bool5 = this.is_se_linux_enforcing;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_se_linux_enforcing=", bool5, arrayList);
        }
        Boolean bool6 = this.is_adb_enabled;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_adb_enabled=", bool6, arrayList);
        }
        Boolean bool7 = this.is_screen_recording;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_screen_recording=", bool7, arrayList);
        }
        Boolean bool8 = this.is_overlay_on_screen;
        if (bool8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_overlay_on_screen=", bool8, arrayList);
        }
        ThreeDsSignals threeDsSignals = this.three_ds_signals;
        if (threeDsSignals != null) {
            arrayList.add("three_ds_signals=" + threeDsSignals);
        }
        Trace trace = this.platform_signals;
        if (trace != null) {
            arrayList.add("platform_signals=" + trace);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Signals{", "}", 0, null, null, 56);
    }
}

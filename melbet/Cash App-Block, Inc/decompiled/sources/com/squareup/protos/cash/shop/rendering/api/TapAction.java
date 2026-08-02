package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.protos.cash.ui.SplitButtons;
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

/* loaded from: classes8.dex */
public final class TapAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TapAction> CREATOR;
    public final zzle action;
    public final List analytics_tap_events;

    static {
        TapAction$Companion$ADAPTER$1 tapAction$Companion$ADAPTER$1 = new TapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TapAction.class), "type.googleapis.com/squareup.cash.shop.rendering.api.TapAction", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
        ADAPTER = tapAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tapAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapAction(zzle zzleVar, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.action = zzleVar;
        this.analytics_tap_events = TransactorKt.immutableCopyOf("analytics_tap_events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TapAction)) {
            return false;
        }
        TapAction tapAction = (TapAction) obj;
        return Intrinsics.areEqual(unknownFields(), tapAction.unknownFields()) && Intrinsics.areEqual(this.action, tapAction.action) && Intrinsics.areEqual(this.analytics_tap_events, tapAction.analytics_tap_events);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzle zzleVar = this.action;
        int hashCode2 = this.analytics_tap_events.hashCode() + ((hashCode + (zzleVar != null ? zzleVar.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(6);
        builder.primary_button = this.action;
        builder.secondary_button = this.analytics_tap_events;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzle zzleVar = this.action;
        if (zzleVar != null) {
            arrayList.add("action=" + zzleVar);
        }
        List list = this.analytics_tap_events;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("analytics_tap_events=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TapAction{", "}", 0, null, null, 56);
    }

    public TapAction(zzle zzleVar, List list) {
        this(zzleVar, list, ByteString.EMPTY);
    }
}

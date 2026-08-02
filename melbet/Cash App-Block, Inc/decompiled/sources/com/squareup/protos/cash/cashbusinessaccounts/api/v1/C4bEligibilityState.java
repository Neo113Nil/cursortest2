package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

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

/* loaded from: classes.dex */
public final class C4bEligibilityState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<C4bEligibilityState> CREATOR;
    public final Boolean is_eligible;

    static {
        C4bEligibilityState$Companion$ADAPTER$1 c4bEligibilityState$Companion$ADAPTER$1 = new C4bEligibilityState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(C4bEligibilityState.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1.C4bEligibilityState", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1/c4b_features.proto");
        ADAPTER = c4bEligibilityState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(c4bEligibilityState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4bEligibilityState(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_eligible = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4bEligibilityState)) {
            return false;
        }
        C4bEligibilityState c4bEligibilityState = (C4bEligibilityState) obj;
        return Intrinsics.areEqual(unknownFields(), c4bEligibilityState.unknownFields()) && Intrinsics.areEqual(this.is_eligible, c4bEligibilityState.is_eligible);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_eligible;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(3);
        builder.activated = this.is_eligible;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_eligible=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "C4bEligibilityState{", "}", 0, null, null, 56);
    }

    public /* synthetic */ C4bEligibilityState(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }
}

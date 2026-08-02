package com.squareup.protos.cash.staff.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.ui.SplitButtons;
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

/* loaded from: classes8.dex */
public final class CashForWorkAppletV1 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashForWorkAppletV1> CREATOR;
    public final Boolean shows_banner;
    public final Visibility visibility;

    public enum Visibility implements WireEnum {
        VISIBILITY_UNSPECIFIED(0),
        VISIBLE(1),
        HIDDEN(2);

        public static final CashForWorkAppletV1$Visibility$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            Visibility visibility = VISIBILITY_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new CashForWorkAppletV1$Visibility$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Visibility.class), Syntax.PROTO_2, visibility);
        }

        Visibility(int i) {
            this.value = i;
        }

        public static final Visibility fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return VISIBILITY_UNSPECIFIED;
            }
            if (i == 1) {
                return VISIBLE;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashForWorkAppletV1$Companion$ADAPTER$1 cashForWorkAppletV1$Companion$ADAPTER$1 = new CashForWorkAppletV1$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashForWorkAppletV1.class), "type.googleapis.com/squareup.cash.staff.syncvalues.CashForWorkAppletV1", Syntax.PROTO_2, null, "squareup/cash/staff/syncvalues/CashForWorkApplet.proto");
        ADAPTER = cashForWorkAppletV1$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashForWorkAppletV1$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashForWorkAppletV1(Visibility visibility, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.visibility = visibility;
        this.shows_banner = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashForWorkAppletV1)) {
            return false;
        }
        CashForWorkAppletV1 cashForWorkAppletV1 = (CashForWorkAppletV1) obj;
        return Intrinsics.areEqual(unknownFields(), cashForWorkAppletV1.unknownFields()) && this.visibility == cashForWorkAppletV1.visibility && Intrinsics.areEqual(this.shows_banner, cashForWorkAppletV1.shows_banner);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Visibility visibility = this.visibility;
        int hashCode2 = (hashCode + (visibility != null ? visibility.hashCode() : 0)) * 37;
        Boolean bool = this.shows_banner;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(8);
        builder.primary_button = this.visibility;
        builder.secondary_button = this.shows_banner;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Visibility visibility = this.visibility;
        if (visibility != null) {
            arrayList.add("visibility=" + visibility);
        }
        Boolean bool = this.shows_banner;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("shows_banner=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashForWorkAppletV1{", "}", 0, null, null, 56);
    }
}

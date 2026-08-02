package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.protos.cash.cats.Cats;
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
public final class BreakRule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BreakRule> CREATOR;
    public final String created_at;
    public final String effective_start_at;
    public final RoutesKt rule;
    public final String updated_at;

    public final class EarnEveryXSeconds extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EarnEveryXSeconds> CREATOR;
        public final Long threshold_seconds;

        static {
            BreakRule$EarnEveryXSeconds$Companion$ADAPTER$1 breakRule$EarnEveryXSeconds$Companion$ADAPTER$1 = new BreakRule$EarnEveryXSeconds$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnEveryXSeconds.class), "type.googleapis.com/squareup.timecards.BreakRule.EarnEveryXSeconds", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
            ADAPTER = breakRule$EarnEveryXSeconds$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(breakRule$EarnEveryXSeconds$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarnEveryXSeconds(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.threshold_seconds = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EarnEveryXSeconds)) {
                return false;
            }
            EarnEveryXSeconds earnEveryXSeconds = (EarnEveryXSeconds) obj;
            return Intrinsics.areEqual(unknownFields(), earnEveryXSeconds.unknownFields()) && Intrinsics.areEqual(this.threshold_seconds, earnEveryXSeconds.threshold_seconds);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.threshold_seconds;
            int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Cats.Builder builder = new Cats.Builder(13);
            builder.cat_count = this.threshold_seconds;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.threshold_seconds;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("threshold_seconds=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EarnEveryXSeconds{", "}", 0, null, null, 56);
        }
    }

    public final class EarnOnceIfShiftAtLeastXSeconds extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EarnOnceIfShiftAtLeastXSeconds> CREATOR;
        public final Long threshold_seconds;

        static {
            BreakRule$EarnOnceIfShiftAtLeastXSeconds$Companion$ADAPTER$1 breakRule$EarnOnceIfShiftAtLeastXSeconds$Companion$ADAPTER$1 = new BreakRule$EarnOnceIfShiftAtLeastXSeconds$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnOnceIfShiftAtLeastXSeconds.class), "type.googleapis.com/squareup.timecards.BreakRule.EarnOnceIfShiftAtLeastXSeconds", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
            ADAPTER = breakRule$EarnOnceIfShiftAtLeastXSeconds$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(breakRule$EarnOnceIfShiftAtLeastXSeconds$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarnOnceIfShiftAtLeastXSeconds(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.threshold_seconds = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EarnOnceIfShiftAtLeastXSeconds)) {
                return false;
            }
            EarnOnceIfShiftAtLeastXSeconds earnOnceIfShiftAtLeastXSeconds = (EarnOnceIfShiftAtLeastXSeconds) obj;
            return Intrinsics.areEqual(unknownFields(), earnOnceIfShiftAtLeastXSeconds.unknownFields()) && Intrinsics.areEqual(this.threshold_seconds, earnOnceIfShiftAtLeastXSeconds.threshold_seconds);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.threshold_seconds;
            int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Cats.Builder builder = new Cats.Builder(14);
            builder.cat_count = this.threshold_seconds;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.threshold_seconds;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("threshold_seconds=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EarnOnceIfShiftAtLeastXSeconds{", "}", 0, null, null, 56);
        }
    }

    static {
        BreakRule$Companion$ADAPTER$1 breakRule$Companion$ADAPTER$1 = new BreakRule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BreakRule.class), "type.googleapis.com/squareup.timecards.BreakRule", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = breakRule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(breakRule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreakRule(String str, String str2, String str3, RoutesKt routesKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.effective_start_at = str;
        this.created_at = str2;
        this.updated_at = str3;
        this.rule = routesKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BreakRule)) {
            return false;
        }
        BreakRule breakRule = (BreakRule) obj;
        return Intrinsics.areEqual(unknownFields(), breakRule.unknownFields()) && Intrinsics.areEqual(this.effective_start_at, breakRule.effective_start_at) && Intrinsics.areEqual(this.created_at, breakRule.created_at) && Intrinsics.areEqual(this.updated_at, breakRule.updated_at) && Intrinsics.areEqual(this.rule, breakRule.rule);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.effective_start_at;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.created_at;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.updated_at;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        RoutesKt routesKt = this.rule;
        int hashCode5 = hashCode4 + (routesKt != null ? routesKt.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(28);
        builder.account = this.effective_start_at;
        builder.enabled = this.created_at;
        builder.button = this.updated_at;
        builder.dda_form = this.rule;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.effective_start_at;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "effective_start_at=", arrayList);
        }
        String str2 = this.created_at;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "created_at=", arrayList);
        }
        String str3 = this.updated_at;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "updated_at=", arrayList);
        }
        RoutesKt routesKt = this.rule;
        if (routesKt != null) {
            arrayList.add("rule=" + routesKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BreakRule{", "}", 0, null, null, 56);
    }
}

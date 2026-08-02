package com.squareup.protos.cash.tigers;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.contacts.app.ImageResolution;
import com.squareup.protos.cash.marketprices.PriceTick;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.timecards.InstantRange;
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
public final class Tigers extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Tigers> CREATOR;
    public final Long fetch_version;
    public final Long tiger_count;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long fetch_version;
        public Long tiger_count;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Tigers(this.tiger_count, this.fetch_version, buildUnknownFields());
                case 1:
                    return new ImageResolution(this.tiger_count, this.fetch_version, buildUnknownFields());
                case 2:
                    return new PriceTick(this.tiger_count, this.fetch_version, buildUnknownFields());
                case 3:
                    return new NotificationCategoryExtraConfig.CategoryEligibility(this.tiger_count, this.fetch_version, buildUnknownFields());
                case 4:
                    return new com.squareup.protos.franklin.common.PriceTick(this.tiger_count, this.fetch_version, buildUnknownFields());
                default:
                    return new InstantRange(this.tiger_count, this.fetch_version, buildUnknownFields());
            }
        }
    }

    static {
        Tigers$Companion$ADAPTER$1 tigers$Companion$ADAPTER$1 = new Tigers$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tigers.class), "type.googleapis.com/squareup.cash.tigers.Tigers", Syntax.PROTO_2, null, "squareup/cash/tigers/tigers.proto");
        ADAPTER = tigers$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tigers$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tigers(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tiger_count = l;
        this.fetch_version = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tigers)) {
            return false;
        }
        Tigers tigers = (Tigers) obj;
        return Intrinsics.areEqual(unknownFields(), tigers.unknownFields()) && Intrinsics.areEqual(this.tiger_count, tigers.tiger_count) && Intrinsics.areEqual(this.fetch_version, tigers.fetch_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.tiger_count;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.fetch_version;
        int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.tiger_count = this.tiger_count;
        builder.fetch_version = this.fetch_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.tiger_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tiger_count=", l, arrayList);
        }
        Long l2 = this.fetch_version;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fetch_version=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Tigers{", "}", 0, null, null, 56);
    }
}

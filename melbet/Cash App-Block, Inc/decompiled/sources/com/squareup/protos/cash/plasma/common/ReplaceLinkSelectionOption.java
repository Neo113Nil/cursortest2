package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.plasma.common.ExistingLinkSelectionOption;
import com.squareup.protos.franklin.api.CashInstrumentType;
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
public final class ReplaceLinkSelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReplaceLinkSelectionOption> CREATOR;
    public final String instrument_token;
    public final CashInstrumentType instrument_type;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String instrument_token;
        public CashInstrumentType instrument_type;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ReplaceLinkSelectionOption(this.instrument_token, this.instrument_type, buildUnknownFields());
                default:
                    return new ExistingLinkSelectionOption.InstrumentOption(this.instrument_token, this.instrument_type, buildUnknownFields());
            }
        }
    }

    static {
        ReplaceLinkSelectionOption$Companion$ADAPTER$1 replaceLinkSelectionOption$Companion$ADAPTER$1 = new ReplaceLinkSelectionOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReplaceLinkSelectionOption.class), "type.googleapis.com/squareup.cash.plasma.common.ReplaceLinkSelectionOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
        ADAPTER = replaceLinkSelectionOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(replaceLinkSelectionOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplaceLinkSelectionOption(String str, CashInstrumentType cashInstrumentType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_type = cashInstrumentType;
        this.instrument_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReplaceLinkSelectionOption)) {
            return false;
        }
        ReplaceLinkSelectionOption replaceLinkSelectionOption = (ReplaceLinkSelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), replaceLinkSelectionOption.unknownFields()) && this.instrument_type == replaceLinkSelectionOption.instrument_type && Intrinsics.areEqual(this.instrument_token, replaceLinkSelectionOption.instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashInstrumentType cashInstrumentType = this.instrument_type;
        int hashCode2 = (hashCode + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.instrument_type = this.instrument_type;
        builder.instrument_token = this.instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashInstrumentType cashInstrumentType = this.instrument_type;
        if (cashInstrumentType != null) {
            arrayList.add("instrument_type=" + cashInstrumentType);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReplaceLinkSelectionOption{", "}", 0, null, null, 56);
    }
}

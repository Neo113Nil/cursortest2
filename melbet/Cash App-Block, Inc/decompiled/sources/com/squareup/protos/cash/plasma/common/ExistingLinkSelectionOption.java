package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.core.model.ProcessingMode;
import com.squareup.protos.cash.plasma.common.ReplaceLinkSelectionOption;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.api.CashInstrumentType;
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
public final class ExistingLinkSelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExistingLinkSelectionOption> CREATOR;
    public final String instrument_token;
    public final CashInstrumentType instrument_type;
    public final Boolean is_consolidated;
    public final List options;
    public final ProcessingMode processing_mode;

    public final class InstrumentOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstrumentOption> CREATOR;
        public final String instrument_token;
        public final CashInstrumentType instrument_type;

        static {
            ExistingLinkSelectionOption$InstrumentOption$Companion$ADAPTER$1 existingLinkSelectionOption$InstrumentOption$Companion$ADAPTER$1 = new ExistingLinkSelectionOption$InstrumentOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentOption.class), "type.googleapis.com/squareup.cash.plasma.common.ExistingLinkSelectionOption.InstrumentOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
            ADAPTER = existingLinkSelectionOption$InstrumentOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(existingLinkSelectionOption$InstrumentOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentOption(String str, CashInstrumentType cashInstrumentType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrument_type = cashInstrumentType;
            this.instrument_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstrumentOption)) {
                return false;
            }
            InstrumentOption instrumentOption = (InstrumentOption) obj;
            return Intrinsics.areEqual(unknownFields(), instrumentOption.unknownFields()) && this.instrument_type == instrumentOption.instrument_type && Intrinsics.areEqual(this.instrument_token, instrumentOption.instrument_token);
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
            ReplaceLinkSelectionOption.Builder builder = new ReplaceLinkSelectionOption.Builder(1);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentOption{", "}", 0, null, null, 56);
        }
    }

    static {
        ExistingLinkSelectionOption$Companion$ADAPTER$1 existingLinkSelectionOption$Companion$ADAPTER$1 = new ExistingLinkSelectionOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExistingLinkSelectionOption.class), "type.googleapis.com/squareup.cash.plasma.common.ExistingLinkSelectionOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
        ADAPTER = existingLinkSelectionOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(existingLinkSelectionOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExistingLinkSelectionOption(CashInstrumentType cashInstrumentType, String str, List list, ProcessingMode processingMode, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.instrument_type = cashInstrumentType;
        this.instrument_token = str;
        this.processing_mode = processingMode;
        this.is_consolidated = bool;
        this.options = TransactorKt.immutableCopyOf("options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExistingLinkSelectionOption)) {
            return false;
        }
        ExistingLinkSelectionOption existingLinkSelectionOption = (ExistingLinkSelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), existingLinkSelectionOption.unknownFields()) && this.instrument_type == existingLinkSelectionOption.instrument_type && Intrinsics.areEqual(this.instrument_token, existingLinkSelectionOption.instrument_token) && Intrinsics.areEqual(this.options, existingLinkSelectionOption.options) && this.processing_mode == existingLinkSelectionOption.processing_mode && Intrinsics.areEqual(this.is_consolidated, existingLinkSelectionOption.is_consolidated);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.options);
        ProcessingMode processingMode = this.processing_mode;
        int hashCode3 = (m + (processingMode != null ? processingMode.hashCode() : 0)) * 37;
        Boolean bool = this.is_consolidated;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(3, false);
        builder.instant_usec = this.instrument_type;
        builder.posix_tz = this.instrument_token;
        builder.tz_name = this.options;
        builder.ordinal = this.processing_mode;
        builder.timezone_offset_min = this.is_consolidated;
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
        List list = this.options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, list);
        }
        ProcessingMode processingMode = this.processing_mode;
        if (processingMode != null) {
            arrayList.add("processing_mode=" + processingMode);
        }
        Boolean bool = this.is_consolidated;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_consolidated=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExistingLinkSelectionOption{", "}", 0, null, null, 56);
    }
}

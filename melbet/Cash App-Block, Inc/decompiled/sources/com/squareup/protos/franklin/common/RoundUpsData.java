package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.franklin.common.AppLinks;
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
public final class RoundUpsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RoundUpsData> CREATOR;
    public final Automation.AutomationStatus status;
    public final Automation.AutomationTarget target;

    static {
        RoundUpsData$Companion$ADAPTER$1 roundUpsData$Companion$ADAPTER$1 = new RoundUpsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RoundUpsData.class), "type.googleapis.com/squareup.franklin.common.RoundUpsData", Syntax.PROTO_2, null, "squareup/franklin/common/rounds_up_data.proto");
        ADAPTER = roundUpsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(roundUpsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundUpsData(Automation.AutomationStatus automationStatus, Automation.AutomationTarget automationTarget, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = automationStatus;
        this.target = automationTarget;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoundUpsData)) {
            return false;
        }
        RoundUpsData roundUpsData = (RoundUpsData) obj;
        return Intrinsics.areEqual(unknownFields(), roundUpsData.unknownFields()) && this.status == roundUpsData.status && Intrinsics.areEqual(this.target, roundUpsData.target);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Automation.AutomationStatus automationStatus = this.status;
        int hashCode2 = (hashCode + (automationStatus != null ? automationStatus.hashCode() : 0)) * 37;
        Automation.AutomationTarget automationTarget = this.target;
        int hashCode3 = hashCode2 + (automationTarget != null ? automationTarget.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(15);
        builder.f1372android = this.status;
        builder.ios = this.target;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Automation.AutomationStatus automationStatus = this.status;
        if (automationStatus != null) {
            arrayList.add("status=" + automationStatus);
        }
        Automation.AutomationTarget automationTarget = this.target;
        if (automationTarget != null) {
            arrayList.add("target=" + automationTarget);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RoundUpsData{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Activity;
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
public final class FeatureContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FeatureContext> CREATOR;
    public final MoneybotContext moneybot_context;

    static {
        FeatureContext$Companion$ADAPTER$1 featureContext$Companion$ADAPTER$1 = new FeatureContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeatureContext.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.FeatureContext", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = featureContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(featureContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureContext(MoneybotContext moneybotContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.moneybot_context = moneybotContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureContext)) {
            return false;
        }
        FeatureContext featureContext = (FeatureContext) obj;
        return Intrinsics.areEqual(unknownFields(), featureContext.unknownFields()) && Intrinsics.areEqual(this.moneybot_context, featureContext.moneybot_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MoneybotContext moneybotContext = this.moneybot_context;
        int hashCode2 = hashCode + (moneybotContext != null ? moneybotContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(5);
        builder.activity = this.moneybot_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MoneybotContext moneybotContext = this.moneybot_context;
        if (moneybotContext != null) {
            arrayList.add("moneybot_context=" + moneybotContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeatureContext{", "}", 0, null, null, 56);
    }
}

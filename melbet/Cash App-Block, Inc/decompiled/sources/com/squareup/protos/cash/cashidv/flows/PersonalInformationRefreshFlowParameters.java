package com.squareup.protos.cash.cashidv.flows;

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

/* loaded from: classes7.dex */
public final class PersonalInformationRefreshFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalInformationRefreshFlowParameters> CREATOR;
    public final Boolean confirm_without_review;

    static {
        PersonalInformationRefreshFlowParameters$Companion$ADAPTER$1 personalInformationRefreshFlowParameters$Companion$ADAPTER$1 = new PersonalInformationRefreshFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PersonalInformationRefreshFlowParameters.class), "type.googleapis.com/squareup.cash.cashidv.flows.PersonalInformationRefreshFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashidv/flows/FlowParameters.proto");
        ADAPTER = personalInformationRefreshFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(personalInformationRefreshFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInformationRefreshFlowParameters(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.confirm_without_review = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalInformationRefreshFlowParameters)) {
            return false;
        }
        PersonalInformationRefreshFlowParameters personalInformationRefreshFlowParameters = (PersonalInformationRefreshFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), personalInformationRefreshFlowParameters.unknownFields()) && Intrinsics.areEqual(this.confirm_without_review, personalInformationRefreshFlowParameters.confirm_without_review);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.confirm_without_review;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(false);
        builder.activated = this.confirm_without_review;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.confirm_without_review;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("confirm_without_review=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalInformationRefreshFlowParameters{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.franklin.ui;

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

/* loaded from: classes8.dex */
public final class UiMarketing extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiMarketing> CREATOR;
    public final Boolean suppress_review_prompt;

    static {
        UiMarketing$Companion$ADAPTER$1 uiMarketing$Companion$ADAPTER$1 = new UiMarketing$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiMarketing.class), "type.googleapis.com/squareup.franklin.ui.UiMarketing", Syntax.PROTO_2, null, "squareup/franklin/ui/marketing.proto");
        ADAPTER = uiMarketing$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiMarketing$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiMarketing(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.suppress_review_prompt = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiMarketing)) {
            return false;
        }
        UiMarketing uiMarketing = (UiMarketing) obj;
        return Intrinsics.areEqual(unknownFields(), uiMarketing.unknownFields()) && Intrinsics.areEqual(this.suppress_review_prompt, uiMarketing.suppress_review_prompt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.suppress_review_prompt;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(25);
        builder.activated = this.suppress_review_prompt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.suppress_review_prompt;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_review_prompt=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiMarketing{", "}", 0, null, null, 56);
    }
}

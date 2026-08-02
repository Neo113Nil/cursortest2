package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class MRIContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MRIContext> CREATOR;
    public final Identifiers identifiers;
    public final Signals signals;

    static {
        MRIContext$Companion$ADAPTER$1 mRIContext$Companion$ADAPTER$1 = new MRIContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MRIContext.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.MRIContext", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = mRIContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(mRIContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRIContext(Identifiers identifiers, Signals signals, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.identifiers = identifiers;
        this.signals = signals;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MRIContext)) {
            return false;
        }
        MRIContext mRIContext = (MRIContext) obj;
        return Intrinsics.areEqual(unknownFields(), mRIContext.unknownFields()) && Intrinsics.areEqual(this.identifiers, mRIContext.identifiers) && Intrinsics.areEqual(this.signals, mRIContext.signals);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Identifiers identifiers = this.identifiers;
        int hashCode2 = (hashCode + (identifiers != null ? identifiers.hashCode() : 0)) * 37;
        Signals signals = this.signals;
        int hashCode3 = hashCode2 + (signals != null ? signals.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(1);
        builder.primary_button = this.identifiers;
        builder.secondary_button = this.signals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Identifiers identifiers = this.identifiers;
        if (identifiers != null) {
            arrayList.add("identifiers=" + identifiers);
        }
        Signals signals = this.signals;
        if (signals != null) {
            arrayList.add("signals=" + signals);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MRIContext{", "}", 0, null, null, 56);
    }
}

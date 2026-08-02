package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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
public final class RefreshTrigger extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshTrigger> CREATOR;
    public final RefreshTrigger$Trigger$BoostContentUpdate trigger;

    public final class BoostContentUpdateTrigger extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BoostContentUpdateTrigger> CREATOR;
        public final List boost_tokens;

        static {
            RefreshTrigger$BoostContentUpdateTrigger$Companion$ADAPTER$1 refreshTrigger$BoostContentUpdateTrigger$Companion$ADAPTER$1 = new RefreshTrigger$BoostContentUpdateTrigger$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BoostContentUpdateTrigger.class), "type.googleapis.com/squareup.cash.genericelements.ui.RefreshTrigger.BoostContentUpdateTrigger", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = refreshTrigger$BoostContentUpdateTrigger$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(refreshTrigger$BoostContentUpdateTrigger$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BoostContentUpdateTrigger(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.boost_tokens = TransactorKt.immutableCopyOf("boost_tokens", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BoostContentUpdateTrigger)) {
                return false;
            }
            BoostContentUpdateTrigger boostContentUpdateTrigger = (BoostContentUpdateTrigger) obj;
            return Intrinsics.areEqual(unknownFields(), boostContentUpdateTrigger.unknownFields()) && Intrinsics.areEqual(this.boost_tokens, boostContentUpdateTrigger.boost_tokens);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.boost_tokens.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SandboxMetadata.Builder builder = new SandboxMetadata.Builder(16, false);
            builder.scenarios = this.boost_tokens;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.boost_tokens;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("boost_tokens=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BoostContentUpdateTrigger{", "}", 0, null, null, 56);
        }
    }

    static {
        RefreshTrigger$Companion$ADAPTER$1 refreshTrigger$Companion$ADAPTER$1 = new RefreshTrigger$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RefreshTrigger.class), "type.googleapis.com/squareup.cash.genericelements.ui.RefreshTrigger", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = refreshTrigger$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(refreshTrigger$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTrigger(RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.trigger = refreshTrigger$Trigger$BoostContentUpdate;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshTrigger)) {
            return false;
        }
        RefreshTrigger refreshTrigger = (RefreshTrigger) obj;
        return Intrinsics.areEqual(unknownFields(), refreshTrigger.unknownFields()) && Intrinsics.areEqual(this.trigger, refreshTrigger.trigger);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = this.trigger;
        int hashCode2 = hashCode + (refreshTrigger$Trigger$BoostContentUpdate != null ? refreshTrigger$Trigger$BoostContentUpdate.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(27);
        builder.asset_type = this.trigger;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = this.trigger;
        if (refreshTrigger$Trigger$BoostContentUpdate != null) {
            arrayList.add("trigger=" + refreshTrigger$Trigger$BoostContentUpdate);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshTrigger{", "}", 0, null, null, 56);
    }
}

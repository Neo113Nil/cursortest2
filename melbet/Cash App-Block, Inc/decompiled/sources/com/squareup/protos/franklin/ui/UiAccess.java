package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.privacy.SetSearchPrivacySettingsRequest;
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
public final class UiAccess extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiAccess> CREATOR;
    public final Boolean app_lock_activated;
    public final Boolean has_passcode;
    public final Boolean require_passcode_confirmation;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean app_lock_activated;
        public Boolean has_passcode;
        public Boolean require_passcode_confirmation;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiAccess(this.require_passcode_confirmation, this.has_passcode, this.app_lock_activated, buildUnknownFields());
                default:
                    return new SetSearchPrivacySettingsRequest(this.require_passcode_confirmation, this.has_passcode, this.app_lock_activated, buildUnknownFields());
            }
        }
    }

    static {
        UiAccess$Companion$ADAPTER$1 uiAccess$Companion$ADAPTER$1 = new UiAccess$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiAccess.class), "type.googleapis.com/squareup.franklin.ui.UiAccess", Syntax.PROTO_2, null, "squareup/franklin/ui/access.proto");
        ADAPTER = uiAccess$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiAccess$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAccess(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.require_passcode_confirmation = bool;
        this.has_passcode = bool2;
        this.app_lock_activated = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiAccess)) {
            return false;
        }
        UiAccess uiAccess = (UiAccess) obj;
        return Intrinsics.areEqual(unknownFields(), uiAccess.unknownFields()) && Intrinsics.areEqual(this.require_passcode_confirmation, uiAccess.require_passcode_confirmation) && Intrinsics.areEqual(this.has_passcode, uiAccess.has_passcode) && Intrinsics.areEqual(this.app_lock_activated, uiAccess.app_lock_activated);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.require_passcode_confirmation;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.has_passcode;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.app_lock_activated;
        int hashCode4 = hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.require_passcode_confirmation = this.require_passcode_confirmation;
        builder.has_passcode = this.has_passcode;
        builder.app_lock_activated = this.app_lock_activated;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.require_passcode_confirmation;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_passcode_confirmation=", bool, arrayList);
        }
        Boolean bool2 = this.has_passcode;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_passcode=", bool2, arrayList);
        }
        Boolean bool3 = this.app_lock_activated;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_lock_activated=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiAccess{", "}", 0, null, null, 56);
    }
}

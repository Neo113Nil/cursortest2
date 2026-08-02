package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NewDeviceLoginRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NewDeviceLoginRenderData> CREATOR;
    public final String action_url;
    public final String icon_url;
    public final Status status;

    public enum Status implements WireEnum {
        UNREVIEWED(1),
        VERIFIED(2),
        LOGGED_OUT(3);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final NewDeviceLoginRenderData$Status$Companion$ADAPTER$1 ADAPTER = new NewDeviceLoginRenderData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return UNREVIEWED;
            }
            if (i == 2) {
                return VERIFIED;
            }
            if (i != 3) {
                return null;
            }
            return LOGGED_OUT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        NewDeviceLoginRenderData$Companion$ADAPTER$1 newDeviceLoginRenderData$Companion$ADAPTER$1 = new NewDeviceLoginRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NewDeviceLoginRenderData.class), "type.googleapis.com/squareup.franklin.NewDeviceLoginRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = newDeviceLoginRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(newDeviceLoginRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDeviceLoginRenderData(String str, String str2, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action_url = str;
        this.icon_url = str2;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewDeviceLoginRenderData)) {
            return false;
        }
        NewDeviceLoginRenderData newDeviceLoginRenderData = (NewDeviceLoginRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), newDeviceLoginRenderData.unknownFields()) && Intrinsics.areEqual(this.action_url, newDeviceLoginRenderData.action_url) && Intrinsics.areEqual(this.icon_url, newDeviceLoginRenderData.icon_url) && this.status == newDeviceLoginRenderData.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.action_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.icon_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode4 = hashCode3 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(24, false);
        builder.institution_token = this.action_url;
        builder.display_info = this.icon_url;
        builder.help_menu_items = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.action_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
        }
        String str2 = this.icon_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_url=", arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NewDeviceLoginRenderData{", "}", 0, null, null, 56);
    }
}

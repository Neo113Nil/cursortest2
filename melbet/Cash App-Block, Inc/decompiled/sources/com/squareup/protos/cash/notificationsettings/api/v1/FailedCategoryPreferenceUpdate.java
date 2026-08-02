package com.squareup.protos.cash.notificationsettings.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class FailedCategoryPreferenceUpdate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FailedCategoryPreferenceUpdate> CREATOR;
    public final String error_message;
    public final CategoryPreferenceUpdate update;

    static {
        FailedCategoryPreferenceUpdate$Companion$ADAPTER$1 failedCategoryPreferenceUpdate$Companion$ADAPTER$1 = new FailedCategoryPreferenceUpdate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FailedCategoryPreferenceUpdate.class), "type.googleapis.com/squareup.cash.notificationsettings.api.v1.FailedCategoryPreferenceUpdate", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/api/v1/update_category_notification_settings.proto");
        ADAPTER = failedCategoryPreferenceUpdate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(failedCategoryPreferenceUpdate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedCategoryPreferenceUpdate(String str, CategoryPreferenceUpdate categoryPreferenceUpdate, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.error_message = str;
        this.update = categoryPreferenceUpdate;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FailedCategoryPreferenceUpdate)) {
            return false;
        }
        FailedCategoryPreferenceUpdate failedCategoryPreferenceUpdate = (FailedCategoryPreferenceUpdate) obj;
        return Intrinsics.areEqual(unknownFields(), failedCategoryPreferenceUpdate.unknownFields()) && Intrinsics.areEqual(this.error_message, failedCategoryPreferenceUpdate.error_message) && Intrinsics.areEqual(this.update, failedCategoryPreferenceUpdate.update);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.error_message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CategoryPreferenceUpdate categoryPreferenceUpdate = this.update;
        int hashCode3 = hashCode2 + (categoryPreferenceUpdate != null ? categoryPreferenceUpdate.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(3);
        builder.f1329type = this.error_message;
        builder.use_case = this.update;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.error_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error_message=", arrayList);
        }
        CategoryPreferenceUpdate categoryPreferenceUpdate = this.update;
        if (categoryPreferenceUpdate != null) {
            arrayList.add("update=" + categoryPreferenceUpdate);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FailedCategoryPreferenceUpdate{", "}", 0, null, null, 56);
    }
}

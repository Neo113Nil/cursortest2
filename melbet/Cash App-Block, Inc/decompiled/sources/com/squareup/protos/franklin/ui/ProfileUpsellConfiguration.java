package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class ProfileUpsellConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileUpsellConfiguration> CREATOR;
    public final List upsell_entity_ids_priority;

    static {
        ProfileUpsellConfiguration$Companion$ADAPTER$1 profileUpsellConfiguration$Companion$ADAPTER$1 = new ProfileUpsellConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileUpsellConfiguration.class), "type.googleapis.com/squareup.franklin.ui.ProfileUpsellConfiguration", Syntax.PROTO_2, null, "squareup/franklin/ui/profile_page_upsell_configuration.proto");
        ADAPTER = profileUpsellConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileUpsellConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUpsellConfiguration(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.upsell_entity_ids_priority = TransactorKt.immutableCopyOf("upsell_entity_ids_priority", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileUpsellConfiguration)) {
            return false;
        }
        ProfileUpsellConfiguration profileUpsellConfiguration = (ProfileUpsellConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), profileUpsellConfiguration.unknownFields()) && Intrinsics.areEqual(this.upsell_entity_ids_priority, profileUpsellConfiguration.upsell_entity_ids_priority);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.upsell_entity_ids_priority.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(6, false);
        builder.items = this.upsell_entity_ids_priority;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.upsell_entity_ids_priority;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("upsell_entity_ids_priority=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileUpsellConfiguration{", "}", 0, null, null, 56);
    }
}

package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/SyncContactsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/ColoredButton$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SyncContactsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncContactsResponse> CREATOR;
    public final List add_contacts;
    public final List remove_hashed_aliases;
    public final Status status;
    public final String sync_token;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        TOO_MANY_ATTEMPTS(3);

        public static final SyncContactsResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ByteString.Companion();
            ADAPTER = new SyncContactsResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 3) {
                return null;
            }
            return TOO_MANY_ATTEMPTS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncContactsResponse$Companion$ADAPTER$1 syncContactsResponse$Companion$ADAPTER$1 = new SyncContactsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncContactsResponse.class), "type.googleapis.com/squareup.franklin.app.SyncContactsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/contacts.proto");
        ADAPTER = syncContactsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncContactsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncContactsResponse(Status status, String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.status = status;
        this.sync_token = str;
        this.add_contacts = TransactorKt.immutableCopyOf("add_contacts", list);
        this.remove_hashed_aliases = TransactorKt.immutableCopyOf("remove_hashed_aliases", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncContactsResponse)) {
            return false;
        }
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), syncContactsResponse.unknownFields()) && this.status == syncContactsResponse.status && Intrinsics.areEqual(this.sync_token, syncContactsResponse.sync_token) && Intrinsics.areEqual(this.add_contacts, syncContactsResponse.add_contacts) && Intrinsics.areEqual(this.remove_hashed_aliases, syncContactsResponse.remove_hashed_aliases);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.sync_token;
        int hashCode3 = this.remove_hashed_aliases.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.add_contacts);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(17);
        builder.button_color = this.status;
        builder.text_color = this.sync_token;
        builder.text = this.add_contacts;
        builder.action = this.remove_hashed_aliases;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        String str = this.sync_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sync_token=", arrayList);
        }
        List list = this.add_contacts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("add_contacts=", arrayList, list);
        }
        if (!this.remove_hashed_aliases.isEmpty()) {
            arrayList.add("remove_hashed_aliases=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncContactsResponse{", "}", 0, null, null, 56);
    }
}

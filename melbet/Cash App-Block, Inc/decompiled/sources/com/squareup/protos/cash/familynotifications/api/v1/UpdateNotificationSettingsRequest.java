package com.squareup.protos.cash.familynotifications.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateNotificationSettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateNotificationSettingsRequest> CREATOR;
    public final String customer_token;
    public final List settings;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateNotificationSettingsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.familynotifications.api.v1.UpdateNotificationSettingsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateNotificationSettingsRequest((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(NotificationSetting.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateNotificationSettingsRequest updateNotificationSettingsRequest = (UpdateNotificationSettingsRequest) obj;
                reverseProtoWriter.getClass();
                updateNotificationSettingsRequest.getClass();
                reverseProtoWriter.writeBytes(updateNotificationSettingsRequest.unknownFields());
                NotificationSetting.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, updateNotificationSettingsRequest.settings);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, updateNotificationSettingsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateNotificationSettingsRequest updateNotificationSettingsRequest = (UpdateNotificationSettingsRequest) obj;
                updateNotificationSettingsRequest.getClass();
                return NotificationSetting.ADAPTER.asRepeated().encodedSizeWithTag(2, updateNotificationSettingsRequest.settings) + ProtoAdapter.STRING.encodedSizeWithTag(1, updateNotificationSettingsRequest.customer_token) + updateNotificationSettingsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateNotificationSettingsRequest updateNotificationSettingsRequest = (UpdateNotificationSettingsRequest) obj;
                updateNotificationSettingsRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateNotificationSettingsRequest.settings, NotificationSetting.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = updateNotificationSettingsRequest.customer_token;
                byteString.getClass();
                return new UpdateNotificationSettingsRequest(str, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateNotificationSettingsRequest updateNotificationSettingsRequest = (UpdateNotificationSettingsRequest) obj;
                updateNotificationSettingsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateNotificationSettingsRequest.customer_token);
                NotificationSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, updateNotificationSettingsRequest.settings);
                protoWriter.writeBytes(updateNotificationSettingsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateNotificationSettingsRequest(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.settings = TransactorKt.immutableCopyOf(PreferenceManager.PREF_SETTINGS, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateNotificationSettingsRequest)) {
            return false;
        }
        UpdateNotificationSettingsRequest updateNotificationSettingsRequest = (UpdateNotificationSettingsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateNotificationSettingsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, updateNotificationSettingsRequest.customer_token) && Intrinsics.areEqual(this.settings, updateNotificationSettingsRequest.settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = this.settings.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(16);
        builder.toggle_title = this.customer_token;
        builder.sections = this.settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.settings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("settings=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateNotificationSettingsRequest{", "}", 0, null, null, 56);
    }
}

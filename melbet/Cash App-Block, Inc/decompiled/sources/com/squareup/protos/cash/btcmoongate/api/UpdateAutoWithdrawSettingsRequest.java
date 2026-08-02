package com.squareup.protos.cash.btcmoongate.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateAutoWithdrawSettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateAutoWithdrawSettingsRequest> CREATOR;
    public final AutoWithdrawSettings settings;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public AutoWithdrawSettings settings;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UpdateAutoWithdrawSettingsRequest(this.settings, buildUnknownFields());
                default:
                    return new UpdateAutoWithdrawSettingsResponse(this.settings, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateAutoWithdrawSettingsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateAutoWithdrawSettingsRequest((AutoWithdrawSettings) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(AutoWithdrawSettings.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest = (UpdateAutoWithdrawSettingsRequest) obj;
                reverseProtoWriter.getClass();
                updateAutoWithdrawSettingsRequest.getClass();
                reverseProtoWriter.writeBytes(updateAutoWithdrawSettingsRequest.unknownFields());
                AutoWithdrawSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateAutoWithdrawSettingsRequest.settings);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest = (UpdateAutoWithdrawSettingsRequest) obj;
                updateAutoWithdrawSettingsRequest.getClass();
                return AutoWithdrawSettings.ADAPTER.encodedSizeWithTag(1, updateAutoWithdrawSettingsRequest.settings) + updateAutoWithdrawSettingsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest = (UpdateAutoWithdrawSettingsRequest) obj;
                updateAutoWithdrawSettingsRequest.getClass();
                AutoWithdrawSettings autoWithdrawSettings = updateAutoWithdrawSettingsRequest.settings;
                AutoWithdrawSettings autoWithdrawSettings2 = autoWithdrawSettings != null ? (AutoWithdrawSettings) AutoWithdrawSettings.ADAPTER.redact(autoWithdrawSettings) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new UpdateAutoWithdrawSettingsRequest(autoWithdrawSettings2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest = (UpdateAutoWithdrawSettingsRequest) obj;
                updateAutoWithdrawSettingsRequest.getClass();
                AutoWithdrawSettings.ADAPTER.encodeWithTag(protoWriter, 1, updateAutoWithdrawSettingsRequest.settings);
                protoWriter.writeBytes(updateAutoWithdrawSettingsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAutoWithdrawSettingsRequest(AutoWithdrawSettings autoWithdrawSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.settings = autoWithdrawSettings;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateAutoWithdrawSettingsRequest)) {
            return false;
        }
        UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest = (UpdateAutoWithdrawSettingsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateAutoWithdrawSettingsRequest.unknownFields()) && Intrinsics.areEqual(this.settings, updateAutoWithdrawSettingsRequest.settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AutoWithdrawSettings autoWithdrawSettings = this.settings;
        int hashCode2 = hashCode + (autoWithdrawSettings != null ? autoWithdrawSettings.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.settings = this.settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AutoWithdrawSettings autoWithdrawSettings = this.settings;
        if (autoWithdrawSettings != null) {
            arrayList.add("settings=" + autoWithdrawSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateAutoWithdrawSettingsRequest{", "}", 0, null, null, 56);
    }
}

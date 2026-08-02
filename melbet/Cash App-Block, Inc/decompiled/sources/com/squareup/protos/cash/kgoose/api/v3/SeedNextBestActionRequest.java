package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem;", "actions", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SeedNextBestActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SeedNextBestActionRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SeedNextBestActionItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<SeedNextBestActionItem> actions;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 1, tag = 2)
    public final OnBehalfOf on_behalf_of;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionRequest;", "<init>", "()V", "actions", "", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public List<SeedNextBestActionItem> actions = EmptyList.INSTANCE;
        public OnBehalfOf on_behalf_of;

        public final Builder actions(List<SeedNextBestActionItem> actions) {
            actions.getClass();
            TransactorKt.checkElementsNotNull(actions);
            this.actions = actions;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SeedNextBestActionRequest build() {
            return new SeedNextBestActionRequest(this.on_behalf_of, this.actions, buildUnknownFields());
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SeedNextBestActionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.SeedNextBestActionRequest$Companion$ADAPTER$1
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
                        return new SeedNextBestActionRequest((OnBehalfOf) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(SeedNextBestActionItem.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SeedNextBestActionRequest seedNextBestActionRequest = (SeedNextBestActionRequest) obj;
                reverseProtoWriter.getClass();
                seedNextBestActionRequest.getClass();
                reverseProtoWriter.writeBytes(seedNextBestActionRequest.unknownFields());
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 2, seedNextBestActionRequest.on_behalf_of);
                SeedNextBestActionItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, seedNextBestActionRequest.actions);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SeedNextBestActionRequest seedNextBestActionRequest = (SeedNextBestActionRequest) obj;
                seedNextBestActionRequest.getClass();
                return OnBehalfOf.ADAPTER.encodedSizeWithTag(2, seedNextBestActionRequest.on_behalf_of) + SeedNextBestActionItem.ADAPTER.asRepeated().encodedSizeWithTag(1, seedNextBestActionRequest.actions) + seedNextBestActionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SeedNextBestActionRequest seedNextBestActionRequest = (SeedNextBestActionRequest) obj;
                seedNextBestActionRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(seedNextBestActionRequest.actions, SeedNextBestActionItem.ADAPTER);
                OnBehalfOf onBehalfOf = seedNextBestActionRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SeedNextBestActionRequest(onBehalfOf2, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SeedNextBestActionRequest seedNextBestActionRequest = (SeedNextBestActionRequest) obj;
                seedNextBestActionRequest.getClass();
                SeedNextBestActionItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, seedNextBestActionRequest.actions);
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 2, seedNextBestActionRequest.on_behalf_of);
                protoWriter.writeBytes(seedNextBestActionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedNextBestActionRequest(OnBehalfOf onBehalfOf, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.on_behalf_of = onBehalfOf;
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeedNextBestActionRequest)) {
            return false;
        }
        SeedNextBestActionRequest seedNextBestActionRequest = (SeedNextBestActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), seedNextBestActionRequest.unknownFields()) && Intrinsics.areEqual(this.actions, seedNextBestActionRequest.actions) && Intrinsics.areEqual(this.on_behalf_of, seedNextBestActionRequest.on_behalf_of);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.actions);
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode = m + (onBehalfOf != null ? onBehalfOf.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.actions = this.actions;
        builder.on_behalf_of = this.on_behalf_of;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.actions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, this.actions);
        }
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SeedNextBestActionRequest{", "}", 0, null, null, 56);
    }
}

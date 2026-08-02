package com.squareup.protos.cash.janus.syncvalues;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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
public final class SyncValueAccounts extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncValueAccounts> CREATOR;
    public final List accounts;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SyncValueAccounts.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SyncValueAccounts(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(FullAccount.ADAPTER.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SyncValueAccounts syncValueAccounts = (SyncValueAccounts) obj;
                reverseProtoWriter.getClass();
                syncValueAccounts.getClass();
                reverseProtoWriter.writeBytes(syncValueAccounts.unknownFields());
                FullAccount.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, syncValueAccounts.accounts);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SyncValueAccounts syncValueAccounts = (SyncValueAccounts) obj;
                syncValueAccounts.getClass();
                return FullAccount.ADAPTER.asRepeated().encodedSizeWithTag(1, syncValueAccounts.accounts) + syncValueAccounts.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SyncValueAccounts syncValueAccounts = (SyncValueAccounts) obj;
                syncValueAccounts.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(syncValueAccounts.accounts, FullAccount.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SyncValueAccounts(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SyncValueAccounts syncValueAccounts = (SyncValueAccounts) obj;
                syncValueAccounts.getClass();
                FullAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, syncValueAccounts.accounts);
                protoWriter.writeBytes(syncValueAccounts.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncValueAccounts(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.accounts = TransactorKt.immutableCopyOf("accounts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncValueAccounts)) {
            return false;
        }
        SyncValueAccounts syncValueAccounts = (SyncValueAccounts) obj;
        return Intrinsics.areEqual(unknownFields(), syncValueAccounts.unknownFields()) && Intrinsics.areEqual(this.accounts, syncValueAccounts.accounts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.accounts.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(25);
        builder.scenarios = this.accounts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.accounts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("accounts=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncValueAccounts{", "}", 0, null, null, 56);
    }
}

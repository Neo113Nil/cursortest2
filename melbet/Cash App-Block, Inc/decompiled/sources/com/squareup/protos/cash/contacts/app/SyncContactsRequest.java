package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncContactsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncContactsRequest> CREATOR;
    public final ByteString encrypted_patch;
    public final String previous_patch_id;
    public final List unencrypted_address_book_contacts;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SyncContactsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.contacts.app.SyncContactsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SyncContactsRequest((String) obj, m, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(AddressBookContact.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                reverseProtoWriter.getClass();
                syncContactsRequest.getClass();
                reverseProtoWriter.writeBytes(syncContactsRequest.unknownFields());
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, syncContactsRequest.encrypted_patch);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, syncContactsRequest.previous_patch_id);
                AddressBookContact.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, syncContactsRequest.unencrypted_address_book_contacts);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                syncContactsRequest.getClass();
                return ProtoAdapter.BYTES.encodedSizeWithTag(3, syncContactsRequest.encrypted_patch) + ProtoAdapter.STRING.encodedSizeWithTag(2, syncContactsRequest.previous_patch_id) + AddressBookContact.ADAPTER.asRepeated().encodedSizeWithTag(1, syncContactsRequest.unencrypted_address_book_contacts) + syncContactsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                syncContactsRequest.getClass();
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                String str = syncContactsRequest.previous_patch_id;
                ByteString byteString2 = syncContactsRequest.encrypted_patch;
                emptyList.getClass();
                byteString.getClass();
                return new SyncContactsRequest(str, emptyList, byteString2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
                syncContactsRequest.getClass();
                AddressBookContact.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, syncContactsRequest.unencrypted_address_book_contacts);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncContactsRequest.previous_patch_id);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, syncContactsRequest.encrypted_patch);
                protoWriter.writeBytes(syncContactsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncContactsRequest(String str, List list, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.previous_patch_id = str;
        this.encrypted_patch = byteString;
        this.unencrypted_address_book_contacts = TransactorKt.immutableCopyOf("unencrypted_address_book_contacts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncContactsRequest)) {
            return false;
        }
        SyncContactsRequest syncContactsRequest = (SyncContactsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), syncContactsRequest.unknownFields()) && Intrinsics.areEqual(this.unencrypted_address_book_contacts, syncContactsRequest.unencrypted_address_book_contacts) && Intrinsics.areEqual(this.previous_patch_id, syncContactsRequest.previous_patch_id) && Intrinsics.areEqual(this.encrypted_patch, syncContactsRequest.encrypted_patch);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.unencrypted_address_book_contacts);
        String str = this.previous_patch_id;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.encrypted_patch;
        int hashCode2 = hashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder();
        builder.payment_schedule = this.unencrypted_address_book_contacts;
        builder.loan_type = this.previous_patch_id;
        builder.tila_data = this.encrypted_patch;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.unencrypted_address_book_contacts.isEmpty()) {
            arrayList.add("unencrypted_address_book_contacts=██");
        }
        String str = this.previous_patch_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "previous_patch_id=", arrayList);
        }
        ByteString byteString = this.encrypted_patch;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encrypted_patch=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncContactsRequest{", "}", 0, null, null, 56);
    }
}

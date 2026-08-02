package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cryptoinvestflow.CryptoPayrollPreference;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncCryptoPayrollPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncCryptoPayrollPreference((CryptoPayrollPreference) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CryptoPayrollPreference.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = (SyncCryptoPayrollPreference) obj;
        reverseProtoWriter.getClass();
        syncCryptoPayrollPreference.getClass();
        reverseProtoWriter.writeBytes(syncCryptoPayrollPreference.unknownFields());
        CryptoPayrollPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncCryptoPayrollPreference.preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = (SyncCryptoPayrollPreference) obj;
        syncCryptoPayrollPreference.getClass();
        return CryptoPayrollPreference.ADAPTER.encodedSizeWithTag(1, syncCryptoPayrollPreference.preference) + syncCryptoPayrollPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = (SyncCryptoPayrollPreference) obj;
        syncCryptoPayrollPreference.getClass();
        CryptoPayrollPreference cryptoPayrollPreference = syncCryptoPayrollPreference.preference;
        CryptoPayrollPreference cryptoPayrollPreference2 = cryptoPayrollPreference != null ? (CryptoPayrollPreference) CryptoPayrollPreference.ADAPTER.redact(cryptoPayrollPreference) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncCryptoPayrollPreference(cryptoPayrollPreference2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = (SyncCryptoPayrollPreference) obj;
        syncCryptoPayrollPreference.getClass();
        CryptoPayrollPreference.ADAPTER.encodeWithTag(protoWriter, 1, syncCryptoPayrollPreference.preference);
        protoWriter.writeBytes(syncCryptoPayrollPreference.unknownFields());
    }
}

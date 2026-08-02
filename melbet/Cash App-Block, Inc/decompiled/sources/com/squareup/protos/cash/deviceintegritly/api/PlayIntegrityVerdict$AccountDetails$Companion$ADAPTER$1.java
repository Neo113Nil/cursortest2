package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PlayIntegrityVerdict$AccountDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PlayIntegrityVerdict.AccountDetails((PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PlayIntegrityVerdict.AccountDetails accountDetails = (PlayIntegrityVerdict.AccountDetails) obj;
        reverseProtoWriter.getClass();
        accountDetails.getClass();
        reverseProtoWriter.writeBytes(accountDetails.unknownFields());
        PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.ADAPTER.encodeWithTag(reverseProtoWriter, 1, accountDetails.app_licensing_verdict);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlayIntegrityVerdict.AccountDetails accountDetails = (PlayIntegrityVerdict.AccountDetails) obj;
        accountDetails.getClass();
        return PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.ADAPTER.encodedSizeWithTag(1, accountDetails.app_licensing_verdict) + accountDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlayIntegrityVerdict.AccountDetails accountDetails = (PlayIntegrityVerdict.AccountDetails) obj;
        accountDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict appLicensingVerdict = accountDetails.app_licensing_verdict;
        byteString.getClass();
        return new PlayIntegrityVerdict.AccountDetails(appLicensingVerdict, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlayIntegrityVerdict.AccountDetails accountDetails = (PlayIntegrityVerdict.AccountDetails) obj;
        accountDetails.getClass();
        PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.ADAPTER.encodeWithTag(protoWriter, 1, accountDetails.app_licensing_verdict);
        protoWriter.writeBytes(accountDetails.unknownFields());
    }
}

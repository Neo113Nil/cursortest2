package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstantPayRenderData$Paycheck$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantPayRenderData.Paycheck((String) obj, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstantPayRenderData.Paycheck paycheck = (InstantPayRenderData.Paycheck) obj;
        reverseProtoWriter.getClass();
        paycheck.getClass();
        reverseProtoWriter.writeBytes(paycheck.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paycheck.localizable_name);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paycheck.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantPayRenderData.Paycheck paycheck = (InstantPayRenderData.Paycheck) obj;
        paycheck.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(2, paycheck.localizable_name) + ProtoAdapter.STRING.encodedSizeWithTag(1, paycheck.name) + paycheck.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantPayRenderData.Paycheck paycheck = (InstantPayRenderData.Paycheck) obj;
        paycheck.getClass();
        LocalizableString localizableString = paycheck.localizable_name;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paycheck.name;
        byteString.getClass();
        return new InstantPayRenderData.Paycheck(str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantPayRenderData.Paycheck paycheck = (InstantPayRenderData.Paycheck) obj;
        paycheck.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paycheck.name);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 2, paycheck.localizable_name);
        protoWriter.writeBytes(paycheck.unknownFields());
    }
}

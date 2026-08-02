package com.squareup.protos.payrollconnector.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PayrollProviderUiSpecification$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PayrollProviderUiSpecification((PayrollProviderUiAvatar) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PayrollProviderUiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PayrollProviderUiSpecification payrollProviderUiSpecification = (PayrollProviderUiSpecification) obj;
        reverseProtoWriter.getClass();
        payrollProviderUiSpecification.getClass();
        reverseProtoWriter.writeBytes(payrollProviderUiSpecification.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, payrollProviderUiSpecification.title);
        PayrollProviderUiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, payrollProviderUiSpecification.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PayrollProviderUiSpecification payrollProviderUiSpecification = (PayrollProviderUiSpecification) obj;
        payrollProviderUiSpecification.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, payrollProviderUiSpecification.title) + PayrollProviderUiAvatar.ADAPTER.encodedSizeWithTag(1, payrollProviderUiSpecification.avatar) + payrollProviderUiSpecification.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PayrollProviderUiSpecification payrollProviderUiSpecification = (PayrollProviderUiSpecification) obj;
        payrollProviderUiSpecification.getClass();
        PayrollProviderUiAvatar payrollProviderUiAvatar = payrollProviderUiSpecification.avatar;
        PayrollProviderUiAvatar payrollProviderUiAvatar2 = payrollProviderUiAvatar != null ? (PayrollProviderUiAvatar) PayrollProviderUiAvatar.ADAPTER.redact(payrollProviderUiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = payrollProviderUiSpecification.title;
        byteString.getClass();
        return new PayrollProviderUiSpecification(payrollProviderUiAvatar2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PayrollProviderUiSpecification payrollProviderUiSpecification = (PayrollProviderUiSpecification) obj;
        payrollProviderUiSpecification.getClass();
        PayrollProviderUiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, payrollProviderUiSpecification.avatar);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, payrollProviderUiSpecification.title);
        protoWriter.writeBytes(payrollProviderUiSpecification.unknownFields());
    }
}

package com.squareup.protos.payrollconnector.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.DeepLinkSpec;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PayrollProvider$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        DeepLinkSpec.Companion companion = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PayrollProvider(companion, (PayrollProviderUiSpecification) obj, m, (DirectDepositInfo) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new PayrollProvider$Type$Employer((Employer) Employer.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                companion = new PayrollProvider$Type$Platform((Platform) Platform.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(PayrollProviderUiSpecification.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                try {
                    TaskType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(DirectDepositInfo.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PayrollProvider payrollProvider = (PayrollProvider) obj;
        reverseProtoWriter.getClass();
        payrollProvider.getClass();
        reverseProtoWriter.writeBytes(payrollProvider.unknownFields());
        DeepLinkSpec.Companion companion = payrollProvider.f1404type;
        if (companion instanceof PayrollProvider$Type$Employer) {
            Employer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((PayrollProvider$Type$Employer) companion).value);
        } else if (companion instanceof PayrollProvider$Type$Platform) {
            Platform.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PayrollProvider$Type$Platform) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DirectDepositInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 5, payrollProvider.direct_deposit_info);
        TaskType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, payrollProvider.supported_tasks);
        PayrollProviderUiSpecification.ADAPTER.encodeWithTag(reverseProtoWriter, 3, payrollProvider.ui_specification);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PayrollProvider payrollProvider = (PayrollProvider) obj;
        payrollProvider.getClass();
        int size$okio = payrollProvider.unknownFields().getSize$okio();
        DeepLinkSpec.Companion companion = payrollProvider.f1404type;
        if (companion instanceof PayrollProvider$Type$Employer) {
            encodedSizeWithTag = Employer.ADAPTER.encodedSizeWithTag(1, ((PayrollProvider$Type$Employer) companion).value);
        } else {
            if (!(companion instanceof PayrollProvider$Type$Platform)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return DirectDepositInfo.ADAPTER.encodedSizeWithTag(5, payrollProvider.direct_deposit_info) + TaskType.ADAPTER.asRepeated().encodedSizeWithTag(4, payrollProvider.supported_tasks) + PayrollProviderUiSpecification.ADAPTER.encodedSizeWithTag(3, payrollProvider.ui_specification) + size$okio;
            }
            encodedSizeWithTag = Platform.ADAPTER.encodedSizeWithTag(2, ((PayrollProvider$Type$Platform) companion).value);
        }
        size$okio += encodedSizeWithTag;
        return DirectDepositInfo.ADAPTER.encodedSizeWithTag(5, payrollProvider.direct_deposit_info) + TaskType.ADAPTER.asRepeated().encodedSizeWithTag(4, payrollProvider.supported_tasks) + PayrollProviderUiSpecification.ADAPTER.encodedSizeWithTag(3, payrollProvider.ui_specification) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PayrollProvider payrollProvider = (PayrollProvider) obj;
        payrollProvider.getClass();
        PayrollProviderUiSpecification payrollProviderUiSpecification = payrollProvider.ui_specification;
        PayrollProviderUiSpecification payrollProviderUiSpecification2 = payrollProviderUiSpecification != null ? (PayrollProviderUiSpecification) PayrollProviderUiSpecification.ADAPTER.redact(payrollProviderUiSpecification) : null;
        DirectDepositInfo directDepositInfo = payrollProvider.direct_deposit_info;
        DirectDepositInfo directDepositInfo2 = directDepositInfo != null ? (DirectDepositInfo) DirectDepositInfo.ADAPTER.redact(directDepositInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        DeepLinkSpec.Companion companion = payrollProvider.f1404type;
        List list = payrollProvider.supported_tasks;
        list.getClass();
        byteString.getClass();
        return new PayrollProvider(companion, payrollProviderUiSpecification2, list, directDepositInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PayrollProvider payrollProvider = (PayrollProvider) obj;
        payrollProvider.getClass();
        PayrollProviderUiSpecification.ADAPTER.encodeWithTag(protoWriter, 3, payrollProvider.ui_specification);
        TaskType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, payrollProvider.supported_tasks);
        DirectDepositInfo.ADAPTER.encodeWithTag(protoWriter, 5, payrollProvider.direct_deposit_info);
        DeepLinkSpec.Companion companion = payrollProvider.f1404type;
        if (companion instanceof PayrollProvider$Type$Employer) {
            Employer.ADAPTER.encodeWithTag(protoWriter, 1, ((PayrollProvider$Type$Employer) companion).value);
        } else if (companion instanceof PayrollProvider$Type$Platform) {
            Platform.ADAPTER.encodeWithTag(protoWriter, 2, ((PayrollProvider$Type$Platform) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(payrollProvider.unknownFields());
    }
}

package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiSpecification;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Employer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Employer((String) obj, (PayrollProviderUiSpecification) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(PayrollProviderUiSpecification.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Employer employer = (Employer) obj;
        reverseProtoWriter.getClass();
        employer.getClass();
        reverseProtoWriter.writeBytes(employer.unknownFields());
        PayrollProviderUiSpecification.ADAPTER.encodeWithTag(reverseProtoWriter, 2, employer.ui_specification);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, employer.employer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Employer employer = (Employer) obj;
        employer.getClass();
        return PayrollProviderUiSpecification.ADAPTER.encodedSizeWithTag(2, employer.ui_specification) + ProtoAdapter.STRING.encodedSizeWithTag(1, employer.employer_token) + employer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Employer employer = (Employer) obj;
        employer.getClass();
        PayrollProviderUiSpecification payrollProviderUiSpecification = employer.ui_specification;
        PayrollProviderUiSpecification payrollProviderUiSpecification2 = payrollProviderUiSpecification != null ? (PayrollProviderUiSpecification) PayrollProviderUiSpecification.ADAPTER.redact(payrollProviderUiSpecification) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = employer.employer_token;
        byteString.getClass();
        return new Employer(str, payrollProviderUiSpecification2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Employer employer = (Employer) obj;
        employer.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, employer.employer_token);
        PayrollProviderUiSpecification.ADAPTER.encodeWithTag(protoWriter, 2, employer.ui_specification);
        protoWriter.writeBytes(employer.unknownFields());
    }
}

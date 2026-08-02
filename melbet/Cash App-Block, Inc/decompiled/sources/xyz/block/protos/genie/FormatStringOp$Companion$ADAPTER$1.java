package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.FormatStringOp;

/* loaded from: classes10.dex */
public final class FormatStringOp$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(FormatStringOp.TokenReplacement.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new FormatStringOp(m, endMessageAndGetUnknownFields, expression);
        }
        TransactorKt.missingRequiredFields(obj, "template");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FormatStringOp formatStringOp = (FormatStringOp) obj;
        reverseProtoWriter.getClass();
        formatStringOp.getClass();
        reverseProtoWriter.writeBytes(formatStringOp.unknownFields());
        FormatStringOp.TokenReplacement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, formatStringOp.token_replacements);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, formatStringOp.template);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FormatStringOp formatStringOp = (FormatStringOp) obj;
        formatStringOp.getClass();
        return FormatStringOp.TokenReplacement.ADAPTER.asRepeated().encodedSizeWithTag(2, formatStringOp.token_replacements) + Expression.ADAPTER.encodedSizeWithTag(1, formatStringOp.template) + formatStringOp.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FormatStringOp formatStringOp = (FormatStringOp) obj;
        formatStringOp.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(formatStringOp.template);
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(formatStringOp.token_replacements, FormatStringOp.TokenReplacement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new FormatStringOp(m1169redactElements, byteString, expression);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FormatStringOp formatStringOp = (FormatStringOp) obj;
        formatStringOp.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, formatStringOp.template);
        FormatStringOp.TokenReplacement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, formatStringOp.token_replacements);
        protoWriter.writeBytes(formatStringOp.unknownFields());
    }
}

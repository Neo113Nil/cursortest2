package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Dismiss$RetreatToView$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new Navigate.Dismiss.RetreatToView(expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "view_slug");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate.Dismiss.RetreatToView retreatToView = (Navigate.Dismiss.RetreatToView) obj;
        reverseProtoWriter.getClass();
        retreatToView.getClass();
        reverseProtoWriter.writeBytes(retreatToView.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retreatToView.view_slug);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate.Dismiss.RetreatToView retreatToView = (Navigate.Dismiss.RetreatToView) obj;
        retreatToView.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(1, retreatToView.view_slug) + retreatToView.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Navigate.Dismiss.RetreatToView retreatToView = (Navigate.Dismiss.RetreatToView) obj;
        retreatToView.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(retreatToView.view_slug);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new Navigate.Dismiss.RetreatToView(expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate.Dismiss.RetreatToView retreatToView = (Navigate.Dismiss.RetreatToView) obj;
        retreatToView.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, retreatToView.view_slug);
        protoWriter.writeBytes(retreatToView.unknownFields());
    }
}

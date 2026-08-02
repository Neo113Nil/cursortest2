package squareup.cash.portfolios.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PortfolioState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return new PortfolioState(bool.booleanValue(), (Boolean) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "has_portfolio");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PortfolioState portfolioState = (PortfolioState) obj;
        reverseProtoWriter.getClass();
        portfolioState.getClass();
        reverseProtoWriter.writeBytes(portfolioState.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, portfolioState.has_holdings);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, Boolean.valueOf(portfolioState.has_portfolio));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PortfolioState portfolioState = (PortfolioState) obj;
        portfolioState.getClass();
        int size$okio = portfolioState.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(2, portfolioState.has_holdings) + SizeMode$EnumUnboxingLocalUtility.m(portfolioState.has_portfolio, protoAdapter, 1, size$okio);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PortfolioState portfolioState = (PortfolioState) obj;
        portfolioState.getClass();
        ByteString byteString = ByteString.EMPTY;
        boolean z = portfolioState.has_portfolio;
        Boolean bool = portfolioState.has_holdings;
        byteString.getClass();
        return new PortfolioState(z, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PortfolioState portfolioState = (PortfolioState) obj;
        portfolioState.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, Boolean.valueOf(portfolioState.has_portfolio));
        protoAdapter.encodeWithTag(protoWriter, 2, portfolioState.has_holdings);
        protoWriter.writeBytes(portfolioState.unknownFields());
    }
}

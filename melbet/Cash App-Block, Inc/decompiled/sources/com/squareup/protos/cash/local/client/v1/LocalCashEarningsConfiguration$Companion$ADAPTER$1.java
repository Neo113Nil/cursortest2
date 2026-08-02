package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashEarningsConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashEarningsConfiguration((String) obj, m, (LocalMoney) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(LocalCashEarningsConfiguration.Tier.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashEarningsConfiguration localCashEarningsConfiguration = (LocalCashEarningsConfiguration) obj;
        reverseProtoWriter.getClass();
        localCashEarningsConfiguration.getClass();
        reverseProtoWriter.writeBytes(localCashEarningsConfiguration.unknownFields());
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localCashEarningsConfiguration.calculated_local_cash_earnings);
        LocalCashEarningsConfiguration.Tier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, localCashEarningsConfiguration.tiers);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localCashEarningsConfiguration.fine_print_markdown);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashEarningsConfiguration localCashEarningsConfiguration = (LocalCashEarningsConfiguration) obj;
        localCashEarningsConfiguration.getClass();
        return LocalMoney.ADAPTER.encodedSizeWithTag(3, localCashEarningsConfiguration.calculated_local_cash_earnings) + LocalCashEarningsConfiguration.Tier.ADAPTER.asRepeated().encodedSizeWithTag(2, localCashEarningsConfiguration.tiers) + ProtoAdapter.STRING.encodedSizeWithTag(1, localCashEarningsConfiguration.fine_print_markdown) + localCashEarningsConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashEarningsConfiguration localCashEarningsConfiguration = (LocalCashEarningsConfiguration) obj;
        localCashEarningsConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localCashEarningsConfiguration.tiers, LocalCashEarningsConfiguration.Tier.ADAPTER);
        LocalMoney localMoney = localCashEarningsConfiguration.calculated_local_cash_earnings;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localCashEarningsConfiguration.fine_print_markdown;
        byteString.getClass();
        return new LocalCashEarningsConfiguration(str, m1169redactElements, localMoney2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashEarningsConfiguration localCashEarningsConfiguration = (LocalCashEarningsConfiguration) obj;
        localCashEarningsConfiguration.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localCashEarningsConfiguration.fine_print_markdown);
        LocalCashEarningsConfiguration.Tier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, localCashEarningsConfiguration.tiers);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, localCashEarningsConfiguration.calculated_local_cash_earnings);
        protoWriter.writeBytes(localCashEarningsConfiguration.unknownFields());
    }
}

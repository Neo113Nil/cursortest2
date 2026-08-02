package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEarnings$Earning$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzjk investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzjk zzjkVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestmentEarnings.Earning((String) obj, (String) obj2, (Money) obj3, zzjkVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                if (nextTag == 4) {
                    investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate = new InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    protoReader.readUnknownField(nextTag);
                } else {
                    investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate = new InvestmentEarnings$Earning$UpcomingEps$ActualEps((Money) Money.ADAPTER.decode(protoReader));
                }
                zzjkVar = investmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate;
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEarnings.Earning earning = (InvestmentEarnings.Earning) obj;
        reverseProtoWriter.getClass();
        earning.getClass();
        reverseProtoWriter.writeBytes(earning.unknownFields());
        zzjk zzjkVar = earning.upcoming_eps;
        if (zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) zzjkVar).value);
        } else if (zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$ActualEps) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((InvestmentEarnings$Earning$UpcomingEps$ActualEps) zzjkVar).value);
        } else if (zzjkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, earning.expected_eps);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earning.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earning.quarter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEarnings.Earning earning = (InvestmentEarnings.Earning) obj;
        earning.getClass();
        int size$okio = earning.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, earning.year) + protoAdapter.encodedSizeWithTag(1, earning.quarter) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, earning.expected_eps) + encodedSizeWithTag;
        zzjk zzjkVar = earning.upcoming_eps;
        if (zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) {
            return protoAdapter.encodedSizeWithTag(4, ((InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) zzjkVar).value) + encodedSizeWithTag2;
        }
        if (zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$ActualEps) {
            return protoAdapter2.encodedSizeWithTag(5, ((InvestmentEarnings$Earning$UpcomingEps$ActualEps) zzjkVar).value) + encodedSizeWithTag2;
        }
        if (zzjkVar == null) {
            return encodedSizeWithTag2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEarnings.Earning earning = (InvestmentEarnings.Earning) obj;
        earning.getClass();
        Money money = earning.expected_eps;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = earning.quarter;
        String str2 = earning.year;
        zzjk zzjkVar = earning.upcoming_eps;
        byteString.getClass();
        return new InvestmentEarnings.Earning(str, str2, money2, zzjkVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEarnings.Earning earning = (InvestmentEarnings.Earning) obj;
        earning.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, earning.quarter);
        protoAdapter.encodeWithTag(protoWriter, 2, earning.year);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, earning.expected_eps);
        zzjk zzjkVar = earning.upcoming_eps;
        if (zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) zzjkVar).value);
        } else if (zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$ActualEps) {
            protoAdapter2.encodeWithTag(protoWriter, 5, ((InvestmentEarnings$Earning$UpcomingEps$ActualEps) zzjkVar).value);
        } else if (zzjkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(earning.unknownFields());
    }
}

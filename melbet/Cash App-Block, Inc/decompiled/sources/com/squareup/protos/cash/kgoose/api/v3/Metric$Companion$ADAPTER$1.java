package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.Metric;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Metric$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Metric$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Metric.Value value = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Metric(value, (Metric.TrendDirection) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                value = new Metric.Value.Money((Money) Money.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                value = new Metric.Value.Percentage(((Number) ProtoAdapter.DOUBLE.decode(protoReader)).doubleValue());
            } else if (nextTag == 3) {
                value = new Metric.Value.Number(((Number) ProtoAdapter.DOUBLE.decode(protoReader)).doubleValue());
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj = Metric.TrendDirection.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Metric metric = (Metric) obj;
        reverseProtoWriter.getClass();
        metric.getClass();
        reverseProtoWriter.writeBytes(metric.unknownFields());
        Metric.Value value = metric.value;
        if (value instanceof Metric.Value.Money) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Metric.Value.Money) value).getValue());
        } else if (value instanceof Metric.Value.Percentage) {
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, Double.valueOf(((Metric.Value.Percentage) value).getValue()));
        } else if (value instanceof Metric.Value.Number) {
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 3, Double.valueOf(((Metric.Value.Number) value).getValue()));
        } else if (value != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Metric.TrendDirection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, metric.trend_direction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Metric metric = (Metric) obj;
        metric.getClass();
        int size$okio = metric.unknownFields().getSize$okio();
        Metric.Value value = metric.value;
        if (value instanceof Metric.Value.Money) {
            encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, ((Metric.Value.Money) value).getValue());
        } else if (value instanceof Metric.Value.Percentage) {
            encodedSizeWithTag = ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Metric.Value.Percentage) value).getValue()));
        } else {
            if (!(value instanceof Metric.Value.Number)) {
                if (value != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return Metric.TrendDirection.ADAPTER.encodedSizeWithTag(4, metric.trend_direction) + size$okio;
            }
            encodedSizeWithTag = ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(((Metric.Value.Number) value).getValue()));
        }
        size$okio += encodedSizeWithTag;
        return Metric.TrendDirection.ADAPTER.encodedSizeWithTag(4, metric.trend_direction) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Metric metric = (Metric) obj;
        metric.getClass();
        ByteString byteString = ByteString.EMPTY;
        Metric.Value value = metric.value;
        Metric.TrendDirection trendDirection = metric.trend_direction;
        byteString.getClass();
        return new Metric(value, trendDirection, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Metric metric = (Metric) obj;
        metric.getClass();
        Metric.TrendDirection.ADAPTER.encodeWithTag(protoWriter, 4, metric.trend_direction);
        Metric.Value value = metric.value;
        if (value instanceof Metric.Value.Money) {
            Money.ADAPTER.encodeWithTag(protoWriter, 1, ((Metric.Value.Money) value).getValue());
        } else if (value instanceof Metric.Value.Percentage) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, Double.valueOf(((Metric.Value.Percentage) value).getValue()));
        } else if (value instanceof Metric.Value.Number) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, Double.valueOf(((Metric.Value.Number) value).getValue()));
        } else if (value != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(metric.unknownFields());
    }
}

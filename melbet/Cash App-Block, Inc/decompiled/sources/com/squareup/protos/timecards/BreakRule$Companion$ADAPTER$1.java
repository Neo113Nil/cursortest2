package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.protos.timecards.BreakRule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BreakRule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        RoutesKt breakRule$Rule$EarnEveryXSeconds;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        RoutesKt routesKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BreakRule((String) obj, (String) obj2, (String) obj3, routesKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                if (nextTag == 5) {
                    breakRule$Rule$EarnEveryXSeconds = new BreakRule$Rule$EarnEveryXSeconds((BreakRule.EarnEveryXSeconds) BreakRule.EarnEveryXSeconds.ADAPTER.decode(protoReader));
                } else if (nextTag != 6) {
                    protoReader.readUnknownField(nextTag);
                } else {
                    breakRule$Rule$EarnEveryXSeconds = new BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds((BreakRule.EarnOnceIfShiftAtLeastXSeconds) BreakRule.EarnOnceIfShiftAtLeastXSeconds.ADAPTER.decode(protoReader));
                }
                routesKt = breakRule$Rule$EarnEveryXSeconds;
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BreakRule breakRule = (BreakRule) obj;
        reverseProtoWriter.getClass();
        breakRule.getClass();
        reverseProtoWriter.writeBytes(breakRule.unknownFields());
        RoutesKt routesKt = breakRule.rule;
        if (routesKt instanceof BreakRule$Rule$EarnEveryXSeconds) {
            BreakRule.EarnEveryXSeconds.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BreakRule$Rule$EarnEveryXSeconds) routesKt).value);
        } else if (routesKt instanceof BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) {
            BreakRule.EarnOnceIfShiftAtLeastXSeconds.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) routesKt).value);
        } else if (routesKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, breakRule.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, breakRule.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, breakRule.effective_start_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BreakRule breakRule = (BreakRule) obj;
        breakRule.getClass();
        int size$okio = breakRule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, breakRule.updated_at) + protoAdapter.encodedSizeWithTag(3, breakRule.created_at) + protoAdapter.encodedSizeWithTag(2, breakRule.effective_start_at) + size$okio;
        RoutesKt routesKt = breakRule.rule;
        if (routesKt instanceof BreakRule$Rule$EarnEveryXSeconds) {
            return BreakRule.EarnEveryXSeconds.ADAPTER.encodedSizeWithTag(5, ((BreakRule$Rule$EarnEveryXSeconds) routesKt).value) + encodedSizeWithTag;
        }
        if (routesKt instanceof BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) {
            return BreakRule.EarnOnceIfShiftAtLeastXSeconds.ADAPTER.encodedSizeWithTag(6, ((BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) routesKt).value) + encodedSizeWithTag;
        }
        if (routesKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BreakRule breakRule = (BreakRule) obj;
        breakRule.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = breakRule.effective_start_at;
        String str2 = breakRule.created_at;
        String str3 = breakRule.updated_at;
        RoutesKt routesKt = breakRule.rule;
        byteString.getClass();
        return new BreakRule(str, str2, str3, routesKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BreakRule breakRule = (BreakRule) obj;
        breakRule.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, breakRule.effective_start_at);
        protoAdapter.encodeWithTag(protoWriter, 3, breakRule.created_at);
        protoAdapter.encodeWithTag(protoWriter, 4, breakRule.updated_at);
        RoutesKt routesKt = breakRule.rule;
        if (routesKt instanceof BreakRule$Rule$EarnEveryXSeconds) {
            BreakRule.EarnEveryXSeconds.ADAPTER.encodeWithTag(protoWriter, 5, ((BreakRule$Rule$EarnEveryXSeconds) routesKt).value);
        } else if (routesKt instanceof BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) {
            BreakRule.EarnOnceIfShiftAtLeastXSeconds.ADAPTER.encodeWithTag(protoWriter, 6, ((BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) routesKt).value);
        } else if (routesKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(breakRule.unknownFields());
    }
}

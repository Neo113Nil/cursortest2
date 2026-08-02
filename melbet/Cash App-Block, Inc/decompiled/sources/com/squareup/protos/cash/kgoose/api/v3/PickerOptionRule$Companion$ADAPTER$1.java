package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.PickerOptionRule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PickerOptionRule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        PickerOptionRule.Target target = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PickerOptionRule((String) obj, target, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                target = new PickerOptionRule.Target.OptionValueEqualsSibling((OptionValueEqualsSibling) OptionValueEqualsSibling.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                target = new PickerOptionRule.Target.BalanceBelowSiblingAmount((BalanceBelowSiblingAmount) BalanceBelowSiblingAmount.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PickerOptionRule pickerOptionRule = (PickerOptionRule) obj;
        reverseProtoWriter.getClass();
        pickerOptionRule.getClass();
        reverseProtoWriter.writeBytes(pickerOptionRule.unknownFields());
        PickerOptionRule.Target target = pickerOptionRule.target;
        if (target instanceof PickerOptionRule.Target.OptionValueEqualsSibling) {
            OptionValueEqualsSibling.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PickerOptionRule.Target.OptionValueEqualsSibling) target).getValue());
        } else if (target instanceof PickerOptionRule.Target.BalanceBelowSiblingAmount) {
            BalanceBelowSiblingAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PickerOptionRule.Target.BalanceBelowSiblingAmount) target).getValue());
        } else if (target != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, pickerOptionRule.sibling_placeholder_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PickerOptionRule pickerOptionRule = (PickerOptionRule) obj;
        pickerOptionRule.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pickerOptionRule.sibling_placeholder_key) + pickerOptionRule.unknownFields().getSize$okio();
        PickerOptionRule.Target target = pickerOptionRule.target;
        if (target instanceof PickerOptionRule.Target.OptionValueEqualsSibling) {
            return OptionValueEqualsSibling.ADAPTER.encodedSizeWithTag(2, ((PickerOptionRule.Target.OptionValueEqualsSibling) target).getValue()) + encodedSizeWithTag;
        }
        if (target instanceof PickerOptionRule.Target.BalanceBelowSiblingAmount) {
            return BalanceBelowSiblingAmount.ADAPTER.encodedSizeWithTag(3, ((PickerOptionRule.Target.BalanceBelowSiblingAmount) target).getValue()) + encodedSizeWithTag;
        }
        if (target == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PickerOptionRule pickerOptionRule = (PickerOptionRule) obj;
        pickerOptionRule.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = pickerOptionRule.sibling_placeholder_key;
        PickerOptionRule.Target target = pickerOptionRule.target;
        byteString.getClass();
        return new PickerOptionRule(str, target, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PickerOptionRule pickerOptionRule = (PickerOptionRule) obj;
        pickerOptionRule.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pickerOptionRule.sibling_placeholder_key);
        PickerOptionRule.Target target = pickerOptionRule.target;
        if (target instanceof PickerOptionRule.Target.OptionValueEqualsSibling) {
            OptionValueEqualsSibling.ADAPTER.encodeWithTag(protoWriter, 2, ((PickerOptionRule.Target.OptionValueEqualsSibling) target).getValue());
        } else if (target instanceof PickerOptionRule.Target.BalanceBelowSiblingAmount) {
            BalanceBelowSiblingAmount.ADAPTER.encodeWithTag(protoWriter, 3, ((PickerOptionRule.Target.BalanceBelowSiblingAmount) target).getValue());
        } else if (target != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(pickerOptionRule.unknownFields());
    }
}

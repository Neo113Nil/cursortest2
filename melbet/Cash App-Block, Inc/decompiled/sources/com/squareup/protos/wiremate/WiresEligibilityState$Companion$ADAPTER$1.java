package com.squareup.protos.wiremate;

import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.protos.wiremate.WiresEligibilityState;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class WiresEligibilityState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkp zzkpVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WiresEligibilityState(zzkpVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkpVar = new WiresEligibilityState$State$Ineligible((WiresEligibilityState.Ineligible) WiresEligibilityState.Ineligible.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzkpVar = new WiresEligibilityState$State$EligibleValidAccount((WiresEligibilityState.EligibleValidAccount) WiresEligibilityState.EligibleValidAccount.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkpVar = new WiresEligibilityState$State$EligibleInvalidAccount((WiresEligibilityState.EligibleInvalidAccount) WiresEligibilityState.EligibleInvalidAccount.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresEligibilityState wiresEligibilityState = (WiresEligibilityState) obj;
        reverseProtoWriter.getClass();
        wiresEligibilityState.getClass();
        reverseProtoWriter.writeBytes(wiresEligibilityState.unknownFields());
        zzkp zzkpVar = wiresEligibilityState.state;
        if (zzkpVar instanceof WiresEligibilityState$State$Ineligible) {
            WiresEligibilityState.Ineligible.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((WiresEligibilityState$State$Ineligible) zzkpVar).value);
            return;
        }
        if (zzkpVar instanceof WiresEligibilityState$State$EligibleValidAccount) {
            WiresEligibilityState.EligibleValidAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((WiresEligibilityState$State$EligibleValidAccount) zzkpVar).value);
        } else if (zzkpVar instanceof WiresEligibilityState$State$EligibleInvalidAccount) {
            WiresEligibilityState.EligibleInvalidAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((WiresEligibilityState$State$EligibleInvalidAccount) zzkpVar).value);
        } else {
            if (zzkpVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        WiresEligibilityState wiresEligibilityState = (WiresEligibilityState) obj;
        wiresEligibilityState.getClass();
        int size$okio = wiresEligibilityState.unknownFields().getSize$okio();
        zzkp zzkpVar = wiresEligibilityState.state;
        if (zzkpVar instanceof WiresEligibilityState$State$Ineligible) {
            encodedSizeWithTag = WiresEligibilityState.Ineligible.ADAPTER.encodedSizeWithTag(1, ((WiresEligibilityState$State$Ineligible) zzkpVar).value);
        } else if (zzkpVar instanceof WiresEligibilityState$State$EligibleValidAccount) {
            encodedSizeWithTag = WiresEligibilityState.EligibleValidAccount.ADAPTER.encodedSizeWithTag(2, ((WiresEligibilityState$State$EligibleValidAccount) zzkpVar).value);
        } else {
            if (!(zzkpVar instanceof WiresEligibilityState$State$EligibleInvalidAccount)) {
                if (zzkpVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = WiresEligibilityState.EligibleInvalidAccount.ADAPTER.encodedSizeWithTag(3, ((WiresEligibilityState$State$EligibleInvalidAccount) zzkpVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WiresEligibilityState wiresEligibilityState = (WiresEligibilityState) obj;
        wiresEligibilityState.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzkp zzkpVar = wiresEligibilityState.state;
        byteString.getClass();
        return new WiresEligibilityState(zzkpVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresEligibilityState wiresEligibilityState = (WiresEligibilityState) obj;
        wiresEligibilityState.getClass();
        zzkp zzkpVar = wiresEligibilityState.state;
        if (zzkpVar instanceof WiresEligibilityState$State$Ineligible) {
            WiresEligibilityState.Ineligible.ADAPTER.encodeWithTag(protoWriter, 1, ((WiresEligibilityState$State$Ineligible) zzkpVar).value);
        } else if (zzkpVar instanceof WiresEligibilityState$State$EligibleValidAccount) {
            WiresEligibilityState.EligibleValidAccount.ADAPTER.encodeWithTag(protoWriter, 2, ((WiresEligibilityState$State$EligibleValidAccount) zzkpVar).value);
        } else if (zzkpVar instanceof WiresEligibilityState$State$EligibleInvalidAccount) {
            WiresEligibilityState.EligibleInvalidAccount.ADAPTER.encodeWithTag(protoWriter, 3, ((WiresEligibilityState$State$EligibleInvalidAccount) zzkpVar).value);
        } else if (zzkpVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(wiresEligibilityState.unknownFields());
    }
}

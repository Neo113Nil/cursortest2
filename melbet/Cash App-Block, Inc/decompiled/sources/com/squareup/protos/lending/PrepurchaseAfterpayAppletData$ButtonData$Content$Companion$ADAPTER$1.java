package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjd;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$Content$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjd zzjdVar = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.ButtonData.Content(zzjdVar, (LocalizedString) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjdVar = new PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle((Toggle) Toggle.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzjdVar = new PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
            } else if (nextTag == 3) {
                zzjdVar = new PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute((OpaqueRoute) OpaqueRoute.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.ButtonData.Content content = (PrepurchaseAfterpayAppletData.ButtonData.Content) obj;
        reverseProtoWriter.getClass();
        content.getClass();
        reverseProtoWriter.writeBytes(content.unknownFields());
        zzjd zzjdVar = content.action;
        if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) {
            Toggle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) zzjdVar).value);
        } else if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, Boolean.valueOf(((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) zzjdVar).value));
        } else if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) {
            OpaqueRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) zzjdVar).value);
        } else if (zzjdVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, content.analytics_button_type);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, content.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PrepurchaseAfterpayAppletData.ButtonData.Content content = (PrepurchaseAfterpayAppletData.ButtonData.Content) obj;
        content.getClass();
        int size$okio = content.unknownFields().getSize$okio();
        zzjd zzjdVar = content.action;
        if (!(zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle)) {
            if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) {
                size$okio = SizeMode$EnumUnboxingLocalUtility.m(((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) zzjdVar).value, ProtoAdapter.BOOL, 2, size$okio);
            } else if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) {
                encodedSizeWithTag = OpaqueRoute.ADAPTER.encodedSizeWithTag(3, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) zzjdVar).value);
            } else if (zzjdVar != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            return ProtoAdapter.STRING.encodedSizeWithTag(5, content.analytics_button_type) + LocalizedString.ADAPTER.encodedSizeWithTag(4, content.text) + size$okio;
        }
        encodedSizeWithTag = Toggle.ADAPTER.encodedSizeWithTag(1, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) zzjdVar).value);
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(5, content.analytics_button_type) + LocalizedString.ADAPTER.encodedSizeWithTag(4, content.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.ButtonData.Content content = (PrepurchaseAfterpayAppletData.ButtonData.Content) obj;
        content.getClass();
        LocalizedString localizedString = content.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        zzjd zzjdVar = content.action;
        String str = content.analytics_button_type;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.ButtonData.Content(zzjdVar, localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.ButtonData.Content content = (PrepurchaseAfterpayAppletData.ButtonData.Content) obj;
        content.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, content.text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, content.analytics_button_type);
        zzjd zzjdVar = content.action;
        if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) {
            Toggle.ADAPTER.encodeWithTag(protoWriter, 1, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) zzjdVar).value);
        } else if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, Boolean.valueOf(((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) zzjdVar).value));
        } else if (zzjdVar instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) {
            OpaqueRoute.ADAPTER.encodeWithTag(protoWriter, 3, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) zzjdVar).value);
        } else if (zzjdVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(content.unknownFields());
    }
}

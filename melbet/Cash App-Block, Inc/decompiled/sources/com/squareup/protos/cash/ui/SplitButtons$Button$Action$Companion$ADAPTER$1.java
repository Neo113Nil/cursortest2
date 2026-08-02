package com.squareup.protos.cash.ui;

import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SplitButtons$Button$Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SplitButtons.Button.Action(splitButtons$Button$Action$Action$ClientRoute, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                splitButtons$Button$Action$Action$ClientRoute = new SplitButtons$Button$Action$Action$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SplitButtons.Button.Action action = (SplitButtons.Button.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = action.action;
        if (splitButtons$Button$Action$Action$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, splitButtons$Button$Action$Action$ClientRoute.value);
        } else {
            if (splitButtons$Button$Action$Action$ClientRoute == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SplitButtons.Button.Action action = (SplitButtons.Button.Action) obj;
        action.getClass();
        int size$okio = action.unknownFields().getSize$okio();
        SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = action.action;
        if (splitButtons$Button$Action$Action$ClientRoute != null) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, splitButtons$Button$Action$Action$ClientRoute.value) + size$okio;
        }
        if (splitButtons$Button$Action$Action$ClientRoute == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SplitButtons.Button.Action action = (SplitButtons.Button.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = action.action;
        byteString.getClass();
        return new SplitButtons.Button.Action(splitButtons$Button$Action$Action$ClientRoute, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SplitButtons.Button.Action action = (SplitButtons.Button.Action) obj;
        action.getClass();
        SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = action.action;
        if (splitButtons$Button$Action$Action$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, splitButtons$Button$Action$Action$ClientRoute.value);
        } else if (splitButtons$Button$Action$Action$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(action.unknownFields());
    }
}

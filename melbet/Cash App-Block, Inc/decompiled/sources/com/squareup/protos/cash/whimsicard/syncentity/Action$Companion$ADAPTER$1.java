package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Action$Type$ClientRoute action$Type$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action((LocalizedString) obj, action$Type$ClientRoute, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                action$Type$ClientRoute = new Action$Type$ClientRoute((Action.ClientRouteAction) Action.ClientRouteAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action action = (Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        Action$Type$ClientRoute action$Type$ClientRoute = action.f1343type;
        if (action$Type$ClientRoute != null) {
            Action.ClientRouteAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, action$Type$ClientRoute.value);
        } else if (action$Type$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, action.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, action.label) + action.unknownFields().getSize$okio();
        Action$Type$ClientRoute action$Type$ClientRoute = action.f1343type;
        if (action$Type$ClientRoute != null) {
            return Action.ClientRouteAction.ADAPTER.encodedSizeWithTag(2, action$Type$ClientRoute.value) + encodedSizeWithTag;
        }
        if (action$Type$ClientRoute == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        LocalizedString localizedString = action.label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Action$Type$ClientRoute action$Type$ClientRoute = action.f1343type;
        byteString.getClass();
        return new Action(localizedString2, action$Type$ClientRoute, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action action = (Action) obj;
        action.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, action.label);
        Action$Type$ClientRoute action$Type$ClientRoute = action.f1343type;
        if (action$Type$ClientRoute != null) {
            Action.ClientRouteAction.ADAPTER.encodeWithTag(protoWriter, 2, action$Type$ClientRoute.value);
        } else if (action$Type$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(action.unknownFields());
    }
}

package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Animation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjm zzjmVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Animation(zzjmVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjmVar = new Animation$Message$Fill((AnimationFill) AnimationFill.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzjmVar = new Animation$Message$Inset((AnimationInset) AnimationInset.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjmVar = new Animation$Message$Fixed((AnimationFixed) AnimationFixed.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Animation animation = (Animation) obj;
        reverseProtoWriter.getClass();
        animation.getClass();
        reverseProtoWriter.writeBytes(animation.unknownFields());
        zzjm zzjmVar = animation.message;
        if (zzjmVar instanceof Animation$Message$Fill) {
            AnimationFill.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Animation$Message$Fill) zzjmVar).getValue());
            return;
        }
        if (zzjmVar instanceof Animation$Message$Inset) {
            AnimationInset.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Animation$Message$Inset) zzjmVar).getValue());
        } else if (zzjmVar instanceof Animation$Message$Fixed) {
            AnimationFixed.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Animation$Message$Fixed) zzjmVar).getValue());
        } else {
            if (zzjmVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Animation animation = (Animation) obj;
        animation.getClass();
        int size$okio = animation.unknownFields().getSize$okio();
        zzjm zzjmVar = animation.message;
        if (zzjmVar instanceof Animation$Message$Fill) {
            encodedSizeWithTag = AnimationFill.ADAPTER.encodedSizeWithTag(1, ((Animation$Message$Fill) zzjmVar).getValue());
        } else if (zzjmVar instanceof Animation$Message$Inset) {
            encodedSizeWithTag = AnimationInset.ADAPTER.encodedSizeWithTag(2, ((Animation$Message$Inset) zzjmVar).getValue());
        } else {
            if (!(zzjmVar instanceof Animation$Message$Fixed)) {
                if (zzjmVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AnimationFixed.ADAPTER.encodedSizeWithTag(3, ((Animation$Message$Fixed) zzjmVar).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Animation animation = (Animation) obj;
        animation.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjm zzjmVar = animation.message;
        byteString.getClass();
        return new Animation(zzjmVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Animation animation = (Animation) obj;
        animation.getClass();
        zzjm zzjmVar = animation.message;
        if (zzjmVar instanceof Animation$Message$Fill) {
            AnimationFill.ADAPTER.encodeWithTag(protoWriter, 1, ((Animation$Message$Fill) zzjmVar).getValue());
        } else if (zzjmVar instanceof Animation$Message$Inset) {
            AnimationInset.ADAPTER.encodeWithTag(protoWriter, 2, ((Animation$Message$Inset) zzjmVar).getValue());
        } else if (zzjmVar instanceof Animation$Message$Fixed) {
            AnimationFixed.ADAPTER.encodeWithTag(protoWriter, 3, ((Animation$Message$Fixed) zzjmVar).getValue());
        } else if (zzjmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(animation.unknownFields());
    }
}

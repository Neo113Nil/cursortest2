package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Image$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjs zzjsVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Image(zzjsVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjsVar = new Image$Message$ImageFill((ImageFill) ImageFill.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzjsVar = new Image$Message$ImageInset((ImageInset) ImageInset.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjsVar = new Image$Message$ImageFixed((ImageFixed) ImageFixed.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Image image = (Image) obj;
        reverseProtoWriter.getClass();
        image.getClass();
        reverseProtoWriter.writeBytes(image.unknownFields());
        zzjs zzjsVar = image.message;
        if (zzjsVar instanceof Image$Message$ImageFill) {
            ImageFill.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Image$Message$ImageFill) zzjsVar).getValue());
            return;
        }
        if (zzjsVar instanceof Image$Message$ImageInset) {
            ImageInset.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Image$Message$ImageInset) zzjsVar).getValue());
        } else if (zzjsVar instanceof Image$Message$ImageFixed) {
            ImageFixed.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Image$Message$ImageFixed) zzjsVar).getValue());
        } else {
            if (zzjsVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Image image = (Image) obj;
        image.getClass();
        int size$okio = image.unknownFields().getSize$okio();
        zzjs zzjsVar = image.message;
        if (zzjsVar instanceof Image$Message$ImageFill) {
            encodedSizeWithTag = ImageFill.ADAPTER.encodedSizeWithTag(1, ((Image$Message$ImageFill) zzjsVar).getValue());
        } else if (zzjsVar instanceof Image$Message$ImageInset) {
            encodedSizeWithTag = ImageInset.ADAPTER.encodedSizeWithTag(2, ((Image$Message$ImageInset) zzjsVar).getValue());
        } else {
            if (!(zzjsVar instanceof Image$Message$ImageFixed)) {
                if (zzjsVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ImageFixed.ADAPTER.encodedSizeWithTag(3, ((Image$Message$ImageFixed) zzjsVar).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Image image = (Image) obj;
        image.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjs zzjsVar = image.message;
        byteString.getClass();
        return new Image(zzjsVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Image image = (Image) obj;
        image.getClass();
        zzjs zzjsVar = image.message;
        if (zzjsVar instanceof Image$Message$ImageFill) {
            ImageFill.ADAPTER.encodeWithTag(protoWriter, 1, ((Image$Message$ImageFill) zzjsVar).getValue());
        } else if (zzjsVar instanceof Image$Message$ImageInset) {
            ImageInset.ADAPTER.encodeWithTag(protoWriter, 2, ((Image$Message$ImageInset) zzjsVar).getValue());
        } else if (zzjsVar instanceof Image$Message$ImageFixed) {
            ImageFixed.ADAPTER.encodeWithTag(protoWriter, 3, ((Image$Message$ImageFixed) zzjsVar).getValue());
        } else if (zzjsVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(image.unknownFields());
    }
}

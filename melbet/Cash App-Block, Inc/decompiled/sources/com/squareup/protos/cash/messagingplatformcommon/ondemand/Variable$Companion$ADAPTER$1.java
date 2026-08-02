package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjy;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.Variable;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Variable$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzjy zzjyVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Variable((String) obj, (Variable.Type) obj2, zzjyVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = Variable.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                zzjyVar = new Variable$Message$Text((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 4) {
                zzjyVar = new Variable$Message$LocalizableString((LocalizableString) LocalizableString.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjyVar = new Variable$Message$Money((LocalizableString) LocalizableString.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Variable variable = (Variable) obj;
        reverseProtoWriter.getClass();
        variable.getClass();
        reverseProtoWriter.writeBytes(variable.unknownFields());
        zzjy zzjyVar = variable.message;
        if (zzjyVar instanceof Variable$Message$Text) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((Variable$Message$Text) zzjyVar).value);
        } else if (zzjyVar instanceof Variable$Message$LocalizableString) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Variable$Message$LocalizableString) zzjyVar).value);
        } else if (zzjyVar instanceof Variable$Message$Money) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Variable$Message$Money) zzjyVar).value);
        } else if (zzjyVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Variable.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, variable.f1319type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, variable.variable_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Variable variable = (Variable) obj;
        variable.getClass();
        int size$okio = variable.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = Variable.Type.ADAPTER.encodedSizeWithTag(2, variable.f1319type) + protoAdapter.encodedSizeWithTag(1, variable.variable_name) + size$okio;
        zzjy zzjyVar = variable.message;
        if (zzjyVar instanceof Variable$Message$Text) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, ((Variable$Message$Text) zzjyVar).value);
        } else if (zzjyVar instanceof Variable$Message$LocalizableString) {
            encodedSizeWithTag = LocalizableString.ADAPTER.encodedSizeWithTag(4, ((Variable$Message$LocalizableString) zzjyVar).value);
        } else {
            if (!(zzjyVar instanceof Variable$Message$Money)) {
                if (zzjyVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalizableString.ADAPTER.encodedSizeWithTag(5, ((Variable$Message$Money) zzjyVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Variable variable = (Variable) obj;
        variable.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = variable.variable_name;
        Variable.Type type2 = variable.f1319type;
        byteString.getClass();
        return new Variable(str, type2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Variable variable = (Variable) obj;
        variable.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, variable.variable_name);
        Variable.Type.ADAPTER.encodeWithTag(protoWriter, 2, variable.f1319type);
        zzjy zzjyVar = variable.message;
        if (zzjyVar instanceof Variable$Message$Text) {
            protoAdapter.encodeWithTag(protoWriter, 3, ((Variable$Message$Text) zzjyVar).value);
        } else if (zzjyVar instanceof Variable$Message$LocalizableString) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, ((Variable$Message$LocalizableString) zzjyVar).value);
        } else if (zzjyVar instanceof Variable$Message$Money) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, ((Variable$Message$Money) zzjyVar).value);
        } else if (zzjyVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(variable.unknownFields());
    }
}

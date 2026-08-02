package com.squareup.protos.cash.deviceintegritly.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PlayIntegrityVerdict$AppIntegrity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PlayIntegrityVerdict.AppIntegrity((PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict) obj, (String) obj2, m, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PlayIntegrityVerdict.AppIntegrity appIntegrity = (PlayIntegrityVerdict.AppIntegrity) obj;
        reverseProtoWriter.getClass();
        appIntegrity.getClass();
        reverseProtoWriter.writeBytes(appIntegrity.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, appIntegrity.version_code);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, appIntegrity.certificate_sha256_digest);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appIntegrity.package_name);
        PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appIntegrity.app_recognition_verdict);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlayIntegrityVerdict.AppIntegrity appIntegrity = (PlayIntegrityVerdict.AppIntegrity) obj;
        appIntegrity.getClass();
        int encodedSizeWithTag = PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.ADAPTER.encodedSizeWithTag(1, appIntegrity.app_recognition_verdict) + appIntegrity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, appIntegrity.version_code) + protoAdapter.asRepeated().encodedSizeWithTag(3, appIntegrity.certificate_sha256_digest) + protoAdapter.encodedSizeWithTag(2, appIntegrity.package_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlayIntegrityVerdict.AppIntegrity appIntegrity = (PlayIntegrityVerdict.AppIntegrity) obj;
        appIntegrity.getClass();
        ByteString byteString = ByteString.EMPTY;
        PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict appRecognitionVerdict = appIntegrity.app_recognition_verdict;
        String str = appIntegrity.package_name;
        List list = appIntegrity.certificate_sha256_digest;
        String str2 = appIntegrity.version_code;
        list.getClass();
        byteString.getClass();
        return new PlayIntegrityVerdict.AppIntegrity(appRecognitionVerdict, str, list, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlayIntegrityVerdict.AppIntegrity appIntegrity = (PlayIntegrityVerdict.AppIntegrity) obj;
        appIntegrity.getClass();
        PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.ADAPTER.encodeWithTag(protoWriter, 1, appIntegrity.app_recognition_verdict);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, appIntegrity.package_name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, appIntegrity.certificate_sha256_digest);
        protoAdapter.encodeWithTag(protoWriter, 4, appIntegrity.version_code);
        protoWriter.writeBytes(appIntegrity.unknownFields());
    }
}

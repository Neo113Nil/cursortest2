package com.squareup.protos.hieroglyph;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AndroidKeystoreCompatibilityReport$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AndroidKeystoreCompatibilityReport((String) obj, (Long) obj2, m, arrayList, arrayList2, (PublicKeyConfig) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    try {
                        AndroidKeystoreCompatibilityReport.CompatibilityTest.ADAPTER.tryDecode(protoReader, m);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    try {
                        AndroidKeystoreCompatibilityReport.CompatibilityTest.ADAPTER.tryDecode(protoReader, arrayList);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    try {
                        AndroidKeystoreCompatibilityReport.CompatibilityTest.ADAPTER.tryDecode(protoReader, arrayList2);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(PublicKeyConfig.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = (AndroidKeystoreCompatibilityReport) obj;
        reverseProtoWriter.getClass();
        androidKeystoreCompatibilityReport.getClass();
        reverseProtoWriter.writeBytes(androidKeystoreCompatibilityReport.unknownFields());
        PublicKeyConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 6, androidKeystoreCompatibilityReport.key_config);
        AndroidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 = AndroidKeystoreCompatibilityReport.CompatibilityTest.ADAPTER;
        androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodeWithTag(reverseProtoWriter, 5, androidKeystoreCompatibilityReport.skipped_tests);
        androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodeWithTag(reverseProtoWriter, 4, androidKeystoreCompatibilityReport.succeeded_tests);
        androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodeWithTag(reverseProtoWriter, 3, androidKeystoreCompatibilityReport.failed_tests);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, androidKeystoreCompatibilityReport.keymint_version);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, androidKeystoreCompatibilityReport.chipset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = (AndroidKeystoreCompatibilityReport) obj;
        androidKeystoreCompatibilityReport.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, androidKeystoreCompatibilityReport.keymint_version) + ProtoAdapter.STRING.encodedSizeWithTag(1, androidKeystoreCompatibilityReport.chipset) + androidKeystoreCompatibilityReport.unknownFields().getSize$okio();
        AndroidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 = AndroidKeystoreCompatibilityReport.CompatibilityTest.ADAPTER;
        return PublicKeyConfig.ADAPTER.encodedSizeWithTag(6, androidKeystoreCompatibilityReport.key_config) + androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodedSizeWithTag(5, androidKeystoreCompatibilityReport.skipped_tests) + androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodedSizeWithTag(4, androidKeystoreCompatibilityReport.succeeded_tests) + androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodedSizeWithTag(3, androidKeystoreCompatibilityReport.failed_tests) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = (AndroidKeystoreCompatibilityReport) obj;
        androidKeystoreCompatibilityReport.getClass();
        PublicKeyConfig publicKeyConfig = androidKeystoreCompatibilityReport.key_config;
        PublicKeyConfig publicKeyConfig2 = publicKeyConfig != null ? (PublicKeyConfig) PublicKeyConfig.ADAPTER.redact(publicKeyConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = androidKeystoreCompatibilityReport.chipset;
        Long l = androidKeystoreCompatibilityReport.keymint_version;
        List list = androidKeystoreCompatibilityReport.failed_tests;
        List list2 = androidKeystoreCompatibilityReport.succeeded_tests;
        List list3 = androidKeystoreCompatibilityReport.skipped_tests;
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
        return new AndroidKeystoreCompatibilityReport(str, l, list, list2, list3, publicKeyConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = (AndroidKeystoreCompatibilityReport) obj;
        androidKeystoreCompatibilityReport.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, androidKeystoreCompatibilityReport.chipset);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, androidKeystoreCompatibilityReport.keymint_version);
        AndroidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 = AndroidKeystoreCompatibilityReport.CompatibilityTest.ADAPTER;
        androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodeWithTag(protoWriter, 3, androidKeystoreCompatibilityReport.failed_tests);
        androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodeWithTag(protoWriter, 4, androidKeystoreCompatibilityReport.succeeded_tests);
        androidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1.asRepeated().encodeWithTag(protoWriter, 5, androidKeystoreCompatibilityReport.skipped_tests);
        PublicKeyConfig.ADAPTER.encodeWithTag(protoWriter, 6, androidKeystoreCompatibilityReport.key_config);
        protoWriter.writeBytes(androidKeystoreCompatibilityReport.unknownFields());
    }
}

package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EducationalSheetContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        NdkCrashLog.Companion companion = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EducationalSheetContent(companion, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new EducationalSheetContent$Content$Image((EducationalSheetImage) EducationalSheetImage.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                companion = new EducationalSheetContent$Content$Text((EducationalSheetText) EducationalSheetText.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new EducationalSheetContent$Content$List((LocalNumberedList) LocalNumberedList.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EducationalSheetContent educationalSheetContent = (EducationalSheetContent) obj;
        reverseProtoWriter.getClass();
        educationalSheetContent.getClass();
        reverseProtoWriter.writeBytes(educationalSheetContent.unknownFields());
        NdkCrashLog.Companion companion = educationalSheetContent.content;
        if (companion instanceof EducationalSheetContent$Content$Image) {
            EducationalSheetImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((EducationalSheetContent$Content$Image) companion).value);
        } else if (companion instanceof EducationalSheetContent$Content$Text) {
            EducationalSheetText.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((EducationalSheetContent$Content$Text) companion).value);
        } else if (companion instanceof EducationalSheetContent$Content$List) {
            LocalNumberedList.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((EducationalSheetContent$Content$List) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, educationalSheetContent.analytics_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EducationalSheetContent educationalSheetContent = (EducationalSheetContent) obj;
        educationalSheetContent.getClass();
        int size$okio = educationalSheetContent.unknownFields().getSize$okio();
        NdkCrashLog.Companion companion = educationalSheetContent.content;
        if (companion instanceof EducationalSheetContent$Content$Image) {
            encodedSizeWithTag = EducationalSheetImage.ADAPTER.encodedSizeWithTag(1, ((EducationalSheetContent$Content$Image) companion).value);
        } else if (companion instanceof EducationalSheetContent$Content$Text) {
            encodedSizeWithTag = EducationalSheetText.ADAPTER.encodedSizeWithTag(2, ((EducationalSheetContent$Content$Text) companion).value);
        } else {
            if (!(companion instanceof EducationalSheetContent$Content$List)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(4, educationalSheetContent.analytics_id) + size$okio;
            }
            encodedSizeWithTag = LocalNumberedList.ADAPTER.encodedSizeWithTag(6, ((EducationalSheetContent$Content$List) companion).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, educationalSheetContent.analytics_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EducationalSheetContent educationalSheetContent = (EducationalSheetContent) obj;
        educationalSheetContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        NdkCrashLog.Companion companion = educationalSheetContent.content;
        String str = educationalSheetContent.analytics_id;
        byteString.getClass();
        return new EducationalSheetContent(companion, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EducationalSheetContent educationalSheetContent = (EducationalSheetContent) obj;
        educationalSheetContent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, educationalSheetContent.analytics_id);
        NdkCrashLog.Companion companion = educationalSheetContent.content;
        if (companion instanceof EducationalSheetContent$Content$Image) {
            EducationalSheetImage.ADAPTER.encodeWithTag(protoWriter, 1, ((EducationalSheetContent$Content$Image) companion).value);
        } else if (companion instanceof EducationalSheetContent$Content$Text) {
            EducationalSheetText.ADAPTER.encodeWithTag(protoWriter, 2, ((EducationalSheetContent$Content$Text) companion).value);
        } else if (companion instanceof EducationalSheetContent$Content$List) {
            LocalNumberedList.ADAPTER.encodeWithTag(protoWriter, 6, ((EducationalSheetContent$Content$List) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(educationalSheetContent.unknownFields());
    }
}

package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzlu performanceDetailsUiSection$Row$Value$DispositionType;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = "";
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        zzlu zzluVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetailsUiSection.Row((String) obj, (PerformanceDetailsUiSection.Row.MoreInfo) obj3, (String) obj2, zzluVar, (LocalizableString) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(PerformanceDetailsUiSection.Row.MoreInfo.ADAPTER, protoReader, obj3);
                    continue;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    try {
                        performanceDetailsUiSection$Row$Value$DispositionType = new PerformanceDetailsUiSection$Row$Value$AcquisitionType((AssetAcquisition$AcquisitionType) AssetAcquisition$AcquisitionType.ADAPTER.decode(protoReader));
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    try {
                        performanceDetailsUiSection$Row$Value$DispositionType = new PerformanceDetailsUiSection$Row$Value$DispositionType((AssetDisposition$DispositionType) AssetDisposition$DispositionType.ADAPTER.decode(protoReader));
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    try {
                        performanceDetailsUiSection$Row$Value$DispositionType = new PerformanceDetailsUiSection$Row$Value$SimpleValueType((PerformanceDetailsUiSection.Row.ValueType) PerformanceDetailsUiSection.Row.ValueType.ADAPTER.decode(protoReader));
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    continue;
                case 8:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzluVar = performanceDetailsUiSection$Row$Value$DispositionType;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetailsUiSection.Row row = (PerformanceDetailsUiSection.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        ByteString unknownFields = row.unknownFields();
        String str = row.label;
        String str2 = row.spoken_label;
        reverseProtoWriter.writeBytes(unknownFields);
        zzlu zzluVar = row.value;
        if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$AcquisitionType) {
            AssetAcquisition$AcquisitionType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((PerformanceDetailsUiSection$Row$Value$AcquisitionType) zzluVar).value);
        } else if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$DispositionType) {
            AssetDisposition$DispositionType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((PerformanceDetailsUiSection$Row$Value$DispositionType) zzluVar).value);
        } else if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$SimpleValueType) {
            PerformanceDetailsUiSection.Row.ValueType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((PerformanceDetailsUiSection$Row$Value$SimpleValueType) zzluVar).value);
        } else if (zzluVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizableString localizableString = row.localizable_spoken_label;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, localizableString);
        }
        LocalizableString localizableString2 = row.localizable_label;
        if (localizableString2 != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, localizableString2);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, str2);
        }
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = row.more_info;
        if (moreInfo != null) {
            PerformanceDetailsUiSection.Row.MoreInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, moreInfo);
        }
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalizableString localizableString;
        PerformanceDetailsUiSection.Row row = (PerformanceDetailsUiSection.Row) obj;
        row.getClass();
        ByteString unknownFields = row.unknownFields();
        String str = row.spoken_label;
        int size$okio = unknownFields.getSize$okio();
        String str2 = row.label;
        if (!Intrinsics.areEqual(str2, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = row.more_info;
        if (moreInfo != null) {
            size$okio += PerformanceDetailsUiSection.Row.MoreInfo.ADAPTER.encodedSizeWithTag(2, moreInfo);
        }
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(3, str);
        }
        zzlu zzluVar = row.value;
        if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$AcquisitionType) {
            encodedSizeWithTag = AssetAcquisition$AcquisitionType.ADAPTER.encodedSizeWithTag(4, ((PerformanceDetailsUiSection$Row$Value$AcquisitionType) zzluVar).value);
        } else if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$DispositionType) {
            encodedSizeWithTag = AssetDisposition$DispositionType.ADAPTER.encodedSizeWithTag(5, ((PerformanceDetailsUiSection$Row$Value$DispositionType) zzluVar).value);
        } else {
            if (!(zzluVar instanceof PerformanceDetailsUiSection$Row$Value$SimpleValueType)) {
                if (zzluVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                localizableString = row.localizable_label;
                if (localizableString != null) {
                    size$okio += LocalizableString.ADAPTER.encodedSizeWithTag(7, localizableString);
                }
                LocalizableString localizableString2 = row.localizable_spoken_label;
                return localizableString2 == null ? LocalizableString.ADAPTER.encodedSizeWithTag(8, localizableString2) + size$okio : size$okio;
            }
            encodedSizeWithTag = PerformanceDetailsUiSection.Row.ValueType.ADAPTER.encodedSizeWithTag(6, ((PerformanceDetailsUiSection$Row$Value$SimpleValueType) zzluVar).value);
        }
        size$okio += encodedSizeWithTag;
        localizableString = row.localizable_label;
        if (localizableString != null) {
        }
        LocalizableString localizableString22 = row.localizable_spoken_label;
        if (localizableString22 == null) {
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetailsUiSection.Row row = (PerformanceDetailsUiSection.Row) obj;
        row.getClass();
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = row.more_info;
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo2 = moreInfo != null ? (PerformanceDetailsUiSection.Row.MoreInfo) PerformanceDetailsUiSection.Row.MoreInfo.ADAPTER.redact(moreInfo) : null;
        LocalizableString localizableString = row.localizable_label;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = row.localizable_spoken_label;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = row.label;
        String str2 = row.spoken_label;
        zzlu zzluVar = row.value;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new PerformanceDetailsUiSection.Row(str, moreInfo2, str2, zzluVar, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetailsUiSection.Row row = (PerformanceDetailsUiSection.Row) obj;
        row.getClass();
        String str = row.label;
        String str2 = row.spoken_label;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = row.more_info;
        if (moreInfo != null) {
            PerformanceDetailsUiSection.Row.MoreInfo.ADAPTER.encodeWithTag(protoWriter, 2, moreInfo);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str2);
        }
        LocalizableString localizableString = row.localizable_label;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 7, localizableString);
        }
        LocalizableString localizableString2 = row.localizable_spoken_label;
        if (localizableString2 != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 8, localizableString2);
        }
        zzlu zzluVar = row.value;
        if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$AcquisitionType) {
            AssetAcquisition$AcquisitionType.ADAPTER.encodeWithTag(protoWriter, 4, ((PerformanceDetailsUiSection$Row$Value$AcquisitionType) zzluVar).value);
        } else if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$DispositionType) {
            AssetDisposition$DispositionType.ADAPTER.encodeWithTag(protoWriter, 5, ((PerformanceDetailsUiSection$Row$Value$DispositionType) zzluVar).value);
        } else if (zzluVar instanceof PerformanceDetailsUiSection$Row$Value$SimpleValueType) {
            PerformanceDetailsUiSection.Row.ValueType.ADAPTER.encodeWithTag(protoWriter, 6, ((PerformanceDetailsUiSection$Row$Value$SimpleValueType) zzluVar).value);
        } else if (zzluVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(row.unknownFields());
    }
}

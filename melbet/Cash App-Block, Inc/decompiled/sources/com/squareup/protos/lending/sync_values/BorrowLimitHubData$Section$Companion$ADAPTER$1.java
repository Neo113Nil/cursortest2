package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        zzjl zzjlVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.Section(m, zzjlVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppSupport.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzjlVar = new BorrowLimitHubData$Section$Section$ProgressSection((BorrowLimitHubData.LimitProgressSection) BorrowLimitHubData.LimitProgressSection.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzjlVar = new BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection((BorrowLimitHubData.IncreaseLimitActionsSection) BorrowLimitHubData.IncreaseLimitActionsSection.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                zzjlVar = new BorrowLimitHubData$Section$Section$LimitInfoBulletsSection((BorrowLimitHubData.LimitInfoBulletsSection) BorrowLimitHubData.LimitInfoBulletsSection.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjlVar = new BorrowLimitHubData$Section$Section$DisclaimerSection((BorrowLimitHubData.LimitDisclaimerSection) BorrowLimitHubData.LimitDisclaimerSection.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.Section section = (BorrowLimitHubData.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        zzjl zzjlVar = section.section;
        if (zzjlVar instanceof BorrowLimitHubData$Section$Section$ProgressSection) {
            BorrowLimitHubData.LimitProgressSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BorrowLimitHubData$Section$Section$ProgressSection) zzjlVar).value);
        } else if (zzjlVar instanceof BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) {
            BorrowLimitHubData.IncreaseLimitActionsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) zzjlVar).value);
        } else if (zzjlVar instanceof BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) {
            BorrowLimitHubData.LimitInfoBulletsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) zzjlVar).value);
        } else if (zzjlVar instanceof BorrowLimitHubData$Section$Section$DisclaimerSection) {
            BorrowLimitHubData.LimitDisclaimerSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BorrowLimitHubData$Section$Section$DisclaimerSection) zzjlVar).value);
        } else if (zzjlVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, section.app_supports);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.Section section = (BorrowLimitHubData.Section) obj;
        section.getClass();
        int encodedSizeWithTag = AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, section.app_supports) + section.unknownFields().getSize$okio();
        zzjl zzjlVar = section.section;
        if (zzjlVar instanceof BorrowLimitHubData$Section$Section$ProgressSection) {
            return BorrowLimitHubData.LimitProgressSection.ADAPTER.encodedSizeWithTag(2, ((BorrowLimitHubData$Section$Section$ProgressSection) zzjlVar).value) + encodedSizeWithTag;
        }
        if (zzjlVar instanceof BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) {
            return BorrowLimitHubData.IncreaseLimitActionsSection.ADAPTER.encodedSizeWithTag(3, ((BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) zzjlVar).value) + encodedSizeWithTag;
        }
        if (zzjlVar instanceof BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) {
            return BorrowLimitHubData.LimitInfoBulletsSection.ADAPTER.encodedSizeWithTag(4, ((BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) zzjlVar).value) + encodedSizeWithTag;
        }
        if (zzjlVar instanceof BorrowLimitHubData$Section$Section$DisclaimerSection) {
            return BorrowLimitHubData.LimitDisclaimerSection.ADAPTER.encodedSizeWithTag(5, ((BorrowLimitHubData$Section$Section$DisclaimerSection) zzjlVar).value) + encodedSizeWithTag;
        }
        if (zzjlVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.Section section = (BorrowLimitHubData.Section) obj;
        section.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(section.app_supports, AppSupport.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        zzjl zzjlVar = section.section;
        byteString.getClass();
        return new BorrowLimitHubData.Section(m1169redactElements, zzjlVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.Section section = (BorrowLimitHubData.Section) obj;
        section.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, section.app_supports);
        zzjl zzjlVar = section.section;
        if (zzjlVar instanceof BorrowLimitHubData$Section$Section$ProgressSection) {
            BorrowLimitHubData.LimitProgressSection.ADAPTER.encodeWithTag(protoWriter, 2, ((BorrowLimitHubData$Section$Section$ProgressSection) zzjlVar).value);
        } else if (zzjlVar instanceof BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) {
            BorrowLimitHubData.IncreaseLimitActionsSection.ADAPTER.encodeWithTag(protoWriter, 3, ((BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) zzjlVar).value);
        } else if (zzjlVar instanceof BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) {
            BorrowLimitHubData.LimitInfoBulletsSection.ADAPTER.encodeWithTag(protoWriter, 4, ((BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) zzjlVar).value);
        } else if (zzjlVar instanceof BorrowLimitHubData$Section$Section$DisclaimerSection) {
            BorrowLimitHubData.LimitDisclaimerSection.ADAPTER.encodeWithTag(protoWriter, 5, ((BorrowLimitHubData$Section$Section$DisclaimerSection) zzjlVar).value);
        } else if (zzjlVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}

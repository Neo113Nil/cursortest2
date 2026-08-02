package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RewardSelection$UnlockInProgress$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardSelection.UnlockInProgress((String) obj, (String) obj2, (LocalizableString) obj3, (LocalizableString) obj4, rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 4:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = new RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar((RewardSelection.UnlockInProgress.ProgressBar) RewardSelection.UnlockInProgress.ProgressBar.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
                    break;
                case 8:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardSelection.UnlockInProgress unlockInProgress = (RewardSelection.UnlockInProgress) obj;
        reverseProtoWriter.getClass();
        unlockInProgress.getClass();
        reverseProtoWriter.writeBytes(unlockInProgress.unknownFields());
        RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = unlockInProgress.progressIndicators;
        if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null) {
            RewardSelection.UnlockInProgress.ProgressBar.ADAPTER.encodeWithTag(reverseProtoWriter, 5, rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar.value);
        } else if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, unlockInProgress.localizable_styled_progress_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, unlockInProgress.localizable_progress_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, unlockInProgress.styled_progress_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, unlockInProgress.progress_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardSelection.UnlockInProgress unlockInProgress = (RewardSelection.UnlockInProgress) obj;
        unlockInProgress.getClass();
        int size$okio = unlockInProgress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(6, unlockInProgress.styled_progress_text) + protoAdapter.encodedSizeWithTag(4, unlockInProgress.progress_text) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(8, unlockInProgress.localizable_styled_progress_text) + protoAdapter2.encodedSizeWithTag(7, unlockInProgress.localizable_progress_text) + encodedSizeWithTag;
        RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = unlockInProgress.progressIndicators;
        if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null) {
            return RewardSelection.UnlockInProgress.ProgressBar.ADAPTER.encodedSizeWithTag(5, rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar.value) + encodedSizeWithTag2;
        }
        if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar == null) {
            return encodedSizeWithTag2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardSelection.UnlockInProgress unlockInProgress = (RewardSelection.UnlockInProgress) obj;
        unlockInProgress.getClass();
        LocalizableString localizableString = unlockInProgress.localizable_progress_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = unlockInProgress.localizable_styled_progress_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = unlockInProgress.progress_text;
        String str2 = unlockInProgress.styled_progress_text;
        RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = unlockInProgress.progressIndicators;
        byteString.getClass();
        return new RewardSelection.UnlockInProgress(str, str2, localizableString2, localizableString4, rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardSelection.UnlockInProgress unlockInProgress = (RewardSelection.UnlockInProgress) obj;
        unlockInProgress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, unlockInProgress.progress_text);
        protoAdapter.encodeWithTag(protoWriter, 6, unlockInProgress.styled_progress_text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, unlockInProgress.localizable_progress_text);
        protoAdapter2.encodeWithTag(protoWriter, 8, unlockInProgress.localizable_styled_progress_text);
        RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = unlockInProgress.progressIndicators;
        if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null) {
            RewardSelection.UnlockInProgress.ProgressBar.ADAPTER.encodeWithTag(protoWriter, 5, rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar.value);
        } else if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(unlockInProgress.unknownFields());
    }
}

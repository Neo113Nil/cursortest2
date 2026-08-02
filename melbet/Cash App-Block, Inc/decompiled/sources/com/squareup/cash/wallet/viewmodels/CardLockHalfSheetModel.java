package com.squareup.cash.wallet.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardLockHalfSheetModel {
    public final String body;
    public final ArrayList devices;
    public final String title;

    public CardLockHalfSheetModel(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.body = str2;
        this.devices = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardLockHalfSheetModel)) {
            return false;
        }
        CardLockHalfSheetModel cardLockHalfSheetModel = (CardLockHalfSheetModel) obj;
        return Intrinsics.areEqual(this.title, cardLockHalfSheetModel.title) && Intrinsics.areEqual(this.body, cardLockHalfSheetModel.body) && this.devices.equals(cardLockHalfSheetModel.devices);
    }

    public final int hashCode() {
        return this.devices.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardLockHalfSheetModel(title=", this.title, ", body=", this.body, ", devices="), this.devices);
    }
}

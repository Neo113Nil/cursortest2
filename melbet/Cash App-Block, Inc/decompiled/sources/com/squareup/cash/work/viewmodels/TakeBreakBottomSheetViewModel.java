package com.squareup.cash.work.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class TakeBreakBottomSheetViewModel {
    public final List breaks;
    public final String title;

    /* loaded from: classes7.dex */
    public final class BreakItem {
        public final String durationText;
        public final String name;
        public final String token;
        public final long versionNumber;

        public BreakItem(String str, long j, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.versionNumber = j;
            this.name = str2;
            this.durationText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakItem)) {
                return false;
            }
            BreakItem breakItem = (BreakItem) obj;
            return Intrinsics.areEqual(this.token, breakItem.token) && this.versionNumber == breakItem.versionNumber && Intrinsics.areEqual(this.name, breakItem.name) && this.durationText.equals(breakItem.durationText);
        }

        public final int hashCode() {
            return this.durationText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.token.hashCode() * 31, 31, this.versionNumber), 31, this.name);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("BreakItem(token=", this.token, ", versionNumber=", this.versionNumber);
            Boxes$$ExternalSyntheticOutline1.m(m, ", name=", this.name, ", durationText=", this.durationText);
            m.append(")");
            return m.toString();
        }
    }

    public TakeBreakBottomSheetViewModel(String str, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.breaks = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakeBreakBottomSheetViewModel)) {
            return false;
        }
        TakeBreakBottomSheetViewModel takeBreakBottomSheetViewModel = (TakeBreakBottomSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, takeBreakBottomSheetViewModel.title) && Intrinsics.areEqual(this.breaks, takeBreakBottomSheetViewModel.breaks);
    }

    public final int hashCode() {
        return this.breaks.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("TakeBreakBottomSheetViewModel(title=", this.title, ", breaks=", ")", this.breaks);
    }
}

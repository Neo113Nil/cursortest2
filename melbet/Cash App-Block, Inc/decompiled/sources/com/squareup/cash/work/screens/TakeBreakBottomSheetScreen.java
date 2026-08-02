package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TakeBreakBottomSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<TakeBreakBottomSheetScreen> CREATOR = new WorkHomeScreen.Creator(26);
    public final AskedQuestion askedQuestion;
    public final ArrayList breaks;
    public final String timecardToken;

    /* loaded from: classes7.dex */
    public final class BreakInfo implements Parcelable {
        public static final Parcelable.Creator<BreakInfo> CREATOR = new WorkHomeScreen.Creator(25);
        public final int expectedDurationSeconds;
        public final String name;
        public final String token;
        public final long versionNumber;

        public BreakInfo(int i, String str, String str2, long j) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.versionNumber = j;
            this.name = str2;
            this.expectedDurationSeconds = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakInfo)) {
                return false;
            }
            BreakInfo breakInfo = (BreakInfo) obj;
            return Intrinsics.areEqual(this.token, breakInfo.token) && this.versionNumber == breakInfo.versionNumber && Intrinsics.areEqual(this.name, breakInfo.name) && this.expectedDurationSeconds == breakInfo.expectedDurationSeconds;
        }

        public final int hashCode() {
            return Integer.hashCode(this.expectedDurationSeconds) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.token.hashCode() * 31, 31, this.versionNumber), 31, this.name);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("BreakInfo(token=", this.token, ", versionNumber=", this.versionNumber);
            m.append(", name=");
            m.append(this.name);
            m.append(", expectedDurationSeconds=");
            m.append(this.expectedDurationSeconds);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeLong(this.versionNumber);
            parcel.writeString(this.name);
            parcel.writeInt(this.expectedDurationSeconds);
        }
    }

    public TakeBreakBottomSheetScreen(String str, ArrayList arrayList, AskedQuestion askedQuestion) {
        str.getClass();
        this.timecardToken = str;
        this.breaks = arrayList;
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakeBreakBottomSheetScreen)) {
            return false;
        }
        TakeBreakBottomSheetScreen takeBreakBottomSheetScreen = (TakeBreakBottomSheetScreen) obj;
        return Intrinsics.areEqual(this.timecardToken, takeBreakBottomSheetScreen.timecardToken) && this.breaks.equals(takeBreakBottomSheetScreen.breaks) && Intrinsics.areEqual(this.askedQuestion, takeBreakBottomSheetScreen.askedQuestion);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.breaks, this.timecardToken.hashCode() * 31, 31);
        AskedQuestion askedQuestion = this.askedQuestion;
        return m + (askedQuestion == null ? 0 : askedQuestion.hashCode());
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.breaks, "TakeBreakBottomSheetScreen(timecardToken=", this.timecardToken, ", breaks=", ", askedQuestion=");
        m.append(this.askedQuestion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.timecardToken);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.breaks, parcel);
        while (m.hasNext()) {
            ((BreakInfo) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.askedQuestion, i);
    }
}

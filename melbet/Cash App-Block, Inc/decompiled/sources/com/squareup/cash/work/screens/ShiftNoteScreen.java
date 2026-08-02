package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ShiftNoteScreen implements Screen {
    public static final Parcelable.Creator<ShiftNoteScreen> CREATOR = new WorkHomeScreen.Creator(24);
    public final AskedQuestion askedQuestion;
    public final String existingTimecardNote;
    public final String shiftNote;
    public final OffsetDateTime shiftNoteDate;
    public final String timecardToken;

    public ShiftNoteScreen(String str, String str2, String str3, OffsetDateTime offsetDateTime, AskedQuestion askedQuestion) {
        this.timecardToken = str;
        this.existingTimecardNote = str2;
        this.shiftNote = str3;
        this.shiftNoteDate = offsetDateTime;
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
        if (!(obj instanceof ShiftNoteScreen)) {
            return false;
        }
        ShiftNoteScreen shiftNoteScreen = (ShiftNoteScreen) obj;
        return Intrinsics.areEqual(this.timecardToken, shiftNoteScreen.timecardToken) && Intrinsics.areEqual(this.existingTimecardNote, shiftNoteScreen.existingTimecardNote) && Intrinsics.areEqual(this.shiftNote, shiftNoteScreen.shiftNote) && Intrinsics.areEqual(this.shiftNoteDate, shiftNoteScreen.shiftNoteDate) && Intrinsics.areEqual(this.askedQuestion, shiftNoteScreen.askedQuestion);
    }

    public final int hashCode() {
        String str = this.timecardToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.existingTimecardNote;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shiftNote;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.shiftNoteDate;
        int hashCode4 = (hashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        AskedQuestion askedQuestion = this.askedQuestion;
        return hashCode4 + (askedQuestion != null ? askedQuestion.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftNoteScreen(timecardToken=", this.timecardToken, ", existingTimecardNote=", this.existingTimecardNote, ", shiftNote=");
        m.append(this.shiftNote);
        m.append(", shiftNoteDate=");
        m.append(this.shiftNoteDate);
        m.append(", askedQuestion=");
        m.append(this.askedQuestion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.timecardToken);
        parcel.writeString(this.existingTimecardNote);
        parcel.writeString(this.shiftNote);
        parcel.writeSerializable(this.shiftNoteDate);
        parcel.writeParcelable(this.askedQuestion, i);
    }
}

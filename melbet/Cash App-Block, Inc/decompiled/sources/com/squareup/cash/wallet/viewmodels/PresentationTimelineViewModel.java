package com.squareup.cash.wallet.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PresentationTimelineViewModel implements Parcelable {
    public static final Parcelable.Creator<PresentationTimelineViewModel> CREATOR = new WorkHomeScreen.Creator(4);
    public final PresentationAction action;
    public final String deviceId;
    public final Icon icon;
    public final ArrayList steps;
    public final String subtitle;
    public final String themeToken;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Icon {
        public static final /* synthetic */ Icon[] $VALUES;
        public static final Icon CHECKMARK;
        public static final Icon CHECKMARK_SUCCESS;
        public static final Icon PACKAGE;
        public static final Icon TRUCK;

        static {
            Icon icon = new Icon("CHECKMARK", 0);
            CHECKMARK = icon;
            Icon icon2 = new Icon("PACKAGE", 1);
            PACKAGE = icon2;
            Icon icon3 = new Icon("TRUCK", 2);
            TRUCK = icon3;
            Icon icon4 = new Icon("CHECKMARK_SUCCESS", 3);
            CHECKMARK_SUCCESS = icon4;
            $VALUES = new Icon[]{icon, icon2, icon3, icon4};
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public final class Step implements Parcelable {
        public static final Parcelable.Creator<Step> CREATOR = new WorkHomeScreen.Creator(5);
        public final String date;
        public final State state;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class State {
            public static final /* synthetic */ State[] $VALUES;
            public static final State COMPLETED;
            public static final State IN_PROGRESS;
            public static final State UPCOMING;

            static {
                State state = new State("COMPLETED", 0);
                COMPLETED = state;
                State state2 = new State("IN_PROGRESS", 1);
                IN_PROGRESS = state2;
                State state3 = new State("UPCOMING", 2);
                UPCOMING = state3;
                $VALUES = new State[]{state, state2, state3};
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        public Step(String str, String str2, State state) {
            str.getClass();
            state.getClass();
            this.title = str;
            this.date = str2;
            this.state = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return Intrinsics.areEqual(this.title, step.title) && Intrinsics.areEqual(this.date, step.date) && this.state == step.state;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.date;
            return this.state.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Step(title=", this.title, ", date=", this.date, ", state=");
            m.append(this.state);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.date);
            parcel.writeString(this.state.name());
        }
    }

    public PresentationTimelineViewModel(Icon icon, String str, String str2, ArrayList arrayList, PresentationAction presentationAction, String str3, String str4) {
        icon.getClass();
        str.getClass();
        this.icon = icon;
        this.title = str;
        this.subtitle = str2;
        this.steps = arrayList;
        this.action = presentationAction;
        this.themeToken = str3;
        this.deviceId = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentationTimelineViewModel)) {
            return false;
        }
        PresentationTimelineViewModel presentationTimelineViewModel = (PresentationTimelineViewModel) obj;
        return this.icon == presentationTimelineViewModel.icon && Intrinsics.areEqual(this.title, presentationTimelineViewModel.title) && Intrinsics.areEqual(this.subtitle, presentationTimelineViewModel.subtitle) && this.steps.equals(presentationTimelineViewModel.steps) && Intrinsics.areEqual(this.action, presentationTimelineViewModel.action) && Intrinsics.areEqual(this.themeToken, presentationTimelineViewModel.themeToken) && Intrinsics.areEqual(this.deviceId, presentationTimelineViewModel.deviceId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.steps, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
        PresentationAction presentationAction = this.action;
        int hashCode = (m2 + (presentationAction == null ? 0 : presentationAction.hashCode())) * 31;
        String str2 = this.themeToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresentationTimelineViewModel(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", themeToken=");
        sb.append(this.themeToken);
        sb.append(", deviceId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.deviceId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.icon.name());
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.steps, parcel);
        while (m.hasNext()) {
            ((Step) m.next()).writeToParcel(parcel, i);
        }
        PresentationAction presentationAction = this.action;
        if (presentationAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentationAction.writeToParcel(parcel, i);
        }
        parcel.writeString(this.themeToken);
        parcel.writeString(this.deviceId);
    }
}

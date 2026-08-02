package com.squareup.cash.work.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class WorkYouViewModel {
    public final List jobs;
    public final List locations;
    public final String squarePosPasscode;

    public WorkYouViewModel(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.squarePosPasscode = str;
        this.jobs = list;
        this.locations = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkYouViewModel)) {
            return false;
        }
        WorkYouViewModel workYouViewModel = (WorkYouViewModel) obj;
        return this.squarePosPasscode.equals(workYouViewModel.squarePosPasscode) && Intrinsics.areEqual(this.jobs, workYouViewModel.jobs) && Intrinsics.areEqual(this.locations, workYouViewModel.locations);
    }

    public final int hashCode() {
        return this.locations.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.squarePosPasscode.hashCode() * 31, 31, this.jobs);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("WorkYouViewModel(squarePosPasscode=", this.squarePosPasscode, ", jobs=", ", locations=", this.jobs), this.locations, ")");
    }
}

package com.squareup.cash.work.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class WorkHomeViewModel {
    public final PayCellViewModel payCellViewModel;
    public final ShiftSection2ViewModel shiftSection2ViewModel;
    public final WorkHomeTitleBarViewModel workHomeTitleBarViewModel;
    public final WorkYouViewModel workYouViewModel;

    public WorkHomeViewModel(WorkHomeTitleBarViewModel workHomeTitleBarViewModel, ShiftSection2ViewModel shiftSection2ViewModel, PayCellViewModel payCellViewModel, WorkYouViewModel workYouViewModel, int i) {
        this.workHomeTitleBarViewModel = workHomeTitleBarViewModel;
        this.shiftSection2ViewModel = shiftSection2ViewModel;
        this.payCellViewModel = payCellViewModel;
        this.workYouViewModel = workYouViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkHomeViewModel)) {
            return false;
        }
        WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj;
        return this.workHomeTitleBarViewModel.equals(workHomeViewModel.workHomeTitleBarViewModel) && this.shiftSection2ViewModel.equals(workHomeViewModel.shiftSection2ViewModel) && Intrinsics.areEqual(this.payCellViewModel, workHomeViewModel.payCellViewModel) && this.workYouViewModel.equals(workHomeViewModel.workYouViewModel);
    }

    public final int hashCode() {
        int hashCode = (this.shiftSection2ViewModel.hashCode() + (this.workHomeTitleBarViewModel.hashCode() * 31)) * 31;
        PayCellViewModel payCellViewModel = this.payCellViewModel;
        return (this.workYouViewModel.hashCode() + ((hashCode + (payCellViewModel == null ? 0 : payCellViewModel.hashCode())) * 31)) * 961;
    }

    public final String toString() {
        return "WorkHomeViewModel(workHomeTitleBarViewModel=" + this.workHomeTitleBarViewModel + ", shiftSection2ViewModel=" + this.shiftSection2ViewModel + ", payCellViewModel=" + this.payCellViewModel + ", workYouViewModel=" + this.workYouViewModel + ", toastState=null, autoClockOutDialogState=null)";
    }
}

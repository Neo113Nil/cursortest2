package com.squareup.cash.support.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportArticleIncidentsSheetViewModel {
    public final List notifications;

    public SupportArticleIncidentsSheetViewModel(List list) {
        list.getClass();
        this.notifications = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportArticleIncidentsSheetViewModel) && Intrinsics.areEqual(this.notifications, ((SupportArticleIncidentsSheetViewModel) obj).notifications);
    }

    public final int hashCode() {
        return this.notifications.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SupportArticleIncidentsSheetViewModel(notifications=", ")", this.notifications);
    }
}

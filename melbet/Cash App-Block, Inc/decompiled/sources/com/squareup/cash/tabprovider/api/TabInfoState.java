package com.squareup.cash.tabprovider.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface TabInfoState {

    public final class NotReady implements TabInfoState {
        public static final NotReady INSTANCE = new NotReady();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotReady);
        }

        public final int hashCode() {
            return -1232422750;
        }

        public final String toString() {
            return "NotReady";
        }
    }

    public final class Onboarding implements TabInfoState {
        public static final Onboarding INSTANCE = new Onboarding();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Onboarding);
        }

        public final int hashCode() {
            return 1226811309;
        }

        public final String toString() {
            return "Onboarding";
        }
    }

    /* loaded from: classes8.dex */
    public final class Ready implements TabInfoState {
        public final List tabs;

        public Ready(List list) {
            list.getClass();
            this.tabs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && Intrinsics.areEqual(this.tabs, ((Ready) obj).tabs);
        }

        public final List getTabs() {
            return this.tabs;
        }

        public final int hashCode() {
            return this.tabs.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Ready(tabs=", ")", this.tabs);
        }
    }
}

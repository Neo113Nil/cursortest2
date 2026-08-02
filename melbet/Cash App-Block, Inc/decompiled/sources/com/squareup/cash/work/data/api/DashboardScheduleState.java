package com.squareup.cash.work.data.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface DashboardScheduleState {

    public final class Error implements DashboardScheduleState {
        public final Exception exception;

        public Error(Exception exc) {
            this.exception = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.exception.equals(((Error) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return "Error(exception=" + this.exception + ")";
        }
    }

    public final class Loaded implements DashboardScheduleState {
        public final List schedules;

        public Loaded(List list) {
            list.getClass();
            this.schedules = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.schedules, ((Loaded) obj).schedules);
        }

        public final int hashCode() {
            return this.schedules.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(schedules=", ")", this.schedules);
        }
    }

    public final class Loading implements DashboardScheduleState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2032819713;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

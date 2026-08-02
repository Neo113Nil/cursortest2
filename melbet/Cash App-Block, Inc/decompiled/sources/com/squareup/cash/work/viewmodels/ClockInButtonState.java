package com.squareup.cash.work.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface ClockInButtonState {

    public final class ClockedIn implements ClockInButtonState {
        public static final ClockedIn INSTANCE = new ClockedIn();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClockedIn);
        }

        public final int hashCode() {
            return 2084804164;
        }

        public final String toString() {
            return "ClockedIn";
        }
    }

    public final class ClockedOut implements ClockInButtonState {
        public final boolean isClockInEnabled;

        public ClockedOut(boolean z) {
            this.isClockInEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClockedOut) && this.isClockInEnabled == ((ClockedOut) obj).isClockInEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isClockInEnabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ClockedOut(isClockInEnabled=", ")", this.isClockInEnabled);
        }
    }

    public final class Hidden implements ClockInButtonState {
        public static final Hidden INSTANCE = new Hidden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public final int hashCode() {
            return -1510916136;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public final class OnBreak implements ClockInButtonState {
        public static final OnBreak INSTANCE = new OnBreak();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBreak);
        }

        public final int hashCode() {
            return -1859005966;
        }

        public final String toString() {
            return "OnBreak";
        }
    }
}

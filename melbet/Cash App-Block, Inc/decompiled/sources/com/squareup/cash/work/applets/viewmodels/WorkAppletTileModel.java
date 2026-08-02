package com.squareup.cash.work.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface WorkAppletTileModel {

    public final class Failed implements WorkAppletTileModel {
        public final Exception cause;

        public Failed(Exception exc) {
            this.cause = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && this.cause.equals(((Failed) obj).cause);
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return "Failed(subtitle=, cause=" + this.cause + ")";
        }
    }

    public final class Installed implements WorkAppletTileModel {
        public final ArrayList icons;
        public final String primaryText;
        public final String secondaryText;

        public Installed(String str, String str2, ArrayList arrayList) {
            str.getClass();
            this.primaryText = str;
            this.secondaryText = str2;
            this.icons = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.primaryText, installed.primaryText) && Intrinsics.areEqual(this.secondaryText, installed.secondaryText) && this.icons.equals(installed.icons);
        }

        public final int hashCode() {
            int hashCode = this.primaryText.hashCode() * 31;
            String str = this.secondaryText;
            return this.icons.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ", icons="), this.icons);
        }
    }

    public final class Loading implements WorkAppletTileModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1614564225;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

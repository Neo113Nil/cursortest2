package com.squareup.cash.support.chat.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatSurveyViewModel {

    public final class Complete extends ChatSurveyViewModel {
        public static final Complete INSTANCE = new Complete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Complete);
        }

        public final int hashCode() {
            return -1519346193;
        }

        public final String toString() {
            return "Complete";
        }
    }

    public final class Loaded extends ChatSurveyViewModel {
        public final String resolutionTitle;
        public final String satisfactionTitle;
        public final Integer selectedOption;
        public final boolean useConsistentCsatOrder;

        public Loaded(String str, String str2, Integer num, boolean z) {
            str.getClass();
            str2.getClass();
            this.satisfactionTitle = str;
            this.resolutionTitle = str2;
            this.selectedOption = num;
            this.useConsistentCsatOrder = z;
        }

        public static Loaded copy$default(Loaded loaded, Integer num) {
            String str = loaded.satisfactionTitle;
            String str2 = loaded.resolutionTitle;
            boolean z = loaded.useConsistentCsatOrder;
            str.getClass();
            str2.getClass();
            return new Loaded(str, str2, num, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.satisfactionTitle, loaded.satisfactionTitle) && Intrinsics.areEqual(this.resolutionTitle, loaded.resolutionTitle) && Intrinsics.areEqual(this.selectedOption, loaded.selectedOption) && this.useConsistentCsatOrder == loaded.useConsistentCsatOrder;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.satisfactionTitle.hashCode() * 31, 31, this.resolutionTitle);
            Integer num = this.selectedOption;
            return Boolean.hashCode(this.useConsistentCsatOrder) + ((m + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(satisfactionTitle=", this.satisfactionTitle, ", resolutionTitle=", this.resolutionTitle, ", selectedOption=");
            m.append(this.selectedOption);
            m.append(", useConsistentCsatOrder=");
            m.append(this.useConsistentCsatOrder);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends ChatSurveyViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 168428998;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

package com.squareup.cash.support.chat.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public abstract class ChatSurveyViewEvent {

    public final class ChangeRating extends ChatSurveyViewEvent {
        public final int rating;

        public ChangeRating(int i) {
            this.rating = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeRating) && this.rating == ((ChangeRating) obj).rating;
        }

        public final int hashCode() {
            return Integer.hashCode(this.rating);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rating, "ChangeRating(rating=", ")");
        }
    }

    public final class Close extends ChatSurveyViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1123025997;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Submit extends ChatSurveyViewEvent {
        public final boolean issueResolved;

        public Submit(boolean z) {
            this.issueResolved = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Submit) && this.issueResolved == ((Submit) obj).issueResolved;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.issueResolved);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Submit(issueResolved=", ")", this.issueResolved);
        }
    }
}

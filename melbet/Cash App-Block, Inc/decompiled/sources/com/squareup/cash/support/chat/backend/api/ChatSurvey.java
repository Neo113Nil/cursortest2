package com.squareup.cash.support.chat.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatSurvey {

    public final class Completed extends ChatSurvey {
        public static final Completed INSTANCE = new Completed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Completed);
        }

        public final int hashCode() {
            return 16098658;
        }

        public final String toString() {
            return "Completed";
        }
    }

    public final class Pending extends ChatSurvey {
        public final RatingQuestion ratingQuestion;
        public final ResolutionQuestion resolutionQuestion;
        public final SatisfactionQuestion satisfactionQuestion;

        public final class RatingQuestion {
            public final MapBuilder prompts;
            public final MapBuilder reasons;
            public final String title;

            public RatingQuestion(String str, MapBuilder mapBuilder, MapBuilder mapBuilder2) {
                this.title = str;
                this.prompts = mapBuilder;
                this.reasons = mapBuilder2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RatingQuestion)) {
                    return false;
                }
                RatingQuestion ratingQuestion = (RatingQuestion) obj;
                return Intrinsics.areEqual(this.title, ratingQuestion.title) && this.prompts.equals(ratingQuestion.prompts) && this.reasons.equals(ratingQuestion.reasons);
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = str == null ? 0 : str.hashCode();
                return this.reasons.hashCode() + ((this.prompts.hashCode() + (hashCode * 31)) * 31);
            }

            public final String toString() {
                return "RatingQuestion(title=" + this.title + ", prompts=" + this.prompts + ", reasons=" + this.reasons + ")";
            }
        }

        public final class ResolutionQuestion {
            public final String subtitle;
            public final String title;

            public ResolutionQuestion(String str, String str2) {
                this.title = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ResolutionQuestion)) {
                    return false;
                }
                ResolutionQuestion resolutionQuestion = (ResolutionQuestion) obj;
                return Intrinsics.areEqual(this.title, resolutionQuestion.title) && Intrinsics.areEqual(this.subtitle, resolutionQuestion.subtitle);
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("ResolutionQuestion(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        public final class SatisfactionQuestion {
            public final String title;

            public SatisfactionQuestion(String str) {
                str.getClass();
                this.title = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SatisfactionQuestion) && Intrinsics.areEqual(this.title, ((SatisfactionQuestion) obj).title);
            }

            public final int hashCode() {
                return this.title.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SatisfactionQuestion(title=", this.title, ")");
            }
        }

        public Pending(ResolutionQuestion resolutionQuestion, RatingQuestion ratingQuestion, SatisfactionQuestion satisfactionQuestion) {
            this.resolutionQuestion = resolutionQuestion;
            this.ratingQuestion = ratingQuestion;
            this.satisfactionQuestion = satisfactionQuestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) obj;
            return this.resolutionQuestion.equals(pending.resolutionQuestion) && this.ratingQuestion.equals(pending.ratingQuestion) && Intrinsics.areEqual(this.satisfactionQuestion, pending.satisfactionQuestion);
        }

        public final int hashCode() {
            int hashCode = (this.ratingQuestion.hashCode() + (this.resolutionQuestion.hashCode() * 31)) * 31;
            SatisfactionQuestion satisfactionQuestion = this.satisfactionQuestion;
            return hashCode + (satisfactionQuestion == null ? 0 : satisfactionQuestion.title.hashCode());
        }

        public final String toString() {
            return "Pending(resolutionQuestion=" + this.resolutionQuestion + ", ratingQuestion=" + this.ratingQuestion + ", satisfactionQuestion=" + this.satisfactionQuestion + ")";
        }
    }

    public final class Unavailable extends ChatSurvey {
        public static final Unavailable INSTANCE = new Unavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return 1518017959;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}

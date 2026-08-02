package com.squareup.cash.userjourneys.tracker;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class UserJourney$Friction {
    public final String value;

    public final class CdfDefined extends UserJourney$Friction {
        public final String friction;

        public CdfDefined(String str) {
            super(str);
            this.friction = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CdfDefined) && this.friction.equals(((CdfDefined) obj).friction);
        }

        public final int hashCode() {
            return this.friction.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CdfDefined(friction=", this.friction, ")");
        }
    }

    /* loaded from: classes4.dex */
    public final class RequiredHelp extends UserJourney$Friction {
        public static final RequiredHelp INSTANCE = new RequiredHelp("required-help");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequiredHelp);
        }

        public final int hashCode() {
            return -2005101209;
        }

        public final String toString() {
            return "RequiredHelp";
        }
    }

    public final class ResponseContext extends UserJourney$Friction {
        public final String friction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseContext(String str) {
            super(str);
            str.getClass();
            this.friction = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseContext) && Intrinsics.areEqual(this.friction, ((ResponseContext) obj).friction);
        }

        public final int hashCode() {
            return this.friction.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResponseContext(friction=", this.friction, ")");
        }
    }

    public /* synthetic */ UserJourney$Friction(String str) {
        this.value = str;
    }
}

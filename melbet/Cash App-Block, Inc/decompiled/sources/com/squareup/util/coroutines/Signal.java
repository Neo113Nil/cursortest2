package com.squareup.util.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface Signal extends Function1 {

    public final class Green implements Signal {
        public static final Green INSTANCE = new Green();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Green);
        }

        public final int hashCode() {
            return -470566963;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Unit.INSTANCE;
        }

        public final String toString() {
            return "Green";
        }
    }
}

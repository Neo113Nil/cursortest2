package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class g extends Exception {
    public g() {
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class a extends g {
        public static final a b = new a();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 400454163;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BAD_BASE_64";
        }

        public a() {
            super(null);
        }
    }
}

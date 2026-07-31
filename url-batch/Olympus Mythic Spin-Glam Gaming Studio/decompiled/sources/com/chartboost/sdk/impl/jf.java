package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class jf {

    public static final class a extends jf {
        public final double a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.a, ((a) obj).a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.a);
        }

        public String toString() {
            return "Fraction(fraction=" + this.a + ")";
        }

        public a(double d) {
            super(null);
            this.a = d;
        }

        public final double a() {
            return this.a;
        }
    }

    public jf() {
    }

    public /* synthetic */ jf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class b extends jf {
        public final long a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return Long.hashCode(this.a);
        }

        public String toString() {
            return "TimeMs(ms=" + this.a + ")";
        }

        public b(long j) {
            super(null);
            this.a = j;
        }

        public final long a() {
            return this.a;
        }
    }
}

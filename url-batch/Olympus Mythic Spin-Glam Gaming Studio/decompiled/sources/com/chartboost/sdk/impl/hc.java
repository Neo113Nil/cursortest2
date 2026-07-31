package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class hc {
    public hc() {
    }

    public static final class b extends hc {
        public final fc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fc mediaFile) {
            super(null);
            Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
            this.a = mediaFile;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Selected(mediaFile=" + this.a + ")";
        }

        public final fc a() {
            return this.a;
        }
    }

    public /* synthetic */ hc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static abstract class a extends hc {
        public a() {
            super(null);
        }

        public static final class b extends a {
            public static final b a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -901980264;
            }

            public String toString() {
                return "AllVpaid";
            }

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: com.chartboost.sdk.impl.hc$a$a, reason: collision with other inner class name */
        public static final class C0222a extends a {
            public static final C0222a a = new C0222a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0222a);
            }

            public int hashCode() {
                return 833515787;
            }

            public String toString() {
                return "AllUnsupported";
            }

            public C0222a() {
                super(null);
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1072530378;
            }

            public String toString() {
                return "Empty";
            }

            public c() {
                super(null);
            }
        }
    }
}

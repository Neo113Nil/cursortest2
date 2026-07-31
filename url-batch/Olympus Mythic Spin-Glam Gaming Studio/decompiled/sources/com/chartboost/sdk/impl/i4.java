package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class i4 {
    public abstract String a();

    public abstract List b();

    public i4() {
    }

    public /* synthetic */ i4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class d extends i4 {
        public final List a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.a = clickTrackingUrls;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VastVideoClick(clickTrackingUrls=" + this.a + ", clickThroughUrl=" + this.b + ")";
        }

        @Override // com.chartboost.sdk.impl.i4
        public List b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.i4
        public String a() {
            return this.b;
        }
    }

    public static final class c extends i4 {
        public final List a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.a = clickTrackingUrls;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VastCompanionClick(clickTrackingUrls=" + this.a + ", clickThroughUrl=" + this.b + ")";
        }

        @Override // com.chartboost.sdk.impl.i4
        public List b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.i4
        public String a() {
            return this.b;
        }
    }

    public static final class a extends i4 {
        public final List a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.a = clickTrackingUrls;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CtaClick(clickTrackingUrls=" + this.a + ", clickThroughUrl=" + this.b + ")";
        }

        @Override // com.chartboost.sdk.impl.i4
        public List b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.i4
        public String a() {
            return this.b;
        }
    }

    public static final class b extends i4 {
        public final List a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.a = clickTrackingUrls;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GeneralClick(clickTrackingUrls=" + this.a + ", clickThroughUrl=" + this.b + ")";
        }

        @Override // com.chartboost.sdk.impl.i4
        public List b() {
            return this.a;
        }

        @Override // com.chartboost.sdk.impl.i4
        public String a() {
            return this.b;
        }
    }
}

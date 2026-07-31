package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c {

    public static final class a extends c {
        public final String a;
        public final wa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, wa inLine) {
            super(null);
            Intrinsics.checkNotNullParameter(inLine, "inLine");
            this.a = str;
            this.b = inLine;
        }

        public final a a(String str, wa inLine) {
            Intrinsics.checkNotNullParameter(inLine, "inLine");
            return new a(str, inLine);
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
            String str = this.a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "InLineAd(id=" + this.a + ", inLine=" + this.b + ")";
        }

        public static /* synthetic */ a a(a aVar, String str, wa waVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                waVar = aVar.b;
            }
            return aVar.a(str, waVar);
        }

        public final wa a() {
            return this.b;
        }
    }

    public c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class b extends c {
        public final String a;
        public final yl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, yl wrapper) {
            super(null);
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            this.a = str;
            this.b = wrapper;
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
            String str = this.a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "WrapperAd(id=" + this.a + ", wrapper=" + this.b + ")";
        }

        public final yl a() {
            return this.b;
        }
    }
}

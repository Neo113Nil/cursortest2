package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class za {
    public final String a;
    public final String b;
    public final b c;
    public final a d;
    public final a e;
    public final a f;

    public za(String imageUrl, String clickthroughUrl, b position, a margin, a padding, a size) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.a = imageUrl;
        this.b = clickthroughUrl;
        this.c = position;
        this.d = margin;
        this.e = padding;
        this.f = size;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return Intrinsics.areEqual(this.a, zaVar.a) && Intrinsics.areEqual(this.b, zaVar.b) && this.c == zaVar.c && Intrinsics.areEqual(this.d, zaVar.d) && Intrinsics.areEqual(this.e, zaVar.e) && Intrinsics.areEqual(this.f, zaVar.f);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "InfoIcon(imageUrl=" + this.a + ", clickthroughUrl=" + this.b + ", position=" + this.c + ", margin=" + this.d + ", padding=" + this.e + ", size=" + this.f + ")";
    }

    public final String b() {
        return this.a;
    }

    public final String a() {
        return this.b;
    }

    public final b d() {
        return this.c;
    }

    public final a c() {
        return this.d;
    }

    public final a e() {
        return this.f;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final a c;
        public static final b d = new b("TOP_LEFT", 0, 0);
        public static final b e = new b("TOP_RIGHT", 1, 1);
        public static final b f = new b("BOTTOM_LEFT", 2, 2);
        public static final b g = new b("BOTTOM_RIGHT", 3, 3);
        public static final /* synthetic */ b[] h;
        public static final /* synthetic */ EnumEntries i;
        public final int b;

        static {
            b[] a2 = a();
            h = a2;
            i = EnumEntriesKt.enumEntries(a2);
            c = new a(null);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{d, e, f, g};
        }

        public static EnumEntries b() {
            return i;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }

        public b(String str, int i2, int i3) {
            this.b = i3;
        }

        public final int c() {
            return this.b;
        }

        public static final class a {
            public final b a(int i) {
                Object obj;
                Iterator<E> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b) obj).c() == i) {
                        break;
                    }
                }
                b bVar = (b) obj;
                return bVar == null ? b.d : bVar;
            }

            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public /* synthetic */ za(String str, String str2, b bVar, a aVar, a aVar2, a aVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? b.d : bVar, (i & 8) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar, (i & 16) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar2, (i & 32) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar3);
    }

    public static final class a {
        public final double a;
        public final double b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.a) * 31) + Double.hashCode(this.b);
        }

        public String toString() {
            return "DoubleSize(width=" + this.a + ", height=" + this.b + ")";
        }

        public a(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final double b() {
            return this.a;
        }

        public final double a() {
            return this.b;
        }

        public /* synthetic */ a(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
        }
    }
}

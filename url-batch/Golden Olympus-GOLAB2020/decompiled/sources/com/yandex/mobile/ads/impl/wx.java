package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class wx {

    public static final class a extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34220a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f34221b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f34222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String name, @NotNull String format, @NotNull String id) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(id, "id");
            this.f34220a = name;
            this.f34221b = format;
            this.f34222c = id;
        }

        @NotNull
        public final String a() {
            return this.f34221b;
        }

        @NotNull
        public final String b() {
            return this.f34222c;
        }

        @NotNull
        public final String c() {
            return this.f34220a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f34220a, aVar.f34220a) && Intrinsics.areEqual(this.f34221b, aVar.f34221b) && Intrinsics.areEqual(this.f34222c, aVar.f34222c);
        }

        public final int hashCode() {
            return this.f34222c.hashCode() + C1842c3.a(this.f34221b, this.f34220a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "AdUnit(name=" + this.f34220a + ", format=" + this.f34221b + ", id=" + this.f34222c + ")";
        }
    }

    public static final class b extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f34223a = new b();

        private b() {
            super(0);
        }
    }

    public static final class c extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34224a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f34225b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f34226b;

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a[] f34227c;

            static {
                a aVar = new a();
                f34226b = aVar;
                a[] aVarArr = {aVar};
                f34227c = aVarArr;
                AbstractC1372b.a(aVarArr);
            }

            private a() {
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f34227c.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            a actionType = a.f34226b;
            Intrinsics.checkNotNullParameter("Enable Test mode", b9.h.f15450K0);
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            this.f34224a = "Enable Test mode";
            this.f34225b = actionType;
        }

        @NotNull
        public final a a() {
            return this.f34225b;
        }

        @NotNull
        public final String b() {
            return this.f34224a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f34224a, cVar.f34224a) && this.f34225b == cVar.f34225b;
        }

        public final int hashCode() {
            return this.f34225b.hashCode() + (this.f34224a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Button(text=" + this.f34224a + ", actionType=" + this.f34225b + ")";
        }
    }

    public static final class d extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f34228a = new d();

        private d() {
            super(0);
        }
    }

    public static final class e extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34229a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String text) {
            super(0);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f34229a = text;
        }

        @NotNull
        public final String a() {
            return this.f34229a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f34229a, ((e) obj).f34229a);
        }

        public final int hashCode() {
            return this.f34229a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Header(text=" + this.f34229a + ")";
        }
    }

    public static final class f extends wx {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f34230a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final qx f34231b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final ow f34232c;

        public /* synthetic */ f(String str, qx qxVar) {
            this(str, qxVar, null);
        }

        @Nullable
        public final String a() {
            return this.f34230a;
        }

        @Nullable
        public final qx b() {
            return this.f34231b;
        }

        @Nullable
        public final ow c() {
            return this.f34232c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f34230a, fVar.f34230a) && Intrinsics.areEqual(this.f34231b, fVar.f34231b) && Intrinsics.areEqual(this.f34232c, fVar.f34232c);
        }

        public final int hashCode() {
            String str = this.f34230a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            qx qxVar = this.f34231b;
            int hashCode2 = (hashCode + (qxVar == null ? 0 : qxVar.hashCode())) * 31;
            ow owVar = this.f34232c;
            return hashCode2 + (owVar != null ? owVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "KeyValue(title=" + this.f34230a + ", subtitle=" + this.f34231b + ", text=" + this.f34232c + ")";
        }

        public f(@Nullable String str, @Nullable qx qxVar, @Nullable ow owVar) {
            super(0);
            this.f34230a = str;
            this.f34231b = qxVar;
            this.f34232c = owVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(@NotNull String title, @NotNull String text) {
            this(title, new qx(text, 0, null, 0, 14));
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
        }
    }

    public static final class h extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34244a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f34245b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34246c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f34247b;

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a[] f34248c;

            static {
                a aVar = new a();
                f34247b = aVar;
                a[] aVarArr = {aVar};
                f34248c = aVarArr;
                AbstractC1372b.a(aVarArr);
            }

            private a() {
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f34248c.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z4) {
            super(0);
            a switchType = a.f34247b;
            Intrinsics.checkNotNullParameter("Debug Error Indicator", b9.h.f15450K0);
            Intrinsics.checkNotNullParameter(switchType, "switchType");
            this.f34244a = "Debug Error Indicator";
            this.f34245b = switchType;
            this.f34246c = z4;
        }

        public final boolean a() {
            return this.f34246c;
        }

        @NotNull
        public final a b() {
            return this.f34245b;
        }

        @NotNull
        public final String c() {
            return this.f34244a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f34244a, hVar.f34244a) && this.f34245b == hVar.f34245b && this.f34246c == hVar.f34246c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f34246c) + ((this.f34245b.hashCode() + (this.f34244a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Switch(text=" + this.f34244a + ", switchType=" + this.f34245b + ", initialState=" + this.f34246c + ")";
        }

        @Override // com.yandex.mobile.ads.impl.wx
        public final boolean a(@Nullable Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f34244a, hVar.f34244a) && this.f34245b == hVar.f34245b;
        }
    }

    private wx() {
    }

    public boolean a(@Nullable Object obj) {
        return equals(obj);
    }

    public /* synthetic */ wx(int i4) {
        this();
    }

    public static final class g extends wx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34233a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f34234b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final qx f34235c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ow f34236d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private final String f34237e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private final String f34238f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private final String f34239g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private final List<ex> f34240h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private final List<zx> f34241i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final hw f34242j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        private final String f34243k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull String name, @Nullable String str, @Nullable qx qxVar, @NotNull ow infoSecond, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<ex> list, @Nullable List<zx> list2, @NotNull hw type, @Nullable String str5) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(infoSecond, "infoSecond");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f34233a = name;
            this.f34234b = str;
            this.f34235c = qxVar;
            this.f34236d = infoSecond;
            this.f34237e = str2;
            this.f34238f = str3;
            this.f34239g = str4;
            this.f34240h = list;
            this.f34241i = list2;
            this.f34242j = type;
            this.f34243k = str5;
        }

        @Nullable
        public final String a() {
            return this.f34238f;
        }

        @Nullable
        public final List<zx> b() {
            return this.f34241i;
        }

        @Nullable
        public final qx c() {
            return this.f34235c;
        }

        @NotNull
        public final ow d() {
            return this.f34236d;
        }

        @Nullable
        public final String e() {
            return this.f34234b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f34233a, gVar.f34233a) && Intrinsics.areEqual(this.f34234b, gVar.f34234b) && Intrinsics.areEqual(this.f34235c, gVar.f34235c) && Intrinsics.areEqual(this.f34236d, gVar.f34236d) && Intrinsics.areEqual(this.f34237e, gVar.f34237e) && Intrinsics.areEqual(this.f34238f, gVar.f34238f) && Intrinsics.areEqual(this.f34239g, gVar.f34239g) && Intrinsics.areEqual(this.f34240h, gVar.f34240h) && Intrinsics.areEqual(this.f34241i, gVar.f34241i) && this.f34242j == gVar.f34242j && Intrinsics.areEqual(this.f34243k, gVar.f34243k);
        }

        @NotNull
        public final String f() {
            return this.f34233a;
        }

        @Nullable
        public final String g() {
            return this.f34239g;
        }

        @Nullable
        public final List<ex> h() {
            return this.f34240h;
        }

        public final int hashCode() {
            int hashCode = this.f34233a.hashCode() * 31;
            String str = this.f34234b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            qx qxVar = this.f34235c;
            int hashCode3 = (this.f34236d.hashCode() + ((hashCode2 + (qxVar == null ? 0 : qxVar.hashCode())) * 31)) * 31;
            String str2 = this.f34237e;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f34238f;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f34239g;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<ex> list = this.f34240h;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<zx> list2 = this.f34241i;
            int hashCode8 = (this.f34242j.hashCode() + ((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
            String str5 = this.f34243k;
            return hashCode8 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public final hw i() {
            return this.f34242j;
        }

        @Nullable
        public final String j() {
            return this.f34237e;
        }

        @NotNull
        public final String toString() {
            return "MediationAdapter(name=" + this.f34233a + ", logoUrl=" + this.f34234b + ", infoFirst=" + this.f34235c + ", infoSecond=" + this.f34236d + ", waringMessage=" + this.f34237e + ", adUnitId=" + this.f34238f + ", networkAdUnitIdName=" + this.f34239g + ", parameters=" + this.f34240h + ", cpmFloors=" + this.f34241i + ", type=" + this.f34242j + ", sdk=" + this.f34243k + ")";
        }

        public /* synthetic */ g(String str, String str2, qx qxVar, ow owVar, String str3, String str4, String str5, List list, List list2, hw hwVar, String str6, int i4) {
            this(str, str2, qxVar, owVar, str3, (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? null : str5, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : list2, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hw.f26962e : hwVar, (i4 & 1024) != 0 ? null : str6);
        }
    }
}

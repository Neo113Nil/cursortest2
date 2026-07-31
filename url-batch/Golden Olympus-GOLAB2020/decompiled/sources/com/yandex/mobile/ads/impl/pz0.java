package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.yandex.mobile.ads.impl.cz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dz0 f30619a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f30620a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final EnumC0199a f30621b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.yandex.mobile.ads.impl.pz0$a$a, reason: collision with other inner class name */
        public static final class EnumC0199a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0199a f30622b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0199a f30623c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0199a[] f30624d;

            static {
                EnumC0199a enumC0199a = new EnumC0199a(0, "INFO");
                f30622b = enumC0199a;
                EnumC0199a enumC0199a2 = new EnumC0199a(1, "ERROR");
                f30623c = enumC0199a2;
                EnumC0199a[] enumC0199aArr = {enumC0199a, enumC0199a2};
                f30624d = enumC0199aArr;
                AbstractC1372b.a(enumC0199aArr);
            }

            private EnumC0199a(int i4, String str) {
            }

            public static EnumC0199a valueOf(String str) {
                return (EnumC0199a) Enum.valueOf(EnumC0199a.class, str);
            }

            public static EnumC0199a[] values() {
                return (EnumC0199a[]) f30624d.clone();
            }
        }

        public a(@NotNull String message, @NotNull EnumC0199a type) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f30620a = message;
            this.f30621b = type;
        }

        @NotNull
        public final String a() {
            return this.f30620a;
        }

        @NotNull
        public final EnumC0199a b() {
            return this.f30621b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f30620a, aVar.f30620a) && this.f30621b == aVar.f30621b;
        }

        public final int hashCode() {
            return this.f30621b.hashCode() + (this.f30620a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "MediationNetworkMessage(message=" + this.f30620a + ", type=" + this.f30621b + ")";
        }
    }

    public pz0(@NotNull dz0 mediationNetworkValidator) {
        Intrinsics.checkNotNullParameter(mediationNetworkValidator, "mediationNetworkValidator");
        this.f30619a = mediationNetworkValidator;
    }

    private static void a(ArrayList arrayList, String str) {
        int max = Math.max(4, 44 - str.length());
        int i4 = max / 2;
        String C4 = StringsKt.C("-", i4);
        String C5 = StringsKt.C("-", (max % 2) + i4);
        String C6 = StringsKt.C(" ", 1);
        arrayList.add(new a(C4 + C6 + str + C6 + C5, a.EnumC0199a.f30622b));
    }

    private static void a(ArrayList arrayList, List list, String str, boolean z4) {
        a.EnumC0199a enumC0199a;
        String str2;
        String str3;
        if (z4) {
            enumC0199a = a.EnumC0199a.f30622b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            enumC0199a = a.EnumC0199a.f30623c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((cz0.c) it.next()).a());
        }
        arrayList.add(new a(CollectionsKt.joinToString$default(arrayList2, null, str2 + ": ", null, 0, null, null, 61, null), enumC0199a));
        arrayList.add(new a(str + ": " + str3, enumC0199a));
    }

    private static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !StringsKt.z(str)) {
            arrayList.add(new a("SDK Version: " + str, a.EnumC0199a.f30622b));
        }
        if (str2 == null || StringsKt.z(str2)) {
            return;
        }
        arrayList.add(new a("ADAPTERS Version: " + str2, a.EnumC0199a.f30622b));
    }

    @NotNull
    public final ArrayList a(@NotNull ArrayList networks) {
        Intrinsics.checkNotNullParameter(networks, "networks");
        ArrayList arrayList = new ArrayList();
        int size = networks.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = networks.get(i4);
            i4++;
            cz0 cz0Var = (cz0) obj;
            a(arrayList, cz0Var.d());
            String e4 = cz0Var.e();
            String b4 = ((cz0.c) CollectionsKt.first((List) cz0Var.b())).b();
            this.f30619a.getClass();
            boolean a4 = dz0.a(cz0Var);
            if (a4) {
                a(arrayList, e4, b4);
            }
            a(arrayList, cz0Var.b(), cz0Var.d(), a4);
        }
        return arrayList;
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h40 {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f26546a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ts.a f26547b;

        /* renamed from: c, reason: collision with root package name */
        private final long f26548c;

        public a(@NotNull String adBreakType, @NotNull ts.a adBreakPositionType, long j4) {
            Intrinsics.checkNotNullParameter(adBreakType, "adBreakType");
            Intrinsics.checkNotNullParameter(adBreakPositionType, "adBreakPositionType");
            this.f26546a = adBreakType;
            this.f26547b = adBreakPositionType;
            this.f26548c = j4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f26546a, aVar.f26546a) && this.f26547b == aVar.f26547b && this.f26548c == aVar.f26548c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26548c) + ((this.f26547b.hashCode() + (this.f26546a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "AdBreakSignature(adBreakType=" + this.f26546a + ", adBreakPositionType=" + this.f26547b + ", adBreakPositionValue=" + this.f26548c + ")";
        }
    }

    @NotNull
    public static ArrayList a(@NotNull ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int size = adBreaks.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = adBreaks.get(i4);
            i4++;
            ss ssVar = (ss) obj;
            if (hashSet.add(new a(ssVar.e(), ssVar.b().a(), ssVar.b().b()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

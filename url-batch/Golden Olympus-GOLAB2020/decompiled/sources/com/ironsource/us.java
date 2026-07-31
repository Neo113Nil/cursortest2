package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum us {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f19954b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f19959a;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final us a(int i4) {
            us usVar;
            us[] values = us.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    usVar = null;
                    break;
                }
                usVar = values[i5];
                if (usVar.f19959a == i4) {
                    break;
                }
                i5++;
            }
            return usVar == null ? us.CurrentlyLoadedAds : usVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    us(int i4) {
        this.f19959a = i4;
    }

    public final int b() {
        return this.f19959a;
    }
}

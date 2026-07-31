package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum xi {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20316b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f20321a;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final xi a(int i4) {
            xi xiVar;
            xi[] values = xi.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    xiVar = null;
                    break;
                }
                xiVar = values[i5];
                if (xiVar.f20321a == i4) {
                    break;
                }
                i5++;
            }
            return xiVar == null ? xi.NotSupported : xiVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    xi(int i4) {
        this.f20321a = i4;
    }

    public final int b() {
        return this.f20321a;
    }

    public final boolean b(@NotNull xi instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.f20321a;
    }
}

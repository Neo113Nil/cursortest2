package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class aa implements nf {

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15028a;

        static {
            int[] iArr = new int[w9.values().length];
            try {
                iArr[w9.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w9.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w9.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w9.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15028a = iArr;
        }
    }

    @Override // com.ironsource.nf
    @Nullable
    public ca a(@NotNull Context context, @NotNull w9 source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i4 = a.f15028a[source.ordinal()];
        if (i4 == 1) {
            return new z9(context, ba.f15590b);
        }
        if (i4 == 2) {
            return new z9(context, ba.f15589a);
        }
        if (i4 == 3) {
            return new z9(context, ba.f15591c);
        }
        if (i4 == 4) {
            return null;
        }
        throw new W1.m();
    }
}

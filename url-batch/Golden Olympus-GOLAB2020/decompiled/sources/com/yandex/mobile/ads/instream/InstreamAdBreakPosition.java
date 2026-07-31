package com.yandex.mobile.ads.instream;

import b2.AbstractC1372b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class InstreamAdBreakPosition {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f35839a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35840b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    public static final class Type {
        public static final Type MILLISECONDS;
        public static final Type PERCENTS;
        public static final Type POSITION;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Type[] f35841b;

        static {
            Type type = new Type(0, "PERCENTS");
            PERCENTS = type;
            Type type2 = new Type(1, "MILLISECONDS");
            MILLISECONDS = type2;
            Type type3 = new Type(2, "POSITION");
            POSITION = type3;
            Type[] typeArr = {type, type2, type3};
            f35841b = typeArr;
            AbstractC1372b.a(typeArr);
        }

        private Type(int i4, String str) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f35841b.clone();
        }
    }

    public InstreamAdBreakPosition(@NotNull Type positionType, long j4) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        this.f35839a = positionType;
        this.f35840b = j4;
    }

    @NotNull
    public final Type getPositionType() {
        return this.f35839a;
    }

    public final long getValue() {
        return this.f35840b;
    }
}

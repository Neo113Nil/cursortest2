package com.ironsource;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface td {

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f19740a;

        public a(@NotNull c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.f19740a = strategyType;
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                cVar = aVar.f19740a;
            }
            return aVar.a(cVar);
        }

        @NotNull
        public final c b() {
            return this.f19740a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f19740a == ((a) obj).f19740a;
        }

        public int hashCode() {
            return this.f19740a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(strategyType=" + this.f19740a + ')';
        }

        @NotNull
        public final a a(@NotNull c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        @NotNull
        public final c a() {
            return this.f19740a;
        }
    }

    @Metadata
    public static final class b {

        @Metadata
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19741a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.MANUAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f19741a = iArr;
            }
        }

        @NotNull
        public final td a(@NotNull C1525o1 adTools, @NotNull a config, @NotNull qd fullscreenAdUnitFactory, @NotNull sd fullscreenAdUnitListener, @NotNull ud listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i4 = a.f19741a[config.b().ordinal()];
            if (i4 == 1) {
                return new ce(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i4 == 2) {
                return new vd(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new W1.m();
        }
    }

    @Metadata
    public enum c {
        MANUAL("Manual"),
        PROGRESSIVE_ON_SHOW("ProgressiveOnShow");


        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f19745a;

        c(String str) {
            this.f19745a = str;
        }

        @NotNull
        public final String b() {
            return this.f19745a;
        }
    }

    void a(@NotNull Activity activity);

    void loadAd();
}

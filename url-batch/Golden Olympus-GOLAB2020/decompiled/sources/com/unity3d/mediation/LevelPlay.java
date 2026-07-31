package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.vl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlay {

    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    @Metadata
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f21939a;

        AdFormat(String str) {
            this.f21939a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f21939a;
        }
    }

    private LevelPlay() {
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest initRequest, @NotNull LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        vl.f20083a.a(context, initRequest, listener);
    }
}

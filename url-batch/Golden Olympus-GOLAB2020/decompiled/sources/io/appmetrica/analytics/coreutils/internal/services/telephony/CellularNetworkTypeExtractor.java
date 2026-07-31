package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class CellularNetworkTypeExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* renamed from: a, reason: collision with root package name */
    private final Context f37068a;

    /* renamed from: b, reason: collision with root package name */
    private final FunctionWithThrowable f37069b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @DoNotInline
    @Metadata
    @TargetApi(24)
    public static final class a implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(@NotNull TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getDataNetworkType());
        }
    }

    @DoNotInline
    @Metadata
    public static final class b implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(@NotNull TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(@NotNull Context context) {
        this.f37068a = context;
        this.f37069b = AndroidUtils.isApiAchieved(24) ? new a() : new b();
    }

    @NotNull
    public final Context getContext() {
        return this.f37068a;
    }

    @NotNull
    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f37068a, "phone", "Extracting cellular networkType", "TelephonyManager", this.f37069b));
    }
}

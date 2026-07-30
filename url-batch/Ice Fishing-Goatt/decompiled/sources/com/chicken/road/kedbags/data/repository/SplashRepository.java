package com.chicken.road.kedbags.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import com.chicken.road.kedbags.data.device.FrostSignals;
import com.chicken.road.kedbags.data.model.FrostCatchSnapshot;
import com.chicken.road.kedbags.data.remote.FrostCatchConfig;
import com.chicken.road.kedbags.data.remote.FrostCatchDto;
import com.chicken.road.kedbags.data.remote.FrostCatchSocketClient;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\f\u0010\u0011\u001a\u00020\f*\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/chicken/road/kedbags/data/repository/SplashRepository;", "", "context", "Landroid/content/Context;", "socketClient", "Lcom/chicken/road/kedbags/data/remote/FrostCatchSocketClient;", "<init>", "(Landroid/content/Context;Lcom/chicken/road/kedbags/data/remote/FrostCatchSocketClient;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "readCachedSnapshot", "Lcom/chicken/road/kedbags/data/model/FrostCatchSnapshot;", "fetchSnapshot", "signals", "Lcom/chicken/road/kedbags/data/device/FrostSignals;", "(Lcom/chicken/road/kedbags/data/device/FrostSignals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSnapshot", "Lcom/chicken/road/kedbags/data/remote/FrostCatchDto;", "persist", "", "snapshot", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SplashRepository {

    @Deprecated
    public static final String KEY_BITE_ACTIVE = "bite_active";

    @Deprecated
    public static final String KEY_CATCH_COUNT = "catch_count";

    @Deprecated
    public static final String KEY_ENDPOINT = "endpoint_url";

    @Deprecated
    public static final String KEY_HAS_CACHE = "has_cache";

    @Deprecated
    public static final String KEY_ICE_DEPTH = "ice_depth_bits";

    @Deprecated
    public static final String KEY_LAKE_MOOD = "lake_mood";

    @Deprecated
    public static final String KEY_LURE_STYLE = "lure_style";

    @Deprecated
    public static final String KEY_WIND_LEVEL = "wind_level";
    private final SharedPreferences prefs;
    private final FrostCatchSocketClient socketClient;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public SplashRepository(Context context, FrostCatchSocketClient socketClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(socketClient, "socketClient");
        this.socketClient = socketClient;
        this.prefs = context.getSharedPreferences("frost_catch_state", 0);
    }

    public final FrostCatchSnapshot readCachedSnapshot() {
        String string;
        if (!this.prefs.getBoolean(KEY_HAS_CACHE, false) || (string = this.prefs.getString(KEY_ENDPOINT, null)) == null) {
            return null;
        }
        int i = this.prefs.getInt(KEY_CATCH_COUNT, 0);
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        double longBitsToDouble = Double.longBitsToDouble(this.prefs.getLong(KEY_ICE_DEPTH, 0L));
        boolean z = this.prefs.getBoolean(KEY_BITE_ACTIVE, false);
        String string2 = this.prefs.getString(KEY_LURE_STYLE, "");
        String str = string2 == null ? "" : string2;
        int i2 = this.prefs.getInt(KEY_WIND_LEVEL, 0);
        String string3 = this.prefs.getString(KEY_LAKE_MOOD, "");
        return new FrostCatchSnapshot(i, longBitsToDouble, z, str, i2, string3 == null ? "" : string3, string);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSnapshot(FrostSignals frostSignals, Continuation<? super FrostCatchSnapshot> continuation) {
        SplashRepository$fetchSnapshot$1 splashRepository$fetchSnapshot$1;
        int i;
        if (continuation instanceof SplashRepository$fetchSnapshot$1) {
            splashRepository$fetchSnapshot$1 = (SplashRepository$fetchSnapshot$1) continuation;
            if ((splashRepository$fetchSnapshot$1.label & Integer.MIN_VALUE) != 0) {
                splashRepository$fetchSnapshot$1.label -= Integer.MIN_VALUE;
                Object obj = splashRepository$fetchSnapshot$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = splashRepository$fetchSnapshot$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    FrostCatchSocketClient frostCatchSocketClient = this.socketClient;
                    LinkedHashMap<String, String> frame = frostSignals.toFrame();
                    splashRepository$fetchSnapshot$1.L$0 = SpillingKt.nullOutSpilledVariable(frostSignals);
                    splashRepository$fetchSnapshot$1.label = 1;
                    obj = frostCatchSocketClient.fetch(frame, splashRepository$fetchSnapshot$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FrostCatchSnapshot snapshot = toSnapshot((FrostCatchDto) obj);
                persist(snapshot);
                return snapshot;
            }
        }
        splashRepository$fetchSnapshot$1 = new SplashRepository$fetchSnapshot$1(this, continuation);
        Object obj2 = splashRepository$fetchSnapshot$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = splashRepository$fetchSnapshot$1.label;
        if (i != 0) {
        }
        FrostCatchSnapshot snapshot2 = toSnapshot((FrostCatchDto) obj2);
        persist(snapshot2);
        return snapshot2;
    }

    private final FrostCatchSnapshot toSnapshot(FrostCatchDto frostCatchDto) {
        return new FrostCatchSnapshot(frostCatchDto.getCatchCount(), frostCatchDto.getIceDepth(), frostCatchDto.getBiteActive(), frostCatchDto.getLureStyle(), frostCatchDto.getWindLevel(), frostCatchDto.getLakeMood(), FrostCatchConfig.INSTANCE.getENDPOINT_URL());
    }

    private final void persist(FrostCatchSnapshot snapshot) {
        this.prefs.edit().putBoolean(KEY_HAS_CACHE, true).putString(KEY_ENDPOINT, snapshot.getEndpointUrl()).putInt(KEY_CATCH_COUNT, snapshot.getCatchCount()).putLong(KEY_ICE_DEPTH, Double.doubleToRawLongBits(snapshot.getIceDepth())).putBoolean(KEY_BITE_ACTIVE, snapshot.getBiteActive()).putString(KEY_LURE_STYLE, snapshot.getLureStyle()).putInt(KEY_WIND_LEVEL, snapshot.getWindLevel()).putString(KEY_LAKE_MOOD, snapshot.getLakeMood()).apply();
    }

    /* compiled from: SplashRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/chicken/road/kedbags/data/repository/SplashRepository$Companion;", "", "<init>", "()V", "KEY_HAS_CACHE", "", "KEY_ENDPOINT", "KEY_CATCH_COUNT", "KEY_ICE_DEPTH", "KEY_BITE_ACTIVE", "KEY_LURE_STYLE", "KEY_WIND_LEVEL", "KEY_LAKE_MOOD", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

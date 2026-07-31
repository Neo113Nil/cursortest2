package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionReplacementModeAndroidExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toReplacementModeConstant", "", "Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionReplacementModeAndroidExtKt {

    /* compiled from: SubscriptionReplacementModeAndroidExt.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionReplacementModeAndroid.values().length];
            try {
                iArr[SubscriptionReplacementModeAndroid.UnknownReplacementMode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.WithTimeProration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.ChargeProratedPrice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.WithoutProration.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.ChargeFullPrice.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.Deferred.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.KeepExisting.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toReplacementModeConstant(SubscriptionReplacementModeAndroid subscriptionReplacementModeAndroid) {
        Intrinsics.checkNotNullParameter(subscriptionReplacementModeAndroid, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[subscriptionReplacementModeAndroid.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

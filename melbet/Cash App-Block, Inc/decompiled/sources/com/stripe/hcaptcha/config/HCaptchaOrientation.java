package com.stripe.hcaptcha.config;

import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes8.dex */
public final class HCaptchaOrientation {
    public static final /* synthetic */ HCaptchaOrientation[] $VALUES;
    public static final Lazy $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final HCaptchaOrientation PORTRAIT;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/hcaptcha/config/HCaptchaOrientation$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) HCaptchaOrientation.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        HCaptchaOrientation hCaptchaOrientation = new HCaptchaOrientation("PORTRAIT", 0);
        PORTRAIT = hCaptchaOrientation;
        $VALUES = new HCaptchaOrientation[]{hCaptchaOrientation, new HCaptchaOrientation("LANDSCAPE", 1)};
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ShimmerThemeKt$$ExternalSyntheticLambda0(1));
    }

    public static HCaptchaOrientation valueOf(String str) {
        return (HCaptchaOrientation) Enum.valueOf(HCaptchaOrientation.class, str);
    }

    public static HCaptchaOrientation[] values() {
        return (HCaptchaOrientation[]) $VALUES.clone();
    }
}

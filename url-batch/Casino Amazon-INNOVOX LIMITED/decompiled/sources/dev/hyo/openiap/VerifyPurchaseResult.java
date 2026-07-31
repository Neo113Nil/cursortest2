package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0016\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H&\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResult;", "", "toJson", "", "", "Companion", "Ldev/hyo/openiap/VerifyPurchaseResultAndroid;", "Ldev/hyo/openiap/VerifyPurchaseResultHorizon;", "Ldev/hyo/openiap/VerifyPurchaseResultIOS;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface VerifyPurchaseResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Map<String, Object> toJson();

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseResult$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseResult;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final VerifyPurchaseResult fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String str = (String) json.get("__typename");
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1268586460) {
                    if (hashCode != 1060708118) {
                        if (hashCode == 1067521272 && str.equals("VerifyPurchaseResultAndroid")) {
                            return VerifyPurchaseResultAndroid.INSTANCE.fromJson(json);
                        }
                    } else if (str.equals("VerifyPurchaseResultIOS")) {
                        return VerifyPurchaseResultIOS.INSTANCE.fromJson(json);
                    }
                } else if (str.equals("VerifyPurchaseResultHorizon")) {
                    return VerifyPurchaseResultHorizon.INSTANCE.fromJson(json);
                }
            }
            throw new IllegalArgumentException("Unknown __typename for VerifyPurchaseResult: " + json.get("__typename"));
        }
    }
}

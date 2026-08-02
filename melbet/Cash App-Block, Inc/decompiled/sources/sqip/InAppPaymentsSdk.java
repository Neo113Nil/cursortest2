package sqip;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import sqip.internal.SquareApplicationId;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R1\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f*\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lsqip/InAppPaymentsSdk;", "", "()V", "<set-?>", "", "squareApplicationId", "getSquareApplicationId$annotations", "getSquareApplicationId$delegate", "()Ljava/lang/Object;", "getSquareApplicationId", "()Ljava/lang/String;", "setSquareApplicationId", "(Ljava/lang/String;)V", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InAppPaymentsSdk {
    public static final InAppPaymentsSdk INSTANCE = new InAppPaymentsSdk();
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.mutableProperty0(new MutablePropertyReference0Impl(INSTANCE, InAppPaymentsSdk.class, "squareApplicationId", "getSquareApplicationId()Ljava/lang/String;", 0))};

    static {
        SquareApplicationId squareApplicationId = SquareApplicationId.INSTANCE;
    }

    private InAppPaymentsSdk() {
    }

    public static final String getSquareApplicationId() {
        return SquareApplicationId.INSTANCE.getValue(INSTANCE, $$delegatedProperties[0]);
    }

    public static /* synthetic */ void getSquareApplicationId$annotations() {
    }

    public static final void setSquareApplicationId(String str) {
        str.getClass();
        SquareApplicationId.INSTANCE.setValue(INSTANCE, $$delegatedProperties[0], str);
    }
}

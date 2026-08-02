package squareup.cash.earnings;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes10.dex */
public enum EarningsAppletState implements WireEnum {
    EARNINGS_APPLET_STATE_UNSPECIFIED(0),
    EARNINGS_APPLET_STATE_NULL(1),
    EARNINGS_APPLET_STATE_ACTIVE(2),
    EARNINGS_APPLET_STATE_HIDDEN(3);

    public static final EarningsAppletState$Companion$ADAPTER$1 ADAPTER;
    public static final y0 Companion;
    public final int value;

    static {
        EarningsAppletState earningsAppletState = EARNINGS_APPLET_STATE_UNSPECIFIED;
        Companion = new y0();
        ADAPTER = new EarningsAppletState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EarningsAppletState.class), Syntax.PROTO_2, earningsAppletState);
    }

    EarningsAppletState(int i) {
        this.value = i;
    }

    public static final EarningsAppletState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return EARNINGS_APPLET_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARNINGS_APPLET_STATE_NULL;
        }
        if (i == 2) {
            return EARNINGS_APPLET_STATE_ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return EARNINGS_APPLET_STATE_HIDDEN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

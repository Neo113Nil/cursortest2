package squareup.cash.cryptocurrency;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes10.dex */
public enum WithdrawalSpeed implements WireEnum {
    INVALID_SPEED(0),
    RUSH(1),
    PRIORITY(2),
    STANDARD(3);

    public static final WithdrawalSpeed$Companion$ADAPTER$1 ADAPTER;
    public static final Plane Companion;
    public final int value;

    static {
        WithdrawalSpeed withdrawalSpeed = INVALID_SPEED;
        Companion = new Plane(25);
        ADAPTER = new WithdrawalSpeed$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(WithdrawalSpeed.class), Syntax.PROTO_2, withdrawalSpeed);
    }

    WithdrawalSpeed(int i) {
        this.value = i;
    }

    public static final WithdrawalSpeed fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return INVALID_SPEED;
        }
        if (i == 1) {
            return RUSH;
        }
        if (i == 2) {
            return PRIORITY;
        }
        if (i != 3) {
            return null;
        }
        return STANDARD;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

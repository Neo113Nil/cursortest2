package squareup.cash.savings.action;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public enum Icon implements WireEnum {
    CHEVRON(1),
    INFORMATION(2),
    FDIC_INSURED(3),
    ROUND_UP(4),
    SAVINGS_GROWTH(5);

    public final int value;
    public static final Plane Companion = new Plane(29);
    public static final Icon$Companion$ADAPTER$1 ADAPTER = new Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

    Icon(int i) {
        this.value = i;
    }

    public static final Icon fromValue(int i) {
        Companion.getClass();
        return Plane.m4216fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

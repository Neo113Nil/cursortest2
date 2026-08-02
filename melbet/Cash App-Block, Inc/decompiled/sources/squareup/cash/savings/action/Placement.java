package squareup.cash.savings.action;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes10.dex */
public enum Placement implements WireEnum {
    LEADING(1),
    TRAILING(2);

    public final int value;
    public static final LinkResolverDef Companion = new LinkResolverDef(29);
    public static final Placement$Companion$ADAPTER$1 ADAPTER = new Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

    Placement(int i) {
        this.value = i;
    }

    public static final Placement fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return LEADING;
        }
        if (i != 2) {
            return null;
        }
        return TRAILING;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

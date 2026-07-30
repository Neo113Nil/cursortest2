package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z61 {
    public final Function0 a;
    public final Function0 b;

    public z61(Function0 function0, Function0 function02) {
        this.a = function0;
        this.b = function02;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}

package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t81 {
    public final String a;
    public final Function2 b;
    public final boolean c;

    public t81(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ t81(String str) {
        this(str, r81.g);
    }

    public t81(String str, int i) {
        this(str);
        this.c = true;
    }

    public t81(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}

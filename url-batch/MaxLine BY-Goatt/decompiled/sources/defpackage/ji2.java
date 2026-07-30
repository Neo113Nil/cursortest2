package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ji2 {
    public final String a;
    public final Function2 b;
    public final boolean c;

    public ji2(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ ji2(String str) {
        this(str, fi2.z);
    }

    public ji2(String str, int i) {
        this(str);
        this.c = true;
    }

    public ji2(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}

package j2;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f5020a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f5021b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5022c;

    public t(String str, Function2 function2) {
        this.f5020a = str;
        this.f5021b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f5020a;
    }

    public /* synthetic */ t(String str) {
        this(str, h.H);
    }

    public t(String str, int i3) {
        this(str);
        this.f5022c = true;
    }

    public t(String str, boolean z10, Function2 function2) {
        this(str, function2);
        this.f5022c = z10;
    }
}

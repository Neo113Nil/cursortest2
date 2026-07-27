package B0;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f897a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f898b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f897a = alignment;
        f898b = alignment2;
    }
}

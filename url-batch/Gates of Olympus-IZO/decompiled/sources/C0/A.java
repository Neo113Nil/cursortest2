package C0;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f422a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f423b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Z1.i.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Z1.i.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f422a = alignment;
        f423b = alignment2;
    }
}

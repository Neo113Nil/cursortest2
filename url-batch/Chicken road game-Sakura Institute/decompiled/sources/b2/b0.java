package b2;

import android.text.Layout;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f1259a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f1260b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (r6.k.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (r6.k.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f1259a = alignment;
        f1260b = alignment2;
    }
}

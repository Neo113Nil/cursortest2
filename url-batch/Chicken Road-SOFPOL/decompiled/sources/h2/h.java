package h2;

import android.text.Layout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f3100a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f3101b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (q6.i.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (q6.i.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f3100a = alignment;
        f3101b = alignment2;
    }
}

package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ie2 {
    public static final Layout.Alignment PxuCJdSBwIXG;
    public static final Layout.Alignment lS5Rgt96tfkO;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (cs0.wdg6QnbFHrFF(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (cs0.wdg6QnbFHrFF(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        PxuCJdSBwIXG = alignment;
        lS5Rgt96tfkO = alignment2;
    }
}

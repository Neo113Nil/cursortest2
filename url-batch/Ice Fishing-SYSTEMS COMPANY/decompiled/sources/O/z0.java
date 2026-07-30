package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class z0 {
    public static int a(int i) {
        int statusBars;
        int i4 = 0;
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((i & i9) != 0) {
                if (i9 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i9 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i9 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i9 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i9 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i9 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i9 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i9 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i4 |= statusBars;
            }
        }
        return i4;
    }
}

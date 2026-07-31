package q3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k1 {
    public static int a(int i) {
        int statusBars;
        int i8 = 0;
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
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
                } else if (i9 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i8 |= statusBars;
            }
        }
        return i8;
    }
}

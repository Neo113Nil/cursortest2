package p000createpolar;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorStateListInflaterTitanTitanium5900 extends Writer {
    public final StringBuilder PolarVoyageStrictModeLegendEpic1532 = new StringBuilder(128);
    public final String PolarVoyageItemDecorationUltraDeltaEpic7485 = "FragmentManager";

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        StringBuilder sb = this.PolarVoyageStrictModeLegendEpic1532;
        if (sb.length() > 0) {
            Log.d(this.PolarVoyageItemDecorationUltraDeltaEpic7485, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                PolarVoyageMotionLayoutTransitionHeroVision4068();
            } else {
                this.PolarVoyageStrictModeLegendEpic1532.append(c);
            }
        }
    }
}

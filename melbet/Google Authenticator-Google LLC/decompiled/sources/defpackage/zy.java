package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.WindowInsets;
import android.widget.TextView;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zy {
    static int a(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }

    public static void b(TextView textView, int i) {
        tw.E(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void c(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            textView.setLineHeight(i, f);
        } else {
            b(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void d(ActionMode.Callback callback) {
        if (callback instanceof abk) {
            throw null;
        }
    }

    public static void e(alj aljVar, ana anaVar) {
        aljVar.a(anaVar.a);
    }

    public static Object f(krx krxVar) {
        Thread.interrupted();
        return ixg.e(kqo.a, new aln(krxVar, (kqj) null, 1));
    }

    public static File g(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    public static auc h(boolean z) {
        aud audVar = new aud();
        return z ? new aue(audVar) : audVar;
    }
}

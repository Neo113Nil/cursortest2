package defpackage;

import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zx {
    public zx() {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
    }

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
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }

    public static void b(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static final String c(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static final Object d(ajp ajpVar, String str, kqj kqjVar) {
        Object a = ajpVar.a(str, new ajt(2), kqjVar);
        return a == kqp.a ? a : kow.a;
    }

    public static final hvi e(Executor executor, kri kriVar) {
        return ow.l(new ati(executor, kriVar, 0));
    }

    public static /* synthetic */ int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static brn g(auc aucVar, axt axtVar) {
        axtVar.getClass();
        return aucVar.d(abf.u(axtVar));
    }
}

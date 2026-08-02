package defpackage;

import android.graphics.Path;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yl {
    public static int a(View view) {
        int importantForAutofill;
        importantForAutofill = view.getImportantForAutofill();
        return importantForAutofill;
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    static int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a.Y(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final void d(View view, aer aerVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, aerVar);
    }

    public static final ago e(agl aglVar) {
        return aglVar instanceof aeh ? ((aeh) aglVar).P() : agm.a;
    }

    public static Path f(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }
}

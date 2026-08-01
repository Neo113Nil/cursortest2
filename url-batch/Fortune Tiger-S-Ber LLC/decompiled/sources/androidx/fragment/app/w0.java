package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w0 {
    public static final void a(View view, int i4) {
        int a4 = q.e.a(i4);
        if (a4 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (k0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (a4 == 1) {
            if (k0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (a4 == 2) {
            if (k0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (a4 != 3) {
            return;
        }
        if (k0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i4) {
        if (i4 == 0) {
            return 2;
        }
        if (i4 == 4) {
            return 4;
        }
        if (i4 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(e("Unknown visibility ", i4));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static ClassCastException d(ArrayList arrayList, int i4) {
        arrayList.get(i4).getClass();
        return new ClassCastException();
    }

    public static String e(String str, int i4) {
        return str + i4;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ void g(int i4) {
        if (i4 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        u2.c.g(nullPointerException, u2.c.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void h(String str, int i4) {
        if (i4 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = u2.c.class.getName();
            int i5 = 0;
            while (!stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            while (stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            u2.c.g(nullPointerException, u2.c.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ String i(int i4) {
        switch (i4) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String k(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}

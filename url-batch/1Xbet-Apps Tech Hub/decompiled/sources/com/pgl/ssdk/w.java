package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;

/* compiled from: VirtualDisplayInfo.java */
/* loaded from: classes3.dex */
public class w {
    private static volatile DisplayManager.DisplayListener a = null;
    private static volatile boolean b = false;
    private static String c;
    private static String d;
    private static String e;
    private static DisplayManager f;

    /* compiled from: VirtualDisplayInfo.java */
    static class a implements DisplayManager.DisplayListener {
        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            w.a(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            w.a(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            w.a(i, 2);
        }
    }

    public static void b(Context context) {
        Q c2;
        if (b) {
            return;
        }
        b = true;
        if (a == null) {
            a = new a();
        }
        if (f == null) {
            f = (DisplayManager) context.getSystemService("display");
        }
        if (f == null || (c2 = M.a().c()) == null) {
            return;
        }
        f.registerDisplayListener(a, c2);
    }

    private static String a(Display display) {
        String name = display.getName();
        Object a2 = J.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object a3 = J.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object a4 = J.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", a3, name, Boolean.valueOf((a2 == null || a4 == null || ((Integer) a2).intValue() != ((Integer) a4).intValue()) ? false : true));
    }

    static void a(int i, int i2) {
        if (i != 0) {
            try {
                Display display = f.getDisplay(i);
                String a2 = display != null ? a(display) : "pd";
                if (i2 == 1) {
                    if (a2.equals(c)) {
                        return;
                    }
                    c = a2;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3 || a2.equals(e)) {
                            return;
                        }
                        e = a2;
                        return;
                    }
                    if (a2.equals(d)) {
                        return;
                    }
                    d = a2;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context) {
        String str;
        Display[] displays;
        if (c != null || d != null || e != null) {
            return true;
        }
        if (context != null) {
            if (f == null) {
                f = (DisplayManager) context.getSystemService("display");
            }
            DisplayManager displayManager = f;
            if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
                str = "";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < displays.length; i++) {
                    Display display = displays[i];
                    if (display != null && display.getDisplayId() != 0) {
                        stringBuffer.append(a(displays[i]));
                        if (i != displays.length - 1) {
                            stringBuffer.append(",");
                        }
                    }
                }
                str = stringBuffer.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }
}

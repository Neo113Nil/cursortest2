package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class qe {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[pe.values().length];
            try {
                iArr[pe.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pe.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pe.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pe.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pe.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pe.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pe.e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pe.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static final String b(Context context, v6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        switch (a.a[a(context, displayMeasurement).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "portrait";
            case 5:
            case 6:
            case 7:
            case 8:
                return "landscape";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean c(Context context, v6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        pe a2 = a(context, displayMeasurement);
        return a2 == pe.b || a2 == pe.d || a2 == pe.f || a2 == pe.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x003d, code lost:
    
        if (r5 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0030, code lost:
    
        if (r6.b() < r6.a()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pe a(Context context, v6 v6Var) {
        boolean z;
        if (context == null) {
            return pe.b;
        }
        try {
            w6 a2 = v6Var.a();
            int a3 = a(context);
            if (a2.b() == a2.a()) {
                z = context.getResources().getConfiguration().orientation != 2;
            }
            if (a3 != 0 && a3 != 2) {
                if (!z) {
                    if (a3 == 0) {
                        return pe.b;
                    }
                    if (a3 == 1) {
                        return pe.h;
                    }
                    if (a3 == 2) {
                        return pe.d;
                    }
                    if (a3 != 3) {
                        return pe.b;
                    }
                    return pe.i;
                }
                if (a3 == 0) {
                    return pe.c;
                }
                if (a3 == 1) {
                    return pe.f;
                }
                if (a3 == 2) {
                    return pe.e;
                }
                if (a3 != 3) {
                    return pe.c;
                }
                return pe.g;
            }
        } catch (Exception e) {
            xb.b("Cannot getOrientation", e);
            return pe.c;
        }
    }

    public static final int a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    public static final void a(Activity activity, sg sgVar, v6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        if (activity == null || a(activity) || sgVar == null) {
            return;
        }
        int i = 1;
        if (sgVar.k() && sgVar.m()) {
            switch (a.a[a(activity, displayMeasurement).ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    i = 9;
                    break;
                case 5:
                case 6:
                    i = 0;
                    break;
                default:
                    i = 8;
                    break;
            }
            activity.setRequestedOrientation(i);
        }
    }

    public static final boolean a(Activity activity) {
        Window window;
        View decorView;
        Drawable background;
        return activity == null || (Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && ((window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (background = decorView.getBackground()) == null || background.getAlpha() != 255));
    }

    public static final void a(Activity activity, sg sgVar) {
        if (activity == null || a(activity) || sgVar == null || !sgVar.k() || !sgVar.m()) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }
}

package com.baidu.ar;

import android.util.Log;

/* loaded from: classes.dex */
public class ib {

    /* renamed from: a, reason: collision with root package name */
    public static int f2477a;

    public static void a() {
        Log.e("ResLoadMachine", "machine：reset");
        a(0);
    }

    public static boolean b() {
        int i8 = f2477a;
        boolean z7 = i8 == 2 || i8 == 0;
        if (z7) {
            Log.e("ResLoadMachine", "machine：!!!!!! can query.");
        }
        return z7;
    }

    public static void a(int i8) {
        String str;
        f2477a = i8;
        if (i8 == 0) {
            str = "machine：init";
        } else if (i8 == 1) {
            str = "machine：query";
        } else if (i8 != 2) {
            return;
        } else {
            str = "machine：engine is load finish!";
        }
        Log.e("ResLoadMachine", str);
    }
}

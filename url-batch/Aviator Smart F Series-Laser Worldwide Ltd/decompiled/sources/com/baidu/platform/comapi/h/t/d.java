package com.baidu.platform.comapi.h.t;

import android.content.Context;
import android.os.Handler;
import java.io.BufferedReader;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f9259a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    private static int f9260b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f9261c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static BufferedReader f9262d = null;

    public static void a(Context context) {
        try {
            f9260b = 0;
            f9261c = 0;
            BufferedReader bufferedReader = f9262d;
            if (bufferedReader != null) {
                bufferedReader.close();
                f9262d = null;
            }
        } catch (Exception unused) {
        }
    }
}

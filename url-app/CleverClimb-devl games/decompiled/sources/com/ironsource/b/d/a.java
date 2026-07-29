package com.ironsource.b.d;

import android.util.Log;
import com.ironsource.b.d.c;

/* compiled from: ConsoleLogger.java */
/* loaded from: classes2.dex */
public class a extends c {
    private a() {
        super("console");
    }

    public a(int i) {
        super("console", i);
    }

    @Override // com.ironsource.b.d.c
    public void a(c.a aVar, String str, int i) {
        switch (i) {
            case 0:
                Log.v("" + aVar, str);
                break;
            case 1:
                Log.i("" + aVar, str);
                break;
            case 2:
                Log.w("" + aVar, str);
                break;
            case 3:
                Log.e("" + aVar, str);
                break;
        }
    }

    @Override // com.ironsource.b.d.c
    public void a(c.a aVar, String str, Throwable th) {
        a(aVar, str + ":stacktrace[" + Log.getStackTraceString(th) + "]", 3);
    }
}

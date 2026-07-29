package com.ironsource.sdk.d;

import android.app.Activity;
import com.ironsource.sdk.g.c;

/* compiled from: BackButtonHandler.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f7140a;

    public static a a() {
        if (f7140a == null) {
            return new a();
        }
        return f7140a;
    }

    public boolean a(Activity activity) {
        switch (c.a().c()) {
            case Controller:
                try {
                    com.ironsource.sdk.controller.c a2 = com.ironsource.sdk.a.a.c(activity).a();
                    if (a2 != null) {
                        a2.c("back");
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
                break;
        }
        return false;
    }
}

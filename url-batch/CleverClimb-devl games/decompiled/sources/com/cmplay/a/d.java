package com.cmplay.a;

import android.support.v4.view.PointerIconCompat;
import com.cmplay.base.util.h;
import com.cmplay.base.util.s;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.util.i;

/* compiled from: rollingsky_games_adtrack.java */
/* loaded from: classes.dex */
public class d extends b {
    public static int a(int i) {
        if (i == 1006) {
            return 4;
        }
        if (i == 2001) {
            return 102;
        }
        if (i == 2005) {
            return 101;
        }
        switch (i) {
            case 1001:
                return 2;
            case 1002:
                return 3;
            case PointerIconCompat.TYPE_HELP /* 1003 */:
                return 5;
            default:
                switch (i) {
                    case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                        return 1;
                    case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                        return 6;
                    default:
                        return 0;
                }
        }
    }

    public d() {
        super("rollingsky_games_adtrack");
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        try {
            a("uptime", System.currentTimeMillis() / 1000);
            a("network", s.a(GameApp.f4485a));
            a("adtype", i);
            a("action", i2);
            a("errorcode", i3);
            a("source", i4);
            a("scenes", i5);
            String b2 = b();
            h.a("reportAd", "tableName:" + a() + "    data:" + b2);
            i.a(a(), b2, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.ijinshan.cloudconfig.d;

import android.util.Log;
import com.google.android.gms.games.GamesStatusCodes;

/* compiled from: CloudLog.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6687a;

    public static void a(String str, String str2) {
        String substring;
        if (f6687a) {
            int i = 0;
            int length = str2.length();
            while (i < length) {
                int i2 = i + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND;
                if (length <= i2) {
                    substring = str2.substring(i);
                } else {
                    substring = str2.substring(i, i2 > length ? length : i2);
                }
                Log.d(str + "___index:" + i, substring.trim());
                i = i2;
            }
        }
    }
}

package com.baidu.platform.comapi.walknavi.k.e;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class a {
    private static Bundle a(Bundle bundle, int i8, int i9) {
        return bundle;
    }

    private static Bundle b(Bundle bundle, int i8, int i9) {
        bundle.putInt("totaldist", i8);
        bundle.putInt("totaltime", i9);
        return bundle;
    }

    public static Bundle a(Bundle bundle, int i8, int i9, int i10) {
        bundle.putInt("updatetype", i8);
        if (i8 == 1) {
            return a(bundle, i9, i10);
        }
        if (i8 == 2) {
            return b(bundle, i9, i10);
        }
        return null;
    }
}

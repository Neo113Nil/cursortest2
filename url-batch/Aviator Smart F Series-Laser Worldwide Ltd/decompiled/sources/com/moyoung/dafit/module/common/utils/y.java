package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes4.dex */
public class y {
    private y() {
    }

    public static void initMindsootheCard(ViewGroup viewGroup) {
        viewGroup.setVisibility((isDaFit(viewGroup.getContext()) && !u.isSimplified() && isGooglePlayServicesAvailable(viewGroup.getContext())) ? 0 : 8);
    }

    private static boolean isDaFit(Context context) {
        return context.getPackageName().equals("com.crrepa.band.dafit");
    }

    private static boolean isGooglePlayServicesAvailable(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static void openMindsootheAppDetailPage(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.moyoung.mindsoothe"));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}

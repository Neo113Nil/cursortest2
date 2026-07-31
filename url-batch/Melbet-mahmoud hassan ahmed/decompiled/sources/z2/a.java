package z2;

import a3.g2;
import a3.r1;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;

/* loaded from: classes.dex */
public final class a {
    public static final boolean a(Context context, Intent intent, y yVar, w wVar, boolean z6) {
        if (z6) {
            return c(context, intent.getData(), yVar, wVar);
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            r1.k(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            y2.t.q();
            g2.q(context, intent);
            if (yVar != null) {
                yVar.e();
            }
            if (wVar != null) {
                wVar.c(true);
            }
            return true;
        } catch (ActivityNotFoundException e7) {
            io0.g(e7.getMessage());
            if (wVar != null) {
                wVar.c(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, f fVar, y yVar, w wVar) {
        String str;
        int i7 = 0;
        if (fVar != null) {
            m10.c(context);
            Intent intent = fVar.f23643m;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(fVar.f23637g)) {
                    str = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(fVar.f23638h)) {
                        intent.setData(Uri.parse(fVar.f23637g));
                    } else {
                        intent.setDataAndType(Uri.parse(fVar.f23637g), fVar.f23638h);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(fVar.f23639i)) {
                        intent.setPackage(fVar.f23639i);
                    }
                    if (!TextUtils.isEmpty(fVar.f23640j)) {
                        String[] split = fVar.f23640j.split("/", 2);
                        if (split.length < 2) {
                            String valueOf = String.valueOf(fVar.f23640j);
                            io0.g(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                            return false;
                        }
                        intent.setClassName(split[0], split[1]);
                    }
                    String str2 = fVar.f23641k;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i7 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            io0.g("Could not parse intent flags.");
                        }
                        intent.addFlags(i7);
                    }
                    if (((Boolean) sw.c().b(m10.f8164b3)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) sw.c().b(m10.f8156a3)).booleanValue()) {
                            y2.t.q();
                            g2.c0(context, intent);
                        }
                    }
                }
            }
            return a(context, intent, yVar, wVar, fVar.f23645o);
        }
        str = "No intent data for launcher overlay.";
        io0.g(str);
        return false;
    }

    private static final boolean c(Context context, Uri uri, y yVar, w wVar) {
        int i7;
        try {
            i7 = y2.t.q().a0(context, uri);
            if (yVar != null) {
                yVar.e();
            }
        } catch (ActivityNotFoundException e7) {
            io0.g(e7.getMessage());
            i7 = 6;
        }
        if (wVar != null) {
            wVar.F(i7);
        }
        return i7 == 5;
    }
}

package g3;

import com.google.android.gms.internal.ads.jr;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16658a;

    /* synthetic */ j0(h0 h0Var, i0 i0Var) {
        String str;
        str = h0Var.f16652a;
        this.f16658a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final jr a() {
        char c7;
        String str = this.f16658a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        return c7 != 0 ? c7 != 1 ? c7 != 2 ? c7 != 3 ? jr.AD_INITIATER_UNSPECIFIED : jr.REWARD_BASED_VIDEO_AD : jr.AD_LOADER : jr.INTERSTITIAL : jr.BANNER;
    }

    public final String b() {
        return this.f16658a.toLowerCase(Locale.ROOT);
    }

    public final Set<String> c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f16658a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}

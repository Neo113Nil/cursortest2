package f;

import a8.m;
import android.content.Context;
import android.content.Intent;
import b6.c;
import com.android.installreferrer.api.InstallReferrerClient;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2892b;

    public /* synthetic */ a(int i7) {
        this.f2892b = i7;
    }

    @Override // a.a
    public final Object C(Intent intent, int i7) {
        switch (this.f2892b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent == null || i7 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z8 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            if (intArrayExtra[i8] == 0) {
                                z8 = true;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z8);
            default:
                return new e.a(intent, i7);
        }
    }

    @Override // a.a
    public final Intent r(Context context, Object obj) {
        switch (this.f2892b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                k.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                return (Intent) obj;
        }
    }

    @Override // a.a
    public c y(Context context, Object obj) {
        switch (this.f2892b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (m.o(context, (String) obj) != 0) {
                    return null;
                }
                return new c(9, Boolean.TRUE);
            default:
                return super.y(context, obj);
        }
    }
}

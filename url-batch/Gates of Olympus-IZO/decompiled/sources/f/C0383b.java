package f;

import I2.d;
import Z1.i;
import android.content.Context;
import android.content.Intent;
import e.C0329a;

/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383b extends AbstractC0382a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4784h;

    public /* synthetic */ C0383b(int i3) {
        this.f4784h = i3;
    }

    @Override // f.AbstractC0382a
    public final Intent h(Context context, Object obj) {
        switch (this.f4784h) {
            case 0:
                i.f(context, "context");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                i.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent intent = (Intent) obj;
                i.f(context, "context");
                return intent;
        }
    }

    @Override // f.AbstractC0382a
    public F0.a q(Context context, Object obj) {
        switch (this.f4784h) {
            case 0:
                i.f(context, "context");
                if (d.s(context, (String) obj) == 0) {
                    return new F0.a(21);
                }
                return null;
            default:
                return super.q(context, obj);
        }
    }

    @Override // f.AbstractC0382a
    public final Object u(Intent intent, int i3) {
        switch (this.f4784h) {
            case 0:
                if (intent == null || i3 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z3 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (intArrayExtra[i4] == 0) {
                                z3 = true;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            default:
                return new C0329a(intent, i3);
        }
    }
}

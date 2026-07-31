package f;

import A1.i;
import O2.d;
import a.AbstractC0235a;
import android.content.Context;
import android.content.Intent;
import e.C0409a;
import f2.j;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5810b;

    public /* synthetic */ C0430a(int i3) {
        this.f5810b = i3;
    }

    @Override // O2.d
    public final Intent J(Context context, Object obj) {
        switch (this.f5810b) {
            case 0:
                j.f(context, "context");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent intent = (Intent) obj;
                j.f(context, "context");
                return intent;
        }
    }

    @Override // O2.d
    public i T(Context context, Object obj) {
        switch (this.f5810b) {
            case 0:
                j.f(context, "context");
                if (AbstractC0235a.o(context, (String) obj) == 0) {
                    return new i(22, false);
                }
                return null;
            default:
                return super.T(context, obj);
        }
    }

    @Override // O2.d
    public final Object b0(Intent intent, int i3) {
        switch (this.f5810b) {
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
                return new C0409a(intent, i3);
        }
    }
}

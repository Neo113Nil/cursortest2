package f;

import a.AbstractC0345a;
import android.content.Context;
import android.content.Intent;
import e.C0550a;
import kotlin.jvm.internal.Intrinsics;
import u3.l;
import w2.C1294c;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569a extends AbstractC0345a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6276i;

    public /* synthetic */ C0569a(int i2) {
        this.f6276i = i2;
    }

    @Override // a.AbstractC0345a
    public final Object B(Intent intent, int i2) {
        switch (this.f6276i) {
            case 0:
                if (intent == null || i2 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z4 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (intArrayExtra[i4] == 0) {
                                z4 = true;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z4);
            default:
                return new C0550a(intent, i2);
        }
    }

    @Override // a.AbstractC0345a
    public final Intent n(Context context, Object obj) {
        switch (this.f6276i) {
            case 0:
                String input = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                String[] input2 = {input};
                Intrinsics.checkNotNullParameter(input2, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent input3 = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input3, "input");
                return input3;
        }
    }

    @Override // a.AbstractC0345a
    public C1294c x(Context context, Object obj) {
        switch (this.f6276i) {
            case 0:
                String input = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (l.S(context, input) == 0) {
                    return new C1294c(Boolean.TRUE);
                }
                return null;
            default:
                return super.x(context, obj);
        }
    }
}

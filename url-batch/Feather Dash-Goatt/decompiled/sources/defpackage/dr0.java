package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dr0 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ kr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr0(kr0 kr0Var, int i) {
        super(0);
        this.d = i;
        this.e = kr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.d;
        kr0 kr0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                kr0Var.a();
                break;
            case 1:
                if (kr0Var.c == null) {
                    m9 m9Var = kr0Var.b;
                    ListIterator listIterator = m9Var.listIterator(m9Var.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((qc) obj).a) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                }
                kr0Var.c = null;
                break;
            default:
                kr0Var.a();
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cr0 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ kr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr0(kr0 kr0Var, int i) {
        super(1);
        this.d = i;
        this.e = kr0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = null;
        kr0 kr0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((nc) obj).getClass();
                m9 m9Var = kr0Var.b;
                ListIterator listIterator = m9Var.listIterator(m9Var.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((qc) previous).a) {
                            obj2 = previous;
                        }
                    }
                }
                kr0Var.c = (qc) obj2;
                break;
            default:
                ((nc) obj).getClass();
                if (kr0Var.c == null) {
                    m9 m9Var2 = kr0Var.b;
                    ListIterator listIterator2 = m9Var2.listIterator(m9Var2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            if (((qc) previous2).a) {
                                obj2 = previous2;
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}

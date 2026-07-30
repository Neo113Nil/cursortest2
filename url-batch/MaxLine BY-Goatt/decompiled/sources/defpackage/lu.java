package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lu extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ y72 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(ar0 ar0Var, uc0 uc0Var, y72 y72Var) {
        super(1);
        this.m = 1;
        this.n = y72Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (((defpackage.kf2) r4).A != false) goto L22;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.m;
        boolean z = false;
        y72 y72Var = this.n;
        switch (i) {
            case 0:
                rz2 rz2Var = (rz2) obj;
                if (!y72Var.m) {
                    rz2Var.getClass();
                    break;
                }
                z = true;
                y72Var.m = z;
                break;
            case 1:
                uc0 uc0Var = (uc0) obj;
                if (!uc0Var.z) {
                    break;
                } else {
                    if (uc0Var.B != null) {
                        h21.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    uc0Var.B = null;
                    y72Var.m = y72Var.m;
                    break;
                }
            default:
                if (!((p22) obj).B) {
                    break;
                } else {
                    y72Var.m = false;
                    break;
                }
        }
        return qz2.m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu(y72 y72Var, int i) {
        super(1);
        this.m = i;
        this.n = y72Var;
    }
}

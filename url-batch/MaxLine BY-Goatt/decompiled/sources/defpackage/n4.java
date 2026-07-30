package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ n4(int i, Function0 function0) {
        this.m = i;
        this.n = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Function0 function0 = this.n;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}

package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fc0 implements Callable {
    public final /* synthetic */ String PxuCJdSBwIXG;
    public final /* synthetic */ ArrayList TSizfFm2Yiuu;
    public final /* synthetic */ Context lS5Rgt96tfkO;

    public fc0(String str, Context context, ArrayList arrayList) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = context;
        this.TSizfFm2Yiuu = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return hc0.PxuCJdSBwIXG(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
        } catch (Throwable unused) {
            return new gc0(-3);
        }
    }
}

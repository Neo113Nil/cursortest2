package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class u01 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Context n;

    public /* synthetic */ u01(Context context, int i) {
        this.m = i;
        this.n = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Context context = this.n;
        switch (i) {
            case 0:
                Bitmap.Config[] configArr = l.a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    lh.g("cacheDir == null");
                    break;
                } else {
                    cacheDir.mkdirs();
                    break;
                }
            default:
                Bitmap.Config[] configArr2 = l.a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    lh.g("cacheDir == null");
                    break;
                } else {
                    cacheDir2.mkdirs();
                    break;
                }
        }
        return null;
    }
}

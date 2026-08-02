package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fya implements fww {
    private final Context a;

    public fya(Context context) {
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.fww
    public final /* bridge */ /* synthetic */ hvi a(jll jllVar, ikm ikmVar) {
        Object obj = ikmVar.b;
        fyg fygVar = (fyg) jllVar;
        String packageName = this.a.getPackageName();
        ((ArrayList) obj).add(packageName);
        int i = ikmVar.a.getInt("key.".concat(String.valueOf(packageName)), -1);
        if (i >= 0) {
            jkj C = fygVar.C();
            C.C(packageName, i);
            fygVar = (fyg) C.q();
        }
        return hnu.aJ(fygVar);
    }
}

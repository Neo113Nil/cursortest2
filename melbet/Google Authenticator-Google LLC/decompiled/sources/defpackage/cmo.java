package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmo extends Exception {
    private final qi a;

    public cmo(qi qiVar) {
        this.a = qiVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        qi qiVar = this.a;
        boolean z = true;
        for (cno cnoVar : qiVar.keySet()) {
            clg clgVar = (clg) qiVar.get(cnoVar);
            oy.at(clgVar);
            z &= !clgVar.c();
            arrayList.add(cnoVar.a() + ": " + clgVar.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}

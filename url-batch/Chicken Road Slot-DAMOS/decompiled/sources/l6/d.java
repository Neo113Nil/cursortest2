package l6;

import a1.n;
import android.content.Context;
import c6.s;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final s f5886a;

    /* renamed from: b, reason: collision with root package name */
    public final n f5887b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5888c;

    public d(Context context, n nVar) {
        s sVar = new s();
        sVar.f1869e = null;
        sVar.f1868d = context;
        this.f5888c = new HashMap();
        this.f5886a = sVar;
        this.f5887b = nVar;
    }

    public final synchronized e a(String str) {
        if (this.f5888c.containsKey(str)) {
            return (e) this.f5888c.get(str);
        }
        CctBackendFactory c10 = this.f5886a.c(str);
        if (c10 == null) {
            return null;
        }
        n nVar = this.f5887b;
        e create = c10.create(new b((Context) nVar.f41i, (c0) nVar.f40e, (c0) nVar.f42r, str));
        this.f5888c.put(str, create);
        return create;
    }
}

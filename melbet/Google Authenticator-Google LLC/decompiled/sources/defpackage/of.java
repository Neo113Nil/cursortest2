package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class of extends oc {
    final /* synthetic */ oh a;
    final /* synthetic */ String b;
    final /* synthetic */ ok c;

    public of(oh ohVar, String str, ok okVar) {
        this.a = ohVar;
        this.b = str;
        this.c = okVar;
    }

    @Override // defpackage.oc
    public final void a() {
        throw null;
    }

    @Override // defpackage.oc
    public final void b(Object obj) {
        oh ohVar = this.a;
        Map map = ohVar.b;
        ok okVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException(a.ac(obj, okVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int intValue = ((Number) obj2).intValue();
        ohVar.c.add(str);
        try {
            ohVar.g(intValue, okVar, obj);
        } catch (Exception e) {
            oh ohVar2 = this.a;
            ohVar2.c.remove(this.b);
            throw e;
        }
    }
}

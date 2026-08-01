package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h2 extends b2 {
    public final /* synthetic */ i2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z1 c;

    public h2(i2 i2Var, String str, z1 z1Var) {
        this.a = i2Var;
        this.b = str;
        this.c = z1Var;
    }

    public final void a(Object obj) {
        i2 i2Var = this.a;
        ArrayList arrayList = i2Var.d;
        LinkedHashMap linkedHashMap = i2Var.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        z1 z1Var = this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + z1Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            i2Var.b(intValue, z1Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public final void b() {
        this.a.e(this.b);
    }
}

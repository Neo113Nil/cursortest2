package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h4 extends b4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ w3 d;

    public /* synthetic */ h4(i4 i4Var, String str, w3 w3Var, int i) {
        this.a = i;
        this.b = i4Var;
        this.c = str;
        this.d = w3Var;
    }

    @Override // defpackage.b4
    public final w3 a() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // defpackage.b4
    public final void b(Object obj) {
        int i = this.a;
        w3 w3Var = this.d;
        String str = this.c;
        i4 i4Var = this.b;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = i4Var.b;
                ArrayList arrayList = i4Var.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    b71.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", w3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    i4Var.b(intValue, w3Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = i4Var.d;
                Object obj3 = i4Var.b.get(str);
                if (obj3 == null) {
                    b71.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", w3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    i4Var.b(intValue2, w3Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    @Override // defpackage.b4
    public final void c() {
        int i = this.a;
        String str = this.c;
        i4 i4Var = this.b;
        switch (i) {
            case 0:
                i4Var.f(str);
                break;
            default:
                i4Var.f(str);
                break;
        }
    }
}

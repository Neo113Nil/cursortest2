package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wk2 {
    public final p50 a;
    public final wk b;
    public final Context c;
    public final String d;
    public final y91 e;
    public final Set f;

    public wk2(Context context, String str, Set set, p50 p50Var, wk wkVar) {
        str.getClass();
        set.getClass();
        k7 k7Var = new k7(19, context, str);
        this.a = p50Var;
        this.b = wkVar;
        this.c = context;
        this.d = str;
        this.e = ya1.b(k7Var);
        this.f = set == yk2.a ? null : zv.P(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r30 r30Var) {
        vk2 vk2Var;
        Object obj2;
        int i;
        if (r30Var instanceof vk2) {
            vk2Var = (vk2) r30Var;
            int i2 = vk2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vk2Var.p = i2 - Integer.MIN_VALUE;
                obj2 = vk2Var.n;
                b50 b50Var = b50.m;
                i = vk2Var.p;
                boolean z = true;
                if (i != 0) {
                    ca2.b(obj2);
                    vk2Var.m = this;
                    vk2Var.p = 1;
                    obj2 = this.a.invoke(obj, vk2Var);
                    if (obj2 == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = vk2Var.m;
                    ca2.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                Set set = this.f;
                y91 y91Var = this.e;
                if (set != null) {
                    Set set2 = set;
                    SharedPreferences sharedPreferences = (SharedPreferences) y91Var.getValue();
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) y91Var.getValue()).getAll();
                all.getClass();
            }
        }
        vk2Var = new vk2(this, r30Var);
        obj2 = vk2Var.n;
        b50 b50Var2 = b50.m;
        i = vk2Var.p;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}

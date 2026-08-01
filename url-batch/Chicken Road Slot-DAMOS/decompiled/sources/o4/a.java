package o4;

import androidx.lifecycle.b0;
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import s.h0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f7469b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final String f7470c;

    /* renamed from: d, reason: collision with root package name */
    public b7.u f7471d;

    public a(l0 l0Var) {
        Object obj;
        l0Var.getClass();
        se seVar = l0Var.f698b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) seVar.f2798d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) seVar.f2801r;
        try {
            je.l0 l0Var2 = (je.l0) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (l0Var2 == null || (obj = l0Var2.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) seVar.f2800i).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.f7469b;
            str2.getClass();
            if (str != null) {
                ArrayList arrayList = j4.a.f5029a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (((Class) obj2).isInstance(str)) {
                        }
                    }
                }
                a1.c(str.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = j4.a.f5029a;
            Object obj3 = l0Var.f697a.get(str2);
            b0 b0Var = obj3 instanceof b0 ? (b0) obj3 : null;
            if (b0Var != null) {
                b0Var.b(str);
            }
            seVar.r(str, str2);
        }
        this.f7470c = str;
    }

    @Override // androidx.lifecycle.u0
    public final void d() {
        b7.u uVar = this.f7471d;
        if (uVar == null) {
            Intrinsics.f("saveableStateHolderRef");
            throw null;
        }
        a1.j jVar = (a1.j) uVar.f1361a.get();
        if (jVar != null) {
            h0 h0Var = jVar.f34b;
            String str = this.f7470c;
            if (h0Var.k(str) == null) {
                jVar.f33a.remove(str);
            }
        }
        b7.u uVar2 = this.f7471d;
        if (uVar2 != null) {
            uVar2.f1361a.clear();
        } else {
            Intrinsics.f("saveableStateHolderRef");
            throw null;
        }
    }
}

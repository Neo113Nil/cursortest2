package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ol extends ok {
    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return kpl.a;
        }
        if (intent == null) {
            return kpl.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return kpl.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        List K = ixc.K(stringArrayExtra);
        Iterator it = K.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(ixc.w(K), ixc.w(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new kol(it.next(), it2.next()));
        }
        return ixd.s(arrayList2);
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ brn c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new brn(kpl.a, (byte[]) null);
        }
        for (String str : strArr) {
            if (aat.c(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ksl.f(ixd.m(strArr.length), 16));
        for (String str2 : strArr) {
            kol kolVar = new kol(str2, true);
            linkedHashMap.put(kolVar.a, kolVar.b);
        }
        return new brn(linkedHashMap, (byte[]) null);
    }
}

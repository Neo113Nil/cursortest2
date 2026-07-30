package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class gc0 implements vd2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gc0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vd2
    public final Bundle a() {
        Pair[] pairArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Map b = ((md2) obj).b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : b.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                return ((as0) obj).S();
            default:
                fy fyVar = (fy) obj;
                for (Map.Entry entry2 : mi1.i((LinkedHashMap) fyVar.q).entrySet()) {
                    fyVar.n(((vo2) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : mi1.i((LinkedHashMap) fyVar.o).entrySet()) {
                    fyVar.n(((vd2) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) fyVar.n;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return iv1.o((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}

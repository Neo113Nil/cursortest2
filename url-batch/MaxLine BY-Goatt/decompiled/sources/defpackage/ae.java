package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ae {
    public static final yd a = new yd(BuildConfig.FLAVOR);

    public static final List a(yd ydVar, int i, int i2, zd zdVar) {
        List list;
        if (i == i2 || (list = ydVar.m) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= ydVar.n.length()) {
            if (zdVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) zdVar.invoke(((xd) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            xd xdVar = (xd) list.get(i3);
            if (zdVar != null ? ((Boolean) zdVar.invoke(xdVar.a)).booleanValue() : true) {
                int i4 = xdVar.b;
                int i5 = xdVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new xd(d.c(xdVar.b, i, i2) - i, d.c(i5, i, i2) - i, (ud) xdVar.a, xdVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}

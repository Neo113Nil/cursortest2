package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class dj2 extends bj2 {
    public static String d(Sequence sequence, String str) {
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.FLAVOR);
        int i = 0;
        for (Object obj : sequence) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            mp2.a(sb, obj, null);
        }
        sb.append((CharSequence) BuildConfig.FLAVOR);
        return sb.toString();
    }

    public static List e(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return ah0.m;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return pv.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

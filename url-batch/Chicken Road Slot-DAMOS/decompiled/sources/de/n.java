package de;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class n extends l {
    public static List d(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return j0.f5574d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return x.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

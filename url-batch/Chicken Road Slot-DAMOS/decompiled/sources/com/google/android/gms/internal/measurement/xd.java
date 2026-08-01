package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class xd {

    /* renamed from: a, reason: collision with root package name */
    public oe f2985a;

    /* renamed from: b, reason: collision with root package name */
    public b8.g f2986b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2987c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f2988d;

    public ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f2987c;
        if (!arrayList2.isEmpty()) {
            int i3 = wd.f2948e;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw v4.a.i(it);
            }
            wd wdVar = !arrayList3.isEmpty() ? new wd(outputStream, arrayList3) : null;
            if (wdVar != null) {
                arrayList.add(wdVar);
            }
        }
        Iterator it2 = this.f2986b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            kotlin.collections.i0.j();
            return null;
        }
        throw null;
    }
}

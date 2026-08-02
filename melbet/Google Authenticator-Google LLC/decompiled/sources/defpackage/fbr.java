package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbr implements far {
    public fem[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.far
    public final /* bridge */ /* synthetic */ Object a(fym fymVar) {
        OutputStream d = fymVar.c.d((Uri) fymVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        ?? r2 = fymVar.f;
        if (!r2.isEmpty()) {
            int i = faq.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                fbv b = ((fbw) it.next()).b();
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            faq faqVar = !arrayList2.isEmpty() ? new faq(d, arrayList2) : null;
            if (faqVar != null) {
                arrayList.add(faqVar);
            }
        }
        for (fbx fbxVar : fymVar.b) {
            arrayList.add(fbxVar.d());
        }
        Collections.reverse(arrayList);
        fem[] femVarArr = this.a;
        if (femVarArr != null) {
            fem femVar = femVarArr[0];
            Closeable closeable = (OutputStream) hnu.V(arrayList);
            if (closeable instanceof fbf) {
                femVar.a = (fbf) closeable;
                femVar.b = (OutputStream) arrayList.get(0);
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}

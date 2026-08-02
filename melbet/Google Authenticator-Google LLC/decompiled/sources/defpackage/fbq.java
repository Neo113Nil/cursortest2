package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbq implements far {
    private final /* synthetic */ int a;

    public fbq(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final InputStream b(fym fymVar) {
        InputStream c = fymVar.c.c((Uri) fymVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        ?? r2 = fymVar.f;
        if (!r2.isEmpty()) {
            int i = fap.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                fbu a = ((fbw) it.next()).a();
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            fap fapVar = !arrayList2.isEmpty() ? new fap(c, arrayList2) : null;
            if (fapVar != null) {
                arrayList.add(fapVar);
            }
        }
        for (fbx fbxVar : fymVar.b) {
            arrayList.add(fbxVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.far
    public final /* synthetic */ Object a(fym fymVar) {
        if (this.a == 0) {
            return b(fymVar);
        }
        fbp fbpVar = new fbp();
        fbpVar.b();
        File a = fbpVar.a(fymVar);
        hqc.a(a);
        return new RandomAccessFile(a, "rw");
    }
}

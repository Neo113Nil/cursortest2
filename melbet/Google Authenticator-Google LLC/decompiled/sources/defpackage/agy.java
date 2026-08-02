package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agy extends ahc implements Runnable {
    public boolean a;
    final /* synthetic */ agz b;

    public agy(agz agzVar) {
        this.b = agzVar;
    }

    @Override // defpackage.ahc
    public final Object a() {
        try {
            agz agzVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] split = exf.d(agzVar.e.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                int indexOf = str.indexOf(32);
                String[] split2 = str.substring(0, indexOf).split(":");
                hoq.K(split2.length == 2 && indexOf > 0, "Invalid license meta-data line:\n%s", str);
                arrayList.add(new exn(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
        } catch (vx e) {
            if (this.f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.ahc
    public final void b(Object obj) {
        agz agzVar = this.b;
        if (agzVar.a != this) {
            agzVar.c(this);
        } else {
            if (agzVar.g) {
                return;
            }
            SystemClock.uptimeMillis();
            agzVar.a = null;
            agzVar.b((List) obj);
        }
    }

    @Override // defpackage.ahc
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}

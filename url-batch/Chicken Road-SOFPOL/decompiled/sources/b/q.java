package b;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1015a;

    public /* synthetic */ q(Object obj) {
        this.f1015a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void a() {
        p6.e eVar = (p6.e) this.f1015a;
        synchronized (w0.m.f7537c) {
            ?? r22 = w0.m.f7542h;
            q6.i.e(r22, "<this>");
            ArrayList arrayList = new ArrayList(d6.n.M(r22, 10));
            boolean z3 = false;
            for (Object obj : r22) {
                boolean z7 = true;
                if (!z3 && q6.i.a(obj, eVar)) {
                    z3 = true;
                    z7 = false;
                }
                if (z7) {
                    arrayList.add(obj);
                }
            }
            w0.m.f7542h = arrayList;
        }
    }

    public boolean b(q3.k kVar, int i, Bundle bundle) {
        q3.c cVar;
        l.u uVar = (l.u) this.f1015a;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i & 1) != 0) {
            try {
                ((s3.g) kVar.f6119e).d();
                Parcelable parcelable = (Parcelable) ((s3.g) kVar.f6119e).b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e8) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e8);
                return false;
            }
        }
        s3.g gVar = (s3.g) kVar.f6119e;
        ClipData clipData = new ClipData(gVar.a(), new ClipData.Item(gVar.c()));
        if (i8 >= 31) {
            cVar = new b1.b(clipData, 2);
        } else {
            q3.d dVar = new q3.d();
            dVar.f6093e = clipData;
            dVar.f6094f = 2;
            cVar = dVar;
        }
        cVar.m(gVar.e());
        cVar.setExtras(bundle);
        return k0.g(uVar, cVar.build()) == null;
    }
}

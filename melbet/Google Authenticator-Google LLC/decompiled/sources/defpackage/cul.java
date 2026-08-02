package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cul implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final /* synthetic */ int d;
    private final kee e;

    public cul(Context context, GoogleHelp googleHelp, kee keeVar, long j, int i) {
        this.d = i;
        this.a = context;
        this.b = googleHelp;
        this.e = keeVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        Bundle bundle = null;
        ArrayList arrayList = null;
        if (this.d != 0) {
            Bundle bundle2 = new Bundle(1);
            try {
                cua cuaVar = new cua();
                cuaVar.c();
                her herVar = ((gns) this.e.a).b;
                ArrayList arrayList2 = new ArrayList(herVar.size());
                hjr it = herVar.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ggc ggcVar = (ggc) entry.getValue();
                    if (ggcVar.b == gga.b) {
                        arrayList2.add(new ctq(ggcVar.a.x(), (String) entry.getKey()));
                    }
                }
                File cacheDir = this.a.getCacheDir();
                if (!arrayList2.isEmpty() && cacheDir != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((ctq) it2.next()).e = cacheDir;
                    }
                }
                bundle2.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(cuaVar.a()));
                arrayList = arrayList2;
            } catch (Exception e) {
                Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
                bundle2.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            }
            cto ctoVar = new cto(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null, null);
            if (arrayList != null) {
                ctoVar.h = arrayList;
            }
            cuu cuuVar = new cuu(this.a);
            GoogleHelp googleHelp = this.b;
            long j = this.c;
            cmv cmvVar = cuuVar.h;
            cup cupVar = new cup(cmvVar, ctoVar, bundle2, j, googleHelp);
            cmvVar.a(cupVar);
            oy.av(cupVar);
            return;
        }
        try {
            cua cuaVar2 = new cua();
            cuaVar2.c();
            her herVar2 = ((gns) this.e.a).b;
            singletonList = new ArrayList(herVar2.size());
            hjr it3 = herVar2.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (((ggc) entry2.getValue()).b == gga.a) {
                    String str = (String) entry2.getKey();
                    jjq jjqVar = ((ggc) entry2.getValue()).a;
                    singletonList.add(new Pair(str, jjqVar.v() ? "" : new String(((jjo) jjqVar).a, StandardCharsets.UTF_8)));
                }
            }
            try {
                singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(cuaVar2.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList3 = new ArrayList(singletonList);
                arrayList3.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(cuaVar2.a())));
                singletonList = arrayList3;
            }
        } catch (Exception e2) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        cuu cuuVar2 = new cuu(this.a);
        GoogleHelp googleHelp2 = this.b;
        if (singletonList != null) {
            int size = singletonList.size();
            bundle = new Bundle(size);
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) singletonList.get(i);
                bundle.putString((String) pair.first, (String) pair.second);
            }
        }
        Bundle bundle3 = bundle;
        long j2 = this.c;
        cmv cmvVar2 = cuuVar2.h;
        cun cunVar = new cun(cmvVar2, bundle3, j2, googleHelp2);
        cmvVar2.a(cunVar);
        oy.av(cunVar);
    }
}

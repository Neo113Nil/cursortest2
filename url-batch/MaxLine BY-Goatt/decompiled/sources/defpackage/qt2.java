package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qt2 implements Iterable {
    public final ArrayList m = new ArrayList();
    public final Context n;

    public qt2(Context context) {
        this.n = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.n;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        try {
            for (Intent z = z71.z(context, componentName); z != null; z = z71.z(context, z.getComponent())) {
                arrayList.add(size, z);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.m;
        if (arrayList.isEmpty()) {
            lh.g("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.n.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
    }
}

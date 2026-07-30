package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ce2 implements Iterable {
    public final Context OPXfSBeufaJ8;
    public final ArrayList rtx2ld2ELZv4 = new ArrayList();

    public ce2(Context context) {
        this.OPXfSBeufaJ8 = context;
    }

    public final void PxuCJdSBwIXG(Intent intent) {
        ComponentName component = intent.getComponent();
        Context context = this.OPXfSBeufaJ8;
        if (component == null) {
            component = intent.resolveActivity(context.getPackageManager());
        }
        ArrayList arrayList = this.rtx2ld2ELZv4;
        if (component != null) {
            int size = arrayList.size();
            try {
                for (Intent VhhvGxCb8gfr = ng0.VhhvGxCb8gfr(context, component); VhhvGxCb8gfr != null; VhhvGxCb8gfr = ng0.VhhvGxCb8gfr(context, VhhvGxCb8gfr.getComponent())) {
                    arrayList.add(size, VhhvGxCb8gfr);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        arrayList.add(intent);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.rtx2ld2ELZv4.iterator();
    }

    public final void lS5Rgt96tfkO() {
        ArrayList arrayList = this.rtx2ld2ELZv4;
        if (arrayList.isEmpty()) {
            u9.rtx2ld2ELZv4("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.OPXfSBeufaJ8.startActivities(intentArr, null);
    }
}

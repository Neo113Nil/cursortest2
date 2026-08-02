package defpackage;

import android.content.pm.PackageManager;
import android.os.Process;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcj {
    public static final int a = Process.myUid();

    public static kck a(PackageManager packageManager, String str, byte[] bArr) {
        return b(packageManager, str, hel.q(bArr));
    }

    public static kck b(PackageManager packageManager, String str, List list) {
        list.getClass();
        hoq.x(!list.isEmpty());
        int i = hel.d;
        heg hegVar = new heg(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            bArr.getClass();
            int length = bArr.length;
            hoq.x(length == 32);
            hegVar.h(Arrays.copyOf(bArr, length));
        }
        return new kch(packageManager, str, hegVar.g());
    }
}

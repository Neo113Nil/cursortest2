package n4;

import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.j;
import com.crrepa.q.b;
import com.crrepa.q.c;
import com.crrepa.w0.d;
import java.io.File;

/* loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static File a() {
        File[] listFiles;
        File file = new File(d.f13973a);
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            String b8 = h0.a.b();
            BleLog.d("md5: " + b8);
            for (File file2 : listFiles) {
                if (file2.isFile() && j.a(b8, file2)) {
                    return file2;
                }
            }
        }
        return null;
    }

    public static boolean b() {
        b a8 = c.c().a();
        return (a8 == null || a8.l() == null) ? false : true;
    }
}

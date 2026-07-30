package c4;

import android.text.TextUtils;
import com.crrepa.ble.trans.upgrade.bean.HSFirmwareInfo;
import com.crrepa.g1.o;
import java.io.File;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f296a = "app";

    /* renamed from: b, reason: collision with root package name */
    private static final String f297b = "cfg";

    /* renamed from: c, reason: collision with root package name */
    private static final String f298c = "patch";

    /* renamed from: d, reason: collision with root package name */
    private static final String f299d = "usr";

    /* renamed from: e, reason: collision with root package name */
    private static final String f300e = "23000";

    private void b(HSFirmwareInfo hSFirmwareInfo, File file, boolean z7, boolean z8) {
        String name = file.getName();
        String path = file.getPath();
        if (name.contains(f296a)) {
            hSFirmwareInfo.setAppFilePath(path);
            return;
        }
        if (z7 && name.contains(f299d)) {
            hSFirmwareInfo.setUserFilePath(path);
            hSFirmwareInfo.setUserStartAddress(f300e);
        } else if (z8 && name.contains(f298c)) {
            hSFirmwareInfo.setPatchFilePath(path);
        }
    }

    public HSFirmwareInfo a(String str, boolean z7, boolean z8) {
        File a8;
        if (TextUtils.isEmpty(str) || (a8 = o.a(new File(str))) == null || !a8.isDirectory()) {
            return null;
        }
        HSFirmwareInfo hSFirmwareInfo = new HSFirmwareInfo();
        a(hSFirmwareInfo, a8, z7, z8);
        return hSFirmwareInfo;
    }

    private void a(HSFirmwareInfo hSFirmwareInfo, File file, boolean z7, boolean z8) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                a(hSFirmwareInfo, file2, z7, z8);
            } else {
                b(hSFirmwareInfo, file2, z7, z8);
            }
        }
    }
}

package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.os.Environment;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: UTDIdTracker.java */
/* loaded from: classes2.dex */
public class q extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9194a = "utdid";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9195b = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f9196c = Pattern.compile("UTDID\">([^<]+)");

    /* renamed from: d, reason: collision with root package name */
    private Context f9197d;

    public q(Context context) {
        super(f9194a);
        this.f9197d = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, this.f9197d);
        } catch (Exception unused) {
            return g();
        }
    }

    private String g() {
        File h = h();
        if (h == null || !h.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(h);
            try {
                return b(HelperUtils.readStreamToString(fileInputStream));
            } finally {
                HelperUtils.safeClose(fileInputStream);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f9196c.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private File h() {
        if (DeviceConfig.checkPermission(this.f9197d, f9195b) && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }
}

package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;

/* compiled from: OldUMIDTracker.java */
/* loaded from: classes2.dex */
public class h extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9174a = "oldumid";

    /* renamed from: b, reason: collision with root package name */
    private Context f9175b;

    /* renamed from: c, reason: collision with root package name */
    private String f9176c;

    /* renamed from: d, reason: collision with root package name */
    private String f9177d;

    public h(Context context) {
        super(f9174a);
        this.f9176c = null;
        this.f9177d = null;
        this.f9175b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return this.f9176c;
    }

    public boolean g() {
        return h();
    }

    public boolean h() {
        this.f9177d = UMEnvelopeBuild.imprintProperty(this.f9175b, com.umeng.commonsdk.proguard.d.f, null);
        if (TextUtils.isEmpty(this.f9177d)) {
            return false;
        }
        this.f9177d = DataHelper.encryptBySHA1(this.f9177d);
        String readFile = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
        String readFile2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
        String readFile3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
        if (TextUtils.isEmpty(readFile)) {
            l();
        } else if (!this.f9177d.equals(readFile)) {
            this.f9176c = readFile;
            return true;
        }
        if (TextUtils.isEmpty(readFile2)) {
            k();
        } else if (!this.f9177d.equals(readFile2)) {
            this.f9176c = readFile2;
            return true;
        }
        if (TextUtils.isEmpty(readFile3)) {
            j();
            return false;
        }
        if (this.f9177d.equals(readFile3)) {
            return false;
        }
        this.f9176c = readFile3;
        return true;
    }

    public void i() {
        try {
            l();
            k();
            j();
        } catch (Exception unused) {
        }
    }

    private void j() {
        try {
            b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f9177d);
        } catch (Throwable unused) {
        }
    }

    private void k() {
        try {
            b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f9177d);
        } catch (Throwable unused) {
        }
    }

    private void l() {
        try {
            b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f9177d);
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }
}

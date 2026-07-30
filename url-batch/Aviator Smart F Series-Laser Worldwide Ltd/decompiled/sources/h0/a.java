package h0;

import com.crrepa.band.my.device.ota.BandNewVersionFragment;
import com.crrepa.ble.trans.upgrade.bean.FirmwareVersionInfo;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static String a() {
        return j0.a.b().a("device_address", "");
    }

    public static String b() {
        return j0.a.b().a("firmware_file_md5", "");
    }

    public static String c() {
        return j0.a.b().a("firmware_file_url", "");
    }

    public static String d() {
        return j0.a.b().a(BandNewVersionFragment.FIRMWARE_VERSION, "");
    }

    public static String e() {
        return j0.a.b().a("tp_file_md5", "");
    }

    public static int f() {
        return j0.a.b().a("tp_band_offset", 0);
    }

    public static String g() {
        return j0.a.b().a("tp_file_url", "");
    }

    public static void a(FirmwareVersionInfo firmwareVersionInfo) {
        j0.a b8 = j0.a.b();
        b8.b(BandNewVersionFragment.FIRMWARE_VERSION, firmwareVersionInfo.getVersion());
        b8.b("firmware_file_url", firmwareVersionInfo.getUrl());
        b8.b("firmware_file_md5", firmwareVersionInfo.getMd5());
        if (firmwareVersionInfo.getTp_bin() > 0) {
            b8.b("tp_file_url", firmwareVersionInfo.getTp_bin_path());
            b8.b("tp_file_md5", firmwareVersionInfo.getTp_bin_md5());
            b8.b("tp_band_offset", firmwareVersionInfo.getTp_bin_offset());
        }
    }

    public static void a(String str) {
        j0.a.b().b("device_address", str);
    }
}

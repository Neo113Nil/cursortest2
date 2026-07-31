package O0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private String f1238a = Y.q().getFilesDir().getPath();

    n0() {
    }

    private String b(String str) {
        return this.f1238a + "/hms/component/".replace("component", str);
    }

    private void c(String str, String str2) {
        File file = new File(b(str));
        File file2 = new File(b(str), "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            j0.h("hmsSdk", "file directory is mkdirs");
        }
        if (d(file2)) {
            H.d(file2, str2);
        } else {
            j0.m("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private boolean d(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            j0.m("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] e(String str, String str2, String str3, String str4) {
        byte[] b4 = S0.b.b(str);
        byte[] b5 = S0.b.b(str2);
        byte[] b6 = S0.b.b(str3);
        byte[] b7 = S0.b.b(str4);
        int length = b4.length;
        if (length > b5.length) {
            length = b5.length;
        }
        if (length > b6.length) {
            length = b6.length;
        }
        if (length > b7.length) {
            length = b7.length;
        }
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = (char) (((b4[i4] ^ b5[i4]) ^ b6[i4]) ^ b7[i4]);
        }
        return cArr;
    }

    private String f(String str) {
        File file = new File(b(str), "hianalytics_" + str);
        if (d(file)) {
            return H.a(file);
        }
        String e4 = S0.a.e(UserVerificationMethods.USER_VERIFY_PATTERN);
        H.d(file, e4);
        return e4;
    }

    private boolean g() {
        long a4 = AbstractC0413m.a(Y.q(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a4) {
            return System.currentTimeMillis() - a4 > 31536000000L;
        }
        j0.h("hmsSdk", "First init components");
        return true;
    }

    private static boolean h(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    j0.h("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                h(file2);
            }
        }
        return file.delete();
    }

    public static boolean i() {
        return h(new File(Y.q().getFilesDir().getPath() + "/hms"));
    }

    private String j() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public String a() {
        String f4;
        String f5;
        String f6;
        String f7;
        String j4 = j();
        if (g()) {
            j0.h("hmsSdk", "refresh components");
            f4 = S0.a.e(UserVerificationMethods.USER_VERIFY_PATTERN);
            c("aprpap", f4);
            f5 = S0.a.e(UserVerificationMethods.USER_VERIFY_PATTERN);
            c("febdoc", f5);
            f6 = S0.a.e(UserVerificationMethods.USER_VERIFY_PATTERN);
            c("marfil", f6);
            f7 = S0.a.e(UserVerificationMethods.USER_VERIFY_PATTERN);
            c("maywnj", f7);
            AbstractC0413m.f(Y.q(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            f4 = f("aprpap");
            f5 = f("febdoc");
            f6 = f("marfil");
            f7 = f("maywnj");
        }
        return S0.b.a(Q0.a.b(e(f4, f5, f6, j4), S0.b.b(f7), 10000, 16));
    }
}

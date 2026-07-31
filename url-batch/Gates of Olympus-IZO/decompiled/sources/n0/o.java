package n0;

import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import f.AbstractC0382a;
import h1.C0438i;
import j.AbstractC0495m;
import j.C0494l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import k.AbstractC0522a;
import u0.C0997t;

/* loaded from: classes.dex */
public final class o implements s1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6239a;

    @Override // s1.c
    public void a(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC0382a.f4777a /* 9 */:
            default:
                str = "";
                break;
            case AbstractC0382a.f4779c /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6239a).setResultCode(i3);
    }

    @Override // s1.c
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public C2.c c(C2.c cVar, C0997t c0997t) {
        Object obj;
        boolean z3;
        long j3;
        long j4;
        int i3;
        ArrayList arrayList = (ArrayList) cVar.f484e;
        C0494l c0494l = new C0494l(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            p pVar = (p) arrayList.get(i4);
            long j5 = pVar.f6240a;
            C0494l c0494l2 = (C0494l) this.f6239a;
            int b2 = AbstractC0522a.b(c0494l2.f5170e, c0494l2.f5172g, j5);
            Object obj2 = AbstractC0495m.f5173a;
            if (b2 < 0 || (obj = c0494l2.f5171f[b2]) == obj2) {
                obj = null;
            }
            n nVar = (n) obj;
            if (nVar == null) {
                j4 = pVar.f6241b;
                j3 = pVar.f6243d;
                z3 = false;
            } else {
                long E3 = c0997t.E(nVar.f6237b);
                long j6 = nVar.f6236a;
                z3 = nVar.f6238c;
                j3 = E3;
                j4 = j6;
            }
            ArrayList arrayList2 = pVar.f6248i;
            long j7 = pVar.f6249j;
            long j8 = pVar.f6250k;
            long j9 = pVar.f6240a;
            c0494l.b(j9, new m(j9, pVar.f6241b, pVar.f6243d, pVar.f6244e, pVar.f6245f, j4, j3, z3, pVar.f6246g, arrayList2, j7, j8));
            long j10 = pVar.f6240a;
            boolean z4 = pVar.f6244e;
            if (z4) {
                i3 = i4;
                c0494l2.b(j10, new n(pVar.f6241b, pVar.f6242c, z4));
            } else {
                i3 = i4;
                int b3 = AbstractC0522a.b(c0494l2.f5170e, c0494l2.f5172g, j10);
                if (b3 >= 0) {
                    Object[] objArr = c0494l2.f5171f;
                    if (objArr[b3] != obj2) {
                        objArr[b3] = obj2;
                        c0494l2.f5169d = true;
                    }
                }
            }
            i4 = i3 + 1;
        }
        return new C2.c(c0494l, 7, cVar);
    }

    public o(int i3) {
        switch (i3) {
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                this.f6239a = new ConcurrentHashMap(16);
                break;
            default:
                this.f6239a = new C0494l(10);
                break;
        }
    }
}

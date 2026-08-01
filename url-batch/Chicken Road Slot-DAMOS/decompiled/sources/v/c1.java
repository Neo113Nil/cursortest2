package v;

import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c1 implements e1, y4.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9766d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9767e;

    public c1(int i3) {
        this.f9766d = i3;
        switch (i3) {
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f9767e = new AtomicInteger(0);
                break;
            default:
                this.f9767e = new s.p((Object) null);
                break;
        }
    }

    @Override // v.e1, v.b1
    public boolean a() {
        ((com.google.firebase.messaging.v) this.f9767e).getClass();
        return false;
    }

    @Override // y4.d
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // y4.d
    public void c(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f9767e).setResultCode(i3);
    }

    public q d(int i3) {
        switch (this.f9766d) {
            case 0:
                return ((r[]) this.f9767e)[i3];
            case 1:
                return (r) this.f9767e;
            default:
                return (q) this.f9767e;
        }
    }

    public w7.m e(c6.c cVar, d2.v vVar) {
        int i3;
        long H;
        long j;
        boolean z10;
        s.p pVar = (s.p) this.f9767e;
        List list = (List) cVar.f1809e;
        s.p pVar2 = new s.p(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            x1.n nVar = (x1.n) list.get(i10);
            long j3 = nVar.f10294a;
            x1.m mVar = (x1.m) pVar.b(j3);
            if (mVar == null) {
                i3 = i10;
                j = nVar.f10295b;
                H = nVar.f10297d;
                z10 = false;
            } else {
                long j10 = mVar.f10291a;
                boolean z11 = mVar.f10293c;
                i3 = i10;
                H = vVar.H(mVar.f10292b);
                j = j10;
                z10 = z11;
            }
            long j11 = nVar.f10294a;
            List list2 = list;
            int i11 = size;
            pVar2.d(j11, new x1.l(j11, nVar.f10295b, nVar.f10297d, nVar.f10298e, nVar.f10299f, j, H, z10, nVar.g, nVar.f10301i, nVar.j, nVar.f10302k, nVar.f10303l, nVar.f10304m));
            boolean z12 = nVar.f10298e;
            if (z12) {
                pVar.d(j3, new x1.m(nVar.f10295b, nVar.f10296c, z12));
            } else {
                pVar.e(j3);
            }
            i10 = i3 + 1;
            list = list2;
            size = i11;
        }
        return new w7.m(pVar2, cVar);
    }

    @Override // v.b1
    public l i(long j, l lVar, l lVar2, l lVar3) {
        return ((com.google.firebase.messaging.v) this.f9767e).i(j, lVar, lVar2, lVar3);
    }

    @Override // v.b1
    public long j(l lVar, l lVar2, l lVar3) {
        return ((com.google.firebase.messaging.v) this.f9767e).j(lVar, lVar2, lVar3);
    }

    @Override // v.b1
    public l k(l lVar, l lVar2, l lVar3) {
        return ((com.google.firebase.messaging.v) this.f9767e).k(lVar, lVar2, lVar3);
    }

    @Override // v.b1
    public l n(long j, l lVar, l lVar2, l lVar3) {
        return ((com.google.firebase.messaging.v) this.f9767e).n(j, lVar, lVar2, lVar3);
    }

    public /* synthetic */ c1(int i3, Object obj) {
        this.f9766d = i3;
        this.f9767e = obj;
    }

    public c1(float f3, l lVar) {
        c1 c1Var;
        this.f9766d = 3;
        int i3 = d1.f9778a;
        if (lVar != null) {
            c1Var = new c1(lVar, f3);
        } else {
            c1Var = new c1(f3);
        }
        this.f9767e = new com.google.firebase.messaging.v(c1Var);
    }

    public c1(l lVar, float f3) {
        this.f9766d = 0;
        int b10 = lVar.b();
        r[] rVarArr = new r[b10];
        for (int i3 = 0; i3 < b10; i3++) {
            rVarArr[i3] = new r(f3, lVar.a(i3));
        }
        this.f9767e = rVarArr;
    }

    public c1(float f3) {
        this.f9766d = 1;
        this.f9767e = new r(f3, 0.01f);
    }
}

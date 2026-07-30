package m4;

import android.graphics.Typeface;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class f implements h6.h, f2.p, l5.u, o5.a, r5.b, v3.c {

    /* renamed from: f, reason: collision with root package name */
    public static f f6364f;

    /* renamed from: g, reason: collision with root package name */
    public static f f6365g;

    public f(int i7) {
        switch (i7) {
            case 12:
                new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                new e2.b();
                break;
        }
    }

    public static final float[] d() {
        float[] fArr = l.s.f5632s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        l.s.f5632s = fArr2;
        return fArr2;
    }

    public static final boolean g(f8.w wVar) {
        f8.w wVar2 = g8.f.f4548e;
        return !z6.o.o(true, wVar.e(), ".class");
    }

    public static Typeface h(String str, f2.k kVar, int i7) {
        Typeface create;
        if (i7 == 0 && r6.k.a(kVar, f2.k.f3278h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f3280f, i7 == 1);
        return create;
    }

    public static f8.i i(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) (g8.b.a(str.charAt(i8 + 1)) + (g8.b.a(str.charAt(i8)) << 4));
        }
        return new f8.i(bArr);
    }

    public static f8.i j(String str) {
        r6.k.f(str, "<this>");
        byte[] bytes = str.getBytes(z6.a.f10114a);
        r6.k.e(bytes, "this as java.lang.String).getBytes(charset)");
        f8.i iVar = new f8.i(bytes);
        iVar.f3603h = str;
        return iVar;
    }

    @Override // f2.p
    public Typeface a(f2.k kVar, int i7) {
        return h(null, kVar, i7);
    }

    @Override // f2.p
    public Typeface b(f2.m mVar, f2.k kVar, int i7) {
        mVar.getClass();
        return h("sans-serif", kVar, i7);
    }

    @Override // r5.b
    public t5.q c(t5.l lVar, t5.q qVar, boolean z8) {
        return null;
    }

    @Override // v3.c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // v3.c
    public void f(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case q.c.f7259c /* 9 */:
            default:
                str = "";
                break;
            case q.c.f7261e /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    public List l(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (e5.c cVar : componentRegistrar.getComponents()) {
            String str = cVar.f2760a;
            if (str != null) {
                cVar = new e5.c(str, cVar.f2761b, cVar.f2762c, cVar.f2763d, new b6.d(str, 1, cVar), cVar.f2765f);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // o5.a
    public long millis() {
        return System.currentTimeMillis();
    }
}

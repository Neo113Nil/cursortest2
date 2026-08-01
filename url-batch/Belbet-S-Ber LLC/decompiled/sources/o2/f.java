package o2;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.m0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class f implements n0, e1.e, k.x, n0.u {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2938f;

    public /* synthetic */ f(int i) {
        this.f2938f = i;
    }

    public static final String c(byte[] bArr, byte[][] bArr2, int i) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        byte[] bArr3 = PublicSuffixDatabase.f3034e;
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = (i7 + length) / 2;
            while (i8 > -1 && bArr[i8] != 10) {
                i8--;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i4 = i9 + i10;
                if (bArr[i4] == 10) {
                    break;
                }
                i10++;
            }
            int i11 = i4 - i9;
            int i12 = i;
            boolean z5 = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z5) {
                    i5 = 46;
                    z4 = false;
                } else {
                    byte b2 = bArr2[i12][i13];
                    byte[] bArr4 = u3.b.f3581a;
                    int i15 = b2 & 255;
                    z4 = z5;
                    i5 = i15;
                }
                byte b5 = bArr[i9 + i14];
                byte[] bArr5 = u3.b.f3581a;
                i6 = i5 - (b5 & 255);
                if (i6 != 0) {
                    break;
                }
                i14++;
                i13++;
                if (i14 == i11) {
                    break;
                }
                if (bArr2[i12].length != i13) {
                    z5 = z4;
                } else {
                    if (i12 == bArr2.length - 1) {
                        break;
                    }
                    i12++;
                    i13 = -1;
                    z5 = true;
                }
            }
            if (i6 >= 0) {
                if (i6 <= 0) {
                    int i16 = i11 - i14;
                    int length2 = bArr2[i12].length - i13;
                    int length3 = bArr2.length;
                    for (int i17 = i12 + 1; i17 < length3; i17++) {
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i16) {
                        if (length2 <= i16) {
                            Charset charset = StandardCharsets.UTF_8;
                            i3.d.d(charset, "UTF_8");
                            return new String(bArr, i9, i11, charset);
                        }
                    }
                }
                i7 = i4 + 1;
            }
            length = i8;
        }
        return null;
    }

    public static ArrayList d(List list) {
        i3.d.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((t3.p) obj) != t3.p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.j.C(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((t3.p) obj2).f3505f);
        }
        return arrayList2;
    }

    public static byte[] e(List list) {
        i3.d.e(list, "protocols");
        g4.f fVar = new g4.f();
        ArrayList d = d(list);
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            String str = (String) obj;
            fVar.x(str.length());
            fVar.B(str);
        }
        return fVar.q(fVar.f1935g);
    }

    public static g4.i f(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (h4.b.a(str.charAt(i4 + 1)) + (h4.b.a(str.charAt(i4)) << 4));
        }
        return new g4.i(bArr);
    }

    public static g4.i g(String str) {
        i3.d.e(str, "<this>");
        byte[] bytes = str.getBytes(p3.a.f3089a);
        i3.d.d(bytes, "this as java.lang.String).getBytes(charset)");
        g4.i iVar = new g4.i(bytes);
        iVar.h = str;
        return iVar;
    }

    public static Path h(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f7, f8);
        return path;
    }

    public static boolean j() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // androidx.lifecycle.n0
    public l0 b(Class cls) {
        switch (this.f2938f) {
            case 7:
                return new m0(true);
            default:
                return new c1.a();
        }
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    @Override // k.x
    public boolean n(k.m mVar) {
        return false;
    }

    @Override // e1.e
    public void p() {
        switch (this.f2938f) {
            case 11:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public void q(androidx.emoji2.text.q qVar, float f5) {
        p.b bVar = (p.b) ((Drawable) qVar.f466g);
        p.a aVar = (p.a) qVar.h;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f5 != bVar.f3048e || bVar.f3049f != useCompatPadding || bVar.f3050g != preventCornerOverlap) {
            bVar.f3048e = f5;
            bVar.f3049f = useCompatPadding;
            bVar.f3050g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            qVar.J(0, 0, 0, 0);
            return;
        }
        p.b bVar2 = (p.b) ((Drawable) qVar.f466g);
        float f6 = bVar2.f3048e;
        float f7 = bVar2.f3045a;
        int ceil = (int) Math.ceil(p.c.a(f6, f7, aVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(p.c.b(f6, f7, aVar.getPreventCornerOverlap()));
        qVar.J(ceil, ceil2, ceil, ceil2);
    }

    @Override // e1.e
    public void s(int i, Object obj) {
        String str;
        switch (this.f2938f) {
            case 11:
                break;
            default:
                switch (i) {
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
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f2938f) {
            case 26:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public f(View view, int i) {
        this.f2938f = i;
        switch (i) {
            case 21:
                if (Build.VERSION.SDK_INT < 30) {
                    new f(view, 20);
                    break;
                } else {
                    new n0.w(view, 20);
                    break;
                }
        }
    }

    private final void l() {
    }

    private final void o(int i, Object obj) {
    }

    @Override // k.x
    public void a(k.m mVar, boolean z4) {
    }

    @Override // n0.u
    public void onScrollLimit(int i, int i4, int i5, boolean z4) {
    }

    @Override // n0.u
    public void onScrollProgress(int i, int i4, int i5, int i6) {
    }
}

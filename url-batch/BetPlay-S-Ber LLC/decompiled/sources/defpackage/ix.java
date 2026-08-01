package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ix implements wx, b20, p90 {
    public static ix g;
    public static ix h;
    public final /* synthetic */ int f;

    public ix(View view, int i) {
        this.f = i;
        switch (i) {
            case 12:
                if (Build.VERSION.SDK_INT < 30) {
                    new ix(view, 11);
                    break;
                } else {
                    new n30(view, 11);
                    break;
                }
        }
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = y70.a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = y70.a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static ArrayList e(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((dy) obj) != dy.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fb.b0(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((dy) obj2).f);
        }
        return arrayList2;
    }

    public static byte[] f(List list) {
        list.getClass();
        p8 p8Var = new p8();
        ArrayList e = e(list);
        int size = e.size();
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            String str = (String) obj;
            p8Var.w(str.length());
            p8Var.A(str);
        }
        return p8Var.q(p8Var.g);
    }

    public static Path g(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static boolean h() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // defpackage.wx
    public void a() {
        switch (this.f) {
            case 2:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.wx
    public void b(int i, Object obj) {
        String str;
        switch (this.f) {
            case 2:
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
                    case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
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

    @Override // defpackage.p90
    public m90 c(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (m90) newInstance;
        } catch (IllegalAccessException e) {
            o8.p("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            o8.p("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            o8.p("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 13:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ix(int i) {
        this.f = i;
    }

    private final void k() {
    }

    private final void l(int i, Object obj) {
    }

    @Override // defpackage.b20
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.b20
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}

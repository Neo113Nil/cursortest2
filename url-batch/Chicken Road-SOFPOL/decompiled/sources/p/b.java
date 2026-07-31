package p;

import a4.i;
import android.util.Log;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import g6.g;
import java.util.Arrays;
import q3.t;
import u4.d;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements t, d, g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5710d;

    public /* synthetic */ b(int i) {
        this.f5710d = i;
    }

    public static final float a(float f6, float[] fArr, float[] fArr2) {
        float f8;
        float f9;
        float f10;
        float f11;
        float abs = Math.abs(f6);
        float signum = Math.signum(f6);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i8 = i - 1;
        if (i8 >= fArr.length - 1) {
            float f12 = fArr[fArr.length - 1];
            float f13 = fArr2[fArr.length - 1];
            if (f12 == 0.0f) {
                return 0.0f;
            }
            return (f13 / f12) * f6;
        }
        if (i8 == -1) {
            float f14 = fArr[0];
            f10 = fArr2[0];
            f11 = f14;
            f9 = 0.0f;
            f8 = 0.0f;
        } else {
            float f15 = fArr[i8];
            float f16 = fArr[i];
            f8 = fArr2[i8];
            f9 = f15;
            f10 = fArr2[i];
            f11 = f16;
        }
        return (((f10 - f8) * Math.max(0.0f, Math.min(1.0f, f9 == f11 ? 0.0f : (abs - f9) / (f11 - f9)))) + f8) * signum;
    }

    @Override // u4.d
    public void b() {
        switch (this.f5710d) {
            case 6:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // u4.d
    public void c(int i, Object obj) {
        String str;
        switch (this.f5710d) {
            case 6:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case i.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case i.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case i.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case i.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case v0.f8304b /* 9 */:
                    default:
                        str = "";
                        break;
                    case v0.f8306d /* 10 */:
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
        switch (this.f5710d) {
            case 16:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i, Object obj) {
        this.f5710d = i;
    }

    public b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f5710d = 15;
    }

    private final void d() {
    }

    private final void e(int i, Object obj) {
    }

    @Override // q3.t
    public void onScrollLimit(int i, int i8, int i9, boolean z3) {
    }

    @Override // q3.t
    public void onScrollProgress(int i, int i8, int i9, int i10) {
    }
}

package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q40 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String b(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static int d(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int e(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static k81 f(String str) {
        h21.c(str);
        return new k81();
    }

    public static FieldDescriptor g(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String i(long j, String str) {
        return str + j;
    }

    public static String j(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String k(String str, fr0 fr0Var, String str2) {
        return str + fr0Var + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void q(int i, int i2, int i3, int i4, int i5) {
        s93.l(i);
        s93.l(i2);
        s93.l(i3);
        s93.l(i4);
        s93.l(i5);
    }

    public static void r(int i, a00 a00Var, int i2, sc scVar) {
        a00Var.i0(Integer.valueOf(i));
        a00Var.b(Integer.valueOf(i2), scVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(uc2 uc2Var) {
        boolean isTerminated;
        if (uc2Var instanceof AutoCloseable) {
            uc2Var.close();
            return;
        }
        if (!(uc2Var instanceof ExecutorService)) {
            if (uc2Var instanceof TypedArray) {
                ((TypedArray) uc2Var).recycle();
                return;
            }
            if (uc2Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) uc2Var).release();
                return;
            } else if (uc2Var instanceof MediaDrm) {
                ((MediaDrm) uc2Var).release();
                return;
            } else {
                b71.t();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) uc2Var;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj == null) {
            return;
        }
        b71.o();
    }

    public static /* synthetic */ int u(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return "QR_CODE";
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return "RSS_14";
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return "UPC_E";
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] x(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}

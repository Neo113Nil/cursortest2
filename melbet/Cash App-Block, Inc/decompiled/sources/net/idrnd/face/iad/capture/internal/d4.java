package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import com.plaid.internal.EnumC0170g;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import net.idrnd.face.iad.capture.checker.nativelib.NativeInterface;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes9.dex */
public final class d4 {
    public static final int[] c = {63131, 51152, 18403, 63845, EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 48337, 23182, 35145, 49102, 53010};
    public static int d = 0;
    public final Context a;
    public final HashSet b = new HashSet();

    public d4(Context context) {
        this.a = context;
        try {
            if (NativeInterface.a) {
                NativeInterface.call(new Object[]{1, Boolean.FALSE});
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static String a(int i) {
        if (e4.a == null) {
            byte[] bArr = {-116, 2, -9, -51, 15, -1, 68, PnmConstants.PGM_RAW_CODE, -6, 17, -88, -105, 88, -13, 93, 110, -67, 22, -86, -122, 76, -84, 23, 100, -76, 85, -3, -43, 19, -27};
            byte[] bArr2 = new byte[30];
            byte[] bArr3 = {-93, -124, -38, 94};
            byte b = 0;
            for (int i2 = 0; i2 < 30; i2++) {
                bArr2[i2] = (byte) ((b ^ bArr[i2]) ^ bArr3[i2 & 3]);
                b = bArr[i2];
            }
            e4.a = new String(bArr2, StandardCharsets.UTF_8).split("\n");
        }
        return e4.a[i];
    }
}

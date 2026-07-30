package h4;

import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f16791a;

    /* renamed from: b, reason: collision with root package name */
    private static CRPLocalVideoInfo f16792b;

    /* renamed from: c, reason: collision with root package name */
    private static int f16793c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f16794d = new ArrayList();

    private u0() {
    }

    public static CRPLocalVideoInfo a(byte[] bArr) {
        if (bArr.length < 14) {
            return null;
        }
        f16794d.clear();
        CRPLocalVideoInfo cRPLocalVideoInfo = new CRPLocalVideoInfo();
        f16792b = cRPLocalVideoInfo;
        cRPLocalVideoInfo.setAvailableSize(f16791a);
        f16792b.setWidth(com.crrepa.g1.c.b(bArr[3], bArr[2]));
        f16792b.setHeight(com.crrepa.g1.c.b(bArr[5], bArr[4]));
        f16792b.setVideoWidth(com.crrepa.g1.c.b(bArr[7], bArr[6]));
        f16792b.setVideoHeight(com.crrepa.g1.c.b(bArr[9], bArr[8]));
        f16792b.setVideoCornerRadius(com.crrepa.g1.c.b(bArr[11], bArr[10]));
        f16792b.setMaxCount(com.crrepa.g1.c.a(bArr[12]));
        f16793c = com.crrepa.g1.c.a(bArr[13]);
        if (bArr.length == 16) {
            f16792b.setMaxDuration(com.crrepa.g1.c.b(bArr[15], bArr[14]));
        }
        f16792b.setSavedCount(f16793c);
        if (f16793c == 0) {
            return f16792b;
        }
        return null;
    }

    public static CRPLocalVideoInfo b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        String str = new String(bArr, StandardCharsets.UTF_8);
        List<String> list = f16794d;
        list.add(str);
        if (list.size() != f16793c) {
            return null;
        }
        f16792b.setVideoList(list);
        return f16792b;
    }

    public static void a(int i8) {
        f16791a = i8;
    }
}

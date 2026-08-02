package X0;

import U.i;
import a.AbstractC0124a;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3566c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3567d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3568e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3569f;

    public /* synthetic */ b(int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f3564a = i4;
        this.f3565b = i5;
        this.f3566c = i6;
        this.f3567d = i7;
        this.f3568e = i8;
        this.f3569f = i9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c4;
        AbstractC0124a.h(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < split.length; i9++) {
            String D3 = i.D(split[i9].trim());
            D3.getClass();
            switch (D3.hashCode()) {
                case 100571:
                    if (D3.equals("end")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3556653:
                    if (D3.equals("text")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 102749521:
                    if (D3.equals(AdRevenueConstants.LAYER_KEY)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109757538:
                    if (D3.equals("start")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109780401:
                    if (D3.equals("style")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    i6 = i9;
                    break;
                case 1:
                    i8 = i9;
                    break;
                case 2:
                    i4 = i9;
                    break;
                case 3:
                    i5 = i9;
                    break;
                case 4:
                    i7 = i9;
                    break;
            }
        }
        if (i5 == -1 || i6 == -1 || i8 == -1) {
            return null;
        }
        return new b(i4, i5, i6, i7, i8, split.length);
    }
}

package h2;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f16786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16789d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16790e;

    private b(int i7, int i8, int i9, int i10, int i11) {
        this.f16786a = i7;
        this.f16787b = i8;
        this.f16788c = i9;
        this.f16789d = i10;
        this.f16790e = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c7;
        o2.a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String e7 = l4.b.e(split[i11].trim());
            e7.hashCode();
            switch (e7.hashCode()) {
                case 100571:
                    if (e7.equals("end")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3556653:
                    if (e7.equals("text")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109757538:
                    if (e7.equals("start")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109780401:
                    if (e7.equals("style")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    i8 = i11;
                    break;
                case 1:
                    i10 = i11;
                    break;
                case 2:
                    i7 = i11;
                    break;
                case 3:
                    i9 = i11;
                    break;
            }
        }
        if (i7 == -1 || i8 == -1 || i10 == -1) {
            return null;
        }
        return new b(i7, i8, i9, i10, split.length);
    }
}

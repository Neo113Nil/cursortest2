package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2244a;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        str = "\n";
        f2244a = str;
    }

    public static void a(int i3, int i10, String str, StringBuilder sb2) {
        int i11 = i3;
        while (i3 < i10) {
            int i12 = i3 + 1;
            if (str.charAt(i3) == '%') {
                if (i12 == i10) {
                    break;
                }
                char charAt = str.charAt(i12);
                if (charAt == '%') {
                    sb2.append((CharSequence) str, i11, i12);
                } else if (charAt == 'n') {
                    sb2.append((CharSequence) str, i11, i3);
                    sb2.append(f2244a);
                }
                i11 = i3 + 2;
                i3 = i11;
            }
            i3 = i12;
        }
        if (i11 < i10) {
            sb2.append((CharSequence) str, i11, i10);
        }
    }

    public static int b(int i3, String str) {
        while (i3 < str.length()) {
            int i10 = i3 + 1;
            if (str.charAt(i3) != '%') {
                i3 = i10;
            } else {
                if (i10 >= str.length()) {
                    throw new d0(d0.c(i3, -1, "trailing unquoted '%' character", str), 0);
                }
                char charAt = str.charAt(i10);
                if (charAt != '%' && charAt != 'n') {
                    return i3;
                }
                i3 += 2;
            }
        }
        return -1;
    }
}

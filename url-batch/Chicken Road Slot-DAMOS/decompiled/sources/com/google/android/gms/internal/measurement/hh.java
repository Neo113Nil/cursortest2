package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class hh {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f2384c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f2385a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2386b = false;

    public hh(StringBuilder sb2) {
        this.f2385a = sb2;
    }

    public static int b(int i3, String str) {
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final void a(Object obj, String str) {
        boolean z10 = this.f2386b;
        StringBuilder sb2 = this.f2385a;
        if (z10) {
            sb2.append(' ');
        } else {
            if (sb2.length() > 0) {
                sb2.append((sb2.length() > 1000 || sb2.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb2.append("[CONTEXT ");
            this.f2386b = true;
        }
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f2384c.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String obj2 = obj.toString();
        int i3 = 0;
        while (true) {
            int b10 = b(i3, obj2);
            if (b10 == -1) {
                sb2.append((CharSequence) obj2, i3, obj2.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) obj2, i3, b10);
            i3 = b10 + 1;
            char charAt = obj2.charAt(b10);
            if (charAt == '\t') {
                charAt = 't';
            } else if (charAt == '\n') {
                charAt = 'n';
            } else if (charAt == '\r') {
                charAt = 'r';
            } else if (charAt != '\"' && charAt != '\\') {
                sb2.append((char) 65533);
            }
            sb2.append("\\");
            sb2.append(charAt);
        }
    }
}

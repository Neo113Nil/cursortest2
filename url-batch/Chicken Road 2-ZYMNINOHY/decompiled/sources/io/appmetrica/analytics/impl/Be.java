package io.appmetrica.analytics.impl;

import w3.AbstractC1510g;
import w3.C1509f;

/* loaded from: classes.dex */
public final class Be implements InterfaceC0731k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10108a = 10;

    /* renamed from: b, reason: collision with root package name */
    public final int f10109b = 13;

    /* renamed from: c, reason: collision with root package name */
    public final C1509f f10110c = new C1509f("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC0731k2
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        Character d02 = AbstractC1510g.d0(str);
        Character d03 = AbstractC1510g.d0(sb2);
        if (length2 < this.f10108a || length2 > this.f10109b) {
            return null;
        }
        if (d03 != null && d03.charValue() == '0') {
            return null;
        }
        C1509f c1509f = this.f10110c;
        c1509f.getClass();
        if (!c1509f.f15950a.matcher(str).matches()) {
            return null;
        }
        if (length2 == 10 && (d02 == null || d02.charValue() != '+')) {
            return "7".concat(sb2);
        }
        if (length2 == 11) {
            if (d02 != null && d02.charValue() == '+' && d03 != null && d03.charValue() == '8') {
                return null;
            }
            if (d03 != null && d03.charValue() == '8') {
                return "7" + sb2.substring(1);
            }
        }
        if (length2 < 12 || d02 == null || d02.charValue() != '+' || d03 == null || d03.charValue() != '7') {
            return sb2;
        }
        return null;
    }
}

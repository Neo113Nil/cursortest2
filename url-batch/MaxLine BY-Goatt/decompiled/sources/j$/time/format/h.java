package j$.time.format;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class h implements e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        int i2;
        int b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                int length = charSequence.length();
                if (vVar.g(charSequence, i, "GMT", 0, 3)) {
                    int i8 = i + 3;
                    if (i8 == length) {
                        return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i8);
                    }
                    char charAt = charSequence.charAt(i8);
                    if (charAt == '+') {
                        i2 = 1;
                    } else {
                        if (charAt != '-') {
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i8);
                        }
                        i2 = -1;
                    }
                    int i9 = i + 4;
                    int i10 = 0;
                    if (((g0) obj) == g0.FULL) {
                        int i11 = i + 5;
                        int b2 = b(charSequence, i9);
                        int i12 = i + 6;
                        int b3 = b(charSequence, i11);
                        if (b2 >= 0 && b3 >= 0) {
                            int i13 = i + 7;
                            if (charSequence.charAt(i12) == ':') {
                                b = (b2 * 10) + b3;
                                int b4 = b(charSequence, i13);
                                i6 = i + 9;
                                int b5 = b(charSequence, i + 8);
                                if (b4 >= 0 && b5 >= 0) {
                                    i5 = (b4 * 10) + b5;
                                    int i14 = i + 11;
                                    if (i14 < length && charSequence.charAt(i6) == ':') {
                                        int b6 = b(charSequence, i + 10);
                                        int b7 = b(charSequence, i14);
                                        if (b6 >= 0 && b7 >= 0) {
                                            i10 = (b6 * 10) + b7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i3 = i10;
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i15 = i + 5;
                        b = b(charSequence, i9);
                        if (b >= 0) {
                            if (i15 < length) {
                                int b8 = b(charSequence, i15);
                                if (b8 >= 0) {
                                    b = (b * 10) + b8;
                                    i15 = i + 6;
                                }
                                int i16 = i15 + 2;
                                if (i16 < length && charSequence.charAt(i15) == ':' && i16 < length && charSequence.charAt(i15) == ':') {
                                    int b9 = b(charSequence, i15 + 1);
                                    int b10 = b(charSequence, i16);
                                    if (b9 >= 0 && b10 >= 0) {
                                        i5 = (b9 * 10) + b10;
                                        int i17 = i15 + 3;
                                        int i18 = i15 + 5;
                                        if (i18 < length && charSequence.charAt(i17) == ':') {
                                            int b11 = b(charSequence, i15 + 4);
                                            int b12 = b(charSequence, i18);
                                            if (b11 >= 0 && b12 >= 0) {
                                                i10 = (b11 * 10) + b12;
                                                i6 = i15 + 6;
                                                i3 = i10;
                                                i4 = i6;
                                            }
                                        }
                                        i4 = i17;
                                        i3 = 0;
                                    }
                                }
                            }
                            i3 = 0;
                            i4 = i15;
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i10 * 60) + (b * 3600) + i3) * i2, i, i4);
                        }
                    }
                    i10 = i5;
                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i10 * 60) + (b * 3600) + i3) * i2, i, i4);
                }
                return ~i;
            default:
                String str = (String) obj;
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !vVar.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    @Override // j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Long a = yVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (a != null) {
                    sb.append("GMT");
                    int intExact = Math.toIntExact(a.longValue());
                    if (intExact != 0) {
                        int abs = Math.abs((intExact / 3600) % 100);
                        int abs2 = Math.abs((intExact / 60) % 60);
                        int abs3 = Math.abs(intExact % 60);
                        sb.append(intExact < 0 ? "-" : "+");
                        if (((g0) obj) != g0.FULL) {
                            if (abs >= 10) {
                                sb.append((char) ((abs / 10) + 48));
                            }
                            sb.append((char) ((abs % 10) + 48));
                            if (abs2 != 0 || abs3 != 0) {
                                sb.append(':');
                                a(sb, abs2);
                                if (abs3 != 0) {
                                    sb.append(':');
                                    a(sb, abs3);
                                    break;
                                }
                            }
                        } else {
                            a(sb, abs);
                            sb.append(':');
                            a(sb, abs2);
                            if (abs3 != 0) {
                                sb.append(':');
                                a(sb, abs3);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) obj);
                break;
        }
        return true;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "LocalizedOffset(" + ((g0) obj) + ")";
            default:
                return "'" + ((String) obj).replace("'", "''") + "'";
        }
    }
}

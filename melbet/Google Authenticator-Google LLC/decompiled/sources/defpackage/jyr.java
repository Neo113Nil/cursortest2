package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyr {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final hpx b = kaa.c;

    public static jzw a(String str, jyq jyqVar) {
        char charAt = str.charAt(0);
        int i = jzw.d;
        return new jzy(str, charAt == ':', jyqVar);
    }
}

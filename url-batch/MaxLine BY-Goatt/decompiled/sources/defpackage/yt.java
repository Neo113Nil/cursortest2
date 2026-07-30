package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yt {
    public static final yt a = new yt();
    public static final Charset b;
    public static final Charset c;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        b = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset forName2 = Charset.forName("US-ASCII");
        forName2.getClass();
        c = forName2;
        Charset.forName("ISO-8859-1").getClass();
    }
}

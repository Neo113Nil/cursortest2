package s1;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: s1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4992e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f40420a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}

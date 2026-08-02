package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fav {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    static final Account b = fas.a;
    public static final Set c = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}

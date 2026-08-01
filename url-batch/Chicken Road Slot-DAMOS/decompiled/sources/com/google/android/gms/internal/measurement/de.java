package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class de {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2235a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* renamed from: b, reason: collision with root package name */
    public static final Account f2236b = ae.f2145a;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f2237c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* renamed from: d, reason: collision with root package name */
    public static final Set f2238d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}

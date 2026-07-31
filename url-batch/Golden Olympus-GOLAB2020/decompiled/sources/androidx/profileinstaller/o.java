package androidx.profileinstaller;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f12818a = {48, 49, 53, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f12819b = {48, 49, 48, 0};

    /* renamed from: c, reason: collision with root package name */
    static final byte[] f12820c = {48, 48, 57, 0};

    /* renamed from: d, reason: collision with root package name */
    static final byte[] f12821d = {48, 48, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    static final byte[] f12822e = {48, 48, 49, 0};

    /* renamed from: f, reason: collision with root package name */
    static final byte[] f12823f = {48, 48, 49, 0};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f12824g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f12822e) || Arrays.equals(bArr, f12821d)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
    }
}

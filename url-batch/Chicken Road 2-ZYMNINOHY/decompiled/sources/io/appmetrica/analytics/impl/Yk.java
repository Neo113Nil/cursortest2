package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class Yk {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0731k2 f11317a;

    public Yk(InterfaceC0731k2 interfaceC0731k2) {
        this.f11317a = interfaceC0731k2;
    }

    public final ArrayList a(Iterable iterable) {
        String str;
        String a3;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                a3 = this.f11317a.a(str2);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (a3 == null || (str = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(a3.getBytes(AbstractC1504a.f15936a)))) == null) {
                PublicLogger.Companion.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}

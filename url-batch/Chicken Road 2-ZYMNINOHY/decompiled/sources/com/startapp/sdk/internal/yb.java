package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class yb {
    public static final String a(Locale locale, Collection collection, char c4) {
        boolean z;
        StringBuilder sb;
        if (locale != null) {
            sb = new StringBuilder();
            sb.append(locale);
            z = true;
        } else {
            z = false;
            sb = null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            if (locale2 != null) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (z) {
                    sb.append(c4);
                }
                sb.append(locale2);
                z = true;
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }
}

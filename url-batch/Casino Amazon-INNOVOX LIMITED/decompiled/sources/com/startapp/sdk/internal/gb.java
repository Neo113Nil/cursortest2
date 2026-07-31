package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class gb {
    public static final gb d = new gb();

    /* renamed from: a, reason: collision with root package name */
    public final String f251a;
    public final eb b;
    public final String c;

    public gb(Locale locale, LinkedHashSet linkedHashSet) {
        this.f251a = locale.toString();
        this.b = new eb(linkedHashSet);
        StringBuilder sb = new StringBuilder();
        sb.append(locale);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            if (locale2 != null) {
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(locale2);
            }
        }
        this.c = sb.toString();
    }

    public gb() {
        this.f251a = null;
        this.b = null;
        this.c = null;
    }
}

package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2596ec {
    public static final ArrayList a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales != null) {
            int size = locales.size();
            for (int i4 = 0; i4 < size; i4++) {
                Locale locale = locales.get(i4);
                if (locale != null) {
                    arrayList.add(Ue.a(locale));
                }
            }
        }
        return arrayList;
    }
}

package com.startapp.sdk.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class hb extends a6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.startapp.sdk.internal.a6
    public final Object a() {
        Locale locale;
        Configuration configuration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Resources resources = this.f165a.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            locale = null;
        } else {
            locale = configuration.locale;
            LocaleList locales = configuration.getLocales();
            locales.getClass();
            if (locales.size() > 0) {
                int size = locales.size();
                boolean z = true;
                for (int i = 0; i < size; i++) {
                    Locale locale2 = locales.get(i);
                    if (locale2 != null) {
                        if (linkedHashSet.size() < 11) {
                            linkedHashSet.add(locale2);
                        }
                        if (z) {
                            z = false;
                            locale = locale2;
                        }
                    }
                }
            }
        }
        Locale locale3 = Locale.getDefault(Locale.Category.DISPLAY);
        if (locale == null) {
            locale = locale3;
        }
        if (linkedHashSet.size() < 11) {
            locale3.getClass();
            linkedHashSet.add(locale3);
        }
        Locale locale4 = Locale.getDefault();
        if (locale4 != null) {
            if (locale == null) {
                locale = locale4;
            }
            if (linkedHashSet.size() < 11) {
                linkedHashSet.add(locale4);
            }
        }
        if (locale == null) {
            locale = new Locale("en");
        }
        linkedHashSet.remove(locale);
        return new gb(locale, linkedHashSet);
    }

    @Override // com.startapp.sdk.internal.a6
    public final /* bridge */ /* synthetic */ Object c() {
        return gb.d;
    }
}

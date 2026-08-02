package com.startapp.sdk.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ac extends j6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(Context context) {
        super(context);
        kotlin.jvm.internal.i.e(context, "context");
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object a() {
        Locale locale;
        Configuration configuration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Resources resources = this.f7124a.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            locale = null;
        } else {
            locale = configuration.locale;
            LocaleList locales = configuration.getLocales();
            kotlin.jvm.internal.i.d(locales, "getLocales(...)");
            if (locales.size() > 0) {
                int size = locales.size();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    Locale locale2 = locales.get(i4);
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
            kotlin.jvm.internal.i.b(locale3);
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
        return new zb(locale, linkedHashSet);
    }

    @Override // com.startapp.sdk.internal.j6
    public final /* bridge */ /* synthetic */ Object c() {
        return zb.f8031d;
    }
}

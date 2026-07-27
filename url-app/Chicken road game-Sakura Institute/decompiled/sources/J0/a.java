package J0;

import H0.b;
import I0.e;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import z2.C1442z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3380a = new a();

    public final Object a(b bVar) {
        ArrayList arrayList = new ArrayList(C1442z.h(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((H0.a) it.next()).f3224a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(e eVar, b bVar) {
        ArrayList arrayList = new ArrayList(C1442z.h(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((H0.a) it.next()).f3224a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        eVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}

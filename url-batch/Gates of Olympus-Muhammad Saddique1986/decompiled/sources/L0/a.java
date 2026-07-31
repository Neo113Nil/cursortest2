package L0;

import J0.b;
import K0.d;
import S1.n;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3342a = new a();

    public final Object a(b bVar) {
        ArrayList arrayList = new ArrayList(n.E0(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((J0.a) it.next()).f3154a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(d dVar, b bVar) {
        ArrayList arrayList = new ArrayList(n.E0(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((J0.a) it.next()).f3154a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}

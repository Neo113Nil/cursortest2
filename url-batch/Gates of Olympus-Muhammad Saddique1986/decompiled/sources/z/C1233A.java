package z;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233A {

    /* renamed from: a, reason: collision with root package name */
    public static final C1233A f10416a = new C1233A();

    public final void a(EditorInfo editorInfo, J0.b bVar) {
        J0.b bVar2 = J0.b.f3155f;
        if (f2.j.a(bVar, J0.b.f3155f)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(S1.n.E0(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((J0.a) it.next()).f3154a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}

package A;

import N.f;
import N.i;
import N.k;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import e.C0022a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;
import io.flutter.view.j;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import m.AbstractC0068d;

/* loaded from: classes.dex */
public final class e implements C.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f7b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10e;

    public /* synthetic */ e(f fVar, String str, Object obj, b bVar) {
        this.f7b = fVar;
        this.f8c = str;
        this.f9d = obj;
        this.f10e = bVar;
    }

    public static boolean f(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public SpannableString a() {
        if (((String) this.f7b) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f7b);
        ArrayList arrayList = (ArrayList) this.f8c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                int a2 = AbstractC0068d.a(jVar.f856c);
                if (a2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f854a, jVar.f855b, 0);
                } else if (a2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((h) jVar).f853d)), jVar.f854a, jVar.f855b, 0);
                }
            }
        }
        String str = (String) this.f10e;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f10e), 0, ((String) this.f7b).length(), 0);
        }
        String str2 = (String) this.f9d;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f9d)), 0, ((String) this.f7b).length(), 0);
        }
        return spannableString;
    }

    @Override // C.c
    public void b(String str, HashMap hashMap) {
        this.f8c = "sqlite_error";
        this.f9d = str;
        this.f10e = hashMap;
    }

    @Override // C.c
    public void c(Serializable serializable) {
        this.f7b = serializable;
    }

    public Object d(int i2, int i3) {
        return ((C0022a) this.f10e).f525c[(i2 << 1) + i3];
    }

    public void e(int i2) {
        ((C0022a) this.f10e).h(i2);
    }

    public File g(Context context) {
        ((b) this.f8c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void h(String str, Object obj, M.j jVar) {
        ((f) this.f7b).i((String) this.f8c, ((k) this.f9d).d(new a(12, str, obj)), jVar == null ? null : new N.a(1, this, jVar));
    }

    public void i(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((F.j) this.f10e) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void j(Serializable serializable, N.c cVar) {
        ((f) this.f7b).i((String) this.f8c, ((i) this.f9d).c(serializable), cVar == null ? null : new N.a(0, this, cVar));
    }

    public void k(N.b bVar) {
        String str = (String) this.f8c;
        f fVar = (f) this.f7b;
        b bVar2 = (b) this.f10e;
        if (bVar2 != null) {
            fVar.h(str, bVar != null ? new a(this, bVar, 11, false) : null, bVar2);
        } else {
            fVar.d(str, bVar != null ? new a(this, bVar, 11, false) : null);
        }
    }

    public void l(N.j jVar) {
        String str = (String) this.f8c;
        f fVar = (f) this.f7b;
        b bVar = (b) this.f10e;
        if (bVar != null) {
            fVar.h(str, jVar != null ? new a(this, jVar, 13, false) : null, bVar);
        } else {
            fVar.d(str, jVar != null ? new a(this, jVar, 13, false) : null);
        }
    }

    public Object[] m(Object[] objArr, int i2) {
        int i3 = ((C0022a) this.f10e).f526d;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = d(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public e(C0022a c0022a) {
        this.f10e = c0022a;
    }
}

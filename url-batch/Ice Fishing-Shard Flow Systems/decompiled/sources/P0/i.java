package P0;

import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.Q;
import androidx.fragment.app.V;
import androidx.fragment.app.Y;
import androidx.work.impl.WorkDatabase_Impl;
import h0.C0465k;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import s4.C0892a;
import s4.InterfaceC0893b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f2200a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2201b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2202c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2203d;

    public i(s4.f fVar, String str, s4.m mVar, q1.h hVar) {
        this.f2200a = fVar;
        this.f2201b = str;
        this.f2202c = mVar;
        this.f2203d = hVar;
    }

    public void a(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (((ArrayList) this.f2200a).contains(componentCallbacksC0228t)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0228t);
        }
        synchronized (((ArrayList) this.f2200a)) {
            ((ArrayList) this.f2200a).add(componentCallbacksC0228t);
        }
        componentCallbacksC0228t.f3809s = true;
    }

    public SpannableString b() {
        if (((String) this.f2200a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f2200a);
        List<io.flutter.view.j> list = (List) this.f2201b;
        if (list != null) {
            for (io.flutter.view.j jVar : list) {
                int b7 = S.i.b(jVar.f5905c);
                if (b7 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f5903a, jVar.f5904b, 0);
                } else if (b7 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.h) jVar).f5902d)), jVar.f5903a, jVar.f5904b, 0);
                }
            }
        }
        String str = (String) this.f2203d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f2203d), 0, ((String) this.f2200a).length(), 0);
        }
        String str2 = (String) this.f2202c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f2202c)), 0, ((String) this.f2200a).length(), 0);
        }
        return spannableString;
    }

    public ComponentCallbacksC0228t c(String str) {
        Y y7 = (Y) ((HashMap) this.f2201b).get(str);
        if (y7 != null) {
            return y7.f3670c;
        }
        return null;
    }

    public ComponentCallbacksC0228t d(String str) {
        for (Y y7 : ((HashMap) this.f2201b).values()) {
            if (y7 != null) {
                ComponentCallbacksC0228t componentCallbacksC0228t = y7.f3670c;
                if (!str.equals(componentCallbacksC0228t.f3803m)) {
                    componentCallbacksC0228t = componentCallbacksC0228t.f3777C.f3615c.d(str);
                }
                if (componentCallbacksC0228t != null) {
                    return componentCallbacksC0228t;
                }
            }
        }
        return null;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (Y y7 : ((HashMap) this.f2201b).values()) {
            if (y7 != null) {
                arrayList.add(y7);
            }
        }
        return arrayList;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (Y y7 : ((HashMap) this.f2201b).values()) {
            if (y7 != null) {
                arrayList.add(y7.f3670c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List g() {
        ArrayList arrayList;
        if (((ArrayList) this.f2200a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f2200a)) {
            arrayList = new ArrayList((ArrayList) this.f2200a);
        }
        return arrayList;
    }

    public g h(j id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String str = id.f2204a;
        int i2 = id.f2205b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2200a;
        C0465k g7 = C0465k.g(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            g7.l(1);
        } else {
            g7.f(1, str);
        }
        g7.r(i2, 2);
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            int q4 = f.q(J7, "work_spec_id");
            int q7 = f.q(J7, "generation");
            int q8 = f.q(J7, "system_id");
            g gVar = null;
            String string = null;
            if (J7.moveToFirst()) {
                if (!J7.isNull(q4)) {
                    string = J7.getString(q4);
                }
                gVar = new g(string, J7.getInt(q7), J7.getInt(q8));
            }
            return gVar;
        } finally {
            J7.close();
            g7.h();
        }
    }

    public void i(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2200a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2201b).f(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void j(Y y7) {
        ComponentCallbacksC0228t componentCallbacksC0228t = y7.f3670c;
        String str = componentCallbacksC0228t.f3803m;
        HashMap hashMap = (HashMap) this.f2201b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(componentCallbacksC0228t.f3803m, y7);
        if (Q.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC0228t);
        }
    }

    public void k(Y y7) {
        HashMap hashMap = (HashMap) this.f2201b;
        ComponentCallbacksC0228t componentCallbacksC0228t = y7.f3670c;
        if (componentCallbacksC0228t.f3784J) {
            ((V) this.f2203d).e(componentCallbacksC0228t);
        }
        if (hashMap.get(componentCallbacksC0228t.f3803m) == y7 && ((Y) hashMap.put(componentCallbacksC0228t.f3803m, null)) != null && Q.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC0228t);
        }
    }

    public void l(Serializable serializable, s4.c cVar) {
        ((s4.f) this.f2200a).f((String) this.f2201b, ((s4.m) this.f2202c).a(serializable), cVar == null ? null : new C0892a(this, 0, cVar));
    }

    public void m(InterfaceC0893b interfaceC0893b) {
        String str = (String) this.f2201b;
        s4.f fVar = (s4.f) this.f2200a;
        q1.h hVar = (q1.h) this.f2203d;
        if (hVar != null) {
            fVar.h(str, interfaceC0893b != null ? new l(this, interfaceC0893b) : null, hVar);
        } else {
            fVar.n(str, interfaceC0893b != null ? new l(this, interfaceC0893b) : null);
        }
    }

    public Bundle n(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f2202c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public i(Typeface typeface, V.b bVar) {
        int i2;
        int i5;
        int i7;
        int i8;
        this.f2203d = typeface;
        this.f2200a = bVar;
        this.f2202c = new U.r(1024);
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i9 = a7 + bVar.f1142d;
            i2 = ((ByteBuffer) bVar.f1145l).getInt(((ByteBuffer) bVar.f1145l).getInt(i9) + i9);
        } else {
            i2 = 0;
        }
        this.f2201b = new char[i2 * 2];
        int a8 = bVar.a(6);
        if (a8 != 0) {
            int i10 = a8 + bVar.f1142d;
            i5 = ((ByteBuffer) bVar.f1145l).getInt(((ByteBuffer) bVar.f1145l).getInt(i10) + i10);
        } else {
            i5 = 0;
        }
        for (int i11 = 0; i11 < i5; i11++) {
            U.n nVar = new U.n(this, i11);
            V.a b7 = nVar.b();
            int a9 = b7.a(4);
            Character.toChars(a9 != 0 ? ((ByteBuffer) b7.f1145l).getInt(a9 + b7.f1142d) : 0, (char[]) this.f2201b, i11 * 2);
            V.a b8 = nVar.b();
            int a10 = b8.a(16);
            if (a10 != 0) {
                int i12 = a10 + b8.f1142d;
                i7 = ((ByteBuffer) b8.f1145l).getInt(((ByteBuffer) b8.f1145l).getInt(i12) + i12);
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                U.r rVar = (U.r) this.f2202c;
                V.a b9 = nVar.b();
                int a11 = b9.a(16);
                if (a11 != 0) {
                    int i13 = a11 + b9.f1142d;
                    i8 = ((ByteBuffer) b9.f1145l).getInt(((ByteBuffer) b9.f1145l).getInt(i13) + i13);
                } else {
                    i8 = 0;
                }
                rVar.a(nVar, 0, i8 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }
}

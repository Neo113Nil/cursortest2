package u0;

import a.AbstractC0219a;
import android.content.Context;
import android.database.Cursor;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import androidx.work.impl.WorkDatabase_Impl;
import io.flutter.embedding.engine.FlutterJNI;
import j5.InterfaceC0438a;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679i implements F0.b {

    /* renamed from: f, reason: collision with root package name */
    public Object f5981f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5982g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5983h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5984i;

    public SpannableString a() {
        if (((String) this.f5981f) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f5981f);
        List<io.flutter.view.l> list = (List) this.f5982g;
        if (list != null) {
            for (io.flutter.view.l lVar : list) {
                int c7 = N.p.c(lVar.f4722c);
                if (c7 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f4720a, lVar.f4721b, 0);
                } else if (c7 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.j) lVar).f4719d)), lVar.f4720a, lVar.f4721b, 0);
                }
            }
        }
        String str = (String) this.f5984i;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f5984i), 0, ((String) this.f5981f).length(), 0);
        }
        String str2 = (String) this.f5983h;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f5983h)), 0, ((String) this.f5981f).length(), 0);
        }
        return spannableString;
    }

    public C0677g b(C0680j c0680j) {
        String str = c0680j.f5985a;
        int i7 = c0680j.f5986b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5981f;
        Q.k e4 = Q.k.e("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            e4.o(1);
        } else {
            e4.B(str, 1);
        }
        e4.t(i7, 2);
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            int q6 = AbstractC0219a.q(m4, "work_spec_id");
            int q7 = AbstractC0219a.q(m4, "generation");
            int q8 = AbstractC0219a.q(m4, "system_id");
            C0677g c0677g = null;
            String string = null;
            if (m4.moveToFirst()) {
                if (!m4.isNull(q6)) {
                    string = m4.getString(q6);
                }
                c0677g = new C0677g(string, m4.getInt(q7), m4.getInt(q8));
            }
            return c0677g;
        } finally {
            m4.close();
            e4.g();
        }
    }

    public File c(Context context) {
        ((R0.g) this.f5982g).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void d(C0677g c0677g) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5981f;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C0672b) this.f5982g).q(c0677g);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void e(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((B1.g) this.f5984i) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        return new J0.l((Executor) ((InterfaceC0438a) this.f5981f).get(), (K0.d) ((InterfaceC0438a) this.f5982g).get(), (J0.d) ((B0.c) this.f5983h).get(), (L0.c) ((InterfaceC0438a) this.f5984i).get());
    }
}

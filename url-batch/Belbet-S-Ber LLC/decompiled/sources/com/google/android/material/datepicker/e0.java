package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.gdmhkmf.belbet.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e0 extends i2.n {

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f1057f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1058g;
    public final SimpleDateFormat h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1059j;

    /* renamed from: k, reason: collision with root package name */
    public final a.b f1060k;

    /* renamed from: l, reason: collision with root package name */
    public e f1061l;

    /* renamed from: m, reason: collision with root package name */
    public int f1062m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f1063n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1064o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0 f1065p;

    public e0(f0 f0Var, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, b bVar, u uVar, TextInputLayout textInputLayout2) {
        this.f1065p = f0Var;
        this.f1063n = uVar;
        this.f1064o = textInputLayout2;
        this.f1058g = str;
        this.h = simpleDateFormat;
        this.f1057f = textInputLayout;
        this.i = bVar;
        this.f1059j = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f1060k = new a.b(this, str, 1);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f1058g;
        if (length >= str.length() || editable.length() < this.f1062m) {
            return;
        }
        char charAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(charAt)) {
            return;
        }
        editable.append(charAt);
    }

    @Override // i2.n, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        this.f1062m = charSequence.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.material.datepicker.e, java.lang.Runnable] */
    @Override // i2.n, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        b bVar = this.i;
        TextInputLayout textInputLayout = this.f1057f;
        a.b bVar2 = this.f1060k;
        textInputLayout.removeCallbacks(bVar2);
        textInputLayout.removeCallbacks(this.f1061l);
        textInputLayout.setError(null);
        f0 f0Var = this.f1065p;
        f0Var.f1067f = null;
        f0Var.getClass();
        Long l4 = f0Var.f1067f;
        u uVar = this.f1063n;
        uVar.b(l4);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f1058g.length()) {
            return;
        }
        try {
            Date parse = this.h.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = parse.getTime();
            if (time >= bVar.h.f1068f) {
                Calendar c5 = i0.c(bVar.f1033f.f1122f);
                c5.set(5, 1);
                if (c5.getTimeInMillis() <= time) {
                    x xVar = bVar.f1034g;
                    int i6 = xVar.f1124j;
                    Calendar c6 = i0.c(xVar.f1122f);
                    c6.set(5, i6);
                    if (time <= c6.getTimeInMillis()) {
                        f0Var.f1067f = Long.valueOf(parse.getTime());
                        f0Var.getClass();
                        uVar.b(f0Var.f1067f);
                        return;
                    }
                }
            }
            ?? r10 = new Runnable() { // from class: com.google.android.material.datepicker.e
                @Override // java.lang.Runnable
                public final void run() {
                    Calendar d = i0.d();
                    Calendar e4 = i0.e(null);
                    long j2 = time;
                    e4.setTimeInMillis(j2);
                    String format = d.get(1) == e4.get(1) ? i0.b("MMMd", Locale.getDefault()).format(new Date(j2)) : b4.d.B(j2);
                    e0 e0Var = e0.this;
                    e0Var.f1057f.setError(String.format(e0Var.f1059j, format.replace(' ', (char) 160)));
                    f0 f0Var2 = e0Var.f1065p;
                    e0Var.f1064o.getError();
                    f0Var2.getClass();
                    e0Var.f1063n.a();
                }
            };
            this.f1061l = r10;
            textInputLayout.post(r10);
        } catch (ParseException unused) {
            textInputLayout.post(bVar2);
        }
    }
}

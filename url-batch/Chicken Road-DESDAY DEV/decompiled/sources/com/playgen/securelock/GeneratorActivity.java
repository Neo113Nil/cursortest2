package com.playgen.securelock;

import C.g;
import K.G;
import K.S;
import O0.b;
import P0.c;
import R0.a;
import S0.e;
import T0.h;
import T0.i;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import b1.d;
import com.playgen.securelock.GeneratorActivity;
import com.playgen.securelock.R;
import com.playgen.securelock.SettingsActivity;
import g.AbstractActivityC0133i;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u1.l;

/* loaded from: classes.dex */
public final class GeneratorActivity extends AbstractActivityC0133i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1928D = 0;

    /* renamed from: z, reason: collision with root package name */
    public g f1933z;

    /* renamed from: y, reason: collision with root package name */
    public final e f1932y = new e(new b(this, 0));

    /* renamed from: A, reason: collision with root package name */
    public String f1929A = "";

    /* renamed from: B, reason: collision with root package name */
    public P0.b f1930B = P0.b.SECURE;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashMap f1931C = new LinkedHashMap();

    @Override // g.AbstractActivityC0133i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(w().f674a);
        g gVar = new g((AbstractActivityC0133i) this);
        this.f1933z = gVar;
        gVar.v();
        g gVar2 = this.f1933z;
        if (gVar2 == null) {
            d.h("settings");
            throw null;
        }
        this.f1930B = gVar2.z();
        w().f684n.removeAllViews();
        w().f683m.removeAllViews();
        this.f1931C.clear();
        List u02 = i.u0(P0.b.SECURE, P0.b.PIN, P0.b.PASSPHRASE);
        List u03 = i.u0(P0.b.ALPHANUMERIC, P0.b.HEX);
        Iterator it = u02.iterator();
        while (it.hasNext()) {
            w().f684n.addView(u((P0.b) it.next()));
        }
        Iterator it2 = u03.iterator();
        while (it2.hasNext()) {
            w().f683m.addView(u((P0.b) it2.next()));
        }
        t(this.f1930B, false);
        final int i = 0;
        w().d.setOnClickListener(new View.OnClickListener(this) { // from class: O0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f617b;

            {
                this.f617b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = this.f617b;
                switch (i) {
                    case 0:
                        int i2 = GeneratorActivity.f1928D;
                        generatorActivity.startActivity(new Intent(generatorActivity, (Class<?>) SettingsActivity.class));
                        break;
                    case 1:
                        int i3 = GeneratorActivity.f1928D;
                        generatorActivity.v();
                        break;
                    default:
                        if (generatorActivity.f1929A.length() != 0) {
                            Object systemService = generatorActivity.getSystemService("clipboard");
                            b1.d.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("password", generatorActivity.f1929A));
                            Toast.makeText(generatorActivity, R.string.copied, 0).show();
                            break;
                        } else {
                            Toast.makeText(generatorActivity, R.string.generate_first, 0).show();
                            break;
                        }
                }
            }
        });
        final int i2 = 1;
        w().f676c.setOnClickListener(new View.OnClickListener(this) { // from class: O0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f617b;

            {
                this.f617b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = this.f617b;
                switch (i2) {
                    case 0:
                        int i22 = GeneratorActivity.f1928D;
                        generatorActivity.startActivity(new Intent(generatorActivity, (Class<?>) SettingsActivity.class));
                        break;
                    case 1:
                        int i3 = GeneratorActivity.f1928D;
                        generatorActivity.v();
                        break;
                    default:
                        if (generatorActivity.f1929A.length() != 0) {
                            Object systemService = generatorActivity.getSystemService("clipboard");
                            b1.d.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("password", generatorActivity.f1929A));
                            Toast.makeText(generatorActivity, R.string.copied, 0).show();
                            break;
                        } else {
                            Toast.makeText(generatorActivity, R.string.generate_first, 0).show();
                            break;
                        }
                }
            }
        });
        final int i3 = 2;
        w().f675b.setOnClickListener(new View.OnClickListener(this) { // from class: O0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f617b;

            {
                this.f617b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = this.f617b;
                switch (i3) {
                    case 0:
                        int i22 = GeneratorActivity.f1928D;
                        generatorActivity.startActivity(new Intent(generatorActivity, (Class<?>) SettingsActivity.class));
                        break;
                    case 1:
                        int i32 = GeneratorActivity.f1928D;
                        generatorActivity.v();
                        break;
                    default:
                        if (generatorActivity.f1929A.length() != 0) {
                            Object systemService = generatorActivity.getSystemService("clipboard");
                            b1.d.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("password", generatorActivity.f1929A));
                            Toast.makeText(generatorActivity, R.string.copied, 0).show();
                            break;
                        } else {
                            Toast.makeText(generatorActivity, R.string.generate_first, 0).show();
                            break;
                        }
                }
            }
        });
        w().f679g.setOnTouchListener(new L0.i(1, new GestureDetector(this, new O0.d(this))));
    }

    @Override // g.AbstractActivityC0133i, android.app.Activity
    public final void onResume() {
        super.onResume();
        g gVar = this.f1933z;
        if (gVar == null) {
            d.h("settings");
            throw null;
        }
        gVar.v();
        P0.b bVar = this.f1930B;
        g gVar2 = this.f1933z;
        if (gVar2 == null) {
            d.h("settings");
            throw null;
        }
        if (bVar != gVar2.z()) {
            g gVar3 = this.f1933z;
            if (gVar3 == null) {
                d.h("settings");
                throw null;
            }
            P0.b z2 = gVar3.z();
            this.f1930B = z2;
            t(z2, true);
        }
    }

    public final void t(P0.b bVar, boolean z2) {
        bVar.getClass();
        c v2 = l.v(bVar);
        w().f678f.a(v2);
        w().h.setBackgroundColor(v2.f642a);
        TextView textView = w().f681k;
        int i = v2.f643b;
        textView.setTextColor(i);
        u1.d.d(w().d, v2, false);
        u1.d.e(w().f677e, v2);
        u1.d.d(w().f676c, v2, false);
        u1.d.d(w().f675b, v2, false);
        w().f682l.setText(getString(bVar.f641b));
        w().f682l.setTextColor(-1712789272);
        w().f679g.setTextColor(i);
        for (Map.Entry entry : this.f1931C.entrySet()) {
            P0.b bVar2 = (P0.b) entry.getKey();
            Button button = (Button) entry.getValue();
            boolean z3 = bVar2 == bVar;
            d.e(button, "button");
            float f2 = button.getResources().getDisplayMetrics().density;
            button.setStateListAnimator(null);
            WeakHashMap weakHashMap = S.f369a;
            G.q(button, null);
            u1.d.g(button, v2, z3, f2, true, false);
            button.setOnTouchListener(new a(button, v2, z3, f2, true));
        }
        ProgressBar progressBar = w().i;
        int ordinal = bVar.ordinal();
        progressBar.setMax(ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? 150 : 80 : 120 : 100);
        if (bVar == P0.b.PASSPHRASE) {
            w().f679g.setTextSize(16.0f);
        } else if (bVar == P0.b.PIN) {
            w().f679g.setTextSize(28.0f);
        } else {
            w().f679g.setTextSize(18.0f);
        }
        if (z2) {
            this.f1929A = "";
            w().f679g.setText(getString(R.string.password_hint));
            w().f680j.setText("");
            w().i.setProgress(0);
        }
    }

    public final Button u(final P0.b bVar) {
        int i = (int) (6 * getResources().getDisplayMetrics().density);
        Button button = new Button(this);
        button.setText(getString(bVar.f640a));
        button.setTextSize(13.0f);
        button.setAllCaps(false);
        button.setMinHeight((int) (44 * button.getResources().getDisplayMetrics().density));
        button.setMinWidth((int) (72 * button.getResources().getDisplayMetrics().density));
        float f2 = 12;
        float f3 = 10;
        button.setPadding((int) (button.getResources().getDisplayMetrics().density * f2), (int) (button.getResources().getDisplayMetrics().density * f3), (int) (f2 * button.getResources().getDisplayMetrics().density), (int) (f3 * button.getResources().getDisplayMetrics().density));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new View.OnClickListener() { // from class: O0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = GeneratorActivity.this;
                P0.b bVar2 = generatorActivity.f1930B;
                P0.b bVar3 = bVar;
                if (bVar2 == bVar3) {
                    return;
                }
                generatorActivity.f1930B = bVar3;
                C.g gVar = generatorActivity.f1933z;
                if (gVar == null) {
                    b1.d.h("settings");
                    throw null;
                }
                b1.d.e(bVar3, "value");
                ((SharedPreferences) gVar.f66b).edit().putString("password_type", bVar3.name()).apply();
                generatorActivity.t(bVar3, true);
            }
        });
        this.f1931C.put(bVar, button);
        return button;
    }

    public final void v() {
        String a2;
        int j02;
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        List list;
        int ordinal = this.f1930B.ordinal();
        int i = 0;
        if (ordinal == 0) {
            SecureRandom secureRandom = P0.a.f634a;
            g gVar = this.f1933z;
            if (gVar == null) {
                d.h("settings");
                throw null;
            }
            int y2 = gVar.y();
            g gVar2 = this.f1933z;
            if (gVar2 == null) {
                d.h("settings");
                throw null;
            }
            boolean z2 = ((SharedPreferences) gVar2.f66b).getBoolean("use_upper", true);
            g gVar3 = this.f1933z;
            if (gVar3 == null) {
                d.h("settings");
                throw null;
            }
            boolean z3 = ((SharedPreferences) gVar3.f66b).getBoolean("use_lower", true);
            g gVar4 = this.f1933z;
            if (gVar4 == null) {
                d.h("settings");
                throw null;
            }
            boolean z4 = ((SharedPreferences) gVar4.f66b).getBoolean("use_digits", true);
            g gVar5 = this.f1933z;
            if (gVar5 == null) {
                d.h("settings");
                throw null;
            }
            boolean z5 = ((SharedPreferences) gVar5.f66b).getBoolean("use_symbols", true);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            }
            if (z3) {
                arrayList.add("abcdefghijklmnopqrstuvwxyz");
            }
            if (z4) {
                arrayList.add("0123456789");
            }
            if (z5) {
                arrayList.add("!@#$%^&*()-_=+[]{};:,.?/");
            }
            if (arrayList.isEmpty()) {
                arrayList.add("abcdefghijklmnopqrstuvwxyz");
            }
            a2 = P0.a.a(y2, arrayList);
        } else if (ordinal == 1) {
            SecureRandom secureRandom2 = P0.a.f634a;
            g gVar6 = this.f1933z;
            if (gVar6 == null) {
                d.h("settings");
                throw null;
            }
            int n2 = l.n(((SharedPreferences) gVar6.f66b).getInt("pin_length", 6), 4, 12);
            char[] cArr = new char[n2];
            for (int i2 = 0; i2 < n2; i2++) {
                cArr[i2] = "0123456789".charAt(P0.a.f634a.nextInt(10));
            }
            a2 = new String(cArr);
        } else if (ordinal == 2) {
            SecureRandom secureRandom3 = P0.a.f634a;
            g gVar7 = this.f1933z;
            if (gVar7 == null) {
                d.h("settings");
                throw null;
            }
            int n3 = l.n(((SharedPreferences) gVar7.f66b).getInt("word_count", 4), 3, 6);
            g gVar8 = this.f1933z;
            if (gVar8 == null) {
                d.h("settings");
                throw null;
            }
            String string = ((SharedPreferences) gVar8.f66b).getString("passphrase_separator", "-");
            String str = string == null ? "-" : string;
            int n4 = l.n(n3, 3, 6);
            ArrayList arrayList2 = new ArrayList(n4);
            HashSet hashSet = new HashSet();
            while (arrayList2.size() < n4) {
                SecureRandom secureRandom4 = P0.a.f634a;
                String[] strArr = P0.a.f635b;
                int nextInt = secureRandom4.nextInt(strArr.length);
                if (hashSet.add(Integer.valueOf(nextInt))) {
                    arrayList2.add(strArr[nextInt]);
                }
            }
            a2 = h.y0(arrayList2, str, null, null, null, 62);
        } else if (ordinal == 3) {
            SecureRandom secureRandom5 = P0.a.f634a;
            g gVar9 = this.f1933z;
            if (gVar9 == null) {
                d.h("settings");
                throw null;
            }
            a2 = P0.a.a(gVar9.y(), i.u0("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789"));
        } else {
            if (ordinal != 4) {
                throw new S0.b();
            }
            SecureRandom secureRandom6 = P0.a.f634a;
            g gVar10 = this.f1933z;
            if (gVar10 == null) {
                d.h("settings");
                throw null;
            }
            int y3 = gVar10.y();
            char[] cArr2 = new char[y3];
            for (int i3 = 0; i3 < y3; i3++) {
                cArr2[i3] = "0123456789ABCDEF".charAt(P0.a.f634a.nextInt(16));
            }
            a2 = new String(cArr2);
        }
        this.f1929A = a2;
        w().f679g.setText(this.f1929A);
        String str2 = this.f1929A;
        P0.b bVar = this.f1930B;
        d.e(str2, "password");
        d.e(bVar, "type");
        int ordinal2 = bVar.ordinal();
        if (ordinal2 == 0) {
            j02 = u1.d.j0(str2);
        } else if (ordinal2 == 1) {
            j02 = str2.length() * 10;
        } else if (ordinal2 == 2) {
            Pattern compile = Pattern.compile("\\s+|[-_]");
            d.d(compile, "compile(...)");
            i1.d.A0(0);
            Matcher matcher = compile.matcher(str2);
            if (matcher.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                do {
                    arrayList3.add(str2.subSequence(i, matcher.start()).toString());
                    i = matcher.end();
                } while (matcher.find());
                arrayList3.add(str2.subSequence(i, str2.length()).toString());
                list = arrayList3;
            } else {
                list = u1.d.a0(str2.toString());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                if (((String) obj).length() > 0) {
                    arrayList4.add(obj);
                }
            }
            j02 = str2.length() + (arrayList4.size() * 18);
        } else if (ordinal2 == 3) {
            j02 = u1.d.j0(str2);
        } else {
            if (ordinal2 != 4) {
                throw new S0.b();
            }
            j02 = str2.length() * 4;
        }
        String string2 = getString(u1.d.Z(j02, this.f1930B));
        d.d(string2, "getString(...)");
        w().f680j.setText(getString(R.string.strength_label, string2, Integer.valueOf(j02)));
        ProgressBar progressBar = w().i;
        int max = w().i.getMax();
        if (j02 <= max) {
            max = j02;
        }
        progressBar.setProgress(max);
        P0.b bVar2 = this.f1930B;
        d.e(bVar2, "type");
        int Z2 = u1.d.Z(j02, bVar2);
        int a3 = A.b.a(this, Z2 == R.string.strength_strong ? R.color.neon_green : Z2 == R.string.strength_medium ? R.color.neon_yellow : R.color.neon_red);
        w().f680j.setTextColor(a3);
        Drawable progressDrawable = w().i.getProgressDrawable();
        Drawable mutate = progressDrawable != null ? progressDrawable.mutate() : null;
        if (!(mutate instanceof LayerDrawable) || (findDrawableByLayerId = (layerDrawable = (LayerDrawable) mutate).findDrawableByLayerId(android.R.id.progress)) == null) {
            return;
        }
        Drawable mutate2 = findDrawableByLayerId.mutate();
        d.d(mutate2, "wrap(...)");
        D.a.g(mutate2, a3);
        if (findDrawableByLayerId instanceof ClipDrawable) {
            layerDrawable.setDrawableByLayerId(android.R.id.progress, new ClipDrawable(mutate2, 8388611, 1));
        } else {
            layerDrawable.setDrawableByLayerId(android.R.id.progress, mutate2);
        }
    }

    public final Q0.a w() {
        return (Q0.a) this.f1932y.a();
    }
}
